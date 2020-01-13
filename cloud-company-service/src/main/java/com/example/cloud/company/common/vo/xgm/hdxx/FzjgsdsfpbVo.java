package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FzjgsdsfpbVo",
        propOrder = {"zjgnsrsbh", "zjgnsrmc", "zjgynsdse", "zjgftsdse", "zjgczjzfpsdse", "fzjgftdsdse", "fzjgqks"}
)
public class FzjgsdsfpbVo {
    @XmlElement(
            name = "ZJGNSRSBH",
            required = true
    )
    protected String zjgnsrsbh = "";
    @XmlElement(
            name = "ZJGNSRMC",
            required = true
    )
    protected String zjgnsrmc = "";
    @XmlElement(
            name = "ZJGYNSDSE"
    )
    protected String zjgynsdse;
    @XmlElement(
            name = "ZJGFTSDSE"
    )
    protected String zjgftsdse;
    @XmlElement(
            name = "ZJGCZJZFPSDSE"
    )
    protected String zjgczjzfpsdse;
    @XmlElement(
            name = "FZJGFTDSDSE"
    )
    protected String fzjgftdsdse;
    @XmlElement(
            name = "FZJGQKS",
            required = true
    )
    protected FZJGQKS fzjgqks;

    public FzjgsdsfpbVo() {
    }

    public String getZJGNSRSBH() {
        return this.zjgnsrsbh;
    }

    public void setZJGNSRSBH(String value) {
        this.zjgnsrsbh = value;
    }

    public String getZJGNSRMC() {
        return this.zjgnsrmc;
    }

    public void setZJGNSRMC(String value) {
        this.zjgnsrmc = value;
    }

    public String getZJGYNSDSE() {
        return this.zjgynsdse;
    }

    public void setZJGYNSDSE(String value) {
        this.zjgynsdse = value;
    }

    public String getZJGFTSDSE() {
        return this.zjgftsdse;
    }

    public void setZJGFTSDSE(String value) {
        this.zjgftsdse = value;
    }

    public String getZJGCZJZFPSDSE() {
        return this.zjgczjzfpsdse;
    }

    public void setZJGCZJZFPSDSE(String value) {
        this.zjgczjzfpsdse = value;
    }

    public String getFZJGFTDSDSE() {
        return this.fzjgftdsdse;
    }

    public void setFZJGFTDSDSE(String value) {
        this.fzjgftdsdse = value;
    }

    public FZJGQKS getFZJGQKS() {
        return this.fzjgqks;
    }

    public void setFZJGQKS(FZJGQKS value) {
        this.fzjgqks = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"fzjgqk"}
    )
    public static class FZJGQKS {
        @XmlElement(
                name = "FZJGQK",
                required = true
        )
        protected List<FzjgqkVo> fzjgqk;

        public FZJGQKS() {
        }

        public List<FzjgqkVo> getFZJGQK() {
            if (this.fzjgqk == null) {
                this.fzjgqk = new ArrayList();
            }

            return this.fzjgqk;
        }
    }
}

