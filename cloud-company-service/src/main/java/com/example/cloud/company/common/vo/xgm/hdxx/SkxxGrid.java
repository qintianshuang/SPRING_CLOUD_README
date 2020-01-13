package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SkxxGrid",
        propOrder = {"skxxgridlb"}
)
public class SkxxGrid {
    @XmlElement(
            name = "SKXXGRIDLB",
            required = true
    )
    protected List<SkxxGridlb> skxxgridlb;

    public SkxxGrid() {
    }

    public List<SkxxGridlb> getSkxxgridlb() {
        if (this.skxxgridlb == null) {
            this.skxxgridlb = new ArrayList();
        }

        return this.skxxgridlb;
    }

    public void setSkxxgridlb(List<SkxxGridlb> skxxgridlb) {
        this.skxxgridlb = skxxgridlb;
    }
}

