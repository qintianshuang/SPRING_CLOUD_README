package com.example.cloud.company.common.vo.xgm.hdxx;

import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.ZspmGridlbVO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SBSbxxJhVO1",
        propOrder = {"zsxmDm", "zspmDm", "zszmDm", "hyDm", "nsqxDm", "zsdlfsDm", "jkqxDm", "sbqxDm", "jkqx", "ssyhlxDm", "yjze", "skssqq", "skssqz", "djzclxDm", "dwlsgxDm", "zsfsDm", "xssr", "jsyj", "sbqx", "sl", "zsl", "se", "ssglyDm", "skssswjgDm", "zgswskfjDm", "swjgDm", "yjse1", "jmse", "yjse", "ynse", "hdynsjye", "hztykcjye", "sybh", "kjdjxh", "rdzsuuid", "rdpzuuid", "zfsbz", "yslwqzd", "xshwqzd", "jdxzDm", "hdbl", "hdse", "zhjzl", "sl1", "wdqzdbz", "jsbz1", "yssdl", "ysbje", "kce", "sfysb", "lsbbz", "rdyxqq", "rdyxqz", "zszmGrid", "zspmGrid", "sfsfzrd", "zsxmMc", "zspmMc", "zszmMc", "yfkd", "qzd", "hdbl1"}
)
public class HdSBSbxxJhVO {
    protected String zsxmDm;
    protected String zspmDm;
    protected String zszmDm;
    protected String hyDm;
    protected String nsqxDm;
    protected String zsdlfsDm;
    protected String jkqxDm;
    protected String sbqxDm;
    protected String jkqx;
    protected String ssyhlxDm;
    protected Double yjze;
    protected String skssqq;
    protected String skssqz;
    protected String djzclxDm;
    protected String dwlsgxDm;
    protected String zsfsDm;
    protected Double xssr;
    protected Double jsyj;
    protected String sbqx;
    protected Double sl;
    protected Double zsl;
    protected Double se;
    protected String ssglyDm;
    protected String skssswjgDm;
    protected String zgswskfjDm;
    protected String swjgDm;
    protected Double yjse1;
    protected Double jmse;
    protected Double yjse;
    protected Double ynse;
    protected Double hdynsjye;
    protected Double hztykcjye;
    protected String sybh;
    protected String kjdjxh;
    protected String rdzsuuid;
    protected String rdpzuuid;
    protected String zfsbz;
    protected Double yslwqzd;
    protected Double xshwqzd;
    protected String jdxzDm;
    @XmlJavaTypeAdapter(SixDecimalAdapter.class)
    protected Double hdbl;
    @XmlJavaTypeAdapter(TwoDecimalAdapter.class)
    protected Double hdse;
    protected Double zhjzl;
    @XmlJavaTypeAdapter(SixDecimalAdapter.class)
    protected Double sl1;
    protected String wdqzdbz;
    protected String jsbz1;
    protected Double yssdl;
    protected Double ysbje;
    protected String kce;
    protected String sfysb;
    protected String lsbbz;
    protected String rdyxqq;
    protected String rdyxqz;
    protected String sfsfzrd;
    protected ZszmGrid zszmGrid;
    protected ZspmGrid zspmGrid;
    protected String zsxmMc;
    protected String zspmMc;
    protected String zszmMc;
    protected Double yfkd;
    protected Double qzd;
    protected String hdbl1;

    public HdSBSbxxJhVO() {
    }

    public Double getYfkd() {
        return this.yfkd;
    }

    public void setYfkd(Double yfkd) {
        this.yfkd = yfkd;
    }

    public Double getQzd() {
        return this.qzd;
    }

    public void setQzd(Double qzd) {
        this.qzd = qzd;
    }

    public String getSfsfzrd() {
        return this.sfsfzrd;
    }

    public void setSfsfzrd(String sfsfzrd) {
        this.sfsfzrd = sfsfzrd;
    }

    public ZszmGrid getZszmGrid() {
        return this.zszmGrid;
    }

    public void setZszmGrid(ZszmGrid zszmGrid) {
        this.zszmGrid = zszmGrid;
    }

    public ZspmGrid getZspmGrid() {
        return this.zspmGrid;
    }

    public void setZspmGrid(ZspmGrid zspmGrid) {
        this.zspmGrid = zspmGrid;
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

    public String getZszmMc() {
        return this.zszmMc;
    }

    public void setZszmMc(String zszmMc) {
        this.zszmMc = zszmMc;
    }

    public String getZsxmDm() {
        return this.zsxmDm;
    }

    public void setZsxmDm(String value) {
        this.zsxmDm = value;
    }

    public String getZspmDm() {
        return this.zspmDm;
    }

    public void setZspmDm(String value) {
        this.zspmDm = value;
    }

    public String getZszmDm() {
        return this.zszmDm;
    }

    public void setZszmDm(String value) {
        this.zszmDm = value;
    }

    public String getHyDm() {
        return this.hyDm;
    }

    public void setHyDm(String value) {
        this.hyDm = value;
    }

    public String getNsqxDm() {
        return this.nsqxDm;
    }

    public void setNsqxDm(String value) {
        this.nsqxDm = value;
    }

    public String getZsdlfsDm() {
        return this.zsdlfsDm;
    }

    public void setZsdlfsDm(String value) {
        this.zsdlfsDm = value;
    }

    public String getJkqxDm() {
        return this.jkqxDm;
    }

    public void setJkqxDm(String value) {
        this.jkqxDm = value;
    }

    public String getSbqxDm() {
        return this.sbqxDm;
    }

    public void setSbqxDm(String value) {
        this.sbqxDm = value;
    }

    public String getJkqx() {
        return this.jkqx;
    }

    public void setJkqx(String value) {
        this.jkqx = value;
    }

    public String getSsyhlxDm() {
        return this.ssyhlxDm;
    }

    public void setSsyhlxDm(String value) {
        this.ssyhlxDm = value;
    }

    public Double getYjze() {
        return this.yjze;
    }

    public void setYjze(Double value) {
        this.yjze = value;
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

    public String getDjzclxDm() {
        return this.djzclxDm;
    }

    public void setDjzclxDm(String value) {
        this.djzclxDm = value;
    }

    public String getDwlsgxDm() {
        return this.dwlsgxDm;
    }

    public void setDwlsgxDm(String value) {
        this.dwlsgxDm = value;
    }

    public String getZsfsDm() {
        return this.zsfsDm;
    }

    public void setZsfsDm(String value) {
        this.zsfsDm = value;
    }

    public Double getXssr() {
        return this.xssr;
    }

    public void setXssr(Double value) {
        this.xssr = value;
    }

    public Double getJsyj() {
        return this.jsyj;
    }

    public void setJsyj(Double value) {
        this.jsyj = value;
    }

    public String getSbqx() {
        return this.sbqx;
    }

    public void setSbqx(String value) {
        this.sbqx = value;
    }

    public Double getSl() {
        return this.sl;
    }

    public void setSl(Double value) {
        this.sl = value;
    }

    public Double getZsl() {
        return this.zsl;
    }

    public void setZsl(Double value) {
        this.zsl = value;
    }

    public Double getSe() {
        return this.se;
    }

    public void setSe(Double value) {
        this.se = value;
    }

    public String getSsglyDm() {
        return this.ssglyDm;
    }

    public void setSsglyDm(String value) {
        this.ssglyDm = value;
    }

    public String getSkssswjgDm() {
        return this.skssswjgDm;
    }

    public void setSkssswjgDm(String value) {
        this.skssswjgDm = value;
    }

    public String getZgswskfjDm() {
        return this.zgswskfjDm;
    }

    public void setZgswskfjDm(String value) {
        this.zgswskfjDm = value;
    }

    public String getSwjgDm() {
        return this.swjgDm;
    }

    public void setSwjgDm(String value) {
        this.swjgDm = value;
    }

    public Double getYjse1() {
        return this.yjse1;
    }

    public void setYjse1(Double value) {
        this.yjse1 = value;
    }

    public Double getJmse() {
        return this.jmse;
    }

    public void setJmse(Double value) {
        this.jmse = value;
    }

    public Double getYjse() {
        return this.yjse;
    }

    public void setYjse(Double value) {
        this.yjse = value;
    }

    public Double getYnse() {
        return this.ynse;
    }

    public void setYnse(Double value) {
        this.ynse = value;
    }

    public Double getHdynsjye() {
        return this.hdynsjye;
    }

    public void setHdynsjye(Double value) {
        this.hdynsjye = value;
    }

    public Double getHztykcjye() {
        return this.hztykcjye;
    }

    public void setHztykcjye(Double value) {
        this.hztykcjye = value;
    }

    public String getSybh() {
        return this.sybh;
    }

    public void setSybh(String value) {
        this.sybh = value;
    }

    public String getKjdjxh() {
        return this.kjdjxh;
    }

    public void setKjdjxh(String value) {
        this.kjdjxh = value;
    }

    public String getRdzsuuid() {
        return this.rdzsuuid;
    }

    public void setRdzsuuid(String value) {
        this.rdzsuuid = value;
    }

    public String getRdpzuuid() {
        return this.rdpzuuid;
    }

    public void setRdpzuuid(String value) {
        this.rdpzuuid = value;
    }

    public String getZfsbz() {
        return this.zfsbz;
    }

    public void setZfsbz(String value) {
        this.zfsbz = value;
    }

    public Double getYslwqzd() {
        return this.yslwqzd;
    }

    public void setYslwqzd(Double value) {
        this.yslwqzd = value;
    }

    public Double getXshwqzd() {
        return this.xshwqzd;
    }

    public void setXshwqzd(Double value) {
        this.xshwqzd = value;
    }

    public String getJdxzDm() {
        return this.jdxzDm;
    }

    public void setJdxzDm(String value) {
        this.jdxzDm = value;
    }

    public Double getHdbl() {
        return this.hdbl;
    }

    public void setHdbl(Double value) {
        this.hdbl = value;
    }

    public Double getHdse() {
        return this.hdse;
    }

    public void setHdse(Double value) {
        this.hdse = value;
    }

    public Double getZhjzl() {
        return this.zhjzl;
    }

    public void setZhjzl(Double value) {
        this.zhjzl = value;
    }

    public Double getSl1() {
        return this.sl1;
    }

    public void setSl1(Double value) {
        this.sl1 = value;
    }

    public String getWdqzdbz() {
        return this.wdqzdbz;
    }

    public void setWdqzdbz(String value) {
        this.wdqzdbz = value;
    }

    public String getJsbz1() {
        return this.jsbz1;
    }

    public void setJsbz1(String value) {
        this.jsbz1 = value;
    }

    public Double getYssdl() {
        return this.yssdl;
    }

    public void setYssdl(Double value) {
        this.yssdl = value;
    }

    public Double getYsbje() {
        return this.ysbje;
    }

    public void setYsbje(Double value) {
        this.ysbje = value;
    }

    public String getKce() {
        return this.kce;
    }

    public void setKce(String value) {
        this.kce = value;
    }

    public String getSfysb() {
        return this.sfysb;
    }

    public void setSfysb(String value) {
        this.sfysb = value;
    }

    public String getLsbbz() {
        return this.lsbbz;
    }

    public void setLsbbz(String value) {
        this.lsbbz = value;
    }

    public String getRdyxqq() {
        return this.rdyxqq;
    }

    public void setRdyxqq(String value) {
        this.rdyxqq = value;
    }

    public String getRdyxqz() {
        return this.rdyxqz;
    }

    public void setRdyxqz(String value) {
        this.rdyxqz = value;
    }

    public String getHdbl1() {
        return this.hdbl1;
    }

    public void setHdbl1(String hdbl1) {
        this.hdbl1 = hdbl1;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zspmGridlb"}
    )
    public static class ZspmGrid {
        protected List<ZspmGridlbVO> zspmGridlb;

        public ZspmGrid() {
        }

        public List<ZspmGridlbVO> getZspmGridlb() {
            if (this.zspmGridlb == null) {
                this.zspmGridlb = new ArrayList();
            }

            return this.zspmGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zszmGridlb"}
    )
    public static class ZszmGrid {
        protected List<ZszmGridlbVO> zszmGridlb;

        public ZszmGrid() {
        }

        public List<ZszmGridlbVO> getZszmGridlb() {
            if (this.zszmGridlb == null) {
                this.zszmGridlb = new ArrayList();
            }

            return this.zszmGridlb;
        }
    }
}
