package com.example.cloud.db.dao.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.common.bean.User;
import com.example.cloud.db.dao.user.IUserDao;
import com.example.cloud.db.mapper.user.IUserMapper;
import com.example.cloud.db.po.user.UserPO;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userDao")
public class UserDaoImpl extends ServiceImpl<IUserMapper, UserPO> implements IUserDao {

    private static final Logger LOG = Logger.getLogger(UserDaoImpl.class);

    @Autowired
    private IUserMapper mapper;

    @Override
    public User findUserById(String userId) {
        if (StringUtils.isBlank(userId)){
            return null;
        }
        UserPO userPO = new UserPO();
        userPO.setId(userId);
        UserPO userPO1 = mapper.selectOne(new QueryWrapper<>());
        if (userPO1 != null){
            User user = new User();
            BeanUtils.copyProperties(userPO1,user);
            return user;
        }
        return null;
    }

    @Override
    public User findUser(String username) {
        if (StringUtils.isBlank(username)){
            return null;
        }
        UserPO userPO = new UserPO();
        userPO.setUsername(username);
        UserPO userPO1 = mapper.selectOne(new QueryWrapper<>());
        if (userPO1 != null){
            User user = new User();
            BeanUtils.copyProperties(userPO1,user);
            return user;
        }
        return null;
    }
}
