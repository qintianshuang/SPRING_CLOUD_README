package com.example.cloud.app.controller.employee;

import com.example.cloud.common.bean.Employee;
import com.example.cloud.common.config.Logger;
import com.example.cloud.common.util.PoiUtils;
import com.example.cloud.service.service.employee.IEmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

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
            @ApiImplicitParam(name = "current", value = "当前页", dataType = "string", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "条数", dataType = "string", paramType = "query", defaultValue = "10")
    })
    @GetMapping(value = "/queryEmpByName")
    public Object queryEmpByName(@RequestParam String name, @RequestParam String current, @RequestParam String size) {
        Object object = empService.queryEmpByName(name, current, size);
        return object;
    }


    @ApiOperation(value = "保存用户信息", notes = "保存用户信息", produces = "application/json")
    @PostMapping(value = "/saveEmployee")
    public Object saveEmployee(@RequestBody @Valid Employee employee) {
        // 校验参数
        if (employee == null) {
            return "params is not null";
        }
        empService.saveEmployee(employee);
        return "保存成功";
    }

    @ApiOperation(value = "修改用户信息", notes = "修改用户信息", produces = "application/json")
    @PostMapping(value = "/editEmployee")
    public Object editEmployee(@RequestBody @Valid Employee employee) {
        // 校验参数
        if (employee == null) {
            return "params is not null";
        }
        empService.editEmployee(employee);
        return "修改成功";
    }

    @ApiOperation(value = "删除用户信息", notes = "删除用户信息", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empNo", value = "用户编号", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "empName", value = "用户名称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "identityCard", value = "身份证号码", dataType = "string", paramType = "query")
    })
    @DeleteMapping(value = "/deleteEmployee")
    public Object deleteEmployee(@RequestParam("empNo") String empNo,@RequestParam("empName")  String empName,@RequestParam("identityCard")  String identityCard) {
        // 校验参数
        empService.deleteEmployee(empNo,empName,identityCard);
        return "删除成功";
    }

    @ApiOperation(value = "用户信息模板下载", notes = "用户信息模板下载", produces = "application/json")
    @PostMapping("/downloadEmpTemplate")
    public void downloadEmpTemplate(HttpServletRequest request,HttpServletResponse response) throws Exception {
        String fileName = "文件下载";
        Workbook workbook = empService.downloadEmpTemplate();
        PoiUtils.outExcel(request,response, fileName, workbook);
//        return "下载成功";
    }

    @ApiOperation(value = "用户信息批量导入", notes = "用户信息批量导入", produces = "application/json")
    @PostMapping(value = "/exportEmpList")
    public Object exportEmpList(@RequestParam(value = "file", required = false) MultipartFile file) throws Exception {
        Object Object = empService.exportEmpList(file);
        return Object;
    }
}
