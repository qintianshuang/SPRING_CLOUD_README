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
 * 《电力企业增值税销项税额和进项税额传递单》业务报文
 *
 * <p>Java class for dlqyzzsxxsehjxsecddywbw complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="dlqyzzsxxsehjxsecddywbw">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}taxDoc">
 *       &lt;sequence>
 *         &lt;element name="dlqyzzsxxsehjxsecdd" type="{http://www.chinatax.gov.cn/dataspec/}dlqyzzsxxsehjxsecdd"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dlqyzzsxxsehjxsecddywbw", propOrder = {
    "dlqyzzsxxsehjxsecdd"
})
public class Dlqyzzsxxsehjxsecddywbw
    extends TaxDoc {

    @XmlElement(required = true)
    protected Dlqyzzsxxsehjxsecdd dlqyzzsxxsehjxsecdd;

    /**
     * Gets the value of the dlqyzzsxxsehjxsecdd property.
     *
     * @return
     *     possible object is
     *     {@link Dlqyzzsxxsehjxsecdd }
     *
     */
    public Dlqyzzsxxsehjxsecdd getDlqyzzsxxsehjxsecdd() {
        return dlqyzzsxxsehjxsecdd;
    }

    /**
     * Sets the value of the dlqyzzsxxsehjxsecdd property.
     *
     * @param value
     *     allowed object is
     *     {@link Dlqyzzsxxsehjxsecdd }
     *
     */
    public void setDlqyzzsxxsehjxsecdd(Dlqyzzsxxsehjxsecdd value) {
        this.dlqyzzsxxsehjxsecdd = value;
    }

}
