package com.example.cloud.db.dao.sb.common.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.common.bean.sb.XtXtcs;
import com.example.cloud.db.dao.sb.common.ISystemParamDao;
import com.example.cloud.db.mapper.sb.common.ISystemParamMapper;
import com.example.cloud.db.po.common.XtXtcsPO;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "systemParamDao")
public class ISystemParamDaoImpl extends ServiceImpl<ISystemParamMapper, ZsxmDmslPO> implements ISystemParamDao {


    @Autowired
    private ISystemParamMapper systemParamMapper;

    @Override
    public String getSystemParam(String code) {
        String str = systemParamMapper.getSystemParam(code);
        return str;
    }

    @Override
    public List<XtXtcs> getSystemParamXtXtcsByXhOrCode(String xh, String code) {
        List<XtXtcsPO> xtXtcsPOS = systemParamMapper.getSystemParamXtXtcsByXhOrCode(xh,code);
        if (!CollectionUtils.isEmpty(xtXtcsPOS)){
            List<XtXtcs> xtXtcsList = new ArrayList<>();
            for (XtXtcsPO xtXtcsPO : xtXtcsPOS) {
                XtXtcs xtXtcs = new XtXtcs();
                BeanUtils.copyProperties(xtXtcsPO,xtXtcs);
                xtXtcsList.add(xtXtcs);
            }
            return xtXtcsList;
        }
        return null;
    }

    @Override
    public String getSystemParamMaxxh() {
        String maxXh = systemParamMapper.getSystemParamMaxxh();
        return maxXh;
    }

    /***
     *
     *
     * @param page
     * @param var
     * @return
     */
    @Override
    public IPage<XtXtcs> getSystemParamBySearch(Page<XtXtcs> page, String var) {
        IPage<XtXtcs> xtXtcsIPage = systemParamMapper.getSystemParamBySearch(page,var);
        return xtXtcsIPage;
    }

    @Override
    public void saveXtcs(XtXtcs xtXtcs) {
        if (xtXtcs == null){
            return;
        }
        XtXtcsPO xtXtcsPO  = new XtXtcsPO();
        BeanUtils.copyProperties(xtXtcs,xtXtcsPO);
        systemParamMapper.saveXtcs(xtXtcsPO);
    }

    @Override
    public void editXtcs(XtXtcs xtXtcs) {
        if (xtXtcs == null){
            return;
        }
        XtXtcsPO xtXtcsPO  = new XtXtcsPO();
        BeanUtils.copyProperties(xtXtcs,xtXtcsPO);
        systemParamMapper.editXtcs(xtXtcsPO);
    }

    /***
     *
     * @param xh
     * @param code
     */
    @Override
    public void deleteXtcs(String xh, String code) {
        systemParamMapper.deleteXtcs(xh,code);

    }
}
