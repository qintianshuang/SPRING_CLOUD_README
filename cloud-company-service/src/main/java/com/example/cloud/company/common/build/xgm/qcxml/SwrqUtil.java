package com.example.cloud.company.common.build.xgm.qcxml;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.example.cloud.company.common.enums.NsqxEnum;
import com.example.cloud.company.common.vo.base.BondeAPI;
import org.apache.log4j.Logger;

@BondeAPI(
        name = "税务日期工具类",
        type = "0001",
        weight = "B"
)
public class SwrqUtil {
    private static Logger log = Logger.getLogger(SwrqUtil.class);

    public SwrqUtil() {
    }

    public static String getKjny() {
        Calendar rightNow = Calendar.getInstance();
        rightNow.add(2, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        return dateFormat.format(rightNow.getTime());
    }

//    public static String getSssqQ(String yyyyMMdd) {
//        if (StringUtils.isBlank(yyyyMMdd)) {
//            yyyyMMdd = DateUtil.getDateStr("yyyyMMdd");
//        }
//
//        Calendar cal = Calendar.getInstance();
//        cal.set(Integer.parseInt(yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4, 6)) - 1, 1);
//        cal.add(2, -1);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//        return dateFormat.format(cal.getTime());
//    }

//    public static String getSssqZ(String yyyyMMdd) {
//        if (StringUtils.isBlank(yyyyMMdd)) {
//            yyyyMMdd = DateUtil.getDateStr("yyyyMMdd");
//        }
//
//        Calendar cal = Calendar.getInstance();
//        cal.set(Integer.parseInt(yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4, 6)) - 1, 1);
//        cal.add(5, -1);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//        return dateFormat.format(cal.getTime());
//    }

//    public static String getSssqQByNsqx(String nsqx, String... dateFormat) {
//        int times = 1;
//        if (NsqxEnum.QUARTER.getDm().equals(nsqx)) {
//            times = 3;
//        } else if (NsqxEnum.YEAR.getDm().equals(nsqx)) {
//            times = 12;
//        } else if (NsqxEnum.HALFYEAR.getDm().equals(nsqx)) {
//            times = 6;
//        }
//
//        String yyyyMMdd = SysUtil.getSysDateYYYYMMDD();
//        Calendar rightNow = Calendar.getInstance();
//        rightNow.set(Integer.parseInt(yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4, 6)) - 1, 1);
//
//        while(rightNow.get(2) % times != 0) {
//            rightNow.add(2, -1);
//        }
//
//        rightNow.add(2, -times);
//        String fmt = "yyyy-MM-dd";
//        if (dateFormat != null && dateFormat.length > 0) {
//            fmt = dateFormat[0];
//        }
//
//        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
//        return sdf.format(rightNow.getTime());
//    }

//    public static String getSssqZByNsqx(String nsqx, String... dateFormat) {
//        int times = 1;
//        if (NsqxEnum.QUARTER.getDm().equals(nsqx)) {
//            times = 3;
//        } else if (NsqxEnum.YEAR.getDm().equals(nsqx)) {
//            times = 12;
//        } else if (NsqxEnum.HALFYEAR.getDm().equals(nsqx)) {
//            times = 6;
//        }
//
//        String yyyyMMdd = SysUtil.getSysDateYYYYMMDD();
//        Calendar rightNow = Calendar.getInstance();
//        rightNow.set(Integer.parseInt(yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4, 6)) - 1, 1);
//
//        while(rightNow.get(2) % times != 0) {
//            rightNow.add(2, -1);
//        }
//
//        rightNow.add(5, -1);
//        String fmt = "yyyy-MM-dd";
//        if (dateFormat != null && dateFormat.length > 0) {
//            fmt = dateFormat[0];
//        }
//
//        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
//        return sdf.format(rightNow.getTime());
//    }

    public static String getSssqQByNsqxAndSssq(String nsqx, String sssq) {
        String fmt = "yyyy-MM-dd";
        if (NsqxEnum.TIME.getDm().equals(nsqx)) {
            String kjny = getKjny();
            if (kjny.equals(sssq)) {
                return DateUtil.getSysDate();
            }

            nsqx = NsqxEnum.MONTH.getDm();
        }

        int times = getTimesByNsqx(nsqx);
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(1, Integer.valueOf(DateUtil.formatDate(sssq, "yyyyMM", "yyyy")));
        rightNow.set(2, Integer.valueOf(DateUtil.formatDate(sssq, "yyyyMM", "MM")));
        rightNow.set(5, 1);

        while(rightNow.get(2) % times != 0) {
            rightNow.add(2, -1);
        }

        rightNow.add(2, -times);
        if (NsqxEnum.YEAR.getDm().equals(nsqx) && sssq.endsWith("00")) {
            rightNow.add(1, 1);
        }

        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(rightNow.getTime());
    }

    public static String getSssqZByNsqxAndSssq(String nsqx, String sssq) {
        String fmt = "yyyy-MM-dd";
        if (NsqxEnum.TIME.getDm().equals(nsqx)) {
            String kjny = getKjny();
            if (kjny.equals(sssq)) {
                return DateUtil.getSysDate();
            }

            nsqx = NsqxEnum.MONTH.getDm();
        }

        int times = getTimesByNsqx(nsqx);
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(1, Integer.valueOf(DateUtil.formatDate(sssq, "yyyyMM", "yyyy")));
        rightNow.set(2, Integer.valueOf(DateUtil.formatDate(sssq, "yyyyMM", "MM")));
        rightNow.set(5, Integer.valueOf(DateUtil.formatDate(sssq, "yyyyMM", "dd")));

        while(rightNow.get(2) % times != 0) {
            rightNow.add(2, -1);
        }

        rightNow.add(5, -1);
        if (NsqxEnum.YEAR.getDm().equals(nsqx) && sssq.endsWith("00")) {
            rightNow.add(1, 1);
        }

        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(rightNow.getTime());
    }

//    public static boolean isYxsbByNsqx(String nsqxDm, String yf) {
//        boolean isYxbs = false;
//        if (StringUtils.isBlank(yf)) {
//            Calendar calendar = Calendar.getInstance();
//            yf = String.valueOf(calendar.get(2) + 1);
//        }
//
//        String yxbsyfs = BaseCodeManager.getNameByCode("DM_GY_NSQX", nsqxDm);
//        String[] yxbsyfArr = yxbsyfs.split(",");
//
//        for(int i = 0; i < yxbsyfArr.length; ++i) {
//            if (yf.equals(yxbsyfArr[i])) {
//                isYxbs = true;
//                break;
//            }
//        }
//
//        return isYxbs;
//    }

    public static String getSssqQByKjny(String kjny) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(kjny.substring(0, 4)), Integer.parseInt(kjny.substring(4, 6)) - 1, 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(cal.getTime());
    }

    public static String getSssqZByKjny(String kjny) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(kjny.substring(0, 4)), Integer.parseInt(kjny.substring(4, 6)), 1);
        cal.add(5, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(cal.getTime());
    }

    /** @deprecated */
    @Deprecated
    public static String getKjnyBySssqZ(String sssqZ) {
        String sssqZStr = sssqZ.replaceAll("-", "");
        return sssqZStr.substring(0, 6);
    }
//
//    public static String getKjnyByCurAndSbzl(String sbzlDm) {
//        if (log.isDebugEnabled()) {
//            log.debug("传入的参数sbzlDm=" + sbzlDm);
//        }
//
//        if (StringUtils.isBlank(sbzlDm)) {
//            return getKjny();
//        } else {
//            String nsqxDm = BaseCodeManager.getNameByCode("DM_SBZL_NSQX", sbzlDm);
//            if (!NsqxEnum.YEAR.getDm().equals(nsqxDm)) {
//                return getKjny();
//            } else {
//                Calendar rightNow = Calendar.getInstance();
//                rightNow.add(1, -1);
//                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
//                return dateFormat.format(rightNow.getTime()) + "00";
//            }
//        }
//    }

    public static String getDqyfByKjny(String kjny) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(kjny.substring(0, 4)), Integer.parseInt(kjny.substring(4, 6)), 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        return dateFormat.format(cal.getTime()).substring(4, 6);
    }

//    public static String getKjnyBySssqZAndSbzl(String sssqZ, String sbzlDm) {
//        if (log.isDebugEnabled()) {
//            log.debug("传入的参数sbzlDm=" + sbzlDm + "，sssqZ=" + sssqZ);
//        }
//
//        String nsqxDm = SbzlUtil.getSbzlVo(sbzlDm).getNsqxDm();
//        String sssqZStr;
//        if (NsqxEnum.TIME.getDm().equals(nsqxDm)) {
//            sssqZStr = DateUtil.getSysDate();
//            if (sssqZStr.equals(sssqZ)) {
//                return getKjny();
//            }
//        }
//
//        if (!StringUtils.isBlank(sbzlDm) && NsqxEnum.YEAR.getDm().equals(nsqxDm)) {
//            return sssqZ.substring(0, 4) + "00";
//        } else {
//            sssqZStr = sssqZ.replaceAll("-", "");
//            return sssqZStr.substring(0, 6);
//        }
//    }

    private static int getTimesByNsqx(String nsqx) {
        if (!NsqxEnum.MONTH.getDm().equals(nsqx) && !NsqxEnum.DAY.getDm().equals(nsqx) && !NsqxEnum.FIFTEEN_DAY.getDm().equals(nsqx)) {
            if (NsqxEnum.QUARTER.getDm().equals(nsqx)) {
                return 3;
            } else {
                return NsqxEnum.HALFYEAR.getDm().equals(nsqx) ? 6 : 12;
            }
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        String sssqQByNsqxAndSssq = getSssqQByNsqxAndSssq("09", "201711");
        String sssqZByNsqxAndSssq = getSssqZByNsqxAndSssq("09", "201711");
        System.out.println(sssqZByNsqxAndSssq);
        System.out.println(sssqQByNsqxAndSssq);
    }
}
