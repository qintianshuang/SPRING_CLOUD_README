package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("SB_SBBD_BMDXX")
public class SbSbbdBmdxx implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableField("XH")
    private String xh;

    /**
     * 登记序号
     */
    @TableField("DJXH")
    private String djxh;

    /**
     * 申报种类代码
     */
    @TableField("SBZL_DM")
    private String sbzlDm;

    /**
     * 比对规则代码
     */
    @TableField("BDGZ_DM")
    private String bdgzDm;

    /**
     * 有效期起
     */
    @TableField("YXQQ")
    private LocalDateTime yxqq;

    /**
     * 有效期止
     */
    @TableField("YXQZ")
    private LocalDateTime yxqz;

    /**
     * 有效标志
     */
    @TableField("YXBZ")
    private String yxbz;

    /**
     * 录入人
     */
    @TableField("LRR")
    private String lrr;

    /**
     * 录入时间
     */
    @TableField("LRSJ")
    private LocalDateTime lrsj;

    /**
     * 标志
     */
    @TableField("BZ")
    private String bz;

    /**
     * 纳税人识别号
     */
    @TableField("NSRSBH")
    private String nsrsbh;

    /**
     * 社会信用代码
     */
    @TableField("SHXYDM")
    private String shxydm;

    /**
     * 纳税人名称
     */
    @TableField("NSRMC")
    private String nsrmc;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }
    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }
    public String getSbzlDm() {
        return sbzlDm;
    }

    public void setSbzlDm(String sbzlDm) {
        this.sbzlDm = sbzlDm;
    }
    public String getBdgzDm() {
        return bdgzDm;
    }

    public void setBdgzDm(String bdgzDm) {
        this.bdgzDm = bdgzDm;
    }
    public LocalDateTime getYxqq() {
        return yxqq;
    }

    public void setYxqq(LocalDateTime yxqq) {
        this.yxqq = yxqq;
    }
    public LocalDateTime getYxqz() {
        return yxqz;
    }

    public void setYxqz(LocalDateTime yxqz) {
        this.yxqz = yxqz;
    }
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }
    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }
    public LocalDateTime getLrsj() {
        return lrsj;
    }

    public void setLrsj(LocalDateTime lrsj) {
        this.lrsj = lrsj;
    }
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }
    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }
    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    @Override
    public String toString() {
        return "SbSbbdBmdxx{" +
            "xh=" + xh +
            ", djxh=" + djxh +
            ", sbzlDm=" + sbzlDm +
            ", bdgzDm=" + bdgzDm +
            ", yxqq=" + yxqq +
            ", yxqz=" + yxqz +
            ", yxbz=" + yxbz +
            ", lrr=" + lrr +
            ", lrsj=" + lrsj +
            ", bz=" + bz +
            ", nsrsbh=" + nsrsbh +
            ", shxydm=" + shxydm +
            ", nsrmc=" + nsrmc +
        "}";
    }
}
