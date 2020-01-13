package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "xspzfbGrid",
        propOrder = {"pzzlList", "pzzgList", "pzqshmList"}
)
public class XspzfbGrid {
    private List<XspzfbPzzl> pzzlList;
    private List<XspzfbPzzg> pzzgList;
    private List<XspzfbPzqzhm> pzqshmList;

    public XspzfbGrid() {
    }

    public List<XspzfbPzzl> getPzzlList() {
        return this.pzzlList;
    }

    public void setPzzlList(List<XspzfbPzzl> pzzlList) {
        this.pzzlList = pzzlList;
    }

    public List<XspzfbPzzg> getPzzgList() {
        return this.pzzgList;
    }

    public void setPzzgList(List<XspzfbPzzg> pzzgList) {
        this.pzzgList = pzzgList;
    }

    public List<XspzfbPzqzhm> getPzqshmList() {
        return this.pzqshmList;
    }

    public void setPzqshmList(List<XspzfbPzqzhm> pzqshmList) {
        this.pzqshmList = pzqshmList;
    }
}

