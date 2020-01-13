package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"tzsxx", "ycfpmxs"}
)
@XmlRootElement(
        name = "Szsb03Response"
)
public class Szsb03Response {
    @XmlElement(
            name = "TZSXX",
            required = true
    )
    protected TZSXXType tzsxx;
    @XmlElement(
            name = "YCFPMXS",
            required = true
    )
    protected YCFPMXSType ycfpmxs;

    public Szsb03Response() {
    }

    public TZSXXType getTZSXX() {
        return this.tzsxx;
    }

    public void setTZSXX(TZSXXType value) {
        this.tzsxx = value;
    }

    public YCFPMXSType getYCFPMXS() {
        return this.ycfpmxs;
    }

    public void setYCFPMXS(YCFPMXSType value) {
        this.ycfpmxs = value;
    }
}

