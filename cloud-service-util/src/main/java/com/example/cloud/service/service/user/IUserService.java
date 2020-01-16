package com.example.cloud.service.service.user;

import com.example.cloud.common.bean.User;

public interface IUserService {

    String getLogin(String username, String password);

    User findUserById(String userId);

    User findUser(User user);
}
