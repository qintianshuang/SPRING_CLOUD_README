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
 * 非居民企业合同项目备案信息查询VO
 *
 * <p>Java class for SBFjmqyhtxmbaxxQueryVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SBFjmqyhtxmbaxxQueryVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kjywrsbh" type="{http://www.chinatax.gov.cn/dataspec/}kjywrsbh"/>
 *         &lt;element name="skssqq" type="{http://www.chinatax.gov.cn/dataspec/}skssqq"/>
 *         &lt;element name="skssqz" type="{http://www.chinatax.gov.cn/dataspec/}skssqz"/>
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
@XmlType(name = "SBFjmqyhtxmbaxxQueryVO", propOrder = {
    "kjywrsbh",
    "skssqq",
    "skssqz",
    "djxh"
})
public class SBFjmqyhtxmbaxxQueryVO {

    @XmlElement(required = true, nillable = true)
    protected String kjywrsbh;
    @XmlElement(required = true, nillable = true)
    protected String skssqq;
    @XmlElement(required = true, nillable = true)
    protected String skssqz;
    @XmlElement(required = true, nillable = true)
    protected String djxh;

    /**
     * Gets the value of the kjywrsbh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrsbh() {
        return kjywrsbh;
    }

    /**
     * Sets the value of the kjywrsbh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrsbh(String value) {
        this.kjywrsbh = value;
    }

    /**
     * Gets the value of the skssqq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSkssqq() {
        return skssqq;
    }

    /**
     * Sets the value of the skssqq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSkssqq(String value) {
        this.skssqq = value;
    }

    /**
     * Gets the value of the skssqz property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSkssqz() {
        return skssqz;
    }

    /**
     * Sets the value of the skssqz property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSkssqz(String value) {
        this.skssqz = value;
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