package com.example.cloud.db.dao.sb.xgm.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.db.dao.sb.xgm.IYcsbdDao;
import com.example.cloud.db.mapper.sb.xgm.IYcsbdMapper;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository(value = "ycsbdDao")
public class YcsbdDaoImpl extends ServiceImpl<IYcsbdMapper, ZsxmDmslPO> implements IYcsbdDao {

    private static final Logger LOG = Logger.getLogger(HdxxTqDaoImpl.class);

    @Autowired
    private IYcsbdMapper ycsbdMapper;

    /***
     * 校验纳税人是否点击一窗式比对
     * @param djxh
     * @param sbzlDm
     * @param sssqq
     * @param sssqz
     * @return
     */
    @Override
    public ResultVo checkXgmIsYcsbd(String djxh, String sbzlDm, String sssqq, String sssqz) {
        String bduuid = "";
        Map<String,String> map = ycsbdMapper.checkXgmIsYcsbd(djxh, sbzlDm, sssqq, sssqz);
        List<Map<String, String>> maps = null;
        if (CollectionUtils.isEmpty(maps) || CollectionUtils.isEmpty(maps.get(0))) {
            LOG.error("您有一窗式比对未通过，不允许提交申报");
            return ResultVo.valueOfError("您有一窗式比对未通过，不允许提交申报", 0);
        }
        bduuid = maps.get(0).get("bduuid");
        LOG.debug("第一次查询得到的bduuid:【" + bduuid + "】");
        ResultVo resultVo = queryYcsbdIsPass(djxh, bduuid);
        return resultVo;
    }

    /***
     *查询纳税人一窗式比对明细
     * @param djxh
     * @param bduuid
     * @return
     */
    private ResultVo queryYcsbdIsPass(String djxh, String bduuid) {
        List list = ycsbdMapper.queryYcsbdIsPass(bduuid);
        List<Map<String, String>> maps = null;
        if (CollectionUtils.isEmpty(maps) || CollectionUtils.isEmpty(maps.get(0))) {
            LOG.error("纳税人一窗式比对未通过,djxh==" + djxh + ",bduuid==" + bduuid);
            return ResultVo.valueOfError("您有一窗式比对未通过，不允许提交申报", 0);
        }
        Map<String, String> hashMap = new HashMap<String, String>();
        for (Map<String, String> map : maps) {
            String bdjg = map.get("bdjg");
            if ("N".equals(bdjg)) {
                LOG.error("纳税人一窗式比对未通过,djxh==" + djxh + ",bduuid==" + bduuid);
                return ResultVo.valueOfError("您有一窗式比对未通过，不允许提交申报", 0);
            }
            String bdgzId = map.get("bdgzId");
            hashMap.put(bdgzId, bdjg);
        }
        return ResultVo.valueOfSuccess(hashMap);
    }
}
