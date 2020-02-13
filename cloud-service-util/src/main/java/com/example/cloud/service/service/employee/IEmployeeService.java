package com.example.cloud.service.service.employee;

import com.example.cloud.common.bean.Employee;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

public interface IEmployeeService {

    List<Employee> queryEmpByName(String name);

    void saveEmployee(Employee employee);

    void deleteEmployee(String empNo, String empName, String identityCard);

    void editEmployee(Employee employee);

    Workbook downloadEmpTemplate() throws Exception;

    Object exportEmpList();
}
