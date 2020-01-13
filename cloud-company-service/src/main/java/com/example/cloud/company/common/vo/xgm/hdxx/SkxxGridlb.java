package com.example.cloud.company.common.vo.xgm.hdxx;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SkxxGridlb",
        propOrder = {"zspmDm", "zszmDm", "yzl", "zspmMc", "zszmMc", "hyDm"}
)
public class SkxxGridlb {
    @XmlElement(
            name = "ZSPMDM",
            required = true
    )
    protected String zspmDm = "";
    @XmlElement(
            name = "ZSZMDM",
            required = true
    )
    protected String zszmDm = "";
    @XmlElement(
            name = "YZL",
            required = true
    )
    protected String yzl = "";
    @XmlElement(
            name = "ZSPMMC",
            required = true
    )
    protected String zspmMc = "";
    @XmlElement(
            name = "HYDM",
            required = true
    )
    protected String hyDm = "";
    @XmlElement(
            name = "ZSZMMC",
            required = true
    )
    protected String zszmMc = "";

    public SkxxGridlb() {
    }

    public String getHyDm() {
        return this.hyDm;
    }

    public String getZszmMc() {
        return this.zszmMc;
    }

    public void setZszmMc(String zszmMc) {
        this.zszmMc = zszmMc;
    }

    public void setHyDm(String hyDm) {
        this.hyDm = hyDm;
    }

    public String getZspmMc() {
        return this.zspmMc;
    }

    public void setZspmMc(String zspmMc) {
        this.zspmMc = zspmMc;
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getZszmDm() {
        return this.zszmDm;
    }

    public void setZszmDm(String zszmDm) {
        this.zszmDm = zszmDm;
    }

    public String getYzl() {
        return this.yzl;
    }

    public void setYzl(String yzl) {
        this.yzl = yzl;
    }
}
