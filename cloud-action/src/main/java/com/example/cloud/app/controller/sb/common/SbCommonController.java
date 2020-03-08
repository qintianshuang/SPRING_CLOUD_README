package com.example.cloud.app.controller.sb.common;

import com.example.cloud.common.bean.sb.XtXtcs;
import com.example.cloud.company.service.sb.common.ISystemParamClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(value = "申报公共组件", tags = {"申报公共组件"})
@RestController
@RequestMapping(value = "/sb/common")
public class SbCommonController {

    @Autowired
    @Qualifier("systemParamClient")
    private ISystemParamClient systemParamClient;

    @ApiOperation(value = "系统参数basecode集合", notes = "系统参数basecode集合", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "code", value = "代码", dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "current", value = "当前页", dataType = "string", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "条数", dataType = "string", paramType = "query", defaultValue = "10")
    })
    @GetMapping(value = "/getSystemParamBySearch")
    public Object getSystemParamBySearch(@RequestParam(value = "code", required = false) String code, @RequestParam String current, @RequestParam String size) {
        Object resultVo = systemParamClient.getSystemParamBySearch(code, current, size);
        return resultVo;
    }

    @ApiOperation(value = "系统请求开关", notes = "系统请求开关", produces = "application/json")
    @PostMapping(value = "/getSystemParamByOnOff")
    public Object getSystemParamByOnOff() {
        Object object = systemParamClient.getSystemParamByOnOff();
        return object;
    }

    @ApiOperation(value = "保存系统参数", notes = "保存系统参数", produces = "application/json")
    @PostMapping(value = "/saveXtcs")
    public Object saveXtcs(@RequestBody @Valid XtXtcs xtXtcs) {
        String str = systemParamClient.saveXtcs(xtXtcs);
        return str;
    }

    @ApiOperation(value = "修改系统参数", notes = "修改系统参数", produces = "application/json")
    @PostMapping(value = "/editXtcs")
    public Object editXtcs(@RequestBody @Valid XtXtcs xtXtcs) {
        String str = systemParamClient.editXtcs(xtXtcs);
        return str;
    }

    @ApiOperation(value = "删除系统参数", notes = "删除系统参数", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "xh", value = "系统参数编号", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "系统参数名", dataType = "string", paramType = "query")
    })
    @DeleteMapping(value = "/deleteXtcs")
    public Object deleteXtcs(@RequestParam("xh") String xh,@RequestParam("code")  String code) {
        // 校验参数
        systemParamClient.deleteXtcs(xh,code);
        return "删除成功";
    }
}
