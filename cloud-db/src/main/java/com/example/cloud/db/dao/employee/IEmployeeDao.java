package com.example.cloud.db.dao.employee;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.common.bean.Employee;
import com.example.cloud.db.po.employee.EmployeePO;

import java.util.List;

public interface IEmployeeDao extends IService<EmployeePO> {

    /***
     *
     * @param empName
     * @return
     */
    List<Employee> queryEmpByName(String empName);

    void saveEmployee(Employee employee);

    void deleteEmployee(String empNo);

    List<Employee> queryEmpByCardOrPhone(String identityCard,String phone);

    void editEmployee(Employee employee);
}
