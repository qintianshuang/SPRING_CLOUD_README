package com.example.cloud.bean.common.wqwq.entity;

import java.math.BigDecimal;
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
@TableName("HX_DM_QG_DM_GY_ZSPM")
public class HxDmQgDmGyZspm implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ZSXM_DM")
    private String zsxmDm;

    @TableField("ZSPM_DM")
    private String zspmDm;

    @TableField("ZSPMMC")
    private String zspmmc;

    @TableField("JLDW_DM")
    private String jldwDm;

    @TableField("SL_1")
    private BigDecimal sl1;

    @TableField("ZSL")
    private BigDecimal zsl;

    @TableField("XYBZ")
    private String xybz;

    @TableField("YXBZ")
    private String yxbz;

    @TableField("SJZSPM_DM")
    private String sjzspmDm;

    @TableField("SLJSFS_DM")
    private String sljsfsDm;

    @TableField("YXQZ")
    private LocalDateTime yxqz;

    @TableField("YXQQ")
    private LocalDateTime yxqq;

    @TableField("BZ")
    private String bz;

    @TableField("XGRQ")
    private LocalDateTime xgrq;

    @TableField("SFYGZZSPMBZ")
    private String sfygzzspmbz;

    @TableField("SF2016YGZBZ")
    private String sf2016ygzbz;

    public String getZsxmDm() {
        return zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }
    public String getZspmDm() {
        return zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }
    public String getZspmmc() {
        return zspmmc;
    }

    public void setZspmmc(String zspmmc) {
        this.zspmmc = zspmmc;
    }
    public String getJldwDm() {
        return jldwDm;
    }

    public void setJldwDm(String jldwDm) {
        this.jldwDm = jldwDm;
    }
    public BigDecimal getSl1() {
        return sl1;
    }

    public void setSl1(BigDecimal sl1) {
        this.sl1 = sl1;
    }
    public BigDecimal getZsl() {
        return zsl;
    }

    public void setZsl(BigDecimal zsl) {
        this.zsl = zsl;
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
    public String getSjzspmDm() {
        return sjzspmDm;
    }

    public void setSjzspmDm(String sjzspmDm) {
        this.sjzspmDm = sjzspmDm;
    }
    public String getSljsfsDm() {
        return sljsfsDm;
    }

    public void setSljsfsDm(String sljsfsDm) {
        this.sljsfsDm = sljsfsDm;
    }
    public LocalDateTime getYxqz() {
        return yxqz;
    }

    public void setYxqz(LocalDateTime yxqz) {
        this.yxqz = yxqz;
    }
    public LocalDateTime getYxqq() {
        return yxqq;
    }

    public void setYxqq(LocalDateTime yxqq) {
        this.yxqq = yxqq;
    }
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
    public LocalDateTime getXgrq() {
        return xgrq;
    }

    public void setXgrq(LocalDateTime xgrq) {
        this.xgrq = xgrq;
    }
    public String getSfygzzspmbz() {
        return sfygzzspmbz;
    }

    public void setSfygzzspmbz(String sfygzzspmbz) {
        this.sfygzzspmbz = sfygzzspmbz;
    }
    public String getSf2016ygzbz() {
        return sf2016ygzbz;
    }

    public void setSf2016ygzbz(String sf2016ygzbz) {
        this.sf2016ygzbz = sf2016ygzbz;
    }

    @Override
    public String toString() {
        return "HxDmQgDmGyZspm{" +
            "zsxmDm=" + zsxmDm +
            ", zspmDm=" + zspmDm +
            ", zspmmc=" + zspmmc +
            ", jldwDm=" + jldwDm +
            ", sl1=" + sl1 +
            ", zsl=" + zsl +
            ", xybz=" + xybz +
            ", yxbz=" + yxbz +
            ", sjzspmDm=" + sjzspmDm +
            ", sljsfsDm=" + sljsfsDm +
            ", yxqz=" + yxqz +
            ", yxqq=" + yxqq +
            ", bz=" + bz +
            ", xgrq=" + xgrq +
            ", sfygzzspmbz=" + sfygzzspmbz +
            ", sf2016ygzbz=" + sf2016ygzbz +
        "}";
    }
}
