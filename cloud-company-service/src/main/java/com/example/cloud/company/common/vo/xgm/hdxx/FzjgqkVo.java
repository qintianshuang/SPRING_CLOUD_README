package com.example.cloud.company.common.vo.xgm.hdxx;

import com.example.cloud.company.common.build.xgm.qcxml.ArithUtil;
import com.example.cloud.company.common.build.xgm.qcxml.StringToTwoDecimalAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FzjgqkVo",
        propOrder = {"fzjgdjxh", "fzjgnsrsbh", "fzjgmc", "yysr", "zgxc", "zcze", "fpbl", "fpsdse", "fzjglxlb"}
)
public class FzjgqkVo {
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
            name = "FZJGMC",
            required = true
    )
    protected String fzjgmc = "";
    @XmlElement(
            name = "YYSR"
    )
    @XmlJavaTypeAdapter(StringToTwoDecimalAdapter.class)
    protected String yysr;
    @XmlElement(
            name = "ZGXC"
    )
    @XmlJavaTypeAdapter(StringToTwoDecimalAdapter.class)
    protected String zgxc;
    @XmlElement(
            name = "ZCZE"
    )
    @XmlJavaTypeAdapter(StringToTwoDecimalAdapter.class)
    protected String zcze;
    @XmlElement(
            name = "FPBL"
    )
    protected String fpbl;
    @XmlElement(
            name = "FPSDSE"
    )
    protected String fpsdse;
    @XmlElement(
            name = "FZJGLXLB"
    )
    protected String fzjglxlb;

    public FzjgqkVo() {
    }

    public String getFzjglxlb() {
        return this.fzjglxlb;
    }

    public void setFzjglxlb(String fzjglxlb) {
        this.fzjglxlb = fzjglxlb;
    }

    public String getFzjgdjxh() {
        return this.fzjgdjxh;
    }

    public void setFzjgdjxh(String fzjgdjxh) {
        this.fzjgdjxh = fzjgdjxh;
    }

    public String getFzjgnsrsbh() {
        return this.fzjgnsrsbh;
    }

    public void setFzjgnsrsbh(String value) {
        this.fzjgnsrsbh = value;
    }

    public String getFzjgmc() {
        return this.fzjgmc;
    }

    public void setFzjgmc(String value) {
        this.fzjgmc = value;
    }

    public String getYysr() {
        return this.yysr;
    }

    public void setYysr(String value) {
        boolean flag = false;
        flag = ArithUtil.isENnum(value);
        if (flag) {
            BigDecimal b = new BigDecimal(value);
            b = b.setScale(2, 4);
            this.yysr = b.toPlainString();
        } else {
            this.yysr = value;
        }
    }

    public String getZgxc() {
        return this.zgxc;
    }

    public void setZgxc(String value) {
        boolean flag = false;
        flag = ArithUtil.isENnum(value);
        if (flag) {
            BigDecimal b = new BigDecimal(value);
            b = b.setScale(2, 4);
            this.zgxc = b.toPlainString();
        } else {
            this.zgxc = value;
        }
    }

    public String getZcze() {
        return this.zcze;
    }

    public void setZcze(String value) {
        boolean flag = false;
        flag = ArithUtil.isENnum(value);
        if (flag) {
            BigDecimal b = new BigDecimal(value);
            b = b.setScale(2, 4);
            this.zcze = b.toPlainString();
        } else {
            this.zcze = value;
        }
    }

    public String getFpbl() {
        return this.fpbl;
    }

    public void setFpbl(String value) {
        this.fpbl = value;
    }

    public String getFpsdse() {
        return this.fpsdse;
    }

    public void setFpsdse(String value) {
        this.fpsdse = value;
    }
}
