package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DqwrGridlb",
        propOrder = {"zspmDm", "zszmDm", "jdxzDm", "zgswskfjDm", "zspmmc", "zszmmc", "sl1", "sjzspmDm", "zszmGridlb"}
)
public class GfwrGridlb {
    protected String zspmDm;
    protected String zszmDm;
    protected String jdxzDm;
    protected String zgswskfjDm;
    protected String zspmmc;
    protected String zszmmc;
    protected String sl1;
    protected String sjzspmDm;
    protected List<ZszmGridlbVO> zszmGridlb;

    public GfwrGridlb() {
    }

    public String getSjzspmDm() {
        return this.sjzspmDm;
    }

    public void setSjzspmDm(String sjzspmDm) {
        this.sjzspmDm = sjzspmDm;
    }

    public String getSl1() {
        return this.sl1;
    }

    public void setSl1(String sl1) {
        this.sl1 = sl1;
    }

    public List<ZszmGridlbVO> getZszmGridlb() {
        return this.zszmGridlb;
    }

    public void setZszmGridlb(List<ZszmGridlbVO> zszmGridlb) {
        this.zszmGridlb = zszmGridlb;
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

    public String getJdxzDm() {
        return this.jdxzDm;
    }

    public void setJdxzDm(String jdxzDm) {
        this.jdxzDm = jdxzDm;
    }

    public String getZgswskfjDm() {
        return this.zgswskfjDm;
    }

    public void setZgswskfjDm(String zgswskfjDm) {
        this.zgswskfjDm = zgswskfjDm;
    }

    public String getZspmmc() {
        return this.zspmmc;
    }

    public void setZspmmc(String zspmmc) {
        this.zspmmc = zspmmc;
    }

    public String getZszmmc() {
        return this.zszmmc;
    }

    public void setZszmmc(String zszmmc) {
        this.zszmmc = zszmmc;
    }
}

