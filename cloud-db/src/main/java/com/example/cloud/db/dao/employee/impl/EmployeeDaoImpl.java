package com.example.cloud.db.dao.employee.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.common.bean.Employee;
import com.example.cloud.db.dao.employee.IEmployeeDao;
import com.example.cloud.db.mapper.employee.IEmployeeMapper;
import com.example.cloud.db.po.employee.EmployeePO;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component(value = "employeeDao")
public class EmployeeDaoImpl extends ServiceImpl<IEmployeeMapper, EmployeePO> implements IEmployeeDao {

    private static final Logger LOG = Logger.getLogger(EmployeeDaoImpl.class);

    @Autowired
    private IEmployeeMapper employeeMapper;

    /***
     *
     * @return
     */
    @Override
    public List<Employee> queryEmpByName(String empName) {
        List<Employee> employeeList = new ArrayList<>();
        List<EmployeePO> employeePOList = employeeMapper.queryEmployeeByName(empName);
        if (!CollectionUtils.isEmpty(employeePOList)) {
            for (EmployeePO employeePO : employeePOList) {
                Employee employee = new Employee();
                BeanUtils.copyProperties(employeePO, employee);
                employeeList.add(employee);
            }
        }
        log.debug("employeeList" + employeeList);
        return employeeList;
    }
}
