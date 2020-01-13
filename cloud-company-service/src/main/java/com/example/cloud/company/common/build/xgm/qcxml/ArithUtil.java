package com.example.cloud.company.common.build.xgm.qcxml;


import com.example.cloud.common.util.SpringUtil;
import com.example.cloud.company.common.vo.base.BondeAPI;
import com.example.cloud.company.service.sb.common.impl.ISystemParamClientImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

@BondeAPI(
        name = "金额计算工具类",
        type = "0001",
        weight = "A"
)
public final class ArithUtil {

    private static final Logger LOG = Logger.getLogger(ArithUtil.class);
    ISystemParamClientImpl SystemParamClient = SpringUtil.getBean(ISystemParamClientImpl.class);
    private static final int DEF_DIV_SCALE = 2;
    public static final DecimalFormat df2 = new DecimalFormat("0.00");
    private static String kxjsfRegex = "^((-?\\d+.?\\d*)[Ee]{1}[-+]?(\\d{1,3}))$";
    private static Pattern kxjsfPattern;
    private static final String[] CN_UPPER_NUMBER;
    private static final String[] CN_UPPER_MONETRAY_UNIT;
    private static final String CN_FULL = "整";
    private static final String CN_NEGATIVE = "负";
    private static final int MONEY_PRECISION = 2;
    private static final String CN_ZEOR_FULL = "零元整";


    private ArithUtil() {
    }

//    public static boolean isENnum(String value) {
//        if (StringUtils.isBlank(value)) {
//            return false;
//        } else {
//            boolean isEnum = kxjsfPattern.matcher(value).matches();
//            if (isEnum) {
//                Double d = Double.parseDouble(value);
//                if (d.isInfinite()) {
//                    return false;
//                }
//            }
//
//            return isEnum;
//        }
//    }

    public static Double add(Double a, Double b) {
        a = nvl(a);
        b = nvl(b);
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        return b1.add(b2).doubleValue();
    }

    public static Double add(Double a, Double... ds) {
        if (ds.length == 0) {
            return a;
        } else {
            for(int i = 0; i < ds.length; ++i) {
                a = add(a, ds[i]);
            }

            return a;
        }
    }

    public static boolean isEquals(Double a, Double b, double scale) {
        return Math.abs(sub(a, b)) <= scale;
    }

    public static boolean isEquals(Double a, Double b) {
        ISystemParamClientImpl SystemParamClient = SpringUtil.getBean(ISystemParamClientImpl.class);
        SystemParamClient = SpringUtil.getBean(ISystemParamClientImpl.class);
        String defaultEqualScale = SystemParamClient.getSystemParam("DEFAULT_EQUAL_SCALE");
        double defEquScale = !StringUtils.isBlank(defaultEqualScale) ? Double.parseDouble(defaultEqualScale) : 0.02D;
        return isEquals(a, b, defEquScale);
    }

    public static Double sub(Double a, Double b) {
        a = nvl(a);
        b = nvl(b);
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        return b1.subtract(b2).doubleValue();
    }

    public static Double sub(Double a, Double... ds) {
        if (ds.length == 0) {
            return a;
        } else {
            for(int i = 0; i < ds.length; ++i) {
                a = sub(a, ds[i]);
            }

            return a;
        }
    }

    public static Double mul(Double a, Double b) {
        a = nvl(a);
        b = nvl(b);
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        BigDecimal result = b1.multiply(b2);
        return result.doubleValue();
    }

    public static Double mul(Double a, Double b, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        } else {
            a = nvl(a);
            b = nvl(b);
            BigDecimal b1 = new BigDecimal(Double.toString(a));
            BigDecimal b2 = new BigDecimal(Double.toString(b));
            BigDecimal result = b1.multiply(b2);
            return round(result.doubleValue(), scale);
        }
    }

    public static Double div(Double a, Double b) {
        a = nvl(a);
        b = nvl(b);
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        return b1.divide(b2, 2, 4).doubleValue();
    }

    public static Double round(Double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        } else {
            v = nvl(v);
            BigDecimal b = new BigDecimal(Double.toString(v) + "");
            BigDecimal one = new BigDecimal("1");
            return b.divide(one, scale, 4).doubleValue();
        }
    }

    public static String roundStr(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        } else {
            BigDecimal b = new BigDecimal(v + "");
            b = b.setScale(scale, 4);
            return b.toPlainString();
        }
    }

    public static String roundStr(Double v, int scale) {
        return v == null ? "" : roundStr(v, scale);
    }

    public static Double StringToDouble(String str) {
        return StringUtils.isBlank(str) ? 0.0D : Double.parseDouble(str);
    }

    /** @deprecated */
    @Deprecated
    public static String DoubleToStirng(Double je) {
        return df2.format(je);
    }

    public static boolean compare(Double realValD, String compareSymbol, Double targetValD) {
        if (StringUtils.isBlank(compareSymbol)) {
            LOG.error(new Object[]{"compareSymbol的值为空，不进行运算"});
            throw new RuntimeException("compareSymbol的值为空，不进行运算");
        } else {
            double realVal = nvl(realValD);
            double targetVal = nvl(targetValD);
            if ("gt".equals(compareSymbol)) {
                return realVal > targetVal;
            } else if ("gtOrEq".equals(compareSymbol)) {
                return realVal >= targetVal;
            } else if ("gtOrAlmostEq".equals(compareSymbol)) {
                return realVal > targetVal || isEquals(realVal, targetVal);
            } else if ("lt".equals(compareSymbol)) {
                return realVal < targetVal;
            } else if ("ltOrEq".equals(compareSymbol)) {
                return realVal <= targetVal;
            } else if (!"ltOrAlmostEq".equals(compareSymbol)) {
                if ("eq".equals(compareSymbol)) {
                    return realVal == targetVal;
                } else if ("AlmostEq".equals(compareSymbol)) {
                    return isEquals(realVal, targetVal);
                } else if ("notEq".equals(compareSymbol)) {
                    return realVal != targetVal;
                } else if ("gtOrAlmostEq".equals(compareSymbol)) {
                    return !isEquals(realVal, targetVal);
                } else {
                    throw new RuntimeException("未有相应的compareSymbol对应处理，不进行运算");
                }
            } else {
                return realVal < targetVal || isEquals(realVal, targetVal);
            }
        }
    }

    public static Double isNullOfDouble(Double str) {
        return null == str ? 0.0D : str;
    }

    public static String roundStr(String v, int scale) {
        if (StringUtils.isBlank(v)) {
            return "";
        } else if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        } else {
            BigDecimal b = new BigDecimal(v);
            b = b.setScale(scale, 4);
            return b.toPlainString();
        }
    }

    public static String number2CNMontrayUnit(BigDecimal numberOfMoney) {
        StringBuffer sb = new StringBuffer();
        int signum = numberOfMoney.signum();
        if (signum == 0) {
            return "零元整";
        } else {
            long number = numberOfMoney.movePointRight(2).setScale(0, 4).abs().longValue();
            long scale = number % 100L;
            int numIndex = 0;
            boolean getZero = false;
            if (scale <= 0L) {
                numIndex = 2;
                number /= 100L;
                getZero = true;
            }

            if (scale > 0L && scale % 10L <= 0L) {
                numIndex = 1;
                number /= 10L;
                getZero = true;
            }

            for(int zeroSize = 0; number > 0L; ++numIndex) {
                int numUnit = (int)(number % 10L);
                if (numUnit > 0) {
                    if (numIndex == 9 && zeroSize >= 3) {
                        sb.insert(0, CN_UPPER_MONETRAY_UNIT[6]);
                    }

                    if (numIndex == 13 && zeroSize >= 3) {
                        sb.insert(0, CN_UPPER_MONETRAY_UNIT[10]);
                    }

                    sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
                    sb.insert(0, CN_UPPER_NUMBER[numUnit]);
                    getZero = false;
                    zeroSize = 0;
                } else {
                    ++zeroSize;
                    if (!getZero) {
                        sb.insert(0, CN_UPPER_NUMBER[numUnit]);
                    }

                    if (numIndex == 2) {
                        if (number > 0L) {
                            sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
                        }
                    } else if ((numIndex - 2) % 4 == 0 && number % 1000L > 0L) {
                        sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
                    }

                    getZero = true;
                }

                number /= 10L;
            }

            if (signum == -1) {
                sb.insert(0, "负");
            }

            if (scale <= 0L) {
                sb.append("整");
            }

            return sb.toString();
        }
    }

    private static Double nvl(Double a) {
        return a == null ? 0.0D : a;
    }

    public static boolean isENnum(String value) {
        if (StringUtils.isBlank(value)) {
            return false;
        } else {
            boolean isEnum = kxjsfPattern.matcher(value).matches();
            if (isEnum) {
                Double d = Double.parseDouble(value);
                if (d.isInfinite()) {
                    return false;
                }
            }

            return isEnum;
        }
    }

    public static String abs(String value) {
        double result = Math.abs(StringToDouble(value));
        return roundStr(result, 2);
    }

    public static String abs(double value) {
        return roundStr(Math.abs(value), 2);
    }

    static {
        kxjsfPattern = Pattern.compile(kxjsfRegex);
        CN_UPPER_NUMBER = new String[]{"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        CN_UPPER_MONETRAY_UNIT = new String[]{"分", "角", "元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟", "兆", "拾", "佰", "仟"};
    }
}

