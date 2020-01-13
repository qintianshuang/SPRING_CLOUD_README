package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "czjzsymxbGrid",
        propOrder = {"czjzsymxbGridlb"}
)
public class CzjzsymxbGrid {
    @XmlElement(
            required = true
    )
    protected List<CzjzsymxbGridlbVO> czjzsymxbGridlb;

    public CzjzsymxbGrid() {
    }

    public void setCzjzsymxbGridlb(List<CzjzsymxbGridlbVO> czjzsymxbGridlb) {
        this.czjzsymxbGridlb = czjzsymxbGridlb;
    }

    public List<CzjzsymxbGridlbVO> getCzjzsymxbGridlb() {
        if (this.czjzsymxbGridlb == null) {
            this.czjzsymxbGridlb = new ArrayList();
        }

        return this.czjzsymxbGridlb;
    }
}

