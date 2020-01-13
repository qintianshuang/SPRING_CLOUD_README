package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "fjsResbxxGridlb",
        propOrder = {"zsxmDm", "zsxmMc", "zspmDm", "zspmMc", "sl", "rdzsuuid"}
)
public class FjsResbxxGridlb {
    protected String zsxmDm;
    protected String zsxmMc;
    protected String zspmDm;
    protected String zspmMc;
    protected String sl;
    protected String rdzsuuid;

    public FjsResbxxGridlb() {
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

    public String getSl() {
        return this.sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public String getRdzsuuid() {
        return this.rdzsuuid;
    }

    public void setRdzsuuid(String rdzsuuid) {
        this.rdzsuuid = rdzsuuid;
    }
}

