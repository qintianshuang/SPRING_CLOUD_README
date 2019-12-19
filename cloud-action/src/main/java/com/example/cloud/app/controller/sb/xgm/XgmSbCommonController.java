package com.example.cloud.app.controller.sb.xgm;

import com.example.cloud.common.config.Logger;
import com.example.cloud.server.service.sb.common.ISbJcjyBusiness;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Api(value="申报公共组件",tags={"申报公共组件"})
@RestController
@RequestMapping(value = "/sb/common")
public class XgmSbCommonController {

    private final static Logger log = Logger.getLogger(XgmSbCommonController.class);

    @Autowired
    @Qualifier("zzsXgmJcjyBusiness")
    private ISbJcjyBusiness zzsXgmJcjyBusiness;

    @ApiOperation(value = "小规模基础校验",notes = "小规模基础校验",produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name="djxh",value="登记序号",dataType="string", paramType = "query",defaultValue="10114403000026000891"),
            @ApiImplicitParam(name="sssqq",value="所属期起",dataType="String", paramType = "query",defaultValue="2019-04-01"),
            @ApiImplicitParam(name="sssqz",value="所属期止",dataType="String", paramType = "query",defaultValue="2019-06-30"),
    })
    @PostMapping(value = "/sbJcjy")
    public Object sbJcjy(@RequestParam("djxh") String djxh, @RequestParam("sssqq") String sssqq,
                         @RequestParam("sssqz") String sssqz, MultipartFile requestXml,
                         MultipartFile wsxxXml, MultipartFile lsxxXml) {
        Object resultVo = zzsXgmJcjyBusiness.sbJcjy(djxh, sssqq, sssqz,requestXml,wsxxXml,lsxxXml);
        return resultVo;
    }
}
