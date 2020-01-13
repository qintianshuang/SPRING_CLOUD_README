package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "YjfxzbjzsbzVO",
        propOrder = {"zspmDm", "tjckqq", "tjckqz", "tjzq", "zsbz1", "zspmMc", "zszmMc", "zszmDm"}
)
public class YjfxzbjzsbzVO {
    @XmlElement(
            required = true
    )
    protected String zspmDm;
    @XmlElement(
            required = true
    )
    protected String zspmMc;
    @XmlElement(
            required = true
    )
    protected String zszmDm;
    @XmlElement(
            required = true
    )
    protected String zszmMc;
    @XmlElement(
            required = true
    )
    protected String tjckqq;
    @XmlElement(
            required = true
    )
    protected String tjckqz;
    @XmlElement(
            required = true
    )
    protected String tjzq;
    protected double zsbz1;

    public YjfxzbjzsbzVO() {
    }

    public String getZspmMc() {
        return this.zspmMc;
    }

    public void setZspmMc(String zspmMc) {
        this.zspmMc = zspmMc;
    }

    public String getZszmDm() {
        return this.zszmDm;
    }

    public void setZszmDm(String zszmDm) {
        this.zszmDm = zszmDm;
    }

    public String getZszmMc() {
        return this.zszmMc;
    }

    public void setZszmMc(String zszmMc) {
        this.zszmMc = zszmMc;
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String value) {
        this.zspmDm = value;
    }

    public String getTjckqq() {
        return this.tjckqq;
    }

    public void setTjckqq(String value) {
        this.tjckqq = value;
    }

    public String getTjckqz() {
        return this.tjckqz;
    }

    public void setTjckqz(String value) {
        this.tjckqz = value;
    }

    public String getTjzq() {
        return this.tjzq;
    }

    public void setTjzq(String value) {
        this.tjzq = value;
    }

    public double getZsbz1() {
        return this.zsbz1;
    }

    public void setZsbz1(double value) {
        this.zsbz1 = value;
    }
}

