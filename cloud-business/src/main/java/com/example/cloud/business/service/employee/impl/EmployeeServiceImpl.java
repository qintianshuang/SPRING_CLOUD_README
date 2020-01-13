package com.example.cloud.server.service.employee.impl;

import com.example.cloud.common.bean.Employee;
import com.example.cloud.common.config.Logger;
import com.example.cloud.db.dao.employee.IEmployeeDao;
import com.example.cloud.service.service.employee.IEmployeeService;
import com.example.cloud.service.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service(value = "empService")
public class EmployeeServiceImpl implements IEmployeeService {

    private final static Logger LOG = Logger.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    @Qualifier(value = "employeeDao")
    private IEmployeeDao employeeDao;

    /***
     *
     * @return
     */
    @Override
    public List<Employee> queryEmployeeByName(String empName) {
        if (StringUtils.isEmpty(empName)){
            return null;
        }
        List<Employee> employeeList = employeeDao.queryEmployeeByName(empName);
        return employeeList;
    }
}
