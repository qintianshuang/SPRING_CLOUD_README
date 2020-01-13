package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "zszmGridlbVO",
        propOrder = {"zspmDm", "zszmDm", "zszmMc", "sl1", "jldwDm", "wrdlz", "rdpzuuid"}
)
public class ZszmGridlbVO {
    protected String zspmDm;
    protected String zszmDm;
    protected String zszmMc;
    protected String sl1;
    protected String jldwDm;
    protected String wrdlz;
    protected String rdpzuuid;

    public ZszmGridlbVO() {
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

    public String getZszmDm() {
        return this.zszmDm;
    }

    public void setZszmDm(String value) {
        this.zszmDm = value;
    }

    public String getSl1() {
        return this.sl1;
    }

    public void setSl1(String sl1) {
        this.sl1 = sl1;
    }

    public String getJldwDm() {
        return this.jldwDm;
    }

    public void setJldwDm(String jldwDm) {
        this.jldwDm = jldwDm;
    }

    public String getWrdlz() {
        return this.wrdlz;
    }

    public void setWrdlz(String wrdlz) {
        this.wrdlz = wrdlz;
    }

    public String getRdpzuuid() {
        return this.rdpzuuid;
    }

    public void setRdpzuuid(String rdpzuuid) {
        this.rdpzuuid = rdpzuuid;
    }
}

