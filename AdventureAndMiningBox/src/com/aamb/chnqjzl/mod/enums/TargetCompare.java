package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 目标比较对象
 * 
 * @author 51xiaodou
 * 
 */
public enum TargetCompare {

	/**
	 * 敌方
	 */
	Enemy, /**
	 * 固定数值
	 */
	FixedValue;
	TargetCompare() {
		EnumManager.regist(this);
	}

}
