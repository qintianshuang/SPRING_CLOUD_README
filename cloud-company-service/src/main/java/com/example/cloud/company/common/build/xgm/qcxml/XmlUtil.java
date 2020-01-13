package com.example.cloud.company.common.build.xgm.qcxml;

import com.example.cloud.company.common.vo.xgm.hdxx.XmlVO;
import com.example.cloud.company.common.vo.xgm.xml.IXmlParse;
import com.example.cloud.company.common.vo.xgm.xml.JaxbXmlBuild;
import com.example.cloud.company.common.vo.xgm.xml.JaxbXmlParse;

public class XmlUtil {
    public XmlUtil() {
    }

    public static <T> XmlVO<T> doXmlParse(byte[] xml, Class xmlClass, String... encoding) {
        IXmlParse xmlParse = new JaxbXmlParse();
        String coding = "";
        if (encoding != null && encoding.length > 0) {
            coding = encoding[0];
        }

        XmlVO<T> xmlVO = xmlParse.doParse(xml, xmlClass, coding);
        return xmlVO;
    }

    public static String doXmlBuild(Object nodeObj, String encoding) {
        JaxbXmlBuild xmlBuild = new JaxbXmlBuild();
        return xmlBuild.build(nodeObj, encoding);
    }
}
