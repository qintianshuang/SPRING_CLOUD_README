package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZszmdmGrid",
        propOrder = {"zszmGridlb"}
)
public class ZszmdmGrid {
    private List<ZszmGridlbVO> zszmGridlb;

    public ZszmdmGrid() {
    }

    public List<ZszmGridlbVO> getZszmGridlb() {
        if (null == this.zszmGridlb) {
            this.zszmGridlb = new ArrayList();
        }

        return this.zszmGridlb;
    }

    public void setZszmGridlb(List<ZszmGridlbVO> zszmGridlb) {
        this.zszmGridlb = zszmGridlb;
    }
}

