package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "sbskxxGrid",
        propOrder = {"sbskxxGridlb"}
)
public class SbskxxGrid {
    private List<SbskxxGridlb> sbskxxGridlb;

    public SbskxxGrid() {
    }

    public List<SbskxxGridlb> getSbskxxGridlb() {
        if (this.sbskxxGridlb == null) {
            this.sbskxxGridlb = new ArrayList();
        }

        return this.sbskxxGridlb;
    }

    public void setSbskxxGridlb(List<SbskxxGridlb> sbskxxGridlb) {
        this.sbskxxGridlb = sbskxxGridlb;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "sbskxxGridlb",
            propOrder = {"yf", "fzspmDm", "zspmDm", "zszmDm", "jsjsdwmc", "jldwDm", "zbz", "tzcwxs", "wrdlz", "wrdls", "sl1", "ynse", "ssjmxzDm", "swsxDm", "jmse", "yjse", "ybtse"}
    )
    public static class SbskxxGridlb {
        private String yf = "";
        private String fzspmDm = "";
        private String zspmDm = "";
        private String zszmDm = "";
        private String jsjsdwmc = "";
        private String jldwDm = "";
        private String zbz = "";
        private String tzcwxs = "";
        private String wrdlz = "";
        private String wrdls = "";
        private String sl1 = "";
        private String ynse = "";
        private String ssjmxzDm = "";
        private String swsxDm = "";
        private String jmse = "";
        private String yjse = "";
        private String ybtse = "";

        public SbskxxGridlb() {
        }

        public String getYf() {
            return this.yf;
        }

        public void setYf(String yf) {
            this.yf = yf;
        }

        public String getFzspmDm() {
            return this.fzspmDm;
        }

        public void setFzspmDm(String fzspmDm) {
            this.fzspmDm = fzspmDm;
        }

        public String getZspmDm() {
            return this.zspmDm;
        }

        public void setZspmDm(String zspmDm) {
            this.zspmDm = zspmDm;
        }

        public String getZszmDm() {
            return this.zszmDm;
        }

        public void setZszmDm(String zszmDm) {
            this.zszmDm = zszmDm;
        }

        public String getJsjsdwmc() {
            return this.jsjsdwmc;
        }

        public void setJsjsdwmc(String jsjsdwmc) {
            this.jsjsdwmc = jsjsdwmc;
        }

        public String getJldwDm() {
            return this.jldwDm;
        }

        public void setJldwDm(String jldwDm) {
            this.jldwDm = jldwDm;
        }

        public String getZbz() {
            return this.zbz;
        }

        public void setZbz(String zbz) {
            this.zbz = zbz;
        }

        public String getTzcwxs() {
            return this.tzcwxs;
        }

        public void setTzcwxs(String tzcwxs) {
            this.tzcwxs = tzcwxs;
        }

        public String getWrdlz() {
            return this.wrdlz;
        }

        public void setWrdlz(String wrdlz) {
            this.wrdlz = wrdlz;
        }

        public String getWrdls() {
            return this.wrdls;
        }

        public void setWrdls(String wrdls) {
            this.wrdls = wrdls;
        }

        public String getSl1() {
            return this.sl1;
        }

        public void setSl1(String sl1) {
            this.sl1 = sl1;
        }

        public String getYnse() {
            return this.ynse;
        }

        public void setYnse(String ynse) {
            this.ynse = ynse;
        }

        public String getSsjmxzDm() {
            return this.ssjmxzDm;
        }

        public void setSsjmxzDm(String ssjmxzDm) {
            this.ssjmxzDm = ssjmxzDm;
        }

        public String getSwsxDm() {
            return this.swsxDm;
        }

        public void setSwsxDm(String swsxDm) {
            this.swsxDm = swsxDm;
        }

        public String getJmse() {
            return this.jmse;
        }

        public void setJmse(String jmse) {
            this.jmse = jmse;
        }

        public String getYjse() {
            return this.yjse;
        }

        public void setYjse(String yjse) {
            this.yjse = yjse;
        }

        public String getYbtse() {
            return this.ybtse;
        }

        public void setYbtse(String ybtse) {
            this.ybtse = ybtse;
        }
    }
}

