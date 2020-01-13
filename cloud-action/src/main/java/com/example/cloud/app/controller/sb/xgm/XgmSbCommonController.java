package com.example.cloud.app.controller.sb.xgm;

import com.example.cloud.common.config.Logger;
import com.example.cloud.common.util.PoiUtils;
import com.example.cloud.server.service.sb.common.ISbJcjyBusiness;
import com.example.cloud.server.service.sb.xgm.IXgmSbhyfpxzdrService;
import com.example.cloud.server.service.sb.xgm.IZzsXgmhdxxService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Api(value = "申报公共组件", tags = {"申报公共组件"})
@RestController
@RequestMapping(value = "/sb/common")
public class XgmSbCommonController {

    private final static Logger log = Logger.getLogger(XgmSbCommonController.class);

    @Autowired
    @Qualifier("zzsXgmJcjyBusiness")
    private ISbJcjyBusiness zzsXgmJcjyBusiness;

    @Autowired
    @Qualifier("xgmSbhyfpxzdrService")
    private IXgmSbhyfpxzdrService xgmSbhyfpxzdrService;

    @Autowired
    @Qualifier("zzsXgmhdxxService")
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
        Object resultVo = zzsXgmJcjyBusiness.sbJcjy(djxh, sssqq, sssqz, requestXml, wsxxXml, lsxxXml);
        return resultVo;
    }

    @ApiOperation(value = "小规模华云数据导出", notes = "小规模华云数据导出", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891"),
    })
    @PostMapping(value = "/getHyfpdc")
    public void getHyfpxz(HttpServletResponse response,@RequestParam("djxh") String djxh)
            throws IOException {
        String fileName = "小规模华云发票数据";
        Workbook workbook = xgmSbhyfpxzdrService.getHyfpdc(djxh);
        PoiUtils.outExcel(response, fileName, workbook);
    }

    @ApiOperation(value = "小规模华云数据导出", notes = "小规模华云数据导出", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891"),
    })
    @PostMapping(value = "/getHyfpdr")
    public Object getHyfpdr(@RequestParam("djxh") String djxh, MultipartFile multipartFile)
            throws IOException {
        Object object= xgmSbhyfpxzdrService.getHyfpdr(djxh,multipartFile);
        return object;
    }

    @ApiOperation(value = "小规模获取期初对象", notes = "小规模获取期初对象", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891")
    })
    @PostMapping(value = "/getHXZGSB44Response")
    public Object getHXZGSB44Response(@RequestParam("djxh") String djxh,  MultipartFile multipartFile) throws Exception {
        Object resultVo = zzsXgmhdxxService.getHXZGSB44Response(djxh,multipartFile);
        return resultVo;
    }

    @ApiOperation(value = "小规模更正获取期初对象", notes = "小规模更正获取期初对象", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891")
    })
    @PostMapping(value = "/getHXZGSB789Response")
    public Object getHXZGSB789Response(@RequestParam("djxh") String djxh,  MultipartFile multipartFile) throws Exception {
        Object resultVo = zzsXgmhdxxService.getHXZGSB789Response(djxh,multipartFile);
        return resultVo;
    }

    @ApiOperation(value = "小规模核定期初对象", notes = "小规模核定期初对象", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "djxh", value = "登记序号", dataType = "string", paramType = "query", defaultValue = "10114403000026000891")
    })
    @PostMapping(value = "/getHXZGxxsj")
    public Object getHXZGxxsj(@RequestParam("djxh") String djxh) throws Exception {
        Object resultVo = zzsXgmhdxxService.getHXZGxxsj( djxh);
        return resultVo;
    }
}
