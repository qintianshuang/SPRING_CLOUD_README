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
@TableName("DJ_FXJKNSRCS")
public class DjFxjknsrcs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("UUID")
    private String uuid;

    @TableField("CJSJ")
    private LocalDateTime cjsj;

    @TableField("DJXH")
    private String djxh;

    @TableField("SJDM")
    private String sjdm;

    @TableField("ZSRYDM")
    private String zsrydm;

    @TableField("YXBZ")
    private String yxbz;

    @TableField("XEDM")
    private String xedm;

    @TableField("SL")
    private String sl;

    @TableField("XE")
    private String xe;

    @TableField("TZBZ")
    private String tzbz;

    @TableField("TZSJ")
    private LocalDateTime tzsj;

    @TableField("PTXEDM")
    private String ptxedm;

    @TableField("PTSL")
    private String ptsl;

    @TableField("JCRYDM")
    private String jcrydm;

    @TableField("JCSJ")
    private LocalDateTime jcsj;

    @TableField("JYUUID")
    private String jyuuid;

    @TableField("JCUUID")
    private String jcuuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public LocalDateTime getCjsj() {
        return cjsj;
    }

    public void setCjsj(LocalDateTime cjsj) {
        this.cjsj = cjsj;
    }
    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }
    public String getSjdm() {
        return sjdm;
    }

    public void setSjdm(String sjdm) {
        this.sjdm = sjdm;
    }
    public String getZsrydm() {
        return zsrydm;
    }

    public void setZsrydm(String zsrydm) {
        this.zsrydm = zsrydm;
    }
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }
    public String getXedm() {
        return xedm;
    }

    public void setXedm(String xedm) {
        this.xedm = xedm;
    }
    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }
    public String getXe() {
        return xe;
    }

    public void setXe(String xe) {
        this.xe = xe;
    }
    public String getTzbz() {
        return tzbz;
    }

    public void setTzbz(String tzbz) {
        this.tzbz = tzbz;
    }
    public LocalDateTime getTzsj() {
        return tzsj;
    }

    public void setTzsj(LocalDateTime tzsj) {
        this.tzsj = tzsj;
    }
    public String getPtxedm() {
        return ptxedm;
    }

    public void setPtxedm(String ptxedm) {
        this.ptxedm = ptxedm;
    }
    public String getPtsl() {
        return ptsl;
    }

    public void setPtsl(String ptsl) {
        this.ptsl = ptsl;
    }
    public String getJcrydm() {
        return jcrydm;
    }

    public void setJcrydm(String jcrydm) {
        this.jcrydm = jcrydm;
    }
    public LocalDateTime getJcsj() {
        return jcsj;
    }

    public void setJcsj(LocalDateTime jcsj) {
        this.jcsj = jcsj;
    }
    public String getJyuuid() {
        return jyuuid;
    }

    public void setJyuuid(String jyuuid) {
        this.jyuuid = jyuuid;
    }
    public String getJcuuid() {
        return jcuuid;
    }

    public void setJcuuid(String jcuuid) {
        this.jcuuid = jcuuid;
    }

    @Override
    public String toString() {
        return "DjFxjknsrcs{" +
            "uuid=" + uuid +
            ", cjsj=" + cjsj +
            ", djxh=" + djxh +
            ", sjdm=" + sjdm +
            ", zsrydm=" + zsrydm +
            ", yxbz=" + yxbz +
            ", xedm=" + xedm +
            ", sl=" + sl +
            ", xe=" + xe +
            ", tzbz=" + tzbz +
            ", tzsj=" + tzsj +
            ", ptxedm=" + ptxedm +
            ", ptsl=" + ptsl +
            ", jcrydm=" + jcrydm +
            ", jcsj=" + jcsj +
            ", jyuuid=" + jyuuid +
            ", jcuuid=" + jcuuid +
        "}";
    }
}
