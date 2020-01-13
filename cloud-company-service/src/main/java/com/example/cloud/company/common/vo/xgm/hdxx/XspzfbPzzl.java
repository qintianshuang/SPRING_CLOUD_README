package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "pzzlList",
        propOrder = {"pzzlDm", "pzzlMc", "whpbz"}
)
public class XspzfbPzzl {
    private String pzzlDm;
    private String pzzlMc;
    private String whpbz;

    public XspzfbPzzl() {
    }

    public String getPzzlDm() {
        return this.pzzlDm;
    }

    public void setPzzlDm(String pzzlDm) {
        this.pzzlDm = pzzlDm;
    }

    public String getPzzlMc() {
        return this.pzzlMc;
    }

    public void setPzzlMc(String pzzlMc) {
        this.pzzlMc = pzzlMc;
    }

    public String getWhpbz() {
        return this.whpbz;
    }

    public void setWhpbz(String whpbz) {
        this.whpbz = whpbz;
    }
}
