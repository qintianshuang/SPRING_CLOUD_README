package com.example.cloud.common.bean.sb;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author qts
 * @since 2020-03-02
 */
public class XtXtcs implements Serializable {

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

    @Override
    public String toString() {
        return "XtXtcs{" +
            "xh=" + xh +
            ", paramCode=" + paramCode +
            ", paramValue=" + paramValue +
            ", paramDesc=" + paramDesc +
//            ", swjgDm=" + swjgDm +
//            ", appCode=" + appCode +
//            ", pluginCode=" + pluginCode +
        "}";
    }
}
