package com.example.cloud.db.dao.sb.xgm.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.common.bean.sb.PbbdXgmNew;
import com.example.cloud.common.util.BeanUtil;
import com.example.cloud.db.dao.sb.xgm.IXgmHdxxDao;
import com.example.cloud.db.mapper.sb.xgm.IXgmHdxxMapper;
import com.example.cloud.db.po.sb.xgm.PbbdXgmNewPO;
import com.example.cloud.service.base.vo.ResultVo;
import com.example.cloud.service.util.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component(value = "xgmHdxxDao")
public class XgmHdxxDaoImpl extends ServiceImpl<IXgmHdxxMapper, PbbdXgmNewPO> implements IXgmHdxxDao {

    @Autowired
    private IXgmHdxxMapper xgmHdxxMapper;

    /***
     *
     * @param page
     * @param djxh
     * @param sssqq
     * @return
     */
    @Override
    public IPage<PbbdXgmNew> getHyfpdata(Page<PbbdXgmNew> page, String djxh, String sssqq, String sssqz,String isShow) {
        IPage<PbbdXgmNew> pageList = xgmHdxxMapper.getHyfpdata(page,djxh,sssqq,sssqz,isShow);
        return pageList;
    }

    @Override
    public IPage<PbbdXgmNew> getHyfpdata(Page<PbbdXgmNew> page, String djxh, String sssqq, String sssqz) {
        if (StringUtils.isEmpty(djxh) || StringUtils.isEmpty(sssqq) || StringUtils.isEmpty(sssqz)){
            return null;
        }
        IPage<PbbdXgmNew> pageList = xgmHdxxMapper.getHyfpxx(page,djxh,sssqq,sssqz);
        return pageList;
    }

    @Override
    public ResultVo getXgmHdData(String djxh, String skssqq, String skssqz) {
        IPage<PbbdXgmNew> hyfpdata = getHyfpdata(new Page<PbbdXgmNew>(), djxh, skssqq, skssqz,"");
        List<PbbdXgmNew> records = hyfpdata.getRecords();
        if (!CollectionUtils.isEmpty(records)){
            List<Map<String,String>> maps = new ArrayList<>();
            PbbdXgmNew pbbdXgmNew = records.get(0);
            Map<String, String> stringObjectMap = BeanUtil.beanToMapStrValue(pbbdXgmNew);
            maps.add(stringObjectMap);
            return ResultVo.valueOfSuccess(maps);
        }
        return null;
    }

    @Override
    public void insertXgmfwsj(String djxh, String nsrsbh, String type) {
        xgmHdxxMapper.insertXgmfwsj(djxh,nsrsbh,type);
    }

    @Override
    public ResultVo getXgmfwsj(String djxh, String nsrsbh) {
        String fwsj = xgmHdxxMapper.getXgmfwsj(djxh,nsrsbh);
        if (StringUtils.isNotBlank(fwsj)){
            List<Map<String,String>> maps = new ArrayList<>();
            Map<String,String> map = new HashMap<>();
            map.put("fwsj",fwsj);
            maps.add(map);
            return ResultVo.valueOfSuccess(maps);
        }

        return ResultVo.valueOfSuccess();
    }

    @Override
    @DS("ORACLE_DB")
    public void saveFpdata(PbbdXgmNew pbbdXgmNew) {
        if (pbbdXgmNew != null){
            PbbdXgmNewPO pbbdXgmNewPO = new PbbdXgmNewPO();
            BeanUtils.copyProperties(pbbdXgmNew,pbbdXgmNewPO);
            pbbdXgmNewPO.setSkssqq(DateUtil.dateAuto(pbbdXgmNew.getSkssqq()));
            pbbdXgmNewPO.setSkssqz(DateUtil.dateAuto(pbbdXgmNew.getSkssqz()));
            xgmHdxxMapper.insert(pbbdXgmNewPO);
        }
    }

    @Override
    @DS("ORACLE_DB")
    public void editFpdata(PbbdXgmNew pbbdXgmNew) {//
        if (pbbdXgmNew != null){
            PbbdXgmNewPO pbbdXgmNewPO = new PbbdXgmNewPO();
            BeanUtils.copyProperties(pbbdXgmNew,pbbdXgmNewPO);
            pbbdXgmNewPO.setSkssqq(DateUtil.dateAuto(pbbdXgmNew.getSkssqq()));
            pbbdXgmNewPO.setSkssqz(DateUtil.dateAuto(pbbdXgmNew.getSkssqz()));
            UpdateWrapper<PbbdXgmNewPO> wrapper = new UpdateWrapper<PbbdXgmNewPO>();
            wrapper.eq("djxh", pbbdXgmNewPO.getDjxh());
            wrapper.eq("skssqq", pbbdXgmNewPO.getSkssqq());
            wrapper.eq("skssqz", pbbdXgmNewPO.getSkssqz());
            xgmHdxxMapper.update(pbbdXgmNewPO,wrapper);
        }
    }

    @Override
    @DS("ORACLE_DB")
    public void deleteFpdata(String djxh, String sssqq, String sssqz) {
        if (StringUtils.isEmpty(djxh) || StringUtils.isEmpty(sssqq) || StringUtils.isEmpty(sssqz)){
            return;
        }
        PbbdXgmNewPO pbbdXgmNewPO = new PbbdXgmNewPO();
        pbbdXgmNewPO.setCbzt("N");
        UpdateWrapper<PbbdXgmNewPO> wrapper = new UpdateWrapper<>();
        wrapper.eq("djxh", djxh);
        wrapper.eq("skssqq", DateUtil.dateAuto(sssqq));
        wrapper.eq("skssqz", DateUtil.dateAuto(sssqz));
        xgmHdxxMapper.update(pbbdXgmNewPO,wrapper);
    }
}
