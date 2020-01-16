package com.example.cloud.db.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloud.db.po.user.UserPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper extends BaseMapper<UserPO> {
}
