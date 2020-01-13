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
@TableName("XGM_FW_SJ")
public class XgmFwSj implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("DJXH")
    private String djxh;

    @TableField("NSRSBH")
    private String nsrsbh;

    @TableField("FWSJ")
    private LocalDateTime fwsj;

    @TableField("FWBZ")
    private String fwbz;

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
    public LocalDateTime getFwsj() {
        return fwsj;
    }

    public void setFwsj(LocalDateTime fwsj) {
        this.fwsj = fwsj;
    }
    public String getFwbz() {
        return fwbz;
    }

    public void setFwbz(String fwbz) {
        this.fwbz = fwbz;
    }

    @Override
    public String toString() {
        return "XgmFwSj{" +
            "djxh=" + djxh +
            ", nsrsbh=" + nsrsbh +
            ", fwsj=" + fwsj +
            ", fwbz=" + fwbz +
        "}";
    }
}
