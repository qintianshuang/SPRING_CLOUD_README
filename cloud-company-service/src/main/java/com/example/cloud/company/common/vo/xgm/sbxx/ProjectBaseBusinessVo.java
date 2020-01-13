package com.example.cloud.company.common.vo.xgm.sbxx;

/**
 *
 * <p>Project: 通用纳服平台 </p>
 *
 * <p>Function: [功能模块：VO]</p>
 *
 * <p>Description: [功能描述：业务层VO基类]</p>
 *
 * <p>Copyright: Copyright(c) 2013-2022 税友集团</p>
 *
 * <p>Company: 税友软件集团有限公司</p>
 *
 * @author 刘信
 *
 * @version 1.0
 */
public class ProjectBaseBusinessVo {
    /** 登记序号 */
    private String djxh;
    /**纳税人识别号*/
    private String nsrsbh;
    /**所属时期起*/
    private String sssqQ;
    /**所属时期止*/
    private String sssqZ;
    /**税务机关代码*/
    private String swjgdm;
    /**请求交易流水号*/
    private String qqjylsh;
    /**内部交易流水号*/
    private String nbjylsh;
    /**请求交易明细ID*/
    private String qqjymxxh;
    /**
     * @return djxh djxh
     */
    public String getDjxh() {
        return djxh;
    }

    /**
     * @param djxh djxh
     */
    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }
    /**
     * @return nsrsbh
     */
    public String getNsrsbh() {
        return nsrsbh;
    }
    /**
     * @param nsrsbh nsrsbh
     */
    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }
    /**
     * @return sssqQ
     */
    public String getSssqQ() {
        return sssqQ;
    }
    /**
     * @param sssqQ sssqQ
     */
    public void setSssqQ(String sssqQ) {
        this.sssqQ = sssqQ;
    }
    /**
     * @return sssqZ
     */
    public String getSssqZ() {
        return sssqZ;
    }
    /**
     * @param sssqZ sssqZ
     */
    public void setSssqZ(String sssqZ) {
        this.sssqZ = sssqZ;
    }
    /**
     * @return swjgdm
     */
    public String getSwjgdm() {
        return swjgdm;
    }
    /**
     * @param swjgdm swjgdm
     */
    public void setSwjgdm(String swjgdm) {
        this.swjgdm = swjgdm;
    }
    /**
     * @return qqjylsh
     */
    public String getQqjylsh() {
        return qqjylsh;
    }
    /**
     * @param qqjylsh qqjylsh
     */
    public void setQqjylsh(String qqjylsh) {
        this.qqjylsh = qqjylsh;
    }
    /**
     * @return nbjylsh
     */
    public String getNbjylsh() {
        return nbjylsh;
    }
    /**
     * @param nbjylsh nbjylsh
     */
    public void setNbjylsh(String nbjylsh) {
        this.nbjylsh = nbjylsh;
    }

    /**
     * @return qqjymxxh
     */
    public String getQqjymxxh() {
        return qqjymxxh;
    }
    /**
     * @param qqjymxxh qqjymxxh
     */
    public void setQqjymxxh(String qqjymxxh) {
        this.qqjymxxh = qqjymxxh;
    }
}
