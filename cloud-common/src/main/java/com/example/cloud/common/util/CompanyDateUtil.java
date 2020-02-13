package com.example.cloud.common.util;

import com.example.cloud.common.config.Logger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompanyDateUtil {

    private final static Logger log = Logger.getLogger(CompanyDateUtil.class);

    public static String getLastDayOfMonth(String dateStr, String informat, String outformat) {
        String lastDateStr = "";
        DateFormat indf = new SimpleDateFormat(informat);
        SimpleDateFormat outdf = new SimpleDateFormat(outformat);

        try {
            Date date = indf.parse(dateStr);
            Calendar ca = Calendar.getInstance();
            ca.setTime(date);
            ca.set(5, 1);
            ca.add(2, 1);
            ca.add(5, -1);
            Date lastDate = ca.getTime();
            lastDateStr = outdf.format(lastDate);
        } catch (ParseException var9) {
            log.error(var9.getMessage(), var9);
        }
        log.info("当前所在月最后一天(公司的方法)为【" + lastDateStr + "】");
        return lastDateStr;
    }

    public static boolean isDateBefore(String date, String formatType) throws Exception, ParseException {
        if (!StringKit.isBlank(new String[]{date}) && !StringKit.isBlank(new String[]{formatType})) {
            Date systemDate = new Date();
            DateFormat df = new SimpleDateFormat(formatType);
            String result = df.format(df.parse(date));
            if (date.startsWith(result)) {
                return df.format(systemDate).equals(df.format(df.parse(date))) ? false : systemDate.after(df.parse(date));
            } else {
                throw new IllegalArgumentException(String.format("错误的日期参数：%1$s，不满足[%2$s]格式要求", date, formatType));
            }
        } else {
            return false;
        }
    }
}
