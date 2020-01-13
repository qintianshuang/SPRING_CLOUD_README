package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "XKZZSZYFPMXType",
        propOrder = {"fpdm", "fphm", "je", "se", "rzsj", "xfsbh", "xfmc", "gfsbh", "gfmc", "jxsezcsj"}
)
public class XKZZSZYFPMXType {
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

    public XKZZSZYFPMXType() {
    }

    public String getFpdm() {
        return this.fpdm;
    }

    public void setFpdm(String fpdm) {
        this.fpdm = fpdm;
    }

    public String getFphm() {
        return this.fphm;
    }

    public void setFphm(String fphm) {
        this.fphm = fphm;
    }

    public String getJe() {
        return this.je;
    }

    public void setJe(String je) {
        this.je = je;
    }

    public String getSe() {
        return this.se;
    }

    public void setSe(String se) {
        this.se = se;
    }

    public String getRzsj() {
        return this.rzsj;
    }

    public void setRzsj(String rzsj) {
        this.rzsj = rzsj;
    }

    public String getXfsbh() {
        return this.xfsbh;
    }

    public void setXfsbh(String xfsbh) {
        this.xfsbh = xfsbh;
    }

    public String getXfmc() {
        return this.xfmc;
    }

    public void setXfmc(String xfmc) {
        this.xfmc = xfmc;
    }

    public String getGfsbh() {
        return this.gfsbh;
    }

    public void setGfsbh(String gfsbh) {
        this.gfsbh = gfsbh;
    }

    public String getGfmc() {
        return this.gfmc;
    }

    public void setGfmc(String gfmc) {
        this.gfmc = gfmc;
    }

    public String getJxsezcsj() {
        return this.jxsezcsj;
    }

    public void setJxsezcsj(String jxsezcsj) {
        this.jxsezcsj = jxsezcsj;
    }
}

