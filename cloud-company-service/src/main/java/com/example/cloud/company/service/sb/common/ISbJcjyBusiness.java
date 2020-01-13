package com.example.cloud.company.service.sb.common;

import org.springframework.web.multipart.MultipartFile;

public interface ISbJcjyBusiness {

    /***
     *
     * @param djxh
     * @param sssqq
     * @param sssqz
     * @param requestXml
     * @param wsxxXml
     * @param lsxxXml
     * @return
     */
    public Object sbJcjy(String djxh, String sssqq, String sssqz, MultipartFile requestXml, MultipartFile wsxxXml, MultipartFile lsxxXml) throws Exception;
}
