package com.example.cloud.company.common.constants;

/**
 * <p>
 * 标题: 深圳纳服平台
 * </p>
 * <p>
 * 功能描述:
 * </p>
 * 提示代码常量类 通用申报错误信息代码段80483501-80482900 <br>
 * 纳服：80483501-80483600 （100）<br>
 * 申报：80483601-80483800 （200）<br>
 * 其他：80483801-80482900 （100）<br>
 * <p>
 * 版权: 税友软件集团股份有限公司
 * </p>
 * <p>
 * 创建时间: 2016-7-12,下午1:30:07
 * </p>
 * <p>
 * 作者：zpg
 * </p>
 * <p>
 * 修改历史记录：
 * </p>
 *
 * ====================================================================<br>
 */
public class SzMsgConstants {

    // 纳服：80483501-80483600*************************************//
    /** 一个纳税人识别号存在多个纳税人信息，不能进行处理。 */
    public final static int HAVE_MUCH_NSRXX = 80483501;
    /** 不存在纳税人信息。 */
    public final static int NOT_EXIST_NSRXX = 80483502;
    /** CA证书解析失败 */
    public final static int CA_PARSER_FAILE = 80483503;
    /** CA证书上传失败 */
    public final static int CA_UPLOAD_FAILE = 80483504;
    /** CA证书下载失败 */
    public final static int CA_DOWNLOAD_FAILE = 80483505;
    /** 版本不对，要升级软件后再发送。 */
    public final static int MESSAGE_STATE_VERSION_ERROR = 80483506;
    /** CA证书下载时请求数据解析失败 */
    public final static int CA_DOWNLOAD_PARSE_FAILE = 80483508;
    /** 自动换证拦截 */
    public final static int MESSAGE_CLIENT_ZDHZLJ_ERROR = 80483509;
    /** 您正在使用深圳市国家税务局网上申报系统，本次申报验证码:@v1@，请妥善保管验证码 */
    public final static int MSG_TY17 = 80483510;
    // 申报：80483601-80483700*************************************//
    /** 申报作废成功! */
    public final static int MSG_SB06_SBZF_GX_SUCCESS = 80483601;
    /** 您已超过申报期限，可能会产生滞纳金 */
    public final static int MSG_SB02_JCJY_SBQX_FAIL = 80483602;
    /** 申报失败，有申报处理正在进行中（补偿中） */
    public final static int MSG_SB02_BCSBJY_FAIL = 80483603;
    /** 申报失败，补偿失败 */
    public final static int MSG_SB02_BCCL_FAIL = 80483604;
    /** 申报数据入征管失败 */
    public final static int MSG_SB02_SB_FAIL = 80483605;
    /** 企业所得税年报A类报表填报不完整 */
    public final static int MSG_SB02_QYSDSA_NOT_ALL = 80483606;
    /** CA证书过期提示信息 */
    public final static int MSG_CAZS_OVER_MESSAGE = 80483607;
    /** CA证书即将过期提示信息 */
    public final static int MSG_CAZS_WILLOVER_MESSAGE = 80483608;
    /** CA证书验证失败提示信息 */
    public final static int MSG_CAZS_FILL_MESSAGE = 80483609;
    /** 非联通CA证书提示信息 */
    public final static int MSG_CAZS_NOTLTCA_MESSAGE = 80483610;
    /** CA证书吊销提示信息 */
    public final static int MSG_CAZS_DEACTIVE_MESSAGE = 80483611;
    /** CA证书解密失败提示信息 */
    public final static int MSG_CAZS_READFILL_MESSAGE = 80483612;
    /** 申报已预缴税款：@v1@大于实际已预缴税款：@v2@，请重新填写 */
    public final static int MSG_WTDZ_YJSKJY_FAIL = 80483613;
    /**申报异常处理：申报失败 */
    public final static int MSG_SB02_YCCL_FAIL = 80483614;
    /** 下载核定信息失败，原因为：您已被置为非正常户，不可以下载核定信息，请联系服务商。 */
    public final static int INFO_SB01_ZZSYBNSRHDXX_ZTQY = 80483615;
    /** SB01 获取网上申报期限为空 **/
    public static final int SB01_SBQXSB_NULL = 80483616;
    /**
     * 《增值税纳税申报表（小规模纳税人适用）》第1、4、7、9、13、15、18、19栏，增值税纳税申报表（小规模纳税人适用）附列资料第3、11
     * 栏合计数与开票系统数据比对失败![申报为:%v1%,开票系统为:%v2%];
     **/
    public static final int SB02_XGM_YCSBD_FAIL = 80483617;
    /** 您为增值税汇总纳税企业，若总机构按分摊预征的，分支机构不下发增值税报表，也不申报增值税。**/
    public static final int SB01_HZNS_ZZS = 80483618;
    /** 申报失败，作废中状态，不允许申报**/
    public static final int MSG_SB02_SBSB_ZFZ = 80483619;
    /** 申报作废失败，征管状态不明**/
    public static final int MSG_SB06_ZFSB_ZTBM = 80483620;
    /** 逾期未认定一般纳税人**/
    public static final int MSG_SB01_YQWRDYBNSR = 80483621;
    /** 关闭小规模票表比对服务**/
    public static final int MSG_XGMPBBD_OFF = 80483622;
    /** 未开具发票负数超过系统设定**/
    public static final int MSG_WKJFP_JK = 80483623;
    /**您为逾期未认定增值税一般纳税人，请至办税大厅前台进行申报！**/
    public static final int MSG_ZZSYBNSR_YQWRD = 80483624;
    /** 申报失败，异常转办中状态，不允许申报**/
    public static final int MSG_SB02_SBSB_YCZBZ = 80483625;
    /** 税务人员代码为空 **/
    public static final int MSG_SB02_SWRY_NULL = 80483626;
    /** 没有有效的加计抵减政策声明 **/
    public static final int MSG_SB02_SYJJDJZCSM_EXISTED = 80483627;
    // 征收：80483701-80483800*************************************//
    /** 未查询到有效的三方协议信息，如有疑问，请联系主管税务机关！ */
    public final static int MSG_SFXYXXGT3_QUERY_EMPTY = 80483701;
    /** 三方协议信息已经存在*/
    public final static int MSG_SFXYXXGT3_EXISTED = 80483702;
    /** 征管中的存款账户账号信息不存在*/
    public final static int MSG_CKZHZHXXGT3_NULL = 80483703;
    /** 三方协议信息保存成功*/
    public final static int MSG_SFXYSAVE_SUCCESS = 80483704;
    /** 三方协议信息征管保存成功,中间库录入失败*/
    public final static int MSG_SFXYSAVE_ZJKLRSB = 80483705;
    /**关于您的税费种认定信息不存在**/
    public final static int MSG_TY06_DJXH_ISNULL = 80483708;
    /** 企业所得税汇总纳税分支机构所得税分配表,总机构分摊所得税额、总机构财政集中分配所得税额、分支机构分摊所得税额三者之和不等于总机构应纳税所得额！ **/
    public final static int MSG_SDSALYJB_ZJGFPB_LJJY = 80483709;
    /** 组织扣款申报报文失败*/
    public final static int ZZ_KK_BW_FAIL = 80483710;
    /** 三方协议状态异常*/
    public final static int ZZ_SFXY_ZT_ERROR = 80483711;
    /** 客户端登录网厅失败*/
    public final static int CLIENT_LOGIN_WEB_FAIL = 80483712;
    /** 已经扣款成功，不允许再次扣款。 */
    public static final int MSG_JS03_YJKKCG = 80453356;

    /** 申报种类已经过期，需要使用新的申报种类进行申报。 */
    public static final int MSG_SBZL_OVERDUE = 80483713;

    /** 小规模一窗式比对数据加工中 */
    public static final int MSG_XGMYCSBD_SJJGZ = 80483717;
}
