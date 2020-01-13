package com.example.cloud.company.common.vo.xgm.hdxx;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SsdcVo",
        propOrder = {"tsnr", "yxqq", "yxqz"}
)
public class SsdcVo {
    @XmlElement(
            name = "TSNR",
            required = true
    )
    protected String tsnr = "";
    @XmlElement(
            name = "YXQ_Q",
            required = true
    )
    protected String yxqq = "";
    @XmlElement(
            name = "YXQ_Z",
            required = true
    )
    protected String yxqz = "";

    public SsdcVo() {
    }

    public String getTSNR() {
        return this.tsnr;
    }

    public void setTSNR(String value) {
        this.tsnr = value;
    }

    public String getYXQQ() {
        return this.yxqq;
    }

    public void setYXQQ(String value) {
        this.yxqq = value;
    }

    public String getYXQZ() {
        return this.yxqz;
    }

    public void setYXQZ(String value) {
        this.yxqz = value;
    }
}

