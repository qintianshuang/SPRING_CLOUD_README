package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 申报种类表
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("DM_SBZL")
public class DmSbzl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申报种类代码
     */
    @TableId("SBZL_DM")
    private String sbzlDm;

    /**
     * 征收项目代码
     */
    @TableField("ZSXM_DM")
    private String zsxmDm;

    /**
     * 应征凭证代码
     */
    @TableField("YZPZZL_DM")
    private String yzpzzlDm;

    /**
     * 有效标志
     */
    @TableField("YXBZ")
    private String yxbz;

    /**
     * 申报种类名称
     */
    @TableField("SBZL_MC")
    private String sbzlMc;

    /**
     * 纳税期限
     */
    @TableField("NSQX_DM")
    private String nsqxDm;

    /**
     * 申报时限
     */
    @TableField("SBSX")
    private Integer sbsx;

    /**
     * 申报种类有效期起
     */
    @TableField("YXQQ")
    private LocalDateTime yxqq;

    /**
     * 申报种类有效期止
     */
    @TableField("YXQZ")
    private LocalDateTime yxqz;

    /**
     * 申报种类大类代码
     */
    @TableField("SBZL_DL_DM")
    private String sbzlDlDm;

    /**
     * 耦合标识,0耦合1解耦
     */
    @TableField("COUPLING")
    private String coupling;

    /**
     * 允许重复申报,Y允许/N不允许
     */
    @TableField("YXCFSB")
    private String yxcfsb;

    /**
     * 1：国税税种、2：地税税种、0：兼有税种（企业所得税）
     */
    @TableField("GDS_BZ")
    private String gdsBz;

    public String getSbzlDm() {
        return sbzlDm;
    }

    public void setSbzlDm(String sbzlDm) {
        this.sbzlDm = sbzlDm;
    }
    public String getZsxmDm() {
        return zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }
    public String getYzpzzlDm() {
        return yzpzzlDm;
    }

    public void setYzpzzlDm(String yzpzzlDm) {
        this.yzpzzlDm = yzpzzlDm;
    }
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }
    public String getSbzlMc() {
        return sbzlMc;
    }

    public void setSbzlMc(String sbzlMc) {
        this.sbzlMc = sbzlMc;
    }
    public String getNsqxDm() {
        return nsqxDm;
    }

    public void setNsqxDm(String nsqxDm) {
        this.nsqxDm = nsqxDm;
    }
    public Integer getSbsx() {
        return sbsx;
    }

    public void setSbsx(Integer sbsx) {
        this.sbsx = sbsx;
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
    public String getSbzlDlDm() {
        return sbzlDlDm;
    }

    public void setSbzlDlDm(String sbzlDlDm) {
        this.sbzlDlDm = sbzlDlDm;
    }
    public String getCoupling() {
        return coupling;
    }

    public void setCoupling(String coupling) {
        this.coupling = coupling;
    }
    public String getYxcfsb() {
        return yxcfsb;
    }

    public void setYxcfsb(String yxcfsb) {
        this.yxcfsb = yxcfsb;
    }
    public String getGdsBz() {
        return gdsBz;
    }

    public void setGdsBz(String gdsBz) {
        this.gdsBz = gdsBz;
    }

    @Override
    public String toString() {
        return "DmSbzl{" +
            "sbzlDm=" + sbzlDm +
            ", zsxmDm=" + zsxmDm +
            ", yzpzzlDm=" + yzpzzlDm +
            ", yxbz=" + yxbz +
            ", sbzlMc=" + sbzlMc +
            ", nsqxDm=" + nsqxDm +
            ", sbsx=" + sbsx +
            ", yxqq=" + yxqq +
            ", yxqz=" + yxqz +
            ", sbzlDlDm=" + sbzlDlDm +
            ", coupling=" + coupling +
            ", yxcfsb=" + yxcfsb +
            ", gdsBz=" + gdsBz +
        "}";
    }
}
