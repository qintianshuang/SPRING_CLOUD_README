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
 * 纳税人重点税源监控标志信息返回VO
 *
 * <p>Java class for SBNsrzdsyjkbzxxReturnVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SBNsrzdsyjkbzxxReturnVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}nsrsbh"/>
 *         &lt;element name="nsrmc" type="{http://www.chinatax.gov.cn/dataspec/}nsrmc"/>
 *         &lt;element name="yxqq" type="{http://www.chinatax.gov.cn/dataspec/}yxqq"/>
 *         &lt;element name="yxqz" type="{http://www.chinatax.gov.cn/dataspec/}yxqz"/>
 *         &lt;element name="dzssjkbz" type="{http://www.chinatax.gov.cn/dataspec/}bz"/>
 *         &lt;element name="pzrdrq" type="{http://www.chinatax.gov.cn/dataspec/}rdrq"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBNsrzdsyjkbzxxReturnVO", propOrder = {
    "nsrsbh",
    "nsrmc",
    "yxqq",
    "yxqz",
    "dzssjkbz",
    "pzrdrq",
    "djxh"
})
public class SBNsrzdsyjkbzxxReturnVO {

    @XmlElement(required = true, nillable = true)
    protected String nsrsbh;
    @XmlElement(required = true, nillable = true)
    protected String nsrmc;
    @XmlElement(required = true, nillable = true)
    protected String yxqq;
    @XmlElement(required = true, nillable = true)
    protected String yxqz;
    @XmlElement(required = true, nillable = true)
    protected String dzssjkbz;
    @XmlElement(required = true, nillable = true)
    protected String pzrdrq;
    @XmlElement(required = true, nillable = true)
    protected String djxh;

    /**
     * Gets the value of the nsrsbh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNsrsbh() {
        return nsrsbh;
    }

    /**
     * Sets the value of the nsrsbh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNsrsbh(String value) {
        this.nsrsbh = value;
    }

    /**
     * Gets the value of the nsrmc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNsrmc() {
        return nsrmc;
    }

    /**
     * Sets the value of the nsrmc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNsrmc(String value) {
        this.nsrmc = value;
    }

    /**
     * Gets the value of the yxqq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYxqq() {
        return yxqq;
    }

    /**
     * Sets the value of the yxqq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYxqq(String value) {
        this.yxqq = value;
    }

    /**
     * Gets the value of the yxqz property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYxqz() {
        return yxqz;
    }

    /**
     * Sets the value of the yxqz property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYxqz(String value) {
        this.yxqz = value;
    }

    /**
     * Gets the value of the dzssjkbz property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDzssjkbz() {
        return dzssjkbz;
    }

    /**
     * Sets the value of the dzssjkbz property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDzssjkbz(String value) {
        this.dzssjkbz = value;
    }

    /**
     * Gets the value of the pzrdrq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPzrdrq() {
        return pzrdrq;
    }

    /**
     * Sets the value of the pzrdrq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPzrdrq(String value) {
        this.pzrdrq = value;
    }

    /**
     * Gets the value of the djxh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDjxh() {
        return djxh;
    }

    /**
     * Sets the value of the djxh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDjxh(String value) {
        this.djxh = value;
    }

}
