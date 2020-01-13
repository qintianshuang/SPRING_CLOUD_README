package com.example.cloud.bean.common.wqwq.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("HX_ZGXT_SB_SBXX")
public class HxZgxtSbSbxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("SBXXUUID")
    private String sbxxuuid;

    @TableField("SBUUID")
    private String sbuuid;

    @TableField("DJXH")
    private Long djxh;

    @TableField("PZXH")
    private Long pzxh;

    @TableField("PZMXXH")
    private Long pzmxxh;

    @TableField("ZSPZMXXH")
    private Long zspzmxxh;

    @TableField("ZSXM_DM")
    private String zsxmDm;

    @TableField("ZSPM_DM")
    private String zspmDm;

    @TableField("ZSZM_DM")
    private String zszmDm;

    @TableField("YZPZZL_DM")
    private String yzpzzlDm;

    @TableField("SBQX")
    private LocalDateTime sbqx;

    @TableField("YSBQX")
    private LocalDateTime ysbqx;

    @TableField("NSSBRQ")
    private LocalDateTime nssbrq;

    @TableField("SKSSQQ")
    private LocalDateTime skssqq;

    @TableField("SKSSQZ")
    private LocalDateTime skssqz;

    @TableField("YSX")
    private BigDecimal ysx;

    @TableField("JSYJ")
    private BigDecimal jsyj;

    @TableField("SL_1")
    private BigDecimal sl1;

    @TableField("YNSE")
    private BigDecimal ynse;

    @TableField("YJSE")
    private BigDecimal yjse;

    @TableField("JMSE")
    private BigDecimal jmse;

    @TableField("YBTSE")
    private BigDecimal ybtse;

    @TableField("DJZCLX_DM")
    private String djzclxDm;

    @TableField("HY_DM")
    private String hyDm;

    @TableField("SBFS_DM")
    private String sbfsDm;

    @TableField("ZSFS_DM")
    private String zsfsDm;

    @TableField("ZSDLFS_DM")
    private String zsdlfsDm;

    @TableField("JDXZ_DM")
    private String jdxzDm;

    @TableField("ZFRQ_1")
    private LocalDateTime zfrq1;

    @TableField("ZFBZ_1")
    private String zfbz1;

    @TableField("ZFR_DM")
    private String zfrDm;

    @TableField("SSGLY_DM")
    private String ssglyDm;

    @TableField("ZGSWSKFJ_DM")
    private String zgswskfjDm;

    @TableField("RDPZUUID")
    private String rdpzuuid;

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

    @TableField("GZLX_DM_1")
    private String gzlxDm1;

    @TableField("SBSX_DM_1")
    private String sbsxDm1;

    @TableField("SJTB_SJ")
    private LocalDateTime sjtbSj;

    @TableField("SYBH_1")
    private String sybh1;

    @TableField("JZJTSKBZ")
    private String jzjtskbz;

    @TableField("NSQX_DM")
    private String nsqxDm;

    @TableField("SJBLBZ")
    private Integer sjblbz;

    public String getSbxxuuid() {
        return sbxxuuid;
    }

    public void setSbxxuuid(String sbxxuuid) {
        this.sbxxuuid = sbxxuuid;
    }
    public String getSbuuid() {
        return sbuuid;
    }

    public void setSbuuid(String sbuuid) {
        this.sbuuid = sbuuid;
    }
    public Long getDjxh() {
        return djxh;
    }

    public void setDjxh(Long djxh) {
        this.djxh = djxh;
    }
    public Long getPzxh() {
        return pzxh;
    }

    public void setPzxh(Long pzxh) {
        this.pzxh = pzxh;
    }
    public Long getPzmxxh() {
        return pzmxxh;
    }

    public void setPzmxxh(Long pzmxxh) {
        this.pzmxxh = pzmxxh;
    }
    public Long getZspzmxxh() {
        return zspzmxxh;
    }

    public void setZspzmxxh(Long zspzmxxh) {
        this.zspzmxxh = zspzmxxh;
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
    public String getYzpzzlDm() {
        return yzpzzlDm;
    }

    public void setYzpzzlDm(String yzpzzlDm) {
        this.yzpzzlDm = yzpzzlDm;
    }
    public LocalDateTime getSbqx() {
        return sbqx;
    }

    public void setSbqx(LocalDateTime sbqx) {
        this.sbqx = sbqx;
    }
    public LocalDateTime getYsbqx() {
        return ysbqx;
    }

    public void setYsbqx(LocalDateTime ysbqx) {
        this.ysbqx = ysbqx;
    }
    public LocalDateTime getNssbrq() {
        return nssbrq;
    }

    public void setNssbrq(LocalDateTime nssbrq) {
        this.nssbrq = nssbrq;
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
    public BigDecimal getYsx() {
        return ysx;
    }

    public void setYsx(BigDecimal ysx) {
        this.ysx = ysx;
    }
    public BigDecimal getJsyj() {
        return jsyj;
    }

    public void setJsyj(BigDecimal jsyj) {
        this.jsyj = jsyj;
    }
    public BigDecimal getSl1() {
        return sl1;
    }

    public void setSl1(BigDecimal sl1) {
        this.sl1 = sl1;
    }
    public BigDecimal getYnse() {
        return ynse;
    }

    public void setYnse(BigDecimal ynse) {
        this.ynse = ynse;
    }
    public BigDecimal getYjse() {
        return yjse;
    }

    public void setYjse(BigDecimal yjse) {
        this.yjse = yjse;
    }
    public BigDecimal getJmse() {
        return jmse;
    }

    public void setJmse(BigDecimal jmse) {
        this.jmse = jmse;
    }
    public BigDecimal getYbtse() {
        return ybtse;
    }

    public void setYbtse(BigDecimal ybtse) {
        this.ybtse = ybtse;
    }
    public String getDjzclxDm() {
        return djzclxDm;
    }

    public void setDjzclxDm(String djzclxDm) {
        this.djzclxDm = djzclxDm;
    }
    public String getHyDm() {
        return hyDm;
    }

    public void setHyDm(String hyDm) {
        this.hyDm = hyDm;
    }
    public String getSbfsDm() {
        return sbfsDm;
    }

    public void setSbfsDm(String sbfsDm) {
        this.sbfsDm = sbfsDm;
    }
    public String getZsfsDm() {
        return zsfsDm;
    }

    public void setZsfsDm(String zsfsDm) {
        this.zsfsDm = zsfsDm;
    }
    public String getZsdlfsDm() {
        return zsdlfsDm;
    }

    public void setZsdlfsDm(String zsdlfsDm) {
        this.zsdlfsDm = zsdlfsDm;
    }
    public String getJdxzDm() {
        return jdxzDm;
    }

    public void setJdxzDm(String jdxzDm) {
        this.jdxzDm = jdxzDm;
    }
    public LocalDateTime getZfrq1() {
        return zfrq1;
    }

    public void setZfrq1(LocalDateTime zfrq1) {
        this.zfrq1 = zfrq1;
    }
    public String getZfbz1() {
        return zfbz1;
    }

    public void setZfbz1(String zfbz1) {
        this.zfbz1 = zfbz1;
    }
    public String getZfrDm() {
        return zfrDm;
    }

    public void setZfrDm(String zfrDm) {
        this.zfrDm = zfrDm;
    }
    public String getSsglyDm() {
        return ssglyDm;
    }

    public void setSsglyDm(String ssglyDm) {
        this.ssglyDm = ssglyDm;
    }
    public String getZgswskfjDm() {
        return zgswskfjDm;
    }

    public void setZgswskfjDm(String zgswskfjDm) {
        this.zgswskfjDm = zgswskfjDm;
    }
    public String getRdpzuuid() {
        return rdpzuuid;
    }

    public void setRdpzuuid(String rdpzuuid) {
        this.rdpzuuid = rdpzuuid;
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
    public String getGzlxDm1() {
        return gzlxDm1;
    }

    public void setGzlxDm1(String gzlxDm1) {
        this.gzlxDm1 = gzlxDm1;
    }
    public String getSbsxDm1() {
        return sbsxDm1;
    }

    public void setSbsxDm1(String sbsxDm1) {
        this.sbsxDm1 = sbsxDm1;
    }
    public LocalDateTime getSjtbSj() {
        return sjtbSj;
    }

    public void setSjtbSj(LocalDateTime sjtbSj) {
        this.sjtbSj = sjtbSj;
    }
    public String getSybh1() {
        return sybh1;
    }

    public void setSybh1(String sybh1) {
        this.sybh1 = sybh1;
    }
    public String getJzjtskbz() {
        return jzjtskbz;
    }

    public void setJzjtskbz(String jzjtskbz) {
        this.jzjtskbz = jzjtskbz;
    }
    public String getNsqxDm() {
        return nsqxDm;
    }

    public void setNsqxDm(String nsqxDm) {
        this.nsqxDm = nsqxDm;
    }
    public Integer getSjblbz() {
        return sjblbz;
    }

    public void setSjblbz(Integer sjblbz) {
        this.sjblbz = sjblbz;
    }

    @Override
    public String toString() {
        return "HxZgxtSbSbxx{" +
            "sbxxuuid=" + sbxxuuid +
            ", sbuuid=" + sbuuid +
            ", djxh=" + djxh +
            ", pzxh=" + pzxh +
            ", pzmxxh=" + pzmxxh +
            ", zspzmxxh=" + zspzmxxh +
            ", zsxmDm=" + zsxmDm +
            ", zspmDm=" + zspmDm +
            ", zszmDm=" + zszmDm +
            ", yzpzzlDm=" + yzpzzlDm +
            ", sbqx=" + sbqx +
            ", ysbqx=" + ysbqx +
            ", nssbrq=" + nssbrq +
            ", skssqq=" + skssqq +
            ", skssqz=" + skssqz +
            ", ysx=" + ysx +
            ", jsyj=" + jsyj +
            ", sl1=" + sl1 +
            ", ynse=" + ynse +
            ", yjse=" + yjse +
            ", jmse=" + jmse +
            ", ybtse=" + ybtse +
            ", djzclxDm=" + djzclxDm +
            ", hyDm=" + hyDm +
            ", sbfsDm=" + sbfsDm +
            ", zsfsDm=" + zsfsDm +
            ", zsdlfsDm=" + zsdlfsDm +
            ", jdxzDm=" + jdxzDm +
            ", zfrq1=" + zfrq1 +
            ", zfbz1=" + zfbz1 +
            ", zfrDm=" + zfrDm +
            ", ssglyDm=" + ssglyDm +
            ", zgswskfjDm=" + zgswskfjDm +
            ", rdpzuuid=" + rdpzuuid +
            ", lrrDm=" + lrrDm +
            ", lrrq=" + lrrq +
            ", xgrDm=" + xgrDm +
            ", xgrq=" + xgrq +
            ", sjgsdq=" + sjgsdq +
            ", gzlxDm1=" + gzlxDm1 +
            ", sbsxDm1=" + sbsxDm1 +
            ", sjtbSj=" + sjtbSj +
            ", sybh1=" + sybh1 +
            ", jzjtskbz=" + jzjtskbz +
            ", nsqxDm=" + nsqxDm +
            ", sjblbz=" + sjblbz +
        "}";
    }
}
