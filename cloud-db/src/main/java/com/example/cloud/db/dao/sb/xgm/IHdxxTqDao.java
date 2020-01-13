package com.example.cloud.db.dao.sb.xgm;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import com.example.cloud.service.base.vo.ResultVo;

public interface IHdxxTqDao extends IService<ZsxmDmslPO> {
    /***
     *
     * @param djxh
     * @param s
     * @param sssqq
     * @param sssqz
     * @return
     */
    ResultVo queryFjsZspms(String djxh, String s, String sssqq, String sssqz);

    /***
     *
     * @param phjmxzDm
     * @return
     */
    ResultVo queryFjsJzblByJmxzDm(String phjmxzDm);
}
