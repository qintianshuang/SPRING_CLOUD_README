package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("XT_XTCS")
public class XtXtcs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableField("XH")
    private Long xh;

    /**
     * 参数名
     */
    @TableField("PARAM_CODE")
    private String paramCode;

    /**
     * 参数值
     */
    @TableField("PARAM_VALUE")
    private String paramValue;

    /**
     * 参数描述
     */
    @TableField("PARAM_DESC")
    private String paramDesc;

    /**
     * 税务机关代码
     */
    @TableField("SWJG_DM")
    private String swjgDm;

    /**
     * 应用代码
     */
    @TableField("APP_CODE")
    private String appCode;

    /**
     * 插件代码
     */
    @TableField("PLUGIN_CODE")
    private String pluginCode;

    public Long getXh() {
        return xh;
    }

    public void setXh(Long xh) {
        this.xh = xh;
    }
    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }
    public String getSwjgDm() {
        return swjgDm;
    }

    public void setSwjgDm(String swjgDm) {
        this.swjgDm = swjgDm;
    }
    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
    public String getPluginCode() {
        return pluginCode;
    }

    public void setPluginCode(String pluginCode) {
        this.pluginCode = pluginCode;
    }

    @Override
    public String toString() {
        return "XtXtcs{" +
            "xh=" + xh +
            ", paramCode=" + paramCode +
            ", paramValue=" + paramValue +
            ", paramDesc=" + paramDesc +
            ", swjgDm=" + swjgDm +
            ", appCode=" + appCode +
            ", pluginCode=" + pluginCode +
        "}";
    }
}
