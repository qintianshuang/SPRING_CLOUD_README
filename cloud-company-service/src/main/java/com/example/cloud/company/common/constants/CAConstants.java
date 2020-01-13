package com.example.cloud.company.common.constants;

/**
 * <p>
 * 标题: 深圳纳税服务平台
 * </p>
 * <p>
 * 描述: CA相关常量类
 * </p>
 * <p>
 * 版权: 税友软件集团股份有限公司
 * </p>
 * <p>
 * 创建时间: 2014-12-13
 * </p>
 * <p>
 * 作者: mjt
 * </p>
 * <p>
 * 修改历史记录：
 * </p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class CAConstants {

    /** 接收和处理征管电子签名权限推送服务 */
    public static final String BUSINESS_DZQM_SJTB = "DZQM.SJTB.Ctais.ETAX";
    /** BUSINESS_DZQM_SJTB的返回businessid */
    public static final String BUSINESS_DZQM_SJTB_RTN = "DZQM.SJTB.ETAX.Ctais";
    /** CA电子签名服务器请求类别 打开设备 */
    public static final String CA_QQLB_OPEN = "szcaOpenDevice";
    /** CA电子签名服务器请求类别 关闭设备 */
    public static final String CA_QQLB_CLOSE = "szcaCloseDevice";
    /** CA电子签名服务器请求类别 通信验证 */
    public static final String CA_QQLB_HELLO = "szcaServerHello";
    /** CA电子签名服务器请求类别 身份验证 */
    public static final String CA_QQLB_AUTH = "szcaServerAuth";
    /** CA电子签名服务器请求类别 签名 */
    public static final String CA_QQLB_SIGN = "szcaSign";
    /** CA电子签名服务器请求类别 验签 */
    public static final String CA_QQLB_VERIFY = "szcaVerify";
    /** 是否启用模拟CA测试系统 */
    public static final String IS_CA_TEST = "IS_CA_TEST";
    /** KEY CA签名串*/
    public static final String KEY_CERT = "KEY_CERT";
    /** KEY CA签名前数据*/
    public static final String KEY_SIGNED = "KEY_SIGNED";
    /** KEY CA签名后数据*/
    public static final String KEY_SIGNDATA = "KEY_SIGNDATA";

}
