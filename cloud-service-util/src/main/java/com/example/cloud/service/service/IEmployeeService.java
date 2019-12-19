package com.example.cloud.service.service;

import com.example.cloud.common.bean.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> queryEmployeeByName(String name);
}