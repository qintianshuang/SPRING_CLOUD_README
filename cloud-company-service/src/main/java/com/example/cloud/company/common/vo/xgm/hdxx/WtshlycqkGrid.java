package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "WtshlycqkGrid",
        propOrder = {"wtshlycqkGridlb"}
)
public class WtshlycqkGrid implements Serializable {
    protected List<WtshlycqkGridlb> wtshlycqkGridlb;

    public WtshlycqkGrid() {
    }

    public List<WtshlycqkGridlb> getWtshlycqkGridlb() {
        return (List)(null == this.wtshlycqkGridlb ? new ArrayList() : this.wtshlycqkGridlb);
    }

    public void setWtshlycqkGridlb(List<WtshlycqkGridlb> wtshlycqkGridlb) {
        this.wtshlycqkGridlb = wtshlycqkGridlb;
    }
}
