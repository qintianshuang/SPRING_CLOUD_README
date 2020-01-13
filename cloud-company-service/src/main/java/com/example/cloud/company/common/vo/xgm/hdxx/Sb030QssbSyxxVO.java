package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Sb030QssbSyxxVO",
        propOrder = {"fyxxList", "tdxxList"}
)
public class Sb030QssbSyxxVO {
    @XmlElement(
            name = "FYXXLB",
            required = true
    )
    protected List<Sb030FyxxVo> fyxxList;
    @XmlElement(
            name = "TDXXLB",
            required = true
    )
    protected List<Sb030TdxxVo> tdxxList;

    public Sb030QssbSyxxVO() {
    }

    public List<Sb030TdxxVo> getTdxxList() {
        if (this.tdxxList == null) {
            this.tdxxList = new ArrayList();
        }

        return this.tdxxList;
    }

    public void setTdxxList(List<Sb030TdxxVo> tdxxList) {
        this.tdxxList = tdxxList;
    }

    public List<Sb030FyxxVo> getFyxxList() {
        if (this.fyxxList == null) {
            this.fyxxList = new ArrayList();
        }

        return this.fyxxList;
    }

    public void setFyxxList(List<Sb030FyxxVo> fyxxList) {
        this.fyxxList = fyxxList;
    }
}

