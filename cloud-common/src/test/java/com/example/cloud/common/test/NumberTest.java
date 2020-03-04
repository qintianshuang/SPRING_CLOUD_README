package com.example.cloud.common.test;

import com.example.cloud.common.util.NumberUtil;
import org.junit.Test;

import java.math.BigDecimal;

public class NumberTest {

    @Test
    public void numberTest() {
//        String value = " 7.557006804684265498646843e+3 ";
//        String value = "10214403000001239434SXA031901022";
//        String value = "Y";
//        String value = "/>.,+";
        String value = null;
        boolean eNnum = NumberUtil.isENnum(value);
        System.out.println(eNnum);
        if (eNnum) {
            value = value.replace(" ", "");
            System.out.println(value);
            BigDecimal bigDecimal = new BigDecimal(value);
            System.out.println(bigDecimal);
        } else {
            System.out.println("不是科学计数法！！！");
        }
    }

    @Test
    public void test2() {
        String url = "qwerqw";
        int i = url.indexOf(url);
        System.out.println(i);
    }

    @Test
    public void test3() {
        String s = "2020030200002";
        BigDecimal bigDecimal = new BigDecimal(s);
        BigDecimal b = new BigDecimal("1");
        BigDecimal add = bigDecimal.add(b);
        System.out.println(add);
    }
}
