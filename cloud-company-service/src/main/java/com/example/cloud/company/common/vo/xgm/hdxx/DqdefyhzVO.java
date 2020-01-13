package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DqdefyhzVO",
        propOrder = {"dqdefyhzGridlb"}
)
public class DqdefyhzVO {
    @XmlElement(
            name = "DQDEFYHZGRDS",
            required = true
    )
    protected List<DqdefyhzGrid> dqdefyhzGridlb;

    public DqdefyhzVO() {
    }

    public List<DqdefyhzGrid> getDqdefyhzGrids() {
        if (this.dqdefyhzGridlb == null) {
            this.dqdefyhzGridlb = new ArrayList();
        }

        return this.dqdefyhzGridlb;
    }

    public void setDqdefyhzGridlb(List<DqdefyhzGrid> dqdefyhzGridlb) {
        this.dqdefyhzGridlb = dqdefyhzGridlb;
    }
}
