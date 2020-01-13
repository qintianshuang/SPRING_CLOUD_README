package com.example.cloud.server.service.user.impl;

import com.example.cloud.service.service.user.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);

    @Override
    public String getLogin(String username, String password) {
        return "11111111111111111";
    }
}
