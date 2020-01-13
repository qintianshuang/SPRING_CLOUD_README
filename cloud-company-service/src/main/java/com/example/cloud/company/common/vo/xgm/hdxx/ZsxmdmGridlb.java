package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZsxmdmGridlb",
        propOrder = {"zsxmDm", "zsxmMc", "yjse"}
)
public class ZsxmdmGridlb {
    private String zsxmDm;
    private String zsxmMc;
    private String yjse;

    public ZsxmdmGridlb() {
    }

    public String getZsxmDm() {
        return this.zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    public String getZsxmMc() {
        return this.zsxmMc;
    }

    public void setZsxmMc(String zsxmMc) {
        this.zsxmMc = zsxmMc;
    }

    public String getYjse() {
        return this.yjse;
    }

    public void setYjse(String yjse) {
        this.yjse = yjse;
    }
}

