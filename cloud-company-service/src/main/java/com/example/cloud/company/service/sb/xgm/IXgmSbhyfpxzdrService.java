package com.example.cloud.company.service.sb.xgm;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.multipart.MultipartFile;

public interface IXgmSbhyfpxzdrService {
    /***
     *
     * @return
     */
    Workbook getHyfpdc(String djxh);

    /***
     *
     * @param djxh
     * @param multipartFile
     * @return
     */
    Object getHyfpdr(String djxh, MultipartFile multipartFile);
}
