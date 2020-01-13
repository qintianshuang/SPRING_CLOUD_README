package com.example.cloud.company.common.vo.xgm.sbxx.sb.xgm;

import com.example.cloud.company.common.build.xgm.qcxml.IProtocolParser;
import com.example.cloud.company.common.build.xgm.qcxml.SbbwUtil;
import com.example.cloud.company.common.build.xgm.qcxml.XmlUtil;
import com.example.cloud.company.common.constants.CommonConstants;
import com.example.cloud.company.common.vo.base.NsrxxVO;
import com.example.cloud.company.common.vo.xgm.hdxx.XmlVO;
import com.example.cloud.company.common.vo.xgm.sbxx.SbBusinessVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.HXZGSB00045Request;
import com.example.cloud.company.common.vo.xgm.xml.HXZGSB00044Response;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/***
 *
 */
public class SbxxtjVO {

    private static final Logger LOG = Logger.getLogger(SbxxtjVO.class);

    /********************************************************申报报文获取与解析处理开始*********************************************/
    /***
     * 拼接报文
     * @param sbBusinessVO
     * @param nsrxxVO
     * @return
     */
    public static ResultVo pjqbw(SbBusinessVO sbBusinessVO, NsrxxVO nsrxxVO) {
        // xml的type名称
        String type = "HXZGSB00045Request";
        // 文件名
        String fileName = "TaxMLBw_HXZG_SB_00045_Request_V1.0.xsd";
        // 拼接申报报表
        String content = SbbwUtil.spliceSbzb(sbBusinessVO.getDetailFiles());
        if (StringUtils.isBlank(content)) {
            return ResultVo.valueOfError("拼接全报文失败");
        }
        // 拼接对象
        StringBuilder sb = new StringBuilder();
        sb.append("<zzssyyxgmnsrySbSbbdxxVO xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\">");
        sb.append(content);
        sb.append("</zzssyyxgmnsrySbSbbdxxVO>");
        String requestXml = SbbwUtil.spliceSbbw(type, fileName, nsrxxVO.getDjxh(), nsrxxVO.getHyDm(), sb.toString());
        return ResultVo.valueOfSuccess(requestXml);
    }

    /***
     * 纳税人申报报文处理
     * @param requestXml
     * @param djxh
     * @return
     */
    public static ResultVo bwcl(String requestXml, String djxh) {
        try {
            IProtocolParser parser = new IProtocolParser();
            ResultVo resultVo = parser.parseRequestBw(requestXml.getBytes(CommonConstants.CHARSET_CODE_GBK),
                    HXZGSB00045Request.class, 0, "小规模报文解析失败");
            if (!resultVo.isSuccess()) {
                LOG.error("====登记序号===【" + djxh + "】====小规模报文解析失败");
                return ResultVo.valueOfError("小规模报文解析失败");
            }
            HXZGSB00045Request requestVO = (HXZGSB00045Request) resultVo.getValue();
            return ResultVo.valueOfSuccess(requestVO);
        } catch (Exception e) {
            LOG.error("====登记序号===【" + djxh + "】====小规模特殊节点处理异常，放弃处理操作.", e);
            return ResultVo.valueOfError("小规模计算公式校验失败。");
        }
    }


    public static ResultVo parse(byte[] requestXml) {
        return parseZzs(requestXml, HXZGSB00045Request.class, 80408895,
                "\u5C0F\u89C4\u6A21\u7533\u62A5\u4E1A\u52A1\u62A5\u6587\u89E3\u6790\u5931\u8D25");

    }

    private static ResultVo parseZzs(byte[] sbbXmlDatas, Class<?> targetClass, int errorMsgCode, String errorMsgInfo) {

        try {
            // 这个是和核心征管交互的，编码为UTF-8
            XmlVO<Object> xmlVO = XmlUtil.doXmlParse(sbbXmlDatas, targetClass, CommonConstants.CHARSET_CODE_UTF8);
            if (!xmlVO.isSuccess()) {
                LOG.error(errorMsgInfo);
                return ResultVo.valueOfError(errorMsgInfo, errorMsgCode);
            }
            return ResultVo.valueOfSuccess(xmlVO.getXmlParse());
        } catch (Exception e) {
            LOG.error(errorMsgInfo, e);
            return ResultVo.valueOfError(errorMsgInfo, errorMsgCode);
        }
    }



    /***
     * 纳税人申报报文处理
     * @param requestXml
     * @param djxh
     * @return
     */
    public static ResultVo hdbwcl(String requestXml, String djxh) {
        try {
            IProtocolParser parser = new IProtocolParser();
            ResultVo resultVo = parser.parseRequestBw(requestXml.getBytes(CommonConstants.CHARSET_CODE_GBK),
                    HXZGSB00044Response.class, 0, "小规模报文解析失败");
            if (!resultVo.isSuccess()) {
                LOG.error("====登记序号===【" + djxh + "】====小规模报文解析失败");
                return ResultVo.valueOfError("小规模报文解析失败");
            }
            HXZGSB00044Response requestVO = (HXZGSB00044Response) resultVo.getValue();
            return ResultVo.valueOfSuccess(requestVO);
        } catch (Exception e) {
            LOG.error("====登记序号===【" + djxh + "】====小规模特殊节点处理异常，放弃处理操作.", e);
            return ResultVo.valueOfError("小规模计算公式校验失败。");
        }
    }
    /********************************************************申报报文获取与解析处理结束*******************************************************/
}
