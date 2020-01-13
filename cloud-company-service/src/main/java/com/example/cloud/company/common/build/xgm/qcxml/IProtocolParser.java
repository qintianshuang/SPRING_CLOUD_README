package com.example.cloud.company.common.build.xgm.qcxml;

import com.example.cloud.company.common.vo.xgm.hdxx.XmlVO;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.log4j.Logger;

public class IProtocolParser {

    private static final Logger LOG = Logger.getLogger(IProtocolParser.class);

    public ResultVo parseRequestBw(byte[] xmlDatas, Class targetClass, int errorMsgCode, String errorMsgInfo) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("请求反馈报文为：" + new String(xmlDatas));
        }

        try {
            XmlVO xmlVO = XmlUtil.doXmlParse(xmlDatas, targetClass, new String[]{"GBK"});
            if (!xmlVO.isSuccess()) {
                LOG.error(errorMsgInfo);
                return ResultVo.valueOfError(errorMsgInfo, errorMsgCode);
            } else {
                return ResultVo.valueOfSuccess(xmlVO.getXmlParse());
            }
        } catch (Exception var6) {
            LOG.error(errorMsgInfo, var6);
            return ResultVo.valueOfError(errorMsgInfo, errorMsgCode);
        }
    }
}
