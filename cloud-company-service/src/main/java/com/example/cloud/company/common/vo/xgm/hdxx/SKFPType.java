package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SKFPType",
        propOrder = {"rzsj", "rzfs", "rzje"}
)
public class SKFPType {
    @XmlElement(
            name = "RZSJ",
            required = true
    )
    protected String rzsj;
    @XmlElement(
            name = "RZFS",
            required = true
    )
    protected String rzfs;
    @XmlElement(
            name = "RZJE",
            required = true
    )
    protected String rzje;

    public SKFPType() {
    }

    public String getRZSJ() {
        return this.rzsj;
    }

    public void setRZSJ(String value) {
        this.rzsj = value;
    }

    public String getRZFS() {
        return this.rzfs;
    }

    public void setRZFS(String value) {
        this.rzfs = value;
    }

    public String getRZJE() {
        return this.rzje;
    }

    public void setRZJE(String value) {
        this.rzje = value;
    }
}

