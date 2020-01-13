package com.example.cloud.company.common.vo.xgm.hdxx;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SSYHMX",
        propOrder = {"jmsmc", "jmsdm", "swsxmc", "yxqq", "yxqz"}
)
@XmlRootElement(
        name = "SSYHMX"
)
public class SSYHMX {
    @XmlElement(
            name = "JMSMC",
            required = true
    )
    protected String jmsmc;
    @XmlElement(
            name = "JMSDM",
            required = true
    )
    protected String jmsdm;
    @XmlElement(
            name = "SWSXMC",
            required = true
    )
    protected String swsxmc;
    @XmlElement(
            name = "YXQQ",
            required = true
    )
    protected String yxqq;
    @XmlElement(
            name = "YXQZ",
            required = true
    )
    protected String yxqz;

    public SSYHMX() {
    }

    public String getJmsmc() {
        return this.jmsmc;
    }

    public void setJmsmc(String value) {
        this.jmsmc = value;
    }

    public String getJmsdm() {
        return this.jmsdm;
    }

    public void setJmsdm(String value) {
        this.jmsdm = value;
    }

    public String getSwsxmc() {
        return this.swsxmc;
    }

    public void setSwsxmc(String value) {
        this.swsxmc = value;
    }

    public String getYxqq() {
        return this.yxqq;
    }

    public void setYxqq(String value) {
        this.yxqq = value;
    }

    public String getYxqz() {
        return this.yxqz;
    }

    public void setYxqz(String value) {
        this.yxqz = value;
    }
}

