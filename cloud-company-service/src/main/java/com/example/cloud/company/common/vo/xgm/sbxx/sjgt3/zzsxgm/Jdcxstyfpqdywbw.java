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
 * 《机动车销售统一发票清单》业务报文
 *
 * <p>Java class for jdcxstyfpqdywbw complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="jdcxstyfpqdywbw">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}taxDoc">
 *       &lt;sequence>
 *         &lt;element name="jdcxstyfpqd" type="{http://www.chinatax.gov.cn/dataspec/}jdcxstyfpqd"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jdcxstyfpqdywbw", propOrder = {
    "jdcxstyfpqd"
})
public class Jdcxstyfpqdywbw
    extends TaxDoc {

    @XmlElement(required = true)
    protected Jdcxstyfpqd jdcxstyfpqd;

    /**
     * Gets the value of the jdcxstyfpqd property.
     *
     * @return
     *     possible object is
     *     {@link Jdcxstyfpqd }
     *
     */
    public Jdcxstyfpqd getJdcxstyfpqd() {
        return jdcxstyfpqd;
    }

    /**
     * Sets the value of the jdcxstyfpqd property.
     *
     * @param value
     *     allowed object is
     *     {@link Jdcxstyfpqd }
     *
     */
    public void setJdcxstyfpqd(Jdcxstyfpqd value) {
        this.jdcxstyfpqd = value;
    }

}