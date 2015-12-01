package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 种族
 * 
 * @author 51xiaodou
 * 
 */
public enum Race {
	/**
	 * 半魔族
	 */
	HalfDemon("半魔族"), /**
	 * 人类
	 */
	Human("人类"), /**
	 * 咴
	 */
	Gallop("咴"), /**
	 * 超能力者
	 */
	SuperCapacity("超能力者"), /**
	 * 魔神
	 */
	TheDevil("魔神"), /**
	 * 泰坦
	 */
	TheTitans("泰坦"), /**
	 * 英灵
	 */
	TheSoulsAndSpirits("英灵"), /**
	 * 精灵
	 */
	Spirit("精灵"),
	/**
	 * 戒灵
	 */
	Nazgul("戒灵"), /**
	 * 猴
	 */
	Monkey("猴"), /**
	 * 克隆人
	 */
	HumanCloning("克隆人"), /**
	 * 虚无
	 */
	Nothingness("虚无"), /**
	 * 神族
	 */
	TheProtoss("神族"), /**
	 * 龙
	 */
	Dragon("龙"), /**
	 * 半神族
	 */
	HalfOfTheProtoss("半神族"), /**
	 * 魔族
	 */
	Inferno("魔族"), /**
	 * 豆
	 */
	Beans("豆"), /**
	 * 元素生物
	 */
	Elementals("元素生物"), /**
	 * 仙
	 */
	Immortal("仙"), /**
	 * 永恒
	 */
	Eternal("永恒"), /**
	 * 夜兔族
	 */
	NightRabbitFamily("夜兔族"), /**
	 * 半身人
	 */
	Halflings("半身人"), /**
	 * 外星人
	 */
	Aliens("外星人"), /**
	 * 天使
	 */
	Angels("天使"), /**
	 * 妖精
	 */
	Fairies("妖精"), /**
	 * 机器人
	 */
	Robot("机器人"), /**
	 * 熊族
	 */
	BearFamily("熊族"), /**
	 * 机械
	 */
	Mechanical("机械"), /**
	 * 昆虫
	 */
	Insects("昆虫"), /**
	 * 光之族
	 */
	TheFamilyOfLight("光之族"), /**
	 * 粘液魔
	 */
	MucusMagic("粘液魔"), /**
	 * 魅魔
	 */
	Succubus("魅魔"), /**
	 * 水妖
	 */
	Mermaids("水妖"), /**
	 * 狼星人
	 */
	Sirian("狼星人"), /**
	 * 鸡星人
	 */
	ChickenStar("鸡星人"),
	/**
	 * 树精
	 */
	Treant("树精"), /**
	 * 植物
	 */
	Plants("植物"), /**
	 * 鼠星人
	 */
	InStar("鼠星人"), /**
	 * 喵星人
	 */
	MeowStarPeople("喵星人"), /**
	 * 羊星人
	 */
	SheepStar("羊星人"), /**
	 * 马星人
	 */
	MaPleiadian("马星人"), /**
	 * 牛星人
	 */
	CattlePleiadian("牛星人"), /**
	 * 地精
	 */
	Goblins("地精");
	Race(String name) {
		this.name = name;
		EnumManager.regist(this);
	}

	private String name;

	public String getName() {
		return name;
	}
}