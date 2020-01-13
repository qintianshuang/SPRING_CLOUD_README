package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CSBZSPM",
        propOrder = {"PMBM", "MC", "ZZSSL", "YYSSL", "ZZSCEBZ", "YYSCSBZ", "YYSQMYE", "YYSQCYE"}
)
public class CSBZSPMVo {
    @XmlElement(
            name = "PMBM",
            required = true
    )
    protected String PMBM = "";
    @XmlElement(
            name = "MC",
            required = true
    )
    protected String MC = "";
    @XmlElement(
            name = "ZZSSL",
            required = true
    )
    protected String ZZSSL;
    @XmlElement(
            name = "YYSSL",
            required = true
    )
    protected String YYSSL;
    @XmlElement(
            name = "ZZSCEBZ",
            required = true
    )
    protected String ZZSCEBZ = "";
    @XmlElement(
            name = "YYSCSBZ",
            required = true
    )
    protected String YYSCSBZ = "";
    @XmlElement(
            name = "YYSQMYE",
            required = true
    )
    protected String YYSQMYE = "";
    @XmlElement(
            name = "YYSQCYE",
            required = true
    )
    protected String YYSQCYE = "";

    public CSBZSPMVo() {
    }

    public String getPMBM() {
        return this.PMBM;
    }

    public void setPMBM(String pMBM) {
        this.PMBM = pMBM;
    }

    public String getMC() {
        return this.MC;
    }

    public void setMC(String mC) {
        this.MC = mC;
    }

    public String getZZSSL() {
        return this.ZZSSL;
    }

    public void setZZSSL(String zZSSL) {
        this.ZZSSL = zZSSL;
    }

    public String getYYSSL() {
        return this.YYSSL;
    }

    public void setYYSSL(String yYSSL) {
        this.YYSSL = yYSSL;
    }

    public String getZZSCEBZ() {
        return this.ZZSCEBZ;
    }

    public void setZZSCEBZ(String zZSCEBZ) {
        this.ZZSCEBZ = zZSCEBZ;
    }

    public String getYYSCSBZ() {
        return this.YYSCSBZ;
    }

    public void setYYSCSBZ(String yYSCSBZ) {
        this.YYSCSBZ = yYSCSBZ;
    }

    public String getYYSQMYE() {
        return this.YYSQMYE;
    }

    public void setYYSQMYE(String yYSQMYE) {
        this.YYSQMYE = yYSQMYE;
    }

    public String getYYSQCYE() {
        return this.YYSQCYE;
    }

    public void setYYSQCYE(String yYSQCYE) {
        this.YYSQCYE = yYSQCYE;
    }
}
