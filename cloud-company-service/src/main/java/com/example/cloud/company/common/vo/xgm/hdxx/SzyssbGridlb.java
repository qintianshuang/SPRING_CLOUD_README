package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "szyssbGridlb",
        propOrder = {"zsxmDm", "zspmDm", "sqljqsl", "bqqsl", "bqljqsl", "ljcjhqsl", "cjhqsbl", "sl1", "bqjsqsl", "hyhlshl", "bqynse", "bqjmse", "bqyjse", "bqybtse", "zsxmMc", "zspmMc", "zszmGrid", "tsyslbjhDm"}
)
public class SzyssbGridlb {
    @XmlElement(
            required = true
    )
    protected String zsxmDm;
    @XmlElement(
            required = true
    )
    protected String zsxmMc;
    @XmlElement(
            required = true
    )
    protected String zspmDm;
    @XmlElement(
            required = true
    )
    protected String zspmMc;
    @XmlElement(
            required = true
    )
    protected String sqljqsl;
    @XmlElement(
            required = true
    )
    protected String bqqsl;
    @XmlElement(
            required = true
    )
    protected String bqljqsl;
    @XmlElement(
            required = true
    )
    protected String ljcjhqsl;
    @XmlElement(
            required = true
    )
    protected String cjhqsbl;
    @XmlElement(
            required = true
    )
    protected String sl1;
    @XmlElement(
            required = true
    )
    protected String bqjsqsl;
    @XmlElement(
            required = true
    )
    protected String hyhlshl;
    @XmlElement(
            required = true
    )
    protected String bqynse;
    @XmlElement(
            required = true
    )
    protected String bqjmse;
    @XmlElement(
            required = true
    )
    protected String bqyjse;
    @XmlElement(
            required = true
    )
    protected String bqybtse;
    @XmlElement(
            required = true
    )
    protected String tsyslbjhDm;
    @XmlElement(
            required = true
    )
    protected List<ZszmlbVo> zszmGrid;

    public SzyssbGridlb() {
    }

    public String getZsxmDm() {
        return this.zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getSqljqsl() {
        return this.sqljqsl;
    }

    public void setSqljqsl(String sqljqsl) {
        this.sqljqsl = sqljqsl;
    }

    public String getBqqsl() {
        return this.bqqsl;
    }

    public void setBqqsl(String bqqsl) {
        this.bqqsl = bqqsl;
    }

    public String getBqljqsl() {
        return this.bqljqsl;
    }

    public void setBqljqsl(String bqljqsl) {
        this.bqljqsl = bqljqsl;
    }

    public String getLjcjhqsl() {
        return this.ljcjhqsl;
    }

    public void setLjcjhqsl(String ljcjhqsl) {
        this.ljcjhqsl = ljcjhqsl;
    }

    public String getCjhqsbl() {
        return this.cjhqsbl;
    }

    public void setCjhqsbl(String cjhqsbl) {
        this.cjhqsbl = cjhqsbl;
    }

    public String getSl1() {
        return this.sl1;
    }

    public void setSl1(String sl1) {
        this.sl1 = sl1;
    }

    public String getBqjsqsl() {
        return this.bqjsqsl;
    }

    public void setBqjsqsl(String bqjsqsl) {
        this.bqjsqsl = bqjsqsl;
    }

    public String getHyhlshl() {
        return this.hyhlshl;
    }

    public void setHyhlshl(String hyhlshl) {
        this.hyhlshl = hyhlshl;
    }

    public String getBqynse() {
        return this.bqynse;
    }

    public void setBqynse(String bqynse) {
        this.bqynse = bqynse;
    }

    public String getBqjmse() {
        return this.bqjmse;
    }

    public void setBqjmse(String bqjmse) {
        this.bqjmse = bqjmse;
    }

    public String getBqyjse() {
        return this.bqyjse;
    }

    public void setBqyjse(String bqyjse) {
        this.bqyjse = bqyjse;
    }

    public String getBqybtse() {
        return this.bqybtse;
    }

    public void setBqybtse(String bqybtse) {
        this.bqybtse = bqybtse;
    }

    public String getZsxmMc() {
        return this.zsxmMc;
    }

    public void setZsxmMc(String zsxmMc) {
        this.zsxmMc = zsxmMc;
    }

    public String getZspmMc() {
        return this.zspmMc;
    }

    public void setZspmMc(String zspmMc) {
        this.zspmMc = zspmMc;
    }

    public String getTsyslbjhDm() {
        return this.tsyslbjhDm;
    }

    public void setTsyslbjhDm(String tsyslbjhDm) {
        this.tsyslbjhDm = tsyslbjhDm;
    }

    public List<ZszmlbVo> getZszmGrid() {
        if (null == this.zszmGrid) {
            this.zszmGrid = new ArrayList();
        }
        return this.zszmGrid;
    }
}

