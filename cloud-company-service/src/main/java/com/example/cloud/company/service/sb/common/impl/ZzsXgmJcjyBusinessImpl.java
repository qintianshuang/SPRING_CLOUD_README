package com.example.cloud.company.service.sb.common.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.company.common.build.xgm.qcxml.ArithUtil;
import com.example.cloud.company.common.build.xgm.qcxml.HdxxContent;
import com.example.cloud.company.common.constants.SzMsgConstants;
import com.example.cloud.company.common.enums.SbjyCodeEnum;
import com.example.cloud.company.common.vo.base.NsrxxVO;
import com.example.cloud.company.common.vo.xgm.hdxx.LsxxVo;
import com.example.cloud.company.common.vo.xgm.qcxx.WsxxVo;
import com.example.cloud.company.common.vo.xgm.sbxx.SbBusinessVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sb.xgm.LsjdxxVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sb.xgm.SbxxtjVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sb.xgm.WsjdxxVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.*;
import com.example.cloud.company.service.sb.common.ISbJcjyBusiness;
import com.example.cloud.company.service.sb.common.ISystemParamClient;
import com.example.cloud.db.dao.sb.xgm.IHdxxTqDao;
import com.example.cloud.db.dao.sb.xgm.IYcsbdDao;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Project:  深圳纳服平台</p>
 *
 * <p>Function: [功能模块：小规模增值税申报基础校验]</p>
 *
 * <p>Description: [功能描述：小规模增值税申报基础校验]</p>
 *
 * <p>Copyright: Copyright(c) 2013-2022 税友集团</p>
 *
 * <p>Company: 税友软件集团有限公司</p>
 *
 * @author linzs
 * @version 1.0
 * @date 2018年1月2日
 */
@Service(value = "zzsXgmJcjyBusiness")
public class ZzsXgmJcjyBusinessImpl implements ISbJcjyBusiness {
//    /**
//     * 纳税人信息持久化构件，接口
//     */
//    private static INsrxxCache nsrxxCache = BondeInterfaceFactory.getInstance()
//            .getInterface(TyParLibConstants.TY_JC_CACHE_NSRXX);
//
//    /**
//     * 申报违章校验
//     */
//    private static ISbqxForWzxxBusiness sbqxForWzxxBusiness = BondeInterfaceFactory.getInstance()
//            .getInterface(SbParLibConstants.WZXX_SBQX_BUSINESS_ID);
//
    /**
     * 一窗式比对dao
     */
//    private static IYcsbdDao ycsbdDao = BondeInterfaceFactory.getInstance().getInterface(IYcsbdDao.class);
    @Autowired
    @Qualifier(value = "ycsbdDao")
    private static IYcsbdDao ycsbdDao;

    /**
     * 核定信息提取持久化接口构件
     */
    @Autowired
    @Qualifier(value = "hdxxTqDao")
    private IHdxxTqDao hdxxTqDao;

    /**
     * log
     */
    private static final Logger LOG = Logger.getLogger(ZzsXgmJcjyBusinessImpl.class);

    /********************************************************申报数据校验公共组件开始*******************************************************/
    //小规模申报表第1列货物劳务栏次申报数据
    private ZzsxgmGridlbVO zzsxgmGridlb1VO;

    //小规模申报表第2列服务栏次申报数据
    private ZzsxgmGridlbVO zzsxgmGridlb2VO;

    //小规模申报表第3列货物劳务栏次本年累计值申报数据
    private ZzsxgmGridlbVO zzsxgmGridlb3VO;

    //小规模申报表第4列服务栏次申报本年累计值数据
    private ZzsxgmGridlbVO zzsxgmGridlb4VO;

    @Autowired
    @Qualifier(value = "systemParamClient")
    ISystemParamClient SystemParamClient;

    //小规模申报金三期初数据
    private WsjdxxVO wsjdxxVO;
    private LsjdxxVO lsjdxxVO;
    /********************************************************申报数据公共组件结束*******************************************************/


    /********************************************************申报基础校验开始**********************************************************/
    /***
     * 小规模正常申报基础校验
     * 覃田爽于2019.12全量优化
     * 预防逃税，从小做起
     * @param
     * @return
     */
    @Override
    public ResultVo sbJcjy(String djxh, String sssqq, String sssqz, MultipartFile sbXml, MultipartFile wsxxXml, MultipartFile lsxxXml) throws Exception {
        LOG.debug("====登记序号===【" + djxh + "】==进入方法sbJcjy==");
        SbBusinessVO sbBusinessVO = new SbBusinessVO();
        sbBusinessVO.setDjxh(djxh);
        sbBusinessVO.setSssqQ(sssqq);
        sbBusinessVO.setSssqZ(sssqz);
        djxh = sbBusinessVO.getDjxh();
        String sbzlDm = sbBusinessVO.getSbzlDm();
        String skssqq = sbBusinessVO.getSssqQ();
        String skssqz = sbBusinessVO.getSssqZ();
        String swjgDm = sbBusinessVO.getSwjgdm();
        LOG.debug("====登记序号===【" + djxh + "】====swjgdm : 【" + swjgDm + "】==渠道ID(sbBusinessVO.getQdid())==【" + sbBusinessVO.getQdid() + "】");
        boolean yqsb = false;
        NsrxxVO nsrxxVO = new NsrxxVO();
        nsrxxVO.setDjxh(sbBusinessVO.getDjxh());
        //拼接纳税申报报文
//        ResultVo resultVo = pjqbw(sbBusinessVO, nsrxxVO);
//        if (!resultVo.isSuccess()) {
//            return resultVo;
//        }
        String requestXml = HdxxContent.getRequestXml(djxh,sbXml);
        //获取期初数据
//        HdxxSbzlResponseVo hdxxSbzlResponseVo = sbBusinessVO.getHdxxSbzlResponseVo();
        List<WsxxVo> wsxxList = HdxxContent.getWsxxVoList(djxh,wsxxXml);
        //获取核定信息WsxxVO
        ResultVo resultVo = WsjdxxVO.getWshdqcxx(djxh, wsxxList);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        wsjdxxVO = (WsjdxxVO) resultVo.getValue();
        //获取核定信息lsxxVO
//        List<LsxxVo> lsxx = hdxxSbzlResponseVo.getLSXXS().getLSXX();
        List<LsxxVo> lsxx = HdxxContent.getLsxxVoList(djxh,lsxxXml);
        resultVo = LsjdxxVO.getLshdqcxx(djxh, lsxx);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        lsjdxxVO = (LsjdxxVO) resultVo.getValue();
        //处理纳税申报报文
        resultVo = SbxxtjVO.bwcl(requestXml, nsrxxVO.getDjxh());
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        HXZGSB00045Request requestVO = (HXZGSB00045Request) resultVo.getValue();
        LOG.debug("====登记序号===【" + djxh + "】====申报数据报文转化对象为===HXZGSB00045Request:【" + JSONObject.toJSONString(requestVO) + "】");
        //获取主表内货物劳务和服务（栏次）全局数据VO
        resultVo = getZzsxgmGridlbVO(djxh, requestVO);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        LOG.debug("====登记序号===【" + djxh + "】====计算公式校验===zzsxgmGridlb1VO:【" + JSONObject.toJSONString(zzsxgmGridlb1VO) + "】" +
                "====zzsxgmGridlb2VO：【" + JSONObject.toJSONString(zzsxgmGridlb2VO) + "】");
        /***
         * 纳税人端小规模申报和更正的 计算规则在提交前需再次后台做校验，计算公式之前在前端处理的，
         现在提交前在后端也要校验一次，防止各种场景导致页面计算公式未生效。
         * 后端校验的栏次包括本期应纳税额、核定应纳税额、应纳税额合计、本期应补（退）税额 ，校验计算公式是否满足。
         * 内网渠道不走校验
         */
        //是否进行基础校验
        String sfjcjy = SystemParamClient.getSystemParam("XGM_SB_SF_JCJY");
//        if (!(ChannelUtil.isInnerChannel(sbBusinessVO.getQdid()) && !"Y".equals(sfjcjy))) {
        resultVo = jsgsJy(requestVO, djxh, skssqq);
        if (!resultVo.isSuccess()) {
            LOG.error("纳税人【" + djxh + "】税种【" + sbzlDm + "】后台公式计算校验失败，失败原因：" + resultVo.getMessage());
            return resultVo;
        }
        /***
         * 纳税人端小规模申报和更正的附加税后台监控数据
         */
        resultVo = fjsJy(requestVO, djxh, skssqq, skssqz);//附加税监控
        if (!resultVo.isSuccess()) {
            LOG.error("纳税人【" + djxh + "】税种【" + sbzlDm + "】后台公式计算校验失败，失败原因：" + resultVo.getMessage());
            return resultVo;
        }
        //校验纳税人的pbbd记录，是否与上次比对结果一致
//            resultVo = pbbdJcjy(sbBusinessVO);
//            if (!resultVo.isSuccess()) {
//                return resultVo;
//            }
//        }
        LOG.debug("====登记序号===【" + djxh + "】====纳税人 税种【" + sbzlDm + "】后台公式计算校验通过 ========");
        // 基础校验结束、如果是逾期申报，设置MsgCode为80450102
        if (yqsb) {
            resultVo.setMsgCode(SzMsgConstants.MSG_SB02_JCJY_SBQX_FAIL);
        }
        return resultVo;
    }

    /***
     * 主表内货物劳务和服务（栏次）全局数据VO
     * @param djxh
     * @param requestVO
     * @return
     */
    private ResultVo getZzsxgmGridlbVO(String djxh, HXZGSB00045Request requestVO) {
        Zzssyyxgmnsrywbw zzssyyxgmnsrywbw = requestVO.getZzssyyxgmnsrySbSbbdxxVO();
        if (zzssyyxgmnsrywbw == null) {
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }
        Zzssyyxgmnsr zzssyyxgmnsr = zzssyyxgmnsrywbw.getZzssyyxgmnsr();
        if (zzssyyxgmnsr == null) {
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }
        Zzssyyxgmnsr.ZzsxgmGrid zzsxgmGrid = zzssyyxgmnsr.getZzsxgmGrid();
        if (zzsxgmGrid == null) {
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }
        List<ZzsxgmGridlbVO> gridlbVOs = zzsxgmGrid.getZzsxgmGridlb();
        if (gridlbVOs == null || gridlbVOs.size() == 0) {
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }
        // 如果不为空则取ewblxh=1、2栏累计值VO
        for (int i = 0; i < gridlbVOs.size(); i++) {
            ZzsxgmGridlbVO vo = gridlbVOs.get(i);
            if (1 == vo.getEwblxh()) {
                zzsxgmGridlb1VO = vo;
            } else if (2 == vo.getEwblxh()) {
                zzsxgmGridlb2VO = vo;
            } else if (3 == vo.getEwblxh()) {
                zzsxgmGridlb3VO = vo;
            } else if (4 == vo.getEwblxh()) {
                zzsxgmGridlb4VO = vo;
            }
        }
        LOG.info("====登记序号===【" + djxh + "】====计算公式校验===zzsxgmGridlb1VO:【" + JSONObject.toJSONString(zzsxgmGridlb1VO)
                + "】====zzsxgmGridlb2VO：【" + JSONObject.toJSONString(zzsxgmGridlb2VO)
                + "】====zzsxgmGridlb3VO：【" + JSONObject.toJSONString(zzsxgmGridlb3VO)
                + "】====zzsxgmGridlb4VO：【" + JSONObject.toJSONString(zzsxgmGridlb4VO) + "】");
        if ((zzsxgmGridlb1VO == null || 1 != zzsxgmGridlb1VO.getEwblxh())
                || (zzsxgmGridlb2VO == null || 2 != zzsxgmGridlb2VO.getEwblxh())) {
            LOG.error("====登记序号===【" + djxh + "】====纳税人小规模增值税主表数据 为空，存在异常");
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }
        Zzsxgmflzl zzsxgmflzl = zzssyyxgmnsrywbw.getZzsxgmflzl();
        if (zzsxgmflzl == null) {
            LOG.error("====登记序号===【" + djxh + "】====纳税人 小规模增值税附列资料表数据 为空，存在异常");
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }
        return ResultVo.valueOfSuccess();
    }
    /********************************************************申报基础校验结束*****************************************************/


    /***********************************************************计算公式校验开始**************************************************/
    /***
     * 计算公式校验
     * @param requestVO
     * @param djxh
     * @param skssqq
     * @return
     */
    private ResultVo jsgsJy(HXZGSB00045Request requestVO, String djxh, String skssqq) {
        LOG.info("====登记序号===【" + djxh + "】===基础校验====wsxxList====【" + JSONObject.toJSONString(wsjdxxVO) + "】");
        //货物劳务和服务、不动产和无形资产表内表间关系校验
        ResultVo resultVo = getCommonBnbjJsjy(djxh);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        FlzlFormVO flzlFormVO = requestVO.getZzssyyxgmnsrySbSbbdxxVO().getZzsxgmflzl().getFlzlForm();
        //校验增值税纳税申报表（小规模纳税人适用）附列资料
        //预防纳税人逃税，从小抓起
        resultVo = getFlzlJcjy(djxh, flzlFormVO, wsjdxxVO.getSzlbDm());
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        // 2019年之前延用以前的逻辑，19年后货物服务合并
        int year = 0;
        if (StringUtils.isNotBlank(skssqq)) {
            year = Integer.parseInt(skssqq.substring(0, 4));
        }
        if (year >= 2019) {
            // 货物劳务和服务、不动产和无形资产计算校验合并校验
            LOG.info("==========进入new：");
            resultVo = hwfwhbJsJy(djxh);
        } else {
            // 货物劳务计算校验
            resultVo = hwlwJsJy(djxh);
            if (!resultVo.isSuccess()) {
                return resultVo;
            }
            // 服务、不动产和无形资产计算校验
            resultVo = fwJsJy(flzlFormVO, djxh);
        }
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        //校验增值税纳税申报表（小规模纳税人适用）增值税减免税申报明细表
        //预防纳税人逃税，从小抓起
        resultVo = getZzsjmsmxbJcjy(djxh, requestVO);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        return ResultVo.valueOfSuccess();
    }

    /***
     * 校验增值税纳税申报表（小规模纳税人适用）增值税减免税申报明细表
     * @param djxh
     * @param requestVO
     * @return
     */
    private ResultVo getZzsjmsmxbJcjy(String djxh, HXZGSB00045Request requestVO) {
        Zzssyyxgmnsrywbw zzssyyxgmnsrywbw = requestVO.getZzssyyxgmnsrySbSbbdxxVO();

        Zzsjmssbmxb zzsjmssbmxb = zzssyyxgmnsrywbw.getZzsjmssbmxb();
        if (zzssyyxgmnsrywbw.getZzsjmssbmxb() == null) {
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }
        if (zzsjmssbmxb.getZzsjmssbmxbjsxmGrid() == null) {
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }

        //增值税减免税申报明细表-减税项目
        double qcye = 0.00;
        double bqfse = 0.00;
        double bqydjse = 0.00;
        double bqsjdjse = 0.00;
        double qmye = 0.00;
        //增值税减免税申报明细表-减税项目合计值
        double qcyehj = 0.00;
        double bqfsehj = 0.00;
        double bqydjsehj = 0.00;
        double bqsjdjsehj = 0.00;
        double qmyehj = 0.00;
        List<ZzsjmssbmxbjsxmGridlbVO> zzsjmssbmxbjsxmGridlbVO = zzsjmssbmxb.getZzsjmssbmxbjsxmGrid().getZzsjmssbmxbjsxmGridlbVO();
        if (!CollectionUtils.isEmpty(zzsjmssbmxbjsxmGridlbVO)) {
            for (ZzsjmssbmxbjsxmGridlbVO gridlbVO : zzsjmssbmxbjsxmGridlbVO) {
                if (gridlbVO.getEwbhxh() == 1) {
                    qcyehj = gridlbVO.getQcye();
                    bqfsehj = gridlbVO.getBqfse();
                    bqydjsehj = gridlbVO.getBqydjse();
                    bqsjdjsehj = gridlbVO.getBqsjdjse();
                    qmyehj = gridlbVO.getQmye();
                } else {
                    qcye += gridlbVO.getQcye();
                    bqfse += gridlbVO.getBqfse();
                    bqydjse += gridlbVO.getBqydjse();
                    bqsjdjse += gridlbVO.getBqsjdjse();
                    qmye += gridlbVO.getQmye();
                }
            }
        }
        //增值税减免税申报明细表-免税项目
        double mzzzsxmxse = 0.00;
        double bqsjkcje = 0.00;
        double kchmsxse = 0.00;
        double msxsedyjxse = 0.00;
        double mse = 0.00;
        //增值税减免税申报明细表-免税项目合计
        double mzzzsxmxsehj = 0.00;
        double bqsjkcjehj = 0.00;
        double kchmsxsehj = 0.00;
        double msxsedyjxsehj = 0.00;
        double msehj = 0.00;
        List<ZzsjmssbmxbmsxmGridlbVO> zzsjmssbmxbmsxmGridlbVO = zzsjmssbmxb.getZzsjmssbmxbmsxmGrid().getZzsjmssbmxbmsxmGridlbVO();
        if (!CollectionUtils.isEmpty(zzsjmssbmxbmsxmGridlbVO)) {
            for (ZzsjmssbmxbmsxmGridlbVO gridlbVO : zzsjmssbmxbmsxmGridlbVO) {
                if (gridlbVO.getEwbhxh() == 1) {
                    mzzzsxmxsehj = gridlbVO.getMzzzsxmxse();
                    bqsjkcjehj = gridlbVO.getBqsjkcje();
                    kchmsxsehj = gridlbVO.getKchmsxse();
                    msxsedyjxsehj = gridlbVO.getMsxsedyjxse();
                    msehj = gridlbVO.getMse();
                } else {
                    if (gridlbVO.getMzzzsxmxse() != null) {
                        mzzzsxmxse += gridlbVO.getMzzzsxmxse();
                    }
                    if (gridlbVO.getBqsjkcje() != null) {
                        bqsjkcje += gridlbVO.getBqsjkcje();
                    }
                    if (gridlbVO.getKchmsxse() != null) {
                        kchmsxse += gridlbVO.getKchmsxse();
                    }
                    if (gridlbVO.getMsxsedyjxse() != null) {
                        msxsedyjxse += gridlbVO.getMsxsedyjxse();
                    }
                    if (gridlbVO.getMse() != null) {
                        mse += gridlbVO.getMse();
                    }
                }
            }
        }
        //减税项目校验
        //本期应抵减税额=期初余额 + 本期发生额
        double bqydjsesj = ArithUtil.round(qcye + bqfse, 2);
        if (bqydjse != (bqydjsesj)) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-减税项目====第3列【本期应抵减税额合计值："
                    + bqydjse + "】应该等于第1列【期初余额合计值：【" + qcye + "】加上第2列【本期发生额合计值：" + bqfse
                    + "】的和【" + bqydjsesj + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第3列“本期应抵减税额合计值”"
                    + bqydjse + "应该等于第1列“期初余额合计值“" + qcye + "”加上第2列”本期发生额合计值”："
                    + bqfse + "的和" + bqydjsesj + "，请检查申报表数据是否正确。");
        }
        //本期实际抵减税额要小于等于本期应抵减税额
        if (bqsjdjse > bqydjse) {
            LOG.error("====登记序号===【" + djxh + "】====增值税减免税申报明细表-减税项目====第4列【本期实际抵减税额合计值："
                    + bqsjdjse + "】应该小于等于第3列【本期应抵减税额合计值：" + bqydjse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第4列“本期实际抵减税额合计值”" + bqsjdjse +
                    "应该小于等于第3列“本期应抵减税额合计值“" + bqydjse + "，请检查申报表数据是否正确。");
        }
        //强制：主表第18栏“本期应纳税额减征额本期数”=《本期减免税额明细表》的“本期实际抵减税额合计数”。
        double bqynsejzebqs = ArithUtil.round(zzsxgmGridlb1VO.getBqynsejze() + zzsxgmGridlb2VO.getBqynsejze(), 2);
        if (bqsjdjsehj != bqynsejzebqs) {
            LOG.error("====登记序号===【" + djxh + "】====增值税减免税申报明细表-减税项目====第4列【本期实际抵减税额合计值："
                    + bqsjdjsehj + "】应该等于主表第18栏“本期应纳税额减征额本期数”：" + bqynsejzebqs
                    + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第4列“本期实际抵减税额合计值”" + bqsjdjsehj +
                    "应该等于主表第18栏“本期应纳税额减征额本期数”" + bqynsejzebqs + "，请检查申报表数据是否正确。");
        }
        //期末余额 = 本期应抵减税额 - 本期实际抵减税额
        double qmyesj = ArithUtil.round(bqydjse - bqsjdjse, 2);
        if (qmye != qmyesj) {
            LOG.error("====登记序号===【" + djxh + "】====增值税减免税申报明细表-减税项目====第5列【期末余额合计值："
                    + qmye + "】应该等于第3列【本期应抵减税额合计值：" + bqydjse + "】减去第4列【本期实际抵减税额合计值："
                    + bqsjdjse + "的差额【" + qmyesj + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第5列“期末余额合计值”" + qmye +
                    "应该等于第3列“本期应抵减税额合计值“" + bqydjse + "减去第4列”本期实际抵减税额合计值“" + bqsjdjse + "" +
                    "的差额" + qmyesj + "，请检查申报表数据是否正确。");
        }
        //增值税减免税申报明细表-减税项目 合计值校验
        if (qcyehj != qcye) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-减税项目====第1列【期初余额合计值】：" + qcyehj
                    + "】应该等于第1列的和" + qcye + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第1列“期初余额合计值”" + qcyehj +
                    "应该等于第1列的和" + qcye + "，请检查申报表数据是否正确。");
        }
        if (bqfsehj != bqfse) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-减税项目====第2列【本期发生额】："
                    + bqfsehj + "】应该等于第2列的和" + bqfse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第2列“本期发生额”" + bqfsehj +
                    "应该等于第2列的和" + bqfse + "，请检查申报表数据是否正确。");
        }
        if (bqydjsehj != bqydjse) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-减税项目====第3列【本期应抵减税额】："
                    + bqydjsehj + "】应该等于第3列的和" + bqydjse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第3列“本期应抵减税额”" + bqydjsehj +
                    "应该等于第3列的和" + bqydjse + "，请检查申报表数据是否正确。");
        }
        if (bqsjdjsehj != bqsjdjse) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-减税项目====第4列【本期实际抵减税额】："
                    + bqsjdjsehj + "】应该等于第4列的和" + bqsjdjse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第4列“本期实际抵减税额”" + bqsjdjsehj +
                    "应该等于第4列的和" + bqsjdjse + "，请检查申报表数据是否正确。");
        }
        if (qmyehj != qmye) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-减税项目====第5列【期末余额】：" + qmyehj + "】" +
                    "应该等于第5列的和" + qmye + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-减税项目第5列“期末余额”" + qmyehj +
                    "应该等于第5列的和" + qmye + "，请检查申报表数据是否正确。");
        }

        //免税项目校验
        //按公式计算，公式为：第3列“扣除后免税销售额”=第1列“免征增值税项目销售额”-第2列“免税销售额扣除项目本期实际扣除金额”
        double kchmsxsesj1 = ArithUtil.round(ArithUtil.sub(mzzzsxmxse, bqsjkcje), 2);
        if (kchmsxse != kchmsxsesj1) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-免税项目====第3列【扣除后免税销售额合计值："
                    + kchmsxse + "】应该等于第1列【免征增值税项目销售额合计值：" + mzzzsxmxse
                    + "】减去第2列【免税销售额扣除项目本期实际扣除金额合计值：" + bqsjkcje
                    + "】的差额【" + kchmsxsesj1 + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-免税项目 第3列“扣除后免税销售额合计值”"
                    + kchmsxse + "应该等于第1列“免征增值税项目销售额合计值“" + mzzzsxmxse
                    + "减去第2列”免税销售额扣除项目本期实际扣除金额合计值“" + bqsjkcje + "的差额" + kchmsxsesj1
                    + "，请检查申报表数据是否正确。");
        }
        //强制：主表第12栏“其他免税销售额”“本期数”+13栏“出口免税销售额”本期数=《本期减免税额明细表》的第7行第1列 。
        //强制：主表第12栏“其他免税销售额”“本期数”+13栏“出口免税销售额”本期数=《本期减免税额明细表》的第7行第1列 。
        double zb12add13 = ArithUtil.round(zzsxgmGridlb1VO.getQtmsxse() + zzsxgmGridlb1VO.getCkmsxse()
                + zzsxgmGridlb2VO.getQtmsxse() + zzsxgmGridlb2VO.getCkmsxse(), 2);
        if (mzzzsxmxsehj != zb12add13) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-免税项目====第1列【免征增值税项目销售额合计值："
                    + mzzzsxmxsehj + "】应该等于主表第12行“其他免税销售额”货物劳务及应税服务“本期数”之和"
                    + zb12add13 + "，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-免税项目 第1列“免征增值税项目销售额合计值“" + mzzzsxmxsehj
                    + "应该等于主表第12行“其他免税销售额”货物劳务及应税服务“本期数”之和"
                    + zb12add13 + "，请检查申报表数据是否正确。");
        }
        //增值税减免税申报明细表-免税项目 合计值校验
        if (mzzzsxmxsehj != mzzzsxmxse) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-免税项目====第1列【免征增值税项目销售额】："
                    + mzzzsxmxsehj + "】应该等于第1列的和" + mzzzsxmxse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-免税项目第1列“免征增值税项目销售额”" + mzzzsxmxsehj +
                    "应该等于第1列的和" + mzzzsxmxse + "，请检查申报表数据是否正确。");
        }
        if (bqsjkcjehj != bqsjkcje) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-免税项目====第2列【免税销售额扣除项目本期实际扣除金额】："
                    + bqsjkcjehj + "】应该等于第2列的和" + bqsjkcje + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-免税项目第2列“免税销售额扣除项目本期实际扣除金额”" + bqsjkcjehj +
                    "应该等于第2列的和" + bqsjkcje + "，请检查申报表数据是否正确。");
        }
        if (kchmsxsehj != kchmsxse) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-免税项目====第3列【扣除后免税销售额】："
                    + kchmsxsehj + "】应该等于第3列的和" + kchmsxse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-免税项目第3列“扣除后免税销售额”" + kchmsxsehj +
                    "应该等于第3列的和" + kchmsxse + "，请检查申报表数据是否正确。");
        }
        if (msxsedyjxsehj != msxsedyjxse) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-免税项目====第4列【免税销售额对应的进项税额】："
                    + msxsedyjxsehj + "】应该等于第4列的和" + msxsedyjxse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-免税项目第4列“免税销售额对应的进项税额”" + msxsedyjxsehj +
                    "应该等于第4列的和" + msxsedyjxse + "，请检查申报表数据是否正确。");
        }
        if (msehj != mse) {
            LOG.error("====登记序号===【" + djxh + "====增值税减免税申报明细表-免税项目====第5列【免税额】："
                    + msehj + "】应该等于第5列的和" + mse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("增值税减免税申报明细表-免税项目第5列“免税额”" + msehj +
                    "应该等于第5列的和" + mse + "，请检查申报表数据是否正确。");
        }
        return ResultVo.valueOfSuccess();
    }

    /***
     * 货物劳务和服务、不动产和无形资产表内表间关系校验
     *
     * 保存校验：
     * 表内关系：
     *      1、强制：当主表第10栏“其中：小微企业免税销售额”第2列大于0时，主表第20栏“其中：小微企业免税额”第2列必须大于0。
     *          当主表第11栏“未达起征点销售额”第2列大于0时，主表第21栏“未达起征点免税额”第2列必须大于0。
     *      2、强制：当主表第24栏应补退税额小于0时，提示“主表第24栏本期应补（退）税额”为负数，不允许网上申报，请前往主管税务机关进行申报。”
     *      3、强制：当主表第16栏“本期应纳税额”>=0时，主表第18栏“本期应纳税额减征额”必须小于或等于“本期应纳税额”。货物、服务列各自判断和监控。
     *      4、强制：主表第19栏“本期免税额”应大于等于第20栏+21栏金额。
     *      5、主表保存时，若18栏第1或2列本期数不等于0，则提示“您的主表第18栏“本期应纳税额减征额”“本期数”有值，请根据实际减免情况填写《增值税减免税申报明细表》。”
     *      6、强制：当主表第16栏“本期应纳税额”<0时，主表第18栏“本期应纳税额减征额”必须等于0。货物、服务列各自判断和监控。
     * 表间关系：
     *      1、强制：主表第12栏“其他免税销售额”“本期数”+13栏“出口免税销售额”本期数=《本期减免税额明细表》的第7行第1列 。
     *      2、强制：主表第18栏“本期应纳税额减征额本期数”=《本期减免税额明细表》的“本期实际抵减税额合计数”。
     *    ***********************************该规则请详见附列资料校验规则方法**********************************************
     *    * 3、强制：附列资料第8栏不等于0时，监控主表第1栏“（一）应征增值税不含税销售额（3%征收率）”第2列“本期数”=附列资料第8栏。  *
     *    * 4、强制：附列资料第16栏不等于0时，监控主表第4栏“（二）应征增值税不含税销售额（5%征收率）”第2列“本期数”=附列资料第16栏。*
     *    *************************************************************************************************************
     *      5、强制：责令认定、逾期未认定小规模纳税人，不允许申报，强制退出。
     *
     * @param djxh
     * @return
     */
    private ResultVo getCommonBnbjJsjy(String djxh) {

        /*---------------------------------货物劳务和服务、不动产和无形资产主表【表内】关系校验-------------------------------*/
        //纳税人端（因为纳税人端不能填负数）：1、第1栏不等于第2栏时(a1 != a2 && a1>= 0 && a2 >= 0 && a3 >= 0)
        // || (b1 != b2 && b1 >= 0 && b2 >=0 && b3 >= 0)
        if ((zzsxgmGridlb1VO.getYzzzsbhsxse() != zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse() &&
                (zzsxgmGridlb1VO.getYzzzsbhsxse() < 0 || zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse() < 0
                        || zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse() < 0)) ||
                (zzsxgmGridlb2VO.getYzzzsbhsxse() != zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse()
                        && (zzsxgmGridlb2VO.getYzzzsbhsxse() < 0 || zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse() < 0
                        || zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse() < 0))) {
            LOG.error("====登记序号===【" + djxh + "====纳税人端（因为纳税人端不能填负数）===货物劳务" +
                    "以及服务、不动产和无形资产主表第1、2、3栏不允许填写负数！");
            return ResultVo.valueOfError("主表第1、2、3栏不允许填写负数！");
        }

        //公式计算：主表7>=8
        if (zzsxgmGridlb1VO.getXssygdysgdzcbhsxse() < zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse1()) {
            LOG.error("====登记序号===【" + djxh + "====应税货物劳务的第7栏“销售使用过的固定资产不含税销售额”：【"
                    + zzsxgmGridlb1VO.getXssygdysgdzcbhsxse() + "】应该大于等于第8栏“其中：税控器具开具的普通发票不含税销售额”：【"
                    + zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse1() + "】,请检查！");
            return ResultVo.valueOfError("应税货物劳务的第7栏“销售使用过的固定资产不含税销售额”应该大于等于第8栏“" +
                    "其中：税控器具开具的普通发票不含税销售额”，请检查！");
        }

        //公式计算：主表9=10+11+12
        double msxse1 = ArithUtil.round(zzsxgmGridlb1VO.getXwqymsxse()
                + zzsxgmGridlb1VO.getWdqzdxse() + zzsxgmGridlb1VO.getQtmsxse(), 2);
        double msxse2 = ArithUtil.round(zzsxgmGridlb2VO.getXwqymsxse()
                + zzsxgmGridlb2VO.getWdqzdxse() + zzsxgmGridlb2VO.getQtmsxse(), 2);
        if ((zzsxgmGridlb1VO.getMsxse() != msxse1) || (zzsxgmGridlb2VO.getMsxse() != msxse2)) {
            LOG.error("====登记序号===【" + djxh + "====应税货物劳务的第9栏“免税销售额”：【" + zzsxgmGridlb1VO.getMsxse()
                    + "】应该等于第10栏“其中：小微企业免税销售额”、第11栏“未达起征点销售额”、第12栏“其他免税销售额”的和:【"
                    + msxse1 + "】或者====服务、不动产和无形资产的第9栏“免税销售额”：【" + zzsxgmGridlb2VO.getMsxse()
                    + "】应该等于第10栏“其中：小微企业免税销售额”、第11栏“未达起征点销售额”、第12栏“其他免税销售额”的和:【"
                    + msxse2 + "】，请检查！");
            return ResultVo.valueOfError("应税货物劳务以及服务、不动产和无形资产的第9栏“免税销售额”" +
                    "应该等于第10栏“其中：小微企业免税销售额”、第11栏“未达起征点销售额”、第12栏“其他免税销售额”的和，请检查！");
        }

        //公式计算：主表13>=14
        if (zzsxgmGridlb1VO.getCkmsxse() < zzsxgmGridlb1VO.getSkqjkjdptfpxse1()
                || zzsxgmGridlb2VO.getCkmsxse() < zzsxgmGridlb2VO.getSkqjkjdptfpxse1()) {
            LOG.error("====登记序号===【" + djxh + "====应税货物劳务的第13栏“销售使用过的固定资产不含税销售额”：【"
                    + zzsxgmGridlb1VO.getCkmsxse() + "】应该大于等于第14栏“其中：税控器具开具的普通发票不含税销售额”：【"
                    + zzsxgmGridlb1VO.getSkqjkjdptfpxse1()
                    + "】===或者====服务、不动产和无形资产的第13栏“销售使用过的固定资产不含税销售额”：【" + zzsxgmGridlb2VO.getCkmsxse()
                    + "】应该大于等于第14栏“其中：税控器具开具的普通发票不含税销售额”：【" + zzsxgmGridlb2VO.getSkqjkjdptfpxse1()
                    + "】,请检查！");
            return ResultVo.valueOfError("应税货物劳务以及服务、不动产和无形资产的第13栏“出口免税销售额”应该大于等于第14栏" +
                    "“其中：税控器具开具的普通发票销售额”，请检查！");
        }

        //强制：当主表第16栏“本期应纳税额”>=0时，主表第18栏“本期应纳税额减征额”必须小于或等于“本期应纳税额”。货物、服务列各自判断和监控。
        if (zzsxgmGridlb1VO.getBqynse() >= 0 && zzsxgmGridlb1VO.getBqynsejze() > zzsxgmGridlb1VO.getBqynse()) {
            LOG.error("====登记序号===【" + djxh + "====货物劳务====当主表第16栏“本期应纳税额”>=0时，bqynsejze1：【"
                    + zzsxgmGridlb1VO.getBqynsejze() + "】必须小于或等于“本期应纳税额”:【" + zzsxgmGridlb1VO.getBqynse() + "】");
            return ResultVo.valueOfError("主表第18栏“本期应纳税额减征额”必须小于或等于“本期应纳税额”。");
        }
        if (zzsxgmGridlb2VO.getBqynse() >= 0 && zzsxgmGridlb2VO.getBqynsejze() > zzsxgmGridlb2VO.getBqynse()) {
            LOG.error("====登记序号===【" + djxh + "====服务、不动产和无形资产====当主表第16栏“本期应纳税额”>=0时，" +
                    "bqynsejze2：【" + zzsxgmGridlb2VO.getBqynsejze() + "】" +
                    "必须小于或等于“本期应纳税额”:【" + zzsxgmGridlb2VO.getBqynse() + "】");
            return ResultVo.valueOfError("主表第18栏“本期应纳税额减征额”必须小于或等于“本期应纳税额”。");
        }

        //第15栏核定销售额: 通用：应税货物以及服务、不动产和无形资产核定节点YSHWHDXSE取值，只读！
        if (wsjdxxVO.getYshwhdxse() != zzsxgmGridlb1VO.getHdxse()) {
            return ResultVo.valueOfError("货物及劳务核定销售额应为" + wsjdxxVO.getYshwhdxse() + "，请检查申报表数据是否正确。");
        }
        if (wsjdxxVO.getYsfwhdxse() != zzsxgmGridlb2VO.getHdxse()) {
            return ResultVo.valueOfError("服务、不动产和无形资产核定销售额应为" + wsjdxxVO.getYsfwhdxse()
                    + "，请检查申报表数据是否正确。");
        }

        //强制：当主表第16栏“本期应纳税额”<0时，主表第18栏“本期应纳税额减征额”必须等于0。货物、服务列各自判断和监控。
        if (zzsxgmGridlb1VO.getBqynse() < 0 && zzsxgmGridlb1VO.getBqynsejze() != 0) {
            LOG.error("====登记序号===【" + djxh + "====货物劳务====当主表第16栏“本期应纳税额”>=0时，bqynsejze1：【"
                    + zzsxgmGridlb1VO.getBqynsejze() + "】必须小于或等于“本期应纳税额”bqynse1:【"
                    + zzsxgmGridlb1VO.getBqynse() + "】");
            return ResultVo.valueOfError("主表第18栏“本期应纳税额减征额”必须等于0。");
        }
        if (zzsxgmGridlb2VO.getBqynse() < 0 && zzsxgmGridlb2VO.getBqynsejze() != 0) {
            LOG.error("====登记序号===【" + djxh + "====货物劳务====当主表第16栏“本期应纳税额”>=0时，本期应纳税额减征额：【"
                    + zzsxgmGridlb2VO.getBqynsejze() + "】必须小于或等于“本期应纳税额”:【" + zzsxgmGridlb2VO.getBqynse() + "】");
            return ResultVo.valueOfError("主表第18栏“本期应纳税额减征额”必须等于0。");
        }

        //第17栏核定应纳税额: 通用：应税货物以及服务、不动产和无形资产核定节点YSHWHDYNSE取值，只读！
        if (wsjdxxVO.getYshwhdynse() != zzsxgmGridlb1VO.getHdynse()) {
            return ResultVo.valueOfError("货物及劳务核定应纳税额应为"
                    + wsjdxxVO.getYshwhdynse() + "，请检查申报表数据是否正确。");
        }
        if (wsjdxxVO.getYsfwhdynse() != zzsxgmGridlb2VO.getHdynse()) {
            return ResultVo.valueOfError("服务、不动产和无形资产核定应纳税额应为"
                    + wsjdxxVO.getYsfwhdynse() + "，请检查申报表数据是否正确。");
        }

        //强制：主表第19栏“本期免税额”应大于等于第20栏“其中：小微企业免税额”+21栏“未达起征点免税额”金额。
        double zb19add20_1 = ArithUtil.round(zzsxgmGridlb1VO.getXwqymse() + zzsxgmGridlb1VO.getWdqzdmse(), 2);
        if (zzsxgmGridlb1VO.getBqmse() < zb19add20_1) {
            LOG.error("====登记序号===【" + djxh + "====货物劳务====主表第19栏“本期免税额”bqmse1：【"
                    + zzsxgmGridlb1VO.getBqmse() + "】应大于等于第20栏+21栏金额”:【" + zb19add20_1 + "】");
            return ResultVo.valueOfError("主表第19栏“本期免税额”" + zzsxgmGridlb1VO.getBqmse()
                    + "应大于等于第20栏+21栏金额的和" + zb19add20_1 + "，请检查申报表数据是否正确。");
        }
        double zb19add20_2 = ArithUtil.round(zzsxgmGridlb2VO.getXwqymse() + zzsxgmGridlb2VO.getWdqzdmse(), 2);
        if (zzsxgmGridlb2VO.getBqmse() < zb19add20_2) {
            LOG.error("====登记序号===【" + djxh + "====服务、不动产和无形资产====主表第19栏“本期免税额”bqmse2：【"
                    + zzsxgmGridlb2VO.getBqmse() + "】应大于等于第20栏+21栏金额”:【" + zb19add20_2 + "】");
            return ResultVo.valueOfError("主表第19栏“本期免税额”" + zzsxgmGridlb2VO.getBqmse()
                    + "应大于等于第20栏“其中：小微企业免税额” + 21栏“未达起征点免税额”金额的和" + zb19add20_2
                    + "，请检查申报表数据是否正确。");
        }

        //本期免税额:应税货物劳务货物劳务第19栏“本期免税额”=第9栏“免税销售额”和×征收率，只读！
        double hwmsxse1 = ArithUtil.mul(msxse1, wsjdxxVO.getYshwynzsl(), 2);
        if (zzsxgmGridlb1VO.getBqmse() != hwmsxse1) {
            LOG.error("====登记序号===【" + djxh + "====应税货物劳务第19栏“本期免税额”：【" + zzsxgmGridlb1VO.getBqmse()
                    + "】应等于第9栏“免税销售额””:【" + msxse1 + "】乘于税率：【" + wsjdxxVO.getYshwynzsl()
                    + "】的值：【" + hwmsxse1 + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第19栏“本期免税额”" + zzsxgmGridlb1VO.getBqmse()
                    + "应等于第9栏“免税销售额”" + msxse1 + "乘于应税货物征收率" + wsjdxxVO.getYshwynzsl()
                    + "的值" + hwmsxse1 + "，请检查申报表数据是否正确。");
        }

        //其中：小微企业免税额:应税货物劳务第20栏“其中：小微企业免税额”=第10栏“其中：小微企业免税销售额”和×征收率，只读！
        double hwxwqymse1 = ArithUtil.mul(zzsxgmGridlb1VO.getXwqymsxse(), wsjdxxVO.getYshwynzsl(), 2);
        if (zzsxgmGridlb1VO.getXwqymse() != hwxwqymse1) {
            LOG.error("====登记序号===【" + djxh + "====应税货物劳务第20栏“本期免税额”：【" + zzsxgmGridlb1VO.getXwqymse()
                    + "】应等于第10栏“其中：小微企业免税销售额””:【" + zzsxgmGridlb1VO.getXwqymsxse() + "】乘于税率：【"
                    + wsjdxxVO.getYshwynzsl() + "】的值：【" + hwxwqymse1 + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第20栏“其中：小微企业免税额”" + zzsxgmGridlb1VO.getXwqymse()
                    + "应等于第10栏“其中：小微企业免税销售额”" + zzsxgmGridlb1VO.getXwqymsxse() + "乘于应税货物征收率"
                    + wsjdxxVO.getYshwynzsl() + "的值" + hwxwqymse1 + "，请检查申报表数据是否正确。");
        }
        //其中：小微企业免税额:服务、不动产和无形资产第20栏“其中：小微企业免税额”非个体户才允许填写，否则只读(个体户标志【0非个体户、1个体户】)。
        if (SbjyCodeEnum.GTH_CODE.equals(wsjdxxVO.getGthbz()) && zzsxgmGridlb2VO.getXwqymse() != 0) {
            LOG.error("====登记序号===【" + djxh + "===服务、不动产和无形资产第20栏“其中：小微企业免税额”:【"
                    + zzsxgmGridlb2VO.getXwqymse() + "】非个体户才允许填写!，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第20栏“其中：小微企业免税额”非个体户才允许填写!");
        }

        //未达起征点免税额:应税货物劳务第21栏“未达起征点免税额”=第11栏“未达起征点销售额”和×征收率，只读！
        double hwwdqzdmse1 = ArithUtil.mul(zzsxgmGridlb1VO.getWdqzdxse(), wsjdxxVO.getYshwynzsl(), 2);
        if (zzsxgmGridlb1VO.getWdqzdmse() != hwwdqzdmse1) {
            LOG.error("====登记序号===【" + djxh + "====应税货物劳务第21栏“未达起征点免税额”：【"
                    + zzsxgmGridlb1VO.getWdqzdmse() + "】应等于第11栏“未达起征点销售额””:【" + zzsxgmGridlb1VO.getWdqzdxse()
                    + "】乘于税率：【" + wsjdxxVO.getYshwynzsl() + "】的值：【" + hwwdqzdmse1 + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第21栏“未达起征点免税额”" + zzsxgmGridlb1VO.getWdqzdmse()
                    + "应等于第11栏“未达起征点销售额”" + zzsxgmGridlb1VO.getWdqzdxse() + "乘于应税货物征收率"
                    + wsjdxxVO.getYshwynzsl() + "的值" + hwwdqzdmse1 + "，请检查申报表数据是否正确。");
        }
        //未达起征点免税额:服务、不动产和无形资产第21栏“未达起征点免税额”个体户才允许填写，否则只读(个体户标志【0非个体户、1个体户】)。
        if (SbjyCodeEnum.F_GTH_CODE.equals(wsjdxxVO.getGthbz()) && zzsxgmGridlb1VO.getWdqzdmse() != 0) {
            LOG.error("====登记序号===【" + djxh + "===服务、不动产和无形资产第21栏“未达起征点免税额”:【"
                    + zzsxgmGridlb1VO.getWdqzdmse() + "】个体户才允许填写!，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第21栏“未达起征点免税额”个体户才允许填写!");
        }

        //第22货物劳务应纳税额合计:本期应纳税额-本期应纳税额减征额 或 核定应纳税额 - 本期应纳税额减征额(取最大值)
        double hwynsehj1 = ArithUtil.round(zzsxgmGridlb1VO.getBqynse() - zzsxgmGridlb1VO.getBqynsejze(), 2);//-12000
        double hwynsehj2 = ArithUtil.round(wsjdxxVO.getYshwhdynse() - zzsxgmGridlb1VO.getBqynsejze(), 2);//0
        LOG.info("====登记序号===【" + djxh + "====hwgsz4：【" + hwynsehj1 + "】====hwgsz5：【" + hwynsehj2 + "】");
        double hwynsehjMax = hwynsehj1 > hwynsehj2 ? hwynsehj1 : hwynsehj2;

        if (SbjyCodeEnum.F_HWDSHBZ_CODE.equals(wsjdxxVO.getHwdshbz()) && SbjyCodeEnum.F_FWDSHBZ_CODE.equals(wsjdxxVO.getFwdshbz())) {
            hwynsehjMax = hwynsehj1;
        }
        if (wsjdxxVO.getYshwhdxse() <= 0) {
            hwynsehjMax = hwynsehj1;
        }
        if (zzsxgmGridlb1VO.getYnsehj() != hwynsehjMax) {
            LOG.error("====登记序号===【" + djxh + "】货物及劳务应纳税额合计hwynsehjMax应为" + hwynsehjMax + "，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("货物及劳务应纳税额合计应为" + hwynsehjMax + "，请检查申报表数据是否正确。");
        }
        //第22栏服务、不动产和无形资产应纳税额合计:本期应纳税额-本期应纳税额减征额 或 核定应纳税额 - 本期应纳税额减征额(取最大值)
        double fwynsehj1 = ArithUtil.round(zzsxgmGridlb2VO.getBqynse() - zzsxgmGridlb2VO.getBqynsejze(), 2);
        double fwynsehj2 = ArithUtil.round(wsjdxxVO.getYsfwhdynse() - zzsxgmGridlb2VO.getBqynsejze(), 2);
        LOG.info("====登记序号===【" + djxh + "====fwgsz4：【" + fwynsehj1 + "】====fwgsz5：【" + fwynsehj2 + "】");
        double fwynsehjMax = fwynsehj1 > fwynsehj2 ? fwynsehj1 : fwynsehj2;
        if (SbjyCodeEnum.F_HWDSHBZ_CODE.equals(wsjdxxVO.getHwdshbz()) && SbjyCodeEnum.F_FWDSHBZ_CODE.equals(wsjdxxVO.getFwdshbz())) {
            fwynsehjMax = fwynsehj1;
        }
        if (wsjdxxVO.getYsfwhdxse() <= 0) {
            fwynsehjMax = fwynsehj1;
        }
        if (zzsxgmGridlb2VO.getYnsehj() != fwynsehjMax) {
            LOG.error("====登记序号===【" + djxh + "服务、不动产和无形资产应纳税额合计fwynsehjMax应为"
                    + fwynsehjMax + "，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产应纳税额合计应为" + fwynsehjMax + "，请检查申报表数据是否正确。");
        }

        //第23栏本期预缴税额：手工填写，可修改。不能小于核定节点值<BQYSHWYJ>，不能大于核定节点值<BQYSHWYJ>的1.5倍。
        Double bqyshwyjgt3Max = ArithUtil.round(wsjdxxVO.getBqyshwyjgt3() * 1.5, 2);
        LOG.info("====登记序号===【" + djxh + "】====货物及劳务 本期预缴税额====【" + zzsxgmGridlb1VO.getBqyjse1() + "】" +
                "====本期应税服务金三预缴值====【" + wsjdxxVO.getBqyshwyjgt3() + "】==本期预缴税额最大值==【" + bqyshwyjgt3Max + "】");
        if (zzsxgmGridlb1VO.getBqyjse1() < wsjdxxVO.getBqyshwyjgt3() || zzsxgmGridlb1VO.getBqyjse1() > (bqyshwyjgt3Max)) {
            return ResultVo.valueOfError("本期预缴税额要在" + wsjdxxVO.getBqyshwyjgt3() + " -- " + bqyshwyjgt3Max + "之间！");
        }
        Double bqysfwyjgt3Max = ArithUtil.round(wsjdxxVO.getBqysfwyjgt3() * 1.5, 2);
        LOG.info("====登记序号===【" + djxh + "】====服务、不动产和无形资产 本期预缴税额====【" + zzsxgmGridlb2VO.getBqyjse1() + "】" +
                "====本期应税服务金三预缴值====【" + wsjdxxVO.getBqysfwyjgt3() + "】==本期预缴税额最大值==【" + bqysfwyjgt3Max + "】");
        if (zzsxgmGridlb2VO.getBqyjse1() < wsjdxxVO.getBqysfwyjgt3() || zzsxgmGridlb2VO.getBqyjse1() > (bqysfwyjgt3Max)) {
            return ResultVo.valueOfError("本期预缴税额要在" + wsjdxxVO.getBqysfwyjgt3() + " -- " + bqysfwyjgt3Max + "之间！");
        }

        // 第24栏货物及劳务和服务本期应补（退）税额 :应纳税额合计-本期预缴税额
        double hwbqybtse = ArithUtil.round(zzsxgmGridlb1VO.getYnsehj() - zzsxgmGridlb1VO.getBqyjse1(), 2);
        if (zzsxgmGridlb1VO.getBqybtse() != hwbqybtse) {
            LOG.info("====登记序号===【" + djxh + "】====货物及劳务本期应补（退）税额：【" + zzsxgmGridlb1VO.getBqybtse()
                    + "】应该等于应纳税额合计：【" + zzsxgmGridlb1VO.getYnsehj() + "】减去本期预缴税额：【"
                    + zzsxgmGridlb1VO.getBqyjse1() + "】的差：【" + hwbqybtse + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("货物及劳务本期应补（退）税额应为" + hwbqybtse + "，请检查申报表数据是否正确。");
        }
        double fwbqybtse = ArithUtil.round(zzsxgmGridlb2VO.getYnsehj() - zzsxgmGridlb2VO.getBqyjse1(), 2);
        if (zzsxgmGridlb2VO.getBqybtse() != fwbqybtse) {
            LOG.info("====登记序号===【" + djxh + "】====服务、不动产和无形资产本期应补（退）税额：【"
                    + zzsxgmGridlb2VO.getBqybtse() + "】应该等于应纳税额合计：【" + zzsxgmGridlb2VO.getYnsehj()
                    + "】减去本期预缴税额：【" + zzsxgmGridlb2VO.getBqyjse1() + "】的差：【" + fwbqybtse
                    + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产本期应补（退）税额应为" + fwbqybtse + "，请检查申报表数据是否正确。");
        }
        //强制：当主表第24栏应补退税额小于0时，提示“主表第24栏本期应补（退）税额”为负数，不允许网上申报，请前往主管税务机关进行申报。”
        if (zzsxgmGridlb1VO.getBqybtse() < 0 || zzsxgmGridlb2VO.getBqybtse() < 0) {
            LOG.error("====登记序号===【" + djxh + "====货物劳务====主表第24栏本期应补（退）税额bqybtse1：【"
                    + zzsxgmGridlb1VO.getBqybtse() + "】或者服务、不动产和无形资产====主表第24栏本期应补（退）税额bqybtse2：【"
                    + zzsxgmGridlb2VO.getBqybtse() + "】为负数，不允许网上申报，请前往主管税务机关进行申报。");
            return ResultVo.valueOfError("“主表第24栏本期应补（退）税额”为负数，不允许网上申报，请前往主管税务机关进行申报。”");
        }
        //本期销售不动产销售额：应税货物劳务第25栏本期销售不动产销售额默认为0
        if (zzsxgmGridlb1VO.getBdcxse() != 0) {
            LOG.error("====登记序号===【" + djxh + "====应税货物劳务第25栏本期销售不动产销售额应该为0，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第25栏本期销售不动产销售额应该为0，请检查申报表数据是否正确。");
        }
        /*------------------------------------货物劳务和服务、不动产和无形资产主表【表内】关系校验结束-------------------------*/

        /*------------------------------------货物劳务和服务、不动产和无形资产主表【表间】关系校验开始-------------------------*/

        //强制：责令认定、逾期未认定小规模纳税人，不允许申报，强制退出。
//        if (wsxxVO.getYqwrdbz().equals("1")) {
//            LOG.error("责令认定、逾期未认定小规模纳税人，不允许申报");
//            return ResultVo.valueOfError("您属于责令认定、逾期未认定小规模纳税人,不允许申报。");
//        }

        /*------------------------------------货物劳务和服务、不动产和无形资产主表【表间】关系校验结束-------------------------*/
        //主表货物劳务和服务、不动产和无形资产本年累计值校验
        ResultVo resultVo = getBnljJsjy(djxh);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        return ResultVo.valueOfSuccess();
    }

    /***
     * 校验主表本年累计值计算
     * @param djxh
     * @return
     */
    private ResultVo getBnljJsjy(String djxh) {

        //第1栏：货物劳务以及服务、不动产和无形资产 应征增值税不含税销售额（3%征收率）
        double bnljYzzzsbhsxse3 = ArithUtil.round(zzsxgmGridlb1VO.getYzzzsbhsxse()
                + lsjdxxVO.getYzzzsbhsxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getYzzzsbhsxse() != bnljYzzzsbhsxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第1栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getYzzzsbhsxse(), 2) + "】应该等于第1栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getYzzzsbhsxse() + "】 + 上期应税货物劳务第1栏第3列本年累计值【" + lsjdxxVO.getYzzzsbhsxse3()
                    + "】的和【" + ArithUtil.roundStr(bnljYzzzsbhsxse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第1栏第3列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getYzzzsbhsxse(), 2) + "应该等于第1栏第1列本期销售额"
                    + zzsxgmGridlb1VO.getYzzzsbhsxse() + " + 上期应税货物劳务第1栏第3列本年累计值" + lsjdxxVO.getYzzzsbhsxse3()
                    + "的和" + ArithUtil.roundStr(bnljYzzzsbhsxse3, 2) + "，请检查申报表数据是否正确。");
        }
        double bnljYzzzsbhsxse4 = ArithUtil.round(zzsxgmGridlb2VO.getYzzzsbhsxse()
                + lsjdxxVO.getYzzzsbhsxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getYzzzsbhsxse() != bnljYzzzsbhsxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第1栏第4列本年累计值" +
                    "【" + zzsxgmGridlb4VO.getYzzzsbhsxse() + "】应该等于第1栏第2列本期销售额【"
                    + ArithUtil.roundStr(zzsxgmGridlb2VO.getYzzzsbhsxse(), 2) + "】" +
                    " + 上期应税货物劳务第1栏第4列本年累计值【" + lsjdxxVO.getYzzzsbhsxse4() + "】的和" +
                    "【" + ArithUtil.roundStr(bnljYzzzsbhsxse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第1栏第4列本年累计值"
                    + zzsxgmGridlb4VO.getYzzzsbhsxse() + "应该等于第1栏第2列本期销售额"
                    + ArithUtil.roundStr(zzsxgmGridlb2VO.getYzzzsbhsxse(), 2)
                    + " + 上期服务、不动产和无形资产第1栏第4列本年累计值" + lsjdxxVO.getYzzzsbhsxse4()
                    + "的和" + ArithUtil.roundStr(bnljYzzzsbhsxse4, 2) + "，请检查申报表数据是否正确。");
        }

        //第2栏：货物劳务以及服务、不动产和无形资产 税务机关代开的增值税专用票不含税销售额
        double bnljSwjgdkdzzszyfpbhsxse3 = ArithUtil.round(zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse()
                + lsjdxxVO.getSwjgdkdzzszyfpbhsxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getSwjgdkdzzszyfpbhsxse() != bnljSwjgdkdzzszyfpbhsxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第2栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getSwjgdkdzzszyfpbhsxse(), 2)
                    + "】应该等于第2栏第1列本期销售额【" + zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse()
                    + "】 + 上期应税货物劳务第2栏第3列本年累计值【" + lsjdxxVO.getSwjgdkdzzszyfpbhsxse3()
                    + "】的和【" + ArithUtil.roundStr(bnljSwjgdkdzzszyfpbhsxse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第2栏第3列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getSwjgdkdzzszyfpbhsxse(), 2) + "应该等于第2栏第1列本期销售额"
                    + zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse() + " + 上期应税货物劳务第2栏第3列本年累计值"
                    + lsjdxxVO.getSwjgdkdzzszyfpbhsxse3() + "的和" + ArithUtil.roundStr(bnljSwjgdkdzzszyfpbhsxse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljSwjgdkdzzszyfpbhsxse4 = ArithUtil.round(zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse()
                + lsjdxxVO.getSwjgdkdzzszyfpbhsxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getSwjgdkdzzszyfpbhsxse() != bnljSwjgdkdzzszyfpbhsxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第2栏第4列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getSwjgdkdzzszyfpbhsxse(), 2) + "】应该等于第2栏第2列本期销售额【"
                    + zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse() + "】 + 上期应税货物劳务第2栏第4列本年累计值【"
                    + lsjdxxVO.getSwjgdkdzzszyfpbhsxse4() + "】的和【" + ArithUtil.roundStr(bnljSwjgdkdzzszyfpbhsxse4, 2)
                    + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第2栏第4列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getSwjgdkdzzszyfpbhsxse(), 2) + "应该等于第2栏第2列本期销售额"
                    + zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse() + " + 上期服务、不动产和无形资产第2栏第4列本年累计值"
                    + lsjdxxVO.getSwjgdkdzzszyfpbhsxse4() + "的和" + ArithUtil.roundStr(bnljSwjgdkdzzszyfpbhsxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第3栏：货物劳务以及服务、不动产和无形资产 税控器具开具的普通发票不含 税销售额
        double bnljSkqjkjdptfpbhsxse3 = ArithUtil.round(zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse()
                + lsjdxxVO.getSkqjkjdptfpbhsxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getSkqjkjdptfpbhsxse() != bnljSkqjkjdptfpbhsxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第3栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getSkqjkjdptfpbhsxse(), 2) + "】应该等于第3栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse() + "】 + 上期应税货物劳务第3栏第3列本年累计值【"
                    + lsjdxxVO.getSkqjkjdptfpbhsxse3() + "】的和【" + ArithUtil.roundStr(bnljSkqjkjdptfpbhsxse3, 2)
                    + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第3栏第3列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getSkqjkjdptfpbhsxse(), 2) + "应该等于第3栏第1列本期销售额"
                    + zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse() + " + 上期应税货物劳务第3栏第3列本年累计值"
                    + lsjdxxVO.getSkqjkjdptfpbhsxse3() + "的和" + ArithUtil.roundStr(bnljSkqjkjdptfpbhsxse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljSkqjkjdptfpbhsxse4 = ArithUtil.round(zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse()
                + lsjdxxVO.getSkqjkjdptfpbhsxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getSkqjkjdptfpbhsxse() != bnljSkqjkjdptfpbhsxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第3栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getSkqjkjdptfpbhsxse(), 2) + "】应该等于第3栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse() + "】 + 上期应税货物劳务第3栏第4列本年累计值【"
                    + lsjdxxVO.getSkqjkjdptfpbhsxse4() + "】的和【" + ArithUtil.roundStr(bnljSkqjkjdptfpbhsxse4, 2)
                    + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第3栏第4列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getSkqjkjdptfpbhsxse(), 2) + "应该等于第3栏第2列本期销售额"
                    + zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse() + " + 上期服务、不动产和无形资产第3栏第4列本年累计值"
                    + lsjdxxVO.getSkqjkjdptfpbhsxse4() + "的和" + ArithUtil.roundStr(bnljSkqjkjdptfpbhsxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第4栏：服务、不动产和无形资产 应征增值税不含税销售额（5%征收率）
        double bnljXsczbdcbhsxse4 = ArithUtil.round(zzsxgmGridlb2VO.getXsczbdcbhsxse()
                + lsjdxxVO.getXsczbdcbhsxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getXsczbdcbhsxse() != bnljXsczbdcbhsxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第4栏第4列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getXsczbdcbhsxse(), 2) + "】应该等于第4栏第2列本期销售额【"
                    + zzsxgmGridlb2VO.getXsczbdcbhsxse() + "】 + 上期应税货物劳务第4栏第4列本年累计值【"
                    + lsjdxxVO.getXsczbdcbhsxse4() + "】的和【" + ArithUtil.roundStr(bnljXsczbdcbhsxse4, 2)
                    + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第4栏第4列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getXsczbdcbhsxse(), 2) + "应该等于第4栏第2列本期销售额"
                    + zzsxgmGridlb2VO.getXsczbdcbhsxse() + " + 上期服务、不动产和无形资产第4栏第4列本年累计值"
                    + lsjdxxVO.getXsczbdcbhsxse4() + "的和" + ArithUtil.roundStr(bnljXsczbdcbhsxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第5栏：服务、不动产和无形资产 税务机关代开的增值税专用发票不含税销售额
        double bnljSwjgdkdzzszyfpbhsxse14 = ArithUtil.round(zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse1()
                + lsjdxxVO.getSwjgdkdzzszyfpbhsxse14().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getSwjgdkdzzszyfpbhsxse1() != bnljSwjgdkdzzszyfpbhsxse14) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第5栏第4列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getSwjgdkdzzszyfpbhsxse1(), 2)
                    + "】应该等于第5栏第2列本期销售额【" + zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse1()
                    + "】 + 期应税货物劳务第5栏第4列本年累计值【" + lsjdxxVO.getSwjgdkdzzszyfpbhsxse14()
                    + "】的和【" + ArithUtil.roundStr(bnljSwjgdkdzzszyfpbhsxse14, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第5栏第4列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getSwjgdkdzzszyfpbhsxse1(), 2) + "应该等于第5栏第2列本期销售额"
                    + zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse1() + " + 期服务、不动产和无形资产第5栏第4列本年累计值"
                    + lsjdxxVO.getSwjgdkdzzszyfpbhsxse14() + "的和" + ArithUtil.roundStr(bnljSwjgdkdzzszyfpbhsxse14, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第6栏：服务、不动产和无形资产 税控器具开具的普通发票不含税销售额
        double bnljSkqjkjdptfpbhsxse24 = ArithUtil.round(zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse2()
                + lsjdxxVO.getSkqjkjdptfpbhsxse24().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getSkqjkjdptfpbhsxse2() != bnljSkqjkjdptfpbhsxse24) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第6栏第4列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getSkqjkjdptfpbhsxse2(), 2) + "】应该等于第6栏第2列本期销售额【"
                    + zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse2() + "】 + 上期应税货物劳务第6栏第4列本年累计值【"
                    + lsjdxxVO.getSkqjkjdptfpbhsxse24() + "】的和【" + ArithUtil.roundStr(bnljSkqjkjdptfpbhsxse24, 2)
                    + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第6栏第4列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getSkqjkjdptfpbhsxse2(), 2) + "应该等于第6栏第2列本期销售额"
                    + zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse2() + " + 上期服务、不动产和无形资产第6栏第4列本年累计值"
                    + lsjdxxVO.getSkqjkjdptfpbhsxse24() + "的和" + ArithUtil.roundStr(bnljSkqjkjdptfpbhsxse24, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第7栏：货物劳务 销售使用过的固定资产不含税销售额
        double bnljXssygdysgdzcbhsxse3 = ArithUtil.round(zzsxgmGridlb1VO.getXssygdysgdzcbhsxse()
                + lsjdxxVO.getXssygdysgdzcbhsxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getXssygdysgdzcbhsxse() != bnljXssygdysgdzcbhsxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第7栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getXssygdysgdzcbhsxse(), 2) + "】应该等于第7栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getXssygdysgdzcbhsxse() + "】 + 上期应税货物劳务第7栏第3列本年累计值【"
                    + lsjdxxVO.getXssygdysgdzcbhsxse3() + "】的和【" + ArithUtil.roundStr(bnljXssygdysgdzcbhsxse3, 2) + "】，" +
                    "请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第7栏第3列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getXssygdysgdzcbhsxse(), 2) + "应该等于第7栏第1列本期销售额"
                    + zzsxgmGridlb1VO.getXssygdysgdzcbhsxse() + " + 上期应税货物劳务第7栏第3列本年累计值"
                    + lsjdxxVO.getXssygdysgdzcbhsxse3() + "的和" + ArithUtil.roundStr(bnljXssygdysgdzcbhsxse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第8栏：货物劳务 其中：税控器具开具的普通发票不含税销售额
        double bnljSkqjkjdptfpbhsxse13 = ArithUtil.round(zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse1()
                + lsjdxxVO.getSkqjkjdptfpbhsxse13().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getSkqjkjdptfpbhsxse1() != bnljSkqjkjdptfpbhsxse13) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第8栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getSkqjkjdptfpbhsxse1(), 2) + "】应该等于第8栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse1() + "】 + 上期应税货物劳务第8栏第3列本年累计值【"
                    + lsjdxxVO.getSkqjkjdptfpbhsxse13() + "】的和【" + ArithUtil.roundStr(bnljSkqjkjdptfpbhsxse13, 2)
                    + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第8栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getSkqjkjdptfpbhsxse1(), 2)
                    + "应该等于第8栏第1列本期销售额" + zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse1() + " + 上期应税货物劳务第8栏第3列本年累计值"
                    + lsjdxxVO.getSkqjkjdptfpbhsxse13() + "的和" + ArithUtil.roundStr(bnljSkqjkjdptfpbhsxse13, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第9栏：货物劳务以及服务、不动产和无形资产 免税销售额
        double bnljMsxse3 = ArithUtil.round(zzsxgmGridlb1VO.getMsxse() + lsjdxxVO.getMsxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getMsxse() != bnljMsxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第9栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getMsxse(), 2) + "】应该等于第9栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getMsxse() + "】 + 上期应税货物劳务第9栏第3列本年累计值【" + lsjdxxVO.getMsxse3()
                    + "】的和【" + ArithUtil.roundStr(bnljMsxse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第9栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getMsxse(), 2)
                    + "应该等于第9栏第1列本期销售额" + zzsxgmGridlb1VO.getMsxse() + " + 上期应税货物劳务第9栏第3列本年累计值"
                    + lsjdxxVO.getMsxse3() + "的和" + ArithUtil.roundStr(bnljMsxse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljMsxse4 = ArithUtil.round(zzsxgmGridlb2VO.getMsxse() + lsjdxxVO.getMsxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getMsxse() != bnljMsxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第3栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getMsxse(), 2) + "】应该等于第9栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getMsxse() + "】 + 上期应税货物劳务第9栏第4列本年累计值【" + lsjdxxVO.getMsxse4()
                    + "】的和【" + ArithUtil.roundStr(bnljMsxse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第9栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getMsxse(), 2)
                    + "应该等于第9栏第2列本期销售额" + zzsxgmGridlb2VO.getMsxse() + " + 上期服务、不动产和无形资产第9栏第4列本年累计值"
                    + lsjdxxVO.getMsxse4() + "的和" + ArithUtil.roundStr(bnljMsxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第10栏：货物劳务以及服务、不动产和无形资产 其中：小微企业免税销售额
        double bnljXwqymsxse3 = ArithUtil.round(zzsxgmGridlb1VO.getXwqymsxse() + lsjdxxVO.getXwqymsxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getXwqymsxse() != bnljXwqymsxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第10栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getXwqymsxse(), 2) + "】应该等于第10栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getXwqymsxse() + "】 + 上期应税货物劳务第10栏第3列本年累计值【" + lsjdxxVO.getXwqymsxse3()
                    + "】的和【" + ArithUtil.roundStr(bnljXwqymsxse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第10栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getXwqymsxse(), 2)
                    + "应该等于第10栏第1列本期销售额" + zzsxgmGridlb1VO.getXwqymsxse() + " + 上期应税货物劳务第10栏第3列本年累计值"
                    + lsjdxxVO.getXwqymsxse3() + "的和" + ArithUtil.roundStr(bnljXwqymsxse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljXwqymsxse4 = ArithUtil.round(zzsxgmGridlb2VO.getXwqymsxse() + lsjdxxVO.getXwqymsxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getXwqymsxse() != bnljXwqymsxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第10栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getXwqymsxse(), 2) + "】应该等于第10栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getXwqymsxse() + "】 + 上期应税货物劳务第10栏第4列本年累计值【" + lsjdxxVO.getXwqymsxse4()
                    + "】的和【" + ArithUtil.roundStr(bnljXwqymsxse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第10栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getXwqymsxse(), 2)
                    + "应该等于第10栏第2列本期销售额" + zzsxgmGridlb2VO.getXwqymsxse() + " + 上期服务、不动产和无形资产第10栏第4列本年累计值"
                    + lsjdxxVO.getXwqymsxse4() + "的和" + ArithUtil.roundStr(bnljXwqymsxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第11栏：货物劳务以及服务、不动产和无形资产 未达起征点销售额
        double bnljWdqzdxse3 = ArithUtil.round(zzsxgmGridlb1VO.getWdqzdxse() + lsjdxxVO.getWdqzdxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getWdqzdxse() != bnljWdqzdxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第11栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getWdqzdxse(), 2) + "】应该等于第11栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getWdqzdxse() + " + 上期应税货物劳务第11栏第3列本年累计值【" + lsjdxxVO.getWdqzdxse3()
                    + "】的和【" + ArithUtil.roundStr(bnljWdqzdxse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第11栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getWdqzdxse(), 2)
                    + "应该等于第11栏第1列本期销售额" + zzsxgmGridlb1VO.getWdqzdxse() + " + 上期应税货物劳务第11栏第3列本年累计值"
                    + lsjdxxVO.getWdqzdxse3() + "的和" + ArithUtil.roundStr(bnljWdqzdxse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljWdqzdxse4 = ArithUtil.round(zzsxgmGridlb2VO.getWdqzdxse() + lsjdxxVO.getWdqzdxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getWdqzdxse() != bnljWdqzdxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第11栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getWdqzdxse(), 2) + "】应该等于第11栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getWdqzdxse() + "】 + 上期应税货物劳务第11栏第4列本年累计值【" + lsjdxxVO.getWdqzdxse4()
                    + "】的和【" + ArithUtil.roundStr(bnljWdqzdxse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第11栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getWdqzdxse(), 2)
                    + "应该等于第11栏第2列本期销售额" + zzsxgmGridlb2VO.getWdqzdxse() + " + 上期服务、不动产和无形资产第11栏第4列本年累计值"
                    + lsjdxxVO.getWdqzdxse4() + "的和" + ArithUtil.roundStr(bnljWdqzdxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第12栏：货物劳务以及服务、不动产和无形资产 其他免税销售额
        double bnljQtmsxse3 = ArithUtil.round(zzsxgmGridlb1VO.getQtmsxse() + lsjdxxVO.getQtmsxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getQtmsxse() != bnljQtmsxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第12栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getQtmsxse(), 2) + "】应该等于第12栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getQtmsxse() + "】 + 上期应税货物劳务第12栏第3列本年累计值【" + lsjdxxVO.getQtmsxse3()
                    + "】的和【" + ArithUtil.roundStr(bnljQtmsxse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第12栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getQtmsxse(), 2)
                    + "应该等于第12栏第1列本期销售额" + zzsxgmGridlb1VO.getQtmsxse() + " + 上期应税货物劳务第12栏第3列本年累计值"
                    + lsjdxxVO.getQtmsxse3() + "的和" + ArithUtil.roundStr(bnljQtmsxse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljQtmsxse4 = ArithUtil.round(zzsxgmGridlb2VO.getQtmsxse() + lsjdxxVO.getQtmsxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getQtmsxse() != bnljQtmsxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第12栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getQtmsxse(), 2) + "】应该等于第12栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getQtmsxse() + "】 + 上期应税货物劳务第12栏第4列本年累计值【" + lsjdxxVO.getQtmsxse4()
                    + "】的和【" + ArithUtil.roundStr(bnljQtmsxse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第12栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getQtmsxse(), 2)
                    + "应该等于第12栏第2列本期销售额" + zzsxgmGridlb2VO.getQtmsxse() + " + 上期服务、不动产和无形资产第12栏第4列本年累计值"
                    + lsjdxxVO.getQtmsxse4() + "的和" + ArithUtil.roundStr(bnljQtmsxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第13栏：货物劳务以及服务、不动产和无形资产 出口免税销售额
        double bnljCkmsxse3 = ArithUtil.round(zzsxgmGridlb1VO.getCkmsxse() + lsjdxxVO.getCkmsxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getCkmsxse() != bnljCkmsxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第13栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getCkmsxse(), 2) + "】应该等于第13栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getCkmsxse() + "】 + 上期应税货物劳务第13栏第3列本年累计值【" + lsjdxxVO.getCkmsxse3()
                    + "】的和【" + ArithUtil.roundStr(bnljCkmsxse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第13栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getCkmsxse(), 2)
                    + "应该等于第13栏第1列本期销售额" + zzsxgmGridlb1VO.getCkmsxse() + " + 上期应税货物劳务第13栏第3列本年累计值"
                    + lsjdxxVO.getCkmsxse3() + "的和" + ArithUtil.roundStr(bnljCkmsxse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljCkmsxse4 = ArithUtil.round(zzsxgmGridlb2VO.getCkmsxse() + lsjdxxVO.getCkmsxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getCkmsxse() != bnljCkmsxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第13栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getCkmsxse(), 2) + "】应该等于第13栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getCkmsxse() + "】 + 上期应税货物劳务第13栏第4列本年累计值【" + lsjdxxVO.getCkmsxse4()
                    + "】的和【" + ArithUtil.roundStr(bnljCkmsxse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第13栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getCkmsxse(), 2)
                    + "应该等于第13栏第2列本期销售额" + zzsxgmGridlb2VO.getCkmsxse() + " + 上期服务、不动产和无形资产第13栏第4列本年累计值"
                    + lsjdxxVO.getCkmsxse4() + "的和" + ArithUtil.roundStr(bnljCkmsxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第14栏：货物劳务以及服务、不动产和无形资产 其中：税控器具开具的普通发票销售额
        double bnljSkqjkjdptfpxse13 = ArithUtil.round(zzsxgmGridlb1VO.getSkqjkjdptfpxse1() + lsjdxxVO.getSkqjkjdptfpxse13().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getSkqjkjdptfpxse1() != bnljSkqjkjdptfpxse13) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第14栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getSkqjkjdptfpxse1(), 2) + "】应该等于第14栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getSkqjkjdptfpxse1() + "】 + 上期应税货物劳务第14栏第3列本年累计值【" + lsjdxxVO.getSkqjkjdptfpxse13()
                    + "】的和【" + ArithUtil.roundStr(bnljSkqjkjdptfpxse13, 2) + "】，" +
                    "请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第14栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getSkqjkjdptfpxse1(), 2)
                    + "应该等于第14栏第1列本期销售额" + zzsxgmGridlb1VO.getSkqjkjdptfpxse1() + " + 上期应税货物劳务第14栏第3列本年累计值"
                    + lsjdxxVO.getSkqjkjdptfpxse13() + "的和" + ArithUtil.roundStr(bnljSkqjkjdptfpxse13, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljSkqjkjdptfpxse14 = ArithUtil.round(zzsxgmGridlb2VO.getSkqjkjdptfpxse1() + lsjdxxVO.getSkqjkjdptfpxse14().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getSkqjkjdptfpxse1() != bnljSkqjkjdptfpxse14) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第14栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getSkqjkjdptfpxse1(), 2) + "】应该等于第14栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getSkqjkjdptfpxse1() + "】 + 上期应税货物劳务第14栏第4列本年累计值【" + lsjdxxVO.getSkqjkjdptfpxse14()
                    + "】的和【" + ArithUtil.roundStr(bnljSkqjkjdptfpxse14, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第14栏第4列本年累计值"
                    + ArithUtil.roundStr(zzsxgmGridlb4VO.getSkqjkjdptfpxse1(), 2) + "应该等于第14栏第2列本期销售额"
                    + zzsxgmGridlb2VO.getSkqjkjdptfpxse1() + " + 上期服务、不动产和无形资产第14栏第4列本年累计值"
                    + lsjdxxVO.getSkqjkjdptfpxse14() + "的和" + ArithUtil.roundStr(bnljSkqjkjdptfpxse14, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第15栏：货物劳务以及服务、不动产和无形资产 核定销售额
        double bnljHdxse3 = ArithUtil.round(zzsxgmGridlb1VO.getHdxse() + lsjdxxVO.getHdxse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getHdxse() != bnljHdxse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第15栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getHdxse(), 2) + "】应该等于第15栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getHdxse() + "】 + 上期应税货物劳务第15栏第3列本年累计值【" + lsjdxxVO.getHdxse3()
                    + "】的和【" + ArithUtil.roundStr(bnljHdxse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第15栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getHdxse(), 2)
                    + "应该等于第15栏第1列本期销售额" + zzsxgmGridlb1VO.getHdxse() + " + 上期应税货物劳务第15栏第3列本年累计值"
                    + lsjdxxVO.getHdxse3() + "的和" + ArithUtil.roundStr(bnljHdxse3, 2) + "，请检查申报表数据是否正确。");
        }
        double bnljHdxse4 = ArithUtil.round(zzsxgmGridlb2VO.getHdxse() + lsjdxxVO.getHdxse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getHdxse() != bnljHdxse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第15栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getHdxse(), 2) + "】应该等于第15栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getHdxse() + "】 + 上期应税货物劳务第15栏第4列本年累计值【" + lsjdxxVO.getHdxse4()
                    + "】的和【" + ArithUtil.roundStr(bnljHdxse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第15栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getHdxse(), 2)
                    + "应该等于第15栏第2列本期销售额" + zzsxgmGridlb2VO.getHdxse() + " + 上期服务、不动产和无形资产第15栏第4列本年累计值"
                    + lsjdxxVO.getHdxse4() + "的和" + ArithUtil.roundStr(bnljHdxse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第16栏：货物劳务以及服务、不动产和无形资产 本期应纳税额
        double bnljBqynse3 = ArithUtil.round(zzsxgmGridlb1VO.getBqynse() + lsjdxxVO.getBqynse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getBqynse() != bnljBqynse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第16栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getBqynse(), 2) + "】应该等于第16栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getBqynse() + "】 + 上期应税货物劳务第16栏第3列本年累计值【" + lsjdxxVO.getBqynse3()
                    + "】的和【" + ArithUtil.roundStr(bnljBqynse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第16栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getBqynse(), 2)
                    + "应该等于第16栏第1列本期销售额" + zzsxgmGridlb1VO.getBqynse() + " + 上期应税货物劳务第16栏第3列本年累计值"
                    + lsjdxxVO.getBqynse3() + "的和" + ArithUtil.roundStr(bnljBqynse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljBqynse4 = ArithUtil.round(zzsxgmGridlb2VO.getBqynse() + lsjdxxVO.getBqynse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getBqynse() != bnljBqynse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第16栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getBqynse(), 2) + "】应该等于第16栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getBqynse() + "】 + 上期应税货物劳务第16栏第4列本年累计值【" + lsjdxxVO.getBqynse4()
                    + "】的和【" + ArithUtil.roundStr(bnljBqynse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第16栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getBqynse(), 2)
                    + "应该等于第16栏第2列本期销售额" + zzsxgmGridlb2VO.getBqynse() + " + 上期服务、不动产和无形资产第16栏第4列本年累计值"
                    + lsjdxxVO.getBqynse4() + "的和" + ArithUtil.roundStr(bnljBqynse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第17栏：货物劳务以及服务、不动产和无形资产 核定应纳税额
        double bnljHdynse3 = ArithUtil.round(zzsxgmGridlb1VO.getHdynse() + lsjdxxVO.getHdynse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getHdynse() != bnljHdynse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第17栏第3列本年累计值【" + ArithUtil.roundStr(zzsxgmGridlb3VO.getHdynse(), 2)
                    + "】应该等于第17栏第1列本期销售额【" + zzsxgmGridlb1VO.getHdynse() + "】 + 上期应税货物劳务第17栏第3列本年累计值" +
                    "【" + lsjdxxVO.getHdynse3() + "】的和【" + ArithUtil.roundStr(bnljHdynse3, 2) + "】，" +
                    "请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第17栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getHdynse(), 2)
                    + "应该等于第17栏第1列本期销售额" + zzsxgmGridlb1VO.getHdynse() + " + 上期应税货物劳务第17栏第3列本年累计值"
                    + lsjdxxVO.getHdynse3() + "的和" + ArithUtil.roundStr(bnljHdynse3, 2) + "，请检查申报表数据是否正确。");
        }
        double bnljHdynse4 = ArithUtil.round(zzsxgmGridlb2VO.getHdynse() + lsjdxxVO.getHdynse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getHdynse() != bnljHdynse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第17栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getHdynse(), 2) + "】应该等于第17栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getHdynse() + "】 + 上期应税货物劳务第17栏第4列本年累计值【" + lsjdxxVO.getHdynse4()
                    + "】的和【" + ArithUtil.roundStr(bnljHdynse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第17栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getHdynse(), 2)
                    + "应该等于第17栏第2列本期销售额" + zzsxgmGridlb2VO.getHdynse() + " + 上期服务、不动产和无形资产第17栏第4列本年累计值"
                    + lsjdxxVO.getHdynse4() + "的和" + ArithUtil.roundStr(bnljHdynse4, 2) + "，请检查申报表数据是否正确。");
        }
        //第18栏：货物劳务以及服务、不动产和无形资产 本期应纳税额减征额
        double bnljBqynsejze3 = ArithUtil.round(zzsxgmGridlb1VO.getBqynsejze() + lsjdxxVO.getBqynsejze3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getBqynsejze() != bnljBqynsejze3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第18栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getBqynsejze(), 2) + "】应该等于第18栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getBqynsejze() + "】 + 上期应税货物劳务第18栏第3列本年累计值【" + lsjdxxVO.getBqynsejze3()
                    + "】的和【" + ArithUtil.roundStr(bnljBqynsejze3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第18栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getBqynsejze(), 2)
                    + "应该等于第18栏第1列本期销售额" + zzsxgmGridlb1VO.getBqynsejze() + " + 上期应税货物劳务第18栏第3列本年累计值"
                    + lsjdxxVO.getBqynsejze3() + "的和" + ArithUtil.roundStr(bnljBqynsejze3, 2) + "，请检查申报表数据是否正确。");
        }
        double bnljBqynsejze4 = ArithUtil.round(zzsxgmGridlb2VO.getBqynsejze() + lsjdxxVO.getBqynsejze4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getBqynsejze() != bnljBqynsejze4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第18栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getBqynsejze(), 2) + "】应该等于第18栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getBqynsejze() + "】 + 上期应税货物劳务第18栏第4列本年累计值【" + lsjdxxVO.getBqynsejze4()
                    + "】的和【" + ArithUtil.roundStr(bnljBqynsejze4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第18栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getBqynsejze(), 2)
                    + "应该等于第18栏第2列本期销售额" + zzsxgmGridlb2VO.getBqynsejze() + " + 上期服务、不动产和无形资产第18栏第4列本年累计值"
                    + lsjdxxVO.getBqynsejze4() + "的和" + ArithUtil.roundStr(bnljBqynsejze4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第19栏：货物劳务以及服务、不动产和无形资产 本期免税额
        double bnljBqmse3 = ArithUtil.round(zzsxgmGridlb1VO.getBqmse() + lsjdxxVO.getBqmse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getBqmse() != bnljBqmse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第19栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getBqmse(), 2) + "】应该等于第19栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getBqmse() + "】 + 上期应税货物劳务第19栏第3列本年累计值【" + lsjdxxVO.getBqmse3()
                    + "】的和【" + ArithUtil.roundStr(bnljBqmse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第19栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getBqmse(), 2)
                    + "应该等于第19栏第1列本期销售额" + zzsxgmGridlb1VO.getBqmse() + " + 上期应税货物劳务第19栏第3列本年累计值"
                    + lsjdxxVO.getBqmse3() + "的和" + ArithUtil.roundStr(bnljBqmse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljBqmse4 = ArithUtil.round(zzsxgmGridlb2VO.getBqmse() + lsjdxxVO.getBqmse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getBqmse() != bnljBqmse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第19栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getBqmse(), 2) + "】应该等于第19栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getBqmse() + "】 + 上期应税货物劳务第19栏第4列本年累计值【" + lsjdxxVO.getBqmse4()
                    + "】的和【" + ArithUtil.roundStr(bnljBqmse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第19栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getBqmse(), 2)
                    + "应该等于第19栏第2列本期销售额" + zzsxgmGridlb2VO.getBqmse() + " + 上期服务、不动产和无形资产第19栏第4列本年累计值"
                    + lsjdxxVO.getBqmse4() + "的和" + ArithUtil.roundStr(bnljBqmse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第20栏：货物劳务以及服务、不动产和无形资产 其中：小微企业免税额
        double bnljXwqymse3 = ArithUtil.round(zzsxgmGridlb1VO.getXwqymse() + lsjdxxVO.getXwqymse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getXwqymse() != bnljXwqymse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第20栏第3列本年累计值【" + zzsxgmGridlb3VO.getXwqymse()
                    + "】应该等于第20栏第1列本期销售额【" + zzsxgmGridlb1VO.getXwqymse() + "】 + 上期应税货物劳务第20栏第3列本年累计值" +
                    "【" + lsjdxxVO.getXwqymse3() + "】的和【" + ArithUtil.roundStr(bnljXwqymse3, 2) + "】，" +
                    "请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第20栏第3列本年累计值" + zzsxgmGridlb3VO.getXwqymse()
                    + "应该等于第20栏第1列本期销售额" + zzsxgmGridlb1VO.getXwqymse() + " + 上期应税货物劳务第20栏第3列本年累计值"
                    + lsjdxxVO.getXwqymse3() + "的和" + ArithUtil.roundStr(bnljXwqymse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljXwqymse4 = ArithUtil.round(zzsxgmGridlb2VO.getXwqymse() + lsjdxxVO.getXwqymse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getXwqymse() != bnljXwqymse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第20栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getXwqymse(), 2) + "】应该等于第20栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getXwqymse() + "】 + 上期应税货物劳务第20栏第4列本年累计值【" + lsjdxxVO.getXwqymse4()
                    + "】的和【" + ArithUtil.roundStr(bnljXwqymse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第20栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getXwqymse(), 2)
                    + "应该等于第20栏第2列本期销售额" + zzsxgmGridlb2VO.getXwqymse() + " + 上期服务、不动产和无形资产第20栏第4列本年累计值"
                    + lsjdxxVO.getXwqymse4() + "的和" + ArithUtil.roundStr(bnljXwqymse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第21栏：货物劳务以及服务、不动产和无形资产 未达起征点免税额
        double bnljWdqzdmse3 = ArithUtil.round(zzsxgmGridlb1VO.getWdqzdmse() + lsjdxxVO.getWdqzdmse3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getWdqzdmse() != bnljWdqzdmse3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第21栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getWdqzdmse(), 2) + "】应该等于第21栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getWdqzdmse() + "】 + 上期应税货物劳务第21栏第3列本年累计值【" + lsjdxxVO.getWdqzdmse3()
                    + "】的和【" + ArithUtil.roundStr(bnljWdqzdmse3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第21栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getWdqzdmse(), 2)
                    + "应该等于第21栏第1列本期销售额" + zzsxgmGridlb1VO.getWdqzdmse() + " + 上期应税货物劳务第21栏第3列本年累计值"
                    + lsjdxxVO.getWdqzdmse3() + "的和" + ArithUtil.roundStr(bnljWdqzdmse3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljWdqzdmse4 = ArithUtil.round(zzsxgmGridlb2VO.getWdqzdmse() + lsjdxxVO.getWdqzdmse4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getWdqzdmse() != bnljWdqzdmse4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第21栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getWdqzdmse(), 2) + "】应该等于第21栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getWdqzdmse() + "】 + 上期应税货物劳务第21栏第4列本年累计值【" + lsjdxxVO.getWdqzdmse4()
                    + "】的和【" + ArithUtil.roundStr(bnljWdqzdmse4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第21栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getWdqzdmse(), 2)
                    + "应该等于第21栏第2列本期销售额" + zzsxgmGridlb2VO.getWdqzdmse() + " + 上期服务、不动产和无形资产第21栏第4列本年累计值"
                    + lsjdxxVO.getWdqzdmse4() + "的和" + ArithUtil.roundStr(bnljWdqzdmse4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        //第22栏：货物劳务以及服务、不动产和无形资产 应纳税额合计
        double bnljYnsehj3 = ArithUtil.round(zzsxgmGridlb1VO.getYnsehj() + lsjdxxVO.getYnsehj3().doubleValue(), 2);
        if (zzsxgmGridlb3VO.getYnsehj() != bnljYnsehj3) {
            LOG.error("====登记序号====【" + djxh + "】====应税货物劳务====第22栏第3列本年累计值【"
                    + ArithUtil.roundStr(zzsxgmGridlb3VO.getYnsehj(), 2) + "】应该等于第22栏第1列本期销售额【"
                    + zzsxgmGridlb1VO.getYnsehj() + "】 + 上期应税货物劳务第22栏第3列本年累计值" + lsjdxxVO.getYnsehj3()
                    + "】的和【" + ArithUtil.roundStr(bnljYnsehj3, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("应税货物劳务第22栏第3列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb3VO.getYnsehj(), 2)
                    + "应该等于第22栏第1列本期销售额" + zzsxgmGridlb1VO.getYnsehj() + " + 上期应税货物劳务第22栏第3列本年累计值"
                    + lsjdxxVO.getYnsehj3() + "的和" + ArithUtil.roundStr(bnljYnsehj3, 2)
                    + "，请检查申报表数据是否正确。");
        }
        double bnljYnsehj4 = ArithUtil.round(zzsxgmGridlb2VO.getYnsehj() + lsjdxxVO.getYnsehj4().doubleValue(), 2);
        if (zzsxgmGridlb4VO.getYnsehj() != bnljYnsehj4) {
            LOG.error("====登记序号====【" + djxh + "】====服务、不动产和无形资产====第22栏第4列本年累计值" +
                    "【" + ArithUtil.roundStr(zzsxgmGridlb4VO.getYnsehj(), 2) + "】应该等于第22栏第2列本期销售额" +
                    "【" + zzsxgmGridlb2VO.getYnsehj() + "】 + 上期应税货物劳务第22栏第4列本年累计值【" + lsjdxxVO.getYnsehj4()
                    + "】的和【" + ArithUtil.roundStr(bnljYnsehj4, 2) + "】，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第22栏第4列本年累计值" + ArithUtil.roundStr(zzsxgmGridlb4VO.getYnsehj(), 2)
                    + "应该等于第22栏第2列本期销售额" + zzsxgmGridlb2VO.getYnsehj() + " + 上期服务、不动产和无形资产第22栏第4列本年累计值"
                    + lsjdxxVO.getYnsehj4() + "的和" + ArithUtil.roundStr(bnljYnsehj4, 2)
                    + "，请检查申报表数据是否正确。");
        }
        return ResultVo.valueOfSuccess();
    }
    /********************************************************计算公式校验结束*********************************************/


    /***************************************************服务、不动产和无形资产计算校验开始***********************************/
    /*** 服务计算校验
     * @param flzlFormVO
     * @param djxh
     * @return
     */
    private ResultVo fwJsJy(FlzlFormVO flzlFormVO, String djxh) {
        /**
         * 服务、不动产和无形资产计算校验
         * 本期应纳税额：
         * 场景一：逾期未认定（YQWRDBZ=1）：=第1*征收率YSFWYNZSL+4行*5%（5%征收率核定下发，节点：YSBDCZSL）；
         * update by linzs:场景二和场景三合并为：未逾期未认定（YQWRDBZ=0）+达到起征点
         * ：=主表第1行*征收率（YSFWYNZSL）+主表第4行*5%（5%征收率核定下发，节点YSBDCZSL）；
         场景二：未逾期未认定（YQWRDBZ=0）+达到起征点+核定应纳税额大于等于第1*征收率YSFWYNZSL
         +4行*5%（5%征收率核定下发，YSBDCZSL）：=核定应纳税额；
         场景三：未逾期未认定（YQWRDBZ=0）+达到起征点+核定应纳税额小于主表第1行*征收率（YSFWYNZSL）
         +主表第4行*5%：=主表第1行*征收率（YSFWYNZSL）+主表第4行*5%（5%征收率核定下发，节点YSBDCZSL）；
         update end;
         场景四：未逾期未认定（YQWRDBZ=0）+未达起征点：=主表第2行*征收率（YSFWYNZSL）+主表第5行*5%（5%征收率核定下发，节点YSBDCZSL）。
         * 起征点判断：
         * A：(附列资料第5栏/1.03+第13栏/1.05)+主表服务列第12栏其他免税销售额+主表服务列第13栏出口免税销售额
         * （注：1.03=1+YSFWYNZSL；1.05=1+YSBDCZSL）
         B：主表服务列（第1栏+第4栏+第9栏+第13栏）
         C：服务、不动产和无形资产核定销售额（取接口返回的dqdeYsfwHdxse）
         取上述A/B/C三个值的最大值跟服务起征点（取接口返回的zzsysfwqzd）进行比较，大于起征点，则达到起征点；小于等于起征点，则为未达起征点。
         */
        //服务、不动产和无形资产起征点判断与强制校验
        ResultVo resultVo = getFwQzd(djxh, flzlFormVO);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        Map<String, Object> map = (Map<String, Object>) resultVo.getValue();
        boolean qzdPd = (Boolean) map.get(SbjyCodeEnum.QZD_PD_CODE.getCode());
        //起征点强制校验：服务、不动产和无形资产
        resultVo = getFwQzdqzjy(djxh, qzdPd);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }

        // 服务、不动产和无形资产本期应纳税额
        double fwbqynse = zzsxgmGridlb2VO.getBqynse();
        double gsz1 = ArithUtil
                .round(ArithUtil.mul(zzsxgmGridlb2VO.getYzzzsbhsxse(), wsjdxxVO.getYsfwynzsl())
                        + ArithUtil.mul(zzsxgmGridlb2VO.getXsczbdcbhsxse(), wsjdxxVO.getYsbdczsl()), 2);
        double gsz2 = ArithUtil.round(ArithUtil.mul(zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse(), wsjdxxVO.getYsfwynzsl())
                + ArithUtil.mul(zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse1(), wsjdxxVO.getYsbdczsl()), 2);
        if (wsjdxxVO.getYqwrdbz() == "1") {
            if (fwbqynse != gsz1) {
                LOG.info("====登记序号===【" + djxh + "】====服务、不动产和无形资产 本期应纳税额  校验1------");
                LOG.error("====登记序号===【" + djxh + "】====纳税人 服务本期应纳税额fwbqynse：" + fwbqynse + "不等于gsz1：" + gsz1);
                return ResultVo.valueOfError("服务、不动产和无形资产本期应纳税额应为" + gsz1 + "，请检查申报表数据是否正确。");
            }
        } else if (qzdPd) {// 达到起征点
            /*
             * if (ysfwhdynse >= gsz1) {
             * if (fwbqynse != ysfwhdynse) {
             * LOG.info("------服务、不动产和无形资产 本期应纳税额  校验2------");
             * LOG.error("djxh【" + djxh + "】纳税人 服务本期应纳税额fwbqynse：" + fwbqynse + "不等于ysfwhdynse：" + ysfwhdynse);
             * return ResultVo.valueOfError("服务、不动产和无形资产本期应纳税额应为" + ysfwhdynse + "，请检查申报表数据是否正确。");
             * }
             * } else {
             */
            if (fwbqynse != gsz1) {
                LOG.info("====登记序号===【" + djxh + "】====服务、不动产和无形资产 本期应纳税额  校验3------");
                LOG.error("====登记序号===【" + djxh + "】====纳税人 服务本期应纳税额fwbqynse：" + fwbqynse + "不等于gsz1：" + gsz1);
                return ResultVo.valueOfError("服务、不动产和无形资产本期应纳税额应为" + gsz1 + "，请检查申报表数据是否正确。");
            }
            /* } */
        } else {// 未达起征点
            if (fwbqynse != gsz2) {
                LOG.info("====登记序号===【" + djxh + "】====服务、不动产和无形资产 本期应纳税额  校验4------");
                LOG.error("====登记序号===【" + djxh + "】====纳税人 服务本期应纳税额fwbqynse：" + fwbqynse + "不等于gsz2：" + gsz2);
                return ResultVo.valueOfError("服务、不动产和无形资产本期应纳税额应为" + gsz2 + "，请检查申报表数据是否正确。");
            }
        }
        //服务、不动产和无形资产本期销售不动产销售额：应税货物劳务第25栏本期销售不动产销售额应该等于0
        if (zzsxgmGridlb2VO.getBdcxse() != 0) {
            LOG.error("====登记序号===【" + djxh + "====服务、不动产和无形资产第25栏本期销售不动产销售额应该等于0，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第25栏“本期销售不动产销售额”应该等于0，请检查申报表数据是否正确。");
        }
        return ResultVo.valueOfSuccess();
    }

    /***
     *
     * 服务、不动产和无形资产起征点判断：
     *   A：(附列资料第5栏/1.03+第13栏/1.05)+主表服务列第12栏其他免税销售额+主表服务列第13栏出口免税销售额 （注：1.03=1+YSFWYNZSL；1.05=1+YSBDCZSL）
     *   B：主表服务列（第1栏+第4栏+第9栏+第13栏）
     *   C：服务、不动产和无形资产核定销售额（取接口返回的dqdeYsfwHdxse）
     * 取上述A/B/C三个值的最大值跟服务起征点（取接口返回的zzsysfwqzd）进行比较，大于起征点，则达到起征点；小于等于起征点，则为未达起征点。
     *
     * @param djxh
     * @param flzlFormVO
     * @return
     */
    private ResultVo getFwQzd(String djxh, FlzlFormVO flzlFormVO) {
        // 起征点判断：true代表大于起征点，false代表小于等于起征点
        boolean qzdPd = false;
        //(附列资料第5栏/1.03+第13栏/1.05)+主表服务列第12栏其他免税销售额+主表服务列第13栏出口免税销售额 （注：1.03=1+YSFWYNZSL；1.05=1+YSBDCZSL）
        double q1 = ArithUtil
                .round(flzlFormVO.getYsfwxsqbhssr() / (1 + wsjdxxVO.getYsfwynzsl())
                        + flzlFormVO.getYsfwxsqbhssr5() / (1 + wsjdxxVO.getYsbdczsl())
                        + zzsxgmGridlb2VO.getQtmsxse() + zzsxgmGridlb2VO.getCkmsxse(), 2);
        //主表服务列（第1栏+第4栏+第9栏+第13栏）
        double q2 = ArithUtil.round(zzsxgmGridlb2VO.getYzzzsbhsxse() + zzsxgmGridlb2VO.getXsczbdcbhsxse()
                + zzsxgmGridlb2VO.getMsxse() + zzsxgmGridlb2VO.getCkmsxse(), 2);
        //服务、不动产和无形资产核定销售额（取接口返回的dqdeYsfwHdxse）
        double q3 = wsjdxxVO.getYsfwhdxse() > q1 ? wsjdxxVO.getYsfwhdxse() : q1;
        double fwMax = q2 > q3 ? q2 : q3;
        //三个值的最大值跟服务起征点（取接口返回的zzsysfwqzd）进行比较
        //大于起征点，则达到起征点；小于等于起征点，则为未达起征点
        if (fwMax > wsjdxxVO.getFwqzd()) {
            LOG.info("====登记序号===【" + djxh + "】====纳税人 服务最大值fwMax：" + fwMax
                    + "和服务起征点：" + wsjdxxVO.getFwqzd() + "比较，结果为服务达到起征点");
            qzdPd = true;
        } else {
            LOG.info("====登记序号===【" + djxh + "】====纳税人 服务最大值fwMax：" + fwMax
                    + "和服务起征点：" + wsjdxxVO.getFwqzd() + "比较，结果为服务未达起征点");
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(SbjyCodeEnum.QZD_PD_CODE.getCode(), qzdPd);
        return ResultVo.valueOfSuccess(map);
    }

    /***
     * 服务、不动产和无形资产起征点判断强制校验
     *
     * 1.当服务、不动产和无形资产销售额大于起征点时，10、11、20、21栏服务本期数必须为0
     *
     * 2.填表数据服务、不动产和无形资产销售额判断为未达起征点的时候：
     *      1、第1栏不等于第2栏或者第4栏不等于第5栏时提示：：您销售服务、无形资产销售额和出租不动产收入本期数不超过起征点，
     *      属于起征点以下申报，如您存在税务机关代开的增值税专用发票不含税销售额，请根据销售额类型填在第1、2栏和第4、5栏且第1栏=第2栏、第4栏=第5栏；
     *      请将其余符合未超过免征值条件的销售额填入第10或者第11；如您还有符合其他免税政策的销售额，请填入第12栏”
     *      2、第3栏不等于0时提示：您应税服务属于起征点以下申报，应税服务、不动产和无形资产第3栏必须为0，请检查！
     *      3、第6栏不等于0时提示：您应税服务属于起征点以下申报，应税服务、不动产和无形资产第6栏必须为0，请检查！
     * @param djxh
     * @param qzdPd
     * @return
     */
    private ResultVo getFwQzdqzjy(String djxh, boolean qzdPd) {

        //当服务、不动产和无形资产销售额大于起征点时，10、11、20、21栏服务本期数必须为0
        if (qzdPd) {
            if (zzsxgmGridlb2VO.getXwqymsxse() != 0 || zzsxgmGridlb2VO.getWdqzdxse() != 0
                    || zzsxgmGridlb2VO.getXwqymse() != 0 || zzsxgmGridlb2VO.getWdqzdmse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" +
                        "====纳税人 达起征点====服务、不动产和无形资产=====xwqymsxse1：【" + zzsxgmGridlb2VO.getXwqymsxse()
                        + "】wdqzdxse1：【" + zzsxgmGridlb2VO.getWdqzdxse() + "】 xwqymse1：【"
                        + zzsxgmGridlb2VO.getXwqymse() + "】wdqzdmse1：【" + zzsxgmGridlb2VO.getWdqzdmse() + "】都必须为0");
                return ResultVo
                        .valueOfError("服务、不动产和无形资产销售额达到起征点：10、11、20、21栏本期数都必须为0！");
            }
            //未达起征点
        } else {
            //第1栏不等于第2栏或者第4栏不等于第5栏时提示：：您销售服务、无形资产销售额和出租不动产收入本期数不超过起征点，
            // 属于起征点以下申报，如您存在税务机关代开的增值税专用发票不含税销售额，请根据销售额类型填在第1、2栏和第4、5栏且第1栏=第2栏、
            // 第4栏=第5栏；请将其余符合未超过免征值条件的销售额填入第10或者第11；如您还有符合其他免税政策的销售额，请填入第12栏”
            if (zzsxgmGridlb2VO.getYzzzsbhsxse() != zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse()) {
                LOG.error("====登记序号===【" + djxh + "】" + "====纳税人 未达起征点====服务、不动产和无形资产=====" +
                        "第1栏(应征增值税不含税销售额（3%征收率）):【" + zzsxgmGridlb2VO.getYzzzsbhsxse() + "】" +
                        "应该等于第2栏(税务机关代开的增值税专用票不含税销售额)：【" + zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse() + "】");
                return ResultVo
                        .valueOfError("第1栏不等于第2栏或者第4栏不等于第5栏时提示：：您销售服务、无形资产销售额和出租不动产收入本期数不超过起征点，" +
                                "属于起征点以下申报，如您存在税务机关代开的增值税专用发票不含税销售额，请根据销售额类型填在第1、2栏和第4、5栏" +
                                "且第1栏=第2栏、第4栏=第5栏；请将其余符合未超过免征值条件的销售额填入第10或者第11；如您还有符合其他免税政策的销售额，" +
                                "请填入第12栏”！");
            }
            //【保存校验，强制】当未达起征点的时候，4=5栏，
            if (zzsxgmGridlb2VO.getXsczbdcbhsxse() != zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse1()) {
                LOG.error("====登记序号===【" + djxh + "】" +
                        "====纳税人 未达起征点====服务、不动产和无形资产=====第4栏(应征增值税不含税销售额（5%征收率））):【"
                        + zzsxgmGridlb2VO.getXsczbdcbhsxse() + "】应该等于第5栏(税务机关代开的增值税专用发票不含税销售额)：【"
                        + zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse1() + "】");
                return ResultVo
                        .valueOfError("您应税服务、不动产和无形资产销售额不超过起征点，第4必须要等于第5栏，请检查！");
            }
            //第3栏不等于0时提示：您应税服务属于起征点以下申报，应税服务、不动产和无形资产第3栏必须为0，请检查！
            if (zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" +
                        "====应税服务、不动产和无形资产属于起征点以下申报，应税服务、不动产和无形资产第3栏" +
                        "(税控器具开具的普通发票不含 税销售额)：【" + zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse() + "】应该等于0.0");
                return ResultVo
                        .valueOfError("您应税服务、不动产和无形资产属于起征点以下申报，应税货物及劳务第3栏必须为0，请检查！");
            }
            //第6栏不等于0时提示：您应税服务属于起征点以下申报，应税服务、不动产和无形资产第6栏必须为0，请检查！
            if (zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse2() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" + "====您应税服务、不动产和无形资产属于起征点以下申报，应税服务、不动产和无形资产第6栏" +
                        "（税控器具开具的普通发票不含税销售额）：【" + zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse2() + "】应该等于0.0");
                return ResultVo
                        .valueOfError("您应税服务属于起征点以下申报，应税服务、不动产和无形资产第6栏必须为0，请检查！");
            }
            //第10栏:其中：小微企业免税销售额非个体户才能填写
            if (SbjyCodeEnum.GTH_CODE.equals(wsjdxxVO.getGthbz()) && zzsxgmGridlb2VO.getXwqymsxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" + "====您不是非个体户，====服务、不动产和无形资产=====第10栏其中：小微企业免税销售额：" +
                        "【" + zzsxgmGridlb2VO.getXwqymsxse() + "】应该等于0.0，请检查！");
                return ResultVo
                        .valueOfError("您不是非个体户，应税服务、不动产和无形资产第10栏:其中：小微企业免税销售额应该为0，请检查！");
            }
            //第11栏其中：未达起征点销售额个体户才能填写
            if (SbjyCodeEnum.F_GTH_CODE.equals(wsjdxxVO.getGthbz()) && zzsxgmGridlb2VO.getWdqzdxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" + "====您不是个体户，====服务、不动产和无形资产=====第11栏未达起征点销售额：" +
                        "【" + zzsxgmGridlb2VO.getWdqzdxse() + "】应该等于0.0，请检查！");
                return ResultVo
                        .valueOfError("您不是个体户，应税服务、不动产和无形资产第11栏:未达起征点销售额应该为0，请检查！");
            }
        }
        return ResultVo.valueOfSuccess();
    }
    /********************************************************** 计算校验结束********************************************************/


    /**********************************************************货物劳务计算校验开始**************************************************/
    /***
     * 货物劳务计算校验
     * @param djxh
     * @return
     */
    private ResultVo hwlwJsJy(String djxh) {
        /**
         * 货物劳务计算校验
         * 核定应纳税额：
         * 通用：核定节点YSHWHDYNSE取值
         * 本期应纳税额：
         * 场景一：逾期未认定（YQWRDBZ=1）：=第1行*征收率YSHWYNZSL+第7行*0.03；
         * update by lizns：场景二和场景三合并为：未逾期未认定（YQWRDBZ=0）+达到起征点：=第1行*征收率+第7行*0.03；
         场景二：未逾期未认定（YQWRDBZ=0）+达到起征点+核定应纳税额大于等于第1行*征收率+第7行*0.02：=核定应纳税额；
         场景三：未逾期未认定（YQWRDBZ=0）+达到起征点+核定应纳税额小于第1行*征收率+第7行*0.02：=第1行*征收率+第7行*0.03；
         update end；
         场景四：未逾期未认定（YQWRDBZ=0）+未达起征点：第2行*征收率（YSHWYNZSL）。
         * 起征点判断
         * “本期数”的“货物及劳务”的第1栏＋第7栏＋第9栏＋第13栏之和与核定销售额（取接口返回的dqdeYshwlwHdxse）取取大值
         * 和货物劳务起征点（取接口返回的zzsqzd）进行比较，大于则达到起征点，小于等于则为未达起征点（即起征点以内）
         */
        /***
         * 货物劳务起征点判断与强制校验
         */
        ResultVo resultVo = getHwlwQzd(djxh);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        Map<String, Object> map = (Map<String, Object>) resultVo.getValue();
        boolean qzdPd = (Boolean) map.get(SbjyCodeEnum.QZD_PD_CODE.getCode());
        //起征点强制校验：货物劳务
        resultVo = getHwlwQzdqzjy(djxh, qzdPd);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }

        // 货物劳务本期应纳税额
        double hwbqynse = zzsxgmGridlb1VO.getBqynse();
        double gsz1 = ArithUtil.round(
                ArithUtil.mul(zzsxgmGridlb1VO.getYzzzsbhsxse(), wsjdxxVO.getYshwynzsl())
                        + ArithUtil.mul(zzsxgmGridlb1VO.getXssygdysgdzcbhsxse(), 0.03), 2);// 公式值1
//        double gsz2 = ArithUtil.round(
//                ArithUtil.mul(zzsxgmGridlb1VO.getYzzzsbhsxse(), yshwynzsl)
//                + ArithUtil.mul(zzsxgmGridlb1VO.getXssygdysgdzcbhsxse(), 0.02), 2);// 公式值2
        double gsz3 = ArithUtil.round(ArithUtil.mul(zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse(), wsjdxxVO.getYshwynzsl()), 2);
        if (wsjdxxVO.getYqwrdbz() == "1") {
            LOG.info("====登记序号===【" + djxh + "】====货物劳务本期应纳税额  校验1------");
            if (hwbqynse != gsz1) {
                LOG.error("====登记序号===【" + djxh + "】====纳税人 货物本期应纳税额hwbqynse：" + hwbqynse + "不等于gsz1：" + gsz1);
                return ResultVo.valueOfError("货物及劳务本期应纳税额应为" + gsz1 + "，请检查申报表数据是否正确。");
            }
        } else if (qzdPd) {
            /*
             * if (yshwhdynse >= gsz2) {
             * LOG.info("------货物劳务本期应纳税额  校验2------");
             * if (hwbqynse != yshwhdynse) {
             * LOG.error("djxh【" + djxh + "】纳税人 货物本期应纳税额hwbqynse：" + hwbqynse + "不等于yshwhdynse：" + yshwhdynse);
             * return ResultVo.valueOfError("货物及劳务本期应纳税额应为" + yshwhdynse + "，请检查申报表数据是否正确。");
             * }
             * } else {
             */
            LOG.info("====登记序号===【" + djxh + "】====货物劳务本期应纳税额  校验3------");
            if (hwbqynse != gsz1) {
                LOG.error("====登记序号===【" + djxh + "】====纳税人 货物本期应纳税额hwbqynse：" + hwbqynse + "不等于gsz1：" + gsz1);
                return ResultVo.valueOfError("货物及劳务本期应纳税额应为" + gsz1 + "，请检查申报表数据是否正确。");
            }
            /* } */
        } else {
            LOG.info("====登记序号===【" + djxh + "】====货物劳务本期应纳税额  校验4------");
            if (hwbqynse != gsz3) {
                LOG.error("====登记序号===【" + djxh + "】====纳税人 货物本期应纳税额hwbqynse：" + hwbqynse + "不等于gsz3：" + gsz3);
                return ResultVo.valueOfError("货物及劳务本期应纳税额应为" + gsz3 + "，请检查申报表数据是否正确。");
            }
        }
        return ResultVo.valueOfSuccess();
    }

    /***
     * 货物劳务起征点判断
     *
     * 货物劳务起征点判断：“本期数”的“货物及劳务”的第1栏＋第7栏＋第9栏＋第13栏之和与核定销售额（取接口返回的dqdeYshwlwHdxse）
     * 取取大值和货物劳务起征点（取接口返回的zzsqzd）进行比较，大于则达到起征点，小于等于则为未达起征点（即起征点以内）
     * @param djxh
     * @return
     */
    private ResultVo getHwlwQzd(String djxh) {
        // 起征点判断
        // true代表大于起征点，false代表小于等于起征点
        boolean qzdPd = false;
        //本期数:货物及劳务的第1栏＋第7栏＋第9栏＋第13栏之和
        double q1 = ArithUtil.round(zzsxgmGridlb1VO.getYzzzsbhsxse() + zzsxgmGridlb1VO.getXssygdysgdzcbhsxse()
                + zzsxgmGridlb1VO.getMsxse() + zzsxgmGridlb1VO.getCkmsxse(), 2);
        //本期数与核定销售额（取接口返回的dqdeYshwlwHdxse）取取大值
        double hwMax = wsjdxxVO.getYshwhdxse() > q1 ? wsjdxxVO.getYshwhdxse() : q1;
        //上面最大值和货物劳务起征点（取接口返回的zzsqzd）进行比较
        if (hwMax > wsjdxxVO.getHwqzd()) {
            LOG.info("====登记序号===【" + djxh + "】====纳税人 货物最大值hwMax：" + hwMax + "和货物起征点："
                    + wsjdxxVO.getHwqzd() + "比较，结果为货物及劳务达到起征点");
            qzdPd = true;
        } else {
            LOG.info("====登记序号===【" + djxh + "】====纳税人 货物最大值hwMax：" + hwMax + "和货物起征点："
                    + wsjdxxVO.getHwqzd() + "比较，结果为货物及劳务未达起征点");
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(SbjyCodeEnum.QZD_PD_CODE.getCode(), qzdPd);
        return ResultVo.valueOfSuccess(map);
    }

    /***
     * 货物劳务起征点判断强制校验
     *
     * 销售额达到起征点：当货物劳务销售额大于起征点时，10、11、20、21栏货物劳务本期数必须为0；
     *
     * 填表数据货物及劳务销售额判断为未达起征点的时候：
     *      1、第1栏不等于第2栏时提示：您销售货物，提供加工、修理修配劳务月销售额不超过起征点，属于起征点以下申报，
     *      如您存在税务机关代开的增值税专用发票不含税销售额，请根据销售额类型填在第1、2栏且第1栏=第2栏；
     *      请将其余符合未超过免征值条件的销售额填入第10或者第11；如您还有符合其他免税政策的销售额，请填入第12栏；
     *      2、第3不等于0时提示：您应税货物及劳务属于起征点以下申报，应税货物及劳务第3栏必须为0，请检查！
     *      3、第7不等于0时提示：您应税货物及劳务属于起征点以下申报，应税货物及劳务第7栏必须为0，请检查！
     * @param djxh
     * @param qzdPd
     * @return
     */
    private ResultVo getHwlwQzdqzjy(String djxh, boolean qzdPd) {

        //销售额达到起征点：当货物劳务销售额大于起征点时，10、11、20、21栏货物劳务本期数必须为0；
        if (qzdPd) {
            if (zzsxgmGridlb1VO.getXwqymsxse() != 0 || zzsxgmGridlb1VO.getWdqzdxse() != 0
                    || zzsxgmGridlb1VO.getXwqymse() != 0 || zzsxgmGridlb1VO.getWdqzdmse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" +
                        "====纳税人货物劳务销售额达到起征点====：【" + zzsxgmGridlb1VO.getXwqymsxse() + "】：【" + zzsxgmGridlb1VO.getWdqzdxse()
                        + "】 xwqymse1：【" + zzsxgmGridlb1VO.getXwqymse() + "】：【" + zzsxgmGridlb1VO.getWdqzdmse() + "】都必须为0");
                return ResultVo
                        .valueOfError("货物劳务销售额达到起征点：10、11、20、21栏本期数都必须为0！");
            }
            //未达起征点
        } else {
            //第1栏不等于第2栏时提示：您销售货物，提供加工、修理修配劳务月销售额不超过起征点，属于起征点以下申报，
            // 如您存在税务机关代开的增值税专用发票不含税销售额，请根据销售额类型填在第1、2栏且第1栏=第2栏；
            if (zzsxgmGridlb1VO.getYzzzsbhsxse() != zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse()) {
                LOG.error("====登记序号===【" + djxh + "】" + "====您应税货物劳务销售货物，提供加工、修理修配劳务月销售额不超过起征点，" +
                        "属于起征点以下申报，如您存在税务机关代开的增值税专用发票不含税销售额，" +
                        "请根据销售额类型第1栏(应征增值税不含税销售额（3%征收率）):【" + zzsxgmGridlb1VO.getYzzzsbhsxse()
                        + "】应该等于第2栏(税务机关代开的增值税专用票不含税销售额)：【" + zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse() + "】");
                return ResultVo
                        .valueOfError("您应税货物劳务销售货物，提供加工、修理修配劳务月销售额不超过起征点，属于起征点以下申报，如您存在税务机关" +
                                "代开的增值税专用发票不含税销售额，请根据销售额类型填在第1、2栏且第1栏=第2栏！");
            }
            //【保存校验，强制】当未达起征点的时候，4=5栏，
            if (zzsxgmGridlb1VO.getXsczbdcbhsxse() != zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse1()) {
                LOG.error("====登记序号===【" + djxh + "】====应税货物劳务销售额不超过起征点,第4栏(应征增值税不含税销售额（5%征收率））):【"
                        + zzsxgmGridlb1VO.getXsczbdcbhsxse() + "】应该等于第5栏(税务机关代开的增值税专用发票不含税销售额)：【"
                        + zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse1() + "】");
                return ResultVo
                        .valueOfError("您应税货物劳务销售额不超过起征点，第4必须要等于第5栏，请检查！");
            }
            //第3不等于0时提示：您应税货物及劳务属于起征点以下申报，应税货物及劳务第3栏必须为0，请检查！
            if (zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】====您应税货物及劳务属于起征点以下申报，应税货物及劳务第3栏" +
                        "(税控器具开具的普通发票不含 税销售额)：【" + zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse() + "】应该等于0.0");
                return ResultVo
                        .valueOfError("您应税货物及劳务属于起征点以下申报，应税货物及劳务第3栏必须为0，请检查！");
            }
            //第7不等于0时提示：您应税货物及劳务属于起征点以下申报，应税货物及劳务第7栏必须为0，请检查！
            if (zzsxgmGridlb1VO.getXssygdysgdzcbhsxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" + "====应税货物及劳务属于起征点以下申报，应税货物及劳务第7栏" +
                        "（销售使用过的固定资产不含税销售额）：【" + zzsxgmGridlb1VO.getXssygdysgdzcbhsxse() + "】应该等于0.0");
                return ResultVo
                        .valueOfError("您应税货物及劳务属于起征点以下申报，应税货物及劳务第7栏必须为0，请检查！");
            }
            //第10栏:其中：小微企业免税销售额非个体户才能填写
            if (SbjyCodeEnum.GTH_CODE.equals(wsjdxxVO.getGthbz()) && zzsxgmGridlb1VO.getXwqymsxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" + "====您不是非个体户，====货物及劳务=====第10栏其中：小微企业免税销售额：" +
                        "【" + zzsxgmGridlb1VO.getXwqymsxse() + "】应该等于0.0，请检查！");
                return ResultVo
                        .valueOfError("您不是非个体户，应税货物及劳务第10栏:其中：小微企业免税销售额应该为0，请检查！");
            }
            //第11栏其中：未达起征点销售额个体户才能填写
            if (SbjyCodeEnum.F_GTH_CODE.equals(wsjdxxVO.getGthbz()) && zzsxgmGridlb1VO.getWdqzdxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" + "====您不是个体户，====货物及劳务=====第11栏未达起征点销售额：" +
                        "【" + zzsxgmGridlb1VO.getWdqzdxse() + "】应该等于0.0，请检查！");
                return ResultVo
                        .valueOfError("您不是个体户，应税货物及劳务第11栏:未达起征点销售额应该为0，请检查！");
            }
        }
        return ResultVo.valueOfSuccess();
    }
    /**********************************************************货物劳务计算校验结束***************************************************************/


    /**********************************************************货物劳务和服务、不动产和无形资产计算校验开始******************************************/
    /***
     * 货物劳务和服务、不动产和无形资产计算合并校验
     * @param djxh
     * @return
     */
    private ResultVo hwfwhbJsJy(String djxh) {
        // 起征点判断
        Map<String, Object> qzdMap = hwfwQzdjs(djxh);
        boolean qzdPd = (Boolean) qzdMap.get(SbjyCodeEnum.QZD_PD_CODE.getCode());

        //起征点强制校验：（2019-1-1属期开始，货物劳务、服务不动产无形资产合并判断起征点）
        ResultVo resultVo = getHwfwQzdqzjy(djxh, qzdPd);
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        // 货物劳务和服务、不动产和无形资产本期应纳税额
        double hwbqynse = zzsxgmGridlb1VO.getBqynse();
        LOG.info("====登记序号===【" + djxh + "】====计算本期应纳税额 ：" + zzsxgmGridlb1VO.getYzzzsbhsxse() + "|||"
                + wsjdxxVO.getYsfwynzsl() + "|||" + zzsxgmGridlb1VO.getXsczbdcbhsxse() + "|||" + wsjdxxVO.getYsbdczsl());
        LOG.info("====登记序号===【" + djxh + "】====zzsxgmGridlb1VO.getYzzzsbhsxse() * ysfwynzsl = "
                + ArithUtil.mul(zzsxgmGridlb1VO.getYzzzsbhsxse(), wsjdxxVO.getYsfwynzsl()) + "|||"
                + ArithUtil.mul(zzsxgmGridlb1VO.getXsczbdcbhsxse(), wsjdxxVO.getYsbdczsl()));
        double hwgsz1 = ArithUtil.round(
                ArithUtil.mul(zzsxgmGridlb1VO.getYzzzsbhsxse(), wsjdxxVO.getYshwynzsl())
                        + ArithUtil.mul(zzsxgmGridlb1VO.getXssygdysgdzcbhsxse(), 0.03), 2);// 公式值1
        double hwgsz3 = ArithUtil.round(ArithUtil.mul(zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse(), wsjdxxVO.getYshwynzsl()), 2);
        LOG.info("====登记序号===【" + djxh + "】====hwgsz3 zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse() * yshwynzsl :"
                + ArithUtil.mul(zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse(), wsjdxxVO.getYshwynzsl())
                + "zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse() :" + zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse());
        // 服务、不动产和无形资产本期应纳税额
        double fwbqynse = zzsxgmGridlb2VO.getBqynse();
        LOG.info("====登记序号===【" + djxh + "】====计算本期应纳税额 ：" + zzsxgmGridlb2VO.getYzzzsbhsxse()
                + "|||" + wsjdxxVO.getYsfwynzsl() + "|||" + zzsxgmGridlb2VO.getXsczbdcbhsxse() + "|||" + wsjdxxVO.getYsbdczsl());
        LOG.info("====登记序号===【" + djxh + "】====zzsxgmGridlb2VO.getYzzzsbhsxse() * ysfwynzsl = "
                + ArithUtil.mul(zzsxgmGridlb2VO.getYzzzsbhsxse(), wsjdxxVO.getYsfwynzsl()) + "|||"
                + ArithUtil.mul(zzsxgmGridlb2VO.getXsczbdcbhsxse(), wsjdxxVO.getYsbdczsl()));
        double fwgsz1 = ArithUtil
                .round(ArithUtil.mul(zzsxgmGridlb2VO.getYzzzsbhsxse(), wsjdxxVO.getYsfwynzsl())
                        + ArithUtil.mul(zzsxgmGridlb2VO.getXsczbdcbhsxse(), wsjdxxVO.getYsbdczsl()), 2);
        if (wsjdxxVO.getYqwrdbz() == "1") {
            LOG.info("====登记序号===【" + djxh + "】====货物劳务和服务、不动产和无形资产本期应纳税额  校验1------");
            if (hwbqynse != hwgsz1 || fwbqynse != fwgsz1) {//
                LOG.error("====登记序号===【" + djxh + "】====纳税人 货物本期应纳税额hwbqynse：" + hwbqynse + "不等于hwgsz1：" + hwgsz1
                        + " 本期应纳税额fwbqynse：" + fwbqynse + "不等于fwgsz1：" + fwgsz1);
                return ResultVo
                        .valueOfError("货物及劳务和服务本期应纳税额应为" + hwgsz1 + "，服务、不动产和无形资产本期应纳税额应为"
                                + fwgsz1 + "，请检查申报表数据是否正确。");
            }
        } else if (qzdPd) {// 达到起征点
            LOG.info("====登记序号===【" + djxh + "】====货物劳务和服务、不动产和无形资产本期应纳税额  校验3------");
            if (hwbqynse != hwgsz1 || fwbqynse != fwgsz1) {
                LOG.error("====登记序号===【" + djxh + "】====纳税人 货物本期应纳税额hwfwynse：" + hwbqynse + "不等于hwfwgsz：" + hwgsz1
                        + " 服务本期应纳税额fwbqynse：" + fwbqynse + "不等于fwgsz1：" + fwgsz1);
                return ResultVo
                        .valueOfError("货物及劳务本期应纳税额应为" + hwgsz1 + "，服务、不动产和无形资产本期应纳税额应为"
                                + fwgsz1 + "，请检查申报表数据是否正确。");
            }
        } else {// 未达到起征点
            LOG.info("====登记序号===【" + djxh + "】====货物劳务和服务、不动产和无形资产本期应纳税额  校验4------");
            if (hwbqynse != hwgsz3 || fwbqynse != fwgsz1) {
                LOG.error("====登记序号===【" + djxh + "】====纳税人 货物本期应纳税额hwbqynse：" + hwbqynse + "不等于hwfwgsz3：" + hwgsz3
                        + " 服务本期应纳税额fwbqynse：" + fwbqynse + "不等于fwgsz2：" + fwgsz1);
                return ResultVo
                        .valueOfError("货物及劳务本期应纳税额应为" + hwgsz3 + "，服务、不动产和无形资产本期应纳税额应为"
                                + fwgsz1 + "，请检查申报表数据是否正确。");
            }
        }
        //服务、不动产和无形资产本期销售不动产销售额：应税货物劳务第25栏本期销售不动产销售额应该大于等于0
        if (zzsxgmGridlb2VO.getBdcxse() < 0) {
            LOG.error("====登记序号===【" + djxh + "====服务、不动产和无形资产第25栏本期销售不动产销售额应该大于等于0，请检查申报表数据是否正确。");
            return ResultVo.valueOfError("服务、不动产和无形资产第25栏“本期销售不动产销售额”应该大于等于0，请检查申报表数据是否正确。");
        }
        return ResultVo.valueOfSuccess();
    }

    /***
     * 货物劳务和服务计算校验
     *
     * <p>
     * 2019-1-26日变更：
     * 起征点判断：（2019-1-1属期开始，货物劳务、服务不动产无形资产合并判断起征点）
     *      A: “本期数”的【“货物及劳务”+“服务、不动产和无形资产”】的第1栏＋第4栏＋第7栏＋第9栏＋第13栏之和
     *      B: 核定销售额：货物劳务（YSHWHDXSE）+服务、不动产和无形资产（YSFWHDXSE）
     *      C：销售额：MAX(A,B)-本期销售不动产的销售额
     *      D：起征点：核定信息QZD与YSFWQZD比较取较大值，即取接口HXZG_SB_00044返回的zzsqzd、zzsysfwqzd的较大值
     * <p>
     * 取C和D进行比较:
     *      1) 如果C>D,则达到起征点。
     *      2) 如果C<=D,则为未达起征点（即起征点以内）
     * @param djxh
     * @return
     */
    private Map<String, Object> hwfwQzdjs(String djxh) {
        LOG.info("====登记序号===【" + djxh + "】====开始进入起征点判断方法qzdjs()=====");
        // 起征点判断
        boolean qzdPd = false;
        //  A: “本期数”的【“货物及劳务”+“服务、不动产和无形资产”】的第1栏＋第4栏＋第7栏＋第9栏＋第13栏之和
        Double bqs = 0.00;
        //货物及劳务
        bqs += zzsxgmGridlb1VO.getYzzzsbhsxse();// A 应征增值税不含税销售额（3%征收率）
        bqs += zzsxgmGridlb1VO.getXssygdysgdzcbhsxse();// D 销售使用过的固定资产不含税销售额
        bqs += zzsxgmGridlb1VO.getMsxse();// E 免税销售额
        bqs += zzsxgmGridlb1VO.getCkmsxse();// G 出口免税销售额
        //服务、不动产和无形资产
        bqs += zzsxgmGridlb2VO.getYzzzsbhsxse();// B 应征增值税不含税销售额（3%征收率）
        bqs += zzsxgmGridlb2VO.getXsczbdcbhsxse();// C 应征增值税不含税销售额（5%征收率）
        bqs += zzsxgmGridlb2VO.getMsxse();// F 免税销售额
        bqs += zzsxgmGridlb2VO.getCkmsxse();// Q 出口免税销售额

        //B: 核定销售额：货物劳务（YSHWHDXSE）+服务、不动产和无形资产（YSFWHDXSE）
        double hwfwhdxse = ArithUtil.round(wsjdxxVO.getYshwhdxse() + wsjdxxVO.getYsfwhdxse(), 2);
        LOG.info("====登记序号===【" + djxh + "】====本期销售不动产销售额 ："
                + zzsxgmGridlb1VO.getBdcxse() + "||" + zzsxgmGridlb2VO.getBdcxse());
        //C：销售额：MAX(A,B)-本期销售不动产的销售额
        double hwfwMax = ArithUtil.round((bqs > hwfwhdxse ? bqs : hwfwhdxse) - zzsxgmGridlb1VO.getBdcxse()
                - zzsxgmGridlb2VO.getBdcxse(), 2);
        LOG.info("====登记序号===【" + djxh + "】====hwqzd : " + wsjdxxVO.getHwqzd() + "fwqzd : " + wsjdxxVO.getFwqzd());
        //D：起征点：核定信息QZD与YSFWQZD比较取较大值，即取接口HXZG_SB_00044返回的zzsqzd、zzsysfwqzd的较大值
        double hwfwqzd = wsjdxxVO.getHwqzd() > wsjdxxVO.getFwqzd() ? wsjdxxVO.getHwqzd() : wsjdxxVO.getFwqzd();
        if (hwfwMax > hwfwqzd) {
            LOG.info("====登记序号===【" + djxh + "】====纳税人 货物和服务最大值hwfwMax：" + hwfwMax
                    + "和货物服务起征点：" + hwfwqzd + "比较，结果为货物及劳务和服务达到起征点");
            qzdPd = true;
        } else {
            LOG.info("====登记序号===【" + djxh + "】====纳税人 货物和服务最大值hwfwMax：" + hwfwMax
                    + "和货物服务起征点：" + hwfwqzd + "比较，结果为货物及劳务和服务未达起征点");
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(SbjyCodeEnum.QZD_CODE.getCode(), hwfwqzd);
        map.put(SbjyCodeEnum.QZD_PD_CODE.getCode(), qzdPd);
        return map;
    }

    /***
     * 一、销售额达到起征点：10、11、20、21栏本期数都必须为0；
     *
     * 二、填表数据销售额判断为未达起征点的时候：
     *      1、第1栏不等于第2栏时提示：您销售额不超过起征点，属于起征点以下申报，如您存在税务机关代开的增值税专用发票不含税销售额，
     *      请根据销售额类型填在第1、2栏和第4、5栏且第1栏=第2栏；请将其余符合未超过免征值条件的销售额填入第10或者第11；
     *      如您还有符合其他免税政策的销售额，请填入第12栏；
     *      2、第3不等于0时提示：您属于起征点以下申报，第3栏必须为0，请检查！
     *      3、销售额判断为未达起征点，且本期销售不动产销售额等于0，第6不等于0时提示：您属于起征点以下申报，第6栏必须为0，请检查！
     *      4、第7不等于0时提示：您属于起征点以下申报，第7栏必须为0，请检查！
     * @param djxh
     * @param qzdPd
     * @return
     */
    private ResultVo getHwfwQzdqzjy(String djxh, boolean qzdPd) {

        //销售额达到起征点：10、11、20、21栏本期数都必须为0；
        if (qzdPd) {
            if (zzsxgmGridlb1VO.getXwqymsxse() != 0 || zzsxgmGridlb1VO.getWdqzdxse() != 0
                    || zzsxgmGridlb1VO.getWdqzdxse() != 0 || zzsxgmGridlb1VO.getWdqzdmse() != 0
                    || zzsxgmGridlb2VO.getXwqymsxse() != 0 || zzsxgmGridlb2VO.getWdqzdxse() != 0
                    || zzsxgmGridlb2VO.getXwqymse() != 0 || zzsxgmGridlb2VO.getWdqzdmse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" +
                        "====纳税人 达起征点====货物及劳务=====xwqymsxse1：【" + zzsxgmGridlb1VO.getXwqymsxse()
                        + "】wdqzdxse1：【" + zzsxgmGridlb1VO.getWdqzdxse() + "】 xwqymse1：【" + zzsxgmGridlb1VO.getWdqzdxse()
                        + "】wdqzdmse1：【" + zzsxgmGridlb1VO.getWdqzdmse() + "】====服务、不动产和无形资产=====xwqymsxse2：【"
                        + zzsxgmGridlb2VO.getXwqymsxse() + "】wdqzdxse2：【" + zzsxgmGridlb2VO.getWdqzdxse() + "】 xwqymse2：【"
                        + zzsxgmGridlb2VO.getXwqymse() + "】wdqzdmse2：【" + zzsxgmGridlb2VO.getWdqzdmse() + "】都必须为0");
                return ResultVo
                        .valueOfError("销售额达到起征点：10、11、20、21栏本期数都必须为0！");
            }
            //未达起征点
        } else {
            //第1栏不等于第2栏时提示：您销售额不超过起征点，属于起征点以下申报，如您存在税务机关代开的增值税专用发票不含税销售额，
            //请根据销售额类型填在第1、2栏和第4、5栏且第1栏=第2栏；请将其余符合未超过免征值条件的销售额填入第10或者第11；
            // 如您还有符合其他免税政策的销售额，请填入第12栏；
            if (zzsxgmGridlb1VO.getYzzzsbhsxse() != zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse()
                    || zzsxgmGridlb2VO.getYzzzsbhsxse() != zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse()) {
                LOG.error("====登记序号===【" + djxh + "】" +
                        "====纳税人 未达起征点====货物及劳务=====第1栏(应征增值税不含税销售额（3%征收率）):【"
                        + zzsxgmGridlb1VO.getYzzzsbhsxse() + "】应该等于第2栏(税务机关代开的增值税专用票不含税销售额)：【"
                        + zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse() + "】====服务、不动产和无形资产=====" +
                        "第1栏(应征增值税不含税销售额（3%征收率）):【" + zzsxgmGridlb2VO.getYzzzsbhsxse()
                        + "】应该等于第2栏(税务机关代开的增值税专用票不含税销售额)：【" + zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse() + "】");
                return ResultVo
                        .valueOfError("您销售额不超过起征点，属于起征点以下申报，如您存在税务机关代开的增值税专用发票不含税销售额，" +
                                "请根据销售额类型填在第1、2栏和第4、5栏且第1栏=第2栏；请将其余符合未超过免征值条件的销售额填入第10或者第11；" +
                                "如您还有符合其他免税政策的销售额，请填入第12栏！");
            }
            //【保存校验，强制】当未达起征点的时候，4=5栏，
            if (zzsxgmGridlb1VO.getXsczbdcbhsxse() != zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse1()
                    || zzsxgmGridlb2VO.getXsczbdcbhsxse() != zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse1()) {
                LOG.error("====登记序号===【" + djxh + "】====纳税人 未达起征点====货物及劳务=====" +
                        "第4栏(应征增值税不含税销售额（5%征收率））):【" + zzsxgmGridlb1VO.getXsczbdcbhsxse()
                        + "】应该等于第5栏(税务机关代开的增值税专用发票不含税销售额)：【" + zzsxgmGridlb1VO.getSwjgdkdzzszyfpbhsxse1()
                        + "】" + "====服务、不动产和无形资产=====第4栏(应征增值税不含税销售额（5%征收率）):【"
                        + zzsxgmGridlb2VO.getXsczbdcbhsxse() + "】应该等于第5栏(税务机关代开的增值税专用发票不含税销售额)：【"
                        + zzsxgmGridlb2VO.getSwjgdkdzzszyfpbhsxse1() + "】");
                return ResultVo
                        .valueOfError("您销售额不超过起征点，第4必须要等于第5栏，请检查！");
            }
            //第3不等于0时提示：您属于起征点以下申报，第3栏必须为0，请检查！
            if (zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse() != 0 || zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" +
                        "====纳税人 未达起征点====货物及劳务=====第3栏(税控器具开具的普通发票不含 税销售额)：" +
                        "【" + zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse() + "】应该等于0.0====服务、不动产和无形资产=" +
                        "====第3栏(税控器具开具的普通发票不含 税销售额)：【" + zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse() + "】应该等于0.0");
                return ResultVo
                        .valueOfError("您属于起征点以下申报，第3栏必须为0，请检查！");
            }
            //销售额判断为未达起征点，且本期销售不动产销售额等于0，第6不等于0时提示：您属于起征点以下申报，第6栏必须为0，请检查！
            if (zzsxgmGridlb2VO.getBdcxse() == 0
                    && (zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse2() != 0 || zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse2() != 0)) {
                LOG.error("====登记序号===【" + djxh + "】" + "====货物及劳务=====本期销售不动产销售额等于0，" +
                        "第6栏（税控器具开具的普通发票不含税销售额）：【" + zzsxgmGridlb1VO.getSkqjkjdptfpbhsxse2() + "】应该等于0.0" +
                        "====服务、不动产和无形资产=====本期销售不动产销售额等于0，第6栏（税控器具开具的普通发票不含税销售额）" +
                        "：【" + zzsxgmGridlb2VO.getSkqjkjdptfpbhsxse2() + "】应该等于0.0");
                return ResultVo
                        .valueOfError("您属于起征点以下申报，第6栏必须为0，请检查！");
            }
            //第7不等于0时提示：您属于起征点以下申报，第7栏必须为0，请检查！
            if (zzsxgmGridlb1VO.getXssygdysgdzcbhsxse() != 0 || zzsxgmGridlb2VO.getXssygdysgdzcbhsxse() != 0) {
                LOG.error("====登记序号===【" + djxh + "】" + "====货物及劳务=====第7栏（销售使用过的固定资产不含税销售额）：" +
                        "【" + zzsxgmGridlb1VO.getXssygdysgdzcbhsxse() + "】应该等于0.0====服务、不动产和无形资产" +
                        "=====第7栏（销售使用过的固定资产不含税销售额）：【" + zzsxgmGridlb2VO.getXssygdysgdzcbhsxse() + "】应该等于0.0");
                return ResultVo
                        .valueOfError("您属于起征点以下申报，第7栏必须为0，请检查！");
            }
            //第10栏:其中：小微企业免税销售额非个体户才能填写
            if (SbjyCodeEnum.GTH_CODE.equals(wsjdxxVO.getGthbz())
                    && (zzsxgmGridlb1VO.getXwqymsxse() != 0 || zzsxgmGridlb2VO.getXwqymsxse() != 0)) {
                LOG.error("====登记序号===【" + djxh + "】" + "====您不是非个体户【" + wsjdxxVO.getGthbz()
                        + "】，====货物及劳务=====第10栏其中：小微企业免税销售额：【" + zzsxgmGridlb1VO.getXwqymsxse()
                        + "】====服务、不动产和无形资产====第10栏其中：小微企业免税销售额：" +
                        "【" + zzsxgmGridlb2VO.getXwqymsxse() + "】应该等于0.0，请检查！");
                return ResultVo
                        .valueOfError("您不是非个体户，第10栏:其中：小微企业免税销售额应该为0，请检查！");
            }
            //第11栏其中：未达起征点销售额个体户才能填写
            if (SbjyCodeEnum.F_FWDSHBZ_CODE.equals(wsjdxxVO.getGthbz())
                    && (zzsxgmGridlb1VO.getWdqzdxse() != 0 || zzsxgmGridlb2VO.getWdqzdxse() != 0)) {
                LOG.error("====登记序号===【" + djxh + "】" + "====您不是个体户【" + wsjdxxVO.getGthbz()
                        + "】，====货物及劳务=====第11栏未达起征点销售额：【" + zzsxgmGridlb1VO.getWdqzdxse()
                        + "】====服务、不动产和无形资产====第11栏未达起征点销售额：" +
                        "【" + zzsxgmGridlb2VO.getWdqzdxse() + "】应该等于0.0，请检查！");
                return ResultVo
                        .valueOfError("您不是个体户，第11栏:未达起征点销售额应该为0，请检查！");
            }
        }
        return ResultVo.valueOfSuccess();
    }
    /***************************************************货物劳务和服务、不动产和无形资产计算校验结束******************************************/


    /**********************************************************附列资料计算校验开始********************************************************/
    /***
     * 后端增加附列资料的校验
     * @param flzlFormVO
     * @return
     */
    public ResultVo getFlzlJcjy(String djxh, FlzlFormVO flzlFormVO, String szlbDm) {
        LOG.info("====登记序号===【" + djxh + "】====flzlFormVO:【" + JSONObject.toJSONString(flzlFormVO) + "】");
        //应税行为（3%征收率）扣除额计算
        //附表第一栏和第二栏的和(期初余额-本期发生额)
        double fllm1add2 = ArithUtil.round(flzlFormVO.getQcye() + flzlFormVO.getBqfse(), 2);
        //附表第四栏的值(期末余额=附表第一栏和第二栏的和减去本期扣除额)
        double fllm4 = ArithUtil.round(flzlFormVO.getQcye() + flzlFormVO.getBqfse() - flzlFormVO.getBqkce(), 2);

        //应税行为（3%征收率）计税销售额计算
        //附表第七栏的值
        double fllm7 = ArithUtil.round(flzlFormVO.getYsfwxsqbhssr() - flzlFormVO.getBqkce(), 2);
        //附表1第八栏乘以0.03的值
        double fllm8 = ArithUtil.div(flzlFormVO.getYsfwxshsxse(), 1.03);

        //应税行为（5%征收率）扣除额计算
        //附表第九栏和第十一栏的和(期初余额-本期发生额)
        double fllm9add10 = ArithUtil.round(flzlFormVO.getQcye5() + flzlFormVO.getBqfse5(), 2);
        //附表第12栏的值(期末余额=附表第一栏和第二栏的和减去本期扣除额)
        double fllm12 = ArithUtil.round(flzlFormVO.getQcye5() + flzlFormVO.getBqfse5() - flzlFormVO.getBqkce5(), 2);

        //应税行为（5%征收率）计税销售额计算
        //附表第七栏的值
        double fllm15 = ArithUtil.round(flzlFormVO.getYsfwxsqbhssr5() - flzlFormVO.getBqkce5(), 2);
        //附表1第八栏乘以0.03的值
        double fllm16 = ArithUtil.div(flzlFormVO.getYsfwxshsxse5(), 1.05);


        if (flzlFormVO == null) {
            LOG.error("====登记序号===【" + djxh + "】====纳税人 小规模增值税附列资料表数据 为空，存在异常");
            return ResultVo.valueOfError("申报数据出现异常，请重新发送申报数据");
        }
        if (flzlFormVO.getQcye() != wsjdxxVO.getXgmfb1qcye()) {
            return ResultVo.valueOfError("小规模附表1期初余额 应为" + wsjdxxVO.getXgmfb1qcye() + "，请检查申报表数据是否正确。");
        }
        if (flzlFormVO.getQcye5() != wsjdxxVO.getXgmfb1qcye5()) {
            return ResultVo.valueOfError("小规模附表1期初余额5% 应为" + wsjdxxVO.getXgmfb1qcye5() + "，请检查申报表数据是否正确。");
        }

        if ("01".equals(szlbDm)) { // 货物
            if (flzlFormVO.getYsfwxsqbhssr() != 0 || flzlFormVO.getBqkce() != 0
                    || flzlFormVO.getYsfwxsqbhssr5() != 0 || flzlFormVO.getBqkce5() != 0) {
                LOG.error("====登记序号===【" + djxh + "】====您的增值税征收类型为货劳企业，小规模附列资料表应税服务计税销售额计算" +
                        "部分应该为0(第5，6,13,14栏)，请检查!===第5栏：【"
                        + flzlFormVO.getYsfwxsqbhssr() + "】===第6栏：【" + flzlFormVO.getBqkce() + "】" +
                        "===第13栏：【" + flzlFormVO.getYsfwxsqbhssr5() + "】===第14栏：【" + flzlFormVO.getBqkce5() + "】");
                return ResultVo.valueOfError("您的增值税征收类型为货劳企业，小规模附列资料表应税服务计税销售额计算部分应该为0(第5，6,13,14栏)，请检查");
            }
        } else {
            //开始基本计算校验
            // 3%征收率
            if ((flzlFormVO.getBqkce() > fllm1add2) || (flzlFormVO.getBqkce() > flzlFormVO.getYsfwxsqbhssr())) {
                LOG.error("====登记序号===【" + djxh + "】====增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为" +
                        "（3%征收率）扣除额计算”的本期扣除额:【" + flzlFormVO.getBqkce() + "】要小于等于期初余额、" +
                        "本期发生额之和:【" + fllm1add2 + "】并且小于等于\"应税行为（3%征收率）计税销售额计算\"的全部含税收入" +
                        "（适用3%征收率）:【" + flzlFormVO.getYsfwxsqbhssr() + "】");
                return ResultVo.valueOfError("增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（3%征收率）" +
                        "扣除额计算”的本期扣除额要小于等于期初余额、本期发生额之和，并且小于等于\"应税行为（3%征收率）" +
                        "计税销售额计算\"的全部含税收入（适用3%征收率）");
            }
            if (flzlFormVO.getQmye() != fllm4) {
                LOG.error("====登记序号===【" + djxh + "】====附列资料第4栏期末余额:【" + flzlFormVO.getQmye() + "】" +
                        "应该等于附列资料第1栏期初余额和附列资料第2栏本期发生额的和再减去附列资料第3栏本期扣除额的值:【" + fllm4 + "】");
                return ResultVo.valueOfError("\"增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（3%征收率）扣除额计算”中" +
                        "的\"期末余额（3%征收率）\"应该等于\"期初余额（3%征收率）\"与\"本期发生额（3%征收率）\"的和再减去\"本期扣除额（3%征收率）\"！");
            }
            if (flzlFormVO.getYsfwxshsxse() != fllm7) {
                LOG.error("====登记序号===【" + djxh + "】====附列资料第7栏不含税销售额:【" + flzlFormVO.getYsfwxshsxse() + "】" +
                        "应该等于附列资料第5栏全部含税收入减去附列资料第6栏本期扣除额的差:【" + fllm7 + "】");
                return ResultVo.valueOfError("\"增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（3%征收率）扣除额计算”" +
                        "中的\"不含税销售额（3%征收率）\"应该等于\"全部含税收入（3%征收率）\"减去\"本期扣除额（3%征收率）\"的差!");
            }
            if (flzlFormVO.getYsfwxsbhsxse() != fllm8) {
                LOG.error("====登记序号===【" + djxh + "】====附列资料第8栏不含税销售额:【" + flzlFormVO.getYsfwxsbhsxse() + "】" +
                        "应该等于附列资料第7栏含税销售额除以1.05的税率的值：【" + fllm8 + "】");
                return ResultVo.valueOfError("\"增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（3%征收率）扣除额计算”" +
                        "中的\"不含税销售额（3%征收率）\"应该等于\"含税销售额（3%征收率）\"除以1.03的税率的值!");
            }

            // 5%征收率
            if ((flzlFormVO.getBqkce5() > fllm9add10) || (flzlFormVO.getBqkce5() > flzlFormVO.getYsfwxsqbhssr5())) {
                LOG.error("====登记序号===【" + djxh + "】====增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（5%征收率）" +
                        "扣除额计算”的本期扣除额:【" + flzlFormVO.getBqkce5() + "】要小于等于期初余额、本期发生额之和:【"
                        + fllm9add10 + "】并且小于等于\"应税行为（5%征收率）计税销售额计算\"的全部含税收入（适用5%征收率）:【"
                        + flzlFormVO.getYsfwxsqbhssr5() + "】");
                return ResultVo.valueOfError("\"增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（5%征收率）扣除额计算”" +
                        "的本期扣除额要小于等于期初余额、本期发生额之和，并且小于等于\"应税行为（5%征收率）计税销售额计算\"的全部含税收入（适用5%征收率）");
            }
            if (flzlFormVO.getQmye5() != fllm12) {
                LOG.error("====登记序号===【" + djxh + "】====附列资料第12栏期末余额:【" + flzlFormVO.getQmye5() + "】" +
                        "应该等于附列资料第9栏期初余额和附列资料第10栏本期发生额的和再减去附列资料第11栏本期扣除额的值:【" + fllm12 + "】");
                return ResultVo.valueOfError("\"增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（5%征收率）扣除额计算”" +
                        "中的\"期末余额（5%征收率）\"应该等于\"期初余额（5%征收率）\"与\"本期发生额（5%征收率）\"的和再减去\"本期扣除额（5%征收率）\"！");
            }
            if (flzlFormVO.getYsfwxshsxse5() != fllm15) {
                LOG.error("====登记序号===【" + djxh + "】====附列资料第15栏不含税销售额:【" + flzlFormVO.getYsfwxshsxse5() + "】" +
                        "应该等于附列资料第13栏全部含税收入减去附列资料第14栏本期扣除额的差:【" + fllm15 + "】");
                return ResultVo.valueOfError("\"增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（5%征收率）扣除额计算”" +
                        "中的\"不含税销售额（5%征收率）\"应该等于\"全部含税收入（5%征收率）\"减去\"本期扣除额（5%征收率）\"的差!");
            }
            if (flzlFormVO.getYsfwxsbhsxse5() != fllm16) {
                LOG.error("====登记序号===【" + djxh + "】====附列资料第16栏不含税销售额:【" + flzlFormVO.getYsfwxsbhsxse5() + "】" +
                        "应该等于附列资料第15栏含税销售额除以1.05的税率的值：【" + fllm16 + "】");
                return ResultVo.valueOfError("\"增值税纳税申报表（小规模纳税人适用）附列资料\"中“应税行为（5%征收率）扣除额计算”" +
                        "中的\"不含税销售额（5%征收率）\"应该等于\"含税销售额（5%征收率）\"除以1.05的税率的值!");
            }

            //表间关系校验
            //强制：附列资料第8栏不等于0时，监控主表第1栏“（一）应征增值税不含税销售额（3%征收率）”第2列“本期数”=附列资料第8栏。
            if (fllm8 != 0 && zzsxgmGridlb2VO.getYzzzsbhsxse() != fllm8) {
                LOG.error("====登记序号===【" + djxh + "】====附列资料第8栏不等于0时，主表第1栏“（一）应征增值税不含税销售额" +
                        "（3%征收率）”第2列“本期数” :【" + zzsxgmGridlb2VO.getYzzzsbhsxse() + "】应该等于附列资料第8栏：【" + fllm8 + "】");
                return ResultVo.valueOfError("附列资料第8栏不等于0时，主表第1栏“（一）应征增值税不含税销售额（3%征收率）”第2列“本期数”=附列资料第8栏");
            }
            //强制：附列资料第16栏不等于0时，监控主表第4栏“（二）应征增值税不含税销售额（5%征收率）”第2列“本期数”=附列资料第16栏。
            if (fllm16 != 0 && zzsxgmGridlb2VO.getXsczbdcbhsxse() != fllm16) {
                LOG.error("====登记序号===【" + djxh + "】====附列资料第8栏不等于0时，主表第1栏“（一）应征增值税不含税销售额（3%征收率）" +
                        "”第2列“本期数” :【" + zzsxgmGridlb2VO.getXsczbdcbhsxse() + "】应该等于附列资料第8栏：【" + fllm16 + "】");
                return ResultVo.valueOfError("附列资料第16栏不等于0时，主表第4栏“（二）应征增值税不含税销售额（5%征收率）”第2列“本期数”=附列资料第16栏");
            }
        }
        return ResultVo.valueOfSuccess();
    }
    /**********************************************************附列资料计算校验结束************************************************************/


    /**********************************************************附加税计算校验开始**************************************************************/
    /***
     * 附加税计算校验
     * @param requestVO
     * @return
     */
    private ResultVo fjsJy(HXZGSB00045Request requestVO, String djxh, String sssqq, String sssqz) {
        LOG.info("====登记序号===【" + djxh + "】====附加税计算校验=========");
        Zzsxgmfjssb zzsxgmfjssb = requestVO.getZzssyyxgmnsrySbSbbdxxVO().getZzsxgmfjssb();
        List<XgmfjsxxGridlb> xgmfjsxxGridlbs = zzsxgmfjssb.getXgmfjsxxGrid().getXgmfjsxxGridlb();

        // 起征点计算
        Map<String, Object> qzdMap = hwfwQzdjs(djxh);
        Double qzdse = (Double) qzdMap.get(SbjyCodeEnum.QZD_CODE.getCode());

        //调用金三查询税率方法取得 附加税税率
        ResultVo resultVo = hdxxTqDao.queryFjsZspms(djxh, "10101", sssqq, sssqz);
        if (!resultVo.isSuccess()) {
            LOG.error("====登记序号===【" + djxh + "】====查询附加税税率时发生错误，错误信息：" + resultVo.getMessage());
            return resultVo;
        }
        List<Map<String, String>> resultList = (List<Map<String, String>>) resultVo.getValue();
        for (XgmfjsxxGridlb xgmfjsxxGridlb : xgmfjsxxGridlbs) {
            SbjyCodeEnum sbjyCodeEnum = SbjyCodeEnum.getSbjyCodeEnum(xgmfjsxxGridlb.getSybh());
            resultVo = getFjsBnbjJsjy(djxh, xgmfjsxxGridlb, resultList, sbjyCodeEnum, qzdse,sssqq);
            if (!resultVo.isSuccess()) {
                break;
            }
        }
        if (!resultVo.isSuccess()) {
            return resultVo;
        }
        return ResultVo.valueOfSuccess();
    }

    /***
     *
     * @param djxh
     * @param xgmfjsxxGridlb
     * @param resultList
     * @param sbjyCodeEnum
     * @return
     */
    private ResultVo getFjsBnbjJsjy(String djxh, XgmfjsxxGridlb xgmfjsxxGridlb, List<Map<String, String>> resultList,
                                    SbjyCodeEnum sbjyCodeEnum, double qzdse,String skssqq) {
        LOG.info("====登记序号===【" + djxh + "】====XgmfjsxxGridlb【" + JSONObject.toJSONString(xgmfjsxxGridlb) + "】");
        int year = 0;
        if (StringUtils.isNotBlank(skssqq)) {
            year = Integer.parseInt(skssqq.substring(0, 4));
        }
        double jmbl = 0.0;
        if (year >= 2019) {
            ResultVo resultVo = hdxxTqDao.queryFjsJzblByJmxzDm(xgmfjsxxGridlb.getPhjmxzDm());
            if (!resultVo.isSuccess()) {
                return resultVo;
            }
            String value = (String) resultVo.getValue();
            jmbl = Double.parseDouble(value);
        }
        String rdpzuuid = xgmfjsxxGridlb.getRdpzuuid();
        double bqynse = getFjsSl(resultList, djxh, rdpzuuid, xgmfjsxxGridlb.getZsxmDm(), xgmfjsxxGridlb.getJsyj());

        SbjyCodeEnum codeEnum = SbjyCodeEnum.getSbjyCodeEnum(sbjyCodeEnum.getDesc());
        double bqybtse = 0.0;
        if (SbjyCodeEnum.YSHWLW_CODE == codeEnum) {
            bqybtse = zzsxgmGridlb1VO.getBqybtse();
        } else if (SbjyCodeEnum.YSFW_CODE == codeEnum) {
            bqybtse = zzsxgmGridlb2VO.getBqybtse();
        }

        /***
         * 主表主税税种类别代码是"货物及劳务"的取“货物及劳务应补退税额“，
         * 当“货物及劳务应补退税额”<=0时，H=0;当“货物及劳务应补退税额”>0时，
         * H=货物及劳务应补退税额”。
         */
        if (bqybtse <= 0 && xgmfjsxxGridlb.getJsyj() != 0) {
            LOG.error("====登记序号===【" + djxh + "】====应税货物劳务主表第24栏“本期应补（退）税额”小于等于0时，" +
                    "附加税申报表计税依据:【" + xgmfjsxxGridlb.getJsyj() + "】应该为0，请检查数据是否正确！");
            return ResultVo.valueOfError("应税货物劳务主表第24栏“本期应补（退）税额”小于等于0时，" +
                    "附加税申报表计税依据应该等于0，请检查数据是否正确！");
        }
        if (bqybtse > 0 && xgmfjsxxGridlb.getJsyj() != bqybtse) {
            LOG.error("====登记序号===【" + djxh + "】====应税货物劳务主表第24栏“本期应补（退）税额”大于0时，" +
                    "附加税申报表计税依据:【" + xgmfjsxxGridlb.getJsyj() + "】应该为:【" + bqybtse + "】，请检查数据是否正确！");
            return ResultVo.valueOfError("应税货物劳务主表第24栏“本期应补（退）税额”大于0时，" +
                    "附加税申报表计税依据应该等于应税货物劳务主表第24栏“本期应补（退）税额”" + bqybtse + "，请检查数据是否正确！");
        }
        //本期应纳税（费）额J = 计税依据H * 税率（征收率）I
        if (bqynse != xgmfjsxxGridlb.getYnse()) {
            LOG.error("====登记序号===【" + djxh + "】====应税货物劳务附加税申报表“本期应纳税（费）额”:【" + xgmfjsxxGridlb.getYnse()
                    + "】应该等于：【" + bqynse + "】，请检查数据是否正确！");
            return ResultVo.valueOfError("应税货物劳务附加税申报表“本期应纳税（费）额”" + xgmfjsxxGridlb.getYnse()
                    + "应该等于" + bqynse + "，请检查数据是否正确！");
        }
        //主税小于等于起征点，减免性质代码为空，减免额不可编辑
        if (StringUtils.isBlank(xgmfjsxxGridlb.getPhjmxzDm()) && xgmfjsxxGridlb.getJmse() != 0) {
            LOG.error("====登记序号===【" + djxh + "】====您未选择“减免性质代码”，应税货物劳务附加税申报表“减免额”:【"
                    + xgmfjsxxGridlb.getJmse() + "】应该为0，请检查数据是否正确！");
            return ResultVo.valueOfError("您未选择“减免性质代码”，应税货物劳务附加税申报表“减免额”" + xgmfjsxxGridlb.getJmse()
                    + "应该为0，请检查数据是否正确！");
        }
        //减免性质代码不为空时，0 <= 减免税额K <= 本期应纳税（费）额J
        if (StringUtils.isNotBlank(xgmfjsxxGridlb.getPhjmxzDm())
                && (xgmfjsxxGridlb.getJmse() < 0 || xgmfjsxxGridlb.getJmse() > xgmfjsxxGridlb.getYnse())) {
            LOG.error("====登记序号===【" + djxh + "】====您已选择减免性质代码，应税货物劳务附加税申报表“本期减免税（费）额”:【"
                    + xgmfjsxxGridlb.getJmse() + "】应该大于等于0，小于等于本期已缴税（费）额：【"
                    + xgmfjsxxGridlb.getYnse() + "】，请检查数据是否正确！");
            return ResultVo.valueOfError("您已选择减免性质代码，应税货物劳务附加税申报表“本期减免税（费）额”" + xgmfjsxxGridlb.getJmse()
                    + "大于等于0，小于等于本期已缴税（费）额" + xgmfjsxxGridlb.getYnse() + "，请检查数据是否正确！");
        }
        //小规模减征额M=(本期应纳税额-减免税额）×小规模减征比例
        double jze = ArithUtil.mul(ArithUtil.sub(xgmfjsxxGridlb.getYnse(), xgmfjsxxGridlb.getJmse()), jmbl, 2);
        if (xgmfjsxxGridlb.getPhjmse() != jze) {
            LOG.error("====登记序号===【" + djxh + "】====应税货物劳务附加税申报表“小规模减征额”:【" + xgmfjsxxGridlb.getPhjmse()
                    + "】应该等于：【" + jze + "】，请检查数据是否正确！");
            return ResultVo.valueOfError("应税货物劳务附加税申报表“小规模减征额”" + xgmfjsxxGridlb.getPhjmse()
                    + "应该等于" + jze + "，请检查数据是否正确！");
        }
        //本期已缴税（费）额L:固定值等于0
        if (xgmfjsxxGridlb.getYjse1() != 0) {
            LOG.error("====登记序号===【" + djxh + "】====应税货物劳务附加税申报表“本期已缴税（费）额”:【" + xgmfjsxxGridlb.getYjse1()
                    + "】应该等于：【" + 0 + "】，请检查数据是否正确！");
            return ResultVo.valueOfError("应税货物劳务附加税申报表“本期已缴税（费）额”" + xgmfjsxxGridlb.getYjse1()
                    + "应该等于" + 0 + "，请检查数据是否正确！");
        }
        //本期应补（退）税（费）额不能小于0
        if (xgmfjsxxGridlb.getYbtse() < 0) {
            LOG.error("====登记序号===【" + djxh + "】====应税货物劳务附加税申报表“本期应补（退）税（费）额”:【" + xgmfjsxxGridlb.getYbtse()
                    + "】不能小于：【" + 0 + "】，请检查数据是否正确！");
            return ResultVo.valueOfError("应税货物劳务附加税申报表“本期应补（退）税（费）额”" + xgmfjsxxGridlb.getYbtse()
                    + "不能小于" + 0 + "，请检查数据是否正确！");
        }
        //教育费附加 地方教育附加  未达起征点  不校验下规则（城市维护建设税不受起征点限制都要校验）  --证据：依据原先的代码逻辑
        double qzd = Double.parseDouble(SbjyCodeEnum.QZD_30W_CODE.getDesc());
        if (SbjyCodeEnum.YSFW_CSWHJSF_CODE != sbjyCodeEnum && SbjyCodeEnum.YSHWLW_CSWHJSF_CODE != sbjyCodeEnum && qzdse <= qzd) {
            return ResultVo.valueOfSuccess();
        }
        //本期应补（退）税（费）额=本期应纳税（费）额J-减免税额K-本期已缴税（费）额L-小规模减征额M
        double bqybtse1 = ArithUtil.round(xgmfjsxxGridlb.getYnse() - xgmfjsxxGridlb.getJmse()
                - xgmfjsxxGridlb.getYjse1() - xgmfjsxxGridlb.getPhjmse(), 2);
        if (bqybtse1 != xgmfjsxxGridlb.getYbtse()) {
            LOG.error("====登记序号===【" + djxh + "】====应税货物劳务附加税申报表“本期应补（退）税（费）额”:【" + xgmfjsxxGridlb.getYbtse()
                    + "】应该等于：【" + bqybtse1 + "】，请检查数据是否正确！");
            return ResultVo.valueOfError("应税货物劳务附加税申报表“本期应补（退）税（费）额”" + xgmfjsxxGridlb.getYbtse()
                    + "应该等于" + bqybtse1 + "，请检查数据是否正确！");
        }
        return ResultVo.valueOfSuccess();
    }

/**
 * 附加税计算校验结束公共方法开始
 * 取税率方法
 *
 * @param resultList
 * @param djxh
 * @param rdpzuuid
 * @param zspmDm
 * @param jsyj
 * @return
 * @author weibin
 * @date 2019年4月18日
 */


/*************************************************************公共方法开始****************************************************************/
    /**
     * 取税率方法
     *
     * @param resultList
     * @param djxh
     * @param rdpzuuid
     * @param zsxmDm
     * @param jsyj
     * @return
     * @author weibin
     * @date 2019年4月18日
     */
    public double getFjsSl(List<Map<String, String>> resultList, String djxh, String rdpzuuid, String zsxmDm,
                           double jsyj) {
        double fjs = 0.00;
        for (int i = 0; i < resultList.size(); i++) {
            LOG.info("====登记序号===【" + djxh + "】====表里查出来的rdpzuuid ：" + resultList.get(i).get("rdpzuuid") + "征收项目代码： " + resultList.get(i).get("zsxmdm"));
            if (rdpzuuid.equals(resultList.get(i).get("rdpzuuid")) && zsxmDm.equals(resultList.get(i).get("zsxmdm"))) {
                fjs = (double) ArithUtil.round(ArithUtil.mul(jsyj, NumberUtils.toDouble(resultList.get(i).get("sl"))), 2);
                LOG.info("====登记序号===【" + djxh + "】====" + zsxmDm + "的 sl :" + NumberUtils.toDouble(resultList.get(i).get("sl")));
                break;
            }
        }
        return fjs;
    }
    /**********************************************************公共方法结束***************************************************************/
}
