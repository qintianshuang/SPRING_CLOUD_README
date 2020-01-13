package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SKFPMXType",
        propOrder = {"fpdm", "fphm", "je", "se", "rzsj", "sksj", "xfsbh", "xfmc", "gfsbh", "gfmc", "jxsezcsj"}
)
public class SKFPMXType {
    @XmlElement(
            name = "FPDM",
            required = true
    )
    protected String fpdm;
    @XmlElement(
            name = "FPHM",
            required = true
    )
    protected String fphm;
    @XmlElement(
            name = "JE",
            required = true
    )
    protected String je;
    @XmlElement(
            name = "SE",
            required = true
    )
    protected String se;
    @XmlElement(
            name = "RZSJ",
            required = true
    )
    protected String rzsj;
    @XmlElement(
            name = "SKSJ",
            required = true
    )
    protected String sksj;
    @XmlElement(
            name = "XFSBH",
            required = true
    )
    protected String xfsbh;
    @XmlElement(
            name = "XFMC",
            required = true
    )
    protected String xfmc;
    @XmlElement(
            name = "GFSBH",
            required = true
    )
    protected String gfsbh;
    @XmlElement(
            name = "GFMC",
            required = true
    )
    protected String gfmc;
    @XmlElement(
            name = "JXSEZCSJ",
            required = true
    )
    protected String jxsezcsj;

    public SKFPMXType() {
    }

    public String getFPDM() {
        return this.fpdm;
    }

    public void setFPDM(String value) {
        this.fpdm = value;
    }

    public String getFPHM() {
        return this.fphm;
    }

    public void setFPHM(String value) {
        this.fphm = value;
    }

    public String getJE() {
        return this.je;
    }

    public void setJE(String value) {
        this.je = value;
    }

    public String getSE() {
        return this.se;
    }

    public void setSE(String value) {
        this.se = value;
    }

    public String getRZSJ() {
        return this.rzsj;
    }

    public void setRZSJ(String value) {
        this.rzsj = value;
    }

    public String getSKSJ() {
        return this.sksj;
    }

    public void setSKSJ(String value) {
        this.sksj = value;
    }

    public String getXFSBH() {
        return this.xfsbh;
    }

    public void setXFSBH(String value) {
        this.xfsbh = value;
    }

    public String getXFMC() {
        return this.xfmc;
    }

    public void setXFMC(String value) {
        this.xfmc = value;
    }

    public String getGFSBH() {
        return this.gfsbh;
    }

    public void setGFSBH(String value) {
        this.gfsbh = value;
    }

    public String getGFMC() {
        return this.gfmc;
    }

    public void setGFMC(String value) {
        this.gfmc = value;
    }

    public String getJXSEZCSJ() {
        return this.jxsezcsj;
    }

    public void setJXSEZCSJ(String value) {
        this.jxsezcsj = value;
    }
}
