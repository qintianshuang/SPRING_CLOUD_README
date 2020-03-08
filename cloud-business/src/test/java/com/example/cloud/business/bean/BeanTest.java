package com.example.cloud.business.bean;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.common.bean.Employee;
import com.example.cloud.common.util.BeanUtil;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BeanTest {

    private static final Logger LOG = Logger.getLogger(BeanTest.class);

    @Test
    public void test(){
        Employee employee = new Employee();
        employee.setEmpNo("1");
        employee.setAge("1");
        employee.setEmail("1");
        employee.setEmpName("1");
        employee.setFamilyAddress("1");
        employee.setLiveAddress("1");
        Map<String, Object> stringObjectMap = BeanUtil.beanToMap(employee);
        System.out.println(JSONObject.toJSONString(stringObjectMap));
        System.out.println(stringObjectMap);
        System.out.println("======================================");
        Employee employee1 = BeanUtil.mapToBean(stringObjectMap, Employee.class);
        System.out.println(employee1);
        System.out.println(JSONObject.toJSONString(employee1));
    }

    @Test
    public void test1(){
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmpNo("1");
        employee.setAge("1");
        employee.setEmail("1");
        employee.setEmpName("1");
        employee.setFamilyAddress("1");
        employee.setLiveAddress("1");
        employees.add(employee);
        String json = JSONObject.toJSONString(employees.get(0));
        System.out.println(json);
        Employee e = JSONObject.parseObject(json, Employee.class);
        System.out.println(e);
    }
}
