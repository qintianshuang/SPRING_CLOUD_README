package com.example.cloud.company.common.enums;


public enum SbztEnum {
    WSB("4000", "未申报"),
    SBCG("0000", "申报成功"),
    SBCG_FBDRCG("0001", "附表导入成功"),
    SBCG_FBDRYC("0002", "附表导入异常"),
    SBCG_FBDRSB("0003", "附表导入失败"),
    SBCG_FBYFS("0004", "附表已发送"),
    SBCG_KK("0005", "申报成功但扣款信息数据推送失败"),
    SBSB("1000", "申报失败"),
    SBSB_CFSB("1001", "重复申报（中间库校验）"),
    SBSB_LJJY_FAIL("1002", "逻辑校验失败"),
    SBSB_BB_PARSER_FAIL("1003", "报表解析失败"),
    SBSB_SBSE_UPDATE_FAIL("1004", "申报税额更新失败"),
    SBSB_CTAIS_CFSBJY_FAIL("1005", "重复申报（核心征管系统校验）"),
    SBSB_CTAIS_SAVE_FAIL("1006", "征管数据保存失败"),
    SBSB_ZJK_SAVE_FAIL("1007", "中间库保存失败"),
    SBSB_JCJY_FAIL("1008", "基础校验失败"),
    SBSB_NSRVO_FAIL("1009", "获取纳税人失败"),
    SBSB_PJBW_FAIL("1010", "拼接全报文失败"),
    SBSB_SAVE_TEBW_FAIL("1011", "保存特色报文失败"),
    SBSB_SBWCL_EXCEPTION("1020", "申报处理异常，系统未处理"),
    SBZ("2000", "申报中"),
    SBZ_WBJKGZ("2001", "调用外部接口批量故障需要补偿处理"),
    SBZ_CS("2002", "申报超时"),
    SBZ_ZFZ("2003", "作废中"),
    SBZF("3000", "申报作废"),
    SBWCL("4000", "已申报未处理");

    private String sbztDm;
    private String sbztMs;

    private SbztEnum(String sbztDm, String sbztMs) {
        this.sbztDm = sbztDm;
        this.sbztMs = sbztMs;
    }

    public String getSbztDm() {
        return this.sbztDm;
    }

    public String getSbztMs() {
        return this.sbztMs;
    }
}
