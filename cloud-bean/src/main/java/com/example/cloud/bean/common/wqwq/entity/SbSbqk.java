package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 申报情况
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("SB_SBQK")
public class SbSbqk implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申报序号
     */
    @TableId("SBXH")
    private String sbxh;

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
     * 征收项目代码
     */
    @TableField("ZSXM_DM")
    private String zsxmDm;

    /**
     * 申报种类代码
     */
    @TableField("SBZL_DM")
    private String sbzlDm;

    /**
     * 申报税额
     */
    @TableField("SBSE")
    private BigDecimal sbse;

    /**
     * 所属期起
     */
    @TableField("SKSSQQ")
    private LocalDateTime skssqq;

    /**
     * 所属期止
     */
    @TableField("SKSSQZ")
    private LocalDateTime skssqz;

    /**
     * 申报状态
     */
    @TableField("SBZT_DM")
    private String sbztDm;

    /**
     * 申报状态模式
     */
    @TableField("SBZTMS")
    private String sbztms;

    @TableField("QQJYLSH")
    private String qqjylsh;

    @TableField("NBJYLSH")
    private String nbjylsh;

    @TableField("WBJYLSH")
    private String wbjylsh;

    /**
     * 申报日期
     */
    @TableField("SBRQ")
    private LocalDateTime sbrq;

    /**
     * 录入时间
     */
    @TableField("LRSJ")
    private LocalDateTime lrsj;

    /**
     * 申报类型代码 11 正常申报 03 更正申报 01往期申报
     */
    @TableField("SBLX_DM")
    private String sblxDm;

    @TableField("QQJYMXXH")
    private Integer qqjymxxh;

    /**
     * 自动扣款标志
     */
    @TableField("ZDKKBZ")
    private String zdkkbz;

    /**
     * 修改时间
     */
    @TableField("XGSJ")
    private LocalDateTime xgsj;

    @TableField("PZXH")
    private Long pzxh;

    @TableField("DLRSBH")
    private String dlrsbh;

    @TableField("QQWJM")
    private String qqwjm;

    @TableField("SBNY")
    private String sbny;

    @TableField("SCPZXH")
    private Long scpzxh;

    @TableField("QDID")
    private String qdid;

    /**
     * 初非标志
     */
    @TableField("CFBZ")
    private String cfbz;

    /**
     * 是否抄税
     */
    @TableField("CFCS")
    private Integer cfcs;

    /**
     * 用户id
     */
    @TableField("ACCOUNT_ID")
    private String accountId;

    /**
     * 税务机关代码
     */
    @TableField("SWJG_DM")
    private String swjgDm;

    /**
     * 修改人员
     */
    @TableField("XGRY")
    private String xgry;

    /**
     * 修改渠道
     */
    @TableField("XGQD")
    private String xgqd;

    /**
     * 1：国税税种、2：地税税种
     */
    @TableField("GDS_BZ")
    private String gdsBz;

    public String getSbxh() {
        return sbxh;
    }

    public void setSbxh(String sbxh) {
        this.sbxh = sbxh;
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
    public String getZsxmDm() {
        return zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }
    public String getSbzlDm() {
        return sbzlDm;
    }

    public void setSbzlDm(String sbzlDm) {
        this.sbzlDm = sbzlDm;
    }
    public BigDecimal getSbse() {
        return sbse;
    }

    public void setSbse(BigDecimal sbse) {
        this.sbse = sbse;
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
    public String getSbztDm() {
        return sbztDm;
    }

    public void setSbztDm(String sbztDm) {
        this.sbztDm = sbztDm;
    }
    public String getSbztms() {
        return sbztms;
    }

    public void setSbztms(String sbztms) {
        this.sbztms = sbztms;
    }
    public String getQqjylsh() {
        return qqjylsh;
    }

    public void setQqjylsh(String qqjylsh) {
        this.qqjylsh = qqjylsh;
    }
    public String getNbjylsh() {
        return nbjylsh;
    }

    public void setNbjylsh(String nbjylsh) {
        this.nbjylsh = nbjylsh;
    }
    public String getWbjylsh() {
        return wbjylsh;
    }

    public void setWbjylsh(String wbjylsh) {
        this.wbjylsh = wbjylsh;
    }
    public LocalDateTime getSbrq() {
        return sbrq;
    }

    public void setSbrq(LocalDateTime sbrq) {
        this.sbrq = sbrq;
    }
    public LocalDateTime getLrsj() {
        return lrsj;
    }

    public void setLrsj(LocalDateTime lrsj) {
        this.lrsj = lrsj;
    }
    public String getSblxDm() {
        return sblxDm;
    }

    public void setSblxDm(String sblxDm) {
        this.sblxDm = sblxDm;
    }
    public Integer getQqjymxxh() {
        return qqjymxxh;
    }

    public void setQqjymxxh(Integer qqjymxxh) {
        this.qqjymxxh = qqjymxxh;
    }
    public String getZdkkbz() {
        return zdkkbz;
    }

    public void setZdkkbz(String zdkkbz) {
        this.zdkkbz = zdkkbz;
    }
    public LocalDateTime getXgsj() {
        return xgsj;
    }

    public void setXgsj(LocalDateTime xgsj) {
        this.xgsj = xgsj;
    }
    public Long getPzxh() {
        return pzxh;
    }

    public void setPzxh(Long pzxh) {
        this.pzxh = pzxh;
    }
    public String getDlrsbh() {
        return dlrsbh;
    }

    public void setDlrsbh(String dlrsbh) {
        this.dlrsbh = dlrsbh;
    }
    public String getQqwjm() {
        return qqwjm;
    }

    public void setQqwjm(String qqwjm) {
        this.qqwjm = qqwjm;
    }
    public String getSbny() {
        return sbny;
    }

    public void setSbny(String sbny) {
        this.sbny = sbny;
    }
    public Long getScpzxh() {
        return scpzxh;
    }

    public void setScpzxh(Long scpzxh) {
        this.scpzxh = scpzxh;
    }
    public String getQdid() {
        return qdid;
    }

    public void setQdid(String qdid) {
        this.qdid = qdid;
    }
    public String getCfbz() {
        return cfbz;
    }

    public void setCfbz(String cfbz) {
        this.cfbz = cfbz;
    }
    public Integer getCfcs() {
        return cfcs;
    }

    public void setCfcs(Integer cfcs) {
        this.cfcs = cfcs;
    }
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public String getSwjgDm() {
        return swjgDm;
    }

    public void setSwjgDm(String swjgDm) {
        this.swjgDm = swjgDm;
    }
    public String getXgry() {
        return xgry;
    }

    public void setXgry(String xgry) {
        this.xgry = xgry;
    }
    public String getXgqd() {
        return xgqd;
    }

    public void setXgqd(String xgqd) {
        this.xgqd = xgqd;
    }
    public String getGdsBz() {
        return gdsBz;
    }

    public void setGdsBz(String gdsBz) {
        this.gdsBz = gdsBz;
    }

    @Override
    public String toString() {
        return "SbSbqk{" +
            "sbxh=" + sbxh +
            ", djxh=" + djxh +
            ", nsrsbh=" + nsrsbh +
            ", zsxmDm=" + zsxmDm +
            ", sbzlDm=" + sbzlDm +
            ", sbse=" + sbse +
            ", skssqq=" + skssqq +
            ", skssqz=" + skssqz +
            ", sbztDm=" + sbztDm +
            ", sbztms=" + sbztms +
            ", qqjylsh=" + qqjylsh +
            ", nbjylsh=" + nbjylsh +
            ", wbjylsh=" + wbjylsh +
            ", sbrq=" + sbrq +
            ", lrsj=" + lrsj +
            ", sblxDm=" + sblxDm +
            ", qqjymxxh=" + qqjymxxh +
            ", zdkkbz=" + zdkkbz +
            ", xgsj=" + xgsj +
            ", pzxh=" + pzxh +
            ", dlrsbh=" + dlrsbh +
            ", qqwjm=" + qqwjm +
            ", sbny=" + sbny +
            ", scpzxh=" + scpzxh +
            ", qdid=" + qdid +
            ", cfbz=" + cfbz +
            ", cfcs=" + cfcs +
            ", accountId=" + accountId +
            ", swjgDm=" + swjgDm +
            ", xgry=" + xgry +
            ", xgqd=" + xgqd +
            ", gdsBz=" + gdsBz +
        "}";
    }
}
