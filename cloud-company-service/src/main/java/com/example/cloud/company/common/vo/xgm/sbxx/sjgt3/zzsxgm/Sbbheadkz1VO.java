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
 * 通用申报表表头扩展，增加申报类型，日期
 *
 * <p>Java class for sbbheadkz1VO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="sbbheadkz1VO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}sbbheadVO">
 *       &lt;sequence>
 *         &lt;element name="sbsxDm1" type="{http://www.chinatax.gov.cn/dataspec/}sbsxDm1"/>
 *         &lt;element name="sbrq1" type="{http://www.chinatax.gov.cn/dataspec/}sbrq"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sbbheadkz1VO", propOrder = {
    "sbsxDm1",
    "sbrq1"
})
public class Sbbheadkz1VO
    extends SbbheadVO {

    @XmlElement(required = true)
    protected String sbsxDm1;
    @XmlElement(required = true)
    protected String sbrq1;

    /**
     * Gets the value of the sbsxDm1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSbsxDm1() {
        return sbsxDm1;
    }

    /**
     * Sets the value of the sbsxDm1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSbsxDm1(String value) {
        this.sbsxDm1 = value;
    }

    /**
     * Gets the value of the sbrq1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSbrq1() {
        return sbrq1;
    }

    /**
     * Sets the value of the sbrq1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSbrq1(String value) {
        this.sbrq1 = value;
    }

}