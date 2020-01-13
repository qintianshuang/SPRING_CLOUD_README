package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CbsymxGrid",
        propOrder = {"cbsymxlb"}
)
public class CbsymxGrid {
    @XmlElement(
            name = "CBSYMXLB",
            required = true
    )
    protected List<Cbsymxlb> cbsymxlb;

    public CbsymxGrid() {
    }

    public List<Cbsymxlb> getCbsymxlb() {
        if (this.cbsymxlb == null) {
            this.cbsymxlb = new ArrayList();
        }

        return this.cbsymxlb;
    }

    public void setCbsymxlb(List<Cbsymxlb> cbsymxlb) {
        this.cbsymxlb = cbsymxlb;
    }
}
