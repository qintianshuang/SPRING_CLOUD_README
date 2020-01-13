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
public class XtcsConstants {

    /** 允许申报作废状态 */
    public static final String ALLOW_SBZF_SBZT = "ALLOW_SBZF_SBZT";

    /** 不需要录入征管的申报种类 */
    public static final String NEEDENT_HXZG_SBZL = "NEEDENT_HXZG_SBZL";

    /** 正常纳税人状态，如 20,21,22 */
    public static final String ZC_NSRZT_CTAIS = "ZC_NSRZT_CTAIS";

    /** 附表导入本地路径 */
    public static final String SZFBDR_DATAPATH = "SZFBDR_DATAPATH";

    /** 附表导入CATIS路径 */
    public static final String SZ_FTP_PATH = "SZ_FTP_PATH";

    /** 系统参数配置：统一入口处理不需要保存反馈的常量配置项 */
    public static final String NOTSAVE_FK = "SZ_TY_NOTSAVE_FK";

    /** 系统参数配置：流控限制补偿机制队列大小 */
    public static final String LKXZ_QUEUE_SIZE = "LKXZ_BCJZ_QUEUE_SIZE";

    /** 系统参数配置：流控限制补偿机制超时时间 */
    public static final String LKXZ_BCJZ_TIMEOUT = "LKXZ_BCJZ_TIMEOUT";

    /** 系统参数：是否需要进行辅导期纳税人校验 */
    public static final String XTCS_CHECK_FDQNSR = "check_fdqnsr";
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
     * CA存放路径
     */
    public static final String CA_PATH = "DZJS_LOGIN_URL";
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

    /**
     * CA签名文件保存路径
     */
    public static final String CA_SIGN_PATH = "CA_SIGN_PATH";
    /**
     * CTAIS地址
     */
    public static final String CTAIS_URL = "CTAIS_URL";
    /**
     * CTAIS用户名
     */
    public static final String CTAIS_USER = "CTAIS_USER";
    /**
     * CTAIS密码
     */
    public static final String CTAIS_PWD = "CTAIS_PWD";
    /**
     * 多元化缴税平台地址
     */
    public static final String DYHJS_URL = "DYHJS_URL";
    /**
     * 多元化缴税平台用户名
     */
    public static final String DYHJS_USER = "DYHJS_USER";
    /**
     * 多元化缴税平台密码
     */
    public static final String DYHJS_PWD = "DYHJS_PWD";
    /**
     * 手机银行二维码信息
     */
    public static final String SJYH_EWMXX = "SJYH_EWMXX";
    /**
     * ZMKJ访问地址
     */
    public static final String ZMKJ_URL = "ZMKJ_URL";
    /**
     * ZMKJ用户名
     */
    public static final String ZMKJ_USER = "ZMKJ_USER";
    /**
     * ZMKJ密码
     */
    public static final String ZMKJ_PWD = "ZMKJ_PWD";

    /**
     * 跨境缴税访问地址
     */
    public static final String KJJS_URL = "KJJS_URL";
    /**
     * 跨境缴税用户名
     */
    public static final String KJJS_USER = "KJJS_USER";
    /**
     * 跨境缴税密码
     */
    public static final String KJJS_PWD = "KJJS_PWD";

    /** 证明开具 -操作人员代码 */
    public static final String CZRY_DM = "sjry";

    /** 证明开具 -操作人员税务机关代码 */
    public static final String CZRY_SWJG_DM = "swjgdm";

    /** 财务报表上期校验 */
    public static final String CWBB_SQJY = "CWBB_SQJY";

    /** 财务报表上期申报校验申报种类 */
    public static final String CWBBJY_SBZL_DM="CWBBJY_SBZL_DM";

    /** 汇算清缴客户端版本号 */
    public static final String SDSNBVERSION="SDSNBVERSION";

    /** 小规模票表比对功能开关 */
    public static final String XGMPBBD_ON="XGMPBBD_ON";

    /** 小规模票表比对强制监控 */
    public static final String XGMPBBD_QZJK="XGMPBBD_QZJK";

    /** 最小未开具发票金额 */
    public static final String WKJFPJE_MIN="WKJFPJE_MIN";

    /** 最大应纳税减增金额 */
    public static final String YNSJZJE_MAX="YNSJZJE_MAX";

    /** 最小进项税额转出金额*/
    public static final String JXSZCJE_MIN="JXSZCJE_MIN";

    /** 最大当期农产品抵扣进项税*/
    public static final String NCPDKJXSE_MAX="NCPDKJXSE_MAX";

    /** 最大代扣代缴税收缴款凭证税额*/
    public static final String DKDJPZSE_MAX="DKDJPZSE_MAX";

    /** 最大其他税额8b栏*/
    public static final String QT8B_MAX="QT8B_MAX";

    /** 出口开具专用缴款书预缴税额_填写标志*/
    public static final String CKKJZYJKSYJSE_TXBZ="CKKJZYJKSYJSE_TXBZ";

    /** 应纳税减征额定额控制 */
    public static final String DEKZ_YNSJZE = "DEKZ_YNSJZE";

    /** 允许一窗式比对失败次数  */
    public static final String YCSBD_SBCS_MAX = "YCSBD_SBCS_MAX";

    /**
     * 违章信息申期限在此日期之前的需监控
     */
    public static final String WZXX_XZ_SBQX = "WZXX_XZ_SBQX";
    /**
     * 渠道CHANNEL_ID
     */
    public static final String L1SZDY = "L1SZDY";

    /**
     * 逻辑校验附表4第8行
     */
    public static final String SB_LJJY_FB4_8 = "SB_LJJY_FB4_8";

    /**
     * 货运系统抄报税接口code
     */
    public static final String HY_SYSTEM_CS_CODE = "SWZJ.HYFP.SB.CXFPCBRZHZXX";
}
