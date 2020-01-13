package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "fcsjmxxGridlbVO",
        propOrder = {"uuid", "ysuuid", "jmmj", "yjmsje1", "jmsxmmc1", "ssjmxzDm", "jmfsDm", "jmsl", "yxqq", "yxqz", "yxbz", "jmqxq", "jmqxz", "jmszjsr", "jmed", "jmfd", "jmzlxDm", "jmslxDm", "jmsfcyz", "swsxDm"}
)
public class FcsjmxxGridlbVO {
    @XmlElement(
            required = true
    )
    protected String uuid;
    @XmlElement(
            required = true
    )
    protected String ysuuid;
    protected double jmmj;
    protected double yjmsje1;
    @XmlElement(
            required = true
    )
    protected String jmsxmmc1;
    @XmlElement(
            required = true
    )
    protected String ssjmxzDm;
    @XmlElement(
            required = true
    )
    protected String jmfsDm;
    protected double jmsl;
    @XmlElement(
            required = true
    )
    protected String yxqq;
    @XmlElement(
            required = true
    )
    protected String yxqz;
    @XmlElement(
            required = true
    )
    protected String yxbz;
    @XmlElement(
            required = true
    )
    protected String jmqxq;
    @XmlElement(
            required = true
    )
    protected String jmqxz;
    protected double jmszjsr;
    protected double jmed;
    protected double jmfd;
    @XmlElement(
            required = true
    )
    protected String jmzlxDm;
    @XmlElement(
            required = true
    )
    protected String jmslxDm;
    protected double jmsfcyz;
    protected String swsxDm;

    public FcsjmxxGridlbVO() {
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String value) {
        this.uuid = value;
    }

    public String getYsuuid() {
        return this.ysuuid;
    }

    public void setYsuuid(String value) {
        this.ysuuid = value;
    }

    public double getJmmj() {
        return this.jmmj;
    }

    public void setJmmj(double value) {
        this.jmmj = value;
    }

    public double getYjmsje1() {
        return this.yjmsje1;
    }

    public void setYjmsje1(double value) {
        this.yjmsje1 = value;
    }

    public String getJmsxmmc1() {
        return this.jmsxmmc1;
    }

    public void setJmsxmmc1(String value) {
        this.jmsxmmc1 = value;
    }

    public String getSsjmxzDm() {
        return this.ssjmxzDm;
    }

    public void setSsjmxzDm(String value) {
        this.ssjmxzDm = value;
    }

    public String getJmfsDm() {
        return this.jmfsDm;
    }

    public void setJmfsDm(String value) {
        this.jmfsDm = value;
    }

    public double getJmsl() {
        return this.jmsl;
    }

    public void setJmsl(double value) {
        this.jmsl = value;
    }

    public String getYxqq() {
        return this.yxqq;
    }

    public void setYxqq(String value) {
        this.yxqq = value;
    }

    public String getYxqz() {
        return this.yxqz;
    }

    public void setYxqz(String value) {
        this.yxqz = value;
    }

    public String getYxbz() {
        return this.yxbz;
    }

    public void setYxbz(String value) {
        this.yxbz = value;
    }

    public String getJmqxq() {
        return this.jmqxq;
    }

    public void setJmqxq(String value) {
        this.jmqxq = value;
    }

    public String getJmqxz() {
        return this.jmqxz;
    }

    public void setJmqxz(String value) {
        this.jmqxz = value;
    }

    public double getJmszjsr() {
        return this.jmszjsr;
    }

    public void setJmszjsr(double value) {
        this.jmszjsr = value;
    }

    public double getJmed() {
        return this.jmed;
    }

    public void setJmed(double value) {
        this.jmed = value;
    }

    public double getJmfd() {
        return this.jmfd;
    }

    public void setJmfd(double value) {
        this.jmfd = value;
    }

    public String getJmzlxDm() {
        return this.jmzlxDm;
    }

    public void setJmzlxDm(String value) {
        this.jmzlxDm = value;
    }

    public String getJmslxDm() {
        return this.jmslxDm;
    }

    public void setJmslxDm(String value) {
        this.jmslxDm = value;
    }

    public double getJmsfcyz() {
        return this.jmsfcyz;
    }

    public void setJmsfcyz(double value) {
        this.jmsfcyz = value;
    }

    public String getSwsxDm() {
        return this.swsxDm;
    }

    public void setSwsxDm(String value) {
        this.swsxDm = value;
    }
}
