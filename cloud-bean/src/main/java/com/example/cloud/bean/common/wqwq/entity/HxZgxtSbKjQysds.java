package com.example.cloud.bean.common.wqwq.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("HX_ZGXT_SB_KJ_QYSDS")
public class HxZgxtSbKjQysds implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("UUID")
    private String uuid;

    @TableField("PZXH")
    private Long pzxh;

    @TableField("SBUUID")
    private String sbuuid;

    @TableField("KJYWRSBH")
    private String kjywrsbh;

    @TableField("KJYWRMC")
    private String kjywrmc;

    @TableField("KJYWLX")
    private String kjywlx;

    @TableField("HY_DM")
    private String hyDm;

    @TableField("KJYWRMC_1")
    private String kjywrmc1;

    @TableField("KJYWRYWMC")
    private String kjywrywmc;

    @TableField("KJYWR_ZCDZ")
    private String kjywrZcdz;

    @TableField("KJYWR_YWDZ")
    private String kjywrYwdz;

    @TableField("KJYWR_JJLX_DM")
    private String kjywrJjlxDm;

    @TableField("KJYWR_JJLXMC")
    private String kjywrJjlxmc;

    @TableField("KJYWRJJHYFL_DM")
    private String kjywrjjhyflDm;

    @TableField("KJYWR_JJXYFLMC")
    private String kjywrJjxyflmc;

    @TableField("KJYWR_LXR")
    private String kjywrLxr;

    @TableField("KJYWR_LXDH")
    private String kjywrLxdh;

    @TableField("KJYWRYZBM")
    private String kjywryzbm;

    @TableField("NSRZQJMGNSSBH")
    private String nsrzqjmgnssbh;

    @TableField("NSRZQJMG_DQ_MCJDM")
    private String nsrzqjmgDqMcjdm;

    @TableField("NSRZWMC")
    private String nsrzwmc;

    @TableField("NSRYWMC")
    private String nsrywmc;

    @TableField("JMGNSR_ZWMC")
    private String jmgnsrZwmc;

    @TableField("JMGNSR_YWMC")
    private String jmgnsrYwmc;

    @TableField("NSRZQJMGZWDZ")
    private String nsrzqjmgzwdz;

    @TableField("NSRZQJMGYWDZ")
    private String nsrzqjmgywdz;

    @TableField("SBSDLXJDM")
    private String sbsdlxjdm;

    @TableField("BCSBSDQDRQ")
    private LocalDateTime bcsbsdqdrq;

    @TableField("HTMC")
    private String htmc;

    @TableField("HTBH")
    private String htbh;

    @TableField("HTZXQSSJ")
    private LocalDateTime htzxqssj;

    @TableField("HTZXZZSJ")
    private LocalDateTime htzxzzsj;

    @TableField("HTZJE")
    private BigDecimal htzje;

    @TableField("BCSBSRRMBJE")
    private BigDecimal bcsbsrrmbje;

    @TableField("BCSBSRWBMC")
    private String bcsbsrwbmc;

    @TableField("BCSBSRWBJE")
    private BigDecimal bcsbsrwbje;

    @TableField("BCSBSRWBHL")
    private BigDecimal bcsbsrwbhl;

    @TableField("BCSBSRWBZSRMBJE")
    private BigDecimal bcsbsrwbzsrmbje;

    @TableField("BCSBSRRMBJEHJ")
    private BigDecimal bcsbsrrmbjehj;

    @TableField("KCE")
    private BigDecimal kce;

    @TableField("YNSSDE")
    private BigDecimal ynssde;

    @TableField("FDYQ_KJSYSL")
    private BigDecimal fdyqKjsysl;

    @TableField("YJN_QYSDSE")
    private BigDecimal yjnQysdse;

    @TableField("FDYQ_KJSJZSL")
    private BigDecimal fdyqKjsjzsl;

    @TableField("FDYQ_KJSJYJNQYSDSE")
    private BigDecimal fdyqKjsjyjnqysdse;

    @TableField("FDYQ_KJJMQYSDSE")
    private BigDecimal fdyqKjjmqysdse;

    @TableField("BCSB_SRZE")
    private BigDecimal bcsbSrze;

    @TableField("SWJGHD_LRL")
    private BigDecimal swjghdLrl;

    @TableField("ZDKJ_YNSSDE")
    private BigDecimal zdkjYnssde;

    @TableField("ZDKJ_SYSL")
    private BigDecimal zdkjSysl;

    @TableField("ZDKJ_YNQYSDSE")
    private BigDecimal zdkjYnqysdse;

    @TableField("ZDKJ_SJZSL")
    private BigDecimal zdkjSjzsl;

    @TableField("ZDKJ_SJYJN_QYSDSE")
    private BigDecimal zdkjSjyjnQysdse;

    @TableField("ZDKJ_JMQYSDSE")
    private BigDecimal zdkjJmqysdse;

    @TableField("SWDLRJBRXM")
    private String swdlrjbrxm;

    @TableField("SWDLRJBRZYZJHM")
    private String swdlrjbrzyzjhm;

    @TableField("SWDLRDLSBRQ")
    private LocalDateTime swdlrdlsbrq;

    @TableField("LRR_DM")
    private String lrrDm;

    @TableField("LRRQ")
    private LocalDateTime lrrq;

    @TableField("XGR_DM")
    private String xgrDm;

    @TableField("XGRQ")
    private LocalDateTime xgrq;

    @TableField("SJGSDQ")
    private String sjgsdq;

    @TableField("SJTB_SJ")
    private LocalDateTime sjtbSj;

    @TableField("KJDJXH")
    private Long kjdjxh;

    @TableField("HTBZ")
    private String htbz;

    @TableField("SFXSSSXDDY")
    private String sfxsssxddy;

    @TableField("SFXSQTLXDDY")
    private String sfxsqtlxddy;

    @TableField("SFXSGNSFYH")
    private String sfxsgnsfyh;

    @TableField("SYSSXDTK")
    private String syssxdtk;

    @TableField("QTLXDMC")
    private String qtlxdmc;

    @TableField("GNSFYHXM")
    private String gnsfyhxm;

    @TableField("DJZCLX_DM")
    private String djzclxDm;

    @TableField("SDSJMSE")
    private BigDecimal sdsjmse;

    @TableField("KJHY_DM")
    private String kjhyDm;

    @TableField("SLSWJGMC")
    private String slswjgmc;

    @TableField("HTJEWZ")
    private String htjewz;

    @TableField("QZDJBBZ")
    private String qzdjbbz;

    @TableField("SFZFBZ_1")
    private String sfzfbz1;

    @TableField("BH")
    private String bh;

    @TableField("DYNSXXBGBH")
    private String dynsxxbgbh;

    @TableField("SJBLBZ")
    private Integer sjblbz;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public Long getPzxh() {
        return pzxh;
    }

    public void setPzxh(Long pzxh) {
        this.pzxh = pzxh;
    }
    public String getSbuuid() {
        return sbuuid;
    }

    public void setSbuuid(String sbuuid) {
        this.sbuuid = sbuuid;
    }
    public String getKjywrsbh() {
        return kjywrsbh;
    }

    public void setKjywrsbh(String kjywrsbh) {
        this.kjywrsbh = kjywrsbh;
    }
    public String getKjywrmc() {
        return kjywrmc;
    }

    public void setKjywrmc(String kjywrmc) {
        this.kjywrmc = kjywrmc;
    }
    public String getKjywlx() {
        return kjywlx;
    }

    public void setKjywlx(String kjywlx) {
        this.kjywlx = kjywlx;
    }
    public String getHyDm() {
        return hyDm;
    }

    public void setHyDm(String hyDm) {
        this.hyDm = hyDm;
    }
    public String getKjywrmc1() {
        return kjywrmc1;
    }

    public void setKjywrmc1(String kjywrmc1) {
        this.kjywrmc1 = kjywrmc1;
    }
    public String getKjywrywmc() {
        return kjywrywmc;
    }

    public void setKjywrywmc(String kjywrywmc) {
        this.kjywrywmc = kjywrywmc;
    }
    public String getKjywrZcdz() {
        return kjywrZcdz;
    }

    public void setKjywrZcdz(String kjywrZcdz) {
        this.kjywrZcdz = kjywrZcdz;
    }
    public String getKjywrYwdz() {
        return kjywrYwdz;
    }

    public void setKjywrYwdz(String kjywrYwdz) {
        this.kjywrYwdz = kjywrYwdz;
    }
    public String getKjywrJjlxDm() {
        return kjywrJjlxDm;
    }

    public void setKjywrJjlxDm(String kjywrJjlxDm) {
        this.kjywrJjlxDm = kjywrJjlxDm;
    }
    public String getKjywrJjlxmc() {
        return kjywrJjlxmc;
    }

    public void setKjywrJjlxmc(String kjywrJjlxmc) {
        this.kjywrJjlxmc = kjywrJjlxmc;
    }
    public String getKjywrjjhyflDm() {
        return kjywrjjhyflDm;
    }

    public void setKjywrjjhyflDm(String kjywrjjhyflDm) {
        this.kjywrjjhyflDm = kjywrjjhyflDm;
    }
    public String getKjywrJjxyflmc() {
        return kjywrJjxyflmc;
    }

    public void setKjywrJjxyflmc(String kjywrJjxyflmc) {
        this.kjywrJjxyflmc = kjywrJjxyflmc;
    }
    public String getKjywrLxr() {
        return kjywrLxr;
    }

    public void setKjywrLxr(String kjywrLxr) {
        this.kjywrLxr = kjywrLxr;
    }
    public String getKjywrLxdh() {
        return kjywrLxdh;
    }

    public void setKjywrLxdh(String kjywrLxdh) {
        this.kjywrLxdh = kjywrLxdh;
    }
    public String getKjywryzbm() {
        return kjywryzbm;
    }

    public void setKjywryzbm(String kjywryzbm) {
        this.kjywryzbm = kjywryzbm;
    }
    public String getNsrzqjmgnssbh() {
        return nsrzqjmgnssbh;
    }

    public void setNsrzqjmgnssbh(String nsrzqjmgnssbh) {
        this.nsrzqjmgnssbh = nsrzqjmgnssbh;
    }
    public String getNsrzqjmgDqMcjdm() {
        return nsrzqjmgDqMcjdm;
    }

    public void setNsrzqjmgDqMcjdm(String nsrzqjmgDqMcjdm) {
        this.nsrzqjmgDqMcjdm = nsrzqjmgDqMcjdm;
    }
    public String getNsrzwmc() {
        return nsrzwmc;
    }

    public void setNsrzwmc(String nsrzwmc) {
        this.nsrzwmc = nsrzwmc;
    }
    public String getNsrywmc() {
        return nsrywmc;
    }

    public void setNsrywmc(String nsrywmc) {
        this.nsrywmc = nsrywmc;
    }
    public String getJmgnsrZwmc() {
        return jmgnsrZwmc;
    }

    public void setJmgnsrZwmc(String jmgnsrZwmc) {
        this.jmgnsrZwmc = jmgnsrZwmc;
    }
    public String getJmgnsrYwmc() {
        return jmgnsrYwmc;
    }

    public void setJmgnsrYwmc(String jmgnsrYwmc) {
        this.jmgnsrYwmc = jmgnsrYwmc;
    }
    public String getNsrzqjmgzwdz() {
        return nsrzqjmgzwdz;
    }

    public void setNsrzqjmgzwdz(String nsrzqjmgzwdz) {
        this.nsrzqjmgzwdz = nsrzqjmgzwdz;
    }
    public String getNsrzqjmgywdz() {
        return nsrzqjmgywdz;
    }

    public void setNsrzqjmgywdz(String nsrzqjmgywdz) {
        this.nsrzqjmgywdz = nsrzqjmgywdz;
    }
    public String getSbsdlxjdm() {
        return sbsdlxjdm;
    }

    public void setSbsdlxjdm(String sbsdlxjdm) {
        this.sbsdlxjdm = sbsdlxjdm;
    }
    public LocalDateTime getBcsbsdqdrq() {
        return bcsbsdqdrq;
    }

    public void setBcsbsdqdrq(LocalDateTime bcsbsdqdrq) {
        this.bcsbsdqdrq = bcsbsdqdrq;
    }
    public String getHtmc() {
        return htmc;
    }

    public void setHtmc(String htmc) {
        this.htmc = htmc;
    }
    public String getHtbh() {
        return htbh;
    }

    public void setHtbh(String htbh) {
        this.htbh = htbh;
    }
    public LocalDateTime getHtzxqssj() {
        return htzxqssj;
    }

    public void setHtzxqssj(LocalDateTime htzxqssj) {
        this.htzxqssj = htzxqssj;
    }
    public LocalDateTime getHtzxzzsj() {
        return htzxzzsj;
    }

    public void setHtzxzzsj(LocalDateTime htzxzzsj) {
        this.htzxzzsj = htzxzzsj;
    }
    public BigDecimal getHtzje() {
        return htzje;
    }

    public void setHtzje(BigDecimal htzje) {
        this.htzje = htzje;
    }
    public BigDecimal getBcsbsrrmbje() {
        return bcsbsrrmbje;
    }

    public void setBcsbsrrmbje(BigDecimal bcsbsrrmbje) {
        this.bcsbsrrmbje = bcsbsrrmbje;
    }
    public String getBcsbsrwbmc() {
        return bcsbsrwbmc;
    }

    public void setBcsbsrwbmc(String bcsbsrwbmc) {
        this.bcsbsrwbmc = bcsbsrwbmc;
    }
    public BigDecimal getBcsbsrwbje() {
        return bcsbsrwbje;
    }

    public void setBcsbsrwbje(BigDecimal bcsbsrwbje) {
        this.bcsbsrwbje = bcsbsrwbje;
    }
    public BigDecimal getBcsbsrwbhl() {
        return bcsbsrwbhl;
    }

    public void setBcsbsrwbhl(BigDecimal bcsbsrwbhl) {
        this.bcsbsrwbhl = bcsbsrwbhl;
    }
    public BigDecimal getBcsbsrwbzsrmbje() {
        return bcsbsrwbzsrmbje;
    }

    public void setBcsbsrwbzsrmbje(BigDecimal bcsbsrwbzsrmbje) {
        this.bcsbsrwbzsrmbje = bcsbsrwbzsrmbje;
    }
    public BigDecimal getBcsbsrrmbjehj() {
        return bcsbsrrmbjehj;
    }

    public void setBcsbsrrmbjehj(BigDecimal bcsbsrrmbjehj) {
        this.bcsbsrrmbjehj = bcsbsrrmbjehj;
    }
    public BigDecimal getKce() {
        return kce;
    }

    public void setKce(BigDecimal kce) {
        this.kce = kce;
    }
    public BigDecimal getYnssde() {
        return ynssde;
    }

    public void setYnssde(BigDecimal ynssde) {
        this.ynssde = ynssde;
    }
    public BigDecimal getFdyqKjsysl() {
        return fdyqKjsysl;
    }

    public void setFdyqKjsysl(BigDecimal fdyqKjsysl) {
        this.fdyqKjsysl = fdyqKjsysl;
    }
    public BigDecimal getYjnQysdse() {
        return yjnQysdse;
    }

    public void setYjnQysdse(BigDecimal yjnQysdse) {
        this.yjnQysdse = yjnQysdse;
    }
    public BigDecimal getFdyqKjsjzsl() {
        return fdyqKjsjzsl;
    }

    public void setFdyqKjsjzsl(BigDecimal fdyqKjsjzsl) {
        this.fdyqKjsjzsl = fdyqKjsjzsl;
    }
    public BigDecimal getFdyqKjsjyjnqysdse() {
        return fdyqKjsjyjnqysdse;
    }

    public void setFdyqKjsjyjnqysdse(BigDecimal fdyqKjsjyjnqysdse) {
        this.fdyqKjsjyjnqysdse = fdyqKjsjyjnqysdse;
    }
    public BigDecimal getFdyqKjjmqysdse() {
        return fdyqKjjmqysdse;
    }

    public void setFdyqKjjmqysdse(BigDecimal fdyqKjjmqysdse) {
        this.fdyqKjjmqysdse = fdyqKjjmqysdse;
    }
    public BigDecimal getBcsbSrze() {
        return bcsbSrze;
    }

    public void setBcsbSrze(BigDecimal bcsbSrze) {
        this.bcsbSrze = bcsbSrze;
    }
    public BigDecimal getSwjghdLrl() {
        return swjghdLrl;
    }

    public void setSwjghdLrl(BigDecimal swjghdLrl) {
        this.swjghdLrl = swjghdLrl;
    }
    public BigDecimal getZdkjYnssde() {
        return zdkjYnssde;
    }

    public void setZdkjYnssde(BigDecimal zdkjYnssde) {
        this.zdkjYnssde = zdkjYnssde;
    }
    public BigDecimal getZdkjSysl() {
        return zdkjSysl;
    }

    public void setZdkjSysl(BigDecimal zdkjSysl) {
        this.zdkjSysl = zdkjSysl;
    }
    public BigDecimal getZdkjYnqysdse() {
        return zdkjYnqysdse;
    }

    public void setZdkjYnqysdse(BigDecimal zdkjYnqysdse) {
        this.zdkjYnqysdse = zdkjYnqysdse;
    }
    public BigDecimal getZdkjSjzsl() {
        return zdkjSjzsl;
    }

    public void setZdkjSjzsl(BigDecimal zdkjSjzsl) {
        this.zdkjSjzsl = zdkjSjzsl;
    }
    public BigDecimal getZdkjSjyjnQysdse() {
        return zdkjSjyjnQysdse;
    }

    public void setZdkjSjyjnQysdse(BigDecimal zdkjSjyjnQysdse) {
        this.zdkjSjyjnQysdse = zdkjSjyjnQysdse;
    }
    public BigDecimal getZdkjJmqysdse() {
        return zdkjJmqysdse;
    }

    public void setZdkjJmqysdse(BigDecimal zdkjJmqysdse) {
        this.zdkjJmqysdse = zdkjJmqysdse;
    }
    public String getSwdlrjbrxm() {
        return swdlrjbrxm;
    }

    public void setSwdlrjbrxm(String swdlrjbrxm) {
        this.swdlrjbrxm = swdlrjbrxm;
    }
    public String getSwdlrjbrzyzjhm() {
        return swdlrjbrzyzjhm;
    }

    public void setSwdlrjbrzyzjhm(String swdlrjbrzyzjhm) {
        this.swdlrjbrzyzjhm = swdlrjbrzyzjhm;
    }
    public LocalDateTime getSwdlrdlsbrq() {
        return swdlrdlsbrq;
    }

    public void setSwdlrdlsbrq(LocalDateTime swdlrdlsbrq) {
        this.swdlrdlsbrq = swdlrdlsbrq;
    }
    public String getLrrDm() {
        return lrrDm;
    }

    public void setLrrDm(String lrrDm) {
        this.lrrDm = lrrDm;
    }
    public LocalDateTime getLrrq() {
        return lrrq;
    }

    public void setLrrq(LocalDateTime lrrq) {
        this.lrrq = lrrq;
    }
    public String getXgrDm() {
        return xgrDm;
    }

    public void setXgrDm(String xgrDm) {
        this.xgrDm = xgrDm;
    }
    public LocalDateTime getXgrq() {
        return xgrq;
    }

    public void setXgrq(LocalDateTime xgrq) {
        this.xgrq = xgrq;
    }
    public String getSjgsdq() {
        return sjgsdq;
    }

    public void setSjgsdq(String sjgsdq) {
        this.sjgsdq = sjgsdq;
    }
    public LocalDateTime getSjtbSj() {
        return sjtbSj;
    }

    public void setSjtbSj(LocalDateTime sjtbSj) {
        this.sjtbSj = sjtbSj;
    }
    public Long getKjdjxh() {
        return kjdjxh;
    }

    public void setKjdjxh(Long kjdjxh) {
        this.kjdjxh = kjdjxh;
    }
    public String getHtbz() {
        return htbz;
    }

    public void setHtbz(String htbz) {
        this.htbz = htbz;
    }
    public String getSfxsssxddy() {
        return sfxsssxddy;
    }

    public void setSfxsssxddy(String sfxsssxddy) {
        this.sfxsssxddy = sfxsssxddy;
    }
    public String getSfxsqtlxddy() {
        return sfxsqtlxddy;
    }

    public void setSfxsqtlxddy(String sfxsqtlxddy) {
        this.sfxsqtlxddy = sfxsqtlxddy;
    }
    public String getSfxsgnsfyh() {
        return sfxsgnsfyh;
    }

    public void setSfxsgnsfyh(String sfxsgnsfyh) {
        this.sfxsgnsfyh = sfxsgnsfyh;
    }
    public String getSyssxdtk() {
        return syssxdtk;
    }

    public void setSyssxdtk(String syssxdtk) {
        this.syssxdtk = syssxdtk;
    }
    public String getQtlxdmc() {
        return qtlxdmc;
    }

    public void setQtlxdmc(String qtlxdmc) {
        this.qtlxdmc = qtlxdmc;
    }
    public String getGnsfyhxm() {
        return gnsfyhxm;
    }

    public void setGnsfyhxm(String gnsfyhxm) {
        this.gnsfyhxm = gnsfyhxm;
    }
    public String getDjzclxDm() {
        return djzclxDm;
    }

    public void setDjzclxDm(String djzclxDm) {
        this.djzclxDm = djzclxDm;
    }
    public BigDecimal getSdsjmse() {
        return sdsjmse;
    }

    public void setSdsjmse(BigDecimal sdsjmse) {
        this.sdsjmse = sdsjmse;
    }
    public String getKjhyDm() {
        return kjhyDm;
    }

    public void setKjhyDm(String kjhyDm) {
        this.kjhyDm = kjhyDm;
    }
    public String getSlswjgmc() {
        return slswjgmc;
    }

    public void setSlswjgmc(String slswjgmc) {
        this.slswjgmc = slswjgmc;
    }
    public String getHtjewz() {
        return htjewz;
    }

    public void setHtjewz(String htjewz) {
        this.htjewz = htjewz;
    }
    public String getQzdjbbz() {
        return qzdjbbz;
    }

    public void setQzdjbbz(String qzdjbbz) {
        this.qzdjbbz = qzdjbbz;
    }
    public String getSfzfbz1() {
        return sfzfbz1;
    }

    public void setSfzfbz1(String sfzfbz1) {
        this.sfzfbz1 = sfzfbz1;
    }
    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }
    public String getDynsxxbgbh() {
        return dynsxxbgbh;
    }

    public void setDynsxxbgbh(String dynsxxbgbh) {
        this.dynsxxbgbh = dynsxxbgbh;
    }
    public Integer getSjblbz() {
        return sjblbz;
    }

    public void setSjblbz(Integer sjblbz) {
        this.sjblbz = sjblbz;
    }

    @Override
    public String toString() {
        return "HxZgxtSbKjQysds{" +
            "uuid=" + uuid +
            ", pzxh=" + pzxh +
            ", sbuuid=" + sbuuid +
            ", kjywrsbh=" + kjywrsbh +
            ", kjywrmc=" + kjywrmc +
            ", kjywlx=" + kjywlx +
            ", hyDm=" + hyDm +
            ", kjywrmc1=" + kjywrmc1 +
            ", kjywrywmc=" + kjywrywmc +
            ", kjywrZcdz=" + kjywrZcdz +
            ", kjywrYwdz=" + kjywrYwdz +
            ", kjywrJjlxDm=" + kjywrJjlxDm +
            ", kjywrJjlxmc=" + kjywrJjlxmc +
            ", kjywrjjhyflDm=" + kjywrjjhyflDm +
            ", kjywrJjxyflmc=" + kjywrJjxyflmc +
            ", kjywrLxr=" + kjywrLxr +
            ", kjywrLxdh=" + kjywrLxdh +
            ", kjywryzbm=" + kjywryzbm +
            ", nsrzqjmgnssbh=" + nsrzqjmgnssbh +
            ", nsrzqjmgDqMcjdm=" + nsrzqjmgDqMcjdm +
            ", nsrzwmc=" + nsrzwmc +
            ", nsrywmc=" + nsrywmc +
            ", jmgnsrZwmc=" + jmgnsrZwmc +
            ", jmgnsrYwmc=" + jmgnsrYwmc +
            ", nsrzqjmgzwdz=" + nsrzqjmgzwdz +
            ", nsrzqjmgywdz=" + nsrzqjmgywdz +
            ", sbsdlxjdm=" + sbsdlxjdm +
            ", bcsbsdqdrq=" + bcsbsdqdrq +
            ", htmc=" + htmc +
            ", htbh=" + htbh +
            ", htzxqssj=" + htzxqssj +
            ", htzxzzsj=" + htzxzzsj +
            ", htzje=" + htzje +
            ", bcsbsrrmbje=" + bcsbsrrmbje +
            ", bcsbsrwbmc=" + bcsbsrwbmc +
            ", bcsbsrwbje=" + bcsbsrwbje +
            ", bcsbsrwbhl=" + bcsbsrwbhl +
            ", bcsbsrwbzsrmbje=" + bcsbsrwbzsrmbje +
            ", bcsbsrrmbjehj=" + bcsbsrrmbjehj +
            ", kce=" + kce +
            ", ynssde=" + ynssde +
            ", fdyqKjsysl=" + fdyqKjsysl +
            ", yjnQysdse=" + yjnQysdse +
            ", fdyqKjsjzsl=" + fdyqKjsjzsl +
            ", fdyqKjsjyjnqysdse=" + fdyqKjsjyjnqysdse +
            ", fdyqKjjmqysdse=" + fdyqKjjmqysdse +
            ", bcsbSrze=" + bcsbSrze +
            ", swjghdLrl=" + swjghdLrl +
            ", zdkjYnssde=" + zdkjYnssde +
            ", zdkjSysl=" + zdkjSysl +
            ", zdkjYnqysdse=" + zdkjYnqysdse +
            ", zdkjSjzsl=" + zdkjSjzsl +
            ", zdkjSjyjnQysdse=" + zdkjSjyjnQysdse +
            ", zdkjJmqysdse=" + zdkjJmqysdse +
            ", swdlrjbrxm=" + swdlrjbrxm +
            ", swdlrjbrzyzjhm=" + swdlrjbrzyzjhm +
            ", swdlrdlsbrq=" + swdlrdlsbrq +
            ", lrrDm=" + lrrDm +
            ", lrrq=" + lrrq +
            ", xgrDm=" + xgrDm +
            ", xgrq=" + xgrq +
            ", sjgsdq=" + sjgsdq +
            ", sjtbSj=" + sjtbSj +
            ", kjdjxh=" + kjdjxh +
            ", htbz=" + htbz +
            ", sfxsssxddy=" + sfxsssxddy +
            ", sfxsqtlxddy=" + sfxsqtlxddy +
            ", sfxsgnsfyh=" + sfxsgnsfyh +
            ", syssxdtk=" + syssxdtk +
            ", qtlxdmc=" + qtlxdmc +
            ", gnsfyhxm=" + gnsfyhxm +
            ", djzclxDm=" + djzclxDm +
            ", sdsjmse=" + sdsjmse +
            ", kjhyDm=" + kjhyDm +
            ", slswjgmc=" + slswjgmc +
            ", htjewz=" + htjewz +
            ", qzdjbbz=" + qzdjbbz +
            ", sfzfbz1=" + sfzfbz1 +
            ", bh=" + bh +
            ", dynsxxbgbh=" + dynsxxbgbh +
            ", sjblbz=" + sjblbz +
        "}";
    }
}
