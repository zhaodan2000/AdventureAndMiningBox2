package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 效果趋势
 * 
 * @author 51xiaodou
 * 
 */
public enum EffectTrend {

	/**
	 * 增高百分比
	 */
	UpPercent, /**
	 * 降低百分比
	 */
	DownPercent,
	/**
	 * 固定百分比
	 */
	FixedPercent,
	/**
	 * 增高数值
	 */
	UpValue,
	/**
	 * 降低数值
	 */
	DownValue, /**
	 * 固定数值
	 */
	FixedValue;

	EffectTrend() {
		EnumManager.regist(this);
	}

}
