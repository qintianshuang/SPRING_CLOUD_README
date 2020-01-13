package com.example.cloud.company.common.build.xgm.qcxml;

import java.util.UUID;

public class CommonUtil {

    public static String createUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
