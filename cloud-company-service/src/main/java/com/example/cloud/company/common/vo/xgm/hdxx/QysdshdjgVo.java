package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "QysdshdjgVo",
        propOrder = {"xmbm", "xmmc", "lrl"}
)
public class QysdshdjgVo {
    @XmlElement(
            name = "XMBM",
            required = true
    )
    protected String xmbm = "";
    @XmlElement(
            name = "XMMC",
            required = true
    )
    protected String xmmc = "";
    @XmlElement(
            name = "LRL",
            required = true
    )
    protected String lrl = "";

    public QysdshdjgVo() {
    }

    public String getXmbm() {
        return this.xmbm;
    }

    public void setXmbm(String xmbm) {
        this.xmbm = xmbm;
    }

    public String getXmmc() {
        return this.xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getLrl() {
        return this.lrl;
    }

    public void setLrl(String lrl) {
        this.lrl = lrl;
    }
}
