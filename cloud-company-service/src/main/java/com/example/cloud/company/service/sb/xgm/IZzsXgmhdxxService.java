package com.example.cloud.company.service.sb.xgm;

import com.example.cloud.service.base.vo.ResultVo;
import org.springframework.web.multipart.MultipartFile;

public interface IZzsXgmhdxxService {

    /***
     *
     * @param djxh
     * @param multipartFile
     * @return
     * @throws Exception
     */
    public ResultVo getHXZGSB44Response(String djxh, MultipartFile multipartFile) throws Exception;

    /***
     *
     * @param djxh
     * @param multipartFile
     * @return
     * @throws Exception
     */
    public ResultVo getHXZGSB789Response(String djxh, MultipartFile multipartFile) throws Exception;


    /***
     *
     * @return
     */
    public ResultVo getHXZGxxsj(String djxh) throws Exception;
}
