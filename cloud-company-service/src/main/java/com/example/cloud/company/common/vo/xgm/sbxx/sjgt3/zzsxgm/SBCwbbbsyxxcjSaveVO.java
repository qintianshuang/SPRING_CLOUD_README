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
 * 财务报表报送与信息采集保存VO
 *
 * <p>Java class for SBCwbbbsyxxcjSaveVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SBCwbbbsyxxcjSaveVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zlbscjuuid" type="{http://www.chinatax.gov.cn/dataspec/}zlbscjuuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBCwbbbsyxxcjSaveVO", propOrder = {
    "zlbscjuuid"
})
public class SBCwbbbsyxxcjSaveVO {

    @XmlElement(required = true)
    protected String zlbscjuuid;

    /**
     * Gets the value of the zlbscjuuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZlbscjuuid() {
        return zlbscjuuid;
    }

    /**
     * Sets the value of the zlbscjuuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZlbscjuuid(String value) {
        this.zlbscjuuid = value;
    }

}