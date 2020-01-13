package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "HzsbxxMxVo",
        propOrder = {"hzsbxxxh", "hzsbxxnsrsbh", "hzsbxxnsrmc", "hzsbxxswjg", "hzsbxxbqynskhfbl", "hzsbxxbqynskhfje", "hzsbxxnsrdzdahbhz", "hzsbxxxzqhysfpbldm", "hzsbxxysfpbldm"}
)
public class HzsbxxMxVo {
    @XmlElement(
            name = "HZSBXX_XH",
            required = true
    )
    protected String hzsbxxxh = "";
    @XmlElement(
            name = "HZSBXX_NSRSBH",
            required = true
    )
    protected String hzsbxxnsrsbh = "";
    @XmlElement(
            name = "HZSBXX_NSRMC",
            required = true
    )
    protected String hzsbxxnsrmc = "";
    @XmlElement(
            name = "HZSBXX_SWJG",
            required = true
    )
    protected String hzsbxxswjg = "";
    @XmlElement(
            name = "HZSBXX_BQYNSKHFBL"
    )
    protected double hzsbxxbqynskhfbl;
    @XmlElement(
            name = "HZSBXX_BQYNSKHFJE"
    )
    protected double hzsbxxbqynskhfje;
    @XmlElement(
            name = "HZSBXX_NSRDZDAH_BHZ",
            required = true
    )
    protected String hzsbxxnsrdzdahbhz = "";
    @XmlElement(
            name = "HZSBXX_XZQH_YSFPBL_DM",
            required = true
    )
    protected String hzsbxxxzqhysfpbldm = "";
    @XmlElement(
            name = "HZSBXX_YSFPBL_DM",
            required = true
    )
    protected String hzsbxxysfpbldm = "";

    public HzsbxxMxVo() {
    }

    public String getHZSBXXXH() {
        return this.hzsbxxxh;
    }

    public void setHZSBXXXH(String value) {
        this.hzsbxxxh = value;
    }

    public String getHZSBXXNSRSBH() {
        return this.hzsbxxnsrsbh;
    }

    public void setHZSBXXNSRSBH(String value) {
        this.hzsbxxnsrsbh = value;
    }

    public String getHZSBXXNSRMC() {
        return this.hzsbxxnsrmc;
    }

    public void setHZSBXXNSRMC(String value) {
        this.hzsbxxnsrmc = value;
    }

    public String getHZSBXXSWJG() {
        return this.hzsbxxswjg;
    }

    public void setHZSBXXSWJG(String value) {
        this.hzsbxxswjg = value;
    }

    public double getHZSBXXBQYNSKHFBL() {
        return this.hzsbxxbqynskhfbl;
    }

    public void setHZSBXXBQYNSKHFBL(double value) {
        this.hzsbxxbqynskhfbl = value;
    }

    public double getHZSBXXBQYNSKHFJE() {
        return this.hzsbxxbqynskhfje;
    }

    public void setHZSBXXBQYNSKHFJE(double value) {
        this.hzsbxxbqynskhfje = value;
    }

    public String getHZSBXXNSRDZDAHBHZ() {
        return this.hzsbxxnsrdzdahbhz;
    }

    public void setHZSBXXNSRDZDAHBHZ(String value) {
        this.hzsbxxnsrdzdahbhz = value;
    }

    public String getHZSBXXXZQHYSFPBLDM() {
        return this.hzsbxxxzqhysfpbldm;
    }

    public void setHZSBXXXZQHYSFPBLDM(String value) {
        this.hzsbxxxzqhysfpbldm = value;
    }

    public String getHZSBXXYSFPBLDM() {
        return this.hzsbxxysfpbldm;
    }

    public void setHZSBXXYSFPBLDM(String value) {
        this.hzsbxxysfpbldm = value;
    }
}

