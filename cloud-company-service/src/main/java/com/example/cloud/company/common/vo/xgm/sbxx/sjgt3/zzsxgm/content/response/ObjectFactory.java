package com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.content.response;////
//// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
//// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
//// Any modifications to this file will be lost upon recompilation of the source schema.
//// Generated on: 2018.10.10 at 03:36:28 PM CST
////
//
//
//package com.example.cloud.server.common.vo.xgm.sbxx.sjgt3.zzsxgm.content.response;
//
//import com.example.cloud.server.common.vo.xgm.sbxx.sjgt3.zzsxgm.CxNsrHYCBXXresVO;
//
//import javax.xml.bind.annotation.*;
//
//
///**
// * <p>Java class for T_taxML complex type.
// *
// * <p>The following schema fragment specifies the expected content contained within this class.
// *
// * <pre>
// * &lt;complexType name="T_taxML">
// *   &lt;complexContent>
// *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
// *       &lt;sequence>
// *         &lt;element ref="{http://www.chinatax.gov.cn/dataspec/}cxNsrHYCBXXresVO"/>
// *       &lt;/sequence>
// *       &lt;attribute name="xmlmc" use="required">
// *         &lt;simpleType>
// *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
// *             &lt;enumeration value="获取货运系统申报数据接口"/>
// *           &lt;/restriction>
// *         &lt;/simpleType>
// *       &lt;/attribute>
// *       &lt;attribute name="xmlbh" use="required">
// *         &lt;simpleType>
// *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
// *             &lt;enumeration value="String"/>
// *           &lt;/restriction>
// *         &lt;/simpleType>
// *       &lt;/attribute>
// *       &lt;attribute name="bbh" use="required">
// *         &lt;simpleType>
// *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
// *             &lt;enumeration value="SWZJ.HYFP.SB.CXFPCBRZHZXX"/>
// *           &lt;/restriction>
// *         &lt;/simpleType>
// *       &lt;/attribute>
// *     &lt;/restriction>
// *   &lt;/complexContent>
// * &lt;/complexType>
// * </pre>
// *
// *
// */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "T_taxML", propOrder = {
//    "cxNsrHYCBXXresVO"
//})
//@XmlSeeAlso({
//    HY00001Response.class
//})
//public class ObjectFactory {
//
//    @XmlElement(required = true)
//    protected CxNsrHYCBXXresVO cxNsrHYCBXXresVO;
//    @XmlAttribute(name = "xmlmc", required = true)
//    protected String xmlmc;
//    @XmlAttribute(name = "xmlbh", required = true)
//    protected String xmlbh;
//    @XmlAttribute(name = "bbh", required = true)
//    protected String bbh;
//
//    /**
//     * Gets the value of the cxNsrHYCBXXresVO property.
//     *
//     * @return
//     *     possible object is
//     *     {@link CxNsrHYCBXXresVO }
//     *
//     */
//    public CxNsrHYCBXXresVO getCxNsrHYCBXXresVO() {
//        return cxNsrHYCBXXresVO;
//    }
//
//    /**
//     * Sets the value of the cxNsrHYCBXXresVO property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link CxNsrHYCBXXresVO }
//     *
//     */
//    public void setCxNsrHYCBXXresVO(CxNsrHYCBXXresVO value) {
//        this.cxNsrHYCBXXresVO = value;
//    }
//
//    /**
//     * Gets the value of the xmlmc property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getXmlmc() {
//        return xmlmc;
//    }
//
//    /**
//     * Sets the value of the xmlmc property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setXmlmc(String value) {
//        this.xmlmc = value;
//    }
//
//    /**
//     * Gets the value of the xmlbh property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getXmlbh() {
//        return xmlbh;
//    }
//
//    /**
//     * Sets the value of the xmlbh property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setXmlbh(String value) {
//        this.xmlbh = value;
//    }
//
//    /**
//     * Gets the value of the bbh property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getBbh() {
//        return bbh;
//    }
//
//    /**
//     * Sets the value of the bbh property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setBbh(String value) {
//        this.bbh = value;
//    }
//
//}
