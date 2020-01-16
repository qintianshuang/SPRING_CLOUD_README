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


    /***
     * page=1&limit=20&sort=%2Bid
     * @param name
     * @return
     */
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", dataType = "string", paramType = "query", defaultValue = "小红"),
            @ApiImplicitParam(name = "page", value = "页数", dataType = "in", paramType = "query", defaultValue = "小红"),
            @ApiImplicitParam(name = "limit", value = "条数", dataType = "string", paramType = "query", defaultValue = "小红")
    })
    @GetMapping(value = "/queryEmpByName")
    public List<Employee> queryEmpByName(@RequestParam String name,@RequestParam String page,@RequestParam String limit) {
        List<Employee> employees = empService.queryEmpByName(name);
        return employees;
    }
}
