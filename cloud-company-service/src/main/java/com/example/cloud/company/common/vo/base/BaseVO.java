package com.example.cloud.company.common.vo.base;

import java.io.Serializable;
import java.util.HashMap;

public class BaseVO implements IObject, Serializable {
    private static final long serialVersionUID = 4434020439678165781L;
    private HashMap requestDataMap = new HashMap();
    private HashMap responseDataMap = new HashMap();
    private HashMap globalDataMap = new HashMap();

    public BaseVO() {
    }

    public void reset() {
        this.requestDataMap = null;
        this.responseDataMap = null;
        this.globalDataMap = null;
    }

    public HashMap getRequestDataMap() {
        return this.requestDataMap;
    }

    public void setRequestDataMap(HashMap requestDataMap) {
        this.requestDataMap = requestDataMap;
    }

    public HashMap getResponseDataMap() {
        return this.responseDataMap;
    }

    public void setResponseDataMap(HashMap responseDataMap) {
        this.responseDataMap = responseDataMap;
    }

    public HashMap getGlobalDataMap() {
        return this.globalDataMap;
    }

    public void setGlobalDataMap(HashMap globalDataMap) {
        this.globalDataMap = globalDataMap;
    }

    public Object getRequestObject(Object key) {
        return this.requestDataMap == null ? null : this.requestDataMap.get(key);
    }

    public String getRequestParameter(String key) {
        return this.requestDataMap == null ? null : (String) this.getRequestObject(key);
    }

    public void setRequestObject(Object key, Object value) {
        if (this.requestDataMap == null) {
            this.requestDataMap = new HashMap();
        }

        this.requestDataMap.put(key, value);
    }

    public Object getResponseObject(Object key) {
        return this.responseDataMap == null ? null : this.responseDataMap.get(key);
    }

    public String getResponseParameter(String key) {
        return this.responseDataMap == null ? null : (String) this.getResponseObject(key);
    }

    public void setResponseObject(Object key, Object value) {
        if (this.responseDataMap == null) {
            this.responseDataMap = new HashMap();
        }

        this.responseDataMap.put(key, value);
    }

    public Object getObject(Object key) {
        return this.globalDataMap == null ? null : this.globalDataMap.get(key);
    }

    public String getParameter(String key) {
        return this.globalDataMap == null ? null : (String) this.getObject(key);
    }

    public void setObject(Object key, Object value) {
        if (this.globalDataMap == null) {
            this.globalDataMap = new HashMap();
        }

        this.globalDataMap.put(key, value);
    }

    public void addCondition(String name, HashMap valueMap) {
        this.setObject(name, valueMap);
    }
}

