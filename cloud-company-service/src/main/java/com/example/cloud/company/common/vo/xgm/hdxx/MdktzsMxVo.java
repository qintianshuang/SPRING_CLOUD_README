package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MdktzsMxVo",
        propOrder = {"mdktzsnsrsbh", "mdktzsnsrmc", "mdktzsssny", "mdktzsytse", "mdktzsmdse", "mdktzscbse", "mdktzsqmldse", "mdktzscktsqylxmc", "mdktzsxhrdm", "mdktzsxhrq", "mdktzsyjkrq", "mdktzsswjgmc"}
)
public class MdktzsMxVo {
    @XmlElement(
            name = "MDKTZS_NSRSBH",
            required = true
    )
    protected String mdktzsnsrsbh = "";
    @XmlElement(
            name = "MDKTZS_NSRMC",
            required = true
    )
    protected String mdktzsnsrmc = "";
    @XmlElement(
            name = "MDKTZS_SSNY",
            required = true
    )
    protected String mdktzsssny = "";
    @XmlElement(
            name = "MDKTZS_YTSE"
    )
    protected double mdktzsytse;
    @XmlElement(
            name = "MDKTZS_MDSE"
    )
    protected double mdktzsmdse;
    @XmlElement(
            name = "MDKTZS_CBSE"
    )
    protected double mdktzscbse;
    @XmlElement(
            name = "MDKTZS_QMLDSE"
    )
    protected double mdktzsqmldse;
    @XmlElement(
            name = "MDKTZS_CKTSQYLXMC",
            required = true
    )
    protected String mdktzscktsqylxmc = "";
    @XmlElement(
            name = "MDKTZS_XHRDM",
            required = true
    )
    protected String mdktzsxhrdm = "";
    @XmlElement(
            name = "MDKTZS_XHRQ",
            required = true
    )
    protected String mdktzsxhrq = "";
    @XmlElement(
            name = "MDKTZS_YJKRQ",
            required = true
    )
    protected String mdktzsyjkrq = "";
    @XmlElement(
            name = "MDKTZS_SWJGMC",
            required = true
    )
    protected String mdktzsswjgmc = "";

    public MdktzsMxVo() {
    }

    public String getMDKTZSNSRSBH() {
        return this.mdktzsnsrsbh;
    }

    public void setMDKTZSNSRSBH(String value) {
        this.mdktzsnsrsbh = value;
    }

    public String getMDKTZSNSRMC() {
        return this.mdktzsnsrmc;
    }

    public void setMDKTZSNSRMC(String value) {
        this.mdktzsnsrmc = value;
    }

    public String getMDKTZSSSNY() {
        return this.mdktzsssny;
    }

    public void setMDKTZSSSNY(String value) {
        this.mdktzsssny = value;
    }

    public double getMDKTZSYTSE() {
        return this.mdktzsytse;
    }

    public void setMDKTZSYTSE(double value) {
        this.mdktzsytse = value;
    }

    public double getMDKTZSMDSE() {
        return this.mdktzsmdse;
    }

    public void setMDKTZSMDSE(double value) {
        this.mdktzsmdse = value;
    }

    public double getMDKTZSCBSE() {
        return this.mdktzscbse;
    }

    public void setMDKTZSCBSE(double value) {
        this.mdktzscbse = value;
    }

    public double getMDKTZSQMLDSE() {
        return this.mdktzsqmldse;
    }

    public void setMDKTZSQMLDSE(double value) {
        this.mdktzsqmldse = value;
    }

    public String getMDKTZSCKTSQYLXMC() {
        return this.mdktzscktsqylxmc;
    }

    public void setMDKTZSCKTSQYLXMC(String value) {
        this.mdktzscktsqylxmc = value;
    }

    public String getMDKTZSXHRDM() {
        return this.mdktzsxhrdm;
    }

    public void setMDKTZSXHRDM(String value) {
        this.mdktzsxhrdm = value;
    }

    public String getMDKTZSXHRQ() {
        return this.mdktzsxhrq;
    }

    public void setMDKTZSXHRQ(String value) {
        this.mdktzsxhrq = value;
    }

    public String getMDKTZSYJKRQ() {
        return this.mdktzsyjkrq;
    }

    public void setMDKTZSYJKRQ(String value) {
        this.mdktzsyjkrq = value;
    }

    public String getMDKTZSSWJGMC() {
        return this.mdktzsswjgmc;
    }

    public void setMDKTZSSWJGMC(String value) {
        this.mdktzsswjgmc = value;
    }
}

