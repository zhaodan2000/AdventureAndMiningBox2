package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 阵容
 * 
 * @author 51xiaodou
 * 
 */
public enum LineUp {

	/**
	 * 敌军
	 */
	Enemy, /**
	 * 我军
	 */
	OurArmy;

	LineUp() {
		EnumManager.regist(this);
	}

}
