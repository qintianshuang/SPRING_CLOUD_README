package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 申报比对规则表
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("SB_SBBD_BDGZ_NSR")
public class SbSbbdBdgzNsr implements Serializable {

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
     * 值
     */
    @TableField("VALUE")
    private String value;

    /**
     * 录入人代码
     */
    @TableField("LRR_DM")
    private String lrrDm;

    /**
     * 录入时间
     */
    @TableField("LRSJ")
    private LocalDateTime lrsj;

    /**
     * 修改人代码
     */
    @TableField("XGR_DM")
    private String xgrDm;

    /**
     * 修改时间
     */
    @TableField("XGSJ")
    private LocalDateTime xgsj;

    /**
     * 凭证预约
     */
    @TableField("PZYY")
    private String pzyy;

    /**
     * 有效标志
     */
    @TableField("YXBZ")
    private String yxbz;

    /**
     * 支付标志
     */
    @TableField("ZFBZ")
    private String zfbz;

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
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getLrrDm() {
        return lrrDm;
    }

    public void setLrrDm(String lrrDm) {
        this.lrrDm = lrrDm;
    }
    public LocalDateTime getLrsj() {
        return lrsj;
    }

    public void setLrsj(LocalDateTime lrsj) {
        this.lrsj = lrsj;
    }
    public String getXgrDm() {
        return xgrDm;
    }

    public void setXgrDm(String xgrDm) {
        this.xgrDm = xgrDm;
    }
    public LocalDateTime getXgsj() {
        return xgsj;
    }

    public void setXgsj(LocalDateTime xgsj) {
        this.xgsj = xgsj;
    }
    public String getPzyy() {
        return pzyy;
    }

    public void setPzyy(String pzyy) {
        this.pzyy = pzyy;
    }
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }
    public String getZfbz() {
        return zfbz;
    }

    public void setZfbz(String zfbz) {
        this.zfbz = zfbz;
    }

    @Override
    public String toString() {
        return "SbSbbdBdgzNsr{" +
            "xh=" + xh +
            ", djxh=" + djxh +
            ", nsrsbh=" + nsrsbh +
            ", shxydm=" + shxydm +
            ", nsrmc=" + nsrmc +
            ", sbzlDm=" + sbzlDm +
            ", bdgzDm=" + bdgzDm +
            ", value=" + value +
            ", lrrDm=" + lrrDm +
            ", lrsj=" + lrsj +
            ", xgrDm=" + xgrDm +
            ", xgsj=" + xgsj +
            ", pzyy=" + pzyy +
            ", yxbz=" + yxbz +
            ", zfbz=" + zfbz +
        "}";
    }
}
