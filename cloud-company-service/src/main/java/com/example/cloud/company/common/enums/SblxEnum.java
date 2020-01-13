package com.example.cloud.company.common.enums;
/**
 * <p>Project:  深圳纳服平台</p>
 *
 * <p>Function: [功能模块：描述大概即可]</p>
 *
 * <p>Description: [功能描述：尽量详细描述功能实现内容]</p>
 *
 * <p>Copyright: Copyright(c) 2013-2022 税友集团</p>
 *
 * <p>Company: 税友软件集团有限公司</p>
 *
 * @author 王臻佳
 *
 * @date 2015-4-28
 *
 * @version 1.0
 */
public enum SblxEnum {

    /**
     * 申报类型
     */
    SBLX_ZCSB("", "正常申报"), SBLX_WQSB("01", "往期申报"), SBLX_GZSB("03", "更正申报");

    SblxEnum(String sblxDm, String sblxMs) {
        this.sblxDm = sblxDm;
        this.sblxMs = sblxMs;
    }

    /** 申报类型代码 */
    private String sblxDm;
    /**
     * @return the sblxDm
     */
    public String getSblxDm() {
        return sblxDm;
    }
    /**
     * @return the sblxMs
     */
    public String getSblxMs() {
        return sblxMs;
    }

    /** 申报类型描述 */
    private String sblxMs;

}
