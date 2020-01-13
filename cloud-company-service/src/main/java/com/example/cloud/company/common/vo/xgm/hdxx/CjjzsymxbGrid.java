package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "cjjzsymxbGrid",
        propOrder = {"cjjzsymxbGridlb"}
)
public class CjjzsymxbGrid {
    @XmlElement(
            required = true
    )
    protected List<CjjzsymxbGridlbVO> cjjzsymxbGridlb;

    public CjjzsymxbGrid() {
    }

    public void setCjjzsymxbGridlb(List<CjjzsymxbGridlbVO> cjjzsymxbGridlb) {
        this.cjjzsymxbGridlb = cjjzsymxbGridlb;
    }

    public List<CjjzsymxbGridlbVO> getCjjzsymxbGridlb() {
        if (this.cjjzsymxbGridlb == null) {
            this.cjjzsymxbGridlb = new ArrayList();
        }

        return this.cjjzsymxbGridlb;
    }
}
