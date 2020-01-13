package com.example.cloud.db.po.sb.xgm;

import java.io.Serializable;


public class ZsxmDmslPO implements Serializable {

    private String rdpzuuid;

    private String  zsxmDm;

    private String zsxmmc;

    private String zspmDm;

    private String zspmmc;

    private String lx;

    private String sl;

    public String getRdpzuuid() {
        return rdpzuuid;
    }

    public void setRdpzuuid(String rdpzuuid) {
        this.rdpzuuid = rdpzuuid;
    }

    public String getZsxmDm() {
        return zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    public String getZsxmmc() {
        return zsxmmc;
    }

    public void setZsxmmc(String zsxmmc) {
        this.zsxmmc = zsxmmc;
    }

    public String getZspmDm() {
        return zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getZspmmc() {
        return zspmmc;
    }

    public void setZspmmc(String zspmmc) {
        this.zspmmc = zspmmc;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }
}
