package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DJXX",
        propOrder = {"yhxmDm", "yhqxQ", "yhqxZ"}
)
public class DjxxVO {
    @XmlElement(
            name = "YHXM_DM",
            required = true
    )
    protected String yhxmDm = "";
    @XmlElement(
            name = "YHQX_Q",
            required = true
    )
    protected String yhqxQ = "";
    @XmlElement(
            name = "YHQX_Z",
            required = true
    )
    protected String yhqxZ = "";

    public DjxxVO() {
    }

    public String getYhxmDm() {
        return this.yhxmDm;
    }

    public void setYhxmDm(String yhxmDm) {
        this.yhxmDm = yhxmDm;
    }

    public String getYhqxQ() {
        return this.yhqxQ;
    }

    public void setYhqxQ(String yhqxQ) {
        this.yhqxQ = yhqxQ;
    }

    public String getYhqxZ() {
        return this.yhqxZ;
    }

    public void setYhqxZ(String yhqxZ) {
        this.yhqxZ = yhqxZ;
    }
}
