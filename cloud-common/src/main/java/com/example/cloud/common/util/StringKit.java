package com.example.cloud.common.util;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//@BondeAPI(
//        name = "字符串工具类",
//        type = "0001",
//        weight = "B"
//)
public class StringKit {
    public StringKit() {
    }

    public static boolean isBlank(String... params) {
        boolean result = false;
        String[] var3 = params;
        int var4 = params.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String str = var3[var5];
            int length;
            if (null == str || (length = str.length()) == 0) {
                result = true;
                break;
            }

            boolean flag = false;

            for(int i = 0; i < length; ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    flag = true;
                }
            }

            if (!flag) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static boolean isNotBlank(String... params) {
        return !isBlank(params);
    }

    public static String arrayListToString(ArrayList array) {
        if (null != array && !array.isEmpty()) {
            ArrayList<String> list = new ArrayList();

            for(int i = 0; i < array.size(); ++i) {
                if (isNotBlank(array.get(i).toString())) {
                    list.add(array.get(i).toString());
                }
            }

            StringBuffer str = new StringBuffer();

            for(int i = 0; i < list.size(); ++i) {
                if (i == 0) {
                    str.append((String)list.get(i));
                } else {
                    str.append("," + (String)list.get(i));
                }
            }

            return str.toString();
        } else {
            return null;
        }
    }

    public static List<String> stringToArrayList(String cstr) {
        List<String> list = new ArrayList();
        if (cstr != null) {
            String[] tcstr = cstr.split(",");
            String[] var3 = tcstr;
            int var4 = tcstr.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                String mcstr = var3[var5];
                list.add(mcstr);
            }
        }

        return list;
    }

    public static String formatStringToUmber(String str) {
        while(str.startsWith("0")) {
            str = str.substring(1, str.length());
        }

        return str;
    }

    public static String rBlankString(String value) {
        if (StringUtils.isBlank(value)) {
            return "";
        } else {
            value = value.trim();
            return StringUtils.isBlank(value) ? "" : value;
        }
    }

//    private static Map<String, String> parseUrl(String urlStr) throws UnsupportedEncodingException {
//        Map<String, String> map = new HashMap();
//        String[] urlStrs = urlStr.split("&");
//        StringBuilder other = new StringBuilder();
//        boolean isfirst = true;
//
//        for(int i = 0; i < urlStrs.length; ++i) {
//            if (isNotBlank(urlStrs[i])) {
//                String parms1 = urlStrs[i].substring(0, urlStrs[i].indexOf("="));
//                String parms2 = urlStrs[i].substring(urlStrs[i].indexOf("=") + 1, urlStrs[i].length());
//                if (!"dataid".equals(parms1) && !"m".equals(parms1) && !"mm".equals(parms1) && !"czy".equals(parms1)) {
//                    if (isfirst) {
//                        other.append(parms1 + "=" + URLEncoder.encode(parms2, "GBK"));
//                    } else {
//                        other.append("&" + parms1 + "=" + URLEncoder.encode(parms2, "GBK"));
//                    }
//
//                    map.put("other", other.toString());
//                    isfirst = false;
//                } else {
//                    map.put(parms1, parms2);
//                }
//            }
//        }
//
//        return map;
//    }

    public static String cutString(String str, int length) {
        if (StringUtils.isBlank(str)) {
            return "";
        } else {
            return length < str.length() ? str.substring(0, length) + "..." : str;
        }
    }

    public static String capitalize(String s) {
        if (null != s) {
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
        }

        return s;
    }

    public static String[] compareArray(String[] origin, String[] target) {
        List list = new ArrayList();
        String[] returnArray = new String[0];
        if (target != null) {
            int i;
            for(i = 0; i < target.length; ++i) {
                if (origin == null || origin.length <= 0) {
                    list.add(target[i]);
                    break;
                }

                for(int j = 0; j < origin.length && !target[i].equals(origin[j]); ++j) {
                    if (j == origin.length - 1) {
                        list.add(target[i]);
                    }
                }
            }

            i = 0;
            returnArray = new String[list.size()];

            for(Iterator var7 = list.iterator(); var7.hasNext(); ++i) {
                Object o = var7.next();
                returnArray[i] = (String)o;
            }
        }

        return returnArray;
    }

    public static String subZero(String str) {
        while(str.endsWith("00")) {
            str = str.substring(0, str.length() - 2);
        }

        return str;
    }

    public static int stringLength(String str, int bs) {
        if (StringUtils.isBlank(str)) {
            return 0;
        } else {
            StringBuilder replaceStr = new StringBuilder("");

            for(int i = 0; i < bs; ++i) {
                replaceStr.append("0");
            }

            String regex = "[一-龥]*";
            return str.replaceAll(regex, replaceStr.toString()).length();
        }
    }

    public static String trim(Object obj) {
        return obj != null ? obj.toString().trim() : null;
    }

    public static String tran0(String str) {
        return !"0".equals(str) && !"0.0".equals(str) && !"0.00".equals(str) ? str : "";
    }

    public static String nvlToEmpty(String str) {
        return null == str ? "" : str;
    }

    public static String null2zero(String str) {
        if (StringUtils.isBlank(str) || "null".equalsIgnoreCase(str)) {
            str = "0";
        }

        return str;
    }
}

