package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "WjskxxVo",
        propOrder = {"zsxmmc", "yzpzzl", "sssqq", "sssqz", "jkqx", "skzlmc", "bj", "znj", "yclbj", "yclznj"}
)
public class WjskxxVo {
    @XmlElement(
            name = "ZSXM_MC",
            required = true
    )
    protected String zsxmmc = "";
    @XmlElement(
            name = "YZPZZL",
            required = true
    )
    protected String yzpzzl = "";
    @XmlElement(
            name = "SSSQ_Q",
            required = true
    )
    protected String sssqq = "";
    @XmlElement(
            name = "SSSQ_Z",
            required = true
    )
    protected String sssqz = "";
    @XmlElement(
            name = "JKQX",
            required = true
    )
    protected String jkqx = "";
    @XmlElement(
            name = "SKZL_MC",
            required = true
    )
    protected String skzlmc = "";
    @XmlElement(
            name = "BJ"
    )
    protected double bj;
    @XmlElement(
            name = "ZNJ"
    )
    protected double znj;
    @XmlElement(
            name = "YCLBJ"
    )
    protected double yclbj;
    @XmlElement(
            name = "YCLZNJ"
    )
    protected double yclznj;

    public WjskxxVo() {
    }

    public String getZSXMMC() {
        return this.zsxmmc;
    }

    public void setZSXMMC(String value) {
        this.zsxmmc = value;
    }

    public String getYZPZZL() {
        return this.yzpzzl;
    }

    public void setYZPZZL(String value) {
        this.yzpzzl = value;
    }

    public String getSSSQQ() {
        return this.sssqq;
    }

    public void setSSSQQ(String value) {
        this.sssqq = value;
    }

    public String getSSSQZ() {
        return this.sssqz;
    }

    public void setSSSQZ(String value) {
        this.sssqz = value;
    }

    public String getJKQX() {
        return this.jkqx;
    }

    public void setJKQX(String value) {
        this.jkqx = value;
    }

    public String getSKZLMC() {
        return this.skzlmc;
    }

    public void setSKZLMC(String value) {
        this.skzlmc = value;
    }

    public double getBJ() {
        return this.bj;
    }

    public void setBJ(double value) {
        this.bj = value;
    }

    public double getZNJ() {
        return this.znj;
    }

    public void setZNJ(double value) {
        this.znj = value;
    }

    public double getYCLBJ() {
        return this.yclbj;
    }

    public void setYCLBJ(double value) {
        this.yclbj = value;
    }

    public double getYCLZNJ() {
        return this.yclznj;
    }

    public void setYCLZNJ(double value) {
        this.yclznj = value;
    }
}

