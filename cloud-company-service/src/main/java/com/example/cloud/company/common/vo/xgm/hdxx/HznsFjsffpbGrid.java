package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "HznsFjsffpbGrid",
        propOrder = {"hznsFjsffpbGridlb"}
)
public class HznsFjsffpbGrid implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement(
            name = "HZNSFJSFFPBGRIDLB",
            required = true
    )
    private List<HznsFjsffpbGridlb> hznsFjsffpbGridlb;

    public HznsFjsffpbGrid() {
    }

    public List<HznsFjsffpbGridlb> getHznsFjsffpbGridlb() {
        if (this.hznsFjsffpbGridlb == null) {
            this.hznsFjsffpbGridlb = new ArrayList();
        }

        return this.hznsFjsffpbGridlb;
    }

    public void setHznsFjsffpbGridlb(List<HznsFjsffpbGridlb> hznsFjsffpbGridlb) {
        this.hznsFjsffpbGridlb = hznsFjsffpbGridlb;
    }
}

