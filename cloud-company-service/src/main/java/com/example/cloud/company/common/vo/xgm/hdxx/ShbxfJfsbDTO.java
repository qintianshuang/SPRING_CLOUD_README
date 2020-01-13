package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "shbxfJfsbDTO",
        propOrder = {"hdId", "sjly", "jhsx", "zjtzlsh", "sblsh", "xxh", "zgswjgDm", "zgswjgMc", "sbjbjgDm", "sbjbjgMc", "lhjysbbm", "fkssrqq", "fkssqz", "zsxmDm", "zspmDm", "zszmDm", "jfjs", "jfbl", "yjfe", "hdscrq", "zsxmMc", "zspmMc", "zszmMc"}
)
public class ShbxfJfsbDTO {
    @XmlElement(
            required = true
    )
    protected String hdId;
    @XmlElement(
            required = true
    )
    protected String sjly;
    @XmlElement(
            required = true
    )
    protected String jhsx;
    @XmlElement(
            required = true
    )
    protected String zjtzlsh;
    @XmlElement(
            required = true
    )
    protected String sblsh;
    protected int xxh;
    @XmlElement(
            required = true
    )
    protected String zgswjgDm;
    @XmlElement(
            required = true
    )
    protected String zgswjgMc;
    @XmlElement(
            required = true
    )
    protected String sbjbjgDm;
    @XmlElement(
            required = true
    )
    protected String sbjbjgMc;
    @XmlElement(
            required = true
    )
    protected String lhjysbbm;
    @XmlElement(
            required = true
    )
    protected String fkssrqq;
    @XmlElement(
            required = true
    )
    protected String fkssqz;
    @XmlElement(
            required = true
    )
    protected String zsxmDm;
    @XmlElement(
            required = true
    )
    protected String zspmDm;
    protected String zszmDm;
    protected double jfjs;
    protected double jfbl;
    protected double yjfe;
    @XmlElement(
            required = true
    )
    protected String hdscrq;
    protected String zsxmMc;
    protected String zspmMc;
    protected String zszmMc;

    public ShbxfJfsbDTO() {
    }

    public String getZsxmMc() {
        return this.zsxmMc;
    }

    public void setZsxmMc(String zsxmMc) {
        this.zsxmMc = zsxmMc;
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

    public String getHdId() {
        return this.hdId;
    }

    public void setHdId(String value) {
        this.hdId = value;
    }

    public String getSjly() {
        return this.sjly;
    }

    public void setSjly(String value) {
        this.sjly = value;
    }

    public String getJhsx() {
        return this.jhsx;
    }

    public void setJhsx(String value) {
        this.jhsx = value;
    }

    public String getZjtzlsh() {
        return this.zjtzlsh;
    }

    public void setZjtzlsh(String value) {
        this.zjtzlsh = value;
    }

    public String getSblsh() {
        return this.sblsh;
    }

    public void setSblsh(String value) {
        this.sblsh = value;
    }

    public int getXxh() {
        return this.xxh;
    }

    public void setXxh(int value) {
        this.xxh = value;
    }

    public String getZgswjgDm() {
        return this.zgswjgDm;
    }

    public void setZgswjgDm(String value) {
        this.zgswjgDm = value;
    }

    public String getZgswjgMc() {
        return this.zgswjgMc;
    }

    public void setZgswjgMc(String value) {
        this.zgswjgMc = value;
    }

    public String getSbjbjgDm() {
        return this.sbjbjgDm;
    }

    public void setSbjbjgDm(String value) {
        this.sbjbjgDm = value;
    }

    public String getSbjbjgMc() {
        return this.sbjbjgMc;
    }

    public void setSbjbjgMc(String value) {
        this.sbjbjgMc = value;
    }

    public String getLhjysbbm() {
        return this.lhjysbbm;
    }

    public void setLhjysbbm(String value) {
        this.lhjysbbm = value;
    }

    public String getFkssrqq() {
        return this.fkssrqq;
    }

    public void setFkssrqq(String value) {
        this.fkssrqq = value;
    }

    public String getFkssqz() {
        return this.fkssqz;
    }

    public void setFkssqz(String value) {
        this.fkssqz = value;
    }

    public String getZsxmDm() {
        return this.zsxmDm;
    }

    public void setZsxmDm(String value) {
        this.zsxmDm = value;
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String value) {
        this.zspmDm = value;
    }

    public String getZszmDm() {
        return this.zszmDm;
    }

    public void setZszmDm(String value) {
        this.zszmDm = value;
    }

    public double getJfjs() {
        return this.jfjs;
    }

    public void setJfjs(double value) {
        this.jfjs = value;
    }

    public double getJfbl() {
        return this.jfbl;
    }

    public void setJfbl(double value) {
        this.jfbl = value;
    }

    public double getYjfe() {
        return this.yjfe;
    }

    public void setYjfe(double value) {
        this.yjfe = value;
    }

    public String getHdscrq() {
        return this.hdscrq;
    }

    public void setHdscrq(String value) {
        this.hdscrq = value;
    }
}

