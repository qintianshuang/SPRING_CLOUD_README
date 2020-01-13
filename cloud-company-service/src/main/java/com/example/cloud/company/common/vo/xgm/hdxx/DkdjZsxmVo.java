package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DkdjZsxmVo",
        propOrder = {"zsxmDm", "zsxmMc", "hyDm"}
)
public class DkdjZsxmVo {
    @XmlElement(
            name = "ZSXMDM",
            required = true
    )
    protected String zsxmDm = "";
    @XmlElement(
            name = "ZSXMMC",
            required = true
    )
    protected String zsxmMc = "";
    @XmlElement(
            name = "HYDM",
            required = true
    )
    protected String hyDm = "";

    public DkdjZsxmVo() {
    }

    public String getZsxmDm() {
        return this.zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    public String getZsxmMc() {
        return this.zsxmMc;
    }

    public void setZsxmMc(String zsxmMc) {
        this.zsxmMc = zsxmMc;
    }

    public String getHyDm() {
        return this.hyDm;
    }

    public void setHyDm(String hyDm) {
        this.hyDm = hyDm;
    }
}

