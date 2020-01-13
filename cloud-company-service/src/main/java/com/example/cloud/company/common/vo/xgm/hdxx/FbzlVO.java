package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FbzlVO",
        propOrder = {"fbzlDm", "fbzlMc", "bslxDm", "yscbz"}
)
public class FbzlVO implements Serializable {
    protected String fbzlDm;
    protected String fbzlMc;
    protected String bslxDm;
    protected String yscbz;

    public FbzlVO() {
    }

    public String getFbzlDm() {
        return this.fbzlDm;
    }

    public void setFbzlDm(String fbzlDm) {
        this.fbzlDm = fbzlDm;
    }

    public String getFbzlMc() {
        return this.fbzlMc;
    }

    public void setFbzlMc(String fbzlMc) {
        this.fbzlMc = fbzlMc;
    }

    public String getBslxDm() {
        return this.bslxDm;
    }

    public void setBslxDm(String bslxDm) {
        this.bslxDm = bslxDm;
    }

    public String getYscbz() {
        return this.yscbz;
    }

    public void setYscbz(String yscbz) {
        this.yscbz = yscbz;
    }
}

