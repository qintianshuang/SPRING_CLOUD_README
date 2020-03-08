package com.example.cloud.common.enums;

public enum NsqxEnum {
    TIME("11", "次"),
    DAY("04", "10日"),
    FIFTEEN_DAY("05", "15日"),
    MONTH("06", "月"),
    QUARTER("08", "季"),
    HALFYEAR("09", "半年"),
    YEAR("10", "年"),
    SPECIAL("99", "其他");

    public String dm;
    public String mc;

    public String getDm() {
        return this.dm;
    }

    private NsqxEnum(String dm, String mc) {
        this.dm = dm;
        this.mc = mc;
    }
}
