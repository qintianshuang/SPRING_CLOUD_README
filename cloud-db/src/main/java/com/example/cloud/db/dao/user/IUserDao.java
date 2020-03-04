package com.example.cloud.db.dao.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.common.bean.User;
import com.example.cloud.db.po.user.UserPO;

public interface IUserDao extends IService<UserPO> {

    /***
     *
     * @param userId
     * @return
     */
    User findUserById(String userId);

    /***
     *
     * @param user
     * @return
     */
    User findUser(User user);
}
