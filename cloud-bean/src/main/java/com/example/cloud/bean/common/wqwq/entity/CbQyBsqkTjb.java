package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("CB_QY_BSQK_TJB")
public class CbQyBsqkTjb implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SWJG_DM")
    private String swjgDm;

    @TableField("BSYF")
    private BigDecimal bsyf;

    @TableId("NSRSBH")
    private String nsrsbh;

    @TableField("HZ_KPJ_SL")
    private BigDecimal hzKpjSl;

    @TableField("CGBZ")
    private String cgbz;

    @TableField("QSSJ")
    private LocalDateTime qssj;

    @TableField("JZSJ")
    private LocalDateTime jzsj;

    @TableField("QCKC")
    private BigDecimal qckc;

    @TableField("BQLG")
    private BigDecimal bqlg;

    @TableField("BQTH")
    private BigDecimal bqth;

    @TableField("BQKJ")
    private BigDecimal bqkj;

    @TableField("QMJY")
    private BigDecimal qmjy;

    @TableField("ZCFS")
    private BigDecimal zcfs;

    @TableField("ZCJE")
    private BigDecimal zcje;

    @TableField("ZCSE")
    private BigDecimal zcse;

    @TableField("ZFFS")
    private BigDecimal zffs;

    @TableField("ZFJE")
    private BigDecimal zfje;

    @TableField("ZFSE")
    private BigDecimal zfse;

    @TableField("CZY_DM")
    private String czyDm;

    @TableField("CZY_MC")
    private String czyMc;

    @TableField("JZFLAG")
    private String jzflag;

    @TableField("NSR_XZ")
    private BigDecimal nsrXz;

    @TableField("FP_LB")
    private String fpLb;

    public String getSwjgDm() {
        return swjgDm;
    }

    public void setSwjgDm(String swjgDm) {
        this.swjgDm = swjgDm;
    }
    public BigDecimal getBsyf() {
        return bsyf;
    }

    public void setBsyf(BigDecimal bsyf) {
        this.bsyf = bsyf;
    }
    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }
    public BigDecimal getHzKpjSl() {
        return hzKpjSl;
    }

    public void setHzKpjSl(BigDecimal hzKpjSl) {
        this.hzKpjSl = hzKpjSl;
    }
    public String getCgbz() {
        return cgbz;
    }

    public void setCgbz(String cgbz) {
        this.cgbz = cgbz;
    }
    public LocalDateTime getQssj() {
        return qssj;
    }

    public void setQssj(LocalDateTime qssj) {
        this.qssj = qssj;
    }
    public LocalDateTime getJzsj() {
        return jzsj;
    }

    public void setJzsj(LocalDateTime jzsj) {
        this.jzsj = jzsj;
    }
    public BigDecimal getQckc() {
        return qckc;
    }

    public void setQckc(BigDecimal qckc) {
        this.qckc = qckc;
    }
    public BigDecimal getBqlg() {
        return bqlg;
    }

    public void setBqlg(BigDecimal bqlg) {
        this.bqlg = bqlg;
    }
    public BigDecimal getBqth() {
        return bqth;
    }

    public void setBqth(BigDecimal bqth) {
        this.bqth = bqth;
    }
    public BigDecimal getBqkj() {
        return bqkj;
    }

    public void setBqkj(BigDecimal bqkj) {
        this.bqkj = bqkj;
    }
    public BigDecimal getQmjy() {
        return qmjy;
    }

    public void setQmjy(BigDecimal qmjy) {
        this.qmjy = qmjy;
    }
    public BigDecimal getZcfs() {
        return zcfs;
    }

    public void setZcfs(BigDecimal zcfs) {
        this.zcfs = zcfs;
    }
    public BigDecimal getZcje() {
        return zcje;
    }

    public void setZcje(BigDecimal zcje) {
        this.zcje = zcje;
    }
    public BigDecimal getZcse() {
        return zcse;
    }

    public void setZcse(BigDecimal zcse) {
        this.zcse = zcse;
    }
    public BigDecimal getZffs() {
        return zffs;
    }

    public void setZffs(BigDecimal zffs) {
        this.zffs = zffs;
    }
    public BigDecimal getZfje() {
        return zfje;
    }

    public void setZfje(BigDecimal zfje) {
        this.zfje = zfje;
    }
    public BigDecimal getZfse() {
        return zfse;
    }

    public void setZfse(BigDecimal zfse) {
        this.zfse = zfse;
    }
    public String getCzyDm() {
        return czyDm;
    }

    public void setCzyDm(String czyDm) {
        this.czyDm = czyDm;
    }
    public String getCzyMc() {
        return czyMc;
    }

    public void setCzyMc(String czyMc) {
        this.czyMc = czyMc;
    }
    public String getJzflag() {
        return jzflag;
    }

    public void setJzflag(String jzflag) {
        this.jzflag = jzflag;
    }
    public BigDecimal getNsrXz() {
        return nsrXz;
    }

    public void setNsrXz(BigDecimal nsrXz) {
        this.nsrXz = nsrXz;
    }
    public String getFpLb() {
        return fpLb;
    }

    public void setFpLb(String fpLb) {
        this.fpLb = fpLb;
    }

    @Override
    public String toString() {
        return "CbQyBsqkTjb{" +
            "swjgDm=" + swjgDm +
            ", bsyf=" + bsyf +
            ", nsrsbh=" + nsrsbh +
            ", hzKpjSl=" + hzKpjSl +
            ", cgbz=" + cgbz +
            ", qssj=" + qssj +
            ", jzsj=" + jzsj +
            ", qckc=" + qckc +
            ", bqlg=" + bqlg +
            ", bqth=" + bqth +
            ", bqkj=" + bqkj +
            ", qmjy=" + qmjy +
            ", zcfs=" + zcfs +
            ", zcje=" + zcje +
            ", zcse=" + zcse +
            ", zffs=" + zffs +
            ", zfje=" + zfje +
            ", zfse=" + zfse +
            ", czyDm=" + czyDm +
            ", czyMc=" + czyMc +
            ", jzflag=" + jzflag +
            ", nsrXz=" + nsrXz +
            ", fpLb=" + fpLb +
        "}";
    }
}
