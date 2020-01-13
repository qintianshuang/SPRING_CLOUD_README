package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"xmmc", "asrzehdsre", "asrzehdhdlrl", "htzh", "hdlrl", "xmlx"}
)
public class Xmxx implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement(
            name = "XMMC",
            required = true
    )
    private String xmmc = "";
    @XmlElement(
            name = "asrzehdsre",
            required = true
    )
    private String asrzehdsre = "";
    @XmlElement(
            name = "asrzehdhdlrl",
            required = true
    )
    private String asrzehdhdlrl = "";
    @XmlElement(
            name = "HTZH"
    )
    private String htzh = "";
    @XmlElement(
            name = "HDLRL"
    )
    private String hdlrl = "";
    @XmlElement(
            name = "XMLX"
    )
    private String xmlx = "";

    public Xmxx() {
    }

    public String getHtzh() {
        return this.htzh;
    }

    public void setHtzh(String htzh) {
        this.htzh = htzh;
    }

    public String getHdlrl() {
        return this.hdlrl;
    }

    public void setHdlrl(String hdlrl) {
        this.hdlrl = hdlrl;
    }

    public String getXmlx() {
        return this.xmlx;
    }

    public void setXmlx(String xmlx) {
        this.xmlx = xmlx;
    }

    public String getXmmc() {
        return this.xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getAsrzehdsre() {
        return this.asrzehdsre;
    }

    public void setAsrzehdsre(String asrzehdsre) {
        this.asrzehdsre = asrzehdsre;
    }

    public String getAsrzehdhdlrl() {
        return this.asrzehdhdlrl;
    }

    public void setAsrzehdhdlrl(String asrzehdhdlrl) {
        this.asrzehdhdlrl = asrzehdhdlrl;
    }
}
