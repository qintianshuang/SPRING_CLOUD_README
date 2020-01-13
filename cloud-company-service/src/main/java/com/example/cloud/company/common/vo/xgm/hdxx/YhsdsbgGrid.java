package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "yhsdsbgGrid",
        propOrder = {"xspzfbGrid", "xspzbs"}
)
public class YhsdsbgGrid {
    private XspzfbGrid xspzfbGrid;
    private List<Xspzb> xspzbs;

    public YhsdsbgGrid() {
    }

    public XspzfbGrid getXspzfbGrid() {
        return this.xspzfbGrid;
    }

    public void setXspzfbGrid(XspzfbGrid xspzfbGrid) {
        this.xspzfbGrid = xspzfbGrid;
    }

    public List<Xspzb> getXspzbs() {
        return this.xspzbs;
    }

    public void setXspzbs(List<Xspzb> xspzbs) {
        this.xspzbs = xspzbs;
    }
}
