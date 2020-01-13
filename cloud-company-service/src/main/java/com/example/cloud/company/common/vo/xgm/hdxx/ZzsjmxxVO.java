package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZzsjmxxVO",
        propOrder = {"jmxxDm", "qcye", "swsxDm"}
)
public class ZzsjmxxVO {
    @XmlElement(
            name = "JSXZ_DM",
            required = true
    )
    protected String jmxxDm = "";
    @XmlElement(
            name = "QCYE",
            required = true
    )
    protected String qcye = "";
    @XmlElement(
            name = "SWSX_DM",
            required = true
    )
    protected String swsxDm;

    public ZzsjmxxVO() {
    }

    public String getJmxxDm() {
        return this.jmxxDm;
    }

    public void setJmxxDm(String jmxxDm) {
        this.jmxxDm = jmxxDm;
    }

    public String getQcye() {
        return this.qcye;
    }

    public void setQcye(String qcye) {
        this.qcye = qcye;
    }

    public String getSwsxDm() {
        return this.swsxDm;
    }

    public void setSwsxDm(String swsxDm) {
        this.swsxDm = swsxDm;
    }
}
