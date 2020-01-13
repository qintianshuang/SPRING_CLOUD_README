package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "WfwzxxVo",
        propOrder = {"wfwzxj", "wfwzsd", "wzss", "cfje", "wfwzzt", "clcfjd"}
)
public class WfwzxxVo {
    @XmlElement(
            name = "WFWZXJ",
            required = true
    )
    protected String wfwzxj = "";
    @XmlElement(
            name = "WFWZSD",
            required = true
    )
    protected String wfwzsd = "";
    @XmlElement(
            name = "WZSS",
            required = true
    )
    protected String wzss = "";
    @XmlElement(
            name = "CFJE"
    )
    protected double cfje;
    @XmlElement(
            name = "WFWZZT",
            required = true
    )
    protected String wfwzzt = "";
    @XmlElement(
            name = "CLCFJD",
            required = true
    )
    protected String clcfjd = "";

    public WfwzxxVo() {
    }

    public String getWFWZXJ() {
        return this.wfwzxj;
    }

    public void setWFWZXJ(String value) {
        this.wfwzxj = value;
    }

    public String getWFWZSD() {
        return this.wfwzsd;
    }

    public void setWFWZSD(String value) {
        this.wfwzsd = value;
    }

    public String getWZSS() {
        return this.wzss;
    }

    public void setWZSS(String value) {
        this.wzss = value;
    }

    public double getCFJE() {
        return this.cfje;
    }

    public void setCFJE(double value) {
        this.cfje = value;
    }

    public String getWFWZZT() {
        return this.wfwzzt;
    }

    public void setWFWZZT(String value) {
        this.wfwzzt = value;
    }

    public String getCLCFJD() {
        return this.clcfjd;
    }

    public void setCLCFJD(String value) {
        this.clcfjd = value;
    }
}

