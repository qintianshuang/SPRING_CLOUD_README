package com.example.cloud.db.dao.sb.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.common.bean.sb.XtXtcs;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;

import java.util.List;

public interface ISystemParamDao extends IService<ZsxmDmslPO> {

    String getSystemParam(String code);

    List<XtXtcs> getSystemParamXtXtcsByXhOrCode(String xh, String code);

    String getSystemParamMaxxh();

    IPage<XtXtcs> getSystemParamBySearch(Page<XtXtcs> page, String var);

    void saveXtcs(XtXtcs xtXtcs);

    void editXtcs(XtXtcs xtXtcs);

    void deleteXtcs(String xh, String code);
}
