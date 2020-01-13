package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "QyjxsedkqkMxVo",
        propOrder = {"lc", "bnljje"}
)
public class QyjxsedkqkMxVo {
    @XmlElement(
            name = "LC",
            required = true
    )
    protected String lc = "";
    @XmlElement(
            name = "BNLJJE"
    )
    protected double bnljje;

    public QyjxsedkqkMxVo() {
    }

    public String getLC() {
        return this.lc;
    }

    public void setLC(String value) {
        this.lc = value;
    }

    public double getBNLJJE() {
        return this.bnljje;
    }

    public void setBNLJJE(double value) {
        this.bnljje = value;
    }
}
