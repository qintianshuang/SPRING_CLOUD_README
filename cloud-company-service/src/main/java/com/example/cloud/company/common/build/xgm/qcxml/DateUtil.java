package com.example.cloud.company.common.build.xgm.qcxml;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.example.cloud.company.common.enums.NsqxEnum;
import com.example.cloud.company.common.vo.base.BondeAPI;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

@BondeAPI(
        name = "日期工具类",
        type = "0001",
        weight = "B"
)
public class DateUtil {
    private static Logger log = Logger.getLogger(DateUtil.class);
    private static final String NSQXDM_YB = "06";
    private static final String NSQXDM_JB = "08";
    private static final String NSQXDM_NB = "10";
    private static final String NSQXDM_TIMES = "11";

    public DateUtil() {
    }

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
//
//    public static boolean isDateBefore(String date, String formatType) throws Exception, ParseException {
//        if (!StringKit.isBlank(new String[]{date}) && !StringKit.isBlank(new String[]{formatType})) {
//            Date systemDate = new Date();
//            DateFormat df = new SimpleDateFormat(formatType);
//            String result = df.format(df.parse(date));
//            if (date.startsWith(result)) {
//                return df.format(systemDate).equals(df.format(df.parse(date))) ? false : systemDate.after(df.parse(date));
//            } else {
//                throw new IllegalArgumentException(String.format("错误的日期参数：%1$s，不满足[%2$s]格式要求", date, formatType));
//            }
//        } else {
//            return false;
//        }
//    }
//
//    public static boolean isDateBefore2(String date, String formatType) throws Exception, ParseException {
//        if (!StringKit.isBlank(new String[]{date}) && !StringKit.isBlank(new String[]{formatType})) {
//            Date systemDate = new Date();
//            DateFormat df = new SimpleDateFormat(formatType);
//            String result = df.format(df.parse(date));
//            if (date.startsWith(result)) {
//                return systemDate.after(df.parse(date));
//            } else {
//                throw new IllegalArgumentException(String.format("错误的日期参数：%1$s，不满足[%2$s]格式要求", date, formatType));
//            }
//        } else {
//            return false;
//        }
//    }

//    public static String doDateFormat(String date, String formatType) {
//        try {
//            if (!StringKit.isBlank(new String[]{date}) && !StringKit.isBlank(new String[]{formatType})) {
//                DateFormat df = new SimpleDateFormat(formatType);
//                String result = df.format(df.parse(date));
//                if (date.startsWith(result)) {
//                    return result;
//                } else {
//                    throw new Exception(String.format("错误的日期参数：%1$s，不满足[%2$s]格式要求", date, formatType));
//                }
//            } else {
//                return null;
//            }
//        } catch (Exception var4) {
//            throw new RuntimeException(var4);
//        }
//    }

//    public static String dateAutoFormat(String date, String formatType) {
//        if (StringUtils.isBlank(date)) {
//            return "";
//        } else {
//            String formatter = null;
//            if (date.indexOf(45) != -1) {
//                formatter = "yyyy-MM-dd";
//            } else if (date.indexOf(47) != -1) {
//                formatter = "yyyy/MM/dd";
//            } else {
//                formatter = "yyyyMMdd";
//            }
//
//            SimpleDateFormat dateFormat = new SimpleDateFormat(formatter);
//            dateFormat.setLenient(false);
//
//            try {
//                DateFormat resultFormat = new SimpleDateFormat(formatType);
//                return resultFormat.format(dateFormat.parse(date));
//            } catch (Exception var5) {
//                return "";
//            }
//        }
//    }

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

//    public static String getChineseDate(String date) {
//        if (StringUtils.isBlank(date)) {
//            return "";
//        } else {
//            String[] temp = date.split("\\-");
//            return temp[0] + "年" + Integer.parseInt(temp[1]) + "月" + Integer.parseInt(temp[2]) + "日";
//        }
//    }
//
//    public static String getChineseDateNy(String date) {
//        if (StringUtils.isBlank(date)) {
//            return "";
//        } else {
//            String[] temp = date.split("\\-");
//            return temp[0] + "年" + Integer.parseInt(temp[1]) + "月";
//        }
//    }
//
//    public static String getDateNy(String date) {
//        if (StringUtils.isBlank(date)) {
//            return "";
//        } else {
//            String[] temp = date.split("\\-");
//            return temp[0] + Integer.parseInt(temp[1]);
//        }
//    }
//
//    public static String getDateStr(String formatType) {
//        if (StringKit.isBlank(new String[]{formatType})) {
//            return null;
//        } else {
//            Calendar cal = Calendar.getInstance();
//            SimpleDateFormat myFmt = new SimpleDateFormat(formatType);
//            String timeStr = myFmt.format(cal.getTime()).toString();
//            return timeStr;
//        }
//    }

    public static boolean isDateYYYYMMDD(String date) {
        String regEx = "^(1|2)\\d{3}-((0{0,1}[1-9])|(1[012]))-\\d{1,2}$";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(date);
        return m.find();
    }

//    public static boolean isDateYYYYMMDD2(String date) {
//        if (StringUtils.isBlank(date)) {
//            return false;
//        } else {
//            String formatter = null;
//            if (date.indexOf(45) != -1) {
//                formatter = "yyyy-MM-dd";
//            } else if (date.indexOf(47) != -1) {
//                formatter = "yyyy/MM/dd";
//            } else {
//                formatter = "yyyyMMdd";
//            }
//
//            SimpleDateFormat dateFormat = new SimpleDateFormat(formatter);
//            dateFormat.setLenient(false);
//
//            try {
//                dateFormat.parse(date);
//                return true;
//            } catch (Exception var4) {
//                return false;
//            }
//        }
//    }

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

//    public static boolean isDateBeforeMonths(String date, int months, String formatType) {
//        if (!StringKit.isBlank(new String[]{date}) && !StringKit.isBlank(new String[]{formatType}) && !StringKit.isBlank(new String[]{String.valueOf(months)})) {
//            String systemDate = doDateFormat(new Date(), "yyyy-MM-dd");
//            systemDate = addMonths(systemDate, months);
//            SimpleDateFormat df = new SimpleDateFormat(formatType);
//
//            try {
//                String result = df.format(df.parse(date));
//                systemDate = df.format(df.parse(systemDate));
//                return systemDate.equals(result);
//            } catch (ParseException var7) {
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }

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

//    public static Map<String, List<String>> getSjqj(String kssj, String jssj) {
//        TreeMap rqqjMap = null;
//
//        try {
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            Date date1 = dateFormat.parse(SysUtil.formatDate(kssj, "yyyy-mm-dd"));
//            Date date2 = dateFormat.parse(SysUtil.formatDate(jssj, "yyyy-mm-dd"));
//            Calendar calendar1 = Calendar.getInstance();
//            Calendar calendar2 = Calendar.getInstance();
//            calendar1.setTime(date1);
//            calendar2.setTime(date2);
//            List<Integer> nfList = new ArrayList();
//            int csnf = calendar1.get(1);
//            int jsnf = calendar2.get(1);
//            nfList.add(csnf);
//
//            while(calendar1.get(1) < jsnf) {
//                calendar1.add(1, 1);
//                nfList.add(calendar1.get(1));
//            }
//
//            rqqjMap = new TreeMap();
//            Iterator var11 = nfList.iterator();
//
//            while(var11.hasNext()) {
//                Integer integer = (Integer)var11.next();
//                Date dateq = null;
//                Date datez = null;
//                Calendar calendarq = Calendar.getInstance();
//                Calendar calendarz = Calendar.getInstance();
//                if (csnf == integer && jsnf == integer) {
//                    dateq = dateFormat.parse(kssj);
//                    datez = dateFormat.parse(jssj);
//                } else if (csnf == integer) {
//                    dateq = dateFormat.parse(kssj);
//                    datez = dateFormat.parse(csnf + "-12-01");
//                } else if (jsnf == integer) {
//                    dateq = dateFormat.parse(integer + "-01-01");
//                    datez = dateFormat.parse(jssj);
//                } else {
//                    dateq = dateFormat.parse(integer + "-01-01");
//                    datez = dateFormat.parse(integer + "-12-01");
//                }
//
//                calendarq.setTime(dateq);
//                calendarz.setTime(datez);
//                List<String> list = new ArrayList();
//                list.add(dateFormat.format(dateq).substring(0, dateFormat.format(dateq).lastIndexOf("-")));
//
//                while(calendarq.compareTo(calendarz) < 0) {
//                    calendarq.add(2, 1);
//                    Date tDate = calendarq.getTime();
//                    list.add(dateFormat.format(tDate).substring(0, dateFormat.format(tDate).lastIndexOf("-")));
//                }
//
//                rqqjMap.put(String.valueOf(integer), list);
//            }
//
//            return rqqjMap;
//        } catch (Exception var19) {
//            log.error("DataUtil获取日期出错", var19);
//            return rqqjMap;
//        }
//    }

//    public static List<String> getSjqj2(String kssj, String jssj) {
//        List<String> result = new ArrayList();
//        Collection<List<String>> monthList = getSjqj(kssj + "-01", jssj + "-01").values();
//        Iterator var4 = monthList.iterator();
//
//        while(var4.hasNext()) {
//            List<String> list = (List)var4.next();
//            Iterator var6 = list.iterator();
//
//            while(var6.hasNext()) {
//                String string = (String)var6.next();
//                if (string.length() == 6) {
//                    result.add(string.replace("-", "-0"));
//                } else {
//                    result.add(string);
//                }
//            }
//        }
//
//        return result;
//    }

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
//
//    /** @deprecated */
//    @Deprecated
//    public static String getQxjSssq_s(int times) {
//        Calendar cal = Calendar.getInstance();
//        int day = cal.get(5);
//        int dayNum = 25;
//        return day > dayNum ? getSssq_s(getCurrSssq_Date(), times) : getSssq_s(SysUtil.getSysDateYYYYMMDD(), times);
//    }

    /** @deprecated */
//    @Deprecated
//    public static String getQxjSssq_z(int times) {
//        Calendar cal = Calendar.getInstance();
//        int day = cal.get(5);
//        int dayNum = 25;
//        return day > dayNum ? getSssq_z(getCurrSssq_Date(), times) : getSssq_z(SysUtil.getSysDateYYYYMMDD(), times);
//    }

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

//    public static Map<String, String> getHolidays() {
//        List<ArrayList<String>> list = BaseCodeManager.getResultList("HOLIDDAY_GY");
//        Map<String, String> map = new HashMap();
//        Iterator var2 = list.iterator();
//
//        while(var2.hasNext()) {
//            List li = (List)var2.next();
//            map.put((String)li.get(0), (String)li.get(0));
//        }
//
//        return map;
//    }

//    public static String getTzDateAfterDays(String date, int num) {
//        int count = 0;
//
//        for(Map holidaysMap = getHolidays(); count < num; date = getDate(new Date(date.replace("-", "/")), 1)) {
//            boolean flag = holidaysMap.containsKey(date);
//            if (!flag) {
//                ++count;
//            }
//
//            if (count == num) {
//                date = getDate(new Date(date.replace("-", "/")), 0);
//                return date;
//            }
//        }

//        return date;
//    }

//    public static String getTzDateBeforeDays(String date, int num) {
//        int count = 0;
//
//        for(Map holidaysMap = getHolidays(); count < num; date = getDate(new Date(date.replace("-", "/")), -1)) {
//            boolean flag = holidaysMap.containsKey(date);
//            if (!flag) {
//                ++count;
//            }
//
//            if (count == num) {
//                date = getDate(new Date(date.replace("-", "/")), 0);
//                return date;
//            }
//        }
//
//        return date;
//    }

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

