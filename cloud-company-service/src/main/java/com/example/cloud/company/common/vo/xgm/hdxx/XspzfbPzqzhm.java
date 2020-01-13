package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "pzqshmList",
        propOrder = {"pzzlDm", "pzzgDm", "pzqshm", "pzzzhm", "pzme", "jcsl", "whpbz"}
)
public class XspzfbPzqzhm {
    private String pzzlDm;
    private String pzzgDm;
    private String pzqshm;
    private String pzzzhm;
    private String pzme;
    private String jcsl;
    private String whpbz;

    public XspzfbPzqzhm() {
    }

    public String getPzzlDm() {
        return this.pzzlDm;
    }

    public void setPzzlDm(String pzzlDm) {
        this.pzzlDm = pzzlDm;
    }

    public String getPzzgDm() {
        return this.pzzgDm;
    }

    public void setPzzgDm(String pzzgDm) {
        this.pzzgDm = pzzgDm;
    }

    public String getPzqshm() {
        return this.pzqshm;
    }

    public void setPzqshm(String pzqshm) {
        this.pzqshm = pzqshm;
    }

    public String getPzzzhm() {
        return this.pzzzhm;
    }

    public void setPzzzhm(String pzzzhm) {
        this.pzzzhm = pzzzhm;
    }

    public String getPzme() {
        return this.pzme;
    }

    public void setPzme(String pzme) {
        this.pzme = pzme;
    }

    public String getJcsl() {
        return this.jcsl;
    }

    public void setJcsl(String jcsl) {
        this.jcsl = jcsl;
    }

    public String getWhpbz() {
        return this.whpbz;
    }

    public void setWhpbz(String whpbz) {
        this.whpbz = whpbz;
    }
}

