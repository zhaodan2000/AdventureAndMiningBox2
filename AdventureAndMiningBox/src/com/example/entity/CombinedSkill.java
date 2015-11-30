package com.example.entity;

import java.util.ArrayList;

/**
 * @author yi 组合技能(伤害，恢复)
 */
public class CombinedSkill extends SkillEntity {

	int probability;

	/**
	 * 如果是主动技能，则分为1优质、2劣质,如果type为-1，则这个主动技能无法判断优劣
	 */
	int type = -1;
	
	/**
	 * 是否是可靠的主动技能,默认可靠
	 * 如果是3受血量限制技能、4只发动一次的技能，则不可靠
	 */
	boolean isReliable = true;
	
	/**
	 * 限制条件
	 */
	ArrayList<HeroEntity> limitList = new ArrayList<HeroEntity>();

	/**
	 * @param skillName 技能名称
	 * @param probability 技能概率
	 */
	public CombinedSkill(String skillName, int probability) {
		super(skillName);
		this.probability = probability;
	}

	/**
	 * @param skillName 技能名称
	 * @param probability 技能概率
	 * @param type 如果是主动技能，则分为1优质、2劣质,如果type为-1，则这个主动技能无法判断优劣
	 */
	public CombinedSkill(String skillName, int probability, int type) {
		super(skillName);
		this.probability = probability;
		this.type = type;
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
	
	public boolean isReliable() {
		return isReliable;
	}

	public void setReliable(boolean isReliable) {
		this.isReliable = isReliable;
	}

	public ArrayList<HeroEntity> getLimitList() {
		return limitList;
	}

	/**
	 * @param skillName 技能名称
	 * @param probability 技能概率
	 * @param type 如果是主动技能，则分为1优质、2劣质,如果type为-1，则这个主动技能无法判断优劣
	 * @param isReliable 、3受血量限制技能、4只发动一次的技能、5受回合限制的技能为不可靠，置false
	 */
	public CombinedSkill(String skillName, int probability, int type, boolean isReliable) {
		super(skillName);
		this.probability = probability;
		this.type = type;
		this.isReliable = isReliable;
	}

	public int getProbability() {
		return probability;
	}

	public void setProbability(int probability) {
		this.probability = probability;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isReliable ? 1231 : 1237);
		result = prime * result + probability;
		result = prime * result + type;
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
		CombinedSkill other = (CombinedSkill) obj;
		if (isReliable != other.isReliable)
			return false;
		if (probability != other.probability)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	

}
