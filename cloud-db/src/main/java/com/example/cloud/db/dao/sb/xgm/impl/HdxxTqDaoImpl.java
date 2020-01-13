package com.example.cloud.db.dao.sb.xgm.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.db.dao.sb.xgm.IHdxxTqDao;
import com.example.cloud.db.mapper.sb.xgm.IHdxxTqMapper;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository(value = "hdxxTqDao")
public class HdxxTqDaoImpl extends ServiceImpl<IHdxxTqMapper, ZsxmDmslPO> implements IHdxxTqDao {

    private static final Logger LOG = Logger.getLogger(HdxxTqDaoImpl.class);

    @Autowired
    private IHdxxTqMapper hdxxTqMapper;

    public ResultVo queryFjsZspms(String djxh, String zsxmDm, String rdyxqq, String rdyxqz){
        List<ZsxmDmslPO> zsxmDmslPOS = hdxxTqMapper.queryFjsZspms(djxh,zsxmDm);

        List<Map<String, String>> resultList = new ArrayList<>();
        if(CollectionUtils.isEmpty(zsxmDmslPOS)){
            LOG.error("纳税人没有有效的税费种认定或核定税率有误，请到主管税务机关核实处理！[1]");
            return ResultVo.valueOfError("纳税人没有有效的税费种认定或核定税率有误，请到主管税务机关核实处理！");
        }
        if (zsxmDmslPOS.size() < 3 || zsxmDmslPOS.size() % 3 != 0) {
            LOG.error("您核定的税费种信息不全，请联系主管税务机关核实处理！[0]");
            return ResultVo.valueOfError("您核定的税费种信息不全，请联系主管税务机关核实处理！");
        }
        for (ZsxmDmslPO zsxmDmslPO : zsxmDmslPOS) {
            double sl = Double.parseDouble(zsxmDmslPO.getSl());
            if (sl <= 0) {
                LOG.error("纳税人没有有效的税费种认定或核定税率有误，请到主管税务机关核实处理！[1]");
                return ResultVo.valueOfError("纳税人没有有效的税费种认定或核定税率有误，请到主管税务机关核实处理！");
            }
        }
        return ResultVo.valueOfSuccess(resultList);
    }

    /***
     *根据减免性质代码查询减征比例
     * @param jmxzDm
     * @return
     */
    @Override
    public ResultVo queryFjsJzblByJmxzDm(String jmxzDm) {
        String jmbl = hdxxTqMapper.queryFjsJzblByJmxzDm(jmxzDm);
        if (StringUtils.isNotBlank(jmbl)){
            return ResultVo.valueOfSuccess(jmbl);
        }else {
            return ResultVo.valueOfError("未查询到减征比例信息!");
        }
    }
}
