//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.08.28 at 06:10:39 PM CST
//


package com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm;

import com.example.cloud.company.common.vo.xgm.hdxx.ZszmGridlbVO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * 房地产交易申报信息VO
 *
 * <p>Java class for fdcjysbxxGridlbVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="fdcjysbxxGridlbVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zsxmDm" type="{http://www.chinatax.gov.cn/dataspec/}zsxmDm"/>
 *         &lt;element name="zspmGrid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="zspmGridlb" type="{http://www.chinatax.gov.cn/dataspec/}zspmGridlbVO"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zszmGrid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="zszmGridlb" type="{http://www.chinatax.gov.cn/dataspec/}zszmGridlbVO"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hyDm" type="{http://www.chinatax.gov.cn/dataspec/}hyDm" minOccurs="0"/>
 *         &lt;element name="nsqxDm" type="{http://www.chinatax.gov.cn/dataspec/}nsqxDm"/>
 *         &lt;element name="zsdlfsDm" type="{http://www.chinatax.gov.cn/dataspec/}zsdlfsDm" minOccurs="0"/>
 *         &lt;element name="jkqxDm" type="{http://www.chinatax.gov.cn/dataspec/}jkqxDm"/>
 *         &lt;element name="sbqxDm" type="{http://www.chinatax.gov.cn/dataspec/}sbqxDm"/>
 *         &lt;element name="jkqx" type="{http://www.chinatax.gov.cn/dataspec/}jkqx"/>
 *         &lt;element name="ssyhlxDm" type="{http://www.chinatax.gov.cn/dataspec/}ssyhlxDm" minOccurs="0"/>
 *         &lt;element name="skssqq" type="{http://www.chinatax.gov.cn/dataspec/}skssqq"/>
 *         &lt;element name="skssqz" type="{http://www.chinatax.gov.cn/dataspec/}skssqz"/>
 *         &lt;element name="djzclxDm" type="{http://www.chinatax.gov.cn/dataspec/}djzclxDm"/>
 *         &lt;element name="dwlsgxDm" type="{http://www.chinatax.gov.cn/dataspec/}dwlsgxDm" minOccurs="0"/>
 *         &lt;element name="zsfsDm" type="{http://www.chinatax.gov.cn/dataspec/}zsfsDm" minOccurs="0"/>
 *         &lt;element name="xssr" type="{http://www.chinatax.gov.cn/dataspec/}xssr" minOccurs="0"/>
 *         &lt;element name="jsyj" type="{http://www.chinatax.gov.cn/dataspec/}jsyj" minOccurs="0"/>
 *         &lt;element name="sbqx" type="{http://www.chinatax.gov.cn/dataspec/}sbqx" minOccurs="0"/>
 *         &lt;element name="sl" type="{http://www.chinatax.gov.cn/dataspec/}sl" minOccurs="0"/>
 *         &lt;element name="zsl" type="{http://www.chinatax.gov.cn/dataspec/}zsl" minOccurs="0"/>
 *         &lt;element name="se" type="{http://www.chinatax.gov.cn/dataspec/}se" minOccurs="0"/>
 *         &lt;element name="ssglyDm" type="{http://www.chinatax.gov.cn/dataspec/}ssglyDm" minOccurs="0"/>
 *         &lt;element name="skssswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}skssswjgDm"/>
 *         &lt;element name="zgswskfjDm" type="{http://www.chinatax.gov.cn/dataspec/}zgswskfjDm"/>
 *         &lt;element name="swjgDm" type="{http://www.chinatax.gov.cn/dataspec/}swjgDm"/>
 *         &lt;element name="jmse" type="{http://www.chinatax.gov.cn/dataspec/}jmse"/>
 *         &lt;element name="yjse" type="{http://www.chinatax.gov.cn/dataspec/}yjse" minOccurs="0"/>
 *         &lt;element name="ynse" type="{http://www.chinatax.gov.cn/dataspec/}ynse" minOccurs="0"/>
 *         &lt;element name="sybh" type="{http://www.chinatax.gov.cn/dataspec/}sybh" minOccurs="0"/>
 *         &lt;element name="yhsl" type="{http://www.chinatax.gov.cn/dataspec/}sl" minOccurs="0"/>
 *         &lt;element name="bb" type="{http://www.chinatax.gov.cn/dataspec/}bb" minOccurs="0"/>
 *         &lt;element name="zspmDm" type="{http://www.chinatax.gov.cn/dataspec/}zspmDm" minOccurs="0"/>
 *         &lt;element name="zszmDm" type="{http://www.chinatax.gov.cn/dataspec/}zszmDm" minOccurs="0"/>
 *         &lt;element name="yssdl" type="{http://www.chinatax.gov.cn/dataspec/}yssdl" minOccurs="0"/>
 *         &lt;element name="kce" type="{http://www.chinatax.gov.cn/dataspec/}je" minOccurs="0"/>
 *         &lt;element name="ssjmxzDm" type="{http://www.chinatax.gov.cn/dataspec/}ssjmxzDm" minOccurs="0"/>
 *         &lt;element name="sskcs" type="{http://www.chinatax.gov.cn/dataspec/}sskcs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fdcjysbxxGridlbVO", propOrder = {
    "zsxmDm",
    "zspmGrid",
    "zszmGrid",
    "hyDm",
    "nsqxDm",
    "zsdlfsDm",
    "jkqxDm",
    "sbqxDm",
    "jkqx",
    "ssyhlxDm",
    "skssqq",
    "skssqz",
    "djzclxDm",
    "dwlsgxDm",
    "zsfsDm",
    "xssr",
    "jsyj",
    "sbqx",
    "sl",
    "zsl",
    "se",
    "ssglyDm",
    "skssswjgDm",
    "zgswskfjDm",
    "swjgDm",
    "jmse",
    "yjse",
    "ynse",
    "sybh",
    "yhsl",
    "bb",
    "zspmDm",
    "zszmDm",
    "yssdl",
    "kce",
    "ssjmxzDm",
    "sskcs"
})
public class FdcjysbxxGridlbVO {

    @XmlElement(required = true)
    protected String zsxmDm;
    @XmlElement(required = true)
    protected ZspmGrid zspmGrid;
    @XmlElement(required = true)
    protected ZszmGrid zszmGrid;
    protected String hyDm;
    @XmlElement(required = true)
    protected String nsqxDm;
    protected String zsdlfsDm;
    @XmlElement(required = true)
    protected String jkqxDm;
    @XmlElement(required = true)
    protected String sbqxDm;
    @XmlElement(required = true)
    protected String jkqx;
    protected String ssyhlxDm;
    @XmlElement(required = true)
    protected String skssqq;
    @XmlElement(required = true)
    protected String skssqz;
    @XmlElement(required = true)
    protected String djzclxDm;
    protected String dwlsgxDm;
    protected String zsfsDm;
    protected Double xssr;
    protected Double jsyj;
    protected String sbqx;
    protected Double sl;
    protected Double zsl;
    protected Double se;
    protected String ssglyDm;
    @XmlElement(required = true)
    protected String skssswjgDm;
    @XmlElement(required = true)
    protected String zgswskfjDm;
    @XmlElement(required = true)
    protected String swjgDm;
    protected double jmse;
    protected Double yjse;
    protected Double ynse;
    protected String sybh;
    protected Double yhsl;
    protected String bb;
    protected String zspmDm;
    protected String zszmDm;
    protected Double yssdl;
    protected Double kce;
    protected String ssjmxzDm;
    protected Double sskcs;

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
     * Gets the value of the zspmGrid property.
     *
     * @return
     *     possible object is
     *     {@link ZspmGrid }
     *
     */
    public ZspmGrid getZspmGrid() {
        return zspmGrid;
    }

    /**
     * Sets the value of the zspmGrid property.
     *
     * @param value
     *     allowed object is
     *     {@link ZspmGrid }
     *
     */
    public void setZspmGrid(ZspmGrid value) {
        this.zspmGrid = value;
    }

    /**
     * Gets the value of the zszmGrid property.
     *
     * @return
     *     possible object is
     *     {@link ZszmGrid }
     *
     */
    public ZszmGrid getZszmGrid() {
        return zszmGrid;
    }

    /**
     * Sets the value of the zszmGrid property.
     *
     * @param value
     *     allowed object is
     *     {@link ZszmGrid }
     *
     */
    public void setZszmGrid(ZszmGrid value) {
        this.zszmGrid = value;
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
     * Gets the value of the nsqxDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNsqxDm() {
        return nsqxDm;
    }

    /**
     * Sets the value of the nsqxDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNsqxDm(String value) {
        this.nsqxDm = value;
    }

    /**
     * Gets the value of the zsdlfsDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZsdlfsDm() {
        return zsdlfsDm;
    }

    /**
     * Sets the value of the zsdlfsDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZsdlfsDm(String value) {
        this.zsdlfsDm = value;
    }

    /**
     * Gets the value of the jkqxDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJkqxDm() {
        return jkqxDm;
    }

    /**
     * Sets the value of the jkqxDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJkqxDm(String value) {
        this.jkqxDm = value;
    }

    /**
     * Gets the value of the sbqxDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSbqxDm() {
        return sbqxDm;
    }

    /**
     * Sets the value of the sbqxDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSbqxDm(String value) {
        this.sbqxDm = value;
    }

    /**
     * Gets the value of the jkqx property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJkqx() {
        return jkqx;
    }

    /**
     * Sets the value of the jkqx property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJkqx(String value) {
        this.jkqx = value;
    }

    /**
     * Gets the value of the ssyhlxDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSsyhlxDm() {
        return ssyhlxDm;
    }

    /**
     * Sets the value of the ssyhlxDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSsyhlxDm(String value) {
        this.ssyhlxDm = value;
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
     * Gets the value of the djzclxDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDjzclxDm() {
        return djzclxDm;
    }

    /**
     * Sets the value of the djzclxDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDjzclxDm(String value) {
        this.djzclxDm = value;
    }

    /**
     * Gets the value of the dwlsgxDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDwlsgxDm() {
        return dwlsgxDm;
    }

    /**
     * Sets the value of the dwlsgxDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDwlsgxDm(String value) {
        this.dwlsgxDm = value;
    }

    /**
     * Gets the value of the zsfsDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZsfsDm() {
        return zsfsDm;
    }

    /**
     * Sets the value of the zsfsDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZsfsDm(String value) {
        this.zsfsDm = value;
    }

    /**
     * Gets the value of the xssr property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getXssr() {
        return xssr;
    }

    /**
     * Sets the value of the xssr property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setXssr(Double value) {
        this.xssr = value;
    }

    /**
     * Gets the value of the jsyj property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getJsyj() {
        return jsyj;
    }

    /**
     * Sets the value of the jsyj property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setJsyj(Double value) {
        this.jsyj = value;
    }

    /**
     * Gets the value of the sbqx property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSbqx() {
        return sbqx;
    }

    /**
     * Sets the value of the sbqx property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSbqx(String value) {
        this.sbqx = value;
    }

    /**
     * Gets the value of the sl property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSl() {
        return sl;
    }

    /**
     * Sets the value of the sl property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSl(Double value) {
        this.sl = value;
    }

    /**
     * Gets the value of the zsl property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getZsl() {
        return zsl;
    }

    /**
     * Sets the value of the zsl property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setZsl(Double value) {
        this.zsl = value;
    }

    /**
     * Gets the value of the se property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSe() {
        return se;
    }

    /**
     * Sets the value of the se property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSe(Double value) {
        this.se = value;
    }

    /**
     * Gets the value of the ssglyDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSsglyDm() {
        return ssglyDm;
    }

    /**
     * Sets the value of the ssglyDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSsglyDm(String value) {
        this.ssglyDm = value;
    }

    /**
     * Gets the value of the skssswjgDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSkssswjgDm() {
        return skssswjgDm;
    }

    /**
     * Sets the value of the skssswjgDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSkssswjgDm(String value) {
        this.skssswjgDm = value;
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
     * Gets the value of the swjgDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSwjgDm() {
        return swjgDm;
    }

    /**
     * Sets the value of the swjgDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSwjgDm(String value) {
        this.swjgDm = value;
    }

    /**
     * Gets the value of the jmse property.
     *
     */
    public double getJmse() {
        return jmse;
    }

    /**
     * Sets the value of the jmse property.
     *
     */
    public void setJmse(double value) {
        this.jmse = value;
    }

    /**
     * Gets the value of the yjse property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getYjse() {
        return yjse;
    }

    /**
     * Sets the value of the yjse property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setYjse(Double value) {
        this.yjse = value;
    }

    /**
     * Gets the value of the ynse property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getYnse() {
        return ynse;
    }

    /**
     * Sets the value of the ynse property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setYnse(Double value) {
        this.ynse = value;
    }

    /**
     * Gets the value of the sybh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSybh() {
        return sybh;
    }

    /**
     * Sets the value of the sybh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSybh(String value) {
        this.sybh = value;
    }

    /**
     * Gets the value of the yhsl property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getYhsl() {
        return yhsl;
    }

    /**
     * Sets the value of the yhsl property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setYhsl(Double value) {
        this.yhsl = value;
    }

    /**
     * Gets the value of the bb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBb() {
        return bb;
    }

    /**
     * Sets the value of the bb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBb(String value) {
        this.bb = value;
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
     * Gets the value of the zszmDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZszmDm() {
        return zszmDm;
    }

    /**
     * Sets the value of the zszmDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZszmDm(String value) {
        this.zszmDm = value;
    }

    /**
     * Gets the value of the yssdl property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getYssdl() {
        return yssdl;
    }

    /**
     * Sets the value of the yssdl property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setYssdl(Double value) {
        this.yssdl = value;
    }

    /**
     * Gets the value of the kce property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getKce() {
        return kce;
    }

    /**
     * Sets the value of the kce property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setKce(Double value) {
        this.kce = value;
    }

    /**
     * Gets the value of the ssjmxzDm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSsjmxzDm() {
        return ssjmxzDm;
    }

    /**
     * Sets the value of the ssjmxzDm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSsjmxzDm(String value) {
        this.ssjmxzDm = value;
    }

    /**
     * Gets the value of the sskcs property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSskcs() {
        return sskcs;
    }

    /**
     * Sets the value of the sskcs property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSskcs(Double value) {
        this.sskcs = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="zspmGridlb" type="{http://www.chinatax.gov.cn/dataspec/}zspmGridlbVO"/>
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
        "zspmGridlb"
    })
    public static class ZspmGrid {

        protected List<ZspmGridlbVO> zspmGridlb;

        /**
         * Gets the value of the zspmGridlb property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zspmGridlb property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZspmGridlb().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZspmGridlbVO }
         *
         *
         */
        public List<ZspmGridlbVO> getZspmGridlb() {
            if (zspmGridlb == null) {
                zspmGridlb = new ArrayList<ZspmGridlbVO>();
            }
            return this.zspmGridlb;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="zszmGridlb" type="{http://www.chinatax.gov.cn/dataspec/}zszmGridlbVO"/>
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
        "zszmGridlb"
    })
    public static class ZszmGrid {

        protected List<ZszmGridlbVO> zszmGridlb;

        /**
         * Gets the value of the zszmGridlb property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zszmGridlb property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZszmGridlb().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZszmGridlbVO }
         *
         *
         */
        public List<ZszmGridlbVO> getZszmGridlb() {
            if (zszmGridlb == null) {
                zszmGridlb = new ArrayList<ZszmGridlbVO>();
            }
            return this.zszmGridlb;
        }

    }

}
