package com.example.cloud.company.common.vo.xgm.hdxx;

public class XmlVO<T> {
    private T xmlParse;
    private boolean isSuccess;
    private String errorMessage;

    public XmlVO() {
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public T getXmlParse() {
        return this.xmlParse;
    }

    public void setXmlParse(T xmlParse) {
        this.xmlParse = xmlParse;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
