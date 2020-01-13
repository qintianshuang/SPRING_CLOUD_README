package com.example.cloud.company.common.enums;

import com.example.cloud.company.common.constants.SbxxtsConstants;

/***
 *华云接口返回状态说明
 */
public enum HyCodeEnum {

    //返回成功
    SUCCESS_DATA("200", SbxxtsConstants.SUCCESS),
    //数据加工中
    DATA_LOAD("201", SbxxtsConstants.WAIT_15_MINUTE),
    //未获取到该属期的数据
    NO_DATA("202", SbxxtsConstants.CALL_FOR_HELP),
    //系统级异常
    SYSTEM_ERR("500", SbxxtsConstants.CALL_FOR_HELP),
    //本地系统异常或者网络异常
    LOCAL_NET_ERR("501", SbxxtsConstants.CALL_FOR_HELP),
    //税控盘企业未抄报税
    NOT_CHAO_SHUI("300",SbxxtsConstants.NOT_CHAO_SHUI),
    //发票2.0系统异常
    SKXT_SYSTEM_ERREO("502",SbxxtsConstants.SKXT_SYSTEM_ERREO);

    private String code;
    private String name;

    HyCodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getName(String code) {
        HyCodeEnum[] values = HyCodeEnum.values();
        for (HyCodeEnum value : values) {
            if (value.code.equals(code)) {
                return value.name;
            }
        }
        throw new RuntimeException("请输入正确的code!");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
