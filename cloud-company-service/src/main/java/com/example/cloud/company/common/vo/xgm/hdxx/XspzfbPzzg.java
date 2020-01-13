package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "pzzgList",
        propOrder = {"pzzlDm", "pzzgDm", "pzzgMc"}
)
public class XspzfbPzzg {
    private String pzzlDm;
    private String pzzgDm;
    private String pzzgMc;

    public XspzfbPzzg() {
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

    public String getPzzgMc() {
        return this.pzzgMc;
    }

    public void setPzzgMc(String pzzgMc) {
        this.pzzgMc = pzzgMc;
    }
}
