package com.example.cloud.company.common.enums;
/**
 * <p>Project:  深圳纳服平台</p>
 *
 * <p>Function: [功能模块：三方协议状态枚举类]</p>
 *
 * <p>Description: [功能描述：尽量详细描述功能实现内容]</p>
 *
 * <p>Copyright: Copyright(c) 2013-2022 税友集团</p>
 *
 * <p>Company: 税友软件集团有限公司</p>
 *
 * @author 王臻佳
 *
 * @date 2015-7-10
 *
 * @version 1.0
 */
public enum SfxyztEnum {

    /**
     * 三方协议状态
     */
    SFXYZT_WYZ("01","未验证"),
    SFXYZT_YZTG("02","验证通过"),
    SFXYZT_YZSB("03","验证失败"),
    SFXYZT_XYZZ("04","协议终止");

    SfxyztEnum(String sfxyztDm,String sfxyztMc){
        this.sfxyztDm = sfxyztDm;
        this.sfxyztMc = sfxyztMc;
    }

    /** 三方协议状态代码 */
    private String sfxyztDm;
    /** 三方协议状态名称 */
    private String sfxyztMc;
    /**
     * @return the sfxyztDm
     */
    public String getSfxyztDm() {
        return sfxyztDm;
    }
    /**
     * @return the sfxyztMc
     */
    public String getSfxyztMc() {
        return sfxyztMc;
    }

}
