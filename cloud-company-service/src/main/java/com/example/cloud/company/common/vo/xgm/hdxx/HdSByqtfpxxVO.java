package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SByqtfpxxVO",
        propOrder = {"sbuuid", "pzxh", "skgkDm", "yskmDm", "ysfpblDm", "skgkMc", "zszmDm", "ybtse", "xzqhszDm", "zsxmDm", "zspmDm", "fpbl", "xzqhszmc", "zszmmc", "zspmmc", "nsqxDm"}
)
public class HdSByqtfpxxVO {
    protected String sbuuid;
    protected String pzxh;
    protected String skgkDm;
    protected String skgkMc;
    protected String yskmDm;
    protected String ysfpblDm;
    protected String zszmDm;
    protected Double ybtse;
    protected String xzqhszDm;
    protected String zsxmDm;
    protected String zspmDm;
    @XmlJavaTypeAdapter(SixDecimalAdapter.class)
    protected Double fpbl;
    protected String xzqhszmc;
    protected String zszmmc;
    protected String zspmmc;
    protected String nsqxDm;

    public HdSByqtfpxxVO() {
    }

    public String getSkgkMc() {
        return this.skgkMc;
    }

    public void setSkgkMc(String skgkMc) {
        this.skgkMc = skgkMc;
    }

    public String getNsqxDm() {
        return this.nsqxDm;
    }

    public void setNsqxDm(String nsqxDm) {
        this.nsqxDm = nsqxDm;
    }

    public String getXzqhszmc() {
        return this.xzqhszmc;
    }

    public void setXzqhszmc(String xzqhszmc) {
        this.xzqhszmc = xzqhszmc;
    }

    public String getZszmmc() {
        return this.zszmmc;
    }

    public void setZszmmc(String zszmmc) {
        this.zszmmc = zszmmc;
    }

    public String getZspmmc() {
        return this.zspmmc;
    }

    public void setZspmmc(String zspmmc) {
        this.zspmmc = zspmmc;
    }

    public String getSbuuid() {
        return this.sbuuid;
    }

    public void setSbuuid(String value) {
        this.sbuuid = value;
    }

    public String getPzxh() {
        return this.pzxh;
    }

    public void setPzxh(String value) {
        this.pzxh = value;
    }

    public String getSkgkDm() {
        return this.skgkDm;
    }

    public void setSkgkDm(String value) {
        this.skgkDm = value;
    }

    public String getYskmDm() {
        return this.yskmDm;
    }

    public void setYskmDm(String value) {
        this.yskmDm = value;
    }

    public String getYsfpblDm() {
        return this.ysfpblDm;
    }

    public void setYsfpblDm(String value) {
        this.ysfpblDm = value;
    }

    public String getZszmDm() {
        return this.zszmDm;
    }

    public void setZszmDm(String value) {
        this.zszmDm = value;
    }

    public Double getYbtse() {
        return this.ybtse;
    }

    public void setYbtse(Double value) {
        this.ybtse = value;
    }

    public String getXzqhszDm() {
        return this.xzqhszDm;
    }

    public void setXzqhszDm(String value) {
        this.xzqhszDm = value;
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

    public Double getFpbl() {
        return this.fpbl;
    }

    public void setFpbl(Double value) {
        this.fpbl = value;
    }
}
