package com.example.cloud.company.common.vo.xgm.xml;

import com.example.cloud.company.common.vo.xgm.hdxx.XmlVO;

public interface IXmlParse extends IBaseInterface {
    XmlVO doParse(byte[] var1, Class var2, String var3);
}
