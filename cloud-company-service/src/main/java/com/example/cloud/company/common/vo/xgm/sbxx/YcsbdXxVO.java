package com.example.cloud.company.common.vo.xgm.sbxx;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

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
 * <p>
 * Description: [功能描述：一窗式比对信息VO]
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
 * @date 2017-9-7
 *
 * @version 1.0
 */
public class YcsbdXxVO {
	/* 比对uuid */
	private String bduuid;
	/* 关联流水号 */
	private String gllsh;
	/* 登记序号 */
	private String djxh;
	/* 申报种类代码 */
	private String sbzlDm;
	/* 申报年月 */
	private String sbny;
	/* 所属时期起 */
	private String sssqq;
	/* 所属时期止 */
	private String sssqz;
	/* 有效标志 */
	private String yxbz;
	/* 录入时间 */
	private String lrsj;
	/* 一窗式比对明细vo */
	private List<YcsbdMxVO> ycsbdMxVOs = new ArrayList<YcsbdMxVO>();

	public String getBduuid() {
		return bduuid;
	}

	public void setBduuid(String bduuid) {
		this.bduuid = bduuid;
	}

	public String getGllsh() {
		return gllsh;
	}

	public void setGllsh(String gllsh) {
		this.gllsh = gllsh;
	}

	public String getDjxh() {
		return djxh;
	}

	public void setDjxh(String djxh) {
		this.djxh = djxh;
	}

	public String getSbzlDm() {
		return sbzlDm;
	}

	public void setSbzlDm(String sbzlDm) {
		this.sbzlDm = sbzlDm;
	}

	public String getSbny() {
		return sbny;
	}

	public void setSbny(String sbny) {
		this.sbny = sbny;
	}

	public String getSssqq() {
		return sssqq;
	}

	public void setSssqq(String sssqq) {
		this.sssqq = sssqq;
	}

	public String getSssqz() {
		return sssqz;
	}

	public void setSssqz(String sssqz) {
		this.sssqz = sssqz;
	}

	public String getYxbz() {
		return yxbz;
	}

	public void setYxbz(String yxbz) {
		this.yxbz = yxbz;
	}

	public String getLrsj() {
		return lrsj;
	}

	public void setLrsj(String lrsj) {
		this.lrsj = lrsj;
	}

	public List<YcsbdMxVO> getYcsbdMxVOs() {
		return ycsbdMxVOs;
	}

	public void addYcsbdMxVO(YcsbdMxVO ycsbdMxVO) {
		this.ycsbdMxVOs.add(ycsbdMxVO);
	}

	public void setYcsbdMxVOs(List<YcsbdMxVO> ycsbdMxVOs) {
		this.ycsbdMxVOs = ycsbdMxVOs;
	}

	public String getMsg() {
		StringBuilder sb = new StringBuilder();
		// 只组织失败的
		for (YcsbdMxVO ycsbdMxVO : ycsbdMxVOs) {
			sb.append(ycsbdMxVO.getMsg());
		}
		if (!StringUtils.isBlank(sb.toString())) {
			return "申报失败，一窗式比对不通过：" + sb.toString();
		}
		return sb.toString();
	}

	public boolean hasBdsbjl() {
		for (YcsbdMxVO ycsbdMxVO : ycsbdMxVOs) {
			if ("N".equalsIgnoreCase(ycsbdMxVO.bdjg)) {
				return true;
			}
		}
		return false;
	}

	public boolean getBdjg(String bdgz_id) {
		for (YcsbdMxVO ycsbdMxVO : ycsbdMxVOs) {
			if (bdgz_id.equals(ycsbdMxVO.getBdgzId())) {
				return "Y".equals(ycsbdMxVO.getBdjg()) ? true : false;
			}
		}
		return true;
	}

	public class YcsbdMxVO {
		/* 比对明细uuid */
		private String bdmxuuid;
		/* 比对uuid */
		private String bduuid;
		/* 比对规则id */
		private String bdgzId;
		/* 申报内容 */
		private String sbnr;
		/* 申报金额 */
		private String sbje;
		/* 外部内容 */
		private String wbnr;
		/* 外部金额 */
		private String wbje;
		/* 相差金额 */
		private String xcje;
		/* 比对结果，默认N ，M=白名单企业比对失败*/
		private String bdjg = "N";
		/* 自定义反馈信息 */
		private String msg;

		public String getBdmxuuid() {
			return bdmxuuid;
		}

		public void setBdmxuuid(String bdmxuuid) {
			this.bdmxuuid = bdmxuuid;
		}

		public String getBduuid() {
			return bduuid;
		}

		public void setBduuid(String bduuid) {
			this.bduuid = bduuid;
		}

		public String getBdgzId() {
			return bdgzId;
		}

		public void setBdgzId(String bdgzId) {
			this.bdgzId = bdgzId;
		}

		public String getSbnr() {
			return sbnr;
		}

		public void setSbnr(String sbnr) {
			this.sbnr = sbnr;
		}

		public String getSbje() {
			return sbje;
		}

		public void setSbje(String sbje) {
			this.sbje = sbje;
		}

		public String getWbnr() {
			return wbnr;
		}

		public void setWbnr(String wbnr) {
			this.wbnr = wbnr;
		}

		public String getWbje() {
			return wbje;
		}

		public void setWbje(String wbje) {
			this.wbje = wbje;
		}

		public String getXcje() {
			return xcje;
		}

		public void setXcje(String xcje) {
			this.xcje = xcje;
		}

		public String getBdjg() {
			return bdjg;
		}

		public void setBdjg(String bdjg) {
			this.bdjg = bdjg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		// 只组织失败的
		public String getMsg() {
			if ("N".equals(bdjg)) {
				if (StringUtils.isBlank(msg)) {
					StringBuilder sb = new StringBuilder();
					// 金三规则
					if (bdgzId.indexOf("_") < 0) {
						sb.append(wbnr).append("\n");
					} else {
						sb.append(sbnr).append(",与").append(wbnr).append("比较失败！[申报为:").append(sbje).append(",实际应为:").append(wbje).append("]\n");
					}
					return sb.toString();
				} else {
					return msg;
				}
			} else {
				return "";
			}
		}
	}
}
