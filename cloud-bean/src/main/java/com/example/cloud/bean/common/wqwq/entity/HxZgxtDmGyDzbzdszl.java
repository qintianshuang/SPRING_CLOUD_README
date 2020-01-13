package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("HX_ZGXT_DM_GY_DZBZDSZL")
public class HxZgxtDmGyDzbzdszl implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("DZBZDSZL_DM")
    private String dzbzdszlDm;

    @TableField("DZBZDSZLMC")
    private String dzbzdszlmc;

    @TableField("XYBZ")
    private String xybz;

    @TableField("YXBZ")
    private String yxbz;

    @TableField("ZG")
    private String zg;

    @TableField("SJDZBZDSZL_DM")
    private String sjdzbzdszlDm;

    @TableField("SDNSRBZ_DM")
    private String sdnsrbzDm;

    @TableField("BZ")
    private String bz;

    public String getDzbzdszlDm() {
        return dzbzdszlDm;
    }

    public void setDzbzdszlDm(String dzbzdszlDm) {
        this.dzbzdszlDm = dzbzdszlDm;
    }
    public String getDzbzdszlmc() {
        return dzbzdszlmc;
    }

    public void setDzbzdszlmc(String dzbzdszlmc) {
        this.dzbzdszlmc = dzbzdszlmc;
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
    public String getZg() {
        return zg;
    }

    public void setZg(String zg) {
        this.zg = zg;
    }
    public String getSjdzbzdszlDm() {
        return sjdzbzdszlDm;
    }

    public void setSjdzbzdszlDm(String sjdzbzdszlDm) {
        this.sjdzbzdszlDm = sjdzbzdszlDm;
    }
    public String getSdnsrbzDm() {
        return sdnsrbzDm;
    }

    public void setSdnsrbzDm(String sdnsrbzDm) {
        this.sdnsrbzDm = sdnsrbzDm;
    }
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public String toString() {
        return "HxZgxtDmGyDzbzdszl{" +
            "dzbzdszlDm=" + dzbzdszlDm +
            ", dzbzdszlmc=" + dzbzdszlmc +
            ", xybz=" + xybz +
            ", yxbz=" + yxbz +
            ", zg=" + zg +
            ", sjdzbzdszlDm=" + sjdzbzdszlDm +
            ", sdnsrbzDm=" + sdnsrbzDm +
            ", bz=" + bz +
        "}";
    }
}
