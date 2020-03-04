package com.example.cloud.db.mapper.sb.common;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cloud.common.bean.sb.XtXtcs;
import com.example.cloud.db.po.common.XtXtcsPO;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ISystemParamMapper extends BaseMapper<ZsxmDmslPO> {

    @DS("ORACLE_DB")
    String getSystemParam(@Param("code") String code);

    @DS("WSBSFWT_DB")
    IPage<XtXtcs> getSystemParamBySearch(Page<XtXtcs> page, @Param("code") String code);

    @DS("WSBSFWT_DB")
    List<XtXtcsPO> getSystemParamXtXtcsByXhOrCode(@Param("xh") String xh, @Param("code") String code);

    @DS("WSBSFWT_DB")
    String getSystemParamMaxxh();

    @DS("WSBSFWT_DB")
    void saveXtcs(XtXtcsPO xtXtcsPO);

    @DS("WSBSFWT_DB")
    void editXtcs(XtXtcsPO xtXtcsPO);

    @DS("WSBSFWT_DB")
    void deleteXtcs(@Param("xh") String xh, @Param("code") String code);
}
