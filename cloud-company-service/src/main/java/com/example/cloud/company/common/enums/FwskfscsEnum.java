package com.example.cloud.company.common.enums;

/***
 * 发票2.0发行抄报税状态
 */
public enum FwskfscsEnum {

    IS_FX("00","发行企业"),
    NO_FX("01","非发行企业"),
    SUCCESS_CBS("100","已抄税"),
    NOT_SUCCESS_CBS("101","未抄税");

    private String code;
    private String name;

    FwskfscsEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
