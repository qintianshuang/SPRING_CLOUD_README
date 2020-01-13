package com.example.cloud.db.dao.sb.common.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.db.dao.sb.common.ISystemParamDao;
import com.example.cloud.db.mapper.sb.common.ISystemParamMapper;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import com.example.cloud.service.enums.DbEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "systemParamDao")
public class ISystemParamDaoImpl extends ServiceImpl<ISystemParamMapper, ZsxmDmslPO> implements ISystemParamDao {


    @Autowired
    private ISystemParamMapper systemParamMapper;

    @Override
    public String getSystemParam(String code) {
        DbEnum.MYSQL_DB.getCode();
        String str = systemParamMapper.getSystemParam(code);
        return str;
    }
}
