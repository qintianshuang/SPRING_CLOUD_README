package com.example.cloud.server.service.user.impl;

import com.example.cloud.common.bean.User;
import com.example.cloud.common.exception.BusinessException;
import com.example.cloud.common.exception.CommonErrorCode;
import com.example.cloud.db.dao.user.IUserDao;
import com.example.cloud.service.service.user.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    @Qualifier(value = "userDao")
    private IUserDao userDao;

    @Override
    public String getLogin(String username, String password) {
        return "11111111111111111";
    }

    @Override
    public User findUserById(String userId) {
        User user = userDao.findUserById(userId);
        return user;
    }

    @Override
    public User findUser(User user) {
        User userinfo = userDao.findUser(user.getUsername());
        if (userinfo == null){
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(),"用户不存在！");
        }
        if (!userinfo.getPassword().equals(user.getPassword())){
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(),"用户密码输入有误！");
        }
        return userinfo;
    }
}
