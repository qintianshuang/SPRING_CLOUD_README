package com.example.cloud.service.util;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.common.bean.User;
import com.example.cloud.common.config.Logger;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
public class CacheUtil {

    private final static Logger LOG = Logger.getLogger(CacheUtil.class);

    public static User getCacheUser() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String userStr = (String) request.getAttribute("userInfo");
        LOG.info("用户缓存的数据：【" + userStr + "】");
        User user = null;
        if (StringUtils.isNotBlank(userStr)) {
            user = JSONObject.parseObject(userStr, User.class);
        }
        LOG.info("用户缓存的数据转化为对象：【" + JSONObject.toJSONString(user) + "】");
        return user;
    }
}
