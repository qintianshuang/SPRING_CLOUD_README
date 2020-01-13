package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GfwrGrid",
        propOrder = {"gfwrGridlb"}
)
public class GfwrGrid {
    protected List<GfwrGridlb> gfwrGridlb;

    public GfwrGrid() {
    }

    public List<GfwrGridlb> getGfwrGridlb() {
        return this.gfwrGridlb;
    }

    public void setGfwrGridlb(List<GfwrGridlb> gfwrGridlb) {
        this.gfwrGridlb = gfwrGridlb;
    }
}

