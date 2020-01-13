package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("HX_ZGXT_SB_ZLBSCJB")
public class HxZgxtSbZlbscjb implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ZLBSUUID")
    private String zlbsuuid;

    @TableField("DJXH")
    private Long djxh;

    @TableField("XGR_DM")
    private String xgrDm;

    @TableField("XGRQ")
    private LocalDateTime xgrq;

    @TableField("SJGSDQ")
    private String sjgsdq;

    @TableField("SSQQ")
    private LocalDateTime ssqq;

    @TableField("SSQZ")
    private LocalDateTime ssqz;

    @TableField("BSZL_DM")
    private String bszlDm;

    @TableField("LRRQ")
    private LocalDateTime lrrq;

    @TableId("ZLBSCJUUID")
    private String zlbscjuuid;

    @TableField("LRR_DM")
    private String lrrDm;

    @TableField("BBH")
    private String bbh;

    @TableField("ZFBZ_1")
    private String zfbz1;

    @TableField("ZFRQ_1")
    private LocalDateTime zfrq1;

    @TableField("ZFR_DM")
    private String zfrDm;

    @TableField("SJTB_SJ")
    private LocalDateTime sjtbSj;

    @TableField("LRSWJG_DM")
    private String lrswjgDm;

    @TableField("LRSWJGMC")
    private String lrswjgmc;

    @TableField("ZFSWJG_1_DM")
    private String zfswjg1Dm;

    @TableField("ZFSWJGMC1")
    private String zfswjgmc1;

    @TableField("LRRMC")
    private String lrrmc;

    @TableField("ZFRMC")
    private String zfrmc;

    @TableField("SJJCSJ")
    private LocalDateTime sjjcsj;

    @TableField("SJJCPCH")
    private String sjjcpch;

    public String getZlbsuuid() {
        return zlbsuuid;
    }

    public void setZlbsuuid(String zlbsuuid) {
        this.zlbsuuid = zlbsuuid;
    }
    public Long getDjxh() {
        return djxh;
    }

    public void setDjxh(Long djxh) {
        this.djxh = djxh;
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
    public LocalDateTime getSsqq() {
        return ssqq;
    }

    public void setSsqq(LocalDateTime ssqq) {
        this.ssqq = ssqq;
    }
    public LocalDateTime getSsqz() {
        return ssqz;
    }

    public void setSsqz(LocalDateTime ssqz) {
        this.ssqz = ssqz;
    }
    public String getBszlDm() {
        return bszlDm;
    }

    public void setBszlDm(String bszlDm) {
        this.bszlDm = bszlDm;
    }
    public LocalDateTime getLrrq() {
        return lrrq;
    }

    public void setLrrq(LocalDateTime lrrq) {
        this.lrrq = lrrq;
    }
    public String getZlbscjuuid() {
        return zlbscjuuid;
    }

    public void setZlbscjuuid(String zlbscjuuid) {
        this.zlbscjuuid = zlbscjuuid;
    }
    public String getLrrDm() {
        return lrrDm;
    }

    public void setLrrDm(String lrrDm) {
        this.lrrDm = lrrDm;
    }
    public String getBbh() {
        return bbh;
    }

    public void setBbh(String bbh) {
        this.bbh = bbh;
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
    public LocalDateTime getSjtbSj() {
        return sjtbSj;
    }

    public void setSjtbSj(LocalDateTime sjtbSj) {
        this.sjtbSj = sjtbSj;
    }
    public String getLrswjgDm() {
        return lrswjgDm;
    }

    public void setLrswjgDm(String lrswjgDm) {
        this.lrswjgDm = lrswjgDm;
    }
    public String getLrswjgmc() {
        return lrswjgmc;
    }

    public void setLrswjgmc(String lrswjgmc) {
        this.lrswjgmc = lrswjgmc;
    }
    public String getZfswjg1Dm() {
        return zfswjg1Dm;
    }

    public void setZfswjg1Dm(String zfswjg1Dm) {
        this.zfswjg1Dm = zfswjg1Dm;
    }
    public String getZfswjgmc1() {
        return zfswjgmc1;
    }

    public void setZfswjgmc1(String zfswjgmc1) {
        this.zfswjgmc1 = zfswjgmc1;
    }
    public String getLrrmc() {
        return lrrmc;
    }

    public void setLrrmc(String lrrmc) {
        this.lrrmc = lrrmc;
    }
    public String getZfrmc() {
        return zfrmc;
    }

    public void setZfrmc(String zfrmc) {
        this.zfrmc = zfrmc;
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
        return "HxZgxtSbZlbscjb{" +
            "zlbsuuid=" + zlbsuuid +
            ", djxh=" + djxh +
            ", xgrDm=" + xgrDm +
            ", xgrq=" + xgrq +
            ", sjgsdq=" + sjgsdq +
            ", ssqq=" + ssqq +
            ", ssqz=" + ssqz +
            ", bszlDm=" + bszlDm +
            ", lrrq=" + lrrq +
            ", zlbscjuuid=" + zlbscjuuid +
            ", lrrDm=" + lrrDm +
            ", bbh=" + bbh +
            ", zfbz1=" + zfbz1 +
            ", zfrq1=" + zfrq1 +
            ", zfrDm=" + zfrDm +
            ", sjtbSj=" + sjtbSj +
            ", lrswjgDm=" + lrswjgDm +
            ", lrswjgmc=" + lrswjgmc +
            ", zfswjg1Dm=" + zfswjg1Dm +
            ", zfswjgmc1=" + zfswjgmc1 +
            ", lrrmc=" + lrrmc +
            ", zfrmc=" + zfrmc +
            ", sjjcsj=" + sjjcsj +
            ", sjjcpch=" + sjjcpch +
        "}";
    }
}
