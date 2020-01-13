package com.example.cloud.company.common.enums;

/**
 * <p>Project:  深圳纳服平台</p>
 *
 * <p>Function: [功能模块：枚举类型常量类]</p>
 *
 * <p>Description: [功能描述：枚举类型常量类]</p>
 *
 * <p>Copyright: Copyright(c) 2013-2022 税友集团</p>
 *
 * <p>Company: 税友软件集团有限公司</p>
 *
 * @author mojq
 *
 * @date 2015-9-13
 *
 * @version 1.0
 */
public class EnumConstants {

	public enum Pkzt {
		SBSB("申报失败", "1"), SBCG("申报成功", "2"), KKSB("扣款失败", "3"), KKCG("扣款成功", "4"),;
		private final String name;

		private final String value;

		private Pkzt(String name, String value){
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public String getValue() {
			return value;
		}



	}

}
