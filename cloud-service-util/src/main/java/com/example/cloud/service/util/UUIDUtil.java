package com.example.cloud.service.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class UUIDUtil {

    /***
     * 随机编号
     * @return
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }

    /***
     * 随机编号
     * @return
     */
    public static String getUUIDByXtcs(String xh) {
        String uuid = "";
        if (StringUtils.isEmpty(xh)) {
            uuid = DateUtil.format(new Date(), "yyyyMMdd") + "00001";
        } else {
            BigDecimal bigDecimal = new BigDecimal(xh);
            BigDecimal add = bigDecimal.add(new BigDecimal("1"));
            uuid = add.toString();
        }
        return uuid;
    }

    public static void main(String[] args) {
        String uuidByDate = getUUIDByXtcs("222");
        System.out.println(uuidByDate);
    }
}
