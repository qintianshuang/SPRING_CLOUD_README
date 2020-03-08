package com.example.cloud.db.dao.sb.xgm.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.common.bean.sb.PbbdXgmNew;
import com.example.cloud.common.util.BeanUtil;
import com.example.cloud.db.dao.sb.xgm.IXgmHdxxDao;
import com.example.cloud.db.mapper.sb.xgm.IXgmHdxxMapper;
import com.example.cloud.db.po.sb.xgm.PbbdXgmNewPO;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.commons.lang3.StringUtils;
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
}
