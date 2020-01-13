package com.example.cloud.service.enums;

/***
 *
 */
public enum DbEnum {
    //返回成功
    MYSQL_DB("employees", "mysql数据库"),
    //数据加工中
    ORACLE_DB("wscl", "oracle数据库");

    private String code;
    private String name;

    DbEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getName(String code) {
        DbEnum[] values = DbEnum.values();
        for (DbEnum value : values) {
            if (value.code.equals(code)) {
                return value.name;
            }
        }
        throw new RuntimeException("请输入正确的code!");
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
