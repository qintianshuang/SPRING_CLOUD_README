package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "zyssbGridlb",
        propOrder = {"zspmDm", "sbqxDm", "zszmDm", "sl1", "cjclbz", "jldwDm", "zsdxlb", "zslhhsb", "pjxkb", "zspmMc", "zszmMc", "jldwMc"}
)
public class ZyssbGridlb {
    @XmlElement(
            required = true
    )
    protected String zspmDm;
    @XmlElement(
            required = true
    )
    protected String sbqxDm;
    @XmlElement(
            required = true
    )
    protected String zszmDm;
    @XmlElement(
            required = true
    )
    protected String sl1;
    @XmlElement(
            required = true
    )
    protected String cjclbz;
    @XmlElement(
            required = true
    )
    protected String jldwDm;
    @XmlElement(
            required = true
    )
    protected String zsdxlb;
    @XmlElement(
            required = true
    )
    protected String zslhhsb;
    @XmlElement(
            required = true
    )
    protected String pjxkb;
    @XmlElement(
            required = true
    )
    protected String zspmMc;
    @XmlElement(
            required = true
    )
    protected String zszmMc;
    @XmlElement(
            required = true
    )
    protected String jldwMc;

    public ZyssbGridlb() {
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getSbqxDm() {
        return this.sbqxDm;
    }

    public void setSbqxDm(String sbqxDm) {
        this.sbqxDm = sbqxDm;
    }

    public String getZszmDm() {
        return this.zszmDm;
    }

    public void setZszmDm(String zszmDm) {
        this.zszmDm = zszmDm;
    }

    public String getSl1() {
        return this.sl1;
    }

    public void setSl1(String sl1) {
        this.sl1 = sl1;
    }

    public String getCjclbz() {
        return this.cjclbz;
    }

    public void setCjclbz(String cjclbz) {
        this.cjclbz = cjclbz;
    }

    public String getJldwDm() {
        return this.jldwDm;
    }

    public void setJldwDm(String jldwDm) {
        this.jldwDm = jldwDm;
    }

    public String getZsdxlb() {
        return this.zsdxlb;
    }

    public void setZsdxlb(String zsdxlb) {
        this.zsdxlb = zsdxlb;
    }

    public String getZslhhsb() {
        return this.zslhhsb;
    }

    public void setZslhhsb(String zslhhsb) {
        this.zslhhsb = zslhhsb;
    }

    public String getPjxkb() {
        return this.pjxkb;
    }

    public void setPjxkb(String pjxkb) {
        this.pjxkb = pjxkb;
    }

    public String getZspmMc() {
        return this.zspmMc;
    }

    public void setZspmMc(String zspmMc) {
        this.zspmMc = zspmMc;
    }

    public String getZszmMc() {
        return this.zszmMc;
    }

    public void setZszmMc(String zszmMc) {
        this.zszmMc = zszmMc;
    }

    public String getJldwMc() {
        return this.jldwMc;
    }

    public void setJldwMc(String jldwMc) {
        this.jldwMc = jldwMc;
    }
}

