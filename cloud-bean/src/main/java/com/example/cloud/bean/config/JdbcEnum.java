package com.example.cloud.bean.config;

import org.apache.commons.lang3.StringUtils;

public enum JdbcEnum {
    MYSQL_EMPLOYEES("mysql","root","716622",JdbcConfig.MYSQL_DRIVER,"jdbc:;mysql://localhost:3306/myemployees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=UTF8"),
    ORACLE_WSCL("oracle","wscl","716622",JdbcConfig.ORACLE_DRIVER,"jdbc:oracle:thin:@127.0.0.1:1521/ADMIN.EMPLOYEE"),
    GT3_WSCL("gt3","zj_wbcx","cx123",JdbcConfig.ORACLE_DRIVER,"jdbc:oracle:thin:@192.168.150.76:1521:sydb");

    private String dbName;

    private String name;

    private String password;

    private String driver;

    private String url;

    JdbcEnum(String dbName, String name, String password, String driver, String url) {
        this.dbName = dbName;
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
            if (value.dbName.equals(name)) {
                return value;
            }
        }
        throw new RuntimeException("请输入正确的JdbcEnum!");
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
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
