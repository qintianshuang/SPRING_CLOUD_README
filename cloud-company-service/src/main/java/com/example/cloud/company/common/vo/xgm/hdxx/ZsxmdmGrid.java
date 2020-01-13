package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZsxmdmGrid",
        propOrder = {"zsxmGridlb"}
)
public class ZsxmdmGrid {
    private List<ZsxmdmGridlb> zsxmGridlb;

    public ZsxmdmGrid() {
    }

    public List<ZsxmdmGridlb> getZsxmGridlb() {
        if (null == this.zsxmGridlb) {
            this.zsxmGridlb = new ArrayList();
        }

        return this.zsxmGridlb;
    }

    public void setZsxmGridlb(List<ZsxmdmGridlb> zsxmGridlb) {
        this.zsxmGridlb = zsxmGridlb;
    }
}

