package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "WtshlycqkGridlb",
        propOrder = {"spbmDm", "sqkcsl"}
)
public class WtshlycqkGridlb implements Serializable {
    private String spbmDm;
    private String sqkcsl;

    public WtshlycqkGridlb() {
    }

    public String getSpbmDm() {
        return this.spbmDm;
    }

    public void setSpbmDm(String spbmDm) {
        this.spbmDm = spbmDm;
    }

    public String getSqkcsl() {
        return this.sqkcsl;
    }

    public void setSqkcsl(String sqkcsl) {
        this.sqkcsl = sqkcsl;
    }
}
