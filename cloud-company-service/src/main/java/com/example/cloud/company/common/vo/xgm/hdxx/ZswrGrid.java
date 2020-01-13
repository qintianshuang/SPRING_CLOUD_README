package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZswrGrid",
        propOrder = {"zswrGridlb"}
)
public class ZswrGrid {
    protected List<ZswrGridlb> zswrGridlb;

    public ZswrGrid() {
    }

    public List<ZswrGridlb> getZswrGridlb() {
        return this.zswrGridlb;
    }

    public void setZswrGridlb(List<ZswrGridlb> zswrGridlb) {
        this.zswrGridlb = zswrGridlb;
    }
}

