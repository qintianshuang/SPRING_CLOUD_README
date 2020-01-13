package com.example.cloud.company.num;

import com.example.cloud.company.common.build.xgm.qcxml.ArithUtil;
import com.example.cloud.company.common.enums.SbjyCodeEnum;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.ZzsxgmGridlbVO;
import org.junit.Test;

import java.math.BigDecimal;

public class NumberTest {

    @Test
    public void test() {
        double a = 1619500000065.04;
        double b = 0.0;
        double c = 16195065.049;
        double round = ArithUtil.round(ArithUtil.add(a, b), 2);
        System.out.println(round);
        System.out.println(new BigDecimal(round));

        if (a == round) {
            System.out.println("=======相等=======");
        }
        String roundStr = ArithUtil.roundStr(a, 2);
        System.out.println("roundStr:[" + roundStr + "]");

//        String doubleToStr = getDoubleToStr(a);
//        System.out.println("doubleToStr" + doubleToStr);
    }

    /***
     * Double 转化为 字符串
     * 避免成为科学计数法
     * 避免小数位过长
     * @param d
     * @return
     */
    public String getDoubleToStr(double d) {
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(2, 4);
        return bigDecimal.toString();
    }


    @Test
    public void test2() {
        double qzdse = 300000.01;
        SbjyCodeEnum sbjyCodeEnum = SbjyCodeEnum.YSHWLW_CSWHJSF_CODE;
        double qzd = Double.parseDouble(SbjyCodeEnum.QZD_30W_CODE.getDesc());
        if (SbjyCodeEnum.YSFW_CSWHJSF_CODE != sbjyCodeEnum && SbjyCodeEnum.YSHWLW_CSWHJSF_CODE != sbjyCodeEnum && qzdse <= qzd) {
            System.out.println("=========" + sbjyCodeEnum.getName() + "未达" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "不用判断===========");
        } else {
            System.out.println("=========" + sbjyCodeEnum.getName() + "达到" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "需要判断===========");
        }
        sbjyCodeEnum = SbjyCodeEnum.YSHWLW_JYFFJ_CODE;
        if (SbjyCodeEnum.YSFW_CSWHJSF_CODE != sbjyCodeEnum && SbjyCodeEnum.YSHWLW_CSWHJSF_CODE != sbjyCodeEnum && qzdse <= qzd) {
            System.out.println("=========" + sbjyCodeEnum.getName() + "未达" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "不用判断===========");
        } else {
            System.out.println("=========" + sbjyCodeEnum.getName() + "达到" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "需要判断===========");
        }
        sbjyCodeEnum = SbjyCodeEnum.YSHWLW_DFJYFJ_CODE;
        if (SbjyCodeEnum.YSFW_CSWHJSF_CODE != sbjyCodeEnum && SbjyCodeEnum.YSHWLW_CSWHJSF_CODE != sbjyCodeEnum && qzdse <= qzd) {
            System.out.println("=========" + sbjyCodeEnum.getName() + "未达" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "不用判断===========");
        } else {
            System.out.println("=========" + sbjyCodeEnum.getName() + "达到" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "需要判断===========");
        }
        sbjyCodeEnum = SbjyCodeEnum.YSFW_CSWHJSF_CODE;
        if (SbjyCodeEnum.YSFW_CSWHJSF_CODE != sbjyCodeEnum && SbjyCodeEnum.YSHWLW_CSWHJSF_CODE != sbjyCodeEnum && qzdse <= qzd) {
            System.out.println("=========" + sbjyCodeEnum.getName() + "未达" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "不用判断===========");
        } else {
            System.out.println("=========" + sbjyCodeEnum.getName() + "达到" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "需要判断===========");
        }
        sbjyCodeEnum = SbjyCodeEnum.YSFW_JYFFJ_CODE;
        if (SbjyCodeEnum.YSFW_CSWHJSF_CODE != sbjyCodeEnum && SbjyCodeEnum.YSHWLW_CSWHJSF_CODE != sbjyCodeEnum && qzdse <= qzd) {
            System.out.println("=========" + sbjyCodeEnum.getName() + "未达" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "不用判断===========");
        } else {
            System.out.println("=========" + sbjyCodeEnum.getName() + "达到" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "需要判断===========");
        }
        sbjyCodeEnum = SbjyCodeEnum.YSFW_DFJYFJ_CODE;
        if (SbjyCodeEnum.YSFW_CSWHJSF_CODE != sbjyCodeEnum && SbjyCodeEnum.YSHWLW_CSWHJSF_CODE != sbjyCodeEnum && qzdse <= qzd) {
            System.out.println("=========" + sbjyCodeEnum.getName() + "未达" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "不用判断===========");
        } else {
            System.out.println("=========" + sbjyCodeEnum.getName() + "达到" + SbjyCodeEnum.QZD_30W_CODE.getDesc() + "需要判断===========");
        }
    }

    @Test
    public void getDoubleToStr() {
        String djxh = "10114403000026154877";
        ZzsxgmGridlbVO zzsxgmGridlb2VO = new ZzsxgmGridlbVO();
        ZzsxgmGridlbVO zzsxgmGridlb4VO = new ZzsxgmGridlbVO();
        zzsxgmGridlb2VO.setYzzzsbhsxse(1111);
        zzsxgmGridlb4VO.setYzzzsbhsxse(1111);
        BigDecimal bigDecimal = new BigDecimal(0);
        double bnljYzzzsbhsxse3 = ArithUtil.round(zzsxgmGridlb2VO.getYzzzsbhsxse()
                + bigDecimal.doubleValue(), 2);
        System.out.println(bnljYzzzsbhsxse3);
        System.out.println("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第1栏第4列本年累计值" +
                "【" + zzsxgmGridlb4VO.getYzzzsbhsxse() + "】应该等于第1栏第2列本期销售额【"
                + ArithUtil.roundStr(zzsxgmGridlb2VO.getYzzzsbhsxse(), 2) + "】" +
                " + 上期应税货物劳务第1栏第4列本年累计值【" + bigDecimal + "】的和" +
                "【" + ArithUtil.roundStr(bnljYzzzsbhsxse3, 2) + "】，请检查申报表数据是否正确。");
    }

    @Test
    public void test4() {
        double d = 2.0E7;
        String fff = ArithUtil.roundStr(d, 2);
        System.out.println(fff);
    }
}
