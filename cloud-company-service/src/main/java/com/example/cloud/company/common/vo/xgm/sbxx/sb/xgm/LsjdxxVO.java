package com.example.cloud.company.common.vo.xgm.sbxx.sb.xgm;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.company.common.vo.base.BaseVO;
import com.example.cloud.company.common.vo.xgm.hdxx.LsxxVo;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LsjdxxVO extends BaseVO {
    private static final long serialVersionUID = 1L;

    private static final Logger LOG = Logger.getLogger(LsjdxxVO.class);


    /*-----------------------------------------------------货物劳务----------------------------------------*/
    //第1栏：应征增值税不含税销售额（3%征收率）
    BigDecimal yzzzsbhsxse3;
    //第2栏：税务机关代开的增值税专用票不含税销售额
    BigDecimal swjgdkdzzszyfpbhsxse3;
    //第3栏：税控器具开具的普通发票不含 税销售额
    BigDecimal skqjkjdptfpbhsxse3;
    //    //第4栏：应征增值税不含税销售额（5%征收率）
//    BigDecimal xsczbdcbhsxse3;
//    //第5栏：税务机关代开的增值税专用发票不含税销售额
//    BigDecimal swjgdkdzzszyfpbhsxse13;
//    //第6栏：税控器具开具的普通发票不含税销售额
//    BigDecimal skqjkjdptfpbhsxse23;
    //第7栏：销售使用过的固定资产不含税销售额
    BigDecimal xssygdysgdzcbhsxse3;
    //第8栏：其中：税控器具开具的普通发票不含税销售额
    BigDecimal skqjkjdptfpbhsxse13;
    //第9栏：免税销售额
    BigDecimal msxse3;
    //第10栏：其中：小微企业免税销售额
    BigDecimal xwqymsxse3;
    //第11栏：未达起征点销售额
    BigDecimal wdqzdxse3;
    //第12栏：其他免税销售额
    BigDecimal qtmsxse3;
    //第13栏：出口免税销售额
    BigDecimal ckmsxse3;
    //第14栏：其中：税控器具开具的普通发票销售额
    BigDecimal skqjkjdptfpxse13;
    //第15栏：核定销售额
    BigDecimal hdxse3;
    //第16栏：本期应纳税额
    BigDecimal bqynse3;
    //第17栏：核定应纳税额
    BigDecimal hdynse3;
    //第18栏：本期应纳税额减征额
    BigDecimal bqynsejze3;
    //第19栏：本期免税额
    BigDecimal bqmse3;
    //第20栏：其中：小微企业免税额
    BigDecimal xwqymse3;
    //第21栏：未达起征点免税额
    BigDecimal wdqzdmse3;
    //第22栏：应纳税额合计
    BigDecimal ynsehj3;
//    //第23栏：本期预缴税额
//    double bqyjse13;
//    //第24栏：本期应补（退）税额
//    double bqybtse3;

    /*-----------------------------------------------------服务、不动产和无形资产----------------------------------------*/
    //第1栏：应征增值税不含税销售额（3%征收率）
    BigDecimal yzzzsbhsxse4;
    //第2栏：税务机关代开的增值税专用票不含税销售额
    BigDecimal swjgdkdzzszyfpbhsxse4;
    //第3栏：税控器具开具的普通发票不含 税销售额
    BigDecimal skqjkjdptfpbhsxse4;
    //第4栏：应征增值税不含税销售额（5%征收率）
    BigDecimal xsczbdcbhsxse4;
    //第5栏：税务机关代开的增值税专用发票不含税销售额
    BigDecimal swjgdkdzzszyfpbhsxse14;
    //第6栏：税控器具开具的普通发票不含税销售额
    BigDecimal skqjkjdptfpbhsxse24;
    //    //第7栏：销售使用过的固定资产不含税销售额
//    BigDecimal xssygdysgdzcbhsxse4;
//    //第8栏：其中：税控器具开具的普通发票不含税销售额
//    BigDecimal skqjkjdptfpbhsxse14;
    //第9栏：免税销售额
    BigDecimal msxse4;
    //第10栏：其中：小微企业免税销售额
    BigDecimal xwqymsxse4;
    //第11栏：未达起征点销售额
    BigDecimal wdqzdxse4;
    //第12栏：其他免税销售额
    BigDecimal qtmsxse4;
    //第13栏：出口免税销售额
    BigDecimal ckmsxse4;
    //第14栏：其中：税控器具开具的普通发票销售额
    BigDecimal skqjkjdptfpxse14;
    //第15栏：核定销售额
    BigDecimal hdxse4;
    //第16栏：本期应纳税额
    BigDecimal bqynse4;
    //第17栏：核定应纳税额
    BigDecimal hdynse4;
    //第18栏：本期应纳税额减征额
    BigDecimal bqynsejze4;
    //第19栏：本期免税额
    BigDecimal bqmse4;
    //第20栏：其中：小微企业免税额
    BigDecimal xwqymse4;
    //第21栏：未达起征点免税额
    BigDecimal wdqzdmse4;
    //第22栏：应纳税额合计
    BigDecimal ynsehj4;

    private final static Map<Integer, String> map;


    static {
        map = new HashMap<>();
        //货物
        map.put(1, "yzzzsbhsxse3");
        map.put(2, "swjgdkdzzszyfpbhsxse3");
        map.put(3, "skqjkjdptfpbhsxse3");
        map.put(7, "xssygdysgdzcbhsxse3");
        map.put(8, "skqjkjdptfpbhsxse13");
        map.put(9, "msxse3");
        map.put(10, "xwqymsxse3");
        map.put(11, "wdqzdxse3");
        map.put(12, "qtmsxse3");
        map.put(13, "ckmsxse3");
        map.put(14, "skqjkjdptfpxse13");
        map.put(45, "hdxse3");
        map.put(15, "bqynse3");
        map.put(46, "hdynse3");
        map.put(16, "bqynsejze3");
        map.put(17, "bqmse3");
        map.put(18, "xwqymse3");
        map.put(19, "wdqzdmse3");
        map.put(20, "ynsehj3");

        //服务
        map.put(23, "yzzzsbhsxse4");
        map.put(24, "swjgdkdzzszyfpbhsxse4");
        map.put(25, "skqjkjdptfpbhsxse4");
        map.put(26, "xsczbdcbhsxse4");
        map.put(27, "swjgdkdzzszyfpbhsxse14");
        map.put(28, "skqjkjdptfpbhsxse24");
        map.put(31, "msxse4");
        map.put(32, "xwqymsxse4");
        map.put(33, "wdqzdxse4");
        map.put(34, "qtmsxse4");
        map.put(35, "ckmsxse4");
        map.put(36, "skqjkjdptfpxse14");
        map.put(47, "hdxse4");
        map.put(37, "bqynse4");
        map.put(48, "hdynse4");
        map.put(38, "bqynsejze4");
        map.put(39, "bqmse4");
        map.put(40, "xwqymse4");
        map.put(41, "wdqzdmse4");
        map.put(42, "ynsehj4");
    }

    public static ResultVo getLshdqcxx1(String djxh, List<LsxxVo> lsxxVoList) {
        LOG.info("====登记序号===【" + djxh + "】====从核定中提取 lsxxVoList 【" + JSONObject.toJSONString(lsxxVoList) + "】");
        if (CollectionUtils.isEmpty(lsxxVoList)) {
            return ResultVo.valueOfSuccess("获取核定信息失败!");
        }
        LsjdxxVO lsjdxxVO = new LsjdxxVO();
        BigDecimal value;
        for (int i = 0; i < lsxxVoList.size(); i++) {
            if (StringUtils.isBlank(lsxxVoList.get(i).getCODE())) {
                continue;
            }
            if (StringUtils.isBlank(map.get(i + 1))) {
                continue;
            }
            try {
                if (StringUtils.isBlank(lsxxVoList.get(i).getVALUE())) {
                    value = new BigDecimal("0");
                } else {
                    value = new BigDecimal(lsxxVoList.get(i).getVALUE());
                }
                BeanUtils.setProperty(lsjdxxVO, map.get(i + 1), value);
            } catch (Exception e) {
                LOG.error("====登记序号===【" + djxh + "】====数值类型转换异常====具体参数【lsxxVo】为【" + JSONObject.toJSONString(lsxxVoList.get(i)) + "】");
                continue;
            }
        }
        return ResultVo.valueOfSuccess(lsjdxxVO);
    }

    public BigDecimal getYzzzsbhsxse3() {
        return yzzzsbhsxse3;
    }

    public void setYzzzsbhsxse3(BigDecimal yzzzsbhsxse3) {
        this.yzzzsbhsxse3 = yzzzsbhsxse3;
    }

    public BigDecimal getSwjgdkdzzszyfpbhsxse3() {
        return swjgdkdzzszyfpbhsxse3;
    }

    public void setSwjgdkdzzszyfpbhsxse3(BigDecimal swjgdkdzzszyfpbhsxse3) {
        this.swjgdkdzzszyfpbhsxse3 = swjgdkdzzszyfpbhsxse3;
    }

    public BigDecimal getSkqjkjdptfpbhsxse3() {
        return skqjkjdptfpbhsxse3;
    }

    public void setSkqjkjdptfpbhsxse3(BigDecimal skqjkjdptfpbhsxse3) {
        this.skqjkjdptfpbhsxse3 = skqjkjdptfpbhsxse3;
    }

    public BigDecimal getXssygdysgdzcbhsxse3() {
        return xssygdysgdzcbhsxse3;
    }

    public void setXssygdysgdzcbhsxse3(BigDecimal xssygdysgdzcbhsxse3) {
        this.xssygdysgdzcbhsxse3 = xssygdysgdzcbhsxse3;
    }

    public BigDecimal getSkqjkjdptfpbhsxse13() {
        return skqjkjdptfpbhsxse13;
    }

    public void setSkqjkjdptfpbhsxse13(BigDecimal skqjkjdptfpbhsxse13) {
        this.skqjkjdptfpbhsxse13 = skqjkjdptfpbhsxse13;
    }

    public BigDecimal getMsxse3() {
        return msxse3;
    }

    public void setMsxse3(BigDecimal msxse3) {
        this.msxse3 = msxse3;
    }

    public BigDecimal getXwqymsxse3() {
        return xwqymsxse3;
    }

    public void setXwqymsxse3(BigDecimal xwqymsxse3) {
        this.xwqymsxse3 = xwqymsxse3;
    }

    public BigDecimal getWdqzdxse3() {
        return wdqzdxse3;
    }

    public void setWdqzdxse3(BigDecimal wdqzdxse3) {
        this.wdqzdxse3 = wdqzdxse3;
    }

    public BigDecimal getQtmsxse3() {
        return qtmsxse3;
    }

    public void setQtmsxse3(BigDecimal qtmsxse3) {
        this.qtmsxse3 = qtmsxse3;
    }

    public BigDecimal getCkmsxse3() {
        return ckmsxse3;
    }

    public void setCkmsxse3(BigDecimal ckmsxse3) {
        this.ckmsxse3 = ckmsxse3;
    }

    public BigDecimal getSkqjkjdptfpxse13() {
        return skqjkjdptfpxse13;
    }

    public void setSkqjkjdptfpxse13(BigDecimal skqjkjdptfpxse13) {
        this.skqjkjdptfpxse13 = skqjkjdptfpxse13;
    }

    public BigDecimal getHdxse3() {
        return hdxse3;
    }

    public void setHdxse3(BigDecimal hdxse3) {
        this.hdxse3 = hdxse3;
    }

    public BigDecimal getBqynse3() {
        return bqynse3;
    }

    public void setBqynse3(BigDecimal bqynse3) {
        this.bqynse3 = bqynse3;
    }

    public BigDecimal getHdynse3() {
        return hdynse3;
    }

    public void setHdynse3(BigDecimal hdynse3) {
        this.hdynse3 = hdynse3;
    }

    public BigDecimal getBqynsejze3() {
        return bqynsejze3;
    }

    public void setBqynsejze3(BigDecimal bqynsejze3) {
        this.bqynsejze3 = bqynsejze3;
    }

    public BigDecimal getBqmse3() {
        return bqmse3;
    }

    public void setBqmse3(BigDecimal bqmse3) {
        this.bqmse3 = bqmse3;
    }

    public BigDecimal getXwqymse3() {
        return xwqymse3;
    }

    public void setXwqymse3(BigDecimal xwqymse3) {
        this.xwqymse3 = xwqymse3;
    }

    public BigDecimal getWdqzdmse3() {
        return wdqzdmse3;
    }

    public void setWdqzdmse3(BigDecimal wdqzdmse3) {
        this.wdqzdmse3 = wdqzdmse3;
    }

    public BigDecimal getYnsehj3() {
        return ynsehj3;
    }

    public void setYnsehj3(BigDecimal ynsehj3) {
        this.ynsehj3 = ynsehj3;
    }

    public BigDecimal getYzzzsbhsxse4() {
        return yzzzsbhsxse4;
    }

    public void setYzzzsbhsxse4(BigDecimal yzzzsbhsxse4) {
        this.yzzzsbhsxse4 = yzzzsbhsxse4;
    }

    public BigDecimal getSwjgdkdzzszyfpbhsxse4() {
        return swjgdkdzzszyfpbhsxse4;
    }

    public void setSwjgdkdzzszyfpbhsxse4(BigDecimal swjgdkdzzszyfpbhsxse4) {
        this.swjgdkdzzszyfpbhsxse4 = swjgdkdzzszyfpbhsxse4;
    }

    public BigDecimal getSkqjkjdptfpbhsxse4() {
        return skqjkjdptfpbhsxse4;
    }

    public void setSkqjkjdptfpbhsxse4(BigDecimal skqjkjdptfpbhsxse4) {
        this.skqjkjdptfpbhsxse4 = skqjkjdptfpbhsxse4;
    }

    public BigDecimal getXsczbdcbhsxse4() {
        return xsczbdcbhsxse4;
    }

    public void setXsczbdcbhsxse4(BigDecimal xsczbdcbhsxse4) {
        this.xsczbdcbhsxse4 = xsczbdcbhsxse4;
    }

    public BigDecimal getSwjgdkdzzszyfpbhsxse14() {
        return swjgdkdzzszyfpbhsxse14;
    }

    public void setSwjgdkdzzszyfpbhsxse14(BigDecimal swjgdkdzzszyfpbhsxse14) {
        this.swjgdkdzzszyfpbhsxse14 = swjgdkdzzszyfpbhsxse14;
    }

    public BigDecimal getSkqjkjdptfpbhsxse24() {
        return skqjkjdptfpbhsxse24;
    }

    public void setSkqjkjdptfpbhsxse24(BigDecimal skqjkjdptfpbhsxse24) {
        this.skqjkjdptfpbhsxse24 = skqjkjdptfpbhsxse24;
    }

    public BigDecimal getMsxse4() {
        return msxse4;
    }

    public void setMsxse4(BigDecimal msxse4) {
        this.msxse4 = msxse4;
    }

    public BigDecimal getXwqymsxse4() {
        return xwqymsxse4;
    }

    public void setXwqymsxse4(BigDecimal xwqymsxse4) {
        this.xwqymsxse4 = xwqymsxse4;
    }

    public BigDecimal getWdqzdxse4() {
        return wdqzdxse4;
    }

    public void setWdqzdxse4(BigDecimal wdqzdxse4) {
        this.wdqzdxse4 = wdqzdxse4;
    }

    public BigDecimal getQtmsxse4() {
        return qtmsxse4;
    }

    public void setQtmsxse4(BigDecimal qtmsxse4) {
        this.qtmsxse4 = qtmsxse4;
    }

    public BigDecimal getCkmsxse4() {
        return ckmsxse4;
    }

    public void setCkmsxse4(BigDecimal ckmsxse4) {
        this.ckmsxse4 = ckmsxse4;
    }

    public BigDecimal getSkqjkjdptfpxse14() {
        return skqjkjdptfpxse14;
    }

    public void setSkqjkjdptfpxse14(BigDecimal skqjkjdptfpxse14) {
        this.skqjkjdptfpxse14 = skqjkjdptfpxse14;
    }

    public BigDecimal getHdxse4() {
        return hdxse4;
    }

    public void setHdxse4(BigDecimal hdxse4) {
        this.hdxse4 = hdxse4;
    }

    public BigDecimal getBqynse4() {
        return bqynse4;
    }

    public void setBqynse4(BigDecimal bqynse4) {
        this.bqynse4 = bqynse4;
    }

    public BigDecimal getHdynse4() {
        return hdynse4;
    }

    public void setHdynse4(BigDecimal hdynse4) {
        this.hdynse4 = hdynse4;
    }

    public BigDecimal getBqynsejze4() {
        return bqynsejze4;
    }

    public void setBqynsejze4(BigDecimal bqynsejze4) {
        this.bqynsejze4 = bqynsejze4;
    }

    public BigDecimal getBqmse4() {
        return bqmse4;
    }

    public void setBqmse4(BigDecimal bqmse4) {
        this.bqmse4 = bqmse4;
    }

    public BigDecimal getXwqymse4() {
        return xwqymse4;
    }

    public void setXwqymse4(BigDecimal xwqymse4) {
        this.xwqymse4 = xwqymse4;
    }

    public BigDecimal getWdqzdmse4() {
        return wdqzdmse4;
    }

    public void setWdqzdmse4(BigDecimal wdqzdmse4) {
        this.wdqzdmse4 = wdqzdmse4;
    }

    public BigDecimal getYnsehj4() {
        return ynsehj4;
    }

    public void setYnsehj4(BigDecimal ynsehj4) {
        this.ynsehj4 = ynsehj4;
    }

    /***
     * 小规模申报转换本年累计值对象
     * @param djxh
     * @param
     * @return
     */
    public static ResultVo getLshdqcxx(String djxh, List<LsxxVo> lsxxVoList) {
        LOG.info("====登记序号===【" + djxh + "】====从核定中提取 lsxxVoList 【" + JSONObject.toJSONString(lsxxVoList) + "】");
        if (CollectionUtils.isEmpty(lsxxVoList)) {
            return ResultVo.valueOfSuccess("获取核定信息失败!");
        }
        LsjdxxVO lsxxVO = new LsjdxxVO();
        BigDecimal value = null;
        for (LsxxVo lsxxVo : lsxxVoList) {
            if (StringUtils.isBlank(lsxxVo.getCODE())) {
                continue;
            }
            try {
                if (StringUtils.isBlank(lsxxVo.getVALUE())) {
                    value = new BigDecimal("0");
                } else {
                    value = new BigDecimal(lsxxVo.getVALUE());
                }
            } catch (Exception e) {
                LOG.error("====登记序号===【" + djxh + "】====数值类型转换异常====具体参数【lsxxVo】为【" + JSONObject.toJSONString(lsxxVo) + "】");
                continue;
            }
            /*-----------------------------------------------------货物劳务----------------------------------------*/
            if ("1".equals(lsxxVo.getCODE())) {
                lsxxVO.setYzzzsbhsxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（应征增值税不含税销售额（3%征收率））" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("2".equals(lsxxVo.getCODE())) {
                lsxxVO.setSwjgdkdzzszyfpbhsxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（税务机关代开的增值税专用票不含税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("3".equals(lsxxVo.getCODE())) {
                lsxxVO.setSkqjkjdptfpbhsxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（税控器具开具的普通发票不含 税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("4".equals(lsxxVo.getCODE())) {
//                lsxxVO.setXsczbdcbhsxse3(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（应征增值税不含税销售额（5%征收率））" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("5".equals(lsxxVo.getCODE())) {
//                lsxxVO.setSwjgdkdzzszyfpbhsxse13(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（税务机关代开的增值税专用发票不含税销售额）" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("6".equals(lsxxVo.getCODE())) {
//                lsxxVO.setSkqjkjdptfpbhsxse23(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（税控器具开具的普通发票不含税销售额）" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("7".equals(lsxxVo.getCODE())) {
                lsxxVO.setXssygdysgdzcbhsxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（销售使用过的应税固定资产不含税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("8".equals(lsxxVo.getCODE())) {
                lsxxVO.setSkqjkjdptfpbhsxse13(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（其中：税控器具开具的普通发票不含税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("9".equals(lsxxVo.getCODE())) {
                lsxxVO.setMsxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（免税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("10".equals(lsxxVo.getCODE())) {
                lsxxVO.setXwqymsxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（其中：小微企业免税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("11".equals(lsxxVo.getCODE())) {
                lsxxVO.setWdqzdxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（未达起征点销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("12".equals(lsxxVo.getCODE())) {
                lsxxVO.setQtmsxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（其他免税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("13".equals(lsxxVo.getCODE())) {
                lsxxVO.setCkmsxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（出口免税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("14".equals(lsxxVo.getCODE())) {
                lsxxVO.setSkqjkjdptfpxse13(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（其中：税控器具开具的普通发票销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("15".equals(lsxxVo.getCODE())) {
                lsxxVO.setBqynse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（本期应纳税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("16".equals(lsxxVo.getCODE())) {
                lsxxVO.setBqynsejze3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（本期应纳税额减征额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("17".equals(lsxxVo.getCODE())) {
                lsxxVO.setBqmse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（本期免税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("18".equals(lsxxVo.getCODE())) {
                lsxxVO.setXwqymse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（其中：小微企业免税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：" + lsxxVo.getVALUE() + "】");
            } else if ("19".equals(lsxxVo.getCODE())) {
                lsxxVO.setWdqzdmse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（未达起征点免税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("20".equals(lsxxVo.getCODE())) {
                lsxxVO.setYnsehj3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（应纳税额合计）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("21".equals(lsxxVo.getCODE())) {
//                lsxxVO.setBqyjse13(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（本期预缴税额）" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("22".equals(lsxxVo.getCODE())) {
//                lsxxVO.setBqybtse3(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（本期应补（退）税额）" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("45".equals(lsxxVo.getCODE())) {
                lsxxVO.setHdxse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（应税货物劳务核定销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("46".equals(lsxxVo.getCODE())) {
                lsxxVO.setHdynse3(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（应税货物劳务核定应纳税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");

                /*-----------------------------------------------------服务、不动产和无形资产----------------------------------------*/
            } else if ("23".equals(lsxxVo.getCODE())) {
                lsxxVO.setYzzzsbhsxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（应征增值税不含税销售额（3%征收率））" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("24".equals(lsxxVo.getCODE())) {
                lsxxVO.setSwjgdkdzzszyfpbhsxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（税务机关代开的增值税专用票不含税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("25".equals(lsxxVo.getCODE())) {
                lsxxVO.setSkqjkjdptfpbhsxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（税控器具开具的普通发票不含 税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("26".equals(lsxxVo.getCODE())) {
                lsxxVO.setXsczbdcbhsxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（应征增值税不含税销售额（5%征收率））" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("27".equals(lsxxVo.getCODE())) {
                lsxxVO.setSwjgdkdzzszyfpbhsxse14(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（税务机关代开的增值税专用发票不含税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("28".equals(lsxxVo.getCODE())) {
                lsxxVO.setSkqjkjdptfpbhsxse24(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（税控器具开具的普通发票不含税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("29".equals(lsxxVo.getCODE())) {
//                lsxxVO.setXssygdysgdzcbhsxse4(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（销售使用过的应税固定资产不含税销售额）" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("30".equals(lsxxVo.getCODE())) {
//                lsxxVO.setSkqjkjdptfpbhsxse14(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（其中：税控器具开具的普通发票不含税销售额）" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("31".equals(lsxxVo.getCODE())) {
                lsxxVO.setMsxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（免税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("32".equals(lsxxVo.getCODE())) {
                lsxxVO.setXwqymsxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（其中：小微企业免税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("33".equals(lsxxVo.getCODE())) {
                lsxxVO.setWdqzdxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（未达起征点销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("34".equals(lsxxVo.getCODE())) {
                lsxxVO.setQtmsxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（其他免税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("35".equals(lsxxVo.getCODE())) {
                lsxxVO.setCkmsxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（出口免税销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("36".equals(lsxxVo.getCODE())) {
                lsxxVO.setSkqjkjdptfpxse14(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务本年累计（出口免税销售额_税控器具开具的普通发票销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("37".equals(lsxxVo.getCODE())) {
                lsxxVO.setBqynse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（本期应纳税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("38".equals(lsxxVo.getCODE())) {
                lsxxVO.setBqynsejze4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（本期应纳税额减征额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("39".equals(lsxxVo.getCODE())) {
                lsxxVO.setBqmse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（本期免税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("40".equals(lsxxVo.getCODE())) {
                lsxxVO.setXwqymse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（其中：小微企业免税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("41".equals(lsxxVo.getCODE())) {
                lsxxVO.setWdqzdmse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（未达起征点免税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("42".equals(lsxxVo.getCODE())) {
                lsxxVO.setYnsehj4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（应纳税额合计）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("43".equals(lsxxVo.getCODE())) {
//                lsxxVO.setBqyjse14(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（本期预缴税额）" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
//            } else if ("44".equals(lsxxVo.getCODE())) {
//                lsxxVO.setBqybtse4(value);
//                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（本期应补（退）税额）" +
//                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("47".equals(lsxxVo.getCODE())) {
                lsxxVO.setHdxse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（应税服务核定销售额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            } else if ("48".equals(lsxxVo.getCODE())) {
                lsxxVO.setHdynse4(value);
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 服务、不动产和无形资产本年累计（应税服务核定应纳税额）" +
                        "【" + lsxxVo.getCODE() + "】值为：【" + lsxxVo.getVALUE() + "】");
            }
        }
        LOG.info("====登记序号===【" + djxh + "】===从核定中提取LsjdxxVO【" + JSONObject.toJSONString(lsxxVO) + "】");
        return ResultVo.valueOfSuccess(lsxxVO);
    }
}

