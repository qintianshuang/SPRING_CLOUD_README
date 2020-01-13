package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "zbResbxxGridlb",
        propOrder = {"zspmDm", "zspmMc", "rdpzuuid", "slList"}
)
public class ZbResbxxGridlb {
    protected String zspmDm;
    protected String zspmMc;
    protected String rdpzuuid;
    protected List<String> slList;

    public ZbResbxxGridlb() {
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

    public String getRdpzuuid() {
        return this.rdpzuuid;
    }

    public void setRdpzuuid(String rdpzuuid) {
        this.rdpzuuid = rdpzuuid;
    }

    public List<String> getSlList() {
        return this.slList;
    }

    public void setSlList(List<String> slList) {
        this.slList = slList;
    }
}

