package com.example.cloud.app.controller.user;

import com.example.cloud.common.config.Logger;
import com.example.cloud.service.service.user.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/***
 *
 */
@Api(value="用户登录注销",tags={"用户登录注销"})
@RestController
@RequestMapping(value = "/user")
public class LoginController {
    private final static Logger LOG = Logger.getLogger(LoginController.class);

    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", dataType = "string", paramType = "query", defaultValue = "admin"),
            @ApiImplicitParam(name = "password", value = "用户密码", dataType = "string", paramType = "query", defaultValue = "111111")
    })
    @PostMapping(value = "/login",produces = "application/json")
    public Object login(@RequestParam("username") String username,@RequestParam("password") String password) {
        String token = userService.getLogin(username,password);
        return token;
    }

//    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", produces = "application/json")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "username", value = "用户名", dataType = "string", paramType = "query", defaultValue = "admin"),
//            @ApiImplicitParam(name = "password", value = "用户密码", dataType = "string", paramType = "query", defaultValue = "111111")
//    })
//    @PostMapping(value = "/login",produces = "application/json")
//    public Object login(LoginBody loginBody) {
//        String username = loginBody.getUsername();
//        String password = loginBody.getPassword();
////        String token = userService.getLogin(username,password);
//        loginBody.setToken("111111111111111111");
//        loginBody.setUsername(username);
//        loginBody.setPassword(password);
//        return loginBody;
//    }

    @ApiOperation(value = "获取用户TOKEN", notes = "获取用户TOKEN", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "用户密码", dataType = "string", paramType = "query", defaultValue = "111111")
    })
    @GetMapping(value = "/info",produces = "application/json")
    public Object info(@RequestParam("token") String token) {
        token="111111111111111111";
        return token;
    }
}

