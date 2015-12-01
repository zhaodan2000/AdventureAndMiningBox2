package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 目标影响类型
 * 
 * @author 51xiaodou
 * 
 */
public enum TargetType {

	/**
	 * 回合数
	 */
	Round, /**
	 * 生命值
	 */
	HealthPoint, /**
	 * 属性
	 */
	Attrabute, /**
	 * 势力
	 */
	Power, /**
	 * 种族
	 */
	Race, /**
	 * 性别
	 */
	Gender, /**
	 * 上回合效果
	 */
	PreEffect;

	TargetType() {
		EnumManager.regist(this);
	}

}
