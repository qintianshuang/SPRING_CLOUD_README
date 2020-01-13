package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "YyssecsxxVo",
        propOrder = {"xseqk", "gdzcgxqk", "qyjxsedkqk"}
)
public class YyssecsxxVo {
    @XmlElement(
            name = "XSEQK",
            required = true
    )
    protected XSEQK xseqk;
    @XmlElement(
            name = "GDZCGXQK",
            required = true
    )
    protected GDZCGXQK gdzcgxqk;
    @XmlElement(
            name = "QYJXSEDKQK",
            required = true
    )
    protected QYJXSEDKQK qyjxsedkqk;

    public YyssecsxxVo() {
    }

    public XSEQK getXSEQK() {
        return this.xseqk;
    }

    public void setXSEQK(XSEQK value) {
        this.xseqk = value;
    }

    public GDZCGXQK getGDZCGXQK() {
        return this.gdzcgxqk;
    }

    public void setGDZCGXQK(GDZCGXQK value) {
        this.gdzcgxqk = value;
    }

    public QYJXSEDKQK getQYJXSEDKQK() {
        return this.qyjxsedkqk;
    }

    public void setQYJXSEDKQK(QYJXSEDKQK value) {
        this.qyjxsedkqk = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"mx"}
    )
    public static class XSEQK {
        @XmlElement(
                name = "MX",
                required = true
        )
        protected List<XseqkMxVo> mx;

        public XSEQK() {
        }

        public List<XseqkMxVo> getMX() {
            if (this.mx == null) {
                this.mx = new ArrayList();
            }

            return this.mx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"mx"}
    )
    public static class QYJXSEDKQK {
        @XmlElement(
                name = "MX",
                required = true
        )
        protected List<QyjxsedkqkMxVo> mx;

        public QYJXSEDKQK() {
        }

        public List<QyjxsedkqkMxVo> getMX() {
            if (this.mx == null) {
                this.mx = new ArrayList();
            }

            return this.mx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"mx"}
    )
    public static class GDZCGXQK {
        @XmlElement(
                name = "MX",
                required = true
        )
        protected List<GdzcgxqkMxVo> mx;

        public GDZCGXQK() {
        }

        public List<GdzcgxqkMxVo> getMX() {
            if (this.mx == null) {
                this.mx = new ArrayList();
            }

            return this.mx;
        }
    }
}

