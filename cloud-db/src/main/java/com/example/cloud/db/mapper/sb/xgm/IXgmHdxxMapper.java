package com.example.cloud.db.mapper.sb.xgm;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cloud.common.bean.sb.PbbdXgmNew;
import com.example.cloud.db.po.sb.xgm.PbbdXgmNewPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IXgmHdxxMapper extends BaseMapper<PbbdXgmNewPO> {

    /***
     *
     * @param page
     * @param djxh
     * @param skssqq
     * @param skssqz
     * @return
     */
    @DS("ORACLE_DB")
    IPage<PbbdXgmNew> getHyfpdata(Page<?> page, @Param("djxh") String djxh, @Param("skssqq") String skssqq, @Param("skssqz") String skssqz, @Param("isShow") String isShow);

    /***
     *
     * @param djxh
     * @param nsrsbh
     * @param type
     */
    @DS("WSCL_DB")
    void insertXgmfwsj(@Param("djxh") String djxh, @Param("nsrsbh") String nsrsbh, @Param("type") String type);

    /***
     *
     * @param djxh
     * @param nsrsbh
     * @return
     */
    @DS("WSCL_DB")
    String getXgmfwsj(@Param("djxh") String djxh, @Param("nsrsbh") String nsrsbh);
}
