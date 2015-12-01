package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 攻击结果
 * 
 * @author 51xiaodou
 * 
 */
public enum AttackResult {

	/**
	 * 命中
	 */
	Hit, /**
	 * 未命中
	 */
	Miss;

	private AttackResult() {
		EnumManager.regist(this);
	}

}
