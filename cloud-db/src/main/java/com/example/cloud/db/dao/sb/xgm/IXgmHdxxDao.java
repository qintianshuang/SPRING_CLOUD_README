package com.example.cloud.db.dao.sb.xgm;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.common.bean.sb.PbbdXgmNew;
import com.example.cloud.db.po.sb.xgm.PbbdXgmNewPO;
import com.example.cloud.service.base.vo.ResultVo;

public interface IXgmHdxxDao extends IService<PbbdXgmNewPO> {


    /****
     *
     * @param page
     * @param djxh
     * @param sssqq
     * @param sssqz
     * @param isShow 是否显示失效数据
     * @return
     */
    IPage<PbbdXgmNew> getHyfpdata(Page<PbbdXgmNew> page, String djxh, String sssqq, String sssqz,String isShow);

    /***
     *
     * @param djxh
     * @param skssqq
     * @param skssqz
     * @return
     */
    ResultVo getXgmHdData(String djxh, String skssqq, String skssqz);

    /***
     *
     * @param djxh
     * @param nsrsbh
     * @param type
     */
    void insertXgmfwsj(String djxh, String nsrsbh, String type);

    /***
     *
     * @param djxh
     * @param nsrsbh
     * @return
     */
    ResultVo getXgmfwsj(String djxh, String nsrsbh);
}
