package com.example.cloud.company.common.build.xgm.qcxml;

import java.io.UnsupportedEncodingException;
import java.rmi.ConnectException;
import java.util.concurrent.TimeoutException;

import com.example.cloud.company.common.enums.SbztEnum;
import com.example.cloud.company.common.vo.base.BondeAPI;
import com.example.cloud.company.common.vo.common.sb.HeadType;
import com.example.cloud.company.common.vo.common.sb.TradeResultVo;
import com.example.cloud.company.common.vo.xgm.hdxx.TechnicalMessageVo;
import com.example.cloud.company.common.vo.xgm.hdxx.XmlVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

@BondeAPI(
        name = "金三接口返回代码转换工具类",
        type = "0001",
        weight = "B"
)
public class Gt3SbztclUtil {
    private static final Logger log = Logger.getLogger(Gt3SbztclUtil.class);

    public Gt3SbztclUtil() {
    }

    public static TradeResultVo getErrorCode4Gt3Msg(String gt3responsexml) {
        if (!StringUtils.isBlank(gt3responsexml) && gt3responsexml.indexOf("RJVM") <= -1) {
            return TradeResultVo.valueOfSuccess();
        } else {
            log.error("核心征管异常，返回报文:" + gt3responsexml);
            TradeResultVo tradeResultVo = TradeResultVo.valueOfError("核心征管EJB服务重启，OSB未重启，造成EJB调用失败。", 80409164);
            tradeResultVo.setTradeCode("6");
            if (!StringUtils.isBlank(gt3responsexml)) {
                tradeResultVo.setMessage(gt3responsexml);
            }

            return tradeResultVo;
        }
    }

    public static TradeResultVo getErrorCode4Gt3Code(String code, String returnCode) {
        if ("9".equals(returnCode) && "002".equals(code)) {
            return TradeResultVo.valueOfError("", 80409153);
        } else if ("1".equals(returnCode) && ("003".equals(code) || "005".equals(code))) {
            return TradeResultVo.valueOfError("", 80409155);
        } else {
            return "8".equals(returnCode) && "004".equals(code) ? TradeResultVo.valueOfError("", 80409156) : TradeResultVo.valueOfSuccess();
        }
    }

    public static TradeResultVo getErrorCodeFromGt3Code(String xlCode, String dlCode, XmlVO<TechnicalMessageVo> tecvo, String receiverMsg) throws UnsupportedEncodingException {
        TradeResultVo tradeResultVo = TradeResultVo.valueOfError("");
        if (!"0".equals(dlCode) || !"000".equals(xlCode) && !"0000".equals(xlCode)) {
            if ("0".equals(dlCode) && "0001".equals(xlCode) && "SWZJ.NSXY.QT.CXNSRNDPJ".equals(((TechnicalMessageVo)tecvo.getXmlParse()).getHead().getTranId())) {
                tradeResultVo = TradeResultVo.valueOfSuccess(tecvo, receiverMsg);
                return tradeResultVo;
            } else if ("9".equals(dlCode) && "001".equals(xlCode)) {
                log.error("征管交易超时,反馈代码为【" + dlCode + xlCode + "】,tradeCode将返回【2】");
                tradeResultVo.setTradeCode("2");
                tradeResultVo.setMessage(getMessageFromGT3Response(tecvo));
                return tradeResultVo;
            } else if ((!"1".equals(dlCode) || !"003".equals(xlCode) && !"005".equals(xlCode)) && (!"8".equals(dlCode) || !"004".equals(xlCode))) {
                if ("2".equals(dlCode) && isOsbException((TechnicalMessageVo)tecvo.getXmlParse())) {
                    log.error("OSB返回调用总集成发生错误,反馈代码为【" + dlCode + xlCode + "】,tradeCode将返回【1】");
                    TradeResultVo tradeResultVo2 = TradeResultVo.valueOfError("OSB调用核心征管系统EJB发生错误。", 80409164);
                    return tradeResultVo2;
                } else if (!"2".equals(dlCode) && !"3".equals(dlCode)) {
                    log.error("第三方交易出现不明异常,反馈代码为【" + dlCode + xlCode + "】,tradeCode将返回【6】");
                    tradeResultVo.setTradeCode("6");
                    tradeResultVo.setMessage(getMessageFromGT3Response(tecvo));
                    return tradeResultVo;
                } else {
                    tradeResultVo = TradeResultVo.valueOfSuccessAndBizFail(tecvo, receiverMsg);
                    tradeResultVo.setMessage(getMessageFromGT3Response(tecvo));
                    if (!"SWZJ.NSXY.QT.CXNSRNDPJ".equals(((TechnicalMessageVo)tecvo.getXmlParse()).getHead().getTranId())) {
                        log.error("征管接口返回技术层交易成功,但业务层处理失败,反馈代码为【" + dlCode + xlCode + "】,tradeCode将返回【5】");
                        return tradeResultVo;
                    } else {
                        XmlVO<TechnicalMessageVo> innerXmlVo = XmlUtil.doXmlParse(((TechnicalMessageVo)tecvo.getXmlParse()).getBody().getBytes("UTF-8"), TechnicalMessageVo.class, new String[]{"UTF-8"});
                        HeadType innerHeadType = ((TechnicalMessageVo)innerXmlVo.getXmlParse()).getHead();
                        String innerReturnCode = innerHeadType.getRtnCode();
                        String innerCode = innerHeadType.getRtnMsg().getCode();
                        return getErrorCodeFromGt3Code(innerCode, innerReturnCode, innerXmlVo, receiverMsg);
                    }
                }
            } else {
                log.error("征管接口出现异常,反馈代码为【" + dlCode + xlCode + "】,tradeCode将返回【1】");
                tradeResultVo.setTradeCode("1");
                tradeResultVo.setMessage(getMessageFromGT3Response(tecvo));
                return tradeResultVo;
            }
        } else {
            tradeResultVo = TradeResultVo.valueOfSuccess(tecvo, receiverMsg);
            return tradeResultVo;
        }
    }

    public static TradeResultVo getErrorCode4Gt3Code(Exception e) {
        log.error("捕获到异常：", e);
        if (!(e instanceof TimeoutException) && e.getCause().toString().indexOf("RequestTimeoutException") <= -1) {
            if (e instanceof ConnectException || e instanceof Exception) {
                log.info("ok，捕获到异常的异常是：" + e);
                if (e.getMessage().indexOf("RJVM") > -1 || e.getMessage().indexOf("shutdown") > -1) {
                    return TradeResultVo.valueOfError("", 80409152);
                }
            }

            return TradeResultVo.valueOfError("发生未知异常！" + e.getMessage(), "");
        } else {
            log.error("OSB返回超时错误!", e);
            return TradeResultVo.valueOfError("", 80409153);
        }
    }

    private static boolean isOsbException(TechnicalMessageVo tecvo) {
        String reason = tecvo.getHead().getRtnMsg().getReason();
        if (StringUtils.isBlank(reason)) {
            return false;
        } else {
            return reason.indexOf("javax.naming.CommunicationException") > -1 || reason.indexOf("Could not establish a connection") > -1;
        }
    }

    public static String getSbzt4Gt3Code(int msgCodeInt) {
        String msgCode = "" + msgCodeInt;
        if (!"80409154".equals(msgCode) && !"80409152".equals(msgCode) && !"80409155".equals(msgCode) && !"80409156".equals(msgCode)) {
            return "80409153".equals(msgCode) ? SbztEnum.SBZ_CS.getSbztDm() : SbztEnum.SBSB.getSbztDm();
        } else {
            return SbztEnum.SBZ_WBJKGZ.getSbztDm();
        }
    }

    public static String getMessageFromGT3Response(XmlVO<TechnicalMessageVo> techMsgVo) {
        if (techMsgVo == null) {
            return null;
        } else {
            TechnicalMessageVo vo = (TechnicalMessageVo)techMsgVo.getXmlParse();
            return vo != null && vo.getHead() != null && vo.getHead().getRtnMsg() != null ? vo.getHead().getRtnMsg().getReason() : null;
        }
    }
}
