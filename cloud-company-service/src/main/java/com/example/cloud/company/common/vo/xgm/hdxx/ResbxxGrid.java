package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "resbxxGrid",
        propOrder = {"zbList", "fjsList"}
)
public class ResbxxGrid {
    protected List<FjsResbxxGridlb> fjsList;
    protected List<ZbResbxxGridlb> zbList;

    public ResbxxGrid() {
    }

    public List<FjsResbxxGridlb> getFjsList() {
        return this.fjsList;
    }

    public void setFjsList(List<FjsResbxxGridlb> fjsList) {
        this.fjsList = fjsList;
    }

    public List<ZbResbxxGridlb> getZbList() {
        return this.zbList;
    }

    public void setZbList(List<ZbResbxxGridlb> zbList) {
        this.zbList = zbList;
    }
}
