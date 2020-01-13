package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;

public class SixDecimalAdapter extends XmlAdapter<String, Double> {
    public SixDecimalAdapter() {
    }

    public String marshal(Double v) throws Exception {
        BigDecimal b = new BigDecimal(v + "");
        b = b.setScale(6, 4);
        return b.toPlainString();
    }

    public Double unmarshal(String v) throws Exception {
        return Double.parseDouble(v);
    }
}
