package com.example.cloud.db.dao.sb.xgm;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;

import java.util.List;

public interface ICwbbScfjDao extends IService<ZsxmDmslPO> {

    /***
     *
     * @param swjgDm
     * @param sbzlDm
     * @return
     */
    List<String> getQhjtBbid(String swjgDm, String sbzlDm);
}
