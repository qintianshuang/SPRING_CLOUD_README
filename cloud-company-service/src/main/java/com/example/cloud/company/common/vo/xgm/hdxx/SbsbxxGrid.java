package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"sbxxGridlb"}
)
public class SbsbxxGrid {
    @XmlElement(
            required = true
    )
    protected List<SbxxGridlb> sbxxGridlb;

    public SbsbxxGrid() {
    }

    public List<SbxxGridlb> getSbxxGridlb() {
        if (this.sbxxGridlb == null) {
            this.sbxxGridlb = new ArrayList();
        }

        return this.sbxxGridlb;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"sblsh", "sbshrq", "sbjbjgDm", "sbjbjgMc", "sbbm", "zsxmDm", "zsxmMc", "sjzspmDm", "zspmDm", "zspmMc", "zszmDm", "zszmMc", "skssqq", "skssqz", "jfrs", "jfjs", "jfbl", "yjfe", "xxh", "bz", "sbdjSwjgDm", "sbdjZgswksfjDm"}
    )
    public static class SbxxGridlb {
        @XmlElement(
                required = true
        )
        protected String sblsh = "";
        @XmlElement(
                required = true
        )
        protected String sbshrq = "";
        @XmlElement(
                required = true
        )
        protected String sbjbjgDm = "";
        @XmlElement(
                required = true
        )
        protected String sbjbjgMc = "";
        @XmlElement(
                required = true
        )
        protected String sbbm = "";
        @XmlElement(
                required = true
        )
        protected String zsxmDm = "";
        @XmlElement(
                required = true
        )
        protected String zsxmMc = "";
        @XmlElement(
                required = true
        )
        protected String sjzspmDm = "";
        @XmlElement(
                required = true
        )
        protected String zspmDm = "";
        @XmlElement(
                required = true
        )
        protected String zspmMc = "";
        @XmlElement(
                required = true
        )
        protected String zszmDm = "";
        @XmlElement(
                required = true
        )
        protected String zszmMc = "";
        @XmlElement(
                required = true
        )
        protected String skssqq = "";
        @XmlElement(
                required = true
        )
        protected String skssqz = "";
        @XmlElement(
                required = true
        )
        protected String jfrs = "";
        @XmlElement(
                required = true
        )
        protected String jfjs = "";
        @XmlElement(
                required = true
        )
        protected String jfbl = "";
        @XmlElement(
                required = true
        )
        protected String yjfe = "";
        @XmlElement(
                required = true
        )
        protected String xxh = "";
        @XmlElement(
                required = true
        )
        protected String bz = "";
        @XmlElement(
                required = true
        )
        protected String sbdjSwjgDm = "";
        @XmlElement(
                required = true
        )
        protected String sbdjZgswksfjDm = "";

        public SbxxGridlb() {
        }

        public String getSbdjSwjgDm() {
            return this.sbdjSwjgDm;
        }

        public void setSbdjSwjgDm(String sbdjSwjgDm) {
            this.sbdjSwjgDm = sbdjSwjgDm;
        }

        public String getSbdjZgswksfjDm() {
            return this.sbdjZgswksfjDm;
        }

        public void setSbdjZgswksfjDm(String sbdjZgswksfjDm) {
            this.sbdjZgswksfjDm = sbdjZgswksfjDm;
        }

        public String getSblsh() {
            return this.sblsh;
        }

        public void setSblsh(String value) {
            this.sblsh = value;
        }

        public String getSbshrq() {
            return this.sbshrq;
        }

        public void setSbshrq(String value) {
            this.sbshrq = value;
        }

        public String getSbjbjgDm() {
            return this.sbjbjgDm;
        }

        public void setSbjbjgDm(String value) {
            this.sbjbjgDm = value;
        }

        public String getSbjbjgMc() {
            return this.sbjbjgMc;
        }

        public void setSbjbjgMc(String value) {
            this.sbjbjgMc = value;
        }

        public String getSbbm() {
            return this.sbbm;
        }

        public void setSbbm(String value) {
            this.sbbm = value;
        }

        public String getZsxmDm() {
            return this.zsxmDm;
        }

        public void setZsxmDm(String value) {
            this.zsxmDm = value;
        }

        public String getZsxmMc() {
            return this.zsxmMc;
        }

        public void setZsxmMc(String value) {
            this.zsxmMc = value;
        }

        public String getSjzspmDm() {
            return this.sjzspmDm;
        }

        public void setSjzspmDm(String value) {
            this.sjzspmDm = value;
        }

        public String getZspmDm() {
            return this.zspmDm;
        }

        public void setZspmDm(String value) {
            this.zspmDm = value;
        }

        public String getZspmMc() {
            return this.zspmMc;
        }

        public void setZspmMc(String value) {
            this.zspmMc = value;
        }

        public String getZszmDm() {
            return this.zszmDm;
        }

        public void setZszmDm(String value) {
            this.zszmDm = value;
        }

        public String getZszmMc() {
            return this.zszmMc;
        }

        public void setZszmMc(String value) {
            this.zszmMc = value;
        }

        public String getSkssqq() {
            return this.skssqq;
        }

        public void setSkssqq(String value) {
            this.skssqq = value;
        }

        public String getSkssqz() {
            return this.skssqz;
        }

        public void setSkssqz(String value) {
            this.skssqz = value;
        }

        public String getJfrs() {
            return this.jfrs;
        }

        public void setJfrs(String value) {
            this.jfrs = value;
        }

        public String getJfjs() {
            return this.jfjs;
        }

        public void setJfjs(String value) {
            this.jfjs = value;
        }

        public String getJfbl() {
            return this.jfbl;
        }

        public void setJfbl(String value) {
            this.jfbl = value;
        }

        public String getYjfe() {
            return this.yjfe;
        }

        public void setYjfe(String value) {
            this.yjfe = value;
        }

        public String getXxh() {
            return this.xxh;
        }

        public void setXxh(String value) {
            this.xxh = value;
        }

        public String getBz() {
            return this.bz;
        }

        public void setBz(String value) {
            this.bz = value;
        }
    }
}

