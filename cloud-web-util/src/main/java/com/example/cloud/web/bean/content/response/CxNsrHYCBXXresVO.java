//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.10 at 03:36:28 PM CST 
//


package com.example.cloud.web.bean.content.response;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}bz1"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_ptfpdz_fs"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_ptfpdz_cbje"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_ptfpdz_cbse"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_ptfpjs_fs"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_ptfpjs_cbje"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_ptfpjs_cbse"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_cbfs"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_cbje"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_cbse"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_rzfs"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_rzje"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_rzse"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_jdc_cbfs"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_jdc_cbje"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_jdc_cbse"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_jdc_rzfs"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_jdc_rzje"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_jdc_rzse"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_hzfs"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_hzje"/>
 *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}an_hyfp_hzse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bz1",
    "anPtfpdzFs",
    "anPtfpdzCbje",
    "anPtfpdzCbse",
    "anPtfpjsFs",
    "anPtfpjsCbje",
    "anPtfpjsCbse",
    "anHyfpCbfs",
    "anHyfpCbje",
    "anHyfpCbse",
    "anHyfpRzfs",
    "anHyfpRzje",
    "anHyfpRzse",
    "anJdcCbfs",
    "anJdcCbje",
    "anJdcCbse",
    "anJdcRzfs",
    "anJdcRzje",
    "anJdcRzse",
    "anHyfpHzfs",
    "anHyfpHzje",
    "anHyfpHzse"
})
@XmlRootElement(name = "cxNsrHYCBXXresVO")
public class CxNsrHYCBXXresVO {

    @XmlElement(required = true)
    protected String bz1;
    @XmlElement(name = "an_ptfpdz_fs", required = true)
    protected String anPtfpdzFs;
    @XmlElement(name = "an_ptfpdz_cbje", required = true)
    protected String anPtfpdzCbje;
    @XmlElement(name = "an_ptfpdz_cbse", required = true)
    protected String anPtfpdzCbse;
    @XmlElement(name = "an_ptfpjs_fs", required = true)
    protected String anPtfpjsFs;
    @XmlElement(name = "an_ptfpjs_cbje", required = true)
    protected String anPtfpjsCbje;
    @XmlElement(name = "an_ptfpjs_cbse", required = true)
    protected String anPtfpjsCbse;
    @XmlElement(name = "an_hyfp_cbfs", required = true)
    protected String anHyfpCbfs;
    @XmlElement(name = "an_hyfp_cbje", required = true)
    protected String anHyfpCbje;
    @XmlElement(name = "an_hyfp_cbse", required = true)
    protected String anHyfpCbse;
    @XmlElement(name = "an_hyfp_rzfs", required = true)
    protected String anHyfpRzfs;
    @XmlElement(name = "an_hyfp_rzje", required = true)
    protected String anHyfpRzje;
    @XmlElement(name = "an_hyfp_rzse", required = true)
    protected String anHyfpRzse;
    @XmlElement(name = "an_jdc_cbfs", required = true)
    protected String anJdcCbfs;
    @XmlElement(name = "an_jdc_cbje", required = true)
    protected String anJdcCbje;
    @XmlElement(name = "an_jdc_cbse", required = true)
    protected String anJdcCbse;
    @XmlElement(name = "an_jdc_rzfs", required = true)
    protected String anJdcRzfs;
    @XmlElement(name = "an_jdc_rzje", required = true)
    protected String anJdcRzje;
    @XmlElement(name = "an_jdc_rzse", required = true)
    protected String anJdcRzse;
    @XmlElement(name = "an_hyfp_hzfs", required = true)
    protected String anHyfpHzfs;
    @XmlElement(name = "an_hyfp_hzje", required = true)
    protected String anHyfpHzje;
    @XmlElement(name = "an_hyfp_hzse", required = true)
    protected String anHyfpHzse;

    /**
     * Gets the value of the bz1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBz1() {
        return bz1;
    }

    /**
     * Sets the value of the bz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBz1(String value) {
        this.bz1 = value;
    }

    /**
     * Gets the value of the anPtfpdzFs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnPtfpdzFs() {
        return anPtfpdzFs;
    }

    /**
     * Sets the value of the anPtfpdzFs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnPtfpdzFs(String value) {
        this.anPtfpdzFs = value;
    }

    /**
     * Gets the value of the anPtfpdzCbje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnPtfpdzCbje() {
        return anPtfpdzCbje;
    }

    /**
     * Sets the value of the anPtfpdzCbje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnPtfpdzCbje(String value) {
        this.anPtfpdzCbje = value;
    }

    /**
     * Gets the value of the anPtfpdzCbse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnPtfpdzCbse() {
        return anPtfpdzCbse;
    }

    /**
     * Sets the value of the anPtfpdzCbse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnPtfpdzCbse(String value) {
        this.anPtfpdzCbse = value;
    }

    /**
     * Gets the value of the anPtfpjsFs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnPtfpjsFs() {
        return anPtfpjsFs;
    }

    /**
     * Sets the value of the anPtfpjsFs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnPtfpjsFs(String value) {
        this.anPtfpjsFs = value;
    }

    /**
     * Gets the value of the anPtfpjsCbje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnPtfpjsCbje() {
        return anPtfpjsCbje;
    }

    /**
     * Sets the value of the anPtfpjsCbje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnPtfpjsCbje(String value) {
        this.anPtfpjsCbje = value;
    }

    /**
     * Gets the value of the anPtfpjsCbse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnPtfpjsCbse() {
        return anPtfpjsCbse;
    }

    /**
     * Sets the value of the anPtfpjsCbse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnPtfpjsCbse(String value) {
        this.anPtfpjsCbse = value;
    }

    /**
     * Gets the value of the anHyfpCbfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpCbfs() {
        return anHyfpCbfs;
    }

    /**
     * Sets the value of the anHyfpCbfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpCbfs(String value) {
        this.anHyfpCbfs = value;
    }

    /**
     * Gets the value of the anHyfpCbje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpCbje() {
        return anHyfpCbje;
    }

    /**
     * Sets the value of the anHyfpCbje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpCbje(String value) {
        this.anHyfpCbje = value;
    }

    /**
     * Gets the value of the anHyfpCbse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpCbse() {
        return anHyfpCbse;
    }

    /**
     * Sets the value of the anHyfpCbse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpCbse(String value) {
        this.anHyfpCbse = value;
    }

    /**
     * Gets the value of the anHyfpRzfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpRzfs() {
        return anHyfpRzfs;
    }

    /**
     * Sets the value of the anHyfpRzfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpRzfs(String value) {
        this.anHyfpRzfs = value;
    }

    /**
     * Gets the value of the anHyfpRzje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpRzje() {
        return anHyfpRzje;
    }

    /**
     * Sets the value of the anHyfpRzje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpRzje(String value) {
        this.anHyfpRzje = value;
    }

    /**
     * Gets the value of the anHyfpRzse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpRzse() {
        return anHyfpRzse;
    }

    /**
     * Sets the value of the anHyfpRzse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpRzse(String value) {
        this.anHyfpRzse = value;
    }

    /**
     * Gets the value of the anJdcCbfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnJdcCbfs() {
        return anJdcCbfs;
    }

    /**
     * Sets the value of the anJdcCbfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnJdcCbfs(String value) {
        this.anJdcCbfs = value;
    }

    /**
     * Gets the value of the anJdcCbje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnJdcCbje() {
        return anJdcCbje;
    }

    /**
     * Sets the value of the anJdcCbje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnJdcCbje(String value) {
        this.anJdcCbje = value;
    }

    /**
     * Gets the value of the anJdcCbse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnJdcCbse() {
        return anJdcCbse;
    }

    /**
     * Sets the value of the anJdcCbse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnJdcCbse(String value) {
        this.anJdcCbse = value;
    }

    /**
     * Gets the value of the anJdcRzfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnJdcRzfs() {
        return anJdcRzfs;
    }

    /**
     * Sets the value of the anJdcRzfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnJdcRzfs(String value) {
        this.anJdcRzfs = value;
    }

    /**
     * Gets the value of the anJdcRzje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnJdcRzje() {
        return anJdcRzje;
    }

    /**
     * Sets the value of the anJdcRzje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnJdcRzje(String value) {
        this.anJdcRzje = value;
    }

    /**
     * Gets the value of the anJdcRzse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnJdcRzse() {
        return anJdcRzse;
    }

    /**
     * Sets the value of the anJdcRzse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnJdcRzse(String value) {
        this.anJdcRzse = value;
    }

    /**
     * Gets the value of the anHyfpHzfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpHzfs() {
        return anHyfpHzfs;
    }

    /**
     * Sets the value of the anHyfpHzfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpHzfs(String value) {
        this.anHyfpHzfs = value;
    }

    /**
     * Gets the value of the anHyfpHzje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpHzje() {
        return anHyfpHzje;
    }

    /**
     * Sets the value of the anHyfpHzje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpHzje(String value) {
        this.anHyfpHzje = value;
    }

    /**
     * Gets the value of the anHyfpHzse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnHyfpHzse() {
        return anHyfpHzse;
    }

    /**
     * Sets the value of the anHyfpHzse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnHyfpHzse(String value) {
        this.anHyfpHzse = value;
    }

}
