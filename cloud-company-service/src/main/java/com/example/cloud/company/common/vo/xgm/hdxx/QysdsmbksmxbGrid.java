package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"qysdsmbksmxbGridlb"}
)
public class QysdsmbksmxbGrid {
    @XmlElement(
            name = "QYSDSMBKSMXBGRIDLB"
    )
    private List<QysdsmbksmxbGridlb> qysdsmbksmxbGridlb;

    public QysdsmbksmxbGrid() {
    }

    public List<QysdsmbksmxbGridlb> getQysdsmbksmxbGridlb() {
        if (this.qysdsmbksmxbGridlb == null) {
            this.qysdsmbksmxbGridlb = new ArrayList();
        }

        return this.qysdsmbksmxbGridlb;
    }

    public void setQysdsmbksmxbGridlb(List<QysdsmbksmxbGridlb> qysdsmbksmxbGridlb) {
        this.qysdsmbksmxbGridlb = qysdsmbksmxbGridlb;
    }
}

