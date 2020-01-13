package com.example.cloud.company.common.build.xgm.qcxml;


import com.example.cloud.common.config.Logger;
import com.example.cloud.company.common.vo.base.BondeAPI;
import com.example.cloud.company.common.vo.xgm.hdxx.DetailFileVo;

import java.util.Iterator;
import java.util.List;

@BondeAPI(
        name = "申报报文处理工具类",
        type = "0204",
        weight = "B"
)
public class SbbwUtil {
    private static Logger log = Logger.getLogger(SbbwUtil.class);

    public SbbwUtil() {
    }

    public static String spliceSbzb(List<DetailFileVo> detailFileList) {
        StringBuilder sb = new StringBuilder();

        try {
            String content = null;
            Iterator var3 = detailFileList.iterator();

            while(var3.hasNext()) {
                DetailFileVo df = (DetailFileVo)var3.next();
                content = new String(df.getDetailFile(), "UTF-8");
                sb.append(content);
            }
        } catch (Exception var5) {
            log.error("拼接报文异常：" + var5);
            return "";
        }

        return sb.toString();
    }

    public static String spliceSbbw(String type, String fileName, String djxh, String hyDm, String content) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<taxML xsi:type=\"");
        sb.append(type);
        sb.append("\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
        sb.append(fileName);
        sb.append("\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid></sbxxGrid><jmxxGrid></jmxxGrid><yjxxGrid></yjxxGrid><sbbcTjqtxxVO><djxh>");
        sb.append(djxh);
        sb.append("</djxh><zxbztzsuuid></zxbztzsuuid><qzdbz>Y</qzdbz><scenceCs></scenceCs><hyDm>");
        sb.append(hyDm);
        sb.append("</hyDm></sbbcTjqtxxVO>");
        sb.append(content).append("</taxML>");
        return sb.toString();
    }

    public static String spliceSbbw(String type, String fileName, String djxh, String hyDm, String content, String sfyczb) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<taxML xsi:type=\"");
        sb.append(type);
        sb.append("\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
        sb.append(fileName);
        sb.append("\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid></sbxxGrid><jmxxGrid></jmxxGrid><yjxxGrid></yjxxGrid><sbbcTjqtxxVO><djxh>");
        sb.append(djxh);
        sb.append("</djxh><zxbztzsuuid></zxbztzsuuid><qzdbz>Y</qzdbz><scenceCs></scenceCs><hyDm>");
        sb.append(hyDm);
        sb.append("</hyDm>");
        sb.append("<sfyczb>");
        sb.append(sfyczb);
        sb.append("</sfyczb>");
        sb.append("</sbbcTjqtxxVO>");
        sb.append(content).append("</taxML>");
        return sb.toString();
    }

//    public static String spliceSbbw(String type, String fileName, NsrxxVO nsrxxVO, String content, boolean needZzsbd) {
//        StringBuffer sb = new StringBuffer();
//        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//        sb.append("<taxML xsi:type=\"");
//        sb.append(type);
//        sb.append("\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
//        sb.append(fileName);
//        sb.append("\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid></sbxxGrid><jmxxGrid></jmxxGrid><yjxxGrid></yjxxGrid><sbbcTjqtxxVO><djxh>");
//        sb.append(nsrxxVO.getDjxh());
//        sb.append("</djxh><zxbztzsuuid></zxbztzsuuid><qzdbz>Y</qzdbz><scenceCs></scenceCs><hyDm>");
//        sb.append(nsrxxVO.getHyDm());
//        sb.append("</hyDm>");
//        if (needZzsbd) {
//            String sfyczb = SystemParamClient.getSystemParam("SFYCZB");
//            if (StringUtil.isNullString(sfyczb)) {
//                sfyczb = "S";
//            }
//
//            sb.append("<sfyczb>");
//            sb.append(sfyczb);
//            sb.append("</sfyczb>");
//        }
//
//        sb.append("</sbbcTjqtxxVO>");
//        sb.append(content).append("</taxML>");
//        return sb.toString();
//    }

    public static String spliceSbbw4Qt(String type, String fileName, String djxh, String hyDm, String content) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<taxML xsi:type=\"");
        sb.append(type);
        sb.append("\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
        sb.append(fileName);
        sb.append("\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid></sbxxGrid><jmxxGrid></jmxxGrid><yjxxGrid></yjxxGrid><sbSBbcTjqtxxVO><djxh>");
        sb.append(djxh);
        sb.append("</djxh><zxbztzsuuid></zxbztzsuuid><qzdbz>Y</qzdbz><scenceCs></scenceCs><hyDm>");
        sb.append(hyDm);
        sb.append("</hyDm></sbSBbcTjqtxxVO>");
        sb.append(content).append("</taxML>");
        return sb.toString();
    }

    public static String spliceSbZzsYbnsrbw(String type, String fileName, String djxh, String hyDm, String content) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<taxML xsi:type=\"");
        sb.append(type);
        sb.append("\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
        sb.append(fileName);
        sb.append("\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid></sbxxGrid><jmxxGrid></jmxxGrid><yjxxGrid></yjxxGrid><SBSBbcTjqtxxVO><djxh>");
        sb.append(djxh);
        sb.append("</djxh><zxbztzsuuid></zxbztzsuuid><qzdbz>Y</qzdbz><scenceCs></scenceCs><hyDm>");
        sb.append(hyDm);
        sb.append("</hyDm></SBSBbcTjqtxxVO>");
        sb.append(content).append("</taxML>");
        return sb.toString();
    }

    public static String spliceSbZzsYbnsrbw(String type, String fileName, String djxh, String hyDm, String content, String sfyczb) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<taxML xsi:type=\"");
        sb.append(type);
        sb.append("\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
        sb.append(fileName);
        sb.append("\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid></sbxxGrid><jmxxGrid></jmxxGrid><yjxxGrid></yjxxGrid><SBSBbcTjqtxxVO><djxh>");
        sb.append(djxh);
        sb.append("</djxh><zxbztzsuuid></zxbztzsuuid><qzdbz>Y</qzdbz><scenceCs></scenceCs><hyDm>");
        sb.append(hyDm);
        sb.append("</hyDm>");
        sb.append("<sfyczb>");
        sb.append(sfyczb);
        sb.append("</sfyczb>");
        sb.append("</SBSBbcTjqtxxVO>");
        sb.append(content).append("</taxML>");
        return sb.toString();
    }

//    public static String spliceSbZzsYbnsrbw(String type, String fileName, NsrxxVO nsrxxVO, String content, boolean neddZzsbd) {
//        StringBuffer sb = new StringBuffer();
//        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//        sb.append("<taxML xsi:type=\"");
//        sb.append(type);
//        sb.append("\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
//        sb.append(fileName);
//        sb.append("\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid></sbxxGrid><jmxxGrid></jmxxGrid><yjxxGrid></yjxxGrid><SBSBbcTjqtxxVO><djxh>");
//        sb.append(nsrxxVO.getDjxh());
//        sb.append("</djxh><zxbztzsuuid></zxbztzsuuid><qzdbz>Y</qzdbz><scenceCs></scenceCs><hyDm>");
//        sb.append(nsrxxVO.getHyDm());
//        sb.append("</hyDm>");
//        if (neddZzsbd) {
//            String sfyczb = SystemParamClient.getSystemParam("SFYCZB");
//            if (StringUtil.isNullString(sfyczb)) {
//                sfyczb = "S";
//            }
//
//            sb.append("<sfyczb>");
//            sb.append(sfyczb);
//            sb.append("</sfyczb>");
//        }
//
//        sb.append("</SBSBbcTjqtxxVO>");
//        sb.append(content).append("</taxML>");
//        return sb.toString();
//    }

    public static String spliceQysdsASbbw(String type, String fileName, String djxh, String hyDm, String content, String scenceCs) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<taxML xsi:type=\"");
        sb.append(type);
        sb.append("\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
        sb.append(fileName);
        sb.append("\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid></sbxxGrid><jmxxGrid></jmxxGrid><yjxxGrid></yjxxGrid><sbSBbcTjqtxxVO><djxh>");
        sb.append(djxh);
        sb.append("</djxh><zxbztzsuuid></zxbztzsuuid><qzdbz>Y</qzdbz><scenceCs>");
        sb.append(scenceCs);
        sb.append("</scenceCs><hyDm>");
        sb.append(hyDm);
        sb.append("</hyDm></sbSBbcTjqtxxVO>");
        sb.append(content).append("</taxML>");
        return sb.toString();
    }
}

