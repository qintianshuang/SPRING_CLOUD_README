package com.example.cloud.company.service.sb.common.impl;

import com.example.cloud.company.service.sb.common.ISystemParamClient;
import com.example.cloud.db.dao.sb.common.ISystemParamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "systemParamClient")
public class ISystemParamClientImpl implements ISystemParamClient {

    @Autowired
    @Qualifier(value = "systemParamDao")
     ISystemParamDao systemParamDao;

    @Override
    public String getSystemParam(String code) {
        String str = systemParamDao.getSystemParam(code);
        return str;
    }
}
