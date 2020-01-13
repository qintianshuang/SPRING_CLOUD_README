package com.example.cloud.bean.common.wqwq.entity;

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
@TableName("HX_DM_QG_DM_GY_ZSXM")
public class HxDmQgDmGyZsxm implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ZSXM_DM")
    private String zsxmDm;

    @TableField("ZSXMMC")
    private String zsxmmc;

    @TableField("ZSXMJC")
    private String zsxmjc;

    @TableField("XYBZ")
    private String xybz;

    @TableField("YXBZ")
    private String yxbz;

    @TableField("SJZSXM_DM")
    private String sjzsxmDm;

    @TableField("YXQZ")
    private LocalDateTime yxqz;

    @TableField("YXQQ")
    private LocalDateTime yxqq;

    public String getZsxmDm() {
        return zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }
    public String getZsxmmc() {
        return zsxmmc;
    }

    public void setZsxmmc(String zsxmmc) {
        this.zsxmmc = zsxmmc;
    }
    public String getZsxmjc() {
        return zsxmjc;
    }

    public void setZsxmjc(String zsxmjc) {
        this.zsxmjc = zsxmjc;
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
    public String getSjzsxmDm() {
        return sjzsxmDm;
    }

    public void setSjzsxmDm(String sjzsxmDm) {
        this.sjzsxmDm = sjzsxmDm;
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

    @Override
    public String toString() {
        return "HxDmQgDmGyZsxm{" +
            "zsxmDm=" + zsxmDm +
            ", zsxmmc=" + zsxmmc +
            ", zsxmjc=" + zsxmjc +
            ", xybz=" + xybz +
            ", yxbz=" + yxbz +
            ", sjzsxmDm=" + sjzsxmDm +
            ", yxqz=" + yxqz +
            ", yxqq=" + yxqq +
        "}";
    }
}
