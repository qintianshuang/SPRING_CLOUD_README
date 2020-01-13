package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "YCFPMXSType",
        propOrder = {"wrzycfpmxs", "yrzycfpmxs"}
)
public class YCFPMXSType {
    @XmlElement(
            name = "WRZ_YCFPMXS",
            required = true
    )
    protected WRZYCFPMXS wrzycfpmxs;
    @XmlElement(
            name = "YRZ_YCFPMXS",
            required = true
    )
    protected YRZYCFPMXS yrzycfpmxs;

    public YCFPMXSType() {
    }

    public WRZYCFPMXS getWRZYCFPMXS() {
        return this.wrzycfpmxs;
    }

    public void setWRZYCFPMXS(WRZYCFPMXS value) {
        this.wrzycfpmxs = value;
    }

    public YRZYCFPMXS getYRZYCFPMXS() {
        return this.yrzycfpmxs;
    }

    public void setYRZYCFPMXS(YRZYCFPMXS value) {
        this.yrzycfpmxs = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"ycfpmx"}
    )
    public static class YRZYCFPMXS {
        @XmlElement(
                name = "YCFPMX"
        )
        protected List<YCFPMX> ycfpmx;

        public YRZYCFPMXS() {
        }

        public List<YCFPMX> getYCFPMX() {
            if (this.ycfpmx == null) {
                this.ycfpmx = new ArrayList();
            }

            return this.ycfpmx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"ycfpmx"}
    )
    public static class WRZYCFPMXS {
        @XmlElement(
                name = "YCFPMX"
        )
        protected List<YCFPMX> ycfpmx;

        public WRZYCFPMXS() {
        }

        public List<YCFPMX> getYCFPMX() {
            if (this.ycfpmx == null) {
                this.ycfpmx = new ArrayList();
            }

            return this.ycfpmx;
        }
    }
}

