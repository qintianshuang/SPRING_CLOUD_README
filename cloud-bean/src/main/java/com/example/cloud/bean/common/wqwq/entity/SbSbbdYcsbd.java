package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 一窗式比对日志
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("SB_SBBD_YCSBD")
public class SbSbbdYcsbd implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 比对uuid
     */
    @TableId("BDUUID")
    private String bduuid;

    /**
     * 申报序号
     */
    @TableField("GLLSH")
    private String gllsh;

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
     * 申报年月
     */
    @TableField("SBNY")
    private String sbny;

    /**
     * 所属时期起
     */
    @TableField("SSSQQ")
    private LocalDateTime sssqq;

    /**
     * 所属时期止
     */
    @TableField("SSSQZ")
    private LocalDateTime sssqz;

    /**
     * 录入时间
     */
    @TableField("LRSJ")
    private LocalDateTime lrsj;

    @TableField("YXBZ")
    private String yxbz;

    @TableField("ZFBZ")
    private String zfbz;

    public String getBduuid() {
        return bduuid;
    }

    public void setBduuid(String bduuid) {
        this.bduuid = bduuid;
    }
    public String getGllsh() {
        return gllsh;
    }

    public void setGllsh(String gllsh) {
        this.gllsh = gllsh;
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
    public String getSbny() {
        return sbny;
    }

    public void setSbny(String sbny) {
        this.sbny = sbny;
    }
    public LocalDateTime getSssqq() {
        return sssqq;
    }

    public void setSssqq(LocalDateTime sssqq) {
        this.sssqq = sssqq;
    }
    public LocalDateTime getSssqz() {
        return sssqz;
    }

    public void setSssqz(LocalDateTime sssqz) {
        this.sssqz = sssqz;
    }
    public LocalDateTime getLrsj() {
        return lrsj;
    }

    public void setLrsj(LocalDateTime lrsj) {
        this.lrsj = lrsj;
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
        return "SbSbbdYcsbd{" +
            "bduuid=" + bduuid +
            ", gllsh=" + gllsh +
            ", djxh=" + djxh +
            ", sbzlDm=" + sbzlDm +
            ", sbny=" + sbny +
            ", sssqq=" + sssqq +
            ", sssqz=" + sssqz +
            ", lrsj=" + lrsj +
            ", yxbz=" + yxbz +
            ", zfbz=" + zfbz +
        "}";
    }
}
