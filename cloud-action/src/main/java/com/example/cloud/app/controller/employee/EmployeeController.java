package com.example.cloud.app.controller.employee;

import com.example.cloud.common.bean.Employee;
import com.example.cloud.common.config.Logger;
import com.example.cloud.service.service.employee.IEmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 *
 */
@Api(value="用户信息",tags={"用户信息"})
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final static Logger LOG = Logger.getLogger(EmployeeController.class);

    @Autowired
    @Qualifier("empService")
    private IEmployeeService empService;

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", dataType = "string", paramType = "query", defaultValue = "小红")
    })
    @GetMapping(value = "/queryEmployeeByName")
    public List<Employee> queryEmployeeByName(@RequestParam String name) {
        List<Employee> employees = empService.queryEmployeeByName(name);
        return employees;
    }
}
