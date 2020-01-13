package com.example.cloud.db.mapper.sb.xgm;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IHdxxTqMapper extends BaseMapper<ZsxmDmslPO> {

    /***
     *
     * @param djxh
     * @param zsxmDm
     * @return
     */
    @DS("ORACLE_DB")
    List<ZsxmDmslPO> queryFjsZspms(@Param("djxh") String djxh, @Param("zsxmDm") String zsxmDm);

    /***
     *
     * @param jmxzDm
     * @return
     */
    @DS("ORACLE_DB")
    String queryFjsJzblByJmxzDm(@Param("jmxzDm") String jmxzDm);
}
