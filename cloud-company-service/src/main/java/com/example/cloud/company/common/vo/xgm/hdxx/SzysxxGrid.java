package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "szysxxGrid",
        propOrder = {"szyssbGridlb"}
)
public class SzysxxGrid {
    @XmlElement(
            required = true
    )
    protected List<SzyssbGridlb> szyssbGridlb;

    public SzysxxGrid() {
    }

    public void setSzyssbGridlb(List<SzyssbGridlb> szyssbGridlb) {
        this.szyssbGridlb = szyssbGridlb;
    }

    public List<SzyssbGridlb> getSzyssbGridlb() {
        if (this.szyssbGridlb == null) {
            this.szyssbGridlb = new ArrayList();
        }

        return this.szyssbGridlb;
    }
}

