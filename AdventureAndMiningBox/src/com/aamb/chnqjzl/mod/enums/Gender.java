package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 性别
 * 
 * @author 51xiaodou
 * 
 */
public enum Gender {
	Man("男"), Woman("女");
	Gender(String name) {
		this.name = name;
		EnumManager.regist(this);
	}

	private String name;

	public String getName() {
		return name;
	}
}