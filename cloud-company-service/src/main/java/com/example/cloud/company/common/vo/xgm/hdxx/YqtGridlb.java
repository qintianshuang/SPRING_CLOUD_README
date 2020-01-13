package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "YqtGridlb",
        propOrder = {"yqtDm", "yqtMc", "zyzmc"}
)
public class YqtGridlb {
    protected String yqtDm;
    protected String yqtMc;
    protected String zyzmc;

    public YqtGridlb() {
    }

    public String getYqtDm() {
        return this.yqtDm;
    }

    public void setYqtDm(String yqtDm) {
        this.yqtDm = yqtDm;
    }

    public String getYqtMc() {
        return this.yqtMc;
    }

    public void setYqtMc(String yqtMc) {
        this.yqtMc = yqtMc;
    }

    public String getZyzmc() {
        return this.zyzmc;
    }

    public void setZyzmc(String zyzmc) {
        this.zyzmc = zyzmc;
    }
}
