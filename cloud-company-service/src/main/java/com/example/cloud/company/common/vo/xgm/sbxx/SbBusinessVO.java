package com.example.cloud.company.common.vo.xgm.sbxx;

import com.example.cloud.company.common.vo.xgm.hdxx.DetailFileVo;
import com.example.cloud.company.common.vo.xgm.hdxx.HdxxSbzlResponseVo;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * <p>
 * Project: 通用纳服平台
 * </p>
 *
 * <p>
 * Function: [功能模块：VO]
 * </p>
 *
 * <p>
 * Description: [功能描述：Sb业务层VO]
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
public class SbBusinessVO extends ProjectBaseBusinessVo {
    /**
     * log
     */
    private static final Logger LOG = Logger.getLogger(SbBusinessVO.class);

    private final static String ZZSYJ_SBZL_DM = "10117,10118,10121,32001,10437";

    /** 申报种类代码 */
    private String sbzlDm;
    /** 所属会计年月 */
    private String kjny;
    /** 业务报文 */
    private List<DetailFileVo> detailFiles;
    /** 特色业务报文 */
    private Map<String,DetailFileVo> tsDetailFiles = new HashMap<String, DetailFileVo>();
    /** 解析成VO后的申报报表数据 */
    private Map<String, Object> sbbDataVoMap;
    /** 解析后的申报表VO */
    private Object sbbVO;
    /** CA验签信息 */
    private Map<String, String> caInfoMap;
    /** 申报序号 */
    private String sbxh;
    /** 客户端请求文件名 */
    private String qqwjm;
    /** 申报状态代码 */
    private String sbztDm;
    /** 申报状态描述 */
    private String sbztMs;
    /** 应征凭证序号 */
    private String pzxh;
    /** 应补退税额 */
    private double ybtse;
    /** 申报录入时间 */
    private String lrsj;
    /** 凭证种类代码 */
    private String pzzlDm;
    /** 外部交易流水号 */
    private String wbjylsh;
    /** 业务报文 */
    private String ywbw;
    /** 申报类型代码 */
    private String sblxDm;
    /** 征收项目代码 */
    private String zsxmDm;
    /** 渠道ID */
    private String qdid;
    /** ca类型 */
    private String caType;
    /** 一键零申报标志 */
    private String zeroSbbz;
    /** 所得税年报客户端版本号 */
    private String sdsnbVersion;
    /** 申报期限 */
    private String sbqx;
    /** 税务人员代码 */
    private String swryDm;
    /** 申报纳税人手机 */
    private String mobile;
    /** 申报纳税人证件类型 */
    private String zjlx;
    /** 申报纳税人证件号码 */
    private String zjhm;
    /** 是否进行补偿 */
    private boolean isRecoup = true;
    /** CA证书是否过期,默认设置为false */
    private Boolean cagqbz = false;
    /** 申报种类核定信息 */
    private HdxxSbzlResponseVo hdxxSbzlResponseVo;
    /** 存放其他参数信息 */
    private final Map<String, Object> param = new HashMap<String, Object>();

    public String getCaType() {
        return caType;
    }

    public void setCaType(String caType) {
        this.caType = caType;
    }

    public String getSwryDm() {
        return swryDm;
    }

    public void setSwryDm(String swryDm) {
        this.swryDm = swryDm;
    }

    /**
     * @return the zsxmDm
     */
    public String getZsxmDm() {
        return zsxmDm;
    }

    /**
     * @param zsxmDm
     *            the zsxmDm to set
     */
    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    /**
     * @return the sblxDm
     */
    public String getSblxDm() {
        return sblxDm;
    }

    /**
     * @param sblxDm
     *            the sblxDm to set
     */
    public void setSblxDm(String sblxDm) {
        this.sblxDm = sblxDm;
    }

    public String getPzzlDm() {
        return pzzlDm;
    }

    public void setPzzlDm(String pzzlDm) {
        this.pzzlDm = pzzlDm;
    }

    public String getWbjylsh() {
        return wbjylsh;
    }

    public void setWbjylsh(String wbjylsh) {
        this.wbjylsh = wbjylsh;
    }

    public String getYwbw() {
        return ywbw;
    }

    public void setYwbw(String ywbw) {
        this.ywbw = ywbw;
    }

    public HdxxSbzlResponseVo getHdxxSbzlResponseVo() {
        return hdxxSbzlResponseVo;
    }

    public void setHdxxSbzlResponseVo(HdxxSbzlResponseVo hdxxSbzlResponseVo) {
        this.hdxxSbzlResponseVo = hdxxSbzlResponseVo;
    }

    public SbBusinessVO() {

    }

//    /**
//     * 带参构造方法
//     *
//     * @param businessMessage
//     *            申报信息
//     * @param nsrsbh
//     *            纳税人识别号
//     * @param qqjylsh
//     *            请求交易流水号
//     */
//    public SbBusinessVO(BusinessMessage businessMessage, String nsrsbh, String qqjylsh) {
//        List<DetailFileVo> detailFilesLocal = businessMessage.getContentVO().getDetailFileList();
//        removeSuffixForDetailId(detailFilesLocal);
//        Map<String, String> paramMap = businessMessage.getParamMap();
//        String sssqQ = paramMap.get(ParamKeyConstants.SSSQQ);
//        String sssqZ = paramMap.get(ParamKeyConstants.SSSQZ);
//        String sbzlDmLocal = paramMap.get(ParamKeyConstants.SBZLDM);
//        LOG.debug("=======sbzlDmLocal==============:" + sbzlDmLocal + "==sssqQ====" + sssqQ + "------sssqZ------"
//                + sssqZ);
//        //add by wangzj 2018-03-09 新增申报种类小类代码，后续流程中都用小类代码处理
//        String sbzlXlDm = paramMap.get(ParamKeyConstants.SBZLXLDM);
//        if(StringUtils.isBlank(sbzlXlDm)){
//            sbzlXlDm = SbzlUtil.getValidSbzlVo(sbzlDmLocal, DateUtil.dateAutoFormat(sssqQ, "yyyy-MM-dd"), DateUtil.dateAutoFormat(sssqZ, "yyyy-MM-dd")).getSbzlDm();
//            LOG.debug("根据参数：sbzlDm["+sbzlDmLocal+"],sssqQ["+sssqQ+"],sssqZ["+sssqZ+"]获取到申报种类小类代码："+sbzlXlDm);
//        }
//        sbzlDmLocal = (StringUtils.isBlank(sbzlXlDm) ? sbzlDmLocal : sbzlXlDm;
//
//        String swjgdm = paramMap.get(ParamKeyConstants.SWJGDM);
//        String swrydm = paramMap.get(ParamKeyConstants.SWRYDM);
//        String qqwjmLocal = paramMap.get(ParamKeyConstants.QQWJM);
//        String sblxDm = paramMap.get(ParamKeyConstants.SBLXDM);
//        String zeroSbbz = paramMap.get(ParamKeyConstants.ZEROSBBZ);
//        String sdsnbVersion = paramMap.get(ParamKeyConstants.SDSNBVERSION);
//        String nbjylsh = ThreadLocalHolder.getJylsh();// 内部交易流水号
//        String wbjylshLocal = CommonUtil.createUUID(); // 外部交易流水号
//        String mobile = paramMap.get("mobile");
//        String zjlx = paramMap.get("zjlx");
//        String zjhm = paramMap.get("zjhm");
//        // 根据sbzlDm获取yzpzzlDm
//        DmSbzlVo sbzlVo = SbzlUtil.getSbzlVo(sbzlDmLocal);
//        if (null == sbzlVo) {
//            LOG.error("未获取到申报种类【" + sbzlDmLocal + "】对应的申报种类配置信息，请查看数据库DM_SBZL的配置。");
//        } else {
//            this.setPzzlDm(sbzlVo.getPzzlDm());
//            this.setZsxmDm(sbzlVo.getZsxmDm());
//        }
//        // modified by dain 根据所属时期判断申报类型是正常申报还是往期申报
//        if (sblxDm != null && SblxEnum.SBLX_GZSB.getSblxDm().equals(sblxDm)) {
//            /** add by linzs 新增判断是否为更正申报 03 */
//            this.setSblxDm(com.example.cloud.server.common.enums.SblxEnum.SBLX_GZSB.getSblxDm());
//            this.setPzxh(paramMap.get(ParamKeyConstants.PZXH));
//        } else if (isWqsb(sssqQ, sbzlVo.getNsqxDm()) && !"11".equals(sbzlVo.getNsqxDm())
//                && ZZSYJ_SBZL_DM.indexOf(sbzlDmLocal) < 0 && !sbzlDmLocal.equals("10437")) {
//            this.setSblxDm(SblxEnum.SBLX_WQSB.getSblxDm());
//        } else {
//            this.setSblxDm(SblxEnum.SBLX_ZCSB.getSblxDm());
//        }
//
//        String czryDm = paramMap.get(ParamKeyConstants.CZRYDM);
//        String czryMc = paramMap.get(ParamKeyConstants.CZRYMC);
//        String clientMac = paramMap.get(ParamKeyConstants.CLIENTMAC);
//        String clientIp = paramMap.get(ParamKeyConstants.CLIENTIP);
//        String sbfsDm = paramMap.get(ParamKeyConstants.SBFSDM);
//
//        this.setMobile(mobile);
//        this.setZjlx(zjlx);
//        this.setZjhm(zjhm);
//        this.setNsrsbh(nsrsbh);
//        this.setSssqQ(sssqQ);
//        this.setSssqZ(sssqZ);
//        this.setSbzlDm(sbzlDmLocal);
//        this.setSwjgdm(swjgdm);
//        this.setQqwjm(qqwjmLocal);
//        this.setDetailFiles(detailFilesLocal);
//        this.setQqjylsh(qqjylsh);
//        this.setNbjylsh(nbjylsh);
//        this.setWbjylsh(wbjylshLocal);
//        this.setZeroSbbz(zeroSbbz);
//        this.setQqjymxxh(businessMessage.getId());
//        if (StringUtil.isNullString(swrydm)) {
//            this.setSwryDm(czryDm);
//        } else {
//            this.setSwryDm(swrydm);
//        }
//        // modified by dain 会计年月根据所属时期止获取
//        this.setKjny(SwrqUtil.getKjnyBySssqZAndSbzl(sssqZ, sbzlDm));
//        this.setSdsnbVersion(sdsnbVersion);
//        // modified by jingb 增加操作人员、mac信息
//        this.putParam(ParamKeyConstants.CZRYDM, czryDm);
//        this.putParam(ParamKeyConstants.CZRYMC, czryMc);
//        this.putParam(ParamKeyConstants.CLIENTMAC, clientMac);
//        this.putParam(ParamKeyConstants.CLIENTIP, clientIp);
//        this.putParam(ParamKeyConstants.SBFSDM, sbfsDm);
//    }

    /**
     * <p>
     * <b>功能描述和使用场景:</b>判断根据当前申报种类的申报所属时期是否是往期申报
     * </p>
     * <p>
     * <b>实现流程:</b>
     * </p>
     * <br/>
     *
     * @return boolean
     */
//    private boolean isWqsb(String sssqQ, String nsqxDm) {
//        String zcsbSsqQ = SwrqUtil.getSssqQByNsqx(nsqxDm);
//        if (!(sssqQ.replaceAll("-", "")).equals(zcsbSsqQ.replaceAll("-", ""))) {
//            return true;
//        }
//        return false;
//    }

    /**
     * @return lrsj
     */
    public String getLrsj() {
        return lrsj;
    }

    /**
     * @param lrsj
     *            lrsj
     */
    public void setLrsj(String lrsj) {
        this.lrsj = lrsj;
    }

    /**
     * @return sbztDm
     */
    public String getSbztDm() {
        return sbztDm;
    }

    /**
     * @param sbztDm
     *            sbztDm
     */
    public void setSbztDm(String sbztDm) {
        this.sbztDm = sbztDm;
    }

    /**
     * @return sbzlDm
     */
    public String getSbzlDm() {
        return sbzlDm;
    }

    public String getSbztMs() {
        return sbztMs;
    }

    public void setSbztMs(String sbztMs) {
        this.sbztMs = sbztMs;
    }

    /**
     * @param sbzlDm
     *            sbzlDm
     */
    public void setSbzlDm(String sbzlDm) {
        this.sbzlDm = sbzlDm;
    }

    /**
     * @return detailFiles
     */
    public List<DetailFileVo> getDetailFiles() {
        return detailFiles;
    }

    /**
     * @param detailFiles
     *            detailFiles
     */
    public void setDetailFiles(List<DetailFileVo> detailFiles) {
        this.detailFiles = detailFiles;
    }

    public Map<String,DetailFileVo> getTsDetailFiles() {
		return tsDetailFiles;
	}

	public void setTsDetailFiles(Map<String,DetailFileVo> tsDetailFiles) {
		this.tsDetailFiles = tsDetailFiles;
	}

	public void addTsDetailFiles(String detailId,DetailFileVo detailFileVo) {
		this.tsDetailFiles.put(detailId, detailFileVo);
	}

	/**
     * @return sbbDataVoMap
     */
    public Map<String, Object> getSbbDataVoMap() {
        return sbbDataVoMap;
    }

    /**
     * @param sbbDataVoMap
     *            sbbDataVoMap
     */
    public void setSbbDataVoMap(Map<String, Object> sbbDataVoMap) {
        this.sbbDataVoMap = sbbDataVoMap;
    }

    /**
     * @return caInfoMap
     */
    public Map<String, String> getCaInfoMap() {
        return caInfoMap;
    }

    /**
     * @param caInfoMap
     *            caInfoMap
     */
    public void setCaInfoMap(Map<String, String> caInfoMap) {
        this.caInfoMap = caInfoMap;
    }

    /**
     * @return sbxh
     */
    public String getSbxh() {
        return sbxh;
    }

    /**
     * @param sbxh
     *            sbxh
     */
    public void setSbxh(String sbxh) {
        this.sbxh = sbxh;
    }

    /**
     * @return kjny
     */
    public String getKjny() {
        return kjny;
    }

    /**
     * @param kjny
     *            kjny
     */
    public void setKjny(String kjny) {
        this.kjny = kjny;
    }

    /**
     * @return qqwjm
     */
    public String getQqwjm() {
        return qqwjm;
    }

    /**
     * @param qqwjm
     *            qqwjm
     */
    public void setQqwjm(String qqwjm) {
        this.qqwjm = qqwjm;
    }

    /**
     * @return pzxh
     */
    public String getPzxh() {
        return pzxh;
    }

    /**
     * @param pzxh
     *            pzxh
     */
    public void setPzxh(String pzxh) {
        this.pzxh = pzxh;
    }

    public double getYbtse() {
		return ybtse;
	}

	public void setYbtse(double ybtse) {
		this.ybtse = ybtse;
	}

	/**
     * 将申报请求文件的压缩包转成List<DetailFileVo>
     *
     * @param fileDateZip
     *            fileDateZip
     * @return 是否解压成功
     */
//    public boolean setDetailFiles(byte[] fileDateZip) {
//        try {
//            ByteArrayDataVO byteVo = ZipManager.getZipClient(ZipConstants.ZIP).uncompressToVO(fileDateZip);
//            List<ByteArrayDataVO> subFiles = byteVo.getSubFiles();
//            for (ByteArrayDataVO dataVo : subFiles) {
//                DetailFileVo fileVo = new DetailFileVo();
//                fileVo.setDetailFile(dataVo.getContent());
//                fileVo.setDetailId(dataVo.getFileName());
//                detailFiles.add(fileVo);
//            }
//        } catch (ZipException e) {
//            LOG.error("将申报请求文件的压缩包转成List出错", e);
//            return false;
//        }
//        return true;
//    }

    /**
     * toString
     *
     * @return toString
     */
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("客户端请求参数：[");
//        sb.append("纳税人识别号:").append(this.getNsrsbh()).append(";");
//        sb.append("所属时期起:").append(this.getSssqQ()).append(";");
//        sb.append("所属时期止:").append(this.getSssqZ()).append(";");
//        sb.append("税务机关代码:").append(this.getSwjgdm()).append(";");
//        sb.append("请求交易流水号:").append(this.getQqjylsh()).append(";");
//        sb.append("内部交易流水号:").append(this.getNbjylsh()).append(";");
//        sb.append("请求交易明细ID:").append(this.getQqjymxxh()).append(";");
//        sb.append("申报种类代码:").append(this.getSbzlDm()).append(";");
//        sb.append("所属会计年月:").append(this.getKjny()).append(";");
//        sb.append("申报序号:").append(this.getSbxh()).append(";");
//        sb.append("申报报表ID:");
//        for (DetailFileVo filevo : detailFiles) {
//            sb.append(filevo.getDetailId()).append(",");
//        }
//        sb.append(";");
//        sb.append("客户端请求文件名:").append(this.getQqwjm()).append("]");
//        return sb.toString();
//    }

    @SuppressWarnings("unchecked")
    public <T> T getSbbVO() {
        return (T) sbbVO;
    }

    public void setSbbVO(Object sbbVO) {
        this.sbbVO = sbbVO;
    }

    /**
     * 移除detailId的申报种类
     *
     * @param detailFileList
     */
    private void removeSuffixForDetailId(List<DetailFileVo> detailFileList) {

        if (detailFileList == null || detailFileList.isEmpty()) {
            return;
        }

        for (DetailFileVo detailFileVo : detailFileList) {
            String detailId = detailFileVo.getDetailId();
            // CA签名文件不做处理
            if (detailId.startsWith("OBJECT_") || detailId.startsWith("SIGN_") || detailId.startsWith("CERT_")) {
                continue;
            }
            detailId = detailId.substring(detailId.indexOf("_") + 1);
            detailFileVo.setDetailId(detailId);
        }

    }

    /**
     * @return the qdid
     */
    public String getQdid() {
        return qdid;
    }

    /**
     * @param qdid
     *            the qdid to set
     */
    public void setQdid(String qdid) {
        this.qdid = qdid;
    }

    /**
     * @return the isRecoup
     */
    public boolean isRecoup() {
        return isRecoup;
    }

    /**
     * @param isRecoup
     *            the isRecoup to set
     */
    public void setRecoup(boolean isRecoup) {
        this.isRecoup = isRecoup;
    }

    public Boolean getCagqbz() {
        return cagqbz;
    }

    public void setCagqbz(Boolean cagqbz) {
        this.cagqbz = cagqbz;
    }

    public String getZeroSbbz() {
        return zeroSbbz;
    }

    public void setZeroSbbz(String zeroSbbz) {
        this.zeroSbbz = zeroSbbz;
    }

    public String getSdsnbVersion() {
        return sdsnbVersion;
    }

    public void setSdsnbVersion(String sdsnbVersion) {
        this.sdsnbVersion = sdsnbVersion;
    }

    public String getSbqx() {
        return sbqx;
    }

    public void setSbqx(String sbqx) {
        this.sbqx = sbqx;
    }

    public Object getParam(String key) {
        return param.get(key);
    }

    public String getParamStr(String key) {
        return (String) param.get(key);
    }

    public void putParam(String key, Object value) {
        this.param.put(key, value);
    }

    public void removeParam(String key, Object value) {
        this.param.remove(key);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

}
