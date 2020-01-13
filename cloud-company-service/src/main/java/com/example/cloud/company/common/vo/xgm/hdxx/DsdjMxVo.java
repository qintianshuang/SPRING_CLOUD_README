package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DsdjMxVo",
        propOrder = {"zspmDm", "zspmMc", "zssl"}
)
public class DsdjMxVo {
    @XmlElement(
            name = "ZSPMDM",
            required = true
    )
    protected String zspmDm = "";
    @XmlElement(
            name = "ZSPMMC",
            required = true
    )
    protected String zspmMc = "";
    @XmlElement(
            name = "ZSSL",
            required = true
    )
    protected String zssl = "";

    public DsdjMxVo() {
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getZspmMc() {
        return this.zspmMc;
    }

    public void setZspmMc(String zspmMc) {
        this.zspmMc = zspmMc;
    }

    public String getZssl() {
        return this.zssl;
    }

    public void setZssl(String zssl) {
        this.zssl = zssl;
    }
}
