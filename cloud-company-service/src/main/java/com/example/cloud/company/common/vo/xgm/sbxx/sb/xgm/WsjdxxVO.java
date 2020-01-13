package com.example.cloud.company.common.vo.xgm.sbxx.sb.xgm;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.company.common.vo.base.BaseVO;
import com.example.cloud.company.common.vo.xgm.qcxx.WsxxVo;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class WsjdxxVO extends BaseVO {
    private static final long serialVersionUID = 1L;

    private static final Logger LOG = Logger.getLogger(WsjdxxVO.class);

    // 应税货物核定应纳税额
    private double yshwhdynse;

    // 应税货物征收率
    private double yshwynzsl;

    // 货物起征点
    private double hwqzd;

    // 应税货物核定销售额
    private double yshwhdxse;

    // 应税服务核定应纳税额
    private double ysfwhdynse;

    // 应税服物征收率
    private double ysfwynzsl;

    // 服务起征点
    private double fwqzd;

    // 应税服务核定销售额
    private double ysfwhdxse;

    // 1:逾期未认定企业，0:非逾期未认定企业
    private String yqwrdbz;

    // 应税不动产征收率
    private double ysbdczsl;

    // 小规模附表1期初余额
    private double xgmfb1qcye;

    // 小规模附表1期初余额5%
    private double xgmfb1qcye5;

    //本期应税货物金三预缴值
    private double bqyshwyjgt3;

    //本期应税服务金三预缴值
    private double bqysfwyjgt3;

    //税种类别代码
    private String szlbDm;

    //个体户标志【0非个体户、1个体户】
    private String gthbz;

    //货物定税户标志【0非定税户、1定税户】
    private String hwdshbz;

    //服务定税户标志【0非定税户、1定税户】
    private String fwdshbz;

    public String getHwdshbz() {
        return hwdshbz;
    }

    public void setHwdshbz(String hwdshbz) {
        this.hwdshbz = hwdshbz;
    }

    public String getFwdshbz() {
        return fwdshbz;
    }

    public void setFwdshbz(String fwdshbz) {
        this.fwdshbz = fwdshbz;
    }

    public double getYshwhdynse() {
        return yshwhdynse;
    }

    public void setYshwhdynse(double yshwhdynse) {
        this.yshwhdynse = yshwhdynse;
    }

    public double getYshwynzsl() {
        return yshwynzsl;
    }

    public void setYshwynzsl(double yshwynzsl) {
        this.yshwynzsl = yshwynzsl;
    }

    public double getHwqzd() {
        return hwqzd;
    }

    public void setHwqzd(double hwqzd) {
        this.hwqzd = hwqzd;
    }

    public double getYshwhdxse() {
        return yshwhdxse;
    }

    public void setYshwhdxse(double yshwhdxse) {
        this.yshwhdxse = yshwhdxse;
    }

    public double getYsfwhdynse() {
        return ysfwhdynse;
    }

    public void setYsfwhdynse(double ysfwhdynse) {
        this.ysfwhdynse = ysfwhdynse;
    }

    public double getYsfwynzsl() {
        return ysfwynzsl;
    }

    public void setYsfwynzsl(double ysfwynzsl) {
        this.ysfwynzsl = ysfwynzsl;
    }

    public double getFwqzd() {
        return fwqzd;
    }

    public void setFwqzd(double fwqzd) {
        this.fwqzd = fwqzd;
    }

    public double getYsfwhdxse() {
        return ysfwhdxse;
    }

    public void setYsfwhdxse(double ysfwhdxse) {
        this.ysfwhdxse = ysfwhdxse;
    }

    public String getYqwrdbz() {
        return yqwrdbz;
    }

    public void setYqwrdbz(String yqwrdbz) {
        this.yqwrdbz = yqwrdbz;
    }

    public double getYsbdczsl() {
        return ysbdczsl;
    }

    public void setYsbdczsl(double ysbdczsl) {
        this.ysbdczsl = ysbdczsl;
    }

    public double getXgmfb1qcye() {
        return xgmfb1qcye;
    }

    public void setXgmfb1qcye(double xgmfb1qcye) {
        this.xgmfb1qcye = xgmfb1qcye;
    }

    public double getXgmfb1qcye5() {
        return xgmfb1qcye5;
    }

    public void setXgmfb1qcye5(double xgmfb1qcye5) {
        this.xgmfb1qcye5 = xgmfb1qcye5;
    }

    public double getBqyshwyjgt3() {
        return bqyshwyjgt3;
    }

    public void setBqyshwyjgt3(double bqyshwyjgt3) {
        this.bqyshwyjgt3 = bqyshwyjgt3;
    }

    public double getBqysfwyjgt3() {
        return bqysfwyjgt3;
    }

    public void setBqysfwyjgt3(double bqysfwyjgt3) {
        this.bqysfwyjgt3 = bqysfwyjgt3;
    }

    public String getSzlbDm() {
        return szlbDm;
    }

    public void setSzlbDm(String szlbDm) {
        this.szlbDm = szlbDm;
    }

    public String getGthbz() {
        return gthbz;
    }

    public void setGthbz(String gthbz) {
        this.gthbz = gthbz;
    }

    //将核定起初数据转化为对象，后边方便使用
    public static ResultVo getWshdqcxx(String djxh,  List<WsxxVo> wsxxList) {
        LOG.info("====登记序号===【" + djxh + "】====从核定中提取 wsxxList 【" + JSONObject.toJSONString(wsxxList) + "】");
        if (CollectionUtils.isEmpty(wsxxList)) {
            return ResultVo.valueOfSuccess("获取核定信息失败!");
        }
        WsjdxxVO wsxxVO = new WsjdxxVO();
        for (WsxxVo wsxxVo : wsxxList) {
            if ("YSHWHDYNSE".equals(wsxxVo.getCODE())) {
                wsxxVO.setYshwhdynse(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 应税货物核定应纳税额 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("YSFWHDYNSE".equals(wsxxVo.getCODE())) {
                wsxxVO.setYsfwhdynse(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 应税服务核定应纳税额 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("YQWRDBZ".equals(wsxxVo.getCODE())) {
                wsxxVO.setYqwrdbz(wsxxVo.getVALUE());
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 逾期认定标志 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("YSHWYNZSL".equals(wsxxVo.getCODE())) {
                wsxxVO.setYshwynzsl(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 应税货物征收率 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("YSFWYNZSL".equals(wsxxVo.getCODE())) {
                wsxxVO.setYsfwynzsl(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 应税服物征收率 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("YSBDCZSL".equals(wsxxVo.getCODE())) {
                wsxxVO.setYsbdczsl(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 应税不动产征收率【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("QZD".equals(wsxxVo.getCODE())) {
                wsxxVO.setHwqzd(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 货物劳务起征点 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("YSFWQZD".equals(wsxxVo.getCODE())) {
                wsxxVO.setFwqzd(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 应税服务起征点 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("YSHWHDXSE".equals(wsxxVo.getCODE())) {
                wsxxVO.setYshwhdxse(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 应税货物核定销售额 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("YSFWHDXSE".equals(wsxxVo.getCODE())) {
                wsxxVO.setYsfwhdxse(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 应税服务核定销售额【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("XGMFB1QCYE".equals(wsxxVo.getCODE())) {
                wsxxVO.setXgmfb1qcye(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 小规模附表1期初余额 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("XGMFB1QCYE5".equals(wsxxVo.getCODE())) {
                wsxxVO.setXgmfb1qcye5(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】====从核定中提取 小规模附表1期初余额5% 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("BQYSHWYJ".equals(wsxxVo.getCODE())) {
                //本期应税货物金三预缴值
                wsxxVO.setBqyshwyjgt3(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】===从核定中提取本期应税货物金三预缴值【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("BQYSFWYJ".equals(wsxxVo.getCODE())) {
                //本期应税服务金三预缴值
                wsxxVO.setBqysfwyjgt3(Double.parseDouble(wsxxVo.getVALUE()));
                LOG.info("====登记序号===【" + djxh + "】===从核定中提取本期应税服务金三预缴值 【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("SZLBDM".equals(wsxxVo.getCODE())) {
                //税种类别代码
                wsxxVO.setSzlbDm(wsxxVo.getVALUE());
                LOG.info("====登记序号===【" + djxh + "】===从核定中提取税种类别代码【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            } else if ("GTHBZ".equals(wsxxVo.getCODE())) {
                //个体户标志【0非个体户、1个体户】
                wsxxVO.setGthbz(wsxxVo.getVALUE());
                LOG.info("====登记序号===【" + djxh + "】===从核定中提取个体户标志【0非个体户、1个体户】【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            }
            else if ("HWYQSB".equals(wsxxVo.getCODE())) {
                //货物定税户标志【0非定税户、1定税户】
                wsxxVO.setHwdshbz(wsxxVo.getVALUE());
                LOG.info("====登记序号===【" + djxh + "】===从核定中提取货物定税户标志【0非定税户、1定税户】【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            }   else if ("FWYQSB".equals(wsxxVo.getCODE())) {
                //服务定税户标志【0非定税户、1定税户】
                wsxxVO.setFwdshbz(wsxxVo.getVALUE());
                LOG.info("====登记序号===【" + djxh + "】===从核定中提取服务定税户标志【0非定税户、1定税户】【" + wsxxVo.getCODE() + "】值为：【" + wsxxVo.getVALUE() + "】");
            }
        }
        LOG.info("====登记序号===【" + djxh + "】===从核定中提取WsjdxxVO【" + JSONObject.toJSONString(wsxxVO) + "】");
        return ResultVo.valueOfSuccess(wsxxVO);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

