package com.example.cloud.db.dao.sb.xgm.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.db.dao.sb.xgm.ISbjsqxDao;
import com.example.cloud.db.mapper.sb.xgm.IHdxxTqMapper;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component(value = "sbjsqxDao")
public class SbjsqxDaoImpl extends ServiceImpl<IHdxxTqMapper, ZsxmDmslPO> implements ISbjsqxDao {

    private static final Logger LOG = Logger.getLogger(SbjsqxDaoImpl.class);


    @Override
    public ResultVo querySbjsqx(String sbzlDm, String sbny, String zgswjDm, String djxh) {
        return null;
    }

    @Override
    public ResultVo querySbjsqxBySwjgDm(String sbzlDm, String sbny, String zgswjDm) {
        return null;
    }
}
