package com.example.cloud.db.mapper.sb.xgm;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface IYcsbdMapper extends BaseMapper<ZsxmDmslPO> {

    @DS("ORACLE_DB")
    Map<String,String> checkXgmIsYcsbd(@Param("djxh") String djxh, @Param("sbzlDm") String sbzlDm, @Param("sssqq") String sssqq, @Param("sssqz") String sssqz);

    @DS("ORACLE_DB")
    List queryYcsbdIsPass(@Param("bduuid") String bduuid);
}
