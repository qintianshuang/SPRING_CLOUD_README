package com.example.cloud.company.common.build.xgm.qcxml;

import com.example.cloud.company.common.vo.common.sb.HeadType;
import com.example.cloud.company.common.vo.common.sb.TradeResultVo;
import com.example.cloud.company.common.vo.xgm.hdxx.TechnicalMessageVo;
import com.example.cloud.company.common.vo.xgm.hdxx.XmlVO;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class Gt3EJBTool {

    private static final Logger LOG = Logger.getLogger(Gt3EJBTool.class);

    public static ResultVo buildAndSendRequestXml(String djxh, String requestXml) throws UnsupportedEncodingException {
        TradeResultVo vo = execute(requestXml);
        ResultVo resultVo = null;
        if (!vo.isSuccess()) {
            resultVo = ResultVo.valueOfError(vo.getMessage(), vo.getMsgCode());
            resultVo.setValue(vo.getValue());
        } else {
            resultVo = ResultVo.valueOfSuccess(vo.getValue());
            resultVo.setMessage(vo.getMessage());
        }
        HashMap resultMap = new HashMap();
        resultMap.put("tradeCode", vo.getTradeCode());
        resultVo.setResultMap(resultMap);
        if ("5".equals(vo.getTradeCode())) {
            resultVo.setSuccess(false);
        }
        return resultVo;
    }


    public static TradeResultVo execute(String requestXml) throws UnsupportedEncodingException {
        String receiverMsg = requestXml;
        TradeResultVo tradeResultVo = Gt3SbztclUtil.getErrorCode4Gt3Msg(receiverMsg);
        if (!tradeResultVo.isSuccess()) {
            return tradeResultVo;
        } else {
            XmlVO<TechnicalMessageVo> tecvo = XmlUtil.doXmlParse(receiverMsg.getBytes("UTF-8"), TechnicalMessageVo.class, new String[]{"UTF-8"});
            HeadType headType = ((TechnicalMessageVo) tecvo.getXmlParse()).getHead();
            String returnCode = headType.getRtnCode();
            String code = headType.getRtnMsg().getCode();
            return Gt3SbztclUtil.getErrorCodeFromGt3Code(code, returnCode, tecvo, receiverMsg);
        }
    }


    public static ResultVo sendSbqcsCxRequestXml( String djxh,Class responseClass,String content) {
        try {
            ResultVo ejbResult = Gt3EJBTool.buildAndSendRequestXml(djxh, content);
            if (!ejbResult.isSuccess()) {
                LOG.error("调用征管获取期初数据请求失败，异常原因：" + ejbResult.getMessage());
                return ejbResult;
            } else {
                XmlVO<TechnicalMessageVo> techMsgVo = (XmlVO) ejbResult.getValue();
                if (!techMsgVo.isSuccess()) {
                    LOG.error("解析反馈报文出错。");
                    return ResultVo.valueOfError("解析核心征管返回报文出现异常！");
                } else {
                    String technicalBodyStr = "";

                    try {
                        technicalBodyStr = ((TechnicalMessageVo) techMsgVo.getXmlParse()).getBody();
                        byte[] technicalBody = technicalBodyStr.getBytes("UTF-8");
                        XmlVO responseVo = XmlUtil.doXmlParse(technicalBody, responseClass, new String[0]);
                        if (!responseVo.isSuccess()) {
                            LOG.error("解析征管期初数据反馈业务报文出错，错误原因：" + responseVo.getErrorMessage());
                            return ResultVo.valueOfError("解析征管期初数据反馈业务报文出现异常，" + responseVo.getErrorMessage());
                        } else {
                            return ResultVo.valueOfSuccess(responseVo.getXmlParse());
                        }
                    } catch (UnsupportedEncodingException var12) {
                        LOG.error("反馈业务报文编码异常,业务报文字符串为：" + technicalBodyStr);
                        return ResultVo.valueOfError("反馈业务报文编码异常。", 80408728);
                    }
                }
            }
        } catch (UnsupportedEncodingException e) {
        } catch (Exception e) {
            return ResultVo.valueOfError("解析核心征管返回报文出现异常！");
        }
        return ResultVo.valueOfError("解析核心征管返回报文出现异常！");
    }
}
