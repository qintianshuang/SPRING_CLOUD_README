//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.08.28 at 06:10:39 PM CST
//


package com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 附加税申报
 *
 * <p>Java class for xgmfjsxxGrid complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="xgmfjsxxGrid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="xgmfjsxxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}xgmfjsxxGridlb"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xgmfjsxxGrid", propOrder = {
    "xgmfjsxxGridlb"
})
public class XgmfjsxxGrid {

    @XmlElement(required = true)
    protected List<XgmfjsxxGridlb> xgmfjsxxGridlb;

    /**
     * Gets the value of the xgmfjsxxGridlb property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xgmfjsxxGridlb property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXgmfjsxxGridlb().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XgmfjsxxGridlb }
     *
     *
     */
    public List<XgmfjsxxGridlb> getXgmfjsxxGridlb() {
        if (xgmfjsxxGridlb == null) {
            xgmfjsxxGridlb = new ArrayList<XgmfjsxxGridlb>();
        }
        return this.xgmfjsxxGridlb;
    }

}
