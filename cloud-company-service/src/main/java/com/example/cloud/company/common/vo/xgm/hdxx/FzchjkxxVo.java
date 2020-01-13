package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FzchjkxxVo",
        propOrder = {"fzchbz", "fzchrdrq", "fzchswjgdm", "fzchswjgmc"}
)
public class FzchjkxxVo {
    @XmlElement(
            name = "FZCHBZ",
            required = true
    )
    protected String fzchbz = "";
    @XmlElement(
            name = "FZCH_RDRQ",
            required = true
    )
    protected String fzchrdrq = "";
    @XmlElement(
            name = "FZCH_SWJGDM",
            required = true
    )
    protected String fzchswjgdm = "";
    @XmlElement(
            name = "FZCH_SWJGMC",
            required = true
    )
    protected String fzchswjgmc = "";

    public FzchjkxxVo() {
    }

    public String getFZCHBZ() {
        return this.fzchbz;
    }

    public void setFZCHBZ(String value) {
        this.fzchbz = value;
    }

    public String getFZCHRDRQ() {
        return this.fzchrdrq;
    }

    public void setFZCHRDRQ(String value) {
        this.fzchrdrq = value;
    }

    public String getFZCHSWJGDM() {
        return this.fzchswjgdm;
    }

    public void setFZCHSWJGDM(String value) {
        this.fzchswjgdm = value;
    }

    public String getFZCHSWJGMC() {
        return this.fzchswjgmc;
    }

    public void setFZCHSWJGMC(String value) {
        this.fzchswjgmc = value;
    }
}
