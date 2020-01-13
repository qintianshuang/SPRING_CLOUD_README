package com.example.cloud.company.common.enums;

/***
 * 申报基础校验枚举值
 */
public enum SbjyCodeEnum {

    QZD_PD_CODE("qzdPd", "起征点比对结果",""),
    QZD_CODE("qzd", "起征点",""),
    QZD_30W_CODE("qzd30w", "起征点30W","300000"),
    BDGZ_ID_CODE("bdgzId", "小规模票表比对规则ID",""),
    BDJG_CODE("bdjg", "小规模票表比对结果标志",""),
    F_GTH_CODE("0", "个体户标志【0非个体户】",""),
    GTH_CODE("1", "个体户标志【1个体户】",""),
    F_HWDSHBZ_CODE("0", "货物非定税户标志【0非定税户】",""),
    HWDSHBZ_CODE("1", "货物定税户标志【1定税户】",""),
    F_FWDSHBZ_CODE("0", "服务非定税户标志【0非定税户】",""),
    FWDSHBZ_CODE("1", "服务定税户标志【1定税户】",""),
    YCSBDXXVO_CODE("bdjg", "票表比对记录对象",""),
    YSHWLW_CODE("yshwlw", "应税货物劳务",""),
    YSFW_CODE("ysfw", "应税服务、不动产和无形资产",""),
    YSHWLW_CSWHJSF_CODE("X", "应税货物劳务城市维护建设税","yshwlw"),
    YSHWLW_JYFFJ_CODE("Y", "应税货物劳务教育费附加","yshwlw"),
    YSHWLW_DFJYFJ_CODE("Z", "应税货物劳务地方教育附加","yshwlw"),
    YSFW_CSWHJSF_CODE("Q", "应税服务、不动产和无形资产城市维护建设税","ysfw"),
    YSFW_JYFFJ_CODE("S", "应税服务、不动产和无形资产教育费附加","ysfw"),
    YSFW_DFJYFJ_CODE("T", "应税服务、不动产和无形资产地方教育附加","ysfw");

    private String code;
    private String name;
    private String desc;

    /***
     * 通过code获取name值
     * @param code
     * @return
     */
    public static String getName(String code) {
        SbjyCodeEnum[] values = SbjyCodeEnum.values();
        for (SbjyCodeEnum value : values) {
            if (value.code.equals(code)) {
                return value.name;
            }
        }
        throw new RuntimeException("请输入正确的code!");
    }

    /***
     * 通过code获取枚举对象
     * @param code
     * @return
     */
    public static SbjyCodeEnum getSbjyCodeEnum(String code) {
        SbjyCodeEnum[] values = SbjyCodeEnum.values();
        for (SbjyCodeEnum value : values) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new RuntimeException("请输入正确的code!");
    }

    SbjyCodeEnum(String code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
