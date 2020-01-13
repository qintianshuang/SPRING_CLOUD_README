package com.example.cloud.bean.config;

import org.apache.commons.lang3.StringUtils;

public enum JdbcEnum {
    MYSQL_EMPLOYEES("root","716622",JdbcConfig.MYSQL_DRIVER,"jdbc:mysql://localhost:3306/myemployees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=UTF8"),
    ORACLE_WSCL("wscl","716622",JdbcConfig.ORACLE_DRIVER,"jdbc:oracle:thin:@127.0.0.1:1521/ADMIN.EMPLOYEE");

    private String name;

    private String password;

    private String driver;

    private String url;

    JdbcEnum(String name, String password, String driver, String url) {
        if (!StringUtils.isBlank(name)){
            name.toUpperCase();
        }
        this.name = name;
        this.password = password;
        this.driver = driver;
        this.url = url;
    }

    public static JdbcEnum getJdbcEnum(String name) {
        if (!StringUtils.isBlank(name)){
            name.toUpperCase();
        }
        JdbcEnum[] values = JdbcEnum.values();
        for (JdbcEnum value : values) {
            if (value.name.equals(name)) {
                return value;
            }
        }
        throw new RuntimeException("请输入正确的JdbcEnum!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
