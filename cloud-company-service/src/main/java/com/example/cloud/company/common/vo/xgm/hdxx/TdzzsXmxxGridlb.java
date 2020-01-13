package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "TdzzsXmxxGridlb",
        propOrder = {"tdzzsxmbh", "tdzzsxmmc", "xxdz", "xmjsqssj", "xmjszzsj"}
)
public class TdzzsXmxxGridlb {
    @XmlElement(
            name = "TDZZSXMBH",
            required = true
    )
    protected String tdzzsxmbh = "";
    @XmlElement(
            name = "ZSZMDM",
            required = true
    )
    protected String tdzzsxmmc = "";
    @XmlElement(
            name = "XXDZ",
            required = true
    )
    protected String xxdz = "";
    @XmlElement(
            name = "XMJSQSSJ",
            required = true
    )
    protected String xmjsqssj = "";
    @XmlElement(
            name = "XMJSZZSJ",
            required = true
    )
    protected String xmjszzsj = "";

    public TdzzsXmxxGridlb() {
    }

    public String getTdzzsxmbh() {
        return this.tdzzsxmbh;
    }

    public void setTdzzsxmbh(String tdzzsxmbh) {
        this.tdzzsxmbh = tdzzsxmbh;
    }

    public String getTdzzsxmmc() {
        return this.tdzzsxmmc;
    }

    public void setTdzzsxmmc(String tdzzsxmmc) {
        this.tdzzsxmmc = tdzzsxmmc;
    }

    public String getXxdz() {
        return this.xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz;
    }

    public String getXmjsqssj() {
        return this.xmjsqssj;
    }

    public void setXmjsqssj(String xmjsqssj) {
        this.xmjsqssj = xmjsqssj;
    }

    public String getXmjszzsj() {
        return this.xmjszzsj;
    }

    public void setXmjszzsj(String xmjszzsj) {
        this.xmjszzsj = xmjszzsj;
    }
}
