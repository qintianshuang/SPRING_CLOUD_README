package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "KshztlZzskfpdjbsVo",
        propOrder = {"kshztlzzskfpdjb"}
)
public class KshztlZzskfpdjbsVo {
    @XmlElement(
            name = "KSHZTLZZSKFPDJB",
            required = true
    )
    protected List<KSHZTLZZSKFPDJB> kshztlzzskfpdjb;

    public KshztlZzskfpdjbsVo() {
    }

    public List<KSHZTLZZSKFPDJB> getKSHZTLZZSKFPDJB() {
        if (this.kshztlzzskfpdjb == null) {
            this.kshztlzzskfpdjb = new ArrayList();
        }

        return this.kshztlzzskfpdjb;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"djxh", "nsrsbh", "nsrmc", "zgswjgmc", "fpbl", "zcdbz"}
    )
    public static class KSHZTLZZSKFPDJB {
        @XmlElement(
                name = "DJXH",
                required = true
        )
        protected String djxh;
        @XmlElement(
                name = "NSRSBH",
                required = true
        )
        protected String nsrsbh;
        @XmlElement(
                name = "NSRMC",
                required = true
        )
        protected String nsrmc;
        @XmlElement(
                name = "ZG_SWJG_MC",
                required = true
        )
        protected String zgswjgmc;
        @XmlElement(
                name = "FPBL",
                required = true
        )
        protected String fpbl;
        @XmlElement(
                name = "ZCD_BZ",
                required = true
        )
        protected String zcdbz;

        public KSHZTLZZSKFPDJB() {
        }

        public String getDJXH() {
            return this.djxh;
        }

        public void setDJXH(String value) {
            this.djxh = value;
        }

        public String getNSRSBH() {
            return this.nsrsbh;
        }

        public void setNSRSBH(String value) {
            this.nsrsbh = value;
        }

        public String getNSRMC() {
            return this.nsrmc;
        }

        public void setNSRMC(String value) {
            this.nsrmc = value;
        }

        public String getZGSWJGMC() {
            return this.zgswjgmc;
        }

        public void setZGSWJGMC(String value) {
            this.zgswjgmc = value;
        }

        public String getFPBL() {
            return this.fpbl;
        }

        public void setFPBL(String value) {
            this.fpbl = value;
        }

        public String getZCDBZ() {
            return this.zcdbz;
        }

        public void setZCDBZ(String value) {
            this.zcdbz = value;
        }
    }
}
