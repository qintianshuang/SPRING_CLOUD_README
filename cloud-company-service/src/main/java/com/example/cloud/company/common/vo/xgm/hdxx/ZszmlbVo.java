package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZszmlbVo",
        propOrder = {"zszmDm", "zszmmc", "sl1", "zspmDm", "zsxmDm", "zsl"}
)
public class ZszmlbVo {
    @XmlElement(
            name = "zszmDm",
            required = true
    )
    protected String zszmDm = "";
    @XmlElement(
            name = "zszmmc",
            required = true
    )
    protected String zszmmc = "";
    @XmlElement(
            name = "sl1",
            required = true
    )
    protected String sl1 = "";
    @XmlElement(
            name = "zsl"
    )
    protected String zsl = "";
    @XmlElement(
            name = "zspmDm",
            required = true
    )
    protected String zspmDm = "";
    @XmlElement(
            name = "zsxmDm",
            required = true
    )
    protected String zsxmDm = "";

    public ZszmlbVo() {
    }

    public String getZszmDm() {
        return this.zszmDm;
    }

    public void setZszmDm(String zszmDm) {
        this.zszmDm = zszmDm;
    }

    public String getZszmmc() {
        return this.zszmmc;
    }

    public void setZszmmc(String zszmmc) {
        this.zszmmc = zszmmc;
    }

    public String getSl1() {
        return this.sl1;
    }

    public void setSl1(String sl1) {
        this.sl1 = sl1;
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getZsxmDm() {
        return this.zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    public String getZsl() {
        return this.zsl;
    }

    public void setZsl(String zsl) {
        this.zsl = zsl;
    }
}

