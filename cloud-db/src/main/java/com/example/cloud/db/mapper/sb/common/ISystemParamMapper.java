package com.example.cloud.db.mapper.sb.common;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ISystemParamMapper extends BaseMapper<ZsxmDmslPO> {

    @DS("ORACLE_DB")
    String getSystemParam(@Param("code") String code);
}
