package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 模型关系
 * 
 * @author 51xiaodou
 * 
 */
public enum Relation {

	And, Or;
	Relation() {
		EnumManager.regist(this);
	}

}
