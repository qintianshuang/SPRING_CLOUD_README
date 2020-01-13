package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DqswrpwxxGrid",
        propOrder = {"dqswrpwxxGridlb"}
)
public class DqswrpwxxGrid {
    protected List<DqswrpwxxGridlb> dqswrpwxxGridlb;

    public DqswrpwxxGrid() {
    }

    public List<DqswrpwxxGridlb> getDqswrpwxxGridlb() {
        return this.dqswrpwxxGridlb;
    }

    public void setDqswrpwxxGridlb(List<DqswrpwxxGridlb> dqswrpwxxGridlb) {
        this.dqswrpwxxGridlb = dqswrpwxxGridlb;
    }
}

