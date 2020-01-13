package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZspmdmGrid",
        propOrder = {"zspmGridlb"}
)
public class ZspmdmGrid {
    private List<ZspmdmGridlb> zspmGridlb;

    public ZspmdmGrid() {
    }

    public List<ZspmdmGridlb> getZspmGridlb() {
        if (null == this.zspmGridlb) {
            this.zspmGridlb = new ArrayList();
        }

        return this.zspmGridlb;
    }

    public void setZspmGridlb(List<ZspmdmGridlb> zspmGridlb) {
        this.zspmGridlb = zspmGridlb;
    }
}

