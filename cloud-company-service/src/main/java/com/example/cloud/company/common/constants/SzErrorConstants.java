package com.example.cloud.company.common.constants;

/**
 * <p>
 * 标题: 深圳纳服平台
 * </p>
 * <p>
 * 功能描述:
 * </p>
 * 纳服：80482501-80482600 （100）<br>
 * 申报：80482601-80482700 （100）<br>
 * 征收：80482701-80482800 （100）<br>
 * 其他：80482801-80482900 （100）<br>
 *
 *
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
 * ====================================================================<br>
 */
public class SzErrorConstants {

    // ************************通用：80482501-80482600****************************//
    /** 保存反馈信息发生错误 */
    public static final int ERROR_SAVE_RESPONSE = 80482501;
    /** 获取纳税人信息缓存失败 */
    public static final int ERROR_NSRXX_CACHE_FAIL = 80482502;
    /** CA解析申报请求报文失败 */
    public static final int ERROR_CA_CONTENTCONTROL_FAIL = 80449503;
    /** 获取反馈信息失败。 */
    public static final int ERROR_GET_RESPONSE = 80449504;
    /** CA通信验证异常。 */
    public static final int ERROR_CA_HELLO = 80449505;
    /** CA身份验证异常。 */
    public static final int ERROR_CA_AUTH = 80449506;
    /** CA验签异常。 */
    public static final int ERROR_CA_VERIFY = 80449507;
    /** CA服务器异常。 */
    public static final int ERROR_CA_SERVER_EXCEPTION = 80449508;
    /** 查询CA资格信息异常。 */
    public static final int ERROR_CA_QUERY_CAZGXX = 80449509;
    /** 系统要求CA企业必须使用CA，您未报送签名信息！ */
    public static final int ERROR_CA_WQM = 80449510;

    // ************************申报征收：80482601-80482800****************************//
    /** 保存申报情况表失败 */
    public static final int ERROR_SBXX_SAVE_FAIL = 80482601;
    /** SB02 基础校验 中间库纳税人状态校验失败 */
    public static final int ERROR_SB02_JCJY_ZJKNSRZTJY_FAIL = 80482602;
    /** SB02 申报状态更新失败 */
    public static final int ERROR_SB02_SBZT_UPDATE_FAIL = 80482603;
    /** 在当前所属时期没有需要申报的税种，请确认！ */
    public static final int ERROR_SB01_HDFKVO_NULL = 80482604;
    /** SB01 客户端发起的请求报文为空 */
    public static final int ERROR_SB01_QQBW_NULL = 80482605;
    /** 系统异常，核定信息提取失败 */
    public static final int ERROR_HDXX_SYS_FAIL = 80482606;
    /** SB01 核定信息提取时WSXXS节点组织失败 */
    public static final int ERROR_HDXX_WSXXSBUILD_FAIL = 80482607;
    /** SB01 核定信息提取时SBBS节点组织失败 */
    public static final int ERROR_HDXX_SBBSSBUILD_FAIL = 80482608;
    /** 一般纳税人增值税特色报文保存失败 */
    public static final int ERROR_YBNSRZZS_TSBW_SAVE_FAIL = 80482609;
    /** SB01 核定信息提取时获取纳税人税费种认定信息失败 */
    public static final int ERROR_HDXX_QUERYSFZRDXX_FAIL = 80482610;
    /** SB01 核定信息提取时保存中间库失败 */
    public static final int ERROR_SB01_HDXXSAVE_FAIL = 80482611;
    /** SB01 核定信息提取时不存在有效的税费种认定信息 */
    public static final int ERROR_SB01_SFZRDXX_NULL = 80482612;
    /** SB01 核定信息提取时调用征管接口获取期初信息失败 */
    public static final int ERROR_SB01_EJB_QCXX_FAIL = 80482613;
    /** SB01 核定信息提取时期初信息转申报种类节点失败 */
    public static final int ERROR_SB01_TRAN_SBZL_FAIL = 80482614;
    /** 特色报文解析异常 */
    public static final int ERROR_TSBW_PARSE = 80482615;
    /** 附表三业务报文解析失败 */
    public static final int ERROR_YBNSR_FB3_PARSE = 80482616;
    /** 解析申报作废业务请求失败！ */
    public static final int ERROR_SB06_QQBWJX = 80482617;
    /** 申报作废，请求参数不允许为空！ */
    public static final int ERROR_SB06_QQCS_NULL = 80482618;
    /** 组织申报作废业务反馈失败！ */
    public static final int ERROR_SB06_QQFK = 80482619;
    /** 申报作废失败，纳税人信息获取失败！ */
    public static final int ERROR_SB06_NSRXXHQSB = 80482620;
    /** 申报作废失败，中间库申报情况查询失败！ */
    public static final int ERROR_SB06_SBQK_ERROR = 80482621;
    /** 申报作废失败，中间库未查询到申报信息！ */
    public static final int ERROR_SB06_SBQK_NULL = 80482622;
    /** 申报作废失败，中间库当前申报状态不允许作废！ */
    public static final int ERROR_SB06_SBZT = 80482623;
    /** 申报作废失败,征管返回异常:@v1@ */
    public static final int ERROR_SB06_HXZG_FAIL = 80482624;
    /** 申报作废失败，征管请求报文组织失败！ */
    public static final int ERROR_SB06_BWBUILD_FAIL = 80482625;
    /** 跨境应税服务免税企业情况调查表特色报表入库失败 */
    public static final int ERROR_KJYS_BWBUILD_FAIL = 80482626;
    /** 大额发票请求报文解析失败 */
    public static final int ERROR_DP01_PARSE_FAIL = 80482627;
    /** 大额发票反馈报文组织失败 */
    public static final int ERROR_DP01_BUILD_FAIL = 80482628;
    /** 大额发票上传失败，数据库异常 */
    public static final int ERROR_DP01_DBDOWN_FAIL = 80482629;
    /** 大额发票上传失败，未获取到您的纳税人信息 */
    public static final int ERROR_DP01_NSRXX_NULL = 80482630;
    /** 大额发票上传失败，纳税人基本信息获取失败 */
    public static final int ERROR_DP01_NSRXX_FAIL = 80482631;
    /** 申报失败，中间库申报情况保存失败（数据库挂） */
    public static final int ERROR_SB02_SBQKSAVE_FAIL = 80482632;
    /** 申报作废失败，不允许作废申报的申报种类！ */
    public static final int ERROR_SB06_SBZL_NOTAVIL = 80482633;
    /** 申报作废失败，中间库作废失败！ */
    public static final int ERROR_SB06_MID_FAIL = 80482634;
    /** 申报失败，补偿状态校验时查询失败 */
    public static final int ERROR_SB02_BCSBJY_QUERY = 80482635;
    /** 调用核心征管失败,具体原因:@v1@ */
    public static final int ERROR_SB02_BCHXZG_FAIL = 80482636;
    /** 批量保存异步数据失败 */
    public static final int ERROR_SB02_SAVE_WTDZ_FAIL = 80482637;
    /** 批量保存委托代征数据失败 */
    public static final int ERROR_SB02_SAVE_ASYNMSG_FAIL = 80482638;
    /** 暂时未获取到反馈信息。 */
    public static final int ERROR_SB02_GETFK_FAIL = 80482639;
    /** 申报失败，消费税主表中存在重复应税消费品目 */
    public static final int ERROR_SB02_LJJY_XFSMULTIZSPM = 80482640;
    /** 申报失败，解析消费税申报报文失败 */
    public static final int ERROR_SB02_LJJY_XFSPARSESBBW = 80482641;
    /** 所得税管理企业报告表申报校验 */
    public static final int ERROR_SDSGLQYBGB_FAIL = 80482642;
    /** 完税证明下载 */
    public static final int ERROR_JK04_PARSE_FAIL = 80482643;
    /** 重复申报校验(入中间库)失败 */
    public static final int ERROR_CFSBJY_FAIL = 80482644;
    /** 上传证书保存失败 */
    public static final int ERROR_SCZS_SAVE_FAIL = 80482645;
    /** 查询证书失败 */
    public static final int ERROR_ZS_QUERY_FAIL = 80482646;
    /** 获取委托代征纳税人集合失败 */
    public static final int ERROR_QUERY_ALL_WT_FAIL = 80482647;
    /** 委托代征核定信息下载失败 */
    public static final int ERROR_WT_HD_XZ_FAIL = 80482648;
    /** 网上申报控制查询失败 */
    public static final int ERROR_SB02_WSSBKZ_FAIL = 80482649;
    /** 由于系统升级，在@v1@到@v2@内暂停申报业务 */
    public static final int ERROR_SB02_WSSBKZ_UNPASS = 80482650;
    /** 查询企业类别失败 */
    public static final int ERROR_QUERY_QYLB_FAIL = 80482651;
    /** 用户为批量扣款用户不能进行申报 */
    public static final int ERROR_PLKK_NO_SB = 80482652;
    /** 抄报税清卡状态下载解析报文失败 */
    public static final int ERROR_CB02_PARSE = 80482653;
    /** 您本月还未抄报，请抄报完成之后再申报 */
    public static final int ZZS_XGM_QK = 80482654;
    /** 委托代征申报报文解析失败 */
    public static final int WTDZ_PARSE_SB = 80482655;
    /** 校验委托代征资格失败 */
    public static final int QUERY_WTDZ_ZG_FAIL = 80482656;
    /** 没有委托代征资格 */
    public static final int NOT_WTDZ_ZG = 80482657;
    /** 组织委托代征反馈数据失败 */
    public static final int FK_WTDZ_DATA_FAIL = 80482658;
    /** 查询商场所属商户集合失败 */
    public static final int FIND_SH_LIST_FAIL = 80482659;
    /** 保存委托代征数据失败 */
    public static final int SAVE_WTDZ_DATA_FAIL = 80482660;
    /** 保存税款明细失败 */
    public static final int SAVE_SKMX_FAIL = 80482661;
    /** 正在进行委托代征申报 */
    public static final int WTDZ_SBZ = 80482662;
    /** 您没有进行委托代征申报 */
    public static final int WTDZ_WSB = 80482663;
    /** 台帐征收附表报文解析失败 */
    public static final int SDS_PARSE_TZZS = 80482664;
    /** 台帐征收入库失败 */
    public static final int SDS_TZZSRK_DAO = 80482665;
    /** @v1@纳税人没有小规模纳税人资格 */
    public static final int NOT_XGM_ZG = 80482666;
    /** @v1@纳税人未登记增值税小规模 */
    public static final int SH_NOT_ZSPM = 80482667;
    /** @v1@纳税人获取纳税人信息失败 */
    public static final int GET_NSRXX_FAIL = 80482668;
    /** 申报作废失败，超过申报期限 */
    public static final int ERROR_SB06_NSQX_FAIL = 80482669;
    /** 您还未抄税，请选择网上抄税，或者到大厅抄税。 */
    public static final int ZZS_YBNSR_QK = 80482670;
    /** 一般纳税人校验分支机构是否申报，分支机构没有申报，总机构不能申报 */
    public static final int HDXX_ZZS_YBNSR_ZJGSB = 80482671;
    /** 上次申报失败，请重新申报 */
    public static final int WTDZ_SBSB = 80482672;
    /** @v1@纳税人已在其他商场进行申报 */
    public static final int WTDZ_SH_YSB = 80482673;
    /** 征收项目：@v1@在税费中认定信息中同时存在两种不同纳税期限信息的征收品目，请前往大厅进行更正！ */
    public static final int ZSXM_TS_HAS_YB_AND_JB = 80482674;
    /** @v1@纳税人状态校验不通过 */
    public static final int MSG_NSRZTJYBTG = 80482675;
    /** 所得税基本信息保存失败 */
    public static final int ERROR_SB_SDSNB_JBXXSAVA = 80482676;
    /** 请先下载基本信息！ */
    public static final int ERROR_SB01_XZJBXX = 80482677;
    /** 所得税年报风险查询请求报文解析失败 */
    public static final int ERROR_PARSE_SDSNBFXQUERY_FAIL = 80482678;
    /** 业务报文纳税人登记序号为空 */
    public static final int ERROR_NSRDJXH_NULL = 80482679;
    /** 组装所得税年报风险原因查询反馈报文失败 */
    public static final int ERROR_BUILD_SDSNBFXQUERY_FAIL = 80482680;
    /** 您的财务报表还没有申报，请先申报财务报表 */
    public static final int ERROR_CWBBW_WSB = 80482681;
    /** 企业所得税年报没有申报，请先申报企业所得税年报！ */
    public static final int ERROR_QYSDSNB_WSB = 80482682;
    /** 上年度，最后征期的企业所得税月（季）度申报您还未申报，不允许进行年度申报，请先进行月（季）度申报。 */
    public static final int ERROR_QYSDSNB_HDXX_FALL = 80482683;
    /** 您征收项目为：@v1@ 已在税局大厅做过更正申报，不允许进行申报作废 **/
    public static final int ERROR_SB06_SGZSB = 80482684;
    /** SB02 CA验签失败 **/
    public static final int ERROR_SB02_CAYQSB = 80482685;
    /** SB01 获取网上申报期限失败 **/
    public static final int ERROR_SB01_SBQXSB = 80482686;
    /** 申报基础校验上期财务报表查询征管申报情况失败 **/
    public static final int ERROR_SB02_JCJY_BXSB_CWBB_HQSBQK_FAIL = 80482687;
    /** 申报基础校验上期财务报表未申报 **/
    public static final int ERROR_SB02_JCJY_CWBB_SXJY_FAIL = 80482688;
    /** 非正常户往期申报异步查询 **/
    public static final int ERROR_SZSB61_FZCHWQSB_YBCX = 80482689;

    /** 非正常户往期申报发生异常 **/
    public static final int ERROR_SZSB61_FZCHWQSB_ERROR = 80482690;

    // ************************征收：80482701-80482800****************************//
    /** 三方协议查询失败！ */
    public static final int ERROR_JS03_SFXY_QUERT_SB = 80482701;
    /** 解析扣款报文失败！ */
    public static final int ERROR_JS_PARSE = 80482702;
    /** 解密失败！ */
    public static final int ERROR_CAJM_FAIL = 80482703;
    /** 纳税人识别号为空！ */
    public static final int ERROR_KK_NSRSBH_NULL = 80482704;
    /** 报文解析失败！ */
    public static final int ERROR_JS04_PARSE = 80482705;
    /** 跨境应税服务免税企业情况调查表附表001业务报文解析失败 */
    public static final int ERROR_KJYSFWMSQYQKDCBFB001JX_FAIL = 80482706;
    /** 跨境应税服务免税企业情况调查表附表002业务报文解析失败 */
    public static final int ERROR_KJYSFWMSQYQKDCBFB002JX_FAIL = 80482707;
    /** 批量保存缴款书信息失败 */
    public static final int ERROR_PL_SAVE_JKSXX_FAIL = 80482708;
    /** 批量保存打印缴款书信息并获取缴款信息VO失败 */
    public static final int ERROR_PL_SAVE_HQ_DYJKSXX_FAIL = 80482709;
    /** 查询税票信息请求报文解析失败 */
    public static final int ERROR_JK01_PARSE_FAIL = 80482710;
    /** 查询税票信息反馈报文组织失败 */
    public static final int ERROR_JK01_BUILD_FAIL = 80482711;
    /** 缴款凭证打印请求报文解析失败 */
    public static final int ERROR_JK03_PARSE_FAIL = 80482712;
    /** 缴款凭证打印反馈报文组织失败 */
    public static final int ERROR_JK03_BUILD_FAIL = 80482713;
    /** 查询电子缴款凭证报文解析失败 */
    public static final int ERROR_JK02_PARSE_FAIL = 80482714;
    /** 查询电子缴款凭证失败(打印历史查询失败) */
    public static final int ERROR_JK02_DYLSXX_FAIL = 80482715;
    /** 查询电子缴款凭证失败(未查询到打印历史查询) */
    public static final int ERROR_JK02_DYLSXX_NULL = 80482716;
    /** 查询电子缴款凭证失败(打印明细查询失败) */
    public static final int ERROR_JK02_DYMXXX_FAIL = 80482717;
    /** 查询电子缴款凭证失败(未查询到打印明细) */
    public static final int ERROR_JK02_DYMXXX_NULL = 80482718;
    /** 查询电子缴款凭证失败(税票信息查询失败) */
    public static final int ERROR_JK02_SPXX_FAIL = 80482719;
    /** 查询电子缴款凭证失败(未查询到税票信息) */
    public static final int ERROR_JK02_SPXX_NULL = 80482720;
    /** 查询电子缴款凭证失败(反馈报文组织失败) */
    public static final int ERROR_JK02_BUILD_FAIL = 80482721;
    /** 查询未缴款信息失败，请求报文中参数为空 */
    public static final int ERROR_JS01_NULL_PARAMTERS = 80482722;
    /** 保存扣款情况失败 */
    public static final int ERROR_SAVE_KKQK_FAIL = 80482723;
    /** 进项发票反馈结果查询请求报文解析失败 */
    public static final int ERROR_FPXXREQUESTJX_FAIL = 80482724;
    /** 分支机构申报表601业务报文解析失败 */
    public static final int ERROR_SBB601YWBWJX_FAIL = 80482725;
    /** 获取已缴税信息失败！ */
    public static final int ERROR_YJSXX_QUERY = 80482726;
    /** 获取未缴税信息失败！ */
    public static final int ERROR_WJSXX_QUERY = 80482727;
    /** 已过缴款期限不允许扣款，请到大厅处理！ */
    public static final int ERROR_JSQX_CHECK = 80482728;
    /** 三方协议扣款失败！原因:@v1@ */
    public static final int ERROR_SFXY_KK = 80482729;
    /** 互联网缴税获取税票号码信息失败 */
    public static final int ERROR_HLWKK_KK = 80482730;
    /** 保存密文失败 */
    public static final int ERROR_SAVE_JMXX = 80482731;
    /** 三方协议信息查询失败 */
    public static final int ERROR_SFXYXXGT3_QUERY_FAIL = 80482732;
    /** 三方协议签订，纳税人存款账户账号信息查询失败 */
    public static final int ERROR_SFXYGT3_CKZHXXQUERY_FAIL = 80482733;
    /** 三方协议签订，从征管获取三方协议号失败 */
    public static final int ERROR_SFXYGT3_SCSFXYH_FAIL = 80482734;
    /** 三方协议签订，保存三方协议信息失败 */
    public static final int ERROR_SFXYGT3_SAVE_FAIL = 80482735;
    /** 三方协议验证，没有待验证的三方协议信息 */
    public static final int ERROR_SFXYGT3_YZQUERY_NULL = 80482736;
    /** 三方协议验证，三方协议验证失败 */
    public static final int ERROR_SFXYGT3_YZ_FAIL = 80482737;
    /** 三方协议撤销，三方协议信息不存在 */
    public static final int ERROR_SFXYGT3_DELQUERY_NULL = 80482738;
    /** 三方协议撤销，三方协议撤销失败 */
    public static final int ERROR_SFXYGT3_DEL_FAIL = 80482739;
    /** 解析JK01反馈报文失败 */
    public static final int ERROR_JK01_RESPONSE_PARSE_FAIL = 80482740;
    /** 解析JK02反馈报文失败 */
    public static final int ERROR_JK02_RESPONSE_PARSE_FAIL = 80482741;
    /** 解析JK03反馈报文失败 */
    public static final int ERROR_JK03_RESPONSE_PARSE_FAIL = 80482742;
    /** 解析JK10请求报文失败 */
    public static final int ERROR_JK10_REQUEST_PARSE_FAIL = 80482743;
    /** 组织JK01请求报文失败 */
    public static final int ERROR_JK01_REQUEST_BUILD_FAIL = 80482744;
    /** 组织JK02请求报文失败 */
    public static final int ERROR_JK02_REQUEST_BUILD_FAIL = 80482745;
    /** 组织JK03请求报文失败 */
    public static final int ERROR_JK03_REQUEST_BUILD_FAIL = 80482746;
    /** 组织JK10请求报文失败 */
    public static final int ERROR_JK10_REQUEST_BUILD_FAIL = 80482747;
    /** 组织JK10反馈报文失败 */
    public static final int ERROR_JK10_RESPONSE_BUILD_FAIL = 80482748;
    /** 解析JK10反馈报文失败 */
    public static final int ERROR_JK10_RESPONSE_PARSE_FAIL = 80482749;
    /** 三方协议验证，征管业务报文返回失败 */
    public static final int ERROR_SFXYGT3_YZ_BUSINESSFAIL = 80482750;
    /** 三方协议撤销，征管业务报文返回失败 */
    public static final int ERROR_SFXYGT3_DEL_BUSINESSFAIL = 80482751;
    /** 查询三方协议号失败 */
    public static final int ERROR_GET_SFXYH_FAIL = 80482752;
    /** 中间库查询不到三方协议信息 */
    public static final int ERROR_GET_SFXYH_NULL = 80482753;
    /** 下载核定时当前时间不支持的纳税期限 */
    public static final int ERROR_HDXX_UNSURPORT_NSQX = 80482754;
    /** 同步异步message数据到mnqqjlb请求报文解析失败 */
    public static final int ERROR_TBASYN_MNQQJL = 80482755;
    /** 交通运输费统一查询失败，车架号为空 **/
    public static final int ERROR_JT01_QQBW = 80482756;
    /** 交通运输费请求报文中车架号对应多个电子档案号 **/
    public static final int ERROR_JT01_DGDZDAH = 80482757;
    /** 交通运输费申报情况查询失败，存在多条申报记录！ **/
    public static final int ERROR_JT01_DGSBXX = 80482758;
    /** 交通运输费申报情况查询失败，组织反馈报文失败！ **/
    public static final int ERROR_JT01_BIULDFK = 80482759;
    /** 交通运输费申报情况查询失败，解析请求报文失败！ **/
    public static final int ERROR_JT01_PARSEQQ = 80482760;
    /** 获取发票代码信息反馈结果查询请求报文解析失败 */
    public static final int ERROR_FPDMXXREQUEST_FAIL = 80482770;
    /** 获取发票种类信息反馈结果查询请求报文解析失败 */
    public static final int ERROR_FPZLXXREQUEST_FAIL = 80482771;
    /** 获取专用发票信息反馈结果查询请求报文解析失败 */
    public static final int ERROR_ZYFPXXREQUEST_FAIL = 80482772;
    /** 获取海关缴款书信息反馈结果查询请求报文解析失败 */
    public static final int ERROR_HGJKSXXREQUEST_FAIL = 80482773;
    /** 获取机动车发票信息反馈结果查询请求报文解析失败 */
    public static final int ERROR_JDCFPXXREQUEST_FAIL = 80482774;
    /** 获取货运发票信息反馈结果查询请求报文解析失败 */
    public static final int ERROR_HYFPXXREQUEST_FAIL = 80482775;
    /** 获取发票领购信息反馈结果查询请求报文解析失败 */
    public static final int ERROR_FPLGXXREQUEST_FAIL = 80482776;

    /** 解析SZJS01请求业务报文失败 */
    public static final int ERROR_SZJS01_PARSE_FAIL = 80482777;
    /** 组织SZJS01业务报文失败 */
    public static final int ERROR_SZJS01_BUILD_FAIL = 80482778;
    /** 解析SZJS02请求业务报文失败 */
    public static final int ERROR_SZJS02_PARSE_FAIL = 80482779;
    /** 组织SZJS02业务报文失败 */
    public static final int ERROR_SZJS02_BUILD_FAIL = 80482780;
    /** 查询微信、手机银行未交款信息出错 */
    public static final int ERROR_SZJS01_CXWXSKXX = 80482781;
    /** 请求的缴款方式与原有方式不一致 */
    public static final int ERROR_SZJS01_JKFSBYZ = 80482782;
    /** 调用多元化缴税平台扣款发生异常 */
    public static final int ERROR_SZJS01_KKQQ = 80482783;
    /** 查询微信、手机银行未交款信息出错 */
    public static final int ERROR_SZJS02_CXWXSKXX = 80482784;
    /** 查询微信、手机银行未交款信息为空 */
    public static final int ERROR_SZJS02_CXWXSKXX_NULL = 80482785;
    /** 开具电子税票号码发送错误 */
    public static final int ERROR_SZJS01_GET_DZSPHM = 80482786;
    /** 作废微信账单时，未找到税票对应账单 */
    public static final int ERROR_SZJS02_NOTFOUND = 80482787;
    /** 调用多元化缴税平台作废账单时发生错误 */
    public static final int ERROR_SZJS02_ZFWXKKXX = 80482788;
    /** 金融业营改增税负专项调查表511业务报文解析失败 */
    public static final int ERROR_SBB511YWBWJX_FAIL = 80482789;
    /** 判断是否逾期申报时，发生错误，缴款期限为空 */
    public static final int ERROR_JKQX_NULL = 80482790;
    /** 正在扣款中，不允许重复发起扣款 */
    public static final int MSG_JS03_KK_ZTJY_KKZ = 80482791;

    /** 扣款信息查询失败 **/
    public static final int ERROR_KK_CX_SB = 80482792;
    /** 您的汇总申报待缴税信息存在重复记录，请到前台大厅处理！ **/
    public static final int ERROR_HZSBSSKK_CFJL = 80482793;
    /** 解析KJJS01请求业务报文失败 */
    public static final int ERROR_KJJS01_PARSE_FAIL = 80482794;
    /** 组织KJJS01业务报文失败 */
    public static final int ERROR_KJJS01_BUILD_FAIL = 80482795;
    /** 解析XgmPl0SbPlJy请求业务报文失败 */
    public static final int ERROR_XgmPl0SbPlJy_PARSE_FAIL = 80482796;
    /** 解析HXZGSB10059请求业务报文失败*/
    public static final int ERROR_HXZGSB10059_PARSE_FAIL = 80482797;
    // ************************其他：80482801-80482900****************************//
    /** 发送异步请求发生错误 */
    public static final int ERROR_SEND_ASYNREQUEST = 80482801;
    /** soa服务处理未知异常 */
    public static final int ERROR_SOA_BUSINESS_HANDLER_UNKNOW = 80482802;
    /** 查询手机号码失败 */
    public static final int QUERY_SJHM_FAIL = 80482803;
    /** 查询不到手机号码 */
    public static final int QUERY_SJHM_NOT_HAVE = 80482804;
    /** 不是登记的手机号码,请重新输入 */
    public static final int QUERY_SJHM_ERROR = 80482805;
    /** 保存手机验证码失败 */
    public static final int SAVE_YZM_FAIL = 80482806;
    /** 发送手机短信验证码失败 */
    public static final int SEND_YZM_FAIL = 80482807;
    /** 解析通用17请求报文失败 */
    public static final int PARSE_TY17_REQUEST_FAIL = 80482808;
    /** 解析通用17反馈报文失败 */
    public static final int PARSE_TY17_RESPONSE_FAIL = 80482809;
    /** 手机验证码错误 */
    public static final int JY_YZM_FAIL = 80482810;
    /** 组织报文失败 */
    public static final int BUILD_FKBWXX = 80482811;
    /** 解析重点税源监控名单查询业务报失败 */
    public static final int ERROR_PARSE_ZDSYJKMD_REQUESTXML = 80482812;
    /** 重点税源监控名单查询失败 */
    public static final int ERROR_ZDSYJKMD_QUERY_FAIL = 80482813;
    /** 查询重点税源监控名单反馈报文拼接失败 */
    public static final int ERROR_BUILD_ZDSYJKMDQUERY_FKBW_FAIL = 80482814;
    /** 此企业未纳入重点税源监控中 */
    public static final int ERROR_QUERY_ZDSYJKMD_NSR_NULL = 80482815;

    /** 解析短信发送请求业务报文失败 */
    public static final int ERROR_SMS_PARSE_FAIL = 80482816;
    /** 组织短信发送结果业务报文失败 */
    public static final int ERROR_SMS_BUILD_FAIL = 80482817;

    /** 小规模申报紧急申报 */
    public static final int ERROR_XGMJJSB_FAIL = 80482817;

    /** 小规模一窗式比对数据加工失败 */
    public static final int ERROR_XGMYCSBD_SJJG_FAIL = 80483716;

}
