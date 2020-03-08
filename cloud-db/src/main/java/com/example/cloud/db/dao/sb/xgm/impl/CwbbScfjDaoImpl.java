package com.example.cloud.db.dao.sb.xgm.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.db.dao.sb.xgm.ICwbbScfjDao;
import com.example.cloud.db.mapper.sb.xgm.IHdxxTqMapper;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "cwbbScfjDao")
public class CwbbScfjDaoImpl extends ServiceImpl<IHdxxTqMapper, ZsxmDmslPO> implements ICwbbScfjDao {

    private static final Logger LOG = Logger.getLogger(CwbbScfjDaoImpl.class);

    @Override
    public List<String> getQhjtBbid(String swjgDm, String sbzlDm) {

        return null;
    }
}
