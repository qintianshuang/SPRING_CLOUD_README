package com.example.cloud.db.po.common;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author qts
 * @since 2020-03-02
 */
public class XtXtcsPO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    private String xh;

    /**
     * 参数名
     */
    private String paramCode;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 参数描述
     */
    private String paramDesc;

    /**
     * 税务机关代码
     */
    private String swjgDm;

    /**
     * 应用代码
     */
    private String appCode;

    /**
     * 插件代码
     */
    private String pluginCode;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
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
        return "XtXtcsPO{" +
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
