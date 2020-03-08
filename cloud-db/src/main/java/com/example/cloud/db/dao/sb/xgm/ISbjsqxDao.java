package com.example.cloud.db.dao.sb.xgm;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import com.example.cloud.service.base.vo.ResultVo;

public interface ISbjsqxDao extends IService<ZsxmDmslPO> {

    /***
     *
     * @param sbzlDm
     * @param sbny
     * @param zgswjDm
     * @param djxh
     * @return
     */
    ResultVo querySbjsqx(String sbzlDm, String sbny, String zgswjDm, String djxh);

    /***
     *
     * @param sbzlDm
     * @param sbny
     * @param zgswjDm
     * @return
     */
    ResultVo querySbjsqxBySwjgDm(String sbzlDm, String sbny, String zgswjDm);
}
