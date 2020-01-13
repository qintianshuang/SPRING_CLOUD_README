package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("SB_XGM_CYSBJL")
public class SbXgmCysbjl implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 申报流水id
     */
    @TableField("SBUUID")
    private String sbuuid;

    /**
     * 应征凭证种类代码
     */
    @TableField("YZPZZL_DM")
    private String yzpzzlDm;

    /**
     * 应征凭证序号
     */
    @TableField("YZPZXH")
    private String yzpzxh;

    /**
     * 税款所属期起
     */
    @TableField("SKSSQQ")
    private LocalDateTime skssqq;

    /**
     * 税款所属期止
     */
    @TableField("SKSSQZ")
    private LocalDateTime skssqz;

    /**
     * 华云返回数据加工代码
     */
    @TableField("RECODE")
    private String recode;

    /**
     * 有效标志(y:有效 n:失效)
     */
    @TableField("YXBZ")
    private String yxbz;

    /**
     * 录入人代码
     */
    @TableField("LRRDM")
    private String lrrdm;

    /**
     * 录入日期
     */
    @TableField("LRRQ")
    private LocalDateTime lrrq;

    /**
     * 修改人代码
     */
    @TableField("XGRDM")
    private String xgrdm;

    /**
     * 修改日期
     */
    @TableField("XGRQ")
    private LocalDateTime xgrq;

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
    public String getSbuuid() {
        return sbuuid;
    }

    public void setSbuuid(String sbuuid) {
        this.sbuuid = sbuuid;
    }
    public String getYzpzzlDm() {
        return yzpzzlDm;
    }

    public void setYzpzzlDm(String yzpzzlDm) {
        this.yzpzzlDm = yzpzzlDm;
    }
    public String getYzpzxh() {
        return yzpzxh;
    }

    public void setYzpzxh(String yzpzxh) {
        this.yzpzxh = yzpzxh;
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
    public String getRecode() {
        return recode;
    }

    public void setRecode(String recode) {
        this.recode = recode;
    }
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }
    public String getLrrdm() {
        return lrrdm;
    }

    public void setLrrdm(String lrrdm) {
        this.lrrdm = lrrdm;
    }
    public LocalDateTime getLrrq() {
        return lrrq;
    }

    public void setLrrq(LocalDateTime lrrq) {
        this.lrrq = lrrq;
    }
    public String getXgrdm() {
        return xgrdm;
    }

    public void setXgrdm(String xgrdm) {
        this.xgrdm = xgrdm;
    }
    public LocalDateTime getXgrq() {
        return xgrq;
    }

    public void setXgrq(LocalDateTime xgrq) {
        this.xgrq = xgrq;
    }

    @Override
    public String toString() {
        return "SbXgmCysbjl{" +
            "djxh=" + djxh +
            ", nsrsbh=" + nsrsbh +
            ", sbuuid=" + sbuuid +
            ", yzpzzlDm=" + yzpzzlDm +
            ", yzpzxh=" + yzpzxh +
            ", skssqq=" + skssqq +
            ", skssqz=" + skssqz +
            ", recode=" + recode +
            ", yxbz=" + yxbz +
            ", lrrdm=" + lrrdm +
            ", lrrq=" + lrrq +
            ", xgrdm=" + xgrdm +
            ", xgrq=" + xgrq +
        "}";
    }
}
