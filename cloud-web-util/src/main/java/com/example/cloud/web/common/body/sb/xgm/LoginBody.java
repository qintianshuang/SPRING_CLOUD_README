package com.example.cloud.web.common.body.sb.xgm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="LoginBody",description="用户登录对象")
public class LoginBody {

    @ApiModelProperty(value="用户名",name="username",required=true)
    private String username;

    @ApiModelProperty(value="用户密码",name="password",required=true)
    private String password;

    @ApiModelProperty(value="用户token",name="token",required=true)
    private String token;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
