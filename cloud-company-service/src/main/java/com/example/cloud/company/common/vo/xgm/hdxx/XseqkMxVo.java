package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "XseqkMxVo",
        propOrder = {"lc", "bnbhsxse", "bnkce", "bnyssr", "bnjmje", "yysbnynse", "bnsntqyyse"}
)
public class XseqkMxVo {
    @XmlElement(
            name = "LC",
            required = true
    )
    protected String lc = "";
    @XmlElement(
            name = "BNBHSXSE"
    )
    protected double bnbhsxse;
    @XmlElement(
            name = "BNKCE"
    )
    protected double bnkce;
    @XmlElement(
            name = "BNYSSR"
    )
    protected double bnyssr;
    @XmlElement(
            name = "BNJMJE"
    )
    protected double bnjmje;
    @XmlElement(
            name = "YYSBNYNSE"
    )
    protected double yysbnynse;
    @XmlElement(
            name = "BNSNTQYYSE"
    )
    protected double bnsntqyyse;

    public XseqkMxVo() {
    }

    public String getLC() {
        return this.lc;
    }

    public void setLC(String value) {
        this.lc = value;
    }

    public double getBNBHSXSE() {
        return this.bnbhsxse;
    }

    public void setBNBHSXSE(double value) {
        this.bnbhsxse = value;
    }

    public double getBNKCE() {
        return this.bnkce;
    }

    public void setBNKCE(double value) {
        this.bnkce = value;
    }

    public double getBNYSSR() {
        return this.bnyssr;
    }

    public void setBNYSSR(double value) {
        this.bnyssr = value;
    }

    public double getBNJMJE() {
        return this.bnjmje;
    }

    public void setBNJMJE(double value) {
        this.bnjmje = value;
    }

    public double getYYSBNYNSE() {
        return this.yysbnynse;
    }

    public void setYYSBNYNSE(double value) {
        this.yysbnynse = value;
    }

    public double getBNSNTQYYSE() {
        return this.bnsntqyyse;
    }

    public void setBNSNTQYYSE(double value) {
        this.bnsntqyyse = value;
    }
}

