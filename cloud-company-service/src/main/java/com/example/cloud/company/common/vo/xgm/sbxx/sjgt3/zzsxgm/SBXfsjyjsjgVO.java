//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.08.28 at 06:10:39 PM CST
//


package com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 消费税卷烟计税价格信息VO
 *
 * <p>Java class for SBXfsjyjsjgVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SBXfsjyjsjgVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jytbzsptm" type="{http://www.chinatax.gov.cn/dataspec/}jytbzsptm"/>
 *         &lt;element name="jyphgg" type="{http://www.chinatax.gov.cn/dataspec/}jyphgg"/>
 *         &lt;element name="jylbDm1" type="{http://www.chinatax.gov.cn/dataspec/}jylbDm1"/>
 *         &lt;element name="jylxDm1" type="{http://www.chinatax.gov.cn/dataspec/}jylxDm1"/>
 *         &lt;element name="xssl" type="{http://www.chinatax.gov.cn/dataspec/}xssl"/>
 *         &lt;element name="xse" type="{http://www.chinatax.gov.cn/dataspec/}xse"/>
 *         &lt;element name="pfhjxsjg" type="{http://www.chinatax.gov.cn/dataspec/}pfhjxsjg"/>
 *         &lt;element name="sypfmll" type="{http://www.chinatax.gov.cn/dataspec/}sypfmll"/>
 *         &lt;element name="xfssysl" type="{http://www.chinatax.gov.cn/dataspec/}xfssysl"/>
 *         &lt;element name="hzdxfsjsjg" type="{http://www.chinatax.gov.cn/dataspec/}hzdxfsjsjg"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBXfsjyjsjgVO", propOrder = {
    "jytbzsptm",
    "jyphgg",
    "jylbDm1",
    "jylxDm1",
    "xssl",
    "xse",
    "pfhjxsjg",
    "sypfmll",
    "xfssysl",
    "hzdxfsjsjg"
})
public class SBXfsjyjsjgVO {

    @XmlElement(required = true)
    protected String jytbzsptm;
    @XmlElement(required = true)
    protected String jyphgg;
    @XmlElement(required = true)
    protected String jylbDm1;
    @XmlElement(required = true)
    protected String jylxDm1;
    protected double xssl;
    protected double xse;
    protected double pfhjxsjg;
    protected double sypfmll;
    protected double xfssysl;
    protected double hzdxfsjsjg;

    /**
     * Gets the value of the jytbzsptm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJytbzsptm() {
        return jytbzsptm;
    }

    /**
     * Sets the value of the jytbzsptm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJytbzsptm(String value) {
        this.jytbzsptm = value;
    }

    /**
     * Gets the value of the jyphgg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJyphgg() {
        return jyphgg;
    }

    /**
     * Sets the value of the jyphgg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJyphgg(String value) {
        this.jyphgg = value;
    }

    /**
     * Gets the value of the jylbDm1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJylbDm1() {
        return jylbDm1;
    }

    /**
     * Sets the value of the jylbDm1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJylbDm1(String value) {
        this.jylbDm1 = value;
    }

    /**
     * Gets the value of the jylxDm1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJylxDm1() {
        return jylxDm1;
    }

    /**
     * Sets the value of the jylxDm1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJylxDm1(String value) {
        this.jylxDm1 = value;
    }

    /**
     * Gets the value of the xssl property.
     *
     */
    public double getXssl() {
        return xssl;
    }

    /**
     * Sets the value of the xssl property.
     *
     */
    public void setXssl(double value) {
        this.xssl = value;
    }

    /**
     * Gets the value of the xse property.
     *
     */
    public double getXse() {
        return xse;
    }

    /**
     * Sets the value of the xse property.
     *
     */
    public void setXse(double value) {
        this.xse = value;
    }

    /**
     * Gets the value of the pfhjxsjg property.
     *
     */
    public double getPfhjxsjg() {
        return pfhjxsjg;
    }

    /**
     * Sets the value of the pfhjxsjg property.
     *
     */
    public void setPfhjxsjg(double value) {
        this.pfhjxsjg = value;
    }

    /**
     * Gets the value of the sypfmll property.
     *
     */
    public double getSypfmll() {
        return sypfmll;
    }

    /**
     * Sets the value of the sypfmll property.
     *
     */
    public void setSypfmll(double value) {
        this.sypfmll = value;
    }

    /**
     * Gets the value of the xfssysl property.
     *
     */
    public double getXfssysl() {
        return xfssysl;
    }

    /**
     * Sets the value of the xfssysl property.
     *
     */
    public void setXfssysl(double value) {
        this.xfssysl = value;
    }

    /**
     * Gets the value of the hzdxfsjsjg property.
     *
     */
    public double getHzdxfsjsjg() {
        return hzdxfsjsjg;
    }

    /**
     * Sets the value of the hzdxfsjsjg property.
     *
     */
    public void setHzdxfsjsjg(double value) {
        this.hzdxfsjsjg = value;
    }

}