package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("HX_ZGXT_CS_GY_SSJMXZJMFDEDSLGX")
public class HxZgxtCsGySsjmxzjmfdedslgx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SSJMXZ_DM")
    private String ssjmxzDm;

    @TableField("SWJG_DM")
    private String swjgDm;

    @TableField("JMFD")
    private BigDecimal jmfd;

    @TableField("JMED")
    private BigDecimal jmed;

    @TableField("JMSL")
    private BigDecimal jmsl;

    @TableField("XYBZ")
    private String xybz;

    @TableField("YXBZ")
    private String yxbz;

    @TableField("LRR_DM")
    private String lrrDm;

    @TableField("LRRQ")
    private LocalDateTime lrrq;

    @TableField("XGR_DM")
    private String xgrDm;

    @TableField("XGRQ")
    private LocalDateTime xgrq;

    public String getSsjmxzDm() {
        return ssjmxzDm;
    }

    public void setSsjmxzDm(String ssjmxzDm) {
        this.ssjmxzDm = ssjmxzDm;
    }
    public String getSwjgDm() {
        return swjgDm;
    }

    public void setSwjgDm(String swjgDm) {
        this.swjgDm = swjgDm;
    }
    public BigDecimal getJmfd() {
        return jmfd;
    }

    public void setJmfd(BigDecimal jmfd) {
        this.jmfd = jmfd;
    }
    public BigDecimal getJmed() {
        return jmed;
    }

    public void setJmed(BigDecimal jmed) {
        this.jmed = jmed;
    }
    public BigDecimal getJmsl() {
        return jmsl;
    }

    public void setJmsl(BigDecimal jmsl) {
        this.jmsl = jmsl;
    }
    public String getXybz() {
        return xybz;
    }

    public void setXybz(String xybz) {
        this.xybz = xybz;
    }
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
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

    @Override
    public String toString() {
        return "HxZgxtCsGySsjmxzjmfdedslgx{" +
            "ssjmxzDm=" + ssjmxzDm +
            ", swjgDm=" + swjgDm +
            ", jmfd=" + jmfd +
            ", jmed=" + jmed +
            ", jmsl=" + jmsl +
            ", xybz=" + xybz +
            ", yxbz=" + yxbz +
            ", lrrDm=" + lrrDm +
            ", lrrq=" + lrrq +
            ", xgrDm=" + xgrDm +
            ", xgrq=" + xgrq +
        "}";
    }
}
