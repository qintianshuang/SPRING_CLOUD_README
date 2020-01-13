package com.example.cloud.company.common.vo.xgm.hdxx;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SbfDwhzHdxxDTO",
        propOrder = {"dwhdid", "sfczmx", "sjly", "jhsx", "zjtzlsh", "sblsh", "xxh", "zgswjgDm", "zgswjgMc", "sbjbjgDm", "sbjbjgMc", "dwsbbm", "fkssqq", "fkssqz", "zsxmDm", "zspmDm", "zszmDm", "jfrs", "zzgzze", "jfjs", "jfbl", "yjfe", "hdscrq", "xzSbfsDm", "zsxmMc", "zspmMc", "zszmMc"}
)
public class SbfDwhzHdxxDTO {
    @XmlElement(
            required = true
    )
    protected String dwhdid;
    @XmlElement(
            required = true
    )
    protected String sfczmx;
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
    protected String dwsbbm;
    @XmlElement(
            required = true
    )
    protected String fkssqq;
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
    protected long jfrs;
    protected double zzgzze;
    protected double jfjs;
    protected double jfbl;
    protected double yjfe;
    @XmlElement(
            required = true
    )
    protected String hdscrq;
    @XmlElement(
            required = true
    )
    protected String xzSbfsDm;
    protected String zsxmMc;
    protected String zspmMc;
    protected String zszmMc;

    public SbfDwhzHdxxDTO() {
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

    public String getDwhdid() {
        return this.dwhdid;
    }

    public void setDwhdid(String value) {
        this.dwhdid = value;
    }

    public String getSfczmx() {
        return this.sfczmx;
    }

    public void setSfczmx(String value) {
        this.sfczmx = value;
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

    public String getDwsbbm() {
        return this.dwsbbm;
    }

    public void setDwsbbm(String value) {
        this.dwsbbm = value;
    }

    public String getFkssqq() {
        return this.fkssqq;
    }

    public void setFkssqq(String value) {
        this.fkssqq = value;
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

    public long getJfrs() {
        return this.jfrs;
    }

    public void setJfrs(long value) {
        this.jfrs = value;
    }

    public double getZzgzze() {
        return this.zzgzze;
    }

    public void setZzgzze(double value) {
        this.zzgzze = value;
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

    public String getXzSbfsDm() {
        return this.xzSbfsDm;
    }

    public void setXzSbfsDm(String value) {
        this.xzSbfsDm = value;
    }
}

