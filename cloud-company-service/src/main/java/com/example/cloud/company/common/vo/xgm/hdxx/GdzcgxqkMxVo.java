package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GdzcgxqkMxVo",
        propOrder = {"lc", "bnbnlj", "snbnlj"}
)
public class GdzcgxqkMxVo {
    @XmlElement(
            name = "LC",
            required = true
    )
    protected String lc = "";
    @XmlElement(
            name = "BNBNLJ"
    )
    protected double bnbnlj;
    @XmlElement(
            name = "SNBNLJ"
    )
    protected double snbnlj;

    public GdzcgxqkMxVo() {
    }

    public String getLC() {
        return this.lc;
    }

    public void setLC(String value) {
        this.lc = value;
    }

    public double getBNBNLJ() {
        return this.bnbnlj;
    }

    public void setBNBNLJ(double value) {
        this.bnbnlj = value;
    }

    public double getSNBNLJ() {
        return this.snbnlj;
    }

    public void setSNBNLJ(double value) {
        this.snbnlj = value;
    }
}

