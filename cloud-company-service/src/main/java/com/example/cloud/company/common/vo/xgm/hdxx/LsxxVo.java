package com.example.cloud.company.common.vo.xgm.hdxx;

import com.example.cloud.company.common.build.xgm.qcxml.ArithUtil;
import com.example.cloud.company.common.build.xgm.qcxml.StringToTwoDecimalAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "LsxxVo",
        propOrder = {"code", "name", "value"}
)
public class LsxxVo {
    @XmlElement(
            name = "CODE",
            required = true
    )
    protected String code = "";
    @XmlElement(
            name = "NAME",
            required = true
    )
    protected String name = "";
    @XmlElement(
            name = "VALUE",
            required = true
    )
    @XmlJavaTypeAdapter(StringToTwoDecimalAdapter.class)
    protected String value = "";

    public LsxxVo() {
    }

    public String getCODE() {
        return this.code;
    }

    public void setCODE(String value) {
        this.code = value;
    }

    public String getNAME() {
        return this.name;
    }

    public void setNAME(String value) {
        this.name = value;
    }

    public String getVALUE() {
        return this.value;
    }

    public void setVALUE(String value) {
        boolean flag = false;
        flag = ArithUtil.isENnum(value);
        if (flag) {
            BigDecimal b = new BigDecimal(value);
            b = b.setScale(2, 4);
            this.value = b.toPlainString();
        } else {
            this.value = value;
        }
    }
}

