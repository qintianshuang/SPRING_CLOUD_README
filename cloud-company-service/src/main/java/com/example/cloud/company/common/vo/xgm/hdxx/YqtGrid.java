package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "yqtGrid",
        propOrder = {"yqtGridlb"}
)
public class YqtGrid {
    protected List<YqtGridlb> yqtGridlb;

    public YqtGrid() {
    }

    public List<YqtGridlb> getYqtGridlb() {
        if (this.yqtGridlb == null) {
            this.yqtGridlb = new ArrayList();
        }

        return this.yqtGridlb;
    }

    public void setYqtGridlb(List<YqtGridlb> yqtGridlb) {
        this.yqtGridlb = yqtGridlb;
    }
}
