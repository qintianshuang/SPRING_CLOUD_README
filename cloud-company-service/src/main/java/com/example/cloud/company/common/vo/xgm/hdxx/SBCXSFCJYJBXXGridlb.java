package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SBCXSFCJYJBXXGridlb",
        propOrder = {"fybh", "fwcqzsh", "tdfwdz", "mj", "htbh", "htrq", "jyjg"}
)
public class SBCXSFCJYJBXXGridlb implements Serializable {
    @XmlElement(
            name = "FYBH",
            required = true
    )
    protected String fybh;
    @XmlElement(
            name = "FWCQZSH",
            required = true
    )
    protected String fwcqzsh;
    @XmlElement(
            name = "TDFWDZ",
            required = true
    )
    protected String tdfwdz;
    @XmlElement(
            name = "MJ",
            required = true
    )
    protected String mj;
    @XmlElement(
            name = "HTBH",
            required = true
    )
    protected String htbh;
    @XmlElement(
            name = "HTRQ",
            required = true
    )
    protected String htrq;
    @XmlElement(
            name = "JYJG",
            required = true
    )
    protected String jyjg;

    public SBCXSFCJYJBXXGridlb() {
    }

    public String getFybh() {
        return this.fybh;
    }

    public void setFybh(String fybh) {
        this.fybh = fybh;
    }

    public String getFwcqzsh() {
        return this.fwcqzsh;
    }

    public void setFwcqzsh(String fwcqzsh) {
        this.fwcqzsh = fwcqzsh;
    }

    public String getTdfwdz() {
        return this.tdfwdz;
    }

    public void setTdfwdz(String tdfwdz) {
        this.tdfwdz = tdfwdz;
    }

    public String getMj() {
        return this.mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
    }

    public String getHtbh() {
        return this.htbh;
    }

    public void setHtbh(String htbh) {
        this.htbh = htbh;
    }

    public String getHtrq() {
        return this.htrq;
    }

    public void setHtrq(String htrq) {
        this.htrq = htrq;
    }

    public String getJyjg() {
        return this.jyjg;
    }

    public void setJyjg(String jyjg) {
        this.jyjg = jyjg;
    }
}

