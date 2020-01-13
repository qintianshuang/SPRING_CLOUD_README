package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ClsymxGrid",
        propOrder = {"clsymxlb"}
)
public class ClsymxGrid {
    @XmlElement(
            name = "CLSYMXLB",
            required = true
    )
    protected List<Clsymxlb> clsymxlb;

    public ClsymxGrid() {
    }

    public List<Clsymxlb> getClsymxlb() {
        if (this.clsymxlb == null) {
            this.clsymxlb = new ArrayList();
        }

        return this.clsymxlb;
    }

    public void setClsymxlb(List<Clsymxlb> clsymxlb) {
        this.clsymxlb = clsymxlb;
    }
}
