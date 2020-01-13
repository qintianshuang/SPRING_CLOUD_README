package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ZspmVo",
        propOrder = {"smmc", "pmbm", "pmmc", "dzbm", "sl", "zsl", "ljs", "yjlj", "ljyj", "wjlj", "desl", "sllx", "desljldw", "zsxmdm", "zsxmmc", "rdpzuuid", "hdjsyj", "hdjsbl", "hydm", "zspmdm", "zspmmc", "yjse", "zspmVoList", "ZSZM", "sybz", "nsqxDm", "lx", "ysx", "xse", "zsZspmDm", "zsZspmMc"}
)
public class ZspmVo {
    @XmlElement(
            name = "SMMC",
            required = true
    )
    protected String smmc = "";
    @XmlElement(
            name = "PMBM",
            required = true
    )
    protected String pmbm = "";
    @XmlElement(
            name = "PMMC",
            required = true
    )
    protected String pmmc = "";
    @XmlElement(
            name = "DZBM",
            required = true
    )
    protected String dzbm = "";
    @XmlElement(
            name = "SL",
            required = true
    )
    protected String sl = "";
    @XmlElement(
            name = "ZSL",
            required = true
    )
    protected String zsl = "";
    @XmlElement(
            name = "LJS",
            required = true
    )
    protected String ljs = "";
    @XmlElement(
            name = "YJLJ",
            required = true
    )
    protected String yjlj = "";
    @XmlElement(
            name = "LJYJ",
            required = true
    )
    protected String ljyj = "";
    @XmlElement(
            name = "WJLJ",
            required = true
    )
    protected String wjlj = "";
    @XmlElement(
            name = "DESL",
            required = true
    )
    protected String desl = "";
    @XmlElement(
            name = "SLLX",
            required = true
    )
    protected String sllx = "";
    @XmlElement(
            name = "DESLJLDW",
            required = true
    )
    protected String desljldw = "";
    @XmlElement(
            name = "ZSXMDM",
            required = true
    )
    protected String zsxmdm = "";
    @XmlElement(
            name = "ZSXMMC",
            required = true
    )
    protected String zsxmmc = "";
    @XmlElement(
            name = "RDPZUUID",
            required = true
    )
    protected String rdpzuuid = "";
    @XmlElement(
            name = "HDJSYJ",
            required = true
    )
    protected String hdjsyj = "";
    @XmlElement(
            name = "HDJSBL",
            required = true
    )
    protected String hdjsbl = "";
    @XmlElement(
            name = "HYDM",
            required = true
    )
    protected String hydm = "";
    @XmlElement(
            name = "ZSPMDM",
            required = true
    )
    protected String zspmdm = "";
    @XmlElement(
            name = "ZSPMMC",
            required = true
    )
    protected String zspmmc = "";
    @XmlElement(
            name = "YJSE",
            required = true
    )
    protected String yjse = "";
    @XmlElement(
            name = "ZSPMVOLIST",
            required = true
    )
    protected List<ZspmlbVo> zspmVoList;
    @XmlElement(
            name = "ZSZM",
            required = true
    )
    protected List<ZszmlbVo> ZSZM;
    @XmlElement(
            name = "SYBZ",
            required = true
    )
    protected String sybz;
    @XmlElement(
            name = "NSQXDM",
            required = true
    )
    protected String nsqxDm;
    @XmlElement(
            name = "LX",
            required = true
    )
    protected String lx;
    @XmlElement(
            name = "YSX",
            required = true
    )
    protected String ysx;
    @XmlElement(
            name = "XSE",
            required = true
    )
    protected String xse;
    @XmlElement(
            name = "ZSZSPMDM",
            required = true
    )
    protected String zsZspmDm;
    @XmlElement(
            name = "ZSZSPMMC",
            required = true
    )
    protected String zsZspmMc;

    public ZspmVo() {
    }

    public String getLx() {
        return this.lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getNsqxDm() {
        return this.nsqxDm;
    }

    public void setNsqxDm(String nsqxDm) {
        this.nsqxDm = nsqxDm;
    }

    public String getSybz() {
        return this.sybz;
    }

    public void setSybz(String sybz) {
        this.sybz = sybz;
    }

    public List<ZspmlbVo> getZspmVoList() {
        return this.zspmVoList;
    }

    public void setZspmVoList(List<ZspmlbVo> zspmVoList) {
        this.zspmVoList = zspmVoList;
    }

    public List<ZszmlbVo> getZSZM() {
        return this.ZSZM;
    }

    public void setZSZM(List<ZszmlbVo> zszm) {
        this.ZSZM = zszm;
    }

    public String getZsxmmc() {
        return this.zsxmmc;
    }

    public void setZsxmmc(String zsxmmc) {
        this.zsxmmc = zsxmmc;
    }

    public String getYjse() {
        return this.yjse;
    }

    public void setYjse(String yjse) {
        this.yjse = yjse;
    }

    public String getZspmdm() {
        return this.zspmdm;
    }

    public void setZspmdm(String zspmdm) {
        this.zspmdm = zspmdm;
    }

    public String getZspmmc() {
        return this.zspmmc;
    }

    public void setZspmmc(String zspmmc) {
        this.zspmmc = zspmmc;
    }

    public String getZsxmdm() {
        return this.zsxmdm;
    }

    public void setZsxmdm(String zsxmdm) {
        this.zsxmdm = zsxmdm;
    }

    public String getRdpzuuid() {
        return this.rdpzuuid;
    }

    public void setRdpzuuid(String rdpzuuid) {
        this.rdpzuuid = rdpzuuid;
    }

    public String getSMMC() {
        return this.smmc;
    }

    public void setSMMC(String value) {
        this.smmc = value;
    }

    public String getZsZspmDm() {
        return this.zsZspmDm;
    }

    public void setZsZspmDm(String zsZspmDm) {
        this.zsZspmDm = zsZspmDm;
    }

    public String getZsZspmMc() {
        return this.zsZspmMc;
    }

    public void setZsZspmMc(String zsZspmMc) {
        this.zsZspmMc = zsZspmMc;
    }

    public String getPMBM() {
        return this.pmbm;
    }

    public void setPMBM(String value) {
        this.pmbm = value;
    }

    public String getPMMC() {
        return this.pmmc;
    }

    public void setPMMC(String value) {
        this.pmmc = value;
    }

    public String getDZBM() {
        return this.dzbm;
    }

    public void setDZBM(String value) {
        this.dzbm = value;
    }

    public String getSL() {
        return this.sl;
    }

    public void setSL(String value) {
        this.sl = value;
    }

    public String getZSL() {
        return this.zsl;
    }

    public void setZSL(String value) {
        this.zsl = value;
    }

    public String getLJS() {
        return this.ljs;
    }

    public void setLJS(String value) {
        this.ljs = value;
    }

    public String getYJLJ() {
        return this.yjlj;
    }

    public void setYJLJ(String value) {
        this.yjlj = value;
    }

    public String getLJYJ() {
        return this.ljyj;
    }

    public void setLJYJ(String value) {
        this.ljyj = value;
    }

    public String getWJLJ() {
        return this.wjlj;
    }

    public void setWJLJ(String value) {
        this.wjlj = value;
    }

    public String getDESL() {
        return this.desl;
    }

    public void setDESL(String value) {
        this.desl = value;
    }

    public String getSLLX() {
        return this.sllx;
    }

    public void setSLLX(String value) {
        this.sllx = value;
    }

    public String getDESLJLDW() {
        return this.desljldw;
    }

    public void setDESLJLDW(String value) {
        this.desljldw = value;
    }

    public String getHdjsyj() {
        return this.hdjsyj;
    }

    public void setHdjsyj(String hdjsyj) {
        this.hdjsyj = hdjsyj;
    }

    public String getHdjsbl() {
        return this.hdjsbl;
    }

    public void setHdjsbl(String hdjsbl) {
        this.hdjsbl = hdjsbl;
    }

    public String getHydm() {
        return this.hydm;
    }

    public void setHydm(String hydm) {
        this.hydm = hydm;
    }

    public String getYsx() {
        return this.ysx;
    }

    public void setYsx(String ysx) {
        this.ysx = ysx;
    }

    public String getXse() {
        return this.xse;
    }

    public void setXse(String xse) {
        this.xse = xse;
    }
}

