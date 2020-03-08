package com.example.cloud.service.util;

import com.example.cloud.common.config.Logger;
import com.example.cloud.common.enums.NsqxEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.DateUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日期工具类 默认使用 "yyyy-MM-dd HH:mm:ss" 格式化日期
 */
public final class DateUtil {

    private final static Logger log = Logger.getLogger(DateUtil.class);

    /**
     * 英文简写（默认）如：2010-12-01
     */
    public static String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
    /**
     * 英文全称 如：2010-12-01 23:15:06
     */
    public static String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    /**
     * 精确到毫秒的完整时间 如：yyyy-MM-dd HH:mm:ss.S
     */
    public static String FORMAT_YYYY_MM_DD_HH_MM_SS_S = "yyyyMMddHHmmssS";
    /**
     * 中文简写 如：2010年12月01日
     */
    public static String FORMAT_YYYY_MM_DD_CHINA = "yyyy年MM月dd";
    /**
     * 中文全称 如：2010年12月01日 23时15分06秒
     */
    public static String FORMAT_YYYY_MM_DD_HH_MM_SS_CHINA = "yyyy年MM月dd日  HH时mm分ss秒";
    /**
     * 精确到毫秒的完整中文时间
     */
    public static String FORMAT_YYYY_MM_DD_HH_MM_SS_S_CHINA = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";

    /**
     * 获得默认的 date type
     */
    public static String getDateType() {
        log.info("获得默认的 date type【" + FORMAT_YYYY_MM_DD_HH_MM_SS + "】");
        return FORMAT_YYYY_MM_DD_HH_MM_SS;
    }

    /**
     * 根据预设格式返回当前日期
     *
     * @return
     */
    public static String getNow() {
        String format = format(new Date());
        return format;
    }

    /**
     * 根据用户格式返回当前日期
     *
     * @param format
     * @return
     */
    public static String getNow(String format) {
        String timeStr = format(new Date(), format);
        log.info("根据用户格式返回当前日期字符串【" + timeStr + "】");
        return timeStr;
    }

    /**
     * 使用预设格式格式化日期
     *
     * @param date
     * @return
     */
    public static String format(Date date) {
        String timeStr = "";
        if (date != null) {
            timeStr = format(date, getDateType());
        }
        log.info("使用预设格式格式化日期【" + timeStr + "】");
        return timeStr;
    }

    /**
     * 使用用户格式格式化日期
     *
     * @param date     日期
     * @param timeType 日期格式
     * @return
     */
    public static String format(Date date, String timeType) {
        String timeStr = "";
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(timeType);
            timeStr = df.format(date);
        }
        log.info("使用预设格式格式化日期【" + timeStr + "】");
        return (timeStr);
    }

    /**
     * 使用用户格式提取字符串日期
     *
     * @param strDate 日期字符串
     * @param format  日期格式
     * @return
     */
    public static Date parse(String strDate, String format) {
        Date parse = null;
        if (!StringUtils.isEmpty(strDate)) {
            SimpleDateFormat df = new SimpleDateFormat(format);
            try {
                parse = df.parse(strDate);
                return parse;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        log.info("使用用户格式提取字符串日期【" + parse + "】");
        return parse;
    }

    /**
     * 在日期上增加数个整月
     *
     * @param date 日期
     * @param n    要增加的月数
     * @return
     */
    public static Date addMonthToDate(Date date, int n) {
        Date time = null;
        if (date != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, n);
            time = cal.getTime();
        }
        log.info("在日期【" + date + "】上增加数【" + n + "】个整月为【" + time + "】");
        return time;
    }

    /**
     * 在日期上增加天数
     *
     * @param date 日期
     * @param n    要增加的天数
     * @return
     */
    public static Date addDayToDate(Date date, int n) {
        Date time = null;
        if (date != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, n);
            time = cal.getTime();
        }
        log.info("在日期【" + date + "】上增加【" + n + "】个天数为【" + time + "】");
        return time;
    }

    /***
     * 使用用户格式在日期上增加天数
     * @param date  日期
     * @param n  要增加的天数
     * @param format
     * @return
     */
    public static String addDayToStr(Date date, int n, String format) {
        String timeStr = "";
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(format);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, n);
            timeStr = df.format(cal.getTime());
        }
        log.info("使用用户格式在日期【" + date + "】上增加【" + n + "】个天数为【" + timeStr + "】");
        return timeStr;
    }

    /**
     * 获取时间戳
     */
    public static String getTimeString(String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        String timeStr = df.format(calendar.getTime());
        log.info("使用用户格式获取时间戳【" + timeStr + "】");
        return timeStr;
    }

    /**
     * 获取当前日期年份
     *
     * @param date 日期
     * @return
     */
    public static String getYearNow(Date date) {
        String timeStr = "";
        if (date != null) {
            String format = format(date);
            timeStr = format.substring(0, 4);
        }
        log.info("获取当前日期年份【" + timeStr + "】");
        return timeStr;
    }

    /**
     * 获取当前日期年份月份
     *
     * @param date 日期
     * @return
     */
    public static String getYearAndMonthNow(Date date) {
        String timeStr = "";
        if (date != null) {
            String format = format(date);
            timeStr = format.substring(0, 7);
        }
        log.info("获取当前日期年份月份【" + timeStr + "】");
        return timeStr;
    }

    /**
     * 获取指定日期月份
     *
     * @param date 日期
     * @return
     */
    public static String getMonthToDate(Date date) {
        if (date == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTime(date);
        int month = calendar.get(calendar.MONTH) + 1;
        log.info("获取当前日期月份【" + month + "】");
        return month + "";
    }

    /**
     * 获取当前季度
     *
     */
    public static String getQuarter(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTime(date);
        int month = calendar.get(calendar.MONTH) + 1;
        int quarter = 0;
        if (month >= 1 && month <= 3) {
            quarter = 1;
        } else if (month >= 4 && month <= 6) {
            quarter = 2;
        } else if (month >= 7 && month <= 9) {
            quarter = 3;
        } else {
            quarter = 4;
        }
        return quarter + "";
    }

    /**
     * 转化为没有符号的字符串时间
     *
     * @param date 日期
     * @return
     */
    public static String getformatSubStr(Date date, String timeType, int index) {
        String timeStr = "";
        if (date != null) {
            timeStr = format(date, timeType);
            int strLength = getStrToArray(timeStr);
            if (index < strLength) {
                timeStr = timeStr.substring(0, index);
            }
        }
        log.info("转化为没有符号的字符串时间为【" + timeStr + "】");
        return timeStr;
    }

    /**
     * 转化为截取的字符串时间
     *
     * @param dateStr 日期
     * @return
     */
    public static String getformatSubStr(String dateStr, String format, String timeType, int index) {
        String timeStr = "";
        if (!StringUtils.isEmpty(dateStr)) {
            Date parse = parse(dateStr, format);
            timeStr = format(parse, timeType);
            int strLength = getStrToArray(timeStr);
            if (index < strLength) {
                timeStr = timeStr.substring(0, index);
            }
        }
        log.info("转化为截取的字符串时间为【" + timeStr + "】");
        return timeStr;
    }

    /**
     * 按用户格式字符串距离今天的天数
     *
     * @param dateStr 日期字符串
     * @param format  日期格式
     * @return
     */
    public static int countDaysToNow(String dateStr, String format) {
        int time = 0;
        if (StringUtils.isEmpty(dateStr)) {
            long t = Calendar.getInstance().getTime().getTime();
            Calendar c = Calendar.getInstance();
            c.setTime(parse(dateStr, format));
            long t1 = c.getTime().getTime();
            time = (int) (t / 1000 - t1 / 1000) / 3600 / 24;
        }
        log.info("按用户格式字符串距离今天的天数为【" + time + "】");
        return time;
    }

    /**
     * 按用户格式字符串距离今天的天数
     *
     * @param date 日期字符串
     * @return
     */
    public static int countDaysToNow(Date date) {
        int time = 0;
        if (date != null) {
            long t = Calendar.getInstance().getTime().getTime();
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            long t1 = c.getTime().getTime();
            time = (int) (t / 1000 - t1 / 1000) / 3600 / 24;
        }
        log.info("按用户格式字符串距离今天的天数为【" + time + "】");
        return time;
    }

    /***
     * 获取指定日期的下个月第一天
     * @param dateStr
     * @param format
     * @return
     */
    public static String getNextMonthToFristDay(String dateStr, String format) {
        String time = "";
        if (!StringUtils.isEmpty(dateStr)) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            try {
                Date date = sdf.parse(dateStr);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                calendar.add(Calendar.MONTH, 1);
                //将小时至0
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                //将分钟至0
                calendar.set(Calendar.MINUTE, 0);
                //将秒至0
                calendar.set(Calendar.SECOND, 0);
                //将毫秒至0
                calendar.set(Calendar.MILLISECOND, 0);
                time = sdf.format(calendar.getTime());
                return time;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        log.info("获取指定日期的下个月第一天为【" + time + "】");
        return time;
    }

    /***
     * 获取指定日期的下个月第一天
     * @param date
     * @param format
     * @return
     */
    public static String getNextMonthToFristDay(Date date, String format) {
        String time = "";
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.add(Calendar.MONTH, 1);
            //将小时至0
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            //将分钟至0
            calendar.set(Calendar.MINUTE, 0);
            //将秒至0
            calendar.set(Calendar.SECOND, 0);
            //将毫秒至0
            calendar.set(Calendar.MILLISECOND, 0);
            time = sdf.format(calendar.getTime());
        }
        log.info("获取指定日期的下个月第一天为【" + time + "】");
        return time;
    }

    /***
     * 获取指定日期的下个月最后一天
     * @param dateStr
     * @param format
     * @return
     */
    public static String getNextMonthToLastDay(String dateStr, String format) {
        String time = "";
        if (!StringUtils.isEmpty(dateStr)) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            try {
                Date date = sdf.parse(dateStr);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DATE));
                calendar.add(Calendar.MONTH, 1);
                //将小时至0
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                //将分钟至0
                calendar.set(Calendar.MINUTE, 0);
                //将秒至0
                calendar.set(Calendar.SECOND, 0);
                //将毫秒至0
                calendar.set(Calendar.MILLISECOND, 0);
                time = sdf.format(calendar.getTime());
                return time;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        log.info("获取指定日期的下个月最后一天为【" + time + "】");
        return time;
    }

    /***
     * 获取指定日期的下个月最后一天
     * @param date
     * @param format
     * @return
     */
    public static String getNextMonthToLastDay(Date date, String format) {
        String time = "";
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DATE));
            calendar.add(Calendar.MONTH, 1);
            //将小时至0
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            //将分钟至0
            calendar.set(Calendar.MINUTE, 0);
            //将秒至0
            calendar.set(Calendar.SECOND, 0);
            //将毫秒至0
            calendar.set(Calendar.MILLISECOND, 0);
            time = sdf.format(calendar.getTime());
        }
        log.info("获取指定日期的下个月最后一天为【" + time + "】");
        return time;
    }

    /***
     * 获取指定日期的上个月第一天
     * @param dateStr
     * @param format
     * @return
     */
    public static String getLastMonthToFristDay(String dateStr, String format) {
        String time = "";
        if (!StringUtils.isEmpty(dateStr)) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            try {
                Date date = sdf.parse(dateStr);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
                calendar.add(Calendar.MONTH, -1);
                //将小时至0
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                //将分钟至0
                calendar.set(Calendar.MINUTE, 0);
                //将秒至0
                calendar.set(Calendar.SECOND, 0);
                //将毫秒至0
                calendar.set(Calendar.MILLISECOND, 0);
                time = sdf.format(calendar.getTime());
                return time;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        log.info("获取指定日期的上个月第一天为【" + time + "】");
        return time;
    }

    /***
     * 获取指定日期的上个月第一天
     * @param date
     * @param format
     * @return
     */
    public static String getLastMonthToFristDay(Date date, String format) {
        String time = "";
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
            calendar.add(Calendar.MONTH, -1);
            //将小时至0
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            //将分钟至0
            calendar.set(Calendar.MINUTE, 0);
            //将秒至0
            calendar.set(Calendar.SECOND, 0);
            //将毫秒至0
            calendar.set(Calendar.MILLISECOND, 0);
            time = sdf.format(calendar.getTime());
        }
        log.info("获取指定日期的上个月第一天为【" + time + "】");
        return time;
    }

    /***
     * 获取指定日期的上个月最后一天
     * @param dateStr
     * @param format
     * @return
     */
    public static String getLastMonthToLastDay(String dateStr, String format) {
        String time = "";
        if (!StringUtils.isEmpty(dateStr)) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            try {
                Date date = sdf.parse(dateStr);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DATE));
                calendar.add(Calendar.MONTH, -1);
                //将小时至0
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                //将分钟至0
                calendar.set(Calendar.MINUTE, 0);
                //将秒至0
                calendar.set(Calendar.SECOND, 0);
                //将毫秒至0
                calendar.set(Calendar.MILLISECOND, 0);
                time = sdf.format(calendar.getTime());
                return time;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        log.info("获取指定日期的上个月最后一天为【" + time + "】");
        return time;
    }


    /***
     * 获取指定日期的上个月最后一天
     * @param date
     * @param format
     * @return
     */
    public static String getLastMonthToLastDay(Date date, String format) {
        String time = "";
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DATE));
            calendar.add(Calendar.MONTH, -1);
            //将小时至0
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            //将分钟至0
            calendar.set(Calendar.MINUTE, 0);
            //将秒至0
            calendar.set(Calendar.SECOND, 0);
            //将毫秒至0
            calendar.set(Calendar.MILLISECOND, 0);
            time = sdf.format(calendar.getTime());
        }
        log.info("获取指定日期的上个月最后一天为【" + time + "】");
        return time;
    }

    /***
     * 获取指定时间指定格式与当前时间的差
     * @param dateStr
     * @param format
     * @return
     */
    public static long getTimePkNowToMillis(String dateStr, String format) {
        long outTime = 0;
        if (!StringUtils.isEmpty(dateStr)) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date parse = null;
            try {
                parse = sdf.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long comTime = parse.getTime();
            Date date = new Date();
            long sysTime = date.getTime();
            outTime = sysTime - comTime;
        }
        log.info("获取指定时间指定格式与当前时间的差为【" + outTime + "】");
        return outTime;
    }

    /***
     * 获取指定时间与当前时间的差
     * @param parse
     * @return
     */
    public static long getTimePkNowToMillis(Date parse) {
        long outTime = 0;
        if (parse != null) {
            long comTime = parse.getTime();
            Date date = new Date();
            long sysTime = date.getTime();
            outTime = sysTime - comTime;
        }
        log.info("获取指定时间与当前时间的差为【" + outTime + "】");
        return outTime;
    }

    /***
     * 获取指定时间与指定时间的差
     * @param dateStrOne
     * @param dateStrTwo
     * @param format
     * @return
     */
    public static long getTimePkNowToMillis(String dateStrOne, String dateStrTwo, String format) {
        long outTime = 0;
        if (!StringUtils.isEmpty(dateStrOne) && !StringUtils.isEmpty(dateStrTwo)) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date parseOne = null;
            Date parseTwo = null;
            try {
                parseOne = sdf.parse(dateStrOne);
                parseTwo = sdf.parse(dateStrTwo);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long comTimeOne = parseOne.getTime();
            long comTimeTwo = parseTwo.getTime();
            outTime = comTimeTwo - comTimeOne;
        }
        log.info("获取指定时间与指定时间的差为【" + outTime + "】");
        return outTime;
    }

    /***
     *字符串转化为Byte数组
     * @param str
     * @return
     */
    public static int getStrToArray(String str) {
        int length = 0;
        if (!StringUtils.isEmpty(str)) {
            byte[] bytes = str.getBytes();
            length = bytes.length;
        }
        return length;
    }

    /***
     * 获取当前日期所在月最后一天
     * @param date
     * @param format
     * @return
     */
    public static String getNowToLastDay(Date date, String format) {
        String time = "";
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DATE));
            calendar.add(Calendar.MONTH, 0);
            //将小时至0
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            //将分钟至0
            calendar.set(Calendar.MINUTE, 0);
            //将秒至0
            calendar.set(Calendar.SECOND, 0);
            //将毫秒至0
            calendar.set(Calendar.MILLISECOND, 0);
            time = sdf.format(calendar.getTime());
        }
        log.info("获取当前日期所在月最后一天为【" + time + "】");
        return time;
    }

    public static void main(String[] args) {

    }

    public static String dateAutoFormat(String date, String formatType) {
        if (StringUtils.isEmpty(date)) {
            return "";
        } else {
            String formatter = null;
            if (date.indexOf(45) != -1) {
                formatter = "yyyy-MM-dd";
            } else if (date.indexOf(47) != -1) {
                formatter = "yyyy/MM/dd";
            } else {
                formatter = "yyyyMMdd";
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat(formatter);
            dateFormat.setLenient(false);

            try {
                DateFormat resultFormat = new SimpleDateFormat(formatType);
                return resultFormat.format(dateFormat.parse(date));
            } catch (Exception var5) {
                return "";
            }
        }
    }

    /***
     *
     * @param time
     * @param formatType
     * @return
     */
    public static String getDareToseasonPrefixByDate(String time, String formatType) {
        if (StringUtils.isEmpty(time)) {
            return "";
        }
        String formatter = null;
        if (time.indexOf(45) != -1) {
            formatter = "yyyy-MM-dd";
        } else if (time.indexOf(47) != -1) {
            formatter = "yyyy/MM/dd";
        } else {
            formatter = "yyyyMMdd";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatter);
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(time);
            String currQuarter = getCurrQuarter(date, 0);
            currQuarter = dateAutoFormat(currQuarter,formatter);
            return currQuarter;
        } catch (Exception var5) {
            return "";
        }
    }


    /***
     *
     * @param time
     * @param type
     * @return
     */
    public static String getDareToseasonEndByDate(String time, String type) {
        if (StringUtils.isEmpty(time)) {
            return "";
        }
        String formatter = null;
        if (time.indexOf(45) != -1) {
            formatter = "yyyy-MM-dd";
        } else if (time.indexOf(47) != -1) {
            formatter = "yyyy/MM/dd";
        } else {
            formatter = "yyyyMMdd";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatter);
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(time);
            String currQuarter = getCurrQuarter(date, 1);
            currQuarter = dateAutoFormat(currQuarter,formatter);
            return currQuarter;
        } catch (Exception var5) {
            return "";
        }
    }

    /**
     * 获取某季度的第一天和最后一天
     * 0 ：季度首第一天
     * 1 ：季度尾第二天
     *	@param
     */
    public static String getCurrQuarter(Date date,int i) {
        if (date == null){
            return "";
        }
        String[] s = new String[2];
        String str = "";
        // 设置本年的季
        Calendar calendar = null;
        String num = getQuarter(date);
        calendar = Calendar.getInstance();
        calendar.setTime(date);
        switch (num) {
            case "1": // 本年到现在经过了一个季度，在加上前4个季度
                calendar.set(Calendar.MONTH, 3);
                calendar.set(Calendar.DATE, 1);
                str = DateUtils.formatDate(calendar.getTime(), "yyyy-MM-dd");
                s[0] = str.substring(0, str.length() - 5) + "01-01";
                s[1] = str;
                break;
            case "2": // 本年到现在经过了二个季度，在加上前三个季度
                calendar.set(Calendar.MONTH, 6);
                calendar.set(Calendar.DATE, 1);
                str = DateUtils.formatDate(calendar.getTime(), "yyyy-MM-dd");
                s[0] = str.substring(0, str.length() - 5) + "04-01";
                s[1] = str;
                break;
            case "3":// 本年到现在经过了三个季度，在加上前二个季度
                calendar.set(Calendar.MONTH, 9);
                calendar.set(Calendar.DATE, 1);
                str = DateUtils.formatDate(calendar.getTime(), "yyyy-MM-dd");
                s[0] = str.substring(0, str.length() - 5) + "07-01";
                s[1] = str;
                break;
            case "4":// 本年到现在经过了四个季度，在加上前一个季度
                calendar.set(Calendar.MONTH, 12);
                calendar.set(Calendar.DATE, 1);
                str = DateUtils.formatDate(calendar.getTime(), "yyyy-MM-dd");
                s[0] = str.substring(0, str.length() - 5) + "10-01";
                s[1] = str;
                break;
        }
        if ( i == 0){
            return s[0];
        }else {
            return s[1];
        }
    }


/*----------------------------------------------------以下非官方出品--------------------------------------------------------------*/

    public static Date toDate(String fmt, String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);

        try {
            Date date = sdf.parse(dateStr);
            return date;
        } catch (ParseException var4) {
            log.error(var4.getMessage(), var4);
            return null;
        }
    }

    public static String doDateFormat(Date date, String formatType) {
        DateFormat df = new SimpleDateFormat(formatType);
        return df.format(date);
    }

    public static int compareTwoDate(String dateOne, String dateTwo, String formatType) {
        return compareTwoDate(dateOne, formatType, dateTwo, formatType);
    }

    public static int compareTwoDate(String dateOne, String dateTwo) {
        String formatType = null;
        if (dateOne.indexOf(45) != -1) {
            formatType = "yyyy-MM-dd";
        } else if (dateOne.indexOf(47) != -1) {
            formatType = "yyyy/MM/dd";
        } else {
            formatType = "yyyyMMdd";
        }

        return compareTwoDate(dateOne, formatType, dateTwo, formatType);
    }

    public static boolean compareTwoGrane(String dateOneBef, String dateTwoBef, String dateOneAft, String dateTwoAft) {
        int befCompare = dateOneBef.compareTo(dateOneAft);
        int aftCompare = dateTwoBef.compareTo(dateTwoAft);
        return befCompare >= 0 && aftCompare <= 0;
    }

    public static int compareTwoDate(String dateOne, String formatTypeOne, String dateTwo, String formatTypeTwo) {
        DateFormat dfOne = new SimpleDateFormat(formatTypeOne);
        DateFormat dfTwo = new SimpleDateFormat(formatTypeTwo);
        long dtTimeOne = 0L;
        long dtTimeTwo = 0L;

        try {
            dtTimeOne = dfOne.parse(dateOne).getTime();
            dtTimeTwo = dfTwo.parse(dateTwo).getTime();
        } catch (ParseException var11) {
            log.error(var11.getMessage(), var11);
        }

        if (dtTimeOne > dtTimeTwo) {
            return 1;
        } else {
            return dtTimeOne < dtTimeTwo ? -1 : 0;
        }
    }

    public static int compareTwoDate(Date dateOne, String dateTwo, String formatTypeTwo) {
        DateFormat dfTwo = new SimpleDateFormat(formatTypeTwo);
        long dtTimeOne = 0L;
        long dtTimeTwo = 0L;

        try {
            dtTimeOne = dateOne.getTime();
            dtTimeTwo = dfTwo.parse(dateTwo).getTime();
        } catch (ParseException var11) {
            log.error(var11.getMessage(), var11);
        }

        if (dtTimeOne > dtTimeTwo) {
            return 1;
        } else {
            return dtTimeOne < dtTimeTwo ? -1 : 0;
        }
    }

    public static boolean isDateYYYYMMDD(String date) {
        String regEx = "^(1|2)\\d{3}-((0{0,1}[1-9])|(1[012]))-\\d{1,2}$";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(date);
        return m.find();
    }

    public static boolean isDateYYYYMM(String date) {
        String regEx = "^(1|2)\\d{3}-((0{0,1}[1-9])|(1[012]))$";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(date);
        return m.find();
    }

    public static boolean isDateYYYY(String dateStr) {
        String regEx = "^(19|20)\\d{2}$";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(dateStr);
        return m.find();
    }

    public static boolean isValidateDate(String pattern, String value) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            dateFormat.setLenient(false);
            dateFormat.parse(value);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

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

        return lastDateStr;
    }

    public static String getLastDayOfMonth(String dateStr) {
        String lastDateStr = "";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = df.parse(dateStr);
            Calendar ca = Calendar.getInstance();
            ca.setTime(date);
            ca.set(5, 1);
            ca.add(2, 1);
            ca.add(5, -1);
            Date lastDate = ca.getTime();
            lastDateStr = df.format(lastDate);
        } catch (ParseException var6) {
            log.error("输入日期格式不合法。", var6);
        }

        return lastDateStr;
    }

    public static String getLastDayOfMonth2(String dateStr) {
        String lastDateStr = "";
        String formatter = null;
        if (dateStr.indexOf(45) != -1 && dateStr.length() >= 6) {
            formatter = "yyyy-MM";
        } else if (dateStr.indexOf(47) != -1 && dateStr.length() >= 6) {
            formatter = "yyyy/MM";
        } else {
            formatter = "yyyyMM";
        }

        Date date = null;

        try {
            DateFormat df = new SimpleDateFormat(formatter);
            date = df.parse(dateStr);
        } catch (ParseException var6) {
            log.debug("日期格式不正确。", var6);
            return "";
        }

        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.set(5, 1);
        ca.add(2, 1);
        ca.add(5, -1);
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        lastDateStr = df1.format(ca.getTime());
        return lastDateStr;
    }

    public static String getFirstDayOfMonth(String dateStr) {
        String firstDateStr = "";
        String formatter = null;
        if (dateStr.indexOf(45) != -1 && dateStr.length() >= 8) {
            formatter = "yyyy-MM-dd";
        } else if (dateStr.indexOf(47) != -1 && dateStr.length() >= 8) {
            formatter = "yyyy/MM/dd";
        } else {
            formatter = "yyyyMMdd";
        }

        SimpleDateFormat df = new SimpleDateFormat(formatter);

        try {
            Date date = df.parse(dateStr);
            Calendar ca = Calendar.getInstance();
            ca.setTime(date);
            ca.set(5, 1);
            firstDateStr = df.format(ca.getTime());
            return firstDateStr;
        } catch (ParseException var6) {
            log.error("输入日期格式不合法。", var6);
            return null;
        }
    }

    public static String getFirstDayOfMonth2(String dateStr) {
        String firstDateStr = "";
        String formatter = null;
        if (dateStr.indexOf(45) != -1 && dateStr.length() >= 6) {
            formatter = "yyyy-MM";
        } else if (dateStr.indexOf(47) != -1 && dateStr.length() >= 6) {
            formatter = "yyyy/MM";
        } else {
            formatter = "yyyyMM";
        }

        Date date = null;

        try {
            DateFormat df = new SimpleDateFormat(formatter);
            date = df.parse(dateStr);
        } catch (ParseException var6) {
            log.debug("日期格式不正确。", var6);
            return "";
        }

        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.set(5, 1);
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        firstDateStr = df1.format(ca.getTime());
        return firstDateStr;
    }

    public static String addYears(String dateStr, int years) {
        if (years == 0) {
            return dateStr;
        } else {
            Calendar calendar = Calendar.getInstance();
            String formatter = "";
            String[] temp;
            if (dateStr.indexOf(45) != -1 && dateStr.length() >= 8) {
                formatter = "yyyy-MM-dd";
                temp = dateStr.split("-");
                calendar.set(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) - 1, Integer.parseInt(temp[2]));
            } else if (dateStr.indexOf(47) != -1 && dateStr.length() >= 8) {
                formatter = "yyyy/MM/dd";
                temp = dateStr.split("/");
                calendar.set(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) - 1, Integer.parseInt(temp[2]));
            } else {
                formatter = "yyyyMMdd";
                calendar.set(Integer.parseInt(dateStr.substring(0, 4)), Integer.parseInt(dateStr.substring(4, 6)) - 1, Integer.parseInt(dateStr.substring(6, 8)));
            }

            SimpleDateFormat myFmt = new SimpleDateFormat(formatter);
            calendar.add(1, years);
            String timeStr = myFmt.format(calendar.getTime()).toString();
            return timeStr;
        }
    }

    public static String addMonths(String dateStr, int months) {
        if (months == 0) {
            return dateStr;
        } else {
            Calendar calendar = Calendar.getInstance();
            String formatter = "";
            String[] temp;
            if (dateStr.indexOf(45) != -1 && dateStr.length() >= 8) {
                formatter = "yyyy-MM-dd";
                temp = dateStr.split("-");
                calendar.set(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) - 1, Integer.parseInt(temp[2]));
            } else if (dateStr.indexOf(47) != -1 && dateStr.length() >= 8) {
                formatter = "yyyy/MM/dd";
                temp = dateStr.split("/");
                calendar.set(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) - 1, Integer.parseInt(temp[2]));
            } else {
                formatter = "yyyyMMdd";
                calendar.set(Integer.parseInt(dateStr.substring(0, 4)), Integer.parseInt(dateStr.substring(4, 6)) - 1, Integer.parseInt(dateStr.substring(6, 8)));
            }

            SimpleDateFormat myFmt = new SimpleDateFormat(formatter);
            calendar.add(2, months);
            String timeStr = myFmt.format(calendar.getTime()).toString();
            return timeStr;
        }
    }

    public static String addDays(String dateStr, int days) {
        if (days == 0) {
            return dateStr;
        } else {
            Calendar calendar = Calendar.getInstance();
            String formatter = null;
            String timeStr;
            if (dateStr.indexOf(45) != -1 && dateStr.length() >= 8) {
                String[] dateTemp = dateStr.split("-");
                calendar.set(Integer.parseInt(dateTemp[0]), Integer.parseInt(dateTemp[1]) - 1, Integer.parseInt(dateTemp[2]));
                formatter = "yyyy-MM-dd";
            } else {
                String year = dateStr.substring(0, 4);
                timeStr = dateStr.substring(4, 6);
                String day = dateStr.substring(6, 8);
                calendar.set(Integer.parseInt(year), Integer.parseInt(timeStr) - 1, Integer.parseInt(day));
                formatter = "yyyyMMdd";
            }

            SimpleDateFormat myFmt = new SimpleDateFormat(formatter);
            calendar.add(5, days);
            timeStr = myFmt.format(calendar.getTime()).toString();
            return timeStr;
        }
    }

    public static String getFirstDayOfMonth(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.add(2, n);
        ca.set(5, 1);
        return df.format(ca.getTime());
    }

    public static String getFirstDayOfSeason(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        int month = ca.get(2) + 1;
        BigDecimal decMonth = new BigDecimal(month);
        int season = decMonth.divide(new BigDecimal(3), 2).intValue();
        int temp = 0;
        switch(season) {
            case 1:
                temp = 0;
                break;
            case 2:
                temp = 3;
                break;
            case 3:
                temp = 6;
                break;
            case 4:
                temp = 9;
        }

        ca.set(5, 1);
        ca.set(2, temp);
        ca.add(2, 3 * n);
        return df.format(ca.getTime());
    }

    public static String getLastDayOfSeason(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        int month = ca.get(2) + 1;
        BigDecimal decMonth = new BigDecimal(month);
        int season = decMonth.divide(new BigDecimal(3), 2).intValue();
        int temp = 0;
        switch(season) {
            case 1:
                temp = 2;
                break;
            case 2:
                temp = 5;
                break;
            case 3:
                temp = 8;
                break;
            case 4:
                temp = 11;
        }

        ca.set(5, 1);
        ca.set(2, temp);
        ca.add(2, 3 * n);
        ca.add(2, 1);
        ca.add(5, -1);
        return df.format(ca.getTime());
    }

    public static String getFirstDayOfHalfYear(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        int month = ca.get(2) + 1;
        BigDecimal decMonth = new BigDecimal(month);
        int halfYear = decMonth.divide(new BigDecimal(6), 2).intValue();
        int temp = 0;
        switch(halfYear) {
            case 1:
                temp = 0;
                break;
            case 2:
                temp = 6;
        }

        ca.set(5, 1);
        ca.set(2, temp);
        ca.add(2, 6 * n);
        return df.format(ca.getTime());
    }

    public static String getLastDayOfHalfYear(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        int month = ca.get(2) + 1;
        BigDecimal decMonth = new BigDecimal(month);
        int halfYear = decMonth.divide(new BigDecimal(6), 2).intValue();
        int temp = 0;
        switch(halfYear) {
            case 1:
                temp = 5;
                break;
            case 2:
                temp = 11;
        }

        ca.set(5, 1);
        ca.set(2, temp);
        ca.add(2, 6 * n);
        ca.add(2, 1);
        ca.add(5, -1);
        return df.format(ca.getTime());
    }

    public static String getFirstDayOfMonth(int n, String format) {
        DateFormat df = new SimpleDateFormat(format);
        Calendar ca = Calendar.getInstance();
        ca.add(2, n);
        ca.set(5, 1);
        return df.format(ca.getTime());
    }

    public static String getLastDayOfMonth(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.add(2, n);
        ca.set(5, 1);
        ca.add(2, 1);
        ca.add(5, -1);
        return df.format(ca.getTime());
    }

    public static String getLastDayOfMonth(String dateStr, int n, String inFormat, String outFormat) {
        DateFormat inDf = new SimpleDateFormat(inFormat);
        SimpleDateFormat outDf = new SimpleDateFormat(outFormat);

        try {
            Date date = inDf.parse(dateStr);
            Calendar ca = Calendar.getInstance();
            ca.setTime(date);
            ca.add(2, n);
            ca.set(5, 1);
            ca.add(2, 1);
            ca.add(5, -1);
            return outDf.format(ca.getTime());
        } catch (Exception var8) {
            log.error("输入日期格式不合法。", var8);
            return null;
        }
    }

    public static String getFirstDayOfYear(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.add(1, n);
        ca.set(6, 1);
        return df.format(ca.getTime());
    }

    public static String getLastDayOfYear(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.add(1, n + 1);
        ca.set(6, 0);
        return df.format(ca.getTime());
    }

    public static String getSysTime() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }

    public static String getSysDate() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(new Date());
    }

    public static String getSysDate(String format) {
        DateFormat df = new SimpleDateFormat(format);
        return df.format(new Date());
    }

    public static String getDate(int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.add(5, n);
        return df.format(ca.getTime());
    }

    public static String getDate(Date date, int n) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(5, n);
        return df.format(ca.getTime());
    }

    public static String addMonthZero(String date) {
        int index = date.indexOf("-");
        String yf = date.substring(index + 1);
        return yf.length() < 2 ? date.substring(0, index + 1) + "0" + yf : date;
    }

    public static String getYear() {
        Calendar calendar = Calendar.getInstance();
        return String.valueOf(calendar.get(1));
    }

    public static String getMon(String... format) {
        if (format.length == 0) {
            Calendar calendar = Calendar.getInstance();
            return String.valueOf(calendar.get(2) + 1);
        } else {
            return getSysDate("yyyy-MM-dd").substring(5, 7);
        }
    }

    public static String getDay() {
        Calendar calendar = Calendar.getInstance();
        return String.valueOf(calendar.get(5));
    }

    public static long getSubDay(String timeFrist, String timeSecond) {
        long quot = 0L;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date1 = ft.parse(timeFrist);
            Date date2 = ft.parse(timeSecond);
            quot = date1.getTime() - date2.getTime();
            quot = quot / 1000L / 60L / 60L / 24L;
        } catch (ParseException var7) {
            log.error(var7.getMessage(), var7);
        }

        return quot;
    }

    public static long getSubDay(String timeFrist, String timeSecond, String dateFormat) {
        long quot = 0L;
        SimpleDateFormat ft = new SimpleDateFormat(dateFormat);

        try {
            Date date1 = ft.parse(timeFrist);
            Date date2 = ft.parse(timeSecond);
            quot = date1.getTime() - date2.getTime();
            quot = quot / 1000L / 60L / 60L / 24L;
        } catch (ParseException var8) {
            log.error(var8.getMessage(), var8);
        }

        return quot;
    }

    public static int getMonthSpace(String timeFrist, String timeSecond) throws ParseException {
        String formatter = "";
        if (timeFrist.indexOf(45) != -1 && timeFrist.length() >= 8) {
            formatter = "yyyy-MM-dd";
        } else if (timeFrist.indexOf(47) != -1 && timeFrist.length() >= 8) {
            formatter = "yyyy/MM/dd";
        } else {
            formatter = "yyyyMMdd";
        }

        SimpleDateFormat sdf = new SimpleDateFormat(formatter);
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(sdf.parse(timeFrist));
        c2.setTime(sdf.parse(timeSecond));
        int result = c2.get(2) - c1.get(2);
        return result == 0 ? 1 : Math.abs(result) + 1;
    }

    public static long getApartDay(String beginDateStr, String endDateStr) {
        Date beginDate = java.sql.Date.valueOf(beginDateStr);
        Date endDate = java.sql.Date.valueOf(endDateStr);
        return (endDate.getTime() - beginDate.getTime()) / 24L / 60L / 60L / 1000L;
    }

    public static String formatDate(String date) {
        return !StringUtils.isBlank(date) && date.length() == 8 && date.indexOf("-") == -1 ? date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6) : date;
    }

    public static String formatDate2(String date) {
        return !StringUtils.isBlank(date) && date.length() == 10 ? date.substring(0, 4) + date.substring(5, 7) + date.substring(8, 10) : date;
    }

    public static String formatToYYYYWtMM(String date) {
        return !StringUtils.isBlank(date) && date.length() == 6 ? date.substring(0, 4) + "-" + date.substring(4, 6) : date;
    }

    public static String formatToxsYYYYMM(String date) {
        return !StringUtils.isBlank(date) && date.length() == 6 ? date.substring(0, 4) + "年" + date.substring(4, 6) + "月" : date;
    }

    public static String repalceWhiffletree(String date) {
        return !StringUtils.isBlank(date) && date.length() == 7 ? date.replace("-", "") : date;
    }

    public static boolean isDateConn(String fristDate, String secondDate) {
        return secondDate.equals(addDays(fristDate, 1));
    }

    public static String getDateQhny(String date, int n) {
        try {
            DateFormat df = new SimpleDateFormat("yyyyMM");
            Calendar ca = Calendar.getInstance();
            ca.setTime(df.parse(date));
            ca.add(5, n);
            return df.format(ca.getTime());
        } catch (ParseException var4) {
            return "";
        }
    }

    public static String getLastMonthOfFirstDay() {
        Calendar cal = Calendar.getInstance();
        cal.add(2, -1);
        cal.set(5, 1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(cal.getTime());
    }

    public static String getYear(int n) {
        Calendar cal = Calendar.getInstance();
        cal.add(1, n);
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        return df.format(cal.getTime());
    }

    public static String getDateAfterMinusSeconds(String dateStr, String seconds, String format) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            Date date1 = dateFormat.parse(dateStr);
            long Time = date1.getTime() / 1000L - (long)Integer.parseInt(seconds);
            date1.setTime(Time * 1000L);
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            return formatter.format(date1);
        } catch (ParseException var8) {
            log.error(var8.getMessage(), var8);
            return null;
        }
    }

    public static String getDateFromChineseDate(String cdate) {
        return StringUtils.isBlank(cdate) ? cdate : cdate.replace("年", "-").replace("月", "-").replace("日", "");
    }

    public static String formatDate(String dateStr, String fromFormat, String toFormat) {
        try {
            SimpleDateFormat inFormat = new SimpleDateFormat(fromFormat);
            SimpleDateFormat outFormat = new SimpleDateFormat(toFormat);
            Date date1 = inFormat.parse(dateStr);
            return outFormat.format(date1);
        } catch (ParseException var6) {
            log.error("日期格式转换发生异常。", var6);
            return null;
        }
    }

    public static long getDifferDay(String dateBegin, String dateOver, String format) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(format);
        long over = df.parse(dateOver).getTime();
        long begin = df.parse(dateBegin).getTime();
        long differDay = (over - begin) / 86400000L;
        return differDay;
    }

    public static long getDifferHour(String dateBegin, String dateOver, String format) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(format);
        long over = df.parse(dateOver).getTime();
        long begin = df.parse(dateBegin).getTime();
        long differHour = (over - begin) / 3600000L;
        return differHour;
    }

    public static long getDifferMinite(String dateBegin, String dateOver, String format) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(format);
        long over = df.parse(dateOver).getTime();
        long begin = df.parse(dateBegin).getTime();
        long differMinite = (over - begin) / 60000L;
        return differMinite;
    }

    /** @deprecated */
    @Deprecated
    private static String getCurrSssq_Date() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(1), cal.get(2) + 1, 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(cal.getTime());
    }

    /** @deprecated */
    @Deprecated
    public static String getSssq_s(String yyyyMMdd, int times) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Integer.parseInt(yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4, 6)) - 1, 1);

        while(rightNow.get(2) % times != 0) {
            rightNow.add(2, -1);
        }

        rightNow.add(2, -times);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(rightNow.getTime());
    }

    /** @deprecated */
    @Deprecated
    public static String getByKssq_z() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(1), cal.get(2) + 1, 1);
        cal.add(5, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(cal.getTime());
    }

    /** @deprecated */
    @Deprecated
    public static String getSssq_z(String yyyyMMdd, int times) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Integer.parseInt(yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4, 6)) - 1, 1);

        while(rightNow.get(2) % times != 0) {
            rightNow.add(2, -1);
        }

        rightNow.add(5, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(rightNow.getTime());
    }

    public static String getPrveYear(String yyyyMMdd) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Integer.parseInt(yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4, 6)) - 1, Integer.parseInt(yyyyMMdd.substring(6, 8)));
        rightNow.add(1, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(rightNow.getTime());
    }

    public static String getDqSssq_z(String sssq) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Integer.parseInt(sssq.substring(0, 4)), Integer.parseInt(sssq.substring(4, 6)) - 1, 1);
        rightNow.add(2, 1);
        rightNow.add(5, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(rightNow.getTime());
    }

    public static String getNextSssqZ(String yyyyMMdd, int times) {
        yyyyMMdd = yyyyMMdd.replace("-", "");
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Integer.parseInt(yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4, 6)) - 1, 1);
        rightNow.add(2, times + 1);
        rightNow.add(5, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(rightNow.getTime());
    }

    private static String getLastDay(String dateString, int n) {
        if (StringUtils.isBlank(dateString)) {
            return "";
        } else {
            String yyyyMM = dateString.replace("-", "").substring(0, 6);
            int year = Integer.parseInt(yyyyMM.substring(0, 4));
            int month = Integer.parseInt(yyyyMM.substring(4, 6));
            Calendar cal = Calendar.getInstance();
            cal.set(1, year);
            cal.set(2, month - 1);
            cal.set(5, 1);
            cal.add(2, n + 1);
            cal.add(5, -1);
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
            return df.format(cal.getTime());
        }
    }

    public static String getNsqxDmBySssqAndSssqz(String sssqq, String sssqz) {
        sssqq = sssqq.replace("-", "");
        sssqz = sssqz.replace("-", "");
        if (sssqq.equals(sssqz)) {
            return NsqxEnum.TIME.getDm();
        } else {
            String monthQ = sssqq.substring(4, 6);
            String monthZ = sssqz.substring(4, 6);
            int skssqqY = Integer.valueOf(monthQ);
            int skssqzY = Integer.valueOf(monthZ);
            int minusY = skssqzY - skssqqY;
            if (minusY == 0) {
                return "06";
            } else if (minusY == 2) {
                return "08";
            } else {
                return minusY == 11 ? "10" : "";
            }
        }
    }

    public static String getLastDayOfYear(String kjny, int n) {
        kjny = kjny.replace("-", "");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.set(1, Integer.parseInt(kjny.substring(0, 4)));
        ca.add(1, n + 1);
        ca.set(6, 0);
        return df.format(ca.getTime());
    }

    public static String getFirstDayOfYear(String kjny, int n) {
        kjny = kjny.replace("-", "");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.set(1, Integer.parseInt(kjny.substring(0, 4)));
        ca.add(1, n);
        ca.set(6, 1);
        return df.format(ca.getTime());
    }

    public static String getNextMonth(String yyyyMM) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(yyyyMM.substring(0, 4)), Integer.parseInt(yyyyMM.substring(4, 6)) - 1, 1);
        cal.add(2, 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        return dateFormat.format(cal.getTime());
    }

    public static boolean checkDataFormat(String date, String dataFormat) {
        if (!StringUtils.isBlank(date) && !StringUtils.isBlank(dataFormat)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(dataFormat);
            dateFormat.setLenient(false);

            try {
                dateFormat.parse(date);
                return true;
            } catch (Exception var4) {
                return false;
            }
        } else {
            return false;
        }
    }
}
