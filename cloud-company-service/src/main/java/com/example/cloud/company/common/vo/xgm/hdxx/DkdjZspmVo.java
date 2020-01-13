package com.example.cloud.company.common.vo.xgm.hdxx;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DkdjZspmVo",
        propOrder = {"zsxmDm", "zspmDm", "zspmMc", "sl1", "zsdlfsDm", "sbqxDm", "nsqxDm", "skssqq", "skssqz", "rdpzuuid", "rdzsuuid", "zsxmDmZs"}
)
public class DkdjZspmVo {
    @XmlElement(
            name = "ZSXMDM",
            required = true
    )
    protected String zsxmDm = "";
    @XmlElement(
            name = "ZSPMDM",
            required = true
    )
    protected String zspmDm = "";
    @XmlElement(
            name = "ZSPMMC",
            required = true
    )
    protected String zspmMc = "";
    @XmlElement(
            name = "SL1",
            required = true
    )
    protected String sl1 = "";
    @XmlElement(
            name = "ZSDLFSDM",
            required = true
    )
    protected String zsdlfsDm = "";
    @XmlElement(
            name = "SBQXDM",
            required = true
    )
    protected String sbqxDm = "";
    @XmlElement(
            name = "NSQXDM",
            required = true
    )
    protected String nsqxDm = "";
    @XmlElement(
            name = "SKSSQQ",
            required = true
    )
    protected String skssqq = "";
    @XmlElement(
            name = "SKSSQZ",
            required = true
    )
    protected String skssqz = "";
    @XmlElement(
            name = "RDPZUUID",
            required = true
    )
    protected String rdpzuuid = "";
    @XmlElement(
            name = "RDZSUUID",
            required = true
    )
    protected String rdzsuuid = "";
    @XmlElement(
            name = "zsxmDmZs",
            required = true
    )
    protected String zsxmDmZs = "";

    public DkdjZspmVo() {
    }

    public String getZsxmDm() {
        return this.zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getZspmMc() {
        return this.zspmMc;
    }

    public void setZspmMc(String zspmMc) {
        this.zspmMc = zspmMc;
    }

    public String getSl1() {
        return this.sl1;
    }

    public void setSl1(String sl1) {
        this.sl1 = sl1;
    }

    public String getZsdlfsDm() {
        return this.zsdlfsDm;
    }

    public void setZsdlfsDm(String zsdlfsDm) {
        this.zsdlfsDm = zsdlfsDm;
    }

    public String getSbqxDm() {
        return this.sbqxDm;
    }

    public void setSbqxDm(String sbqxDm) {
        this.sbqxDm = sbqxDm;
    }

    public String getNsqxDm() {
        return this.nsqxDm;
    }

    public void setNsqxDm(String nsqxDm) {
        this.nsqxDm = nsqxDm;
    }

    public String getSkssqq() {
        return this.skssqq;
    }

    public void setSkssqq(String skssqq) {
        this.skssqq = skssqq;
    }

    public String getSkssqz() {
        return this.skssqz;
    }

    public void setSkssqz(String skssqz) {
        this.skssqz = skssqz;
    }

    public String getRdpzuuid() {
        return this.rdpzuuid;
    }

    public void setRdpzuuid(String rdpzuuid) {
        this.rdpzuuid = rdpzuuid;
    }

    public String getRdzsuuid() {
        return this.rdzsuuid;
    }

    public void setRdzsuuid(String rdzsuuid) {
        this.rdzsuuid = rdzsuuid;
    }

    public String getZsxmDmZs() {
        return this.zsxmDmZs;
    }

    public void setZsxmDmZs(String zsxmDmZs) {
        this.zsxmDmZs = zsxmDmZs;
    }
}

