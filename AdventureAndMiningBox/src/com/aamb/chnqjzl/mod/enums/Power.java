package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 称谓
 * 
 * @author 51xiaodou
 * 
 */
public enum Power {
	/**
	 * 海贼
	 */
	Pirates("海贼"),
	/**
	 * 大领主
	 */
	Lord("大领主"),
	/**
	 * 坐骑
	 */
	Mount("坐骑"),
	/**
	 * 动物
	 */
	Animal("动物");
	Power(String name) {
		this.name = name;
		EnumManager.regist(this);
	}

	private String name;

	public String getName() {
		return name;
	}
}