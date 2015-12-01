package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 卡牌类型枚举
 * 
 * @author 51xiaodou
 * 
 */
public enum CardType {
	/**
	 * 闪金卡
	 */
	FlashGold("闪金卡"), /**
	 * 金卡
	 */
	Gold("金卡"), /**
	 * 紫卡
	 */
	Violet("紫卡"), /**
	 * 蓝卡
	 */
	Blue("蓝卡"), /**
	 * 绿卡
	 */
	Green("绿卡"), /**
	 * 白卡
	 */
	White("白卡");
	CardType(String name) {
		this.name = name;
		EnumManager.regist(this);
	}

	private String name;

	public String getName() {
		return name;
	}

}