package com.example.cloud.service.service.employee;

import com.example.cloud.common.bean.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> queryEmpByName(String name);
}
