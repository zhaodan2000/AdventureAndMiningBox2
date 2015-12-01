package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 影响回合数
 * 
 * @author 51xiaodou
 * 
 */
public enum EffectRound {

	/**
	 * 只发动一次
	 */
	Once, /**
	 * 永久发动
	 */
	Forever;

	EffectRound() {
		EnumManager.regist(this);
	}

}
