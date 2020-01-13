package com.example.cloud.company.common.vo.xgm.sbxx;

import com.example.cloud.company.common.build.xgm.qcxml.ArithUtil;

/**
 *
 * <p>
 * Project: 深圳纳服平台
 * </p>
 *
 * <p>
 * Function: [功能模块：申报]
 * </p>
 *
 *
 * <p>
 * Description: [功能描述：小规模票表比对发票信息VO]
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
 * @author 金国斌
 *
 * @date 2017-6-24
 *
 * @version 1.0
 */
public class XgmFpxxVO {
	String djxh;
	String nsrsbh;
	String shxydm;
	String jdDm;
	String skssqq;
	String skssqz;

	double zyfpdkbhsxseHw;// 【A2a】应税货物及劳务代开的增值税专用发票不含税销售额-【征管】【yshwlwFpdkbhsxse】

	double zyfpzkbhsxseHw;// 【A2b】应税货物及劳务自开的增值税专用发票不含税销售额-【防伪税控】
	//
	double zyfpdkbhsxseFw1;// 【B2a】应税服务代开的增值税专用发票不含税销售额-【征管】【ysfwFpdkbhsxse】zyfpdkbhsxseFw
	//zyfpzkbhsxse_fw1
	double zyfpzkbhsxseFw1;// 【B2b】应税服务、不动产和无形资产自开的增值税专用发票不含税销售额-【防伪税控】zyfpzkbhsxseFw
    //zyfpdkbhsxse_fw2
	double zyfpdkbhsxseFw2;// 【B5a】销售、出租不动产代开的增值税专用发票不含税销售额-【征管】【ysfwFpdkbhsxse5】zyfpdkbhsxseHw1
	//zyfpzkbhsxse_fw2
	double zyfpzkbhsxseFw2;// 【B5b】销售、出租不动产自开的增值税专用发票不含税销售额-【防伪税控】zyfpzkbhsxseHw1

	double ptfpdkbhsxseHw;// 【A3a】应税货物劳务、应税服务、不动产和无形资产代开的增值税普通发票不含税销售额-【征管】【ppje】

	double ptfpzkbhsxseHw;// 【A3b】应税货物及劳务自开的增值税普通发票不含税销售额-【防伪税控】

	double ptfpzkbhsxseFw;// 【B3b】应税服务、不动产和无形资产自开的增值税普通发票不含税销售额-【防伪税控】
//WLFP/1.05
	double wlfp;// 【A3c】应税货物及劳务、应税服务、不动产和无形资产自开的通用机打发票不含税销售额-【网络发票】tyfpdkbhsxseHw
	//
	double ptfpdkbhsxseHw1;// 【B6a】销售、出租不动产代开的增值税普通发票不含税销售额-【防伪税控】
	//
	double ptfpzkbhsxseHw1;// 【B6b】销售、出租不动产自开的增值税普通发票不含税销售额-【防伪税控】

	double hwlwhdde;// 货物劳务核定定额-【征管】【zzsqzd】

	double ysfwhdde;// 应税服务核定定额-【征管】【zzsysfwqzd】

	double zyfpdkbhsxse;// 【C1】税务机关代开的增值税专用发票不含税销售额-【防伪税控】

	double zyfpzkbhsxse;// 【C2】防伪税控系统自开的增值税专用发票不含税销售额-【防伪税控】

	double ptfpdkbhsxse;// 【C3】税务机关代开的增值税普通发票不含税销售额-【防伪税控】

	double ptfpzkbhsxse;// 【C4】防伪税控系统自开的增值税普通发票不含税销售额-【防伪税控】

	double kpxtmsxse;// 开票系统的免税销售额
	double hwqzd;// 货物起征点
	double fwqzd;// 服务起征点

	public XgmFpxxVO() {

	}

	public XgmFpxxVO(String djxh, String skssqq, String skssqz) {
		this.djxh = djxh;
		this.skssqq = skssqq;
		this.skssqz = skssqz;
	}

	/**
	 * 设置核心征管发票数据
	 *
	 * @param yshwlwFpdkbhsxse
	 *            应税货物劳务普票发票代开不含税销售额
	 * @param ysfwFpdkbhsxse
	 *            应税服务劳务普票发票代开不含税销售额
	 * @param ysfwFpdkbhsxse5
	 *            应税货物劳务普票发票代开不含税销售额（5%）
	 * @param ppje
	 *            普票金额
	 * @param dqdeYshwlwHdxse
	 *            应税货物劳务核定税额
	 * @param dqdeYsfwHdxse
	 *            应税服务核定税额
	 */
	public void setG3Data(double yshwlwFpdkbhsxse, double ysfwFpdkbhsxse, double ysfwFpdkbhsxse5, double ppje,
			double dqdeYshwlwHdxse, double dqdeYsfwHdxse,double fwqzd,double hwqzd) {
		this.zyfpdkbhsxseHw = yshwlwFpdkbhsxse;
		this.zyfpdkbhsxseFw1 = ysfwFpdkbhsxse;
		this.zyfpdkbhsxseFw2 = ysfwFpdkbhsxse5;
		this.ptfpdkbhsxseHw = ppje;
		this.hwlwhdde = dqdeYshwlwHdxse;
		this.ysfwhdde = dqdeYsfwHdxse;
		this.fwqzd = fwqzd;
		this.hwqzd = hwqzd;
	}

	/**
	 * 获取普通发票不含税销售额
	 * </p>
	 * +税务机关代开的增值税普通发票不含税销售额
	 * </p>
	 * +防伪税控系统自开的增值税普通发票不含税销售额
	 * </p>
	 * +应税货物及劳务、应税服务、不动产和无形资产自开的通用机打发票不含税销售额-【网络发票】
	 *
	 * @return 普通发票不含税销售额合计
	 */
	public double getPtfpbhsxse() {
		// C3+C4+A3c
		return ArithUtil.add(ptfpdkbhsxse, ptfpzkbhsxse);
	}

	/**
	 * 获取专用发票不含税销售额（货物）
	 * </p>
	 * 专用发票自开不含税销售额（货物）+专用发票代开不含税销售额（货物）
	 *
	 * @return 专用发票不含税销售额（货物）
	 */
	public double getZyfpbhsxseHw() {
		// A2a+A2b
		return ArithUtil.add(zyfpdkbhsxseHw, zyfpzkbhsxseHw);
	}

	/**
	 * 获取专用发票不含税销售额（服务）
	 * </p>
	 * 专用发票自开不含税销售额（服务）+专用发票代开不含税销售额（服务）
	 *
	 * @return 专用发票不含税销售额（服务）
	 */
	public double getZyfpbhsxseFw() {
		// B2a+B2b
		return ArithUtil.add(zyfpdkbhsxseFw1, zyfpzkbhsxseFw1);
	}

	/**
	 * 获取销售、出租不动产代开的增值税专用发票不含税销售额（货物）
	 * </p>
	 * 销售、出租不动产代开的增值税专用发票不含税销售额+销售、出租不动产自开的增值税专用发票不含税销售额
	 *
	 * @return 销售、出租不动产代开的增值税专用发票不含税销售额（货物）
	 */
	public double getZyfpbhsxseHw1() {
		// B5a+B5b
		return ArithUtil.add(zyfpdkbhsxseFw2, zyfpzkbhsxseFw2);
	}

	/**
	 * 开票额合计
	 *
	 * @return 开票额合计
	 */
	public double getSum() {
		// C1+C2+C3+C4+A3c
		return ArithUtil.add(zyfpdkbhsxse, zyfpzkbhsxse, ptfpdkbhsxse, ptfpzkbhsxse,kpxtmsxse);
	}

	/**
	 * 查账征收纳税人、核定征收纳税人（核定销售额<开票额合计C1+C2+C3+C4+A3c）比对4~5公式
	 *
	 * @return
	 */
	public boolean isNeedCheckRule54() {
		// 查账征收纳税人
		if (hwlwhdde == 0 && ysfwhdde == 0) {
			return true;
		}
		// 核定征收纳税人，核定销售额<开票额合计C1+C2+C3+C4+A3c
		double hdde = hwlwhdde > ysfwhdde ? hwlwhdde : ysfwhdde;
		if (hdde < getSum()) {
			return true;
		} else {
			return false;
		}
	}

	public String getDjxh() {
		return djxh;
	}

	public void setDjxh(String djxh) {
		this.djxh = djxh;
	}

	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}

	public String getShxydm() {
		return shxydm;
	}

	public void setShxydm(String shxydm) {
		this.shxydm = shxydm;
	}

	public String getJdDm() {
		return jdDm;
	}

	public void setJdDm(String jdDm) {
		this.jdDm = jdDm;
	}

	public String getSkssqq() {
		return skssqq;
	}

	public void setSkssqq(String skssqq) {
		this.skssqq = skssqq;
	}

	public String getSkssqz() {
		return skssqz;
	}

	public void setSkssqz(String skssqz) {
		this.skssqz = skssqz;
	}

	public double getZyfpdkbhsxseHw() {
		return zyfpdkbhsxseHw;
	}

	public void setZyfpdkbhsxseHw(double zyfpdkbhsxseHw) {
		this.zyfpdkbhsxseHw = zyfpdkbhsxseHw;
	}

	public double getZyfpzkbhsxseHw() {
		return zyfpzkbhsxseHw;
	}

	public void setZyfpzkbhsxseHw(double zyfpzkbhsxseHw) {
		this.zyfpzkbhsxseHw = zyfpzkbhsxseHw;
	}

	public double getZyfpdkbhsxseFw1() {
		return zyfpdkbhsxseFw1;
	}

	public void setZyfpdkbhsxseFw1(double zyfpdkbhsxseFw1) {
		this.zyfpdkbhsxseFw1 = zyfpdkbhsxseFw1;
	}

	public double getZyfpzkbhsxseFw1() {
		return zyfpzkbhsxseFw1;
	}

	public void setZyfpzkbhsxseFw1(double zyfpzkbhsxseFw1) {
		this.zyfpzkbhsxseFw1 = zyfpzkbhsxseFw1;
	}

	public double getZyfpdkbhsxseFw2() {
		return zyfpdkbhsxseFw2;
	}

	public void setZyfpdkbhsxseFw2(double zyfpdkbhsxseFw2) {
		this.zyfpdkbhsxseFw2 = zyfpdkbhsxseFw2;
	}

	public double getZyfpzkbhsxseFw2() {
		return zyfpzkbhsxseFw2;
	}

	public void setZyfpzkbhsxseFw2(double zyfpzkbhsxseFw2) {
		this.zyfpzkbhsxseFw2 = zyfpzkbhsxseFw2;
	}

	public double getPtfpdkbhsxseHw() {
		return ptfpdkbhsxseHw;
	}

	public void setPtfpdkbhsxseHw(double ptfpdkbhsxseHw) {
		this.ptfpdkbhsxseHw = ptfpdkbhsxseHw;
	}

	public double getPtfpzkbhsxseHw() {
		return ptfpzkbhsxseHw;
	}

	public void setPtfpzkbhsxseHw(double ptfpzkbhsxseHw) {
		this.ptfpzkbhsxseHw = ptfpzkbhsxseHw;
	}

	public double getPtfpzkbhsxseFw() {
		return ptfpzkbhsxseFw;
	}

	public void setPtfpzkbhsxseFw(double ptfpzkbhsxseFw) {
		this.ptfpzkbhsxseFw = ptfpzkbhsxseFw;
	}

	public double getWlfp() {
		return wlfp;
	}

	public void setWlfp(double wlfp) {
		this.wlfp = wlfp;
	}

	public double getPtfpdkbhsxseHw1() {
		return ptfpdkbhsxseHw1;
	}

	public void setPtfpdkbhsxseHw1(double ptfpdkbhsxseHw1) {
		this.ptfpdkbhsxseHw1 = ptfpdkbhsxseHw1;
	}

	public double getPtfpzkbhsxseHw1() {
		return ptfpzkbhsxseHw1;
	}

	public void setPtfpzkbhsxseHw1(double ptfpzkbhsxseHw1) {
		this.ptfpzkbhsxseHw1 = ptfpzkbhsxseHw1;
	}

	public double getHwlwhdde() {
		return hwlwhdde;
	}

	public void setHwlwhdde(double hwlwhdde) {
		this.hwlwhdde = hwlwhdde;
	}

	public double getYsfwhdde() {
		return ysfwhdde;
	}

	public void setYsfwhdde(double ysfwhdde) {
		this.ysfwhdde = ysfwhdde;
	}

	public double getZyfpdkbhsxse() {
		return zyfpdkbhsxse;
	}

	public void setZyfpdkbhsxse(double zyfpdkbhsxse) {
		this.zyfpdkbhsxse = zyfpdkbhsxse;
	}

	public double getZyfpzkbhsxse() {
		return zyfpzkbhsxse;
	}

	public void setZyfpzkbhsxse(double zyfpzkbhsxse) {
		this.zyfpzkbhsxse = zyfpzkbhsxse;
	}

	public double getPtfpdkbhsxse() {
		return ptfpdkbhsxse;
	}

	public void setPtfpdkbhsxse(double ptfpdkbhsxse) {
		this.ptfpdkbhsxse = ptfpdkbhsxse;
	}

	public double getPtfpzkbhsxse() {
		return ptfpzkbhsxse;
	}

	public void setPtfpzkbhsxse(double ptfpzkbhsxse) {
		this.ptfpzkbhsxse = ptfpzkbhsxse;
	}

	public double getKpxtmsxse() {
		return kpxtmsxse;
	}

	public void setKpxtmsxse(double kpxtmsxse) {
		this.kpxtmsxse = kpxtmsxse;
	}

	public double getHwqzd() {
		return hwqzd;
	}

	public void setHwqzd(double hwqzd) {
		this.hwqzd = hwqzd;
	}

	public double getFwqzd() {
		return fwqzd;
	}

	public void setFwqzd(double fwqzd) {
		this.fwqzd = fwqzd;
	}

	@Override
	public String toString() {
		return "XgmFpxxVO{" +
				"djxh='" + djxh + '\'' +
				", nsrsbh='" + nsrsbh + '\'' +
				", shxydm='" + shxydm + '\'' +
				", jdDm='" + jdDm + '\'' +
				", skssqq='" + skssqq + '\'' +
				", skssqz='" + skssqz + '\'' +
				", zyfpdkbhsxseHw=" + zyfpdkbhsxseHw +
				", zyfpzkbhsxseHw=" + zyfpzkbhsxseHw +
				", zyfpdkbhsxseFw1=" + zyfpdkbhsxseFw1 +
				", zyfpzkbhsxseFw1=" + zyfpzkbhsxseFw1 +
				", zyfpdkbhsxseFw2=" + zyfpdkbhsxseFw2 +
				", zyfpzkbhsxseFw2=" + zyfpzkbhsxseFw2 +
				", ptfpdkbhsxseHw=" + ptfpdkbhsxseHw +
				", ptfpzkbhsxseHw=" + ptfpzkbhsxseHw +
				", ptfpzkbhsxseFw=" + ptfpzkbhsxseFw +
				", wlfp=" + wlfp +
				", ptfpdkbhsxseHw1=" + ptfpdkbhsxseHw1 +
				", ptfpzkbhsxseHw1=" + ptfpzkbhsxseHw1 +
				", hwlwhdde=" + hwlwhdde +
				", ysfwhdde=" + ysfwhdde +
				", zyfpdkbhsxse=" + zyfpdkbhsxse +
				", zyfpzkbhsxse=" + zyfpzkbhsxse +
				", ptfpdkbhsxse=" + ptfpdkbhsxse +
				", ptfpzkbhsxse=" + ptfpzkbhsxse +
				", kpxtmsxse=" + kpxtmsxse +
				", hwqzd=" + hwqzd +
				", fwqzd=" + fwqzd +
				'}';
	}
}
