package com.example.cloud.app.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.common.bean.Role;
import com.example.cloud.common.bean.User;
import com.example.cloud.common.config.Logger;
import com.example.cloud.service.config.token.LoginToken;
import com.example.cloud.service.config.token.LogoutToken;
import com.example.cloud.service.service.user.IUserService;
import com.example.cloud.service.util.JwtUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/***
 *
 */
@Api(value = "用户登录注销", tags = {"用户登录注销"})
@RestController
@RequestMapping(value = "/user")
public class LoginController {
    private final static Logger LOG = Logger.getLogger(LoginController.class);

    @Autowired
    @Qualifier("userService")
    private IUserService userService;

//    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", produces = "application/json")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "username", value = "用户名", dataType = "string", paramType = "query", defaultValue = "admin"),
//            @ApiImplicitParam(name = "password", value = "用户密码", dataType = "string", paramType = "query", defaultValue = "111111")
//    })
//    @PostMapping(value = "/login",produces = "application/json")
//    public Object login(@RequestParam("username") String username,@RequestParam("password") String password) {
//        String token = userService.getLogin(username,password);
//        return token;
//    }

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
    @GetMapping(value = "/info", produces = "application/json")
    public Object info(@RequestParam("token") String token) {
        Role role = new Role();
        role.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        role.setIntroduction("I am a super administrator");
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        role.setRoles(roles);
        role.setName("super admin");
        return role;
    }

    /**
     * 登录方法
     *
     * @param user 用户信息
     * @return 成功返回token ，失败返回错误信息
     * @date 2019/7/31 14:09
     */
    @ApiOperation(value = "用户登录", notes = "用户登录", produces = "application/json")
    @LoginToken
    @PostMapping("/login")
    public Object login(@RequestBody @Valid User user) {
        // 校验参数
        if (user == null) {
            return "params is not null";
        }
        User queryUser = userService.findUser(user);
        // 生成一个jwt的token，6000000L是过期时间
        String token = JwtUtils.createJWT(6000000L, queryUser);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token", token);
        jsonObject.put("user", queryUser);
        return jsonObject;
    }

    /**
     * 登录方法
     *
     * @param
     * @return 成功返回token ，失败返回错误信息
     * @date 2019/7/31 14:09
     */
    @ApiOperation(value = "用户注销登录", notes = "用户注销登录", produces = "application/json")
    @LogoutToken
    @PostMapping("/logout")
    public Object logout(HttpServletRequest httpServletRequest) {
        // 校验参数
        return "success";
    }

//    /**
//     * 测试token校验方法
//     *
//     * @return 返回Hello World!
//     * @date 2019/7/31 14:13
//     */
//    @GetMapping("/hello")
//    @CheckToken
//    public String hello() {
//        return "Hello World!";
//    }
}

