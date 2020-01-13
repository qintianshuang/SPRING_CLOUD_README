package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "zysxxGrid",
        propOrder = {"zyssbGridlb"}
)
public class ZysxxGrid {
    @XmlElement(
            required = true
    )
    protected List<ZyssbGridlb> zyssbGridlb;

    public ZysxxGrid() {
    }

    public void setZyssbGridlb(List<ZyssbGridlb> zyssbGridlb) {
        this.zyssbGridlb = zyssbGridlb;
    }

    public List<ZyssbGridlb> getZyssbGridlb() {
        if (this.zyssbGridlb == null) {
            this.zyssbGridlb = new ArrayList();
        }

        return this.zyssbGridlb;
    }
}

