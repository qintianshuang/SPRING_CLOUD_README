package com.example.cloud.company.common.build.xgm.qcxml;

import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;
import java.util.regex.Pattern;

public class StringToTwoDecimalAdapter extends XmlAdapter<String, String> {
    private static String kxjsfRegex = "^((-?\\d+.?\\d*)[Ee]{1}[-+]?(\\d{1,3}))$";
    private static Pattern kxjsfPattern;

    public StringToTwoDecimalAdapter() {
    }

    public String marshal(String value) throws Exception {
        boolean flag = false;
        flag = isENnum(value);
        if (flag) {
            BigDecimal b = new BigDecimal(value);
            b = b.setScale(2, 4);
            return b.toPlainString();
        } else {
            return value;
        }
    }

    public String unmarshal(String value) throws Exception {
        return value;
    }

    private static boolean isENnum(String value) {
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

    static {
        kxjsfPattern = Pattern.compile(kxjsfRegex);
    }
}

