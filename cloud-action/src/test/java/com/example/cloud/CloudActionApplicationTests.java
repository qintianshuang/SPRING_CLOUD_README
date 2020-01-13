package com.example.cloud;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.common.config.Logger;
import com.example.cloud.db.mapper.employee.IEmployeeMapper;
import com.example.cloud.db.mapper.sb.common.ISystemParamMapper;
import com.example.cloud.db.po.employee.EmployeePO;
import com.example.cloud.server.service.employee.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudActionApplicationTests {

    private final static Logger LOG = Logger.getLogger(EmployeeServiceImpl.class);


    @Autowired
    private IEmployeeMapper IEmployeeMapper;

    @Autowired
    private ISystemParamMapper ISystemParamMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getSystemParam() {
        LOG.debug("=================开始====================");
        String code = "小红";
//        String str = systemParamMapper.getSystemParam(code);
        List<EmployeePO> userList = IEmployeeMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        LOG.debug(userList);
        System.out.println(JSONObject.toJSONString(userList));
        LOG.debug("=================结束====================");
    }

    @Test
    public void getSystemParam1() {
        LOG.debug("=================开始====================");
        String code = "小红";
        String str = ISystemParamMapper.getSystemParam(code);
        System.out.println(JSONObject.toJSONString(str));
        LOG.debug("=================结束====================");
    }
}
