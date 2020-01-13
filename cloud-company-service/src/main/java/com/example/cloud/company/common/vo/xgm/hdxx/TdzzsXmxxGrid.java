package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "TdzzsXmxxGrid",
        propOrder = {"tdzzsxmxxgridlb"}
)
public class TdzzsXmxxGrid {
    @XmlElement(
            name = "TDZZSXMXXGRIDLB",
            required = true
    )
    protected List<TdzzsXmxxGridlb> tdzzsxmxxgridlb;

    public TdzzsXmxxGrid() {
    }

    public List<TdzzsXmxxGridlb> getTdzzsxmxxgridlb() {
        if (this.tdzzsxmxxgridlb == null) {
            this.tdzzsxmxxgridlb = new ArrayList();
        }

        return this.tdzzsxmxxgridlb;
    }

    public void setTdzzsxmxxgridlb(List<TdzzsXmxxGridlb> tdzzsxmxxgridlb) {
        this.tdzzsxmxxgridlb = tdzzsxmxxgridlb;
    }
}
