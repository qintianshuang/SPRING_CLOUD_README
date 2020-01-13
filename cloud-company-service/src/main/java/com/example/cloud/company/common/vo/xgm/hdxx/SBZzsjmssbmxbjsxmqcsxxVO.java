package com.example.cloud.company.common.vo.xgm.hdxx;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SBZzsjmssbmxbjsxmqcsxxVO",
        propOrder = {"ewbhxh", "hmc", "qcye", "bqfse", "bqydjse", "bqsjdjse", "qmye"}
)
public class SBZzsjmssbmxbjsxmqcsxxVO {
    protected Long ewbhxh;
    protected String hmc;
    protected Double qcye;
    protected Double bqfse;
    protected Double bqydjse;
    protected Double bqsjdjse;
    protected Double qmye;

    public SBZzsjmssbmxbjsxmqcsxxVO() {
    }

    public Long getEwbhxh() {
        return this.ewbhxh;
    }

    public void setEwbhxh(Long value) {
        this.ewbhxh = value;
    }

    public String getHmc() {
        return this.hmc;
    }

    public void setHmc(String value) {
        this.hmc = value;
    }

    public Double getQcye() {
        return this.qcye;
    }

    public void setQcye(Double value) {
        this.qcye = value;
    }

    public Double getBqfse() {
        return this.bqfse;
    }

    public void setBqfse(Double value) {
        this.bqfse = value;
    }

    public Double getBqydjse() {
        return this.bqydjse;
    }

    public void setBqydjse(Double value) {
        this.bqydjse = value;
    }

    public Double getBqsjdjse() {
        return this.bqsjdjse;
    }

    public void setBqsjdjse(Double value) {
        this.bqsjdjse = value;
    }

    public Double getQmye() {
        return this.qmye;
    }

    public void setQmye(Double value) {
        this.qmye = value;
    }
}

