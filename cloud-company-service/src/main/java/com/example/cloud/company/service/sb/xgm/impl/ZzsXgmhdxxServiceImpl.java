package com.example.cloud.company.service.sb.xgm.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.company.common.build.xgm.qcxml.Gt3EJBTool;
import com.example.cloud.company.common.convert.ZzsXgmSbConvert;
import com.example.cloud.company.common.vo.xgm.hdxx.HdxxSbzlResponseVo;
import com.example.cloud.company.common.vo.xgm.hdxx.SbzlHdxxVO;
import com.example.cloud.company.common.vo.xgm.xml.HXZGSB00044Response;
import com.example.cloud.company.common.vo.xgm.xml.HXZGSB00789Response;
import com.example.cloud.company.service.sb.xgm.IZzsXgmhdxxService;
import com.example.cloud.service.base.vo.ResultVo;
import com.example.cloud.service.util.FileUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;


@Service(value = "zzsXgmhdxxService")
public class ZzsXgmhdxxServiceImpl implements IZzsXgmhdxxService {

    private static final Logger LOG = Logger.getLogger(ZzsXgmhdxxServiceImpl.class);

    /***
     *
     * @param djxh
     * @param multipartFile
     * @return
     * @throws Exception
     */
    public ResultVo getHXZGSB44Response(String djxh, MultipartFile multipartFile) throws Exception {
        if (multipartFile == null) {
            return ResultVo.valueOfSuccess("获取核定数据失败！");
        }
        File file = FileUtil.multipartFileToFile(multipartFile);
        String requestXml = FileUtil.ResolveJsonFileToString(file.getName());
        requestXml = JSONObject.toJSONString(requestXml);
        requestXml = JSONObject.parse(requestXml).toString();
        ResultVo resultVo = Gt3EJBTool.sendSbqcsCxRequestXml(djxh, HXZGSB00044Response.class, requestXml);
        if (!resultVo.isSuccess()) {
            return ResultVo.valueOfSuccess("获取核定数据失败！");
        }
        HXZGSB00044Response hxzgsb00044Response = (HXZGSB00044Response) resultVo.getValue();
//        LOG.debug("HXZGSB00044Response:【" + JSONObject.toJSONString(hxzgsb00044Response) + "】");
        System.out.println("HXZGSB00044Response:【" + JSONObject.toJSONString(hxzgsb00044Response) + "】");
        return resultVo;
    }

    /***
     *
     * @param djxh
     * @param multipartFile
     * @return
     * @throws Exception
     */
    @Override
    public ResultVo getHXZGSB789Response(String djxh, MultipartFile multipartFile) throws Exception {
        if (multipartFile == null) {
            return ResultVo.valueOfSuccess("获取核定数据失败！");
        }
        File file = FileUtil.multipartFileToFile(multipartFile);
        String requestXml = FileUtil.ResolveJsonFileToString(file.getName());
        ResultVo resultVo = Gt3EJBTool.sendSbqcsCxRequestXml(djxh, HXZGSB00789Response.class, requestXml);
        if (!resultVo.isSuccess()) {
            return ResultVo.valueOfSuccess("获取核定数据失败！");
        }
        HXZGSB00789Response hxzgsb00789Response = (HXZGSB00789Response) resultVo.getValue();
        LOG.debug("HXZGSB00789Response:【" + JSONObject.toJSONString(hxzgsb00789Response) + "】");
        return resultVo;
    }

    @Override
    public ResultVo getHXZGxxsj(String djxh) throws Exception {
        ResultVo resultVo = getHXZGSB44Response(djxh, null);
        if (!resultVo.isSuccess()) {
            return ResultVo.valueOfSuccess("获取核定数据失败！");
        }
        HXZGSB00044Response hxzgsb00044Response = (HXZGSB00044Response) resultVo.getValue();
        SbzlHdxxVO sbzlHdxxVO = new SbzlHdxxVO();
        ZzsXgmSbConvert zzsXgmSbConvert = new ZzsXgmSbConvert();
        HdxxSbzlResponseVo hdxxSbzlResponseVo = zzsXgmSbConvert.convertVo(hxzgsb00044Response, sbzlHdxxVO);
        return ResultVo.valueOfSuccess(hdxxSbzlResponseVo);
    }
}
