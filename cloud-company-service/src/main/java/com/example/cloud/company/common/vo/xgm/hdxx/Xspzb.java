package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "xspzbs",
        propOrder = {"zspmDm", "zspmMc", "yskmDm", "yskmMc", "ysfpblDm", "ysfpblMc", "skgkDm", "skgkMc", "nsqxDm"}
)
public class Xspzb {
    private String zspmDm;
    private String zspmMc;
    private String yskmDm;
    private String yskmMc;
    private String ysfpblDm;
    private String ysfpblMc;
    private String skgkDm;
    private String skgkMc;
    private String nsqxDm;

    public Xspzb() {
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getZspmMc() {
        return this.zspmMc;
    }

    public void setZspmMc(String zspmMc) {
        this.zspmMc = zspmMc;
    }

    public String getYskmDm() {
        return this.yskmDm;
    }

    public void setYskmDm(String yskmDm) {
        this.yskmDm = yskmDm;
    }

    public String getYskmMc() {
        return this.yskmMc;
    }

    public void setYskmMc(String yskmMc) {
        this.yskmMc = yskmMc;
    }

    public String getYsfpblDm() {
        return this.ysfpblDm;
    }

    public void setYsfpblDm(String ysfpblDm) {
        this.ysfpblDm = ysfpblDm;
    }

    public String getYsfpblMc() {
        return this.ysfpblMc;
    }

    public void setYsfpblMc(String ysfpblMc) {
        this.ysfpblMc = ysfpblMc;
    }

    public String getSkgkDm() {
        return this.skgkDm;
    }

    public void setSkgkDm(String skgkDm) {
        this.skgkDm = skgkDm;
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
}

