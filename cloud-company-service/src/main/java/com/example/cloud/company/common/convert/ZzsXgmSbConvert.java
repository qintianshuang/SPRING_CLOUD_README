package com.example.cloud.company.common.convert;

import com.example.cloud.company.common.build.xgm.qcxml.ArithUtil;
import com.example.cloud.company.common.enums.NsqxEnum;
import com.example.cloud.company.common.vo.xgm.hdxx.*;
import com.example.cloud.company.common.vo.xgm.qcxx.WsxxVo;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.SBJmxxJhVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.SBSbxxJhVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.SBYjxxJhVO;
import com.example.cloud.company.common.vo.xgm.xml.HXZGSB00044Response;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ZzsXgmSbConvert {
    private static Logger log = Logger.getLogger(ZzsXgmSbConvert.class);

    public ZzsXgmSbConvert() {
    }

    public HdxxSbzlResponseVo convertVo(Object sbqcsvo, SbzlHdxxVO sbzlHdxxVO) {
        HdxxSbzlResponseVo sbzlNode = new HdxxSbzlResponseVo();
        HXZGSB00044Response hxzgsb00044Response = (HXZGSB00044Response)sbqcsvo;
        if (hxzgsb00044Response == null) {
            log.error("获取 增值税小规模期初数为空");
            return sbzlNode;
        } else {
            HXZGSB00044Response.SbxxGrid sbxxGrid = hxzgsb00044Response.getSbxxGrid();
            List<SBSbxxJhVO> sbxxGridlb = null;
            if (sbxxGrid != null) {
                sbxxGridlb = sbxxGrid.getSbxxGridlb();
            }

            if (sbxxGridlb != null && sbxxGridlb.size() > 0) {
                sbzlNode.setSBQX(((SBSbxxJhVO)sbxxGridlb.get(0)).getSbqx());
                sbzlNode.setNSQXDM(((SBSbxxJhVO)sbxxGridlb.get(0)).getNsqxDm());
            } else {
                sbzlNode.setSBQX("");
                sbzlNode.setNSQXDM("");
            }

            HdxxSbzlResponseVo.WSXXS wsxxs = new HdxxSbzlResponseVo.WSXXS();
            List<WsxxVo> wsxxList = this.buildWsxxList(hxzgsb00044Response, sbzlHdxxVO);
            wsxxs.getWSXX().addAll(wsxxList);
            HdxxSbzlResponseVo.ZSPMS zspms = this.buildZspmVo(hxzgsb00044Response);
            HdxxSbzlResponseVo.LSXXS lsxxs = new HdxxSbzlResponseVo.LSXXS();
            List<LsxxVo> lsxxList = this.buildLsxxList(hxzgsb00044Response, sbzlHdxxVO);
            lsxxs.getLSXX().addAll(lsxxList);
            HdxxSbzlResponseVo.SBBS sbbs = new HdxxSbzlResponseVo.SBBS();
            List<String> sbbsList = this.buildSbbsList(hxzgsb00044Response);
            sbbs.getSBB().addAll(sbbsList);
            List<HdxxSbzlResponseVo.JMXX> jmxxList = this.buildJmxxList(hxzgsb00044Response);
            List<HdxxSbzlResponseVo.JMXX> jmxx = sbzlNode.getJMXX();
            jmxx.addAll(jmxxList);
            sbzlNode.setWSXXS(wsxxs);
            sbzlNode.setZSPMS(zspms);
            sbzlNode.setLSXXS(lsxxs);
            sbzlNode.setSBBS(sbbs);
//            sbzlNode.setZzsjmxxbs(this.buildZzsjmxx(sbzlHdxxVO));
            return sbzlNode;
        }
    }

    private List<WsxxVo> buildWsxxList(HXZGSB00044Response hxzgsb00044Response, SbzlHdxxVO sbzlHdxxVO) {
        HXZGSB00044Response.SbxxGrid sbxxGrid = hxzgsb00044Response.getSbxxGrid();
        HXZGSB00044Response.JmxxGrid jmxxGrid = hxzgsb00044Response.getJmxxGrid();
        HXZGSB00044Response.YjxxGrid yjxxGrid = hxzgsb00044Response.getYjxxGrid();
        List<SBSbxxJhVO> sbxxGridlb = null;
        if (sbxxGrid != null) {
            sbxxGridlb = sbxxGrid.getSbxxGridlb();
        }

        List<SBJmxxJhVO> jmxxGridlb = null;
        if (jmxxGridlb != null) {
            jmxxGridlb = jmxxGrid.getJmxxGridlb();
        }

        List<SBYjxxJhVO> yjxxGridlb = null;
        if (yjxxGrid != null) {
            yjxxGridlb = yjxxGrid.getYjxxGridlb();
        }

        double swjgdkdzzszyfpbhsxse1 = 0.0D;
        HXZGSB00044Response.ZzsxgmnsrqcsxxGrid zzsxgmnsrqcsxxGrid = hxzgsb00044Response.getZzsxgmnsrqcsxxGrid();
        List<SBZzsxgmnsrqcsxxVO> zzsxgmnsrqcsxxGridlb = null;
        if (zzsxgmnsrqcsxxGrid != null) {
            zzsxgmnsrqcsxxGridlb = zzsxgmnsrqcsxxGrid.getZzsxgmnsrqcsxxGridlb();
            Iterator var13 = zzsxgmnsrqcsxxGridlb.iterator();

            while(var13.hasNext()) {
                SBZzsxgmnsrqcsxxVO sbZzsxgmnsrqcsxxVO = (SBZzsxgmnsrqcsxxVO)var13.next();
                if (sbZzsxgmnsrqcsxxVO.getEwblxh() == 4L) {
                    swjgdkdzzszyfpbhsxse1 = sbZzsxgmnsrqcsxxVO.getSwjgdkdzzszyfpbhsxse1();
                }
            }
        }

        SBZzsxgmnsrqtxxVO sbZzsxgmnsrqtxxVO = hxzgsb00044Response.getSbZzsxgmnsrqtxxVO();
        List<WsxxVo> wsxxList = new ArrayList();
        String yshwlwBz = "";
        String ysfwBz = "";
        String hwDshbz = "0";
        String fwDshbz = "0";
        double dqdeYshwlwHdxse = 0.0D;
        double dqdeYsfwHdxse = 0.0D;
        if (sbZzsxgmnsrqtxxVO != null) {
            yshwlwBz = sbZzsxgmnsrqtxxVO.getYshwlwBz();
            ysfwBz = sbZzsxgmnsrqtxxVO.getYsfwBz();
            dqdeYshwlwHdxse = sbZzsxgmnsrqtxxVO.getDqdeYshwlwHdxse();
            dqdeYsfwHdxse = sbZzsxgmnsrqtxxVO.getDqdeYsfwHdxse();
        }

        if (dqdeYshwlwHdxse > 0.0D) {
            hwDshbz = "1";
        }

        if (dqdeYsfwHdxse > 0.0D) {
            fwDshbz = "1";
        }

        String szlbDm = "";
        if ("Y".equals(yshwlwBz) && "N".equals(ysfwBz)) {
            szlbDm = "01";
        } else if ("N".equals(yshwlwBz) && "Y".equals(ysfwBz)) {
            szlbDm = "02";
        } else if ("Y".equals(yshwlwBz) && "Y".equals(ysfwBz)) {
            szlbDm = "03";
        }

        double bqyshwyj = 0.0D;
        double bqysfwyj = 0.0D;
        double yshwynzsl = 0.0D;
        double ysfwynzsl = 0.0D;
        String gthbz;
        if (yjxxGridlb != null && yjxxGridlb.size() > 0) {
            gthbz = "";
            for(int i = 0; i < yjxxGridlb.size(); ++i) {
                gthbz = ((SBYjxxJhVO)yjxxGridlb.get(i)).getZspmDm();
                Double yjye1 = ((SBYjxxJhVO)yjxxGridlb.get(i)).getYjye1();
                if (!gthbz.startsWith("101016") && !gthbz.startsWith("101017")) {
                    if (yjye1 != null) {
                        bqyshwyj = ArithUtil.add(bqyshwyj, yjye1);
                    }
                } else if (yjye1 != null) {
                    bqysfwyj = ArithUtil.add(bqysfwyj, yjye1);
                }
            }
        }

        if (sbxxGridlb != null && sbxxGridlb.size() > 0) {
            gthbz = "";
            String yqwrdbz = "";
            for(int i = 0; i < sbxxGridlb.size(); ++i) {
                gthbz = ((SBSbxxJhVO)sbxxGridlb.get(i)).getZspmDm();
                yqwrdbz = sbZzsxgmnsrqtxxVO.getYqwrdzzsybnsrBz();
                if (!gthbz.startsWith("101016") && !gthbz.startsWith("101017")) {
                    if (((SBSbxxJhVO)sbxxGridlb.get(i)).getYjse() != null && !Double.isNaN(bqyshwyj)) {
                        bqyshwyj = ArithUtil.add(bqyshwyj, ((SBSbxxJhVO)sbxxGridlb.get(i)).getYjse());
                    } else {
                        bqyshwyj = 0.0D;
                    }
                } else if (((SBSbxxJhVO)sbxxGridlb.get(i)).getYjse() != null && !Double.isNaN(bqysfwyj)) {
                    bqysfwyj = ArithUtil.add(bqysfwyj, ((SBSbxxJhVO)sbxxGridlb.get(i)).getYjse());
                } else {
                    bqysfwyj = 0.0D;
                }

                if (!gthbz.startsWith("101016") && !gthbz.startsWith("101017")) {
                    if ("Y".equals(yqwrdbz)) {
                        yshwynzsl = ((SBSbxxJhVO)sbxxGridlb.get(i)).getSl1();
                    } else {
                        yshwynzsl = 0.03D;
                    }
                } else if ("Y".equals(yqwrdbz)) {
                    ysfwynzsl = ((SBSbxxJhVO)sbxxGridlb.get(i)).getSl1();
                } else {
                    ysfwynzsl = 0.03D;
                }
            }
        }

        if ("N".equals(ysfwBz)) {
            bqysfwyj = 0.0D;
        }

        if ("N".equals(yshwlwBz)) {
            bqyshwyj = 0.0D;
        }

        gthbz = "0";
        double zsl = 0.0D;
        String jmfsDm;
        if (sbxxGridlb != null && sbxxGridlb.size() > 0) {
            jmfsDm = ((SBSbxxJhVO)sbxxGridlb.get(0)).getDjzclxDm();
            zsl = ((SBSbxxJhVO)sbxxGridlb.get(0)).getZsl();
            if (jmfsDm.startsWith("4")) {
                gthbz = "1";
            }
        }

        jmfsDm = "";
        double jzfd = 0.0D;
        double jzed = 0.0D;
        double jzsl = 0.0D;
        if (jmxxGridlb != null && jmxxGridlb.size() > 0) {
            jmfsDm = ((SBJmxxJhVO)jmxxGridlb.get(0)).getJmfsDm();
            jzfd = ((SBJmxxJhVO)jmxxGridlb.get(0)).getJzfd();
            jzed = ((SBJmxxJhVO)jmxxGridlb.get(0)).getJzed();
            jzsl = ((SBJmxxJhVO)jmxxGridlb.get(0)).getJzsl();
        }

        String ysfwqzd = "";
        if ("08".equals(sbzlHdxxVO.getNsqxDm())) {
            ysfwqzd = "90000";
        } else {
            ysfwqzd = "30000";
        }

        WsxxVo node = new WsxxVo();
        node.setCODE("BQYSHWYJ");
        node.setNAME("本期应税货物预缴");
        if (!Double.isNaN(bqyshwyj)) {
            node.setVALUE(ArithUtil.roundStr(bqyshwyj, 2));
        } else {
            node.setVALUE("");
        }

        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("BQYSFWYJ");
        node.setNAME("本期应税服务预缴");
        if (!Double.isNaN(bqysfwyj)) {
            node.setVALUE(ArithUtil.roundStr(bqysfwyj, 2));
        } else {
            node.setVALUE("");
        }

        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("SZLBDM");
        node.setNAME("税种类别代码");
        node.setVALUE(szlbDm);
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("HWYQNS");
        node.setNAME("货物代开发票预缴税款");
        node.setVALUE("");
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FWYQNS");
        node.setNAME("服务代开发票预缴税款");
        node.setVALUE("");
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("HWDKZPXSE");
        node.setNAME("应税货物税务机关代开的增值税专用发票不含销售额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getYshwlwFpdkbhsxse(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FWDKZPXSE");
        node.setNAME("应税服务税务机关代开的增值税专用发票不含销售额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getYsfwFpdkbhsxse(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("DKFPJE");
        node.setNAME("代开发票金额");
        node.setVALUE("");
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("HWYQSB");
        node.setNAME("货物定税户标志");
        node.setVALUE(hwDshbz);
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FWYQSB");
        node.setNAME("服务定税户标志");
        node.setVALUE(fwDshbz);
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("BQJM");
        node.setNAME("减免额度");
        node.setVALUE(String.valueOf(jzed));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("JML");
        node.setNAME("减免幅度");
        node.setVALUE(String.valueOf(jzfd));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("GTHBZ");
        node.setNAME("0非个体户、1个体户");
        node.setVALUE(gthbz);
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("QZD");
        node.setNAME("起征点");
        node.setVALUE(String.valueOf(sbZzsxgmnsrqtxxVO.getZzsqzd()));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("XGMFB1QCYE");
        node.setNAME("小规模附表1期初余额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getFlzlqcye(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("XGMFB1QCYE5");
        node.setNAME("小规模附表1期初余额5%");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getFlzlqcye5(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("ZZSBALX");
        node.setNAME("增值税备案类型（用于判断是否差额征税）");
        node.setVALUE(ysfwBz);
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSHWHDXSE");
        node.setNAME("应税货物核定销售额");
        node.setVALUE(ArithUtil.roundStr(dqdeYshwlwHdxse, 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSFWHDXSE");
        node.setNAME("应税服务核定销售额");
        node.setVALUE(ArithUtil.roundStr(dqdeYsfwHdxse, 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSHWHDYNSE");
        node.setNAME("应税货物核定应纳税额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getDqdeYshwlwHdynse(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSFWHDYNSE");
        node.setNAME("应税服务核定应纳税额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getDqdeYsfwHdynse(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YQWRDBZ");
        node.setNAME("逾期未认定标志");
        node.setVALUE(sbZzsxgmnsrqtxxVO.getYqwrdzzsybnsrBz());
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSHWYNZSL");
        node.setNAME("应税货物征收率");
        node.setVALUE(ArithUtil.roundStr(yshwynzsl, 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSFWYNZSL");
        node.setNAME("应税服务征收率");
        node.setVALUE(ArithUtil.roundStr(ysfwynzsl, 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("HWZSPM");
        node.setNAME("货物征收品目");
        node.setVALUE("");
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FWZSPM");
        node.setNAME("服务征收品目");
        node.setVALUE("");
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FB4JZEQCYE");
        node.setNAME("附列资料四第1栏的期初余额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getQmsezzsskxtfy5(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FB4FZJGYJQCYE");
        node.setNAME("附列资料四第2栏的期初余额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getQmsefzjgyzjnsk5(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FB4JZEBQFSE");
        node.setNAME("附列资料四第1栏的本期发生额");
        node.setVALUE("");
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FZJGCDDYJNSEHZ");
        node.setNAME("附列资料四第2栏的本期发生额");
        node.setVALUE("");
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("XGMNSRBZ");
        node.setNAME("增值税小规模纳税人标志");
        node.setVALUE(sbZzsxgmnsrqtxxVO.getXgmnsrBz());
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSFWBZ");
        node.setNAME("应税服务标志");
        node.setVALUE(ysfwBz);
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("ZSL");
        node.setNAME("征收率");
        node.setVALUE(String.valueOf(zsl));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("HWSKQJKJDPTFP");
        node.setNAME("销售货物和劳务的税控器具开具的普通发票不含税销售额");
        node.setVALUE(String.valueOf(sbZzsxgmnsrqtxxVO.getPtfpsjkpje()));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("FWSKQJKJDPTFP");
        node.setNAME("应税服务的税控器具开具的普通发票不含税销售额");
        node.setVALUE(String.valueOf(sbZzsxgmnsrqtxxVO.getPtfpsjkpje()));
        wsxxList.add(node);
//        node = new WsxxVo();
//        node.setCODE("ZJ12SBXSSR_LW");
//        node.setNAME("最近已申报的12个月销售收入(货物劳务)");
//        node.setVALUE(iZzsXgmnsrDao.getXseBy12(sbzlHdxxVO.getDjxh(), sbzlHdxxVO.getSssqQ(), sbzlHdxxVO.getSssqZ(), "1"));
//        wsxxList.add(node);
//        node = new WsxxVo();
//        node.setCODE("ZJ12SBXSSR_FW");
//        node.setNAME("最近已申报的12个月销售收入(服务)");
//        node.setVALUE(iZzsXgmnsrDao.getXseBy12(sbzlHdxxVO.getDjxh(), sbzlHdxxVO.getSssqQ(), sbzlHdxxVO.getSssqZ(), "2"));
//        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("XSCZBDCDKZPXSE");
        node.setNAME("税务机关代开的增值税专用发票不含税销售额(销售、出租不动产)");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getYsfwFpdkbhsxse5(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSFWQZD");
        node.setNAME("应税服务起征点（月报30000，季报90000）");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getZzsysfwqzd(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("YSBDCZSL");
        node.setNAME("应税不动产征收率");
        node.setVALUE("0.05");
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("PPJE");
        node.setNAME("普票金额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getPpje(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("ZPJE");
        node.setNAME("专票金额");
        node.setVALUE(ArithUtil.roundStr(sbZzsxgmnsrqtxxVO.getZpje(), 2));
        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("BQYSHWYJ_GT3");
        node.setNAME("本期应税货物金三预缴值");
        if (!Double.isNaN(bqyshwyj)) {
            node.setVALUE(ArithUtil.roundStr(ArithUtil.add(bqyshwyj, sbZzsxgmnsrqtxxVO.getHwlwydbyhyyjse()), 2));
        } else {
            node.setVALUE("");
        }

        wsxxList.add(node);
        node = new WsxxVo();
        node.setCODE("BQYSFWYJ_GT3");
        node.setNAME("本期应税服务金三预缴值");
        if (!Double.isNaN(bqysfwyj)) {
            node.setVALUE(ArithUtil.roundStr(ArithUtil.add(bqysfwyj, sbZzsxgmnsrqtxxVO.getYsfwydbyhyyjse()), 2));
        } else {
            node.setVALUE("");
        }

        wsxxList.add(node);
        return wsxxList;
    }

    private HdxxSbzlResponseVo.ZSPMS buildZspmVo(HXZGSB00044Response hxzgsb00044Response) {
        HXZGSB00044Response.SbxxGrid sbxxGrid = hxzgsb00044Response.getSbxxGrid();
        HdxxSbzlResponseVo.ZSPMS zspms = new HdxxSbzlResponseVo.ZSPMS();
        if (null != sbxxGrid && null != sbxxGrid.getSbxxGridlb()) {
            List<SBSbxxJhVO> sbsbxxlb = sbxxGrid.getSbxxGridlb();
            Iterator var5 = sbsbxxlb.iterator();

            while(var5.hasNext()) {
                SBSbxxJhVO sbsbxx = (SBSbxxJhVO)var5.next();
                ZspmVo zspm = new ZspmVo();
                zspm.setSMMC("");
                zspm.setPMBM(sbsbxx.getZspmDm());
                zspm.setPMMC("");
                zspm.setDZBM("");
                zspm.setSL(Double.toString(sbsbxx.getSl1()));
                zspm.setZSL(Double.toString(sbsbxx.getZsl()));
                zspm.setLJS("");
                zspm.setYJLJ("");
                zspm.setLJYJ("");
                zspm.setWJLJ("");
                zspms.getZspmList().add(zspm);
            }

            return zspms;
        } else {
            return zspms;
        }
    }

    private List<LsxxVo> buildLsxxList(HXZGSB00044Response hxzgsb00044Response, SbzlHdxxVO sbzlHdxxVO) {
        HXZGSB00044Response.ZzsxgmnsrqcsxxGrid zzsxgmnsrqcsxxGrid = hxzgsb00044Response.getZzsxgmnsrqcsxxGrid();
        List zzsxgmnsrqcsxxGridlb = null;
        List<LsxxVo> lsxxList = new ArrayList();
        new LsxxVo();
        String[] lsxxsName = new String[]{"应征增值税不含税销售额", "税务机关代开的增值税专用发票不含税销售额", "税控器具开具的普通发票不含税销售额", "销售、出租不动产不含税销售额", "税务机关代开的增值税专用发票不含税销售额", "税控器具开具的普通发票不含税销售额", "销售使用过的应税固定资产不含税销售额", "其中：税控器具开具的普通发票不含税销售额", "免税销售额", "小微企业免税销售额", "未达起征点销售额", "其他免税销售额", "出口免税销售额", "出口免税销售额_税控器具开具的普通发票销售额", "本期应纳税额", "本期应纳税额减征额", "本期免税额", "其中：小微企业免税额", "未达起征点免税额", "应纳税额合计", "本期预缴税额", "本期应补（退）税额", "应征增值税不含税销售额", "税务机关代开的增值税专用发票不含税销售额", "税控器具开具的普通发票不含税销售额", "销售、出租不动产不含税销售额", "税务机关代开的增值税专用发票不含税销售额", "税控器具开具的普通发票不含税销售额", "销售使用过的应税固定资产不含税销售额", "其中：税控器具开具的普通发票不含税销售额", "免税销售额", "小微企业免税销售额", "未达起征点销售额", "其他免税销售额", "出口免税销售额", "出口免税销售额_税控器具开具的普通发票销售额", "本期应纳税额", "本期应纳税额减征额", "本期免税额", "其中：小微企业免税额", "未达起征点免税额", "应纳税额合计", "本期预缴税额", "本期应补（退）税额", "应税货物劳务核定销售额", "应税货物劳务核定应纳税额", "应税服务核定销售额", "应税服务核定应纳税额"};
        String nsqxDm = sbzlHdxxVO.getNsqxDm();
        String sssqq = sbzlHdxxVO.getSssqQ();
        String sssqMonth = sssqq.substring(5, 7);
        LsxxVo lsxx;
        if (NsqxEnum.MONTH.getDm().equals(nsqxDm) && "01".equals(sssqMonth) || NsqxEnum.QUARTER.getDm().equals(nsqxDm) && ("03".equals(sssqMonth) || "01".equals(sssqMonth))) {
            for(int i = 0; i < 48; ++i) {
                lsxx = new LsxxVo();
                lsxx.setCODE(i + 1 + "");
                lsxx.setNAME(lsxxsName[i]);
                lsxx.setVALUE("0.00");
                lsxxList.add(lsxx);
            }

            return lsxxList;
        } else {
            boolean grid3 = false;
            if (zzsxgmnsrqcsxxGrid != null) {
                zzsxgmnsrqcsxxGridlb = zzsxgmnsrqcsxxGrid.getZzsxgmnsrqcsxxGridlb();
            }

            if (zzsxgmnsrqcsxxGridlb != null && zzsxgmnsrqcsxxGridlb.size() > 0) {
                SBZzsxgmnsrqcsxxVO Zzsxgmnsrqcsxx3VO = null;
                SBZzsxgmnsrqcsxxVO Zzsxgmnsrqcsxx4VO = null;

                int i;
                for(i = 0; i < zzsxgmnsrqcsxxGridlb.size(); ++i) {
                    SBZzsxgmnsrqcsxxVO vo = (SBZzsxgmnsrqcsxxVO)zzsxgmnsrqcsxxGridlb.get(i);
                    if (3L == vo.getEwblxh()) {
                        Zzsxgmnsrqcsxx3VO = vo;
                    } else if (4L == vo.getEwblxh()) {
                        Zzsxgmnsrqcsxx4VO = vo;
                    }
                }

                if (Zzsxgmnsrqcsxx3VO != null && 3L == Zzsxgmnsrqcsxx3VO.getEwblxh()) {
                    lsxx = new LsxxVo();
                    lsxx.setCODE("1");
                    lsxx.setNAME("应征增值税不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getYzzzsbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("2");
                    lsxx.setNAME("税务机关代开的增值税专用发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getSwjgdkdzzszyfpbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("3");
                    lsxx.setNAME("税控器具开具的普通发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getSkqjkjdptfpbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("4");
                    lsxx.setNAME("销售、出租不动产不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getXsczbdcbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("5");
                    lsxx.setNAME("税务机关代开的增值税专用发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getSwjgdkdzzszyfpbhsxse1() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("6");
                    lsxx.setNAME("税控器具开具的普通发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getSkqjkjdptfpbhsxse2() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("7");
                    lsxx.setNAME("销售使用过的应税固定资产不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getXssygdysgdzcbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("8");
                    lsxx.setNAME("其中：税控器具开具的普通发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getSkqjkjdptfpbhsxse1() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("9");
                    lsxx.setNAME("免税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getMsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("10");
                    lsxx.setNAME("小微企业免税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getXwqymsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("11");
                    lsxx.setNAME("未达起征点销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getWdqzdxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("12");
                    lsxx.setNAME("其他免税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getQtmsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("13");
                    lsxx.setNAME("出口免税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getCkmsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("14");
                    lsxx.setNAME("出口免税销售额_税控器具开具的普通发票销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getSkqjkjdptfpxse1() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("15");
                    lsxx.setNAME("本期应纳税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getBqynse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("16");
                    lsxx.setNAME("本期应纳税额减征额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getBqynsejze() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("17");
                    lsxx.setNAME("本期免税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getBqmse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("18");
                    lsxx.setNAME("其中：小微企业免税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getXwqymse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("19");
                    lsxx.setNAME("未达起征点免税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getWdqzdmse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("20");
                    lsxx.setNAME("应纳税额合计");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getYnsehj() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("21");
                    lsxx.setNAME("本期预缴税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getBqyjse1() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("22");
                    lsxx.setNAME("本期应补（退）税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getBqybtse() + "");
                    lsxxList.add(lsxx);
                    grid3 = true;
                } else {
                    for(i = 0; i < 22; ++i) {
                        lsxx = new LsxxVo();
                        lsxx.setCODE(i + 1 + "");
                        lsxx.setNAME(lsxxsName[i]);
                        lsxx.setVALUE("0.00");
                        lsxxList.add(lsxx);
                    }
                }

                if (Zzsxgmnsrqcsxx4VO != null && 4L == Zzsxgmnsrqcsxx4VO.getEwblxh()) {
                    lsxx = new LsxxVo();
                    lsxx.setCODE("23");
                    lsxx.setNAME("应征增值税不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getYzzzsbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("24");
                    lsxx.setNAME("税务机关代开的增值税专用发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getSwjgdkdzzszyfpbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("25");
                    lsxx.setNAME("税控器具开具的普通发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getSkqjkjdptfpbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("26");
                    lsxx.setNAME("销售、出租不动产不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getXsczbdcbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("27");
                    lsxx.setNAME("税务机关代开的增值税专用发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getSwjgdkdzzszyfpbhsxse1() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("28");
                    lsxx.setNAME("税控器具开具的普通发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getSkqjkjdptfpbhsxse2() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("29");
                    lsxx.setNAME("销售使用过的应税固定资产不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getXssygdysgdzcbhsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("30");
                    lsxx.setNAME("其中：税控器具开具的普通发票不含税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getSkqjkjdptfpbhsxse1() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("31");
                    lsxx.setNAME("免税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getMsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("32");
                    lsxx.setNAME("小微企业免税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getXwqymsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("33");
                    lsxx.setNAME("未达起征点销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getWdqzdxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("34");
                    lsxx.setNAME("其他免税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getQtmsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("35");
                    lsxx.setNAME("出口免税销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getCkmsxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("36");
                    lsxx.setNAME("出口免税销售额_税控器具开具的普通发票销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getSkqjkjdptfpxse1() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("37");
                    lsxx.setNAME("本期应纳税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getBqynse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("38");
                    lsxx.setNAME("本期应纳税额减征额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getBqynsejze() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("39");
                    lsxx.setNAME("本期免税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getBqmse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("40");
                    lsxx.setNAME("其中：小微企业免税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getXwqymse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("41");
                    lsxx.setNAME("未达起征点免税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getWdqzdmse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("42");
                    lsxx.setNAME("应纳税额合计");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getYnsehj() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("43");
                    lsxx.setNAME("本期预缴税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getBqyjse1() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("44");
                    lsxx.setNAME("本期应补（退）税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getBqybtse() + "");
                    lsxxList.add(lsxx);
                    if (grid3) {
                        lsxx = new LsxxVo();
                        lsxx.setCODE("45");
                        lsxx.setNAME("应税货物劳务核定销售额");
                        lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getHdxse() + "");
                        lsxxList.add(lsxx);
                        lsxx = new LsxxVo();
                        lsxx.setCODE("46");
                        lsxx.setNAME("应税货物劳务核定应纳税额");
                        lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getHdynse() + "");
                        lsxxList.add(lsxx);
                    } else {
                        lsxx = new LsxxVo();
                        lsxx.setCODE("45");
                        lsxx.setNAME("应税货物劳务核定销售额");
                        lsxx.setVALUE("0.00");
                        lsxxList.add(lsxx);
                        lsxx = new LsxxVo();
                        lsxx.setCODE("46");
                        lsxx.setNAME("应税货物劳务核定应纳税额");
                        lsxx.setVALUE("0.00");
                        lsxxList.add(lsxx);
                    }

                    lsxx = new LsxxVo();
                    lsxx.setCODE("47");
                    lsxx.setNAME("应税服务核定销售额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getHdxse() + "");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("48");
                    lsxx.setNAME("应税服务核定应纳税额");
                    lsxx.setVALUE(Zzsxgmnsrqcsxx4VO.getHdynse() + "");
                    lsxxList.add(lsxx);
                } else {
                    for(i = 22; i < 44; ++i) {
                        lsxx = new LsxxVo();
                        lsxx.setCODE(i + 1 + "");
                        lsxx.setNAME(lsxxsName[i]);
                        lsxx.setVALUE("0.00");
                        lsxxList.add(lsxx);
                    }

                    if (grid3) {
                        lsxx = new LsxxVo();
                        lsxx.setCODE("45");
                        lsxx.setNAME("应税货物劳务核定销售额");
                        lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getHdxse() + "");
                        lsxxList.add(lsxx);
                        lsxx = new LsxxVo();
                        lsxx.setCODE("46");
                        lsxx.setNAME("应税货物劳务核定应纳税额");
                        lsxx.setVALUE(Zzsxgmnsrqcsxx3VO.getHdynse() + "");
                        lsxxList.add(lsxx);
                    } else {
                        lsxx = new LsxxVo();
                        lsxx.setCODE("45");
                        lsxx.setNAME("应税货物劳务核定销售额");
                        lsxx.setVALUE("0.00");
                        lsxxList.add(lsxx);
                        lsxx = new LsxxVo();
                        lsxx.setCODE("46");
                        lsxx.setNAME("应税货物劳务核定应纳税额");
                        lsxx.setVALUE("0.00");
                        lsxxList.add(lsxx);
                    }

                    lsxx = new LsxxVo();
                    lsxx.setCODE("47");
                    lsxx.setNAME("应税服务核定销售额");
                    lsxx.setVALUE("0.00");
                    lsxxList.add(lsxx);
                    lsxx = new LsxxVo();
                    lsxx.setCODE("48");
                    lsxx.setNAME("应税服务核定应纳税额");
                    lsxx.setVALUE("0.00");
                    lsxxList.add(lsxx);
                }
            } else {
                for(int i = 0; i < 48; ++i) {
                    lsxx = new LsxxVo();
                    lsxx.setCODE(i + 1 + "");
                    lsxx.setNAME(lsxxsName[i]);
                    lsxx.setVALUE("0.00");
                    lsxxList.add(lsxx);
                }
            }

            return lsxxList;
        }
    }

    private List<HdxxSbzlResponseVo.JMXX> buildJmxxList(HXZGSB00044Response hxzgsb00044Response) {
        String jsxxStr = "0001011705,0001129917,0001129914,0001129902,0001129924,0001129932,0001120404,0001013608,0001013609,0001011811,0001011812,0011129999";
        String msxxStr = "0001019905,0001019902,0001019906,0001019907,0001019908,0001021203,0001039901,0001041501,0001052403,0001052402,0001059901,0001011701,0001011702,0001011703,0001011704,0001011807,0001011806,0001011809,0001011810,0001012707,0001012708,0001012709,0001012710,0001012711,0001012712,0001012713,0001012714,0001012715,0001064001,0001064007,0001032103,0001120706,0001121310,0001121301,0001122601,0001123406,0001124302,0001129916,0001129907,0001129911,0001129927,0001129928,0001129931,0001103224,0001103203,0001103207,0001103208,0001103209,0001103210,0001103211,0001103220,0001103216,0001103215,0001103217,0001103225,0001103230,0001103227,0001103228,0001103229,0001069902,0001081501,0001081502,0001081503,0001081506,0001081505,0001081507,0001081508,0001081509,0001081510,0001081517,0001081511,0001081512,0001081513,0001081518,0001081519,0001083911,0001083904,0001083903,0001083901,0001083907,0001083913,0001092202,0001092212,0001092203,0001092303,0001092314,0001092311,0001092301,0001092312,0001092313,0001099901,0001099903,0001101402,0001101403,0001101404,0001101405,0001101406,0001010504,0001010503,0001011606,0001012717,0001129999,0001064020,0001123407,0001021904,0001021905,0001081521,0001081522,0001081515,0001019909,0001101407,0001033302,0001081523,0001033303,0001103231,0001091502,0001091503,0011129999";
        List<HdxxSbzlResponseVo.JMXX> buildJmxxList = new ArrayList();
        HXZGSB00044Response.JmxxGrid jmxxGrid = hxzgsb00044Response.getJmxxGrid();
        if (jmxxGrid != null) {
            List<SBJmxxJhVO> jmxxGridlb = jmxxGrid.getJmxxGridlb();
            if (jmxxGridlb != null && jmxxGridlb.size() > 0) {
                Iterator var7 = jmxxGridlb.iterator();

                while(true) {
                    SBJmxxJhVO jmxxJhVO;
                    String jmzlxDm;
                    String ssjmxzhzDm;
                    do {
                        do {
                            do {
                                if (!var7.hasNext()) {
                                    return buildJmxxList;
                                }

                                jmxxJhVO = (SBJmxxJhVO)var7.next();
                                jmzlxDm = jmxxJhVO.getJmzlxDm();
                                ssjmxzhzDm = jmxxJhVO.getSsjmxzhzDm();
                            } while(null == ssjmxzhzDm);
                        } while("01".equals(jmzlxDm) && jsxxStr.indexOf(ssjmxzhzDm) < 0);
                    } while("02".equals(jmzlxDm) && msxxStr.indexOf(ssjmxzhzDm) > -1);

                    HdxxSbzlResponseVo.JMXX jmxx = new HdxxSbzlResponseVo.JMXX();
                    String zsxmDm = jmxxJhVO.getZsxmDm();
                    String zspmDm = jmxxJhVO.getZspmDm();
                    String jmfsDm = jmxxJhVO.getJmfsDm();
                    String jmlxDm = jmxxJhVO.getJmlxDm();
                    String jmqxq = jmxxJhVO.getJmqxq();
                    String jmqxz = jmxxJhVO.getJmqxz();
                    String ssjmxzdlDm = jmxxJhVO.getSsjmxzdlDm();
                    String ssjmxzxlDm = jmxxJhVO.getSsjmxzxlDm();
                    double jzfd = jmxxJhVO.getJzfd() == null ? 0.0D : jmxxJhVO.getJzfd();
                    double jzsl = jmxxJhVO.getJzsl() == null ? 0.0D : jmxxJhVO.getJzsl();
                    double jzed = jmxxJhVO.getJzed() == null ? 0.0D : jmxxJhVO.getJzed();
                    String jmxzMc = "";
//                    if (!StringUtils.isBlank(ssjmxzhzDm)) {
//                        List codelist = BaseCodeManager.getDataList("DM_GY_SSJMXZ_CTAIS3", ssjmxzhzDm);
//                        if (codelist != null && codelist.size() > 0) {
//                            jmxzMc = (String)codelist.get(1);
//                        }
//                    }

                    jmxx.setZsxmDm(zsxmDm);
                    jmxx.setZspmDm(zspmDm);
                    jmxx.setJmlxDm(jmlxDm);
                    jmxx.setJmfsDm(jmfsDm);
                    jmxx.setJmzlxDm(jmzlxDm);
                    jmxx.setJmqxq(jmqxq);
                    jmxx.setJmqxz(jmqxz);
                    jmxx.setSsjmxzhzDm(ssjmxzhzDm);
                    jmxx.setSsjmxzdlDm(ssjmxzdlDm);
                    jmxx.setSsjmxzxlDm(ssjmxzxlDm);
                    jmxx.setJzfd(jzfd);
                    jmxx.setJzsl(jzsl);
                    jmxx.setJzed(jzed);
                    jmxx.setJmxzMc(jmxzMc);
                    jmxx.setJmsspsxDm(jmxxJhVO.getJmsspsxDm());
                    buildJmxxList.add(jmxx);
                }
            }
        }

        return buildJmxxList;
    }

//    private HdxxSbzlResponseVo.ZZSJMXXBS buildZzsjmxx(SbzlHdxxVO sbzlHdxxVO) {
//        String djxh = sbzlHdxxVO.getDjxh();
//        String sssqQ = SwrqUtil.getSssqQByNsqxAndSssq(sbzlHdxxVO.getNsqxDm(), sbzlHdxxVO.getSbny());
//        String lastSssqZ = DateUtil.addDays(sssqQ, -1);
//        ResultVo resultVo = zzsJmxxDao.queryZzsJmxx(djxh, lastSssqZ);
//        if (!resultVo.isSuccess()) {
//            return null;
//        } else {
//            DataSet dataSet = (DataSet)resultVo.getValue();
//            if (dataSet.isEmpty()) {
//                log.debug("登记序号：" + djxh + "不存在上期减免信息");
//                return null;
//            } else {
//                List<List<String>> rows = dataSet.getResultList();
//                ZZSJMXXBS zzsjmxx = new ZZSJMXXBS();
//
//                for(int i = 0; i < rows.size(); ++i) {
//                    List<String> row = (List)rows.get(i);
//                    ZzsjmxxVO zzsjmxxVO = new ZzsjmxxVO();
//                    zzsjmxxVO.setJmxxDm((String)row.get(0));
//                    String qcye = StringUtil.isNullString((String)row.get(1)) ? "0.0" : (String)row.get(1);
//                    zzsjmxxVO.setQcye(qcye);
//                    zzsjmxx.getZzsjmxxList().add(zzsjmxxVO);
//                }
//
//                return zzsjmxx;
//            }
//        }
//    }

    private List<String> buildSbbsList(HXZGSB00044Response hxzgsb00044Response) {
        List<String> sbbsList = new ArrayList();
        sbbsList.add("");
        return sbbsList;
    }
}

