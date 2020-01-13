package com.example.cloud.company.common.vo.common.sb;

import java.io.Serializable;
import java.util.HashMap;

public class TradeResultVo implements Serializable {
    private static final long serialVersionUID = -2638105179977285595L;
    protected String tradeCode;
    protected Object response;
    protected boolean success;
    protected int msgCode;
    protected String message;
    protected Object value;
    protected HashMap resultMap;

    private TradeResultVo() {
    }

    public static TradeResultVo valueOfSuccess(Object value, Object response) {
        TradeResultVo vo = new TradeResultVo();
        vo.value = value;
        vo.success = true;
        vo.tradeCode = "0";
        vo.response = response;
        return vo;
    }

    public static TradeResultVo valueOfSuccess() {
        return valueOfSuccess((Object)null, (Object)null);
    }

    public static TradeResultVo valueOfError(String msg, Object value) {
        return valueOfError(msg, 0, value, "1", (Object)null);
    }

    public static TradeResultVo valueOfError(String msg, int msgCode, Object value, String tradeCode, Object response) {
        TradeResultVo vo = new TradeResultVo();
        vo.value = value;
        vo.message = msg;
        vo.success = false;
        vo.msgCode = msgCode;
        vo.tradeCode = tradeCode;
        vo.response = response;
        return vo;
    }

    public static TradeResultVo valueOfError(String msg) {
        return valueOfError(msg, 0, (Object)null, "1", (Object)null);
    }

    public static TradeResultVo valueOfError(String msg, int msgCode) {
        return valueOfError(msg, msgCode, (Object)null, "1", (Object)null);
    }

    public static TradeResultVo valueOfError(String msg, int msgCode, String tradeCode, Object response) {
        return valueOfError(msg, msgCode, (Object)null, tradeCode, response);
    }

    public String getTradeCode() {
        return this.tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public Object getResponse() {
        return this.response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getMsgCode() {
        return this.msgCode;
    }

    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }

    public HashMap getResultMap() {
        return this.resultMap;
    }

    public void setResultMap(HashMap resultMap) {
        this.resultMap = resultMap;
    }

    public static TradeResultVo valueOfSuccessAndBizFail(Object value, Object response) {
        TradeResultVo vo = new TradeResultVo();
        vo.value = value;
        vo.success = true;
        vo.tradeCode = "5";
        vo.response = response;
        return vo;
    }

    public static TradeResultVo valueOfInnerError(String msg, int msgCode) {
        return valueOfError(msg, msgCode, (Object)null, "6", (Object)null);
    }

    public static TradeResultVo valueOfInnerError(String msg) {
        return valueOfError(msg, 0, (Object)null, "6", (Object)null);
    }
}

