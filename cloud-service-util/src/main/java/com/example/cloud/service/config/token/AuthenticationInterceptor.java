package com.example.cloud.service.config.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.example.cloud.common.bean.User;
import com.example.cloud.common.config.Logger;
import com.example.cloud.common.exception.BusinessException;
import com.example.cloud.common.exception.CommonErrorCode;
import com.example.cloud.service.service.user.IUserService;
import com.example.cloud.service.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * jimisun
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

    private final static Logger LOG = Logger.getLogger(AuthenticationInterceptor.class);

    private  final String[] URL_ARR = new String[]{"/swagger-resources/configuration/ui","/swagger-resources","/v2/api-docs","/swagger-resources/configuration/security"};

    @Autowired
    IUserService userService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        LOG.info("request请求地址path ：【"+ httpServletRequest.getServletPath()+"】=====url:【"+httpServletRequest.getRequestURI() + "】");
        boolean key = false;
        for (String url : URL_ARR) {
            if (url.equals(httpServletRequest.getServletPath()) || url.equals(httpServletRequest.getServletPath())){
                key = true;
                break;
            }
        }
        if (key){
            return key;
        }
        // 从 http 请求头中取出 token
        String token = httpServletRequest.getHeader("X-Token");
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        //检查是否有LoginToken注释，有则跳过认证
        if (method.isAnnotationPresent(LoginToken.class)) {
            LoginToken loginToken = method.getAnnotation(LoginToken.class);
            if (loginToken.required()) {
                return true;
            }
        }

        // 执行认证
        if (token == null) {
//            throw new RuntimeException("无token，请重新登录");
            throw new BusinessException(CommonErrorCode.LOGIN_FAILURE.getCode(), "无token，请重新登录！");

        }
        // 获取 token 中的 user id
        String userId;
        try {
            userId = JWT.decode(token).getClaim("id").asString();
        } catch (JWTDecodeException j) {
//            throw new RuntimeException("访问异常！");
            throw new BusinessException(CommonErrorCode.LOGIN_FAILURE.getCode(), "访问异常，请重新登录！");
        }
        User user = userService.findUserById(userId);
        if (user == null) {
//            throw new RuntimeException("用户不存在，请重新登录");
            throw new BusinessException(CommonErrorCode.LOGIN_FAILURE.getCode(), "用户不存在，请重新登录！");
        }
        Boolean verify = JwtUtils.isVerify(token, user);
        if (!verify) {
//            throw new RuntimeException("非法访问！");
            throw new BusinessException(CommonErrorCode.LOGIN_FAILURE.getCode(), "非法访问，请重新登录！");
        }
        httpServletResponse.addHeader("X-Token",null);
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(CheckToken.class)) {
            CheckToken checkToken = method.getAnnotation(CheckToken.class);
            if (checkToken.required()) {
                return true;
            }
        }
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(LogoutToken.class)) {
            LogoutToken logoutToken = method.getAnnotation(LogoutToken.class);
            if (logoutToken.required()) {
                httpServletResponse.addHeader("X-Token",null);
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
