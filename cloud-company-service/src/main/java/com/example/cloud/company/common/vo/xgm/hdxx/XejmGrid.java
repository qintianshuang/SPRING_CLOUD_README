package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "XejmGrid",
        propOrder = {"xejmGridlb"}
)
public class XejmGrid implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<XejmGridlb> xejmGridlb;

    public XejmGrid() {
    }

    public List<XejmGridlb> getXejmGridlb() {
        if (this.xejmGridlb == null) {
            this.xejmGridlb = new ArrayList();
        }

        return this.xejmGridlb;
    }

    public void setXejmGridlb(List<XejmGridlb> xejmGridlb) {
        this.xejmGridlb = xejmGridlb;
    }
}
