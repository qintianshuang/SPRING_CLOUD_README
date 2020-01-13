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
@TableName("RD_SFZRDXXB")
public class RdSfzrdxxb implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("RDPZUUID")
    private String rdpzuuid;

    @TableField("DJXH")
    private Long djxh;

    @TableField("ZFSBZ")
    private String zfsbz;

    @TableField("RDZSUUID")
    private String rdzsuuid;

    @TableField("ZSXM_DM")
    private String zsxmDm;

    @TableField("ZSPM_DM")
    private String zspmDm;

    @TableField("ZSZM_DM")
    private String zszmDm;

    @TableField("RDYXQQ")
    private LocalDateTime rdyxqq;

    @TableField("RDYXQZ")
    private LocalDateTime rdyxqz;

    @TableField("HY_DM")
    private String hyDm;

    @TableField("SBQX_DM")
    private String sbqxDm;

    @TableField("NSQX_DM")
    private String nsqxDm;

    @TableField("SLHDWSE")
    private BigDecimal slhdwse;

    @TableField("YSKM_DM")
    private String yskmDm;

    @TableField("ZSL")
    private BigDecimal zsl;

    @TableField("YSFPBL_DM")
    private String ysfpblDm;

    @TableField("SKGK_DM")
    private String skgkDm;

    @TableField("JKQX_DM")
    private String jkqxDm;

    @TableField("ZSDLFS_DM")
    private String zsdlfsDm;

    @TableField("ZGSWSKFJ_DM")
    private String zgswskfjDm;

    @TableField("LRR_DM")
    private String lrrDm;

    @TableField("LRRQ")
    private LocalDateTime lrrq;

    @TableField("XGR_DM")
    private String xgrDm;

    @TableField("XGRQ")
    private LocalDateTime xgrq;

    @TableField("SJGSDQ")
    private String sjgsdq;

    @TableField("YXBZ")
    private String yxbz;

    @TableField("SJTB_SJ")
    private LocalDateTime sjtbSj;

    @TableField("GFJBJG_DM")
    private String gfjbjgDm;

    @TableField("ZSXMCXBZ_DM")
    private String zsxmcxbzDm;

    @TableField("JFJC_DM")
    private String jfjcDm;

    @TableField("SFZYZSPM")
    private String sfzyzspm;

    @TableField("GDSZFSGLUUID")
    private String gdszfsgluuid;

    @TableField("SJBLBZ")
    private Integer sjblbz;

    public String getRdpzuuid() {
        return rdpzuuid;
    }

    public void setRdpzuuid(String rdpzuuid) {
        this.rdpzuuid = rdpzuuid;
    }
    public Long getDjxh() {
        return djxh;
    }

    public void setDjxh(Long djxh) {
        this.djxh = djxh;
    }
    public String getZfsbz() {
        return zfsbz;
    }

    public void setZfsbz(String zfsbz) {
        this.zfsbz = zfsbz;
    }
    public String getRdzsuuid() {
        return rdzsuuid;
    }

    public void setRdzsuuid(String rdzsuuid) {
        this.rdzsuuid = rdzsuuid;
    }
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
    public String getZszmDm() {
        return zszmDm;
    }

    public void setZszmDm(String zszmDm) {
        this.zszmDm = zszmDm;
    }
    public LocalDateTime getRdyxqq() {
        return rdyxqq;
    }

    public void setRdyxqq(LocalDateTime rdyxqq) {
        this.rdyxqq = rdyxqq;
    }
    public LocalDateTime getRdyxqz() {
        return rdyxqz;
    }

    public void setRdyxqz(LocalDateTime rdyxqz) {
        this.rdyxqz = rdyxqz;
    }
    public String getHyDm() {
        return hyDm;
    }

    public void setHyDm(String hyDm) {
        this.hyDm = hyDm;
    }
    public String getSbqxDm() {
        return sbqxDm;
    }

    public void setSbqxDm(String sbqxDm) {
        this.sbqxDm = sbqxDm;
    }
    public String getNsqxDm() {
        return nsqxDm;
    }

    public void setNsqxDm(String nsqxDm) {
        this.nsqxDm = nsqxDm;
    }
    public BigDecimal getSlhdwse() {
        return slhdwse;
    }

    public void setSlhdwse(BigDecimal slhdwse) {
        this.slhdwse = slhdwse;
    }
    public String getYskmDm() {
        return yskmDm;
    }

    public void setYskmDm(String yskmDm) {
        this.yskmDm = yskmDm;
    }
    public BigDecimal getZsl() {
        return zsl;
    }

    public void setZsl(BigDecimal zsl) {
        this.zsl = zsl;
    }
    public String getYsfpblDm() {
        return ysfpblDm;
    }

    public void setYsfpblDm(String ysfpblDm) {
        this.ysfpblDm = ysfpblDm;
    }
    public String getSkgkDm() {
        return skgkDm;
    }

    public void setSkgkDm(String skgkDm) {
        this.skgkDm = skgkDm;
    }
    public String getJkqxDm() {
        return jkqxDm;
    }

    public void setJkqxDm(String jkqxDm) {
        this.jkqxDm = jkqxDm;
    }
    public String getZsdlfsDm() {
        return zsdlfsDm;
    }

    public void setZsdlfsDm(String zsdlfsDm) {
        this.zsdlfsDm = zsdlfsDm;
    }
    public String getZgswskfjDm() {
        return zgswskfjDm;
    }

    public void setZgswskfjDm(String zgswskfjDm) {
        this.zgswskfjDm = zgswskfjDm;
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
    public String getSjgsdq() {
        return sjgsdq;
    }

    public void setSjgsdq(String sjgsdq) {
        this.sjgsdq = sjgsdq;
    }
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }
    public LocalDateTime getSjtbSj() {
        return sjtbSj;
    }

    public void setSjtbSj(LocalDateTime sjtbSj) {
        this.sjtbSj = sjtbSj;
    }
    public String getGfjbjgDm() {
        return gfjbjgDm;
    }

    public void setGfjbjgDm(String gfjbjgDm) {
        this.gfjbjgDm = gfjbjgDm;
    }
    public String getZsxmcxbzDm() {
        return zsxmcxbzDm;
    }

    public void setZsxmcxbzDm(String zsxmcxbzDm) {
        this.zsxmcxbzDm = zsxmcxbzDm;
    }
    public String getJfjcDm() {
        return jfjcDm;
    }

    public void setJfjcDm(String jfjcDm) {
        this.jfjcDm = jfjcDm;
    }
    public String getSfzyzspm() {
        return sfzyzspm;
    }

    public void setSfzyzspm(String sfzyzspm) {
        this.sfzyzspm = sfzyzspm;
    }
    public String getGdszfsgluuid() {
        return gdszfsgluuid;
    }

    public void setGdszfsgluuid(String gdszfsgluuid) {
        this.gdszfsgluuid = gdszfsgluuid;
    }
    public Integer getSjblbz() {
        return sjblbz;
    }

    public void setSjblbz(Integer sjblbz) {
        this.sjblbz = sjblbz;
    }

    @Override
    public String toString() {
        return "RdSfzrdxxb{" +
            "rdpzuuid=" + rdpzuuid +
            ", djxh=" + djxh +
            ", zfsbz=" + zfsbz +
            ", rdzsuuid=" + rdzsuuid +
            ", zsxmDm=" + zsxmDm +
            ", zspmDm=" + zspmDm +
            ", zszmDm=" + zszmDm +
            ", rdyxqq=" + rdyxqq +
            ", rdyxqz=" + rdyxqz +
            ", hyDm=" + hyDm +
            ", sbqxDm=" + sbqxDm +
            ", nsqxDm=" + nsqxDm +
            ", slhdwse=" + slhdwse +
            ", yskmDm=" + yskmDm +
            ", zsl=" + zsl +
            ", ysfpblDm=" + ysfpblDm +
            ", skgkDm=" + skgkDm +
            ", jkqxDm=" + jkqxDm +
            ", zsdlfsDm=" + zsdlfsDm +
            ", zgswskfjDm=" + zgswskfjDm +
            ", lrrDm=" + lrrDm +
            ", lrrq=" + lrrq +
            ", xgrDm=" + xgrDm +
            ", xgrq=" + xgrq +
            ", sjgsdq=" + sjgsdq +
            ", yxbz=" + yxbz +
            ", sjtbSj=" + sjtbSj +
            ", gfjbjgDm=" + gfjbjgDm +
            ", zsxmcxbzDm=" + zsxmcxbzDm +
            ", jfjcDm=" + jfjcDm +
            ", sfzyzspm=" + sfzyzspm +
            ", gdszfsgluuid=" + gdszfsgluuid +
            ", sjblbz=" + sjblbz +
        "}";
    }
}
