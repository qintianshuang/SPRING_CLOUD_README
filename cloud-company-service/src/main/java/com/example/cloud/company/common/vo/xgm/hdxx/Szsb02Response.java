package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"tzsxx", "skfpmxs"}
)
@XmlRootElement(
        name = "Szsb02Response"
)
public class Szsb02Response {
    @XmlElement(
            name = "TZSXX",
            required = true
    )
    protected TZSXXType tzsxx;
    @XmlElement(
            name = "SKFPMXS",
            required = true
    )
    protected SKFPMXS skfpmxs;

    public Szsb02Response() {
    }

    public TZSXXType getTZSXX() {
        return this.tzsxx;
    }

    public void setTZSXX(TZSXXType value) {
        this.tzsxx = value;
    }

    public SKFPMXS getSKFPMXS() {
        return this.skfpmxs;
    }

    public void setSKFPMXS(SKFPMXS value) {
        this.skfpmxs = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"skfpmx"}
    )
    public static class SKFPMXS {
        @XmlElement(
                name = "SKFPMX"
        )
        protected List<SKFPMXType> skfpmx;

        public SKFPMXS() {
        }

        public List<SKFPMXType> getSKFPMX() {
            if (this.skfpmx == null) {
                this.skfpmx = new ArrayList();
            }

            return this.skfpmx;
        }
    }
}

