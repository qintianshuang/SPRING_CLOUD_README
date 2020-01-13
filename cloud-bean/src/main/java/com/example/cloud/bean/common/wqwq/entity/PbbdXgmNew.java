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
@TableName("PBBD_XGM_NEW")
public class PbbdXgmNew implements Serializable {

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
     * 社会信用代码
     */
    @TableField("SHXYDM")
    private String shxydm;

    /**
     * 季度
     */
    @TableField("JD_DM")
    private String jdDm;

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
     * 专用发票自开不含税销售额—货物3%
     */
    @TableField("ZYFPZKBHSXSE_HW")
    private BigDecimal zyfpzkbhsxseHw;

    /**
     * 专用发票自开不含税销售额—服物3%
     */
    @TableField("ZYFPZKBHSXSE_FW1")
    private BigDecimal zyfpzkbhsxseFw1;

    /**
     * 专用发票自开不含税销售额—服物5%
     */
    @TableField("ZYFPZKBHSXSE_FW2")
    private BigDecimal zyfpzkbhsxseFw2;

    /**
     * 专用发票代开不含税销售额-货物3%
     */
    @TableField("ZYFPDKBHSXSE_HW")
    private BigDecimal zyfpdkbhsxseHw;

    /**
     * 专用发票代开不含税销售额-服务3%
     */
    @TableField("ZYFPDKBHSXSE_FW1")
    private BigDecimal zyfpdkbhsxseFw1;

    /**
     * 专用发票代开不含税销售额-服务5%
     */
    @TableField("ZYFPDKBHSXSE_FW2")
    private BigDecimal zyfpdkbhsxseFw2;

    /**
     * 普通发票自开不含税销售额-货物3%
     */
    @TableField("PTFPZKBHSXSE_HW")
    private BigDecimal ptfpzkbhsxseHw;

    /**
     * 普通发票自开不含税销售额-服务3%
     */
    @TableField("PTFPZKBHSXSE_FW1")
    private BigDecimal ptfpzkbhsxseFw1;

    /**
     * 普通发票自开不含税销售额—服务5%
     */
    @TableField("PTFPZKBHSXSE_FW2")
    private BigDecimal ptfpzkbhsxseFw2;

    /**
     * 普通发票代开不含税销售额-货物3%
     */
    @TableField("PTFPDKBHSXSE_HW")
    private BigDecimal ptfpdkbhsxseHw;

    /**
     * 普通发票代开不含税销售额-服务3%
     */
    @TableField("PTFPDKBHSXSE_FW1")
    private BigDecimal ptfpdkbhsxseFw1;

    /**
     * 普通发票代开不含税销售额-服务5%
     */
    @TableField("PTFPDKBHSXSE_FW2")
    private BigDecimal ptfpdkbhsxseFw2;

    /**
     * 销售不动产普通发票
     */
    @TableField("XSBDCPTFP")
    private BigDecimal xsbdcptfp;

    /**
     * 销售不动产专用发票
     */
    @TableField("XSBDCZYFP")
    private BigDecimal xsbdczyfp;

    /**
     * 开票系统免税销售额
     */
    @TableField("KPXTMSXSE")
    private BigDecimal kpxtmsxse;

    /**
     * 网络发票
     */
    @TableField("WLFP")
    private BigDecimal wlfp;

    /**
     * 专用发票自开不含税销售额
     */
    @TableField("ZYFPZKBHSXSE")
    private BigDecimal zyfpzkbhsxse;

    /**
     * 普通发票自开不含税销售额
     */
    @TableField("PTFPZKBHSXSE")
    private BigDecimal ptfpzkbhsxse;

    /**
     * 专用发票代开不含税销售额
     */
    @TableField("ZYFPDKBHSXSE")
    private BigDecimal zyfpdkbhsxse;

    /**
     * 普通发票代开不含税销售额
     */
    @TableField("PTFPDKBHSXSE")
    private BigDecimal ptfpdkbhsxse;

    /**
     * 数据加工日期
     */
    @TableField("SJJCPCH")
    private LocalDateTime sjjcpch;

    /**
     * 数据增量时间
     */
    @TableField("SJJCSJ")
    private LocalDateTime sjjcsj;

    /**
     * 机动车发票
     */
    @TableField("JDCFP")
    private String jdcfp;

    /**
     * 抄报状态
     */
    @TableField("CBZT")
    private String cbzt;

    /**
     * 货运专票
     */
    @TableField("HYZP")
    private String hyzp;

    /**
     * 卷式发票
     */
    @TableField("JSFP")
    private String jsfp;

    /**
     * 电子发票
     */
    @TableField("DZFP")
    private String dzfp;

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
    public String getJdDm() {
        return jdDm;
    }

    public void setJdDm(String jdDm) {
        this.jdDm = jdDm;
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
    public BigDecimal getZyfpzkbhsxseHw() {
        return zyfpzkbhsxseHw;
    }

    public void setZyfpzkbhsxseHw(BigDecimal zyfpzkbhsxseHw) {
        this.zyfpzkbhsxseHw = zyfpzkbhsxseHw;
    }
    public BigDecimal getZyfpzkbhsxseFw1() {
        return zyfpzkbhsxseFw1;
    }

    public void setZyfpzkbhsxseFw1(BigDecimal zyfpzkbhsxseFw1) {
        this.zyfpzkbhsxseFw1 = zyfpzkbhsxseFw1;
    }
    public BigDecimal getZyfpzkbhsxseFw2() {
        return zyfpzkbhsxseFw2;
    }

    public void setZyfpzkbhsxseFw2(BigDecimal zyfpzkbhsxseFw2) {
        this.zyfpzkbhsxseFw2 = zyfpzkbhsxseFw2;
    }
    public BigDecimal getZyfpdkbhsxseHw() {
        return zyfpdkbhsxseHw;
    }

    public void setZyfpdkbhsxseHw(BigDecimal zyfpdkbhsxseHw) {
        this.zyfpdkbhsxseHw = zyfpdkbhsxseHw;
    }
    public BigDecimal getZyfpdkbhsxseFw1() {
        return zyfpdkbhsxseFw1;
    }

    public void setZyfpdkbhsxseFw1(BigDecimal zyfpdkbhsxseFw1) {
        this.zyfpdkbhsxseFw1 = zyfpdkbhsxseFw1;
    }
    public BigDecimal getZyfpdkbhsxseFw2() {
        return zyfpdkbhsxseFw2;
    }

    public void setZyfpdkbhsxseFw2(BigDecimal zyfpdkbhsxseFw2) {
        this.zyfpdkbhsxseFw2 = zyfpdkbhsxseFw2;
    }
    public BigDecimal getPtfpzkbhsxseHw() {
        return ptfpzkbhsxseHw;
    }

    public void setPtfpzkbhsxseHw(BigDecimal ptfpzkbhsxseHw) {
        this.ptfpzkbhsxseHw = ptfpzkbhsxseHw;
    }
    public BigDecimal getPtfpzkbhsxseFw1() {
        return ptfpzkbhsxseFw1;
    }

    public void setPtfpzkbhsxseFw1(BigDecimal ptfpzkbhsxseFw1) {
        this.ptfpzkbhsxseFw1 = ptfpzkbhsxseFw1;
    }
    public BigDecimal getPtfpzkbhsxseFw2() {
        return ptfpzkbhsxseFw2;
    }

    public void setPtfpzkbhsxseFw2(BigDecimal ptfpzkbhsxseFw2) {
        this.ptfpzkbhsxseFw2 = ptfpzkbhsxseFw2;
    }
    public BigDecimal getPtfpdkbhsxseHw() {
        return ptfpdkbhsxseHw;
    }

    public void setPtfpdkbhsxseHw(BigDecimal ptfpdkbhsxseHw) {
        this.ptfpdkbhsxseHw = ptfpdkbhsxseHw;
    }
    public BigDecimal getPtfpdkbhsxseFw1() {
        return ptfpdkbhsxseFw1;
    }

    public void setPtfpdkbhsxseFw1(BigDecimal ptfpdkbhsxseFw1) {
        this.ptfpdkbhsxseFw1 = ptfpdkbhsxseFw1;
    }
    public BigDecimal getPtfpdkbhsxseFw2() {
        return ptfpdkbhsxseFw2;
    }

    public void setPtfpdkbhsxseFw2(BigDecimal ptfpdkbhsxseFw2) {
        this.ptfpdkbhsxseFw2 = ptfpdkbhsxseFw2;
    }
    public BigDecimal getXsbdcptfp() {
        return xsbdcptfp;
    }

    public void setXsbdcptfp(BigDecimal xsbdcptfp) {
        this.xsbdcptfp = xsbdcptfp;
    }
    public BigDecimal getXsbdczyfp() {
        return xsbdczyfp;
    }

    public void setXsbdczyfp(BigDecimal xsbdczyfp) {
        this.xsbdczyfp = xsbdczyfp;
    }
    public BigDecimal getKpxtmsxse() {
        return kpxtmsxse;
    }

    public void setKpxtmsxse(BigDecimal kpxtmsxse) {
        this.kpxtmsxse = kpxtmsxse;
    }
    public BigDecimal getWlfp() {
        return wlfp;
    }

    public void setWlfp(BigDecimal wlfp) {
        this.wlfp = wlfp;
    }
    public BigDecimal getZyfpzkbhsxse() {
        return zyfpzkbhsxse;
    }

    public void setZyfpzkbhsxse(BigDecimal zyfpzkbhsxse) {
        this.zyfpzkbhsxse = zyfpzkbhsxse;
    }
    public BigDecimal getPtfpzkbhsxse() {
        return ptfpzkbhsxse;
    }

    public void setPtfpzkbhsxse(BigDecimal ptfpzkbhsxse) {
        this.ptfpzkbhsxse = ptfpzkbhsxse;
    }
    public BigDecimal getZyfpdkbhsxse() {
        return zyfpdkbhsxse;
    }

    public void setZyfpdkbhsxse(BigDecimal zyfpdkbhsxse) {
        this.zyfpdkbhsxse = zyfpdkbhsxse;
    }
    public BigDecimal getPtfpdkbhsxse() {
        return ptfpdkbhsxse;
    }

    public void setPtfpdkbhsxse(BigDecimal ptfpdkbhsxse) {
        this.ptfpdkbhsxse = ptfpdkbhsxse;
    }
    public LocalDateTime getSjjcpch() {
        return sjjcpch;
    }

    public void setSjjcpch(LocalDateTime sjjcpch) {
        this.sjjcpch = sjjcpch;
    }
    public LocalDateTime getSjjcsj() {
        return sjjcsj;
    }

    public void setSjjcsj(LocalDateTime sjjcsj) {
        this.sjjcsj = sjjcsj;
    }
    public String getJdcfp() {
        return jdcfp;
    }

    public void setJdcfp(String jdcfp) {
        this.jdcfp = jdcfp;
    }
    public String getCbzt() {
        return cbzt;
    }

    public void setCbzt(String cbzt) {
        this.cbzt = cbzt;
    }
    public String getHyzp() {
        return hyzp;
    }

    public void setHyzp(String hyzp) {
        this.hyzp = hyzp;
    }
    public String getJsfp() {
        return jsfp;
    }

    public void setJsfp(String jsfp) {
        this.jsfp = jsfp;
    }
    public String getDzfp() {
        return dzfp;
    }

    public void setDzfp(String dzfp) {
        this.dzfp = dzfp;
    }

    @Override
    public String toString() {
        return "PbbdXgmNew{" +
            "djxh=" + djxh +
            ", nsrsbh=" + nsrsbh +
            ", shxydm=" + shxydm +
            ", jdDm=" + jdDm +
            ", skssqq=" + skssqq +
            ", skssqz=" + skssqz +
            ", zyfpzkbhsxseHw=" + zyfpzkbhsxseHw +
            ", zyfpzkbhsxseFw1=" + zyfpzkbhsxseFw1 +
            ", zyfpzkbhsxseFw2=" + zyfpzkbhsxseFw2 +
            ", zyfpdkbhsxseHw=" + zyfpdkbhsxseHw +
            ", zyfpdkbhsxseFw1=" + zyfpdkbhsxseFw1 +
            ", zyfpdkbhsxseFw2=" + zyfpdkbhsxseFw2 +
            ", ptfpzkbhsxseHw=" + ptfpzkbhsxseHw +
            ", ptfpzkbhsxseFw1=" + ptfpzkbhsxseFw1 +
            ", ptfpzkbhsxseFw2=" + ptfpzkbhsxseFw2 +
            ", ptfpdkbhsxseHw=" + ptfpdkbhsxseHw +
            ", ptfpdkbhsxseFw1=" + ptfpdkbhsxseFw1 +
            ", ptfpdkbhsxseFw2=" + ptfpdkbhsxseFw2 +
            ", xsbdcptfp=" + xsbdcptfp +
            ", xsbdczyfp=" + xsbdczyfp +
            ", kpxtmsxse=" + kpxtmsxse +
            ", wlfp=" + wlfp +
            ", zyfpzkbhsxse=" + zyfpzkbhsxse +
            ", ptfpzkbhsxse=" + ptfpzkbhsxse +
            ", zyfpdkbhsxse=" + zyfpdkbhsxse +
            ", ptfpdkbhsxse=" + ptfpdkbhsxse +
            ", sjjcpch=" + sjjcpch +
            ", sjjcsj=" + sjjcsj +
            ", jdcfp=" + jdcfp +
            ", cbzt=" + cbzt +
            ", hyzp=" + hyzp +
            ", jsfp=" + jsfp +
            ", dzfp=" + dzfp +
        "}";
    }
}
