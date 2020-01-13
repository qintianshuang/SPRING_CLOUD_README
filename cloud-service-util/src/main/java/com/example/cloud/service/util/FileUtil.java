package com.example.cloud.service.util;

import com.example.cloud.common.config.Logger;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public class FileUtil {

    private static final Logger LOG = Logger.getLogger(FileUtil.class);

    /**
     * MultipartFile 转 File
     * @param file
     * @throws Exception
     */
    public static File multipartFileToFile(MultipartFile file) throws Exception {
        File toFile = null;
        if (file.equals("") || file.getSize() <= 0) {
            file = null;
        } else {
            InputStream ins = null;
            ins = file.getInputStream();
            toFile = new File(file.getOriginalFilename());
            inputStreamToFile(ins, toFile);
            ins.close();
        }
        return toFile;
    }

    //获取流文件
    private static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除本地临时文件
     * @param file
     */
    public static void delteTempFile(File file) {
        if (file != null) {
            File del = new File(file.toURI());
            del.delete();
        }
    }

    /**
     *  通过文件名获取获取json格式字符串，
     * @param filename 文件存放路径与配置文件路径规范一致
     * @return ResolveJsonFileToString
     * @throws
     */
    public static String ResolveJsonFileToString(String filename){

        BufferedReader br = null;
        String result = null;
        try {
            br = new BufferedReader(new InputStreamReader(getResFileStream(filename),"UTF-8"));
            StringBuffer message=new StringBuffer();
            String line = null;
            while((line = br.readLine()) != null) {
                message.append(line);
            }
            if (br != null) {
                br.close();
            }
            String defaultString=message.toString();
            result = defaultString;
//            result=defaultString.replace("\r\n", "").replaceAll(" +", "");
            LOG.info("result={}"+result);

        } catch (IOException e) {
            try {
                ClassLoader classloader = Thread.currentThread().getContextClassLoader();
                InputStream in = classloader.getResourceAsStream(filename);
                br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
                StringBuffer message=new StringBuffer();
                String line = null;
                while((line = br.readLine()) != null) {
                    message.append(line);
                }
                if (br != null) {
                    br.close();
                }
                if (in != null){
                    in.close();
                }
                String defaultString=message.toString();
                result=defaultString.replace("\r\n", "").replaceAll(" +", "");
                LOG.debug("for jar result={}"+result);
            }catch (Exception e1){
                e1.printStackTrace();
            }

        }

        return result;
    }



    private static File getResFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if (!file.exists()) { // 如果同级目录没有，则去config下面找
            LOG.debug("不在同级目录，进入config目录查找");
            file = new File("config/"+filename);
        }
        Resource resource = new FileSystemResource(file);
        if (!resource.exists()) { //config目录下还是找不到，那就直接用classpath下的
            LOG.debug("不在config目录，进入classpath目录查找");
            file = ResourceUtils.getFile("classpath:"+filename);
        }
        return file;
    }

    /**
     *  通过文件名获取classpath路径下的文件流
     * @param
     * @return
     * @throws
     */
    private static FileInputStream getResFileStream(String filename) throws FileNotFoundException {
        FileInputStream fin = null;
        File file = getResFile(filename);
        LOG.info("getResFile path={}"+file);
        fin = new FileInputStream(file);
        return fin;
    }
}
