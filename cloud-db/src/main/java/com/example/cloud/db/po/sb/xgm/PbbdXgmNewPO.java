package com.example.cloud.db.po.sb.xgm;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.cloud.service.base.po.BasePO;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author qts
 * @since 2020-03-02
 */
@TableName("PBBD_XGM_NEW")
public class PbbdXgmNewPO extends BasePO {

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
    private Date skssqq;

    /**
     * 税款所属期止
     */
    @TableField("SKSSQZ")
    private Date skssqz;

    /**
     * 专用发票自开不含税销售额—货物3%
     */
    @TableField("ZYFPZKBHSXSE_HW")
    private String zyfpzkbhsxseHw;

    /**
     * 专用发票自开不含税销售额—服物3%
     */
    @TableField("ZYFPZKBHSXSE_FW1")
    private String zyfpzkbhsxseFw1;

    /**
     * 专用发票自开不含税销售额—服物5%
     */
    @TableField("ZYFPZKBHSXSE_FW2")
    private String zyfpzkbhsxseFw2;

    /**
     * 专用发票代开不含税销售额-货物3%
     */
    @TableField("ZYFPDKBHSXSE_HW")
    private String zyfpdkbhsxseHw;

    /**
     * 专用发票代开不含税销售额-服务3%
     */
    @TableField("ZYFPDKBHSXSE_FW1")
    private String zyfpdkbhsxseFw1;

    /**
     * 专用发票代开不含税销售额-服务5%
     */
    @TableField("ZYFPDKBHSXSE_FW2")
    private String zyfpdkbhsxseFw2;

    /**
     * 普通发票自开不含税销售额-货物3%
     */
    @TableField("PTFPZKBHSXSE_HW")
    private String ptfpzkbhsxseHw;

    /**
     * 普通发票自开不含税销售额-服务3%
     */
    @TableField("PTFPZKBHSXSE_FW1")
    private String ptfpzkbhsxseFw1;

    /**
     * 普通发票自开不含税销售额—服务5%
     */
    @TableField("PTFPZKBHSXSE_FW2")
    private String ptfpzkbhsxseFw2;

    /**
     * 普通发票代开不含税销售额-货物3%
     */
    @TableField("PTFPDKBHSXSE_HW")
    private String ptfpdkbhsxseHw;

    /**
     * 普通发票代开不含税销售额-服务3%
     */
    @TableField("PTFPDKBHSXSE_FW1")
    private String ptfpdkbhsxseFw1;

    /**
     * 普通发票代开不含税销售额-服务5%
     */
    @TableField("PTFPDKBHSXSE_FW2")
    private String ptfpdkbhsxseFw2;

    /**
     * 销售不动产普通发票
     */
    @TableField("XSBDCPTFP")
    private String xsbdcptfp;

    /**
     * 销售不动产专用发票
     */
    @TableField("XSBDCZYFP")
    private String xsbdczyfp;

    /**
     * 开票系统免税销售额
     */
    @TableField("KPXTMSXSE")
    private String kpxtmsxse;

    /**
     * 网络发票
     */
    @TableField("WLFP")
    private String wlfp;

    /**
     * 专用发票自开不含税销售额
     */
    @TableField("ZYFPZKBHSXSE")
    private String zyfpzkbhsxse;

    /**
     * 普通发票自开不含税销售额
     */
    @TableField("PTFPZKBHSXSE")
    private String ptfpzkbhsxse;

    /**
     * 专用发票代开不含税销售额
     */
    @TableField("ZYFPDKBHSXSE")
    private String zyfpdkbhsxse;

    /**
     * 普通发票代开不含税销售额
     */
    @TableField("PTFPDKBHSXSE")
    private String ptfpdkbhsxse;

    /**
     * 数据加工日期
     */
    @TableField("SJJCPCH")
    private Date sjjcpch;

    /**
     * 数据增量时间
     */
    @TableField("SJJCSJ")
    private Date sjjcsj;

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

    public PbbdXgmNewPO() {
    }

    public PbbdXgmNewPO(String djxh, Date skssqq, Date skssqz) {
        this.djxh = djxh;
        this.skssqq = skssqq;
        this.skssqz = skssqz;
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

    public Date getSkssqq() {
        return skssqq;
    }

    public void setSkssqq(Date skssqq) {
        this.skssqq = skssqq;
    }

    public Date getSkssqz() {
        return skssqz;
    }

    public void setSkssqz(Date skssqz) {
        this.skssqz = skssqz;
    }

    public String getZyfpzkbhsxseHw() {
        return zyfpzkbhsxseHw;
    }

    public void setZyfpzkbhsxseHw(String zyfpzkbhsxseHw) {
        this.zyfpzkbhsxseHw = zyfpzkbhsxseHw;
    }

    public String getZyfpzkbhsxseFw1() {
        return zyfpzkbhsxseFw1;
    }

    public void setZyfpzkbhsxseFw1(String zyfpzkbhsxseFw1) {
        this.zyfpzkbhsxseFw1 = zyfpzkbhsxseFw1;
    }

    public String getZyfpzkbhsxseFw2() {
        return zyfpzkbhsxseFw2;
    }

    public void setZyfpzkbhsxseFw2(String zyfpzkbhsxseFw2) {
        this.zyfpzkbhsxseFw2 = zyfpzkbhsxseFw2;
    }

    public String getZyfpdkbhsxseHw() {
        return zyfpdkbhsxseHw;
    }

    public void setZyfpdkbhsxseHw(String zyfpdkbhsxseHw) {
        this.zyfpdkbhsxseHw = zyfpdkbhsxseHw;
    }

    public String getZyfpdkbhsxseFw1() {
        return zyfpdkbhsxseFw1;
    }

    public void setZyfpdkbhsxseFw1(String zyfpdkbhsxseFw1) {
        this.zyfpdkbhsxseFw1 = zyfpdkbhsxseFw1;
    }

    public String getZyfpdkbhsxseFw2() {
        return zyfpdkbhsxseFw2;
    }

    public void setZyfpdkbhsxseFw2(String zyfpdkbhsxseFw2) {
        this.zyfpdkbhsxseFw2 = zyfpdkbhsxseFw2;
    }

    public String getPtfpzkbhsxseHw() {
        return ptfpzkbhsxseHw;
    }

    public void setPtfpzkbhsxseHw(String ptfpzkbhsxseHw) {
        this.ptfpzkbhsxseHw = ptfpzkbhsxseHw;
    }

    public String getPtfpzkbhsxseFw1() {
        return ptfpzkbhsxseFw1;
    }

    public void setPtfpzkbhsxseFw1(String ptfpzkbhsxseFw1) {
        this.ptfpzkbhsxseFw1 = ptfpzkbhsxseFw1;
    }

    public String getPtfpzkbhsxseFw2() {
        return ptfpzkbhsxseFw2;
    }

    public void setPtfpzkbhsxseFw2(String ptfpzkbhsxseFw2) {
        this.ptfpzkbhsxseFw2 = ptfpzkbhsxseFw2;
    }

    public String getPtfpdkbhsxseHw() {
        return ptfpdkbhsxseHw;
    }

    public void setPtfpdkbhsxseHw(String ptfpdkbhsxseHw) {
        this.ptfpdkbhsxseHw = ptfpdkbhsxseHw;
    }

    public String getPtfpdkbhsxseFw1() {
        return ptfpdkbhsxseFw1;
    }

    public void setPtfpdkbhsxseFw1(String ptfpdkbhsxseFw1) {
        this.ptfpdkbhsxseFw1 = ptfpdkbhsxseFw1;
    }

    public String getPtfpdkbhsxseFw2() {
        return ptfpdkbhsxseFw2;
    }

    public void setPtfpdkbhsxseFw2(String ptfpdkbhsxseFw2) {
        this.ptfpdkbhsxseFw2 = ptfpdkbhsxseFw2;
    }

    public String getXsbdcptfp() {
        return xsbdcptfp;
    }

    public void setXsbdcptfp(String xsbdcptfp) {
        this.xsbdcptfp = xsbdcptfp;
    }

    public String getXsbdczyfp() {
        return xsbdczyfp;
    }

    public void setXsbdczyfp(String xsbdczyfp) {
        this.xsbdczyfp = xsbdczyfp;
    }

    public String getKpxtmsxse() {
        return kpxtmsxse;
    }

    public void setKpxtmsxse(String kpxtmsxse) {
        this.kpxtmsxse = kpxtmsxse;
    }

    public String getWlfp() {
        return wlfp;
    }

    public void setWlfp(String wlfp) {
        this.wlfp = wlfp;
    }

    public String getZyfpzkbhsxse() {
        return zyfpzkbhsxse;
    }

    public void setZyfpzkbhsxse(String zyfpzkbhsxse) {
        this.zyfpzkbhsxse = zyfpzkbhsxse;
    }

    public String getPtfpzkbhsxse() {
        return ptfpzkbhsxse;
    }

    public void setPtfpzkbhsxse(String ptfpzkbhsxse) {
        this.ptfpzkbhsxse = ptfpzkbhsxse;
    }

    public String getZyfpdkbhsxse() {
        return zyfpdkbhsxse;
    }

    public void setZyfpdkbhsxse(String zyfpdkbhsxse) {
        this.zyfpdkbhsxse = zyfpdkbhsxse;
    }

    public String getPtfpdkbhsxse() {
        return ptfpdkbhsxse;
    }

    public void setPtfpdkbhsxse(String ptfpdkbhsxse) {
        this.ptfpdkbhsxse = ptfpdkbhsxse;
    }

    public Date getSjjcpch() {
        return sjjcpch;
    }

    public void setSjjcpch(Date sjjcpch) {
        this.sjjcpch = sjjcpch;
    }

    public Date getSjjcsj() {
        return sjjcsj;
    }

    public void setSjjcsj(Date sjjcsj) {
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
