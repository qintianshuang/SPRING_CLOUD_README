package com.example.cloud.company.service.sb.xgm.impl;

import com.example.cloud.company.service.sb.xgm.IXgmSbhyfpxzdrService;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service(value = "xgmSbhyfpxzdrService")
public class XgmSbhyfpxzdrServiceImpl implements IXgmSbhyfpxzdrService {

    private static final Logger LOG = Logger.getLogger(XgmSbhyfpxzdrServiceImpl.class);


    @Override
    public Workbook getHyfpdc(String djxh) {
        return null;
    }

    @Override
    public Object getHyfpdr(String djxh, MultipartFile multipartFile) {
        return null;
    }
}
