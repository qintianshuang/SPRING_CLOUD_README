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
@TableName("HX_ZGXT_SB_SBB")
public class HxZgxtSbSbb implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("SBUUID")
    private String sbuuid;

    @TableField("PZXH")
    private Long pzxh;

    @TableField("YZPZZL_DM")
    private String yzpzzlDm;

    @TableField("DJXH")
    private Long djxh;

    @TableField("NSRSBH")
    private String nsrsbh;

    @TableField("NSRMC")
    private String nsrmc;

    @TableField("SKSSQQ")
    private LocalDateTime skssqq;

    @TableField("SKSSQZ")
    private LocalDateTime skssqz;

    @TableField("SBRQ_1")
    private LocalDateTime sbrq1;

    @TableField("TBRQ_1")
    private LocalDateTime tbrq1;

    @TableField("YBTSE")
    private BigDecimal ybtse;

    @TableField("SSGLY_DM")
    private String ssglyDm;

    @TableField("ZFBZ_1")
    private String zfbz1;

    @TableField("ZFRQ_1")
    private LocalDateTime zfrq1;

    @TableField("ZFR_DM")
    private String zfrDm;

    @TableField("ZGSWSKFJ_DM")
    private String zgswskfjDm;

    @TableField("XTBM")
    private String xtbm;

    @TableField("SBSX_DM_1")
    private String sbsxDm1;

    @TableField("GZLX_DM_1")
    private String gzlxDm1;

    @TableField("SBFS_DM")
    private String sbfsDm;

    @TableField("SLRQ")
    private LocalDateTime slrq;

    @TableField("SLR_DM")
    private String slrDm;

    @TableField("SLSWJG_DM")
    private String slswjgDm;

    @TableField("BZ")
    private String bz;

    @TableField("BSRXM")
    private String bsrxm;

    @TableField("DLJBRZYZJHM")
    private String dljbrzyzjhm;

    @TableField("CWFZRXM")
    private String cwfzrxm;

    @TableField("FDDBRXM")
    private String fddbrxm;

    @TableField("SWDLRDZ")
    private String swdlrdz;

    @TableField("SWDLRLXDH")
    private String swdlrlxdh;

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

    @TableField("BSRLXDH")
    private String bsrlxdh;

    @TableField("DLRMC")
    private String dlrmc;

    @TableField("JBRXM")
    private String jbrxm;

    @TableField("JBRLXDH")
    private String jbrlxdh;

    @TableField("SJJCSJ")
    private LocalDateTime sjjcsj;

    @TableField("SJJCPCH")
    private String sjjcpch;

    public String getSbuuid() {
        return sbuuid;
    }

    public void setSbuuid(String sbuuid) {
        this.sbuuid = sbuuid;
    }
    public Long getPzxh() {
        return pzxh;
    }

    public void setPzxh(Long pzxh) {
        this.pzxh = pzxh;
    }
    public String getYzpzzlDm() {
        return yzpzzlDm;
    }

    public void setYzpzzlDm(String yzpzzlDm) {
        this.yzpzzlDm = yzpzzlDm;
    }
    public Long getDjxh() {
        return djxh;
    }

    public void setDjxh(Long djxh) {
        this.djxh = djxh;
    }
    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }
    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }
    public LocalDateTime getSkssqq() {
        return skssqq;
    }

    public void setSkssqq(LocalDateTime skssqq) {
        this.skssqq = skssqq;
    }
    public LocalDateTime getSkssqz() {
        return skssqz;
    }

    public void setSkssqz(LocalDateTime skssqz) {
        this.skssqz = skssqz;
    }
    public LocalDateTime getSbrq1() {
        return sbrq1;
    }

    public void setSbrq1(LocalDateTime sbrq1) {
        this.sbrq1 = sbrq1;
    }
    public LocalDateTime getTbrq1() {
        return tbrq1;
    }

    public void setTbrq1(LocalDateTime tbrq1) {
        this.tbrq1 = tbrq1;
    }
    public BigDecimal getYbtse() {
        return ybtse;
    }

    public void setYbtse(BigDecimal ybtse) {
        this.ybtse = ybtse;
    }
    public String getSsglyDm() {
        return ssglyDm;
    }

    public void setSsglyDm(String ssglyDm) {
        this.ssglyDm = ssglyDm;
    }
    public String getZfbz1() {
        return zfbz1;
    }

    public void setZfbz1(String zfbz1) {
        this.zfbz1 = zfbz1;
    }
    public LocalDateTime getZfrq1() {
        return zfrq1;
    }

    public void setZfrq1(LocalDateTime zfrq1) {
        this.zfrq1 = zfrq1;
    }
    public String getZfrDm() {
        return zfrDm;
    }

    public void setZfrDm(String zfrDm) {
        this.zfrDm = zfrDm;
    }
    public String getZgswskfjDm() {
        return zgswskfjDm;
    }

    public void setZgswskfjDm(String zgswskfjDm) {
        this.zgswskfjDm = zgswskfjDm;
    }
    public String getXtbm() {
        return xtbm;
    }

    public void setXtbm(String xtbm) {
        this.xtbm = xtbm;
    }
    public String getSbsxDm1() {
        return sbsxDm1;
    }

    public void setSbsxDm1(String sbsxDm1) {
        this.sbsxDm1 = sbsxDm1;
    }
    public String getGzlxDm1() {
        return gzlxDm1;
    }

    public void setGzlxDm1(String gzlxDm1) {
        this.gzlxDm1 = gzlxDm1;
    }
    public String getSbfsDm() {
        return sbfsDm;
    }

    public void setSbfsDm(String sbfsDm) {
        this.sbfsDm = sbfsDm;
    }
    public LocalDateTime getSlrq() {
        return slrq;
    }

    public void setSlrq(LocalDateTime slrq) {
        this.slrq = slrq;
    }
    public String getSlrDm() {
        return slrDm;
    }

    public void setSlrDm(String slrDm) {
        this.slrDm = slrDm;
    }
    public String getSlswjgDm() {
        return slswjgDm;
    }

    public void setSlswjgDm(String slswjgDm) {
        this.slswjgDm = slswjgDm;
    }
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
    public String getBsrxm() {
        return bsrxm;
    }

    public void setBsrxm(String bsrxm) {
        this.bsrxm = bsrxm;
    }
    public String getDljbrzyzjhm() {
        return dljbrzyzjhm;
    }

    public void setDljbrzyzjhm(String dljbrzyzjhm) {
        this.dljbrzyzjhm = dljbrzyzjhm;
    }
    public String getCwfzrxm() {
        return cwfzrxm;
    }

    public void setCwfzrxm(String cwfzrxm) {
        this.cwfzrxm = cwfzrxm;
    }
    public String getFddbrxm() {
        return fddbrxm;
    }

    public void setFddbrxm(String fddbrxm) {
        this.fddbrxm = fddbrxm;
    }
    public String getSwdlrdz() {
        return swdlrdz;
    }

    public void setSwdlrdz(String swdlrdz) {
        this.swdlrdz = swdlrdz;
    }
    public String getSwdlrlxdh() {
        return swdlrlxdh;
    }

    public void setSwdlrlxdh(String swdlrlxdh) {
        this.swdlrlxdh = swdlrlxdh;
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
    public String getBsrlxdh() {
        return bsrlxdh;
    }

    public void setBsrlxdh(String bsrlxdh) {
        this.bsrlxdh = bsrlxdh;
    }
    public String getDlrmc() {
        return dlrmc;
    }

    public void setDlrmc(String dlrmc) {
        this.dlrmc = dlrmc;
    }
    public String getJbrxm() {
        return jbrxm;
    }

    public void setJbrxm(String jbrxm) {
        this.jbrxm = jbrxm;
    }
    public String getJbrlxdh() {
        return jbrlxdh;
    }

    public void setJbrlxdh(String jbrlxdh) {
        this.jbrlxdh = jbrlxdh;
    }
    public LocalDateTime getSjjcsj() {
        return sjjcsj;
    }

    public void setSjjcsj(LocalDateTime sjjcsj) {
        this.sjjcsj = sjjcsj;
    }
    public String getSjjcpch() {
        return sjjcpch;
    }

    public void setSjjcpch(String sjjcpch) {
        this.sjjcpch = sjjcpch;
    }

    @Override
    public String toString() {
        return "HxZgxtSbSbb{" +
            "sbuuid=" + sbuuid +
            ", pzxh=" + pzxh +
            ", yzpzzlDm=" + yzpzzlDm +
            ", djxh=" + djxh +
            ", nsrsbh=" + nsrsbh +
            ", nsrmc=" + nsrmc +
            ", skssqq=" + skssqq +
            ", skssqz=" + skssqz +
            ", sbrq1=" + sbrq1 +
            ", tbrq1=" + tbrq1 +
            ", ybtse=" + ybtse +
            ", ssglyDm=" + ssglyDm +
            ", zfbz1=" + zfbz1 +
            ", zfrq1=" + zfrq1 +
            ", zfrDm=" + zfrDm +
            ", zgswskfjDm=" + zgswskfjDm +
            ", xtbm=" + xtbm +
            ", sbsxDm1=" + sbsxDm1 +
            ", gzlxDm1=" + gzlxDm1 +
            ", sbfsDm=" + sbfsDm +
            ", slrq=" + slrq +
            ", slrDm=" + slrDm +
            ", slswjgDm=" + slswjgDm +
            ", bz=" + bz +
            ", bsrxm=" + bsrxm +
            ", dljbrzyzjhm=" + dljbrzyzjhm +
            ", cwfzrxm=" + cwfzrxm +
            ", fddbrxm=" + fddbrxm +
            ", swdlrdz=" + swdlrdz +
            ", swdlrlxdh=" + swdlrlxdh +
            ", lrrDm=" + lrrDm +
            ", lrrq=" + lrrq +
            ", xgrDm=" + xgrDm +
            ", xgrq=" + xgrq +
            ", sjgsdq=" + sjgsdq +
            ", sjtbSj=" + sjtbSj +
            ", bsrlxdh=" + bsrlxdh +
            ", dlrmc=" + dlrmc +
            ", jbrxm=" + jbrxm +
            ", jbrlxdh=" + jbrlxdh +
            ", sjjcsj=" + sjjcsj +
            ", sjjcpch=" + sjjcpch +
        "}";
    }
}
