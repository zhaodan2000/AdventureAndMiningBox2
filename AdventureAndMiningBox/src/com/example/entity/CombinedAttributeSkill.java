package com.example.entity;

import java.util.ArrayList;

/**
 * @author yi 组合属性技能
 */
public class CombinedAttributeSkill extends SkillEntity {

	int fast;
	int defense;
	int dodge;
	int king;
	
	/**
	 * 限制条件
	 */
	ArrayList<HeroEntity> limitList = new ArrayList<HeroEntity>();

	public CombinedAttributeSkill(String skillName, int fast, int defense,
			int dodge, int king) {
		super(skillName);
		this.fast = fast;
		this.defense = defense;
		this.dodge = dodge;
		this.king = king;
	}
	
	/**
	 * 多个英雄组合触发技能，这里是需要的英雄
	 * @param heroArr
	 */
	public void setLimit(HeroEntity[] heroArr){
		for (HeroEntity heroEntity : heroArr) {
			limitList.add(heroEntity);
		}
	}

	public int getFast() {
		return fast;
	}

	public void setFast(int fast) {
		this.fast = fast;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getDodge() {
		return dodge;
	}

	public void setDodge(int dodge) {
		this.dodge = dodge;
	}

	public int getKing() {
		return king;
	}

	public void setKing(int king) {
		this.king = king;
	}

	public ArrayList<HeroEntity> getLimitList() {
		return limitList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defense;
		result = prime * result + dodge;
		result = prime * result + fast;
		result = prime * result + king;
		result = prime * result + ((limitList == null) ? 0 : limitList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CombinedAttributeSkill other = (CombinedAttributeSkill) obj;
		if (defense != other.defense)
			return false;
		if (dodge != other.dodge)
			return false;
		if (fast != other.fast)
			return false;
		if (king != other.king)
			return false;
		if (limitList == null) {
			if (other.limitList != null)
				return false;
		} else if (!limitList.equals(other.limitList))
			return false;
		return true;
	}
	
	

}
