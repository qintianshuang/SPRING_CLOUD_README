package com.example.cloud.app.controller.sb.xgm;

import com.example.cloud.common.config.Logger;
import com.example.cloud.common.util.PoiUtils;
import com.example.cloud.company.service.sb.xgm.ISbJcjyBusiness;
import com.example.cloud.company.service.sb.xgm.IXgmSbhyfpService;
import com.example.cloud.company.service.sb.xgm.IZzsXgmhdxxService;
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
import java.io.IOException;


@Api(value = "小规模公共组件", tags = {"小规模公共组件"})
@RestController
@RequestMapping(value = "/xgm/common")
public class XgmCommonController {

    private final static Logger LOG = Logger.getLogger(XgmCommonController.class);

    @Autowired
    @Qualifier("zzsXgmJcjyBusiness")
    private ISbJcjyBusiness zzsXgmJcjyBusiness;

    @Autowired
    @Qualifier("xgmSbhyfpService")
    private IXgmSbhyfpService xgmSbhyfpService;

    @Autowired
    private IZzsXgmhdxxService zzsXgmhdxxService;

    @ApiOperation(value = "小规模基础校验", notes = "小规模基础校验", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891"),
            @ApiImplicitParam(name = "sssqq", value = "所属期起", dataType = "String", paramType = "query", defaultValue = "2019-04-01"),
            @ApiImplicitParam(name = "sssqz", value = "所属期止", dataType = "String", paramType = "query", defaultValue = "2019-06-30")
    })
    @PostMapping(value = "/sbJcjy")
    public Object sbJcjy(@RequestParam("djxh") String djxh, @RequestParam("sssqq") String sssqq,
                         @RequestParam("sssqz") String sssqz, MultipartFile requestXml,
                         MultipartFile wsxxXml, MultipartFile lsxxXml) throws Exception {
        Object object= zzsXgmJcjyBusiness.sbJcjy(djxh, sssqq, sssqz, requestXml, wsxxXml, lsxxXml);
        return object;
    }

    @ApiOperation(value = "小规模发票数据", notes = "小规模发票数据", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891"),
            @ApiImplicitParam(name = "sbsq", value = "所属期起", dataType = "String", paramType = "query", defaultValue = "2019-01-11"),
            @ApiImplicitParam(name = "isLoseData", value = "是否显示失效数据", dataType = "String", paramType = "query", defaultValue = "N"),
            @ApiImplicitParam(name = "current", value = "当前页", dataType = "string", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "条数", dataType = "string", paramType = "query", defaultValue = "10")
    })
    @GetMapping(value = "/getHyfpdata")
    public Object getHyfpdata(@RequestParam("djxh") String djxh, @RequestParam("sbsq") String sbsq,
                              @RequestParam String current, @RequestParam String size,
                              @RequestParam("isLoseData") String isLoseData){
        Object object= xgmSbhyfpService.getHyfpdata(djxh, sbsq,isLoseData,current,size);
        return object;
    }

    @ApiOperation(value = "小规模申报核定信息", notes = "小规模申报核定信息", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891"),
            @ApiImplicitParam(name = "sbsq", value = "所属期起", dataType = "String", paramType = "query", defaultValue = "2019-01-11")
    })
    @GetMapping(value = "/getXgmSbHdxx")
    public Object getXgmSbHdxx(@RequestParam("djxh") String djxh, @RequestParam("sbsq") String sbsq){
        Object object= zzsXgmhdxxService.getXgmSbHdxx(djxh, sbsq);
        return object;
    }

    @ApiOperation(value = "小规模华云数据下载", notes = "小规模华云数据导出", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891"),
    })
    @PostMapping(value = "/downloadHyfpxx")
    public void downloadHyfpxx(HttpServletRequest request, HttpServletResponse response, @RequestParam("djxh") String djxh)
            throws IOException {
        String fileName = "小规模华云发票数据";
        Workbook workbook = xgmSbhyfpService.downloadHyfpxx(djxh);
        PoiUtils.outExcel(request,response, fileName, workbook);
    }

    @ApiOperation(value = "小规模华云数据导出", notes = "小规模华云数据导出", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891"),
    })
    @PostMapping(value = "/exportHyfpxx")
    public Object exportHyfpxx(@RequestParam("djxh") String djxh, MultipartFile multipartFile)
            throws IOException {
        Object object= xgmSbhyfpService.exportHyfpxx(djxh,multipartFile);
        return object;
    }

//    @ApiOperation(value = "小规模获取期初对象", notes = "小规模获取期初对象", produces = "application/json")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891")
//    })
//    @PostMapping(value = "/getHXZGSB44Response")
//    public Object getHXZGSB44Response(@RequestParam("djxh") String djxh,  MultipartFile multipartFile) throws Exception {
//        Object resultVo = zzsXgmhdxxService.getHXZGSB44Response(djxh,multipartFile);
//        return resultVo;
//    }
//
//    @ApiOperation(value = "小规模更正获取期初对象", notes = "小规模更正获取期初对象", produces = "application/json")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891")
//    })
//    @PostMapping(value = "/getHXZGSB789Response")
//    public Object getHXZGSB789Response(@RequestParam("djxh") String djxh,  MultipartFile multipartFile) throws Exception {
//        Object resultVo = zzsXgmhdxxService.getHXZGSB789Response(djxh,multipartFile);
//        return resultVo;
//    }
//
//    @ApiOperation(value = "小规模核定期初对象", notes = "小规模核定期初对象", produces = "application/json")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891")
//    })
//    @PostMapping(value = "/getHXZGxxsj")
//    public Object getHXZGxxsj(@RequestParam("djxh") String djxh) throws Exception {
//        Object resultVo = zzsXgmhdxxService.getHXZGxxsj( djxh);
//        return resultVo;
//    }
}
