package com.example.cloud.company.common.constants;

/**
 * <p>
 * Project: 深圳纳服平台
 * </p>
 *
 * <p>
 * Function: [功能模块：描述大概即可]
 * </p>
 *
 * <p>
 * Description: [功能描述：尽量详细描述功能实现内容]
 * </p>
 *
 * <p>
 * Copyright: Copyright(c) 2013-2022 税友集团
 * </p>
 *
 * <p>
 * Company: 税友软件集团有限公司
 * </p>
 *
 * @author zpg
 *
 * @date 2015-5-12
 *
 * @version 1.0
 */

public class WssbConstants {

    /** 增值税一般纳税人 */
    public static final String ZZSNSRLX_ZZSYBNSR = "201";
    /** 辅导期增值税一般纳税人 */
    public static final String ZZSNSRLX_FDQ_ZZSYBNSR = "202";
    /** 简易办法征收增值税一般纳税人 */
    public static final String ZZSNSRLX_JYBF_ZZSYBNSR = "203";
    /** 按适用税率征收增值税小规模纳税人 */
    public static final String ZZSNSRLX_SYSL_XGMNSR = "204";
    /** 按征收率征收增值税小规模纳税人 */
    public static final String ZZSNSRLX_ZSL_XGMNSR = "205";

    /** 申报种类-申报月、季、年 */
    public static final String SBZL_SBYF_YB = "1";
    public static final String SBZL_SBYF_JB = "3";
    public static final String SBZL_SBYF_NB = "12";

    /** 增值税征收项目代码 */
    public static final String ZSXM_GS_ZZS_DM = "10101";
    /** 消费税征收项目代码 */
    public static final String ZSXM_GS_XFS_DM = "10102";

    /** X小规模季报 **/
    public static final String ZZS_XGMNSR_SBZL_JB = "10103";
    /** 文化事业建设费征收项目代码 */
    public static final String ZSXM_GS_WHSYJSF_DM = "30217";
    /** 所得税征收项目代码 */
    public static final String ZSXM_GS_SDS_DM = "10104";
    /** 个人所得税征收项目代码(包含储蓄存款利息5%和储蓄存款利息20%) */
    public static final String ZSXM_GS_GRSDS_DM = "10106";
    /** 废弃电器征收项目代码 **/
    public static final String ZSXM_GS_FQDQ_DM = "30175";
    /** 房产税征收项目代码 **/
    public static final String ZSXM_GS_FCS_DM = "10110";
    /**非正常户往期申报(个人所得税)代码*/
    public static final String FZCH_WQSB_GRSDS_DM = "10106FZCH";

    // end : add by lyd 2014-11-22 for 财务报表申报
    public final static String SBZL_GD_ZCSB = "11"; // 正常申报
    public final static String SBZL_GD_ZCBB = "21"; // 自查补报
    public final static String SBZL_GD_CDEBS = "31"; // 超定额补税
    /** 定期定额个体工商户分月汇总征收项目代码 */
    public static final String ZSXM_GS_DQDEGTGSHFYHZ_DM = "32001";
    /** 定期定额自行申报项目代码 */
    public static final String ZSXM_GS_DQDEZXSB_DM = "32002";
    /** 城镇土地使用税申报项目代码 */
    public static final String ZSXM_GS_CZTDSYS_DM = "10112";
    /** 印花税征收项目代码 */
    public static final String ZSXM_GS_YHS_DM = "10111";

    /**城市维护建设税附加税征收项目代码*/
    public static final String ZSXM_GS_FJS_CSWHJSS_DM = "10109";

    /**地方教育附加附加税征收项目代码*/
    public static final String ZSXM_GS_FJS_DFJYFJ_DM = "30216";

    /**教育费附加附加税征收项目代码*/
    public static final String ZSXM_GS_FJS_JYFFJ_DM = "30203";
    /**18版企业所得税查账征收sbzlDm*/
    public static final String QYSDS_CZZS18_SBZL_DM = "10448";
    /**8版企业所得税核定征收sbzlDm*/
    public static final String QYSDS_HDZS18_SBZL_DM = "10446";
    /**18版企业所得税A类分支机构sbzlDm*/
    public static final String QYSDS_AFZJG18_SBZL_DM = "10447";

}
