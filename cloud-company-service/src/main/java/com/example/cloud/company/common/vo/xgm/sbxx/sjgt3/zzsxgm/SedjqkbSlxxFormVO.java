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
 * 受理信息
 *
 * <p>Java class for sedjqkbSlxxFormVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="sedjqkbSlxxFormVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}sbbslxxVO">
 *       &lt;sequence>
 *         &lt;element name="tbrq1" type="{http://www.chinatax.gov.cn/dataspec/}tbrq1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sedjqkbSlxxFormVO", propOrder = {
    "tbrq1"
})
public class SedjqkbSlxxFormVO
    extends SbbslxxVO {

    @XmlElement(required = true)
    protected String tbrq1;

    /**
     * Gets the value of the tbrq1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTbrq1() {
        return tbrq1;
    }

    /**
     * Sets the value of the tbrq1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTbrq1(String value) {
        this.tbrq1 = value;
    }

}
