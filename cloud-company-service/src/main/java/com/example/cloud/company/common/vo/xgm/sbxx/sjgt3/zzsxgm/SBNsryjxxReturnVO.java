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
 * 纳税人预缴信息返回VO
 *
 * <p>Java class for SBNsryjxxReturnVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SBNsryjxxReturnVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zsxmDm" type="{http://www.chinatax.gov.cn/dataspec/}zsxmDm"/>
 *         &lt;element name="sksxDm" type="{http://www.chinatax.gov.cn/dataspec/}sksxDm"/>
 *         &lt;element name="skssqq" type="{http://www.chinatax.gov.cn/dataspec/}skssqq"/>
 *         &lt;element name="yjskuuid" type="{http://www.chinatax.gov.cn/dataspec/}yjskuuid"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="yjze" type="{http://www.chinatax.gov.cn/dataspec/}yjze"/>
 *         &lt;element name="hyDm" type="{http://www.chinatax.gov.cn/dataspec/}hyDm"/>
 *         &lt;element name="zspmDm" type="{http://www.chinatax.gov.cn/dataspec/}zspmDm"/>
 *         &lt;element name="pzxh" type="{http://www.chinatax.gov.cn/dataspec/}pzxh"/>
 *         &lt;element name="pzzlDm" type="{http://www.chinatax.gov.cn/dataspec/}pzzlDm"/>
 *         &lt;element name="skssqz" type="{http://www.chinatax.gov.cn/dataspec/}skssqz"/>
 *         &lt;element name="yjye1" type="{http://www.chinatax.gov.cn/dataspec/}yjye1"/>
 *         &lt;element name="sphm" type="{http://www.chinatax.gov.cn/dataspec/}sphm"/>
 *         &lt;element name="pzzgDm" type="{http://www.chinatax.gov.cn/dataspec/}pzzgDm"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="zgswskfjDm" type="{http://www.chinatax.gov.cn/dataspec/}zgswskfjDm"/>
 *         &lt;element name="pzhm" type="{http://www.chinatax.gov.cn/dataspec/}pzhm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBNsryjxxReturnVO", propOrder = {
    "zsxmDm",
    "sksxDm",
    "skssqq",
    "yjskuuid",
    "djxh",
    "yjze",
    "hyDm",
    "zspmDm",
    "pzxh",
    "pzzlDm",
    "skssqz",
    "yjye1",
    "sphm",
    "pzzgDm",
    "sjgsdq",
    "zgswskfjDm",
    "pzhm"
})
public class SBNsryjxxReturnVO {

    @XmlElement(required = true)
    protected String zsxmDm;
    @XmlElement(required = true)
    protected String sksxDm;
    @XmlElement(required = true)
    protected String skssqq;
    @XmlElement(required = true)
    protected String yjskuuid;
    @XmlElement(required = true)
    protected String djxh;
    protected double yjze;
    @XmlElement(required = true)
    protected String hyDm;
    @XmlElement(required = true)
    protected String zspmDm;
    @XmlElement(required = true)
    protected String pzxh;
    @XmlElement(required = true)
    protected String pzzlDm;
    @XmlElement(required = true)
    protected String skssqz;
    protected double yjye1;
    @XmlElement(required = true)
    protected String sphm;
    @XmlElement(required = true)
    protected String pzzgDm;
    @XmlElement(required = true)
    protected String sjgsdq;
    @XmlElement(required = true)
    protected String zgswskfjDm;
    @XmlElement(required = true)
    protected String pzhm;

    /**
     * Gets the value of the zsxmDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZsxmDm() {
        return zsxmDm;
    }

    /**
     * Sets the value of the zsxmDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZsxmDm(String value) {
        this.zsxmDm = value;
    }

    /**
     * Gets the value of the sksxDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSksxDm() {
        return sksxDm;
    }

    /**
     * Sets the value of the sksxDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSksxDm(String value) {
        this.sksxDm = value;
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
     * Gets the value of the yjskuuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYjskuuid() {
        return yjskuuid;
    }

    /**
     * Sets the value of the yjskuuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYjskuuid(String value) {
        this.yjskuuid = value;
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

    /**
     * Gets the value of the yjze property.
     *
     */
    public double getYjze() {
        return yjze;
    }

    /**
     * Sets the value of the yjze property.
     *
     */
    public void setYjze(double value) {
        this.yjze = value;
    }

    /**
     * Gets the value of the hyDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHyDm() {
        return hyDm;
    }

    /**
     * Sets the value of the hyDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHyDm(String value) {
        this.hyDm = value;
    }

    /**
     * Gets the value of the zspmDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZspmDm() {
        return zspmDm;
    }

    /**
     * Sets the value of the zspmDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZspmDm(String value) {
        this.zspmDm = value;
    }

    /**
     * Gets the value of the pzxh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPzxh() {
        return pzxh;
    }

    /**
     * Sets the value of the pzxh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPzxh(String value) {
        this.pzxh = value;
    }

    /**
     * Gets the value of the pzzlDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPzzlDm() {
        return pzzlDm;
    }

    /**
     * Sets the value of the pzzlDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPzzlDm(String value) {
        this.pzzlDm = value;
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
     * Gets the value of the yjye1 property.
     *
     */
    public double getYjye1() {
        return yjye1;
    }

    /**
     * Sets the value of the yjye1 property.
     *
     */
    public void setYjye1(double value) {
        this.yjye1 = value;
    }

    /**
     * Gets the value of the sphm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSphm() {
        return sphm;
    }

    /**
     * Sets the value of the sphm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSphm(String value) {
        this.sphm = value;
    }

    /**
     * Gets the value of the pzzgDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPzzgDm() {
        return pzzgDm;
    }

    /**
     * Sets the value of the pzzgDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPzzgDm(String value) {
        this.pzzgDm = value;
    }

    /**
     * Gets the value of the sjgsdq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSjgsdq() {
        return sjgsdq;
    }

    /**
     * Sets the value of the sjgsdq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSjgsdq(String value) {
        this.sjgsdq = value;
    }

    /**
     * Gets the value of the zgswskfjDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZgswskfjDm() {
        return zgswskfjDm;
    }

    /**
     * Sets the value of the zgswskfjDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZgswskfjDm(String value) {
        this.zgswskfjDm = value;
    }

    /**
     * Gets the value of the pzhm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPzhm() {
        return pzhm;
    }

    /**
     * Sets the value of the pzhm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPzhm(String value) {
        this.pzhm = value;
    }

}