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
 * 《机动车辆生产企业销售明细表》
 *
 * <p>Java class for jdclscqyxsmxb complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="jdclscqyxsmxb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jdcljxqyxsmxbGrid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="jdclscqyxsmxbGridlb" type="{http://www.chinatax.gov.cn/dataspec/}jdclscqyxsmxbGridlbVO"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jdclscqyxsmxb", propOrder = {
    "jdcljxqyxsmxbGrid"
})
public class Jdclscqyxsmxb {

    @XmlElement(required = true)
    protected JdcljxqyxsmxbGrid jdcljxqyxsmxbGrid;

    /**
     * Gets the value of the jdcljxqyxsmxbGrid property.
     *
     * @return
     *     possible object is
     *     {@link JdcljxqyxsmxbGrid }
     *
     */
    public JdcljxqyxsmxbGrid getJdcljxqyxsmxbGrid() {
        return jdcljxqyxsmxbGrid;
    }

    /**
     * Sets the value of the jdcljxqyxsmxbGrid property.
     *
     * @param value
     *     allowed object is
     *     {@link JdcljxqyxsmxbGrid }
     *
     */
    public void setJdcljxqyxsmxbGrid(JdcljxqyxsmxbGrid value) {
        this.jdcljxqyxsmxbGrid = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="jdclscqyxsmxbGridlb" type="{http://www.chinatax.gov.cn/dataspec/}jdclscqyxsmxbGridlbVO"/>
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
        "jdclscqyxsmxbGridlb"
    })
    public static class JdcljxqyxsmxbGrid {

        @XmlElement(required = true)
        protected List<JdclscqyxsmxbGridlbVO> jdclscqyxsmxbGridlb;

        /**
         * Gets the value of the jdclscqyxsmxbGridlb property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jdclscqyxsmxbGridlb property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJdclscqyxsmxbGridlb().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JdclscqyxsmxbGridlbVO }
         *
         *
         */
        public List<JdclscqyxsmxbGridlbVO> getJdclscqyxsmxbGridlb() {
            if (jdclscqyxsmxbGridlb == null) {
                jdclscqyxsmxbGridlb = new ArrayList<JdclscqyxsmxbGridlbVO>();
            }
            return this.jdclscqyxsmxbGridlb;
        }

    }

}