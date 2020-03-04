package com.example.cloud.db.po.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.cloud.service.base.po.BasePO;

/**
 * <p>
 *
 * </p>
 *
 * @author qts
 * @since 2020-01-14
 */
@TableName(value = "t_user")
public class UserPO extends BasePO {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String userId;


    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String eMail;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "User{" +
            "username=" + username +
            ", password=" + password +
            ", phone=" + phone +
            ", eMail=" + eMail +
        "}";
    }
}
