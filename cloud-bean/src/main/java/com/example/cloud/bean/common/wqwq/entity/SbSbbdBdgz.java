package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 一窗式比对规则配置表
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("SB_SBBD_BDGZ")
public class SbSbbdBdgz implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 比对规则代码
     */
    @TableId("BDGZ_ID")
    private String bdgzId;

    /**
     * 比对规则名称
     */
    @TableField("BDGZ_MC")
    private String bdgzMc;

    /**
     * 申报种类代码
     */
    @TableField("SBZL_DM")
    private String sbzlDm;

    /**
     * 类方法
     */
    @TableField("CLS_METHOD")
    private String clsMethod;

    /**
     * 阻断标志
     */
    @TableField("ZDBZ")
    private String zdbz;

    /**
     * 有效标志
     */
    @TableField("YXBZ")
    private String yxbz;

    /**
     * 比对规则描述
     */
    @TableField("BDGZ_MS")
    private String bdgzMs;

    @TableField("FKXX")
    private String fkxx;

    /**
     * 外部内容
     */
    @TableField("WBNR")
    private String wbnr;

    /**
     * 申报内容
     */
    @TableField("SBNR")
    private String sbnr;

    /**
     * 比对阈值
     */
    @TableField("VALUE")
    private String value;

    /**
     * 对照金三比对规则
     */
    @TableField("GT3_RULE")
    private String gt3Rule;

    public String getBdgzId() {
        return bdgzId;
    }

    public void setBdgzId(String bdgzId) {
        this.bdgzId = bdgzId;
    }
    public String getBdgzMc() {
        return bdgzMc;
    }

    public void setBdgzMc(String bdgzMc) {
        this.bdgzMc = bdgzMc;
    }
    public String getSbzlDm() {
        return sbzlDm;
    }

    public void setSbzlDm(String sbzlDm) {
        this.sbzlDm = sbzlDm;
    }
    public String getClsMethod() {
        return clsMethod;
    }

    public void setClsMethod(String clsMethod) {
        this.clsMethod = clsMethod;
    }
    public String getZdbz() {
        return zdbz;
    }

    public void setZdbz(String zdbz) {
        this.zdbz = zdbz;
    }
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }
    public String getBdgzMs() {
        return bdgzMs;
    }

    public void setBdgzMs(String bdgzMs) {
        this.bdgzMs = bdgzMs;
    }
    public String getFkxx() {
        return fkxx;
    }

    public void setFkxx(String fkxx) {
        this.fkxx = fkxx;
    }
    public String getWbnr() {
        return wbnr;
    }

    public void setWbnr(String wbnr) {
        this.wbnr = wbnr;
    }
    public String getSbnr() {
        return sbnr;
    }

    public void setSbnr(String sbnr) {
        this.sbnr = sbnr;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getGt3Rule() {
        return gt3Rule;
    }

    public void setGt3Rule(String gt3Rule) {
        this.gt3Rule = gt3Rule;
    }

    @Override
    public String toString() {
        return "SbSbbdBdgz{" +
            "bdgzId=" + bdgzId +
            ", bdgzMc=" + bdgzMc +
            ", sbzlDm=" + sbzlDm +
            ", clsMethod=" + clsMethod +
            ", zdbz=" + zdbz +
            ", yxbz=" + yxbz +
            ", bdgzMs=" + bdgzMs +
            ", fkxx=" + fkxx +
            ", wbnr=" + wbnr +
            ", sbnr=" + sbnr +
            ", value=" + value +
            ", gt3Rule=" + gt3Rule +
        "}";
    }
}
