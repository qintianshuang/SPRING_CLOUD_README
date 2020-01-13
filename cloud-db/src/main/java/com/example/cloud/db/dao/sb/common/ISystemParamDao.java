package com.example.cloud.db.dao.sb.common;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;

public interface ISystemParamDao extends IService<ZsxmDmslPO> {

    String getSystemParam(String code);
}
