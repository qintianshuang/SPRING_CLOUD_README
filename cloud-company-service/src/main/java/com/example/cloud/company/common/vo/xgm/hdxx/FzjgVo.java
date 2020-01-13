package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FzjgVo",
        propOrder = {"fzjgdjxh", "fzjgnsrsbh", "fzjgnsrmc", "fzjglxlb", "yysr", "zgxc", "zcze", "cbfye", "xzqh"}
)
public class FzjgVo {
    @XmlElement(
            name = "FZJGDJXH",
            required = true
    )
    protected String fzjgdjxh = "";
    @XmlElement(
            name = "FZJGNSRSBH",
            required = true
    )
    protected String fzjgnsrsbh = "";
    @XmlElement(
            name = "FZJGNSRMC",
            required = true
    )
    protected String fzjgnsrmc = "";
    @XmlElement(
            name = "FZJGLXLB",
            required = true
    )
    protected String fzjglxlb = "";
    @XmlElement(
            name = "YYSR",
            required = true
    )
    protected String yysr = "";
    @XmlElement(
            name = "ZGXC",
            required = true
    )
    protected String zgxc = "";
    @XmlElement(
            name = "ZCZE",
            required = true
    )
    protected String zcze = "";
    @XmlElement(
            name = "CBFYE",
            required = true
    )
    private String cbfye = "";
    @XmlElement(
            name = "XZQH",
            required = true
    )
    private String xzqh = "";

    public FzjgVo() {
    }

    public String getFZJGDJXH() {
        return this.fzjgdjxh;
    }

    public void setFZJGDJXH(String value) {
        this.fzjgdjxh = value;
    }

    public String getFZJGNSRSBH() {
        return this.fzjgnsrsbh;
    }

    public void setFZJGNSRSBH(String value) {
        this.fzjgnsrsbh = value;
    }

    public String getFZJGNSRMC() {
        return this.fzjgnsrmc;
    }

    public void setFZJGNSRMC(String value) {
        this.fzjgnsrmc = value;
    }

    public String getFZJGLXLB() {
        return this.fzjglxlb;
    }

    public void setFZJGLXLB(String value) {
        this.fzjglxlb = value;
    }

    public String getYysr() {
        return this.yysr;
    }

    public void setYysr(String yysr) {
        this.yysr = yysr;
    }

    public String getZgxc() {
        return this.zgxc;
    }

    public void setZgxc(String zgxc) {
        this.zgxc = zgxc;
    }

    public String getZcze() {
        return this.zcze;
    }

    public void setZcze(String zcze) {
        this.zcze = zcze;
    }

    public String getCbfye() {
        return this.cbfye;
    }

    public void setCbfye(String cbfye) {
        this.cbfye = cbfye;
    }

    public String getXzqh() {
        return this.xzqh;
    }

    public void setXzqh(String xzqh) {
        this.xzqh = xzqh;
    }
}

