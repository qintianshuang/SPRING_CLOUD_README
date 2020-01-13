package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "xejmGridlb",
        propOrder = {"swsxDm", "hbyj", "swsxmc"}
)
public class XejmGridlb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String swsxDm;
    private String hbyj;
    private String swsxmc;

    public XejmGridlb() {
    }

    public String getSwsxDm() {
        return this.swsxDm;
    }

    public void setSwsxDm(String swsxDm) {
        this.swsxDm = swsxDm;
    }

    public String getHbyj() {
        return this.hbyj;
    }

    public void setHbyj(String hbyj) {
        this.hbyj = hbyj;
    }

    public String getSwsxmc() {
        return this.swsxmc;
    }

    public void setSwsxmc(String swsxmc) {
        this.swsxmc = swsxmc;
    }
}
