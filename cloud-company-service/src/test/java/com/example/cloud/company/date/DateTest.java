package com.example.cloud.company.date;

import com.example.cloud.company.common.build.xgm.qcxml.DateUtil;
import org.junit.Test;

import java.util.Date;

public class DateTest {

    @Test
    public void test13() {
        Date date = new Date();
        String nowTime = DateUtil.doDateFormat(date, "yyyy-MM-dd");
        int i = DateUtil.compareTwoDate(nowTime, "2020-01-01");
        String isShow = "Y";
        if (i == -1) {
            isShow = "N";
        }
        System.out.println("当前时间为:【" + nowTime + "】====是否显示:【" + isShow + "】");

        nowTime = "2019-12-31";
        i = DateUtil.compareTwoDate(nowTime, "2020-01-01");
        isShow = "Y";
        if (i == -1) {
            isShow = "N";
        }
        System.out.println("当前时间为:【" + nowTime + "】====是否显示:【" + isShow + "】");

        nowTime = "2020-01-01";
        i = DateUtil.compareTwoDate(nowTime, "2020-01-01");
        isShow = "Y";
        if (i == -1) {
            isShow = "N";
        }
        System.out.println("当前时间为:【" + nowTime + "】====是否显示:【" + isShow + "】");
    }
}
