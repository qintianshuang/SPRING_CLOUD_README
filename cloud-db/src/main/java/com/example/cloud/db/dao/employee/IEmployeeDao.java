package com.example.cloud.db.dao.employee;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.common.bean.Employee;
import com.example.cloud.db.po.employee.EmployeePO;

import java.util.List;

public interface IEmployeeDao extends IService<EmployeePO> {

    /***
     *
     *
     * @param page
     * @param empName
     * @return
     */
    IPage<Employee> queryEmpByName(Page<Employee> page, String empName);

    void saveEmployee(Employee employee);

    void deleteEmployee(String empNo);

    List<Employee> queryEmpByCardOrPhone(String identityCard,String phone);

    void editEmployee(Employee employee);
}
