package com.example.entity;

import java.util.ArrayList;

public class DateTemp {

	public static ArrayList<HeroEntity> heroList = new ArrayList<HeroEntity>();

	public static void init() {
		NormalSkill dayanfahua = new NormalSkill("���׷���", 15);
		HeroEntity mohuaxingchang = new HeroEntity(1, "ħ���ų�", dayanfahua);
		heroList.add(mohuaxingchang);

		NormalSkill daoshouling = new NormalSkill("������", 3, 1);
		HeroEntity fengchengxiuji = new HeroEntity(1, "�᳼�㼪", daoshouling);
		heroList.add(fengchengxiuji);

		NormalAttributeSkill keaijizhengyi = new NormalAttributeSkill("�ɰ�������", 4, 4, 0, 3);
		CombinedAttributeSkill mengguanghuan = new CombinedAttributeSkill("�ȹ⻷", 8, 8, 0, 8);
		HeroEntity xiaobei = new HeroEntity(1, "С��", keaijizhengyi, mengguanghuan);
		heroList.add(xiaobei);

		NormalSkill jinkela = new NormalSkill("�����", 4, 1);
		CombinedSkill muchanyiqianba = new CombinedSkill("Ķ��һǧ��", 5, 1, false);
		HeroEntity lala = new HeroEntity(1, "����", jinkela, muchanyiqianba);
		heroList.add(lala);

		NormalSkill bengyue = new NormalSkill("����", 15, 1, false);
		HeroEntity change = new HeroEntity(2, "�϶�", bengyue);
		heroList.add(change);

		NormalAttributeSkill zoudanqi = new NormalAttributeSkill("�ߵ���", 8, 4, 0, -3);
		HeroEntity guanyu = new HeroEntity(3, "����", zoudanqi);
		heroList.add(guanyu);
		
		NormalSkill moriranshao = new NormalSkill("ĩ��ȼ��", 13,2);
		HeroEntity luxifa = new HeroEntity(3, "·����", moriranshao);
		heroList.add(luxifa);

		NormalAttributeSkill mengjingliangyi = new NormalAttributeSkill("�ξ�����", 0, 0, 7, 0);
		HeroEntity zuozuomuxiaocilang = new HeroEntity(4, "����ľС����", mengjingliangyi);
		heroList.add(zuozuomuxiaocilang);

	}

}
