package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "fcsjmxxGrid",
        propOrder = {"fybh", "jmsfcyz", "jsbl", "ssjmxzdm", "jmsxmmc1", "yjmsje1", "jmszjsr", "sl", "fcsjmxxGridlbVO", "fcscjjmxxGridlb", "fcsczjmxxGridlb"}
)
public class FcsjmxxGrid {
    @XmlElement(
            required = true
    )
    protected List<FcsjmxxGridlbVO> fcsjmxxGridlbVO;
    protected List<FcscjjmxxGridlb> fcscjjmxxGridlb;
    protected List<FcsczjmxxGridlb> fcsczjmxxGridlb;
    protected String fybh;
    protected double jmsfcyz;
    protected double jsbl;
    protected String ssjmxzdm;
    protected String jmsxmmc1;
    protected double yjmsje1;
    protected double jmszjsr;
    protected double sl;

    public FcsjmxxGrid() {
    }

    public double getJmszjsr() {
        return this.jmszjsr;
    }

    public void setJmszjsr(double jmszjsr) {
        this.jmszjsr = jmszjsr;
    }

    public String getFybh() {
        return this.fybh;
    }

    public double getSl() {
        return this.sl;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }

    public void setFybh(String fybh) {
        this.fybh = fybh;
    }

    public double getJmsfcyz() {
        return this.jmsfcyz;
    }

    public void setJmsfcyz(double jmsfcyz) {
        this.jmsfcyz = jmsfcyz;
    }

    public double getJsbl() {
        return this.jsbl;
    }

    public void setJsbl(double jsbl) {
        this.jsbl = jsbl;
    }

    public String getSsjmxzdm() {
        return this.ssjmxzdm;
    }

    public void setSsjmxzdm(String ssjmxzdm) {
        this.ssjmxzdm = ssjmxzdm;
    }

    public String getJmsxmmc1() {
        return this.jmsxmmc1;
    }

    public void setJmsxmmc1(String jmsxmmc1) {
        this.jmsxmmc1 = jmsxmmc1;
    }

    public double getYjmsje1() {
        return this.yjmsje1;
    }

    public void setYjmsje1(double yjmsje1) {
        this.yjmsje1 = yjmsje1;
    }

    public List<FcscjjmxxGridlb> getFcscjjmxxGridlb() {
        if (this.fcscjjmxxGridlb == null) {
            this.fcscjjmxxGridlb = new ArrayList();
        }

        return this.fcscjjmxxGridlb;
    }

    public void setFcscjjmxxGridlb(List<FcscjjmxxGridlb> fcscjjmxxGridlb) {
        this.fcscjjmxxGridlb = fcscjjmxxGridlb;
    }

    public List<FcsczjmxxGridlb> getFcsczjmxxGridlb() {
        if (this.fcsczjmxxGridlb == null) {
            this.fcsczjmxxGridlb = new ArrayList();
        }

        return this.fcsczjmxxGridlb;
    }

    public void setFcsczjmxxGridlb(List<FcsczjmxxGridlb> fcsczjmxxGridlb) {
        this.fcsczjmxxGridlb = fcsczjmxxGridlb;
    }

    public List<FcsjmxxGridlbVO> getFcsjmxxGridlbVO() {
        if (this.fcsjmxxGridlbVO == null) {
            this.fcsjmxxGridlbVO = new ArrayList();
        }

        return this.fcsjmxxGridlbVO;
    }
}

