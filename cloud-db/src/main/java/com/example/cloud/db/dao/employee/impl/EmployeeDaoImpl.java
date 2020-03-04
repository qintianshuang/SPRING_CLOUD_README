package com.example.cloud.db.dao.employee.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.common.bean.Employee;
import com.example.cloud.db.dao.employee.IEmployeeDao;
import com.example.cloud.db.mapper.employee.IEmployeeMapper;
import com.example.cloud.db.po.employee.EmployeePO;
import org.apache.commons.lang3.StringUtils;
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
    public IPage<Employee> queryEmpByName(Page<Employee> page, String empName) {
        IPage<Employee> employeeList = employeeMapper.queryEmployeeByName(page, empName);
        log.debug("employeeList" + employeeList);
        return employeeList;
    }

    @Override
    public void saveEmployee(Employee employee) {
        if (employee == null){
            return;
        }
        EmployeePO employeePO = new EmployeePO();
        BeanUtils.copyProperties(employee,employeePO);
        employeeMapper.saveEmployee(employeePO);
    }

    @Override
    public void deleteEmployee(String empNo) {
        if (StringUtils.isBlank(empNo)){
            return;
        }
        employeeMapper.deleteEmployee(empNo);
    }

    @Override
    public List<Employee> queryEmpByCardOrPhone(String identityCard,String phone) {
        if (StringUtils.isBlank(identityCard) && StringUtils.isBlank(phone)){
            return null;
        }
        List<Employee> employeeList = new ArrayList<>();
        List<EmployeePO> employeePOList = employeeMapper.queryEmpByCardOrPhone(identityCard,phone);
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

    @Override
    public void editEmployee(Employee employee) {
        if (employee == null){
            return;
        }
        EmployeePO employeePO = new EmployeePO();
        BeanUtils.copyProperties(employee,employeePO);
        employeeMapper.editEmployee(employeePO);
    }
}
