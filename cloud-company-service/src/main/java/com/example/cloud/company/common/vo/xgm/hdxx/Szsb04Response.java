package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"tzsxx", "xkzzszyfpmxs"}
)
@XmlRootElement(
        name = "XKZZSZYFPSWSXTZS"
)
public class Szsb04Response {
    @XmlElement(
            name = "TZSXX",
            required = true
    )
    protected TZSXXType tzsxx;
    @XmlElement(
            name = "XKZZSZYFPMXS",
            required = true
    )
    protected XKZZSZYFPMXS xkzzszyfpmxs;

    public Szsb04Response() {
    }

    public TZSXXType getTzsxx() {
        return this.tzsxx;
    }

    public void setTzsxx(TZSXXType tzsxx) {
        this.tzsxx = tzsxx;
    }

    public XKZZSZYFPMXS getXkzzszyfpmxs() {
        return this.xkzzszyfpmxs;
    }

    public void setXkzzszyfpmxs(XKZZSZYFPMXS xkzzszyfpmxs) {
        this.xkzzszyfpmxs = xkzzszyfpmxs;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"xkzzszyfpmx"}
    )
    public static class XKZZSZYFPMXS {
        @XmlElement(
                name = "XKZZSZYFPMX"
        )
        protected List<XKZZSZYFPMXType> xkzzszyfpmx;

        public XKZZSZYFPMXS() {
        }

        public List<XKZZSZYFPMXType> getXkzzszyfpmx() {
            if (this.xkzzszyfpmx == null) {
                this.xkzzszyfpmx = new ArrayList();
            }

            return this.xkzzszyfpmx;
        }
    }
}

