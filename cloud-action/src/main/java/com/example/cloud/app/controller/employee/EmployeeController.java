package com.example.cloud.app.controller.employee;

import com.example.cloud.common.bean.Employee;
import com.example.cloud.common.config.Logger;
import com.example.cloud.service.service.IEmployeeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 *
 */
@Api(value="用户信息",tags={"用户信息"})
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final static Logger log = Logger.getLogger(EmployeeController.class);

    @Autowired
    @Qualifier("empService")
    private IEmployeeService empService;

    @GetMapping(value = "/queryEmployeeByName")
    public List<Employee> queryEmployeeByName(@RequestParam String name) {
        List<Employee> employees = empService.queryEmployeeByName(name);
        return employees;
    }
}
