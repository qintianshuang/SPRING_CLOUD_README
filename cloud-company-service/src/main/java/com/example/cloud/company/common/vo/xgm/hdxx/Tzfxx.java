package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Tzfxx",
        propOrder = {"tzfhhhrmc", "gjhdqszdm", "tzfhhhrzjzldm", "tzfhhhrzjhm", "tzbl"}
)
public class Tzfxx {
    @XmlElement(
            name = "TZFHHHRMC",
            required = true
    )
    protected String tzfhhhrmc = "";
    @XmlElement(
            name = "GJHDQSZDM",
            required = true
    )
    protected String gjhdqszdm = "";
    @XmlElement(
            name = "TZFHHHRZJZLDM",
            required = true
    )
    protected String tzfhhhrzjzldm = "";
    @XmlElement(
            name = "TZFHHHRZJHM",
            required = true
    )
    protected String tzfhhhrzjhm = "";
    @XmlElement(
            name = "TZBL",
            required = true
    )
    protected String tzbl = "";

    public Tzfxx() {
    }

    public String getTzfhhhrmc() {
        return this.tzfhhhrmc;
    }

    public void setTzfhhhrmc(String tzfhhhrmc) {
        this.tzfhhhrmc = tzfhhhrmc;
    }

    public String getTzfhhhrzjzldm() {
        return this.tzfhhhrzjzldm;
    }

    public void setTzfhhhrzjzldm(String tzfhhhrzjzldm) {
        this.tzfhhhrzjzldm = tzfhhhrzjzldm;
    }

    public String getTzfhhhrzjhm() {
        return this.tzfhhhrzjhm;
    }

    public void setTzfhhhrzjhm(String tzfhhhrzjhm) {
        this.tzfhhhrzjhm = tzfhhhrzjhm;
    }

    public String getTzbl() {
        return this.tzbl;
    }

    public void setTzbl(String tzbl) {
        this.tzbl = tzbl;
    }

    public String getGjhdqszdm() {
        return this.gjhdqszdm;
    }

    public void setGjhdqszdm(String gjhdqszdm) {
        this.gjhdqszdm = gjhdqszdm;
    }
}

