package com.example.cloud.company.common.vo.xgm.hdxx;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "YqwsbcxVo",
        propOrder = {"zsxmmc", "sssqq", "sssqz", "sbqx", "sbbzt"}
)
public class YqwsbcxVo {
    @XmlElement(
            name = "ZSXM_MC",
            required = true
    )
    protected String zsxmmc = "";
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
            name = "SBQX",
            required = true
    )
    protected String sbqx = "";
    @XmlElement(
            name = "SBBZT",
            required = true
    )
    protected String sbbzt = "";

    public YqwsbcxVo() {
    }

    public String getZSXMMC() {
        return this.zsxmmc;
    }

    public void setZSXMMC(String value) {
        this.zsxmmc = value;
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

    public String getSBQX() {
        return this.sbqx;
    }

    public void setSBQX(String value) {
        this.sbqx = value;
    }

    public String getSBBZT() {
        return this.sbbzt;
    }

    public void setSBBZT(String value) {
        this.sbbzt = value;
    }
}

