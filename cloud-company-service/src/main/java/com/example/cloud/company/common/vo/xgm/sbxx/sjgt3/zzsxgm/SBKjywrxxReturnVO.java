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
 * 扣缴义务人信息返回VO
 *
 * <p>Java class for SBKjywrxxReturnVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SBKjywrxxReturnVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kjywrsbh" type="{http://www.chinatax.gov.cn/dataspec/}kjywrsbh"/>
 *         &lt;element name="kjywrmc" type="{http://www.chinatax.gov.cn/dataspec/}kjywrmc"/>
 *         &lt;element name="kjywrywmc" type="{http://www.chinatax.gov.cn/dataspec/}kjywrywmc"/>
 *         &lt;element name="kjywrzcdz" type="{http://www.chinatax.gov.cn/dataspec/}kjywrzcdz"/>
 *         &lt;element name="kjywrywdz" type="{http://www.chinatax.gov.cn/dataspec/}kjywrywdz"/>
 *         &lt;element name="kjywrJjlxDm" type="{http://www.chinatax.gov.cn/dataspec/}kjywrJjlxDm"/>
 *         &lt;element name="kjywrJjlxmc" type="{http://www.chinatax.gov.cn/dataspec/}kjywrJjlxmc"/>
 *         &lt;element name="kjywrjjhyflDm" type="{http://www.chinatax.gov.cn/dataspec/}kjywrjjhyflDm"/>
 *         &lt;element name="kjywrjjhyflmc" type="{http://www.chinatax.gov.cn/dataspec/}kjywrjjhyflmc"/>
 *         &lt;element name="kjywrlxrxm" type="{http://www.chinatax.gov.cn/dataspec/}kjywrlxrxm"/>
 *         &lt;element name="kjywrlxdh" type="{http://www.chinatax.gov.cn/dataspec/}kjywrlxdh"/>
 *         &lt;element name="kjywryzbm" type="{http://www.chinatax.gov.cn/dataspec/}kjywryzbm"/>
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
@XmlType(name = "SBKjywrxxReturnVO", propOrder = {
    "kjywrsbh",
    "kjywrmc",
    "kjywrywmc",
    "kjywrzcdz",
    "kjywrywdz",
    "kjywrJjlxDm",
    "kjywrJjlxmc",
    "kjywrjjhyflDm",
    "kjywrjjhyflmc",
    "kjywrlxrxm",
    "kjywrlxdh",
    "kjywryzbm",
    "djxh"
})
public class SBKjywrxxReturnVO {

    @XmlElement(required = true, nillable = true)
    protected String kjywrsbh;
    @XmlElement(required = true, nillable = true)
    protected String kjywrmc;
    @XmlElement(required = true, nillable = true)
    protected String kjywrywmc;
    @XmlElement(required = true, nillable = true)
    protected String kjywrzcdz;
    @XmlElement(required = true, nillable = true)
    protected String kjywrywdz;
    @XmlElement(required = true, nillable = true)
    protected String kjywrJjlxDm;
    @XmlElement(required = true, nillable = true)
    protected String kjywrJjlxmc;
    @XmlElement(required = true, nillable = true)
    protected String kjywrjjhyflDm;
    @XmlElement(required = true, nillable = true)
    protected String kjywrjjhyflmc;
    @XmlElement(required = true, nillable = true)
    protected String kjywrlxrxm;
    @XmlElement(required = true, nillable = true)
    protected String kjywrlxdh;
    @XmlElement(required = true, nillable = true)
    protected String kjywryzbm;
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
     * Gets the value of the kjywrmc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrmc() {
        return kjywrmc;
    }

    /**
     * Sets the value of the kjywrmc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrmc(String value) {
        this.kjywrmc = value;
    }

    /**
     * Gets the value of the kjywrywmc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrywmc() {
        return kjywrywmc;
    }

    /**
     * Sets the value of the kjywrywmc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrywmc(String value) {
        this.kjywrywmc = value;
    }

    /**
     * Gets the value of the kjywrzcdz property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrzcdz() {
        return kjywrzcdz;
    }

    /**
     * Sets the value of the kjywrzcdz property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrzcdz(String value) {
        this.kjywrzcdz = value;
    }

    /**
     * Gets the value of the kjywrywdz property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrywdz() {
        return kjywrywdz;
    }

    /**
     * Sets the value of the kjywrywdz property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrywdz(String value) {
        this.kjywrywdz = value;
    }

    /**
     * Gets the value of the kjywrJjlxDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrJjlxDm() {
        return kjywrJjlxDm;
    }

    /**
     * Sets the value of the kjywrJjlxDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrJjlxDm(String value) {
        this.kjywrJjlxDm = value;
    }

    /**
     * Gets the value of the kjywrJjlxmc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrJjlxmc() {
        return kjywrJjlxmc;
    }

    /**
     * Sets the value of the kjywrJjlxmc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrJjlxmc(String value) {
        this.kjywrJjlxmc = value;
    }

    /**
     * Gets the value of the kjywrjjhyflDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrjjhyflDm() {
        return kjywrjjhyflDm;
    }

    /**
     * Sets the value of the kjywrjjhyflDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrjjhyflDm(String value) {
        this.kjywrjjhyflDm = value;
    }

    /**
     * Gets the value of the kjywrjjhyflmc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrjjhyflmc() {
        return kjywrjjhyflmc;
    }

    /**
     * Sets the value of the kjywrjjhyflmc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrjjhyflmc(String value) {
        this.kjywrjjhyflmc = value;
    }

    /**
     * Gets the value of the kjywrlxrxm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrlxrxm() {
        return kjywrlxrxm;
    }

    /**
     * Sets the value of the kjywrlxrxm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrlxrxm(String value) {
        this.kjywrlxrxm = value;
    }

    /**
     * Gets the value of the kjywrlxdh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywrlxdh() {
        return kjywrlxdh;
    }

    /**
     * Sets the value of the kjywrlxdh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywrlxdh(String value) {
        this.kjywrlxdh = value;
    }

    /**
     * Gets the value of the kjywryzbm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKjywryzbm() {
        return kjywryzbm;
    }

    /**
     * Sets the value of the kjywryzbm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKjywryzbm(String value) {
        this.kjywryzbm = value;
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
