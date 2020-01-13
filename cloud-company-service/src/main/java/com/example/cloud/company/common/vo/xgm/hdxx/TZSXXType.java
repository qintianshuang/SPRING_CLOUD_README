package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "TZSXXType",
        propOrder = {"djxh", "nsrsbh", "nsrmc", "swjgmc", "swjgjc", "lrnf", "tzsbh", "skfpfs", "skfpse", "jxsezcsj", "jxsezcfs", "jxsezcse", "tbrq", "skfps"}
)
public class TZSXXType {
    @XmlElement(
            name = "DJXH",
            required = true
    )
    protected String djxh;
    @XmlElement(
            name = "NSRSBH",
            required = true
    )
    protected String nsrsbh;
    @XmlElement(
            name = "NSRMC",
            required = true
    )
    protected String nsrmc;
    @XmlElement(
            name = "SWJGMC",
            required = true
    )
    protected String swjgmc;
    @XmlElement(
            name = "SWJGJC",
            required = true
    )
    protected String swjgjc;
    @XmlElement(
            name = "LRNF",
            required = true
    )
    protected String lrnf;
    @XmlElement(
            name = "TZSBH",
            required = true
    )
    protected String tzsbh;
    @XmlElement(
            name = "SKFP_FS",
            required = true
    )
    protected String skfpfs;
    @XmlElement(
            name = "SKFP_SE",
            required = true
    )
    protected String skfpse;
    @XmlElement(
            name = "JXSEZCSJ",
            required = true
    )
    protected String jxsezcsj;
    @XmlElement(
            name = "JXSEZCFS",
            required = true
    )
    protected String jxsezcfs;
    @XmlElement(
            name = "JXSEZCSE",
            required = true
    )
    protected String jxsezcse;
    @XmlElement(
            name = "TBRQ",
            required = true
    )
    protected String tbrq;
    @XmlElement(
            name = "SKFPS",
            required = true
    )
    protected SKFPS skfps;

    public TZSXXType() {
    }

    public String getDJXH() {
        return this.djxh;
    }

    public void setDJXH(String value) {
        this.djxh = value;
    }

    public String getNSRSBH() {
        return this.nsrsbh;
    }

    public void setNSRSBH(String value) {
        this.nsrsbh = value;
    }

    public String getNSRMC() {
        return this.nsrmc;
    }

    public void setNSRMC(String value) {
        this.nsrmc = value;
    }

    public String getSWJGMC() {
        return this.swjgmc;
    }

    public void setSWJGMC(String value) {
        this.swjgmc = value;
    }

    public String getSWJGJC() {
        return this.swjgjc;
    }

    public void setSWJGJC(String value) {
        this.swjgjc = value;
    }

    public String getLRNF() {
        return this.lrnf;
    }

    public void setLRNF(String value) {
        this.lrnf = value;
    }

    public String getTZSBH() {
        return this.tzsbh;
    }

    public void setTZSBH(String value) {
        this.tzsbh = value;
    }

    public String getSKFPFS() {
        return this.skfpfs;
    }

    public void setSKFPFS(String value) {
        this.skfpfs = value;
    }

    public String getSKFPSE() {
        return this.skfpse;
    }

    public void setSKFPSE(String value) {
        this.skfpse = value;
    }

    public String getJXSEZCSJ() {
        return this.jxsezcsj;
    }

    public void setJXSEZCSJ(String value) {
        this.jxsezcsj = value;
    }

    public String getJXSEZCFS() {
        return this.jxsezcfs;
    }

    public void setJXSEZCFS(String value) {
        this.jxsezcfs = value;
    }

    public String getJXSEZCSE() {
        return this.jxsezcse;
    }

    public void setJXSEZCSE(String value) {
        this.jxsezcse = value;
    }

    public String getTBRQ() {
        return this.tbrq;
    }

    public void setTBRQ(String value) {
        this.tbrq = value;
    }

    public SKFPS getSKFPS() {
        return this.skfps;
    }

    public void setSKFPS(SKFPS value) {
        this.skfps = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"skfp"}
    )
    public static class SKFPS {
        @XmlElement(
                name = "SKFP"
        )
        protected List<SKFPType> skfp;

        public SKFPS() {
        }

        public List<SKFPType> getSKFP() {
            if (this.skfp == null) {
                this.skfp = new ArrayList();
            }

            return this.skfp;
        }
    }
}

