package com.example.cloud.db.dao.sb.xgm;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import com.example.cloud.service.base.vo.ResultVo;

public interface IYcsbdDao extends IService<ZsxmDmslPO> {

    ResultVo checkXgmIsYcsbd(String djxh, String sbzlDm, String sssqQ, String sssqZ);
}
