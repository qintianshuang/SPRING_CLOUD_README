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
 * 申报情况返回VO
 *
 * <p>Java class for SBsbqkReturnVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SBsbqkReturnVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="yzpzxh" type="{http://www.chinatax.gov.cn/dataspec/}yzpzxh"/>
 *         &lt;element name="yzpzzlDm" type="{http://www.chinatax.gov.cn/dataspec/}yzpzzlDm"/>
 *         &lt;element name="sbrq" type="{http://www.chinatax.gov.cn/dataspec/}sbrq"/>
 *         &lt;element name="ybtse" type="{http://www.chinatax.gov.cn/dataspec/}ybtse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBsbqkReturnVO", propOrder = {
    "yzpzxh",
    "yzpzzlDm",
    "sbrq",
    "ybtse"
})
public class SBsbqkReturnVO {

    @XmlElement(required = true, nillable = true)
    protected String yzpzxh;
    @XmlElement(required = true, nillable = true)
    protected String yzpzzlDm;
    @XmlElement(required = true, nillable = true)
    protected String sbrq;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double ybtse;

    /**
     * Gets the value of the yzpzxh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYzpzxh() {
        return yzpzxh;
    }

    /**
     * Sets the value of the yzpzxh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYzpzxh(String value) {
        this.yzpzxh = value;
    }

    /**
     * Gets the value of the yzpzzlDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYzpzzlDm() {
        return yzpzzlDm;
    }

    /**
     * Sets the value of the yzpzzlDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYzpzzlDm(String value) {
        this.yzpzzlDm = value;
    }

    /**
     * Gets the value of the sbrq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSbrq() {
        return sbrq;
    }

    /**
     * Sets the value of the sbrq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSbrq(String value) {
        this.sbrq = value;
    }

    /**
     * Gets the value of the ybtse property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getYbtse() {
        return ybtse;
    }

    /**
     * Sets the value of the ybtse property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setYbtse(Double value) {
        this.ybtse = value;
    }

}
