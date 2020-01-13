package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SwrGrid",
        propOrder = {"swrGridlb"}
)
public class SwrGrid {
    protected List<SwrGridlb> swrGridlb;

    public SwrGrid() {
    }

    public List<SwrGridlb> getSwrGridlb() {
        return this.swrGridlb;
    }

    public void setSwrGridlb(List<SwrGridlb> swrGridlb) {
        this.swrGridlb = swrGridlb;
    }
}

