package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZlrdybnsrVo",
        propOrder = {"zlrdybnsrbz", "rdrqq", "rdrqz", "xssr", "rdqx", "rdyxrq"}
)
public class ZlrdybnsrVo {
    @XmlElement(
            name = "ZLRDYBNSRBZ",
            required = true
    )
    protected String zlrdybnsrbz = "";
    @XmlElement(
            name = "RDRQ_Q",
            required = true
    )
    protected String rdrqq = "";
    @XmlElement(
            name = "RDRQ_Z",
            required = true
    )
    protected String rdrqz = "";
    @XmlElement(
            name = "XSSR",
            required = true
    )
    protected String xssr = "";
    @XmlElement(
            name = "RDQX",
            required = true
    )
    protected String rdqx = "";
    @XmlElement(
            name = "RDYXRQ",
            required = true
    )
    protected String rdyxrq = "";

    public ZlrdybnsrVo() {
    }

    public String getZLRDYBNSRBZ() {
        return this.zlrdybnsrbz;
    }

    public void setZLRDYBNSRBZ(String value) {
        this.zlrdybnsrbz = value;
    }

    public String getRDRQQ() {
        return this.rdrqq;
    }

    public void setRDRQQ(String value) {
        this.rdrqq = value;
    }

    public String getRDRQZ() {
        return this.rdrqz;
    }

    public void setRDRQZ(String value) {
        this.rdrqz = value;
    }

    public String getXSSR() {
        return this.xssr;
    }

    public void setXSSR(String value) {
        this.xssr = value;
    }

    public String getRDQX() {
        return this.rdqx;
    }

    public void setRDQX(String value) {
        this.rdqx = value;
    }

    public String getRDYXRQ() {
        return this.rdyxrq;
    }

    public void setRDYXRQ(String value) {
        this.rdyxrq = value;
    }
}

