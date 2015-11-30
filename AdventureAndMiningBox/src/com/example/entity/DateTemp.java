package com.example.entity;

import java.util.ArrayList;

public class DateTemp {

	public static ArrayList<HeroEntity> heroList = new ArrayList<HeroEntity>();

	public static void init() {
		NormalSkill dayanfahua = new NormalSkill("大炎法华", 15);
		HeroEntity mohuaxingchang = new HeroEntity(1, "魔化信长", dayanfahua);
		heroList.add(mohuaxingchang);

		NormalSkill daoshouling = new NormalSkill("刀狩令", 3, 1);
		HeroEntity fengchengxiuji = new HeroEntity(1, "丰臣秀吉", daoshouling);
		heroList.add(fengchengxiuji);

		NormalAttributeSkill keaijizhengyi = new NormalAttributeSkill("可爱即正义", 4, 4, 0, 3);
		CombinedAttributeSkill mengguanghuan = new CombinedAttributeSkill("萌光环", 8, 8, 0, 8);
		HeroEntity xiaobei = new HeroEntity(1, "小北", keaijizhengyi, mengguanghuan);
		heroList.add(xiaobei);

		NormalSkill jinkela = new NormalSkill("金坷垃", 4, 1);
		CombinedSkill muchanyiqianba = new CombinedSkill("亩产一千八", 5, 1, false);
		HeroEntity lala = new HeroEntity(1, "垃垃", jinkela, muchanyiqianba);
		heroList.add(lala);

		NormalSkill bengyue = new NormalSkill("奔月", 15, 1, false);
		HeroEntity change = new HeroEntity(2, "嫦娥", bengyue);
		heroList.add(change);

		NormalAttributeSkill zoudanqi = new NormalAttributeSkill("走单骑", 8, 4, 0, -3);
		HeroEntity guanyu = new HeroEntity(3, "关羽", zoudanqi);
		heroList.add(guanyu);
		
		NormalSkill moriranshao = new NormalSkill("末日燃烧", 13,2);
		HeroEntity luxifa = new HeroEntity(3, "路西法", moriranshao);
		heroList.add(luxifa);

		NormalAttributeSkill mengjingliangyi = new NormalAttributeSkill("梦境两仪", 0, 0, 7, 0);
		HeroEntity zuozuomuxiaocilang = new HeroEntity(4, "佐佐木小次郎", mengjingliangyi);
		heroList.add(zuozuomuxiaocilang);

	}

}
