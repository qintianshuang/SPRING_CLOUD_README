package com.example.cloud.company.common.constants;

/**
 * <p>
 * Project: 通用申报产品平台通用业务构件库
 * </p>
 *
 * <p>
 * Function: [功能模块：]
 * </p>
 *
 * <p>
 * Description: [功能描述：]
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
 * @author 刘信
 *
 * @version 1.0
 */
public class SbzxXtcsConstants {

    /** 允许申报作废状态 */
    public static final String ALLOW_SBZF_SBZT = "ALLOW_SBZF_SBZT";

    /** 不需要录入征管的申报种类 */
    public static final String NEEDENT_HXZG_SBZL = "NEEDENT_HXZG_SBZL";

    /** 系统参数：允许申报作废的状态 */
    public static final String XTCS_ALLOW_SBZF_SBZT = "ALLOW_SBZF_SBZT";

    /** 系统参数：不允许作废的申报种类 */
    public static final String XTCS_NOTAVIL_SBZL = "XTCS_NOTAVIL_SBZL";

    /**
     * 需要进行缓冲重发的交易编号列表
     */
    public static final String TRADEID_NEED_RECOUP = "TRADEID_NEED_RECOUP";

    /**
     * 缴税获取网厅登录的URL
     */
    public static final String DZJS_LOGIN_URL = "DZJS_LOGIN_URL";

    /**
     * 缴税获取网厅登录的ACTION
     */
    public static final String DZJS_LOGIN_ACTION = "DZJS_LOGIN_ACTION";

    /**
     * 补偿一次最大处理条数
     */
    public static final String MAX_RECOUP_NUMBER = "MAX_RECOUP_NUMBER";

    /**
     * 最大补偿处理次数
     */
    public static final String BCJZ_TIMEOUT = "BCJZ_TIMEOUT";

    /**
     * 补偿延迟时间(min)
     */
    public static final String SBYC_RECOUP_DELAY = "SBYC_RECOUP_DELAY";

    /**
     * 异步组件目标节点名称（申报）
     */
    public static final String ASYN_SB_TARGETNAME = "ASYN_SB_TARGETNAME";

    /**
     * 呼叫中心测试用户模拟报文存放路径
     */
    public static final String TEST_CONFIG_FILEPATH = "TEST_CONFIG_FILEPATH";

    /**
     * 局端自动换证标识(N不开启Y开启)
     */
    public static final String CLIENT_ZDHZ_CONTROL = "CLIENT_ZDHZ_CONTROL";

    /**
     * 申报异常处理：处理X分钟之前申报状态仍处于2000的数据 单位：分钟
     */
    public static final String SBYCCL_INTERVAL_TIME = "SBYCCL_INTERVAL_TIME";

    /**
     * 申报年报的最迟申报日期
     */
    public static final String LATESTNBSBQX = "latestNBSBQX";

    /**
     * 是否强制要求CA申报
     */
    public static final String CA_YQCASB = "CA_YQCASB";

    /** 财务报表上期校验 */
    public static final String CWBB_SQJY = "CWBB_SQJY";

    /** 是否允许逾期申报 true/false */
    public static final String ALLOW_YQSB = "ALLOW_YQSB";

    /** 申报缴税期限校验方式 DB/GT3 */
    public static final String SBQXJYFS = "SBQXJYFS";

    /** 纳税人端请求是否每次获取最新期初信息 Y/N */
    public static final String RENEWQCXX = "RENEWQCXX";

    /** 扣款全局解耦参数，0：耦合的，1：解耦的 */
    public static final String KK_COUPLED = "KK_COUPLED";

    /** 银联扣款间隔时间，单位：分钟 */
    public static final String KK_UNION_PAY_INTERVAL = "KK_UNION_PAY_INTERVAL";

    public static final String QDID_SERVYOUGLPT = "servyouGlpt";

    /**增值税票表比对开关*/
    public static final String ZZS_PBBD_SWITCH = "zzsPbbdSwitch";

    /** 历史报表查询url */
    public static final String HISTORY_REPORT_QUERY_URL = "HISTORY_REPORT_QUERY_URL";

    /** 财务报表征收项目代码 */
    public static final String CWBB_ZSXMDM = "CWBB_ZSXMDM";

    /** 根据系统参数开关判断申报状态不明时是否插入作废状态补偿查询队列*/
    public static final String SBZFZ_ASYN_SWITCH = "SBZFZ_ASYN_SWITCH";

    /**录入人代码*/
    public static final String GT3_SLRY_DM = "GT3_SLRY_DM";

    /**第三方申报接入模式 E接入模式走校验/T转发模式直接发送到金三 */
    public static final String SBZX_JRFS = "SBZX_JRFS";

    /** 第三方申报同异步模式，ASYN异步接入/SYN同步接入 */
    public static final String THIRD_SBTJ_MODEL = "THIRD_SBTJ_MODEL";

    /** 逾期未认定纳税人是否强制下发一般纳税人, Y是/N否 */
    public static final String YQWRD_ISYBNSR = "YQWRD_ISYBNSR";

    /** 允许申报的所得税年报版本*/
    public static final String XT_SDS_VESION = "XT_SDS_VESION";

    /** 是否需要进行财务报表申报顺序校验*/
    public static final String XTCS_SB_BBSX_JY = "XTCS_SB_BBSX_JY";

    /**允许申报的纳税人状态（增值税预缴申报）*/
    public static final String XTCS_SB_ZZSYJ_NSRZT = "XTCS_SB_ZZSYJ_NSRZT";

    /**是否将特定EJB请求发往地税*/
    public static final String SENDEJBTOGDSBZ = "SENDEJBTOGDSBZ";

    /** 消费税 成品油 比对标志 */
    public static final String XFS_CPY_YCSBD = "XFS_CPY_YCSBD";

    /** 第三方接入时返回报文类型 XML/JSON */
    public static final String THIRD_GT3RETURN_TYPE = "THIRD_GT3RETURN_TYPE";

    /** B类年度企业所得税停用标志*/
    public static final String BLHSQJTYBZ = "BLHSQJTYBZ";

    /** 金三FTP上传地址 */
    public static final String GT3_FTP_FILEPATH = "GT3_FTP_FILEPATH";

    /** 国地税联合启用标志，如果为Y则需要进行地税业务处理*/
    public static final String GDSLHQYBZ = "GDSLHQYBZ";

    /** 事中监控停用申报种类*/
    public static final String SZJK_DISABLED_SBZL = "SZJK_DISABLED_SBZL";

    /** 不需要备案的减免信息减免代码|征收项目逗号分隔(附加税）*/
    public static final String NOT_NEED_BA_JMXX_FJS = "NOT_NEED_BA_JMXX_FJS";

    /** 不需要备案的减免信息减免代码|征收项目逗号分隔(印花税）*/
    public static final String NOT_NEED_BA_JMXX_YHS = "NOT_NEED_BA_JMXX_YHS";

    /** 不需要备案的减免信息减免代码|征收项目逗号分隔(残疾人就业保障金）*/
    public static final String NOT_NEED_BA_JMXX_CJR = "NOT_NEED_BA_JMXX_CJR";

    /** 给客户端简易核定的申报种类代码*/
    public static final String CLIENT_JYHD_DSSBZLS = "CLIENT_JYHD_DSSBZLS";

    /** 无需扣款金额*/
    public static final String NEED_NOT_KKJE = "NEED_NOT_KKJE";

    /**公路路损的自然人税务机关代码*/
    public static final String FSSR_LSPC_ZRR_SWJGDM = "FSSR_LSPC_ZRR_SWJGDM";

    /**房产税是否区分从价从租*/
    public static final String SEPARATE_FCS_CJCZ = "SEPARATE_FCS_CJCZ";

    /**车船税报文发送电子资料库启用标志*/
    public static final String CCS_BW_SENDTODZZLK = "CCS_BW_SENDTODZZLK_QYBZ";

    /**强制刷新redis核定信息的间隔时间，单位分*/
    public static final String FORCE_RENEW_TIMEOUT = "FORCE_RENEW_TIMEOUT";

    /**纳税人发起刷新时校验核定信息的间隔时间，单位分*/
    public static final String NSR_RENEW_TIMEOUT = "NSR_RENEW_TIMEOUT";

    /**税款系统webservice渠道*/
    public static final String SKXT_CHANNEL_ID = "SKXT_CHANNEL_ID";

    /**税款系统webservice密码*/
    public static final String SKXT_IDENTITYTYPE = "SKXT_IDENTITYTYPE";

    /**税款系统webservice地址*/
    public static final String SKXT_WEBSERVICE_URL = "SKXT_WEBSERVICE_URL";

    /**税款系统webservice方法名称*/
    public static final String SKXT_WEBSERVICE_METHOD = "SKXT_WEBSERVICE_METHOD";

    /**是否切换新版发票管理系统Y是，其他否*/
    public static final String SKXT_SWITCH = "SKXT_SWITCH";

    /**是否切换新版电子抵账管理系统Y是，其他否*/
    public static final String DZZL_NEW_SWITCH = "DZZL_NEW_SWITCH";

    /**对于税控系统是否启用MOCK方式，配置为Y启用，其他情况不启用*/
    public static final String SKXT_MOCK = "SKXT_MOCK";

    /**停用申报、采集附报资料上传功能*/
    public static final String SBZLBS_SWITCH_OFF = "SBZLBS_SWITCH_OFF";

    /**电子底账查询接口url地址*/
    public static final String DZDZ_CXJK_URL = "DZDZ_CXJK_URL";

    /**电子底账查询接口系统唯一标识符*/
    public static final String DZDZ_CXJK_XTID = "DZDZ_CXJK_XTID";

    /**电子底账查询接口密钥KEY*/
    public static final String DZDZ_CXJK_APPKEY = "DZDZ_CXJK_APPKEY";

    /**电子底账查询接口AES密钥*/
    public static final String DZDZ_CXJK_AESKEY = "DZDZ_CXJK_AESKEY";

    /**是否启用MOCK方式，启用DZDZ本地模拟表，配置为Y启用，其他情况不启用*/
    public static final String DZDZ_MOCK = "DZDZ_MOCK";
}

