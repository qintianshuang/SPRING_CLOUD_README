package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "hznsFjsffpbGridlb",
        propOrder = {"fzjgdjxh", "fzjgnsrsbh", "fzjgmc", "zsxmDm", "zsxmMc", "zspmDm", "zspmMc", "jsyj", "sl1", "ybtse", "rdpzuuid"}
)
public class HznsFjsffpbGridlb implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement(
            name = "FZJGDJXH",
            required = true
    )
    private String fzjgdjxh;
    @XmlElement(
            name = "FZJGNSRSBH",
            required = true
    )
    private String fzjgnsrsbh;
    @XmlElement(
            name = "FZJGMC",
            required = true
    )
    private String fzjgmc;
    @XmlElement(
            name = "ZSXMDM",
            required = true
    )
    private String zsxmDm;
    @XmlElement(
            name = "ZSXMMC",
            required = true
    )
    private String zsxmMc;
    @XmlElement(
            name = "ZSPMDM",
            required = true
    )
    private String zspmDm;
    @XmlElement(
            name = "ZSPMMC",
            required = true
    )
    private String zspmMc;
    @XmlElement(
            name = "JSYJ",
            required = true
    )
    private String jsyj;
    @XmlElement(
            name = "SL1",
            required = true
    )
    private String sl1;
    @XmlElement(
            name = "YBTSE",
            required = true
    )
    private String ybtse;
    @XmlElement(
            name = "RDPZUUID",
            required = true
    )
    private String rdpzuuid;

    public HznsFjsffpbGridlb() {
    }

    public String getFzjgdjxh() {
        return this.fzjgdjxh;
    }

    public void setFzjgdjxh(String fzjgdjxh) {
        this.fzjgdjxh = fzjgdjxh;
    }

    public String getFzjgnsrsbh() {
        return this.fzjgnsrsbh;
    }

    public void setFzjgnsrsbh(String fzjgnsrsbh) {
        this.fzjgnsrsbh = fzjgnsrsbh;
    }

    public String getFzjgmc() {
        return this.fzjgmc;
    }

    public void setFzjgmc(String fzjgmc) {
        this.fzjgmc = fzjgmc;
    }

    public String getZsxmDm() {
        return this.zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    public String getZsxmMc() {
        return this.zsxmMc;
    }

    public void setZsxmMc(String zsxmMc) {
        this.zsxmMc = zsxmMc;
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getZspmMc() {
        return this.zspmMc;
    }

    public void setZspmMc(String zspmMc) {
        this.zspmMc = zspmMc;
    }

    public String getJsyj() {
        return this.jsyj;
    }

    public void setJsyj(String jsyj) {
        this.jsyj = jsyj;
    }

    public String getSl1() {
        return this.sl1;
    }

    public void setSl1(String sl1) {
        this.sl1 = sl1;
    }

    public String getYbtse() {
        return this.ybtse;
    }

    public void setYbtse(String ybtse) {
        this.ybtse = ybtse;
    }

    public String getRdpzuuid() {
        return this.rdpzuuid;
    }

    public void setRdpzuuid(String rdpzuuid) {
        this.rdpzuuid = rdpzuuid;
    }
}

