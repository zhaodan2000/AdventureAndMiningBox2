package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class HeroEntity {

	// 1 闪金 ，2金，3，紫，4 蓝
	private int color;
	private String name;
	// 出战数量，默认为0
	public int num = 0;

	// 技能列表
	private List<SkillEntity> skillList = new ArrayList<SkillEntity>();

	public HeroEntity(int color, String name) {
		super();
		this.color = color;
		this.name = name;
	}

	public HeroEntity(int color, String name, SkillEntity skill1) {
		super();
		this.color = color;
		this.name = name;
		this.skillList.add(skill1);
	}

	/**
	 * 获得该英雄一般主动技能的列表
	 * 
	 * @return
	 */
	public List<NormalSkill> getNormalSkill() {
		List<NormalSkill> list = new ArrayList<NormalSkill>();
		for (SkillEntity skill : skillList) {
			if (skill instanceof NormalSkill) {
				list.add((NormalSkill) skill);
			}
		}

		return list;
	}

	/**
	 * 获得该英雄一般被动技能的列表
	 * 
	 * @return
	 */
	public List<NormalAttributeSkill> getNormalAttributeSkill() {
		List<NormalAttributeSkill> list = new ArrayList<NormalAttributeSkill>();
		for (SkillEntity skill : skillList) {
			if (skill instanceof NormalAttributeSkill) {
				list.add((NormalAttributeSkill) skill);
			}
		}

		return list;
	}

	/**
	 * 获得该英雄组合主动技能的列表
	 * 
	 * @return
	 */
	public List<CombinedSkill> getCombinedSkill() {
		List<CombinedSkill> list = new ArrayList<CombinedSkill>();
		for (SkillEntity skill : skillList) {
			if (skill instanceof CombinedSkill) {
				list.add((CombinedSkill) skill);
			}
		}

		return list;
	}

	/**
	 * 获得该英雄组合被动技能的列表
	 * 
	 * @return
	 */
	public List<CombinedAttributeSkill> getCombinedAttributeSkill() {
		List<CombinedAttributeSkill> list = new ArrayList<CombinedAttributeSkill>();
		for (SkillEntity skill : skillList) {
			if (skill instanceof CombinedAttributeSkill) {
				list.add((CombinedAttributeSkill) skill);
			}
		}

		return list;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public HeroEntity(int color, String name, SkillEntity skill1, SkillEntity skill2) {
		super();
		this.color = color;
		this.name = name;
		this.skillList.add(skill1);
		this.skillList.add(skill2);
	}

	public HeroEntity(int color, String name, SkillEntity skill1, SkillEntity skill2, SkillEntity skill3) {
		super();
		this.color = color;
		this.name = name;
		this.skillList.add(skill1);
		this.skillList.add(skill2);
		this.skillList.add(skill3);
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SkillEntity> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<SkillEntity> skillList) {
		this.skillList = skillList;
	}

}
