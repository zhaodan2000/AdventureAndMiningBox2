package com.example.entity;

/**
 * @author yi 正常伤害技能
 */
public class NormalSkill extends SkillEntity {

	int probability;
	
	/**
	 * 如果是主动技能，则分为1优质、2劣质、3受血量限制技能、4只发动一次的技能、5受回合限制的技能,如果type为-1，则这个主动技能无法判断优劣
	 */
	int type = -1;
	
	/**
	 * 是否是可靠的主动技能,默认可靠
	 * 如果是3受血量限制技能、4只发动一次的技能，则不可靠
	 */
	boolean isReliable = true;

	/**
	 * @param skillName 技能名称
	 * @param probability 技能概率
	 */
	public NormalSkill(String skillName, int probability) {
		super(skillName);
		this.probability = probability;
	}
	
	/**
	 * @param skillName 技能名称
	 * @param probability 技能概率
	 * @param type 如果是主动技能，则分为1优质、2劣质，如果type为-1，则这个主动技能无法判断优劣
	 */
	public NormalSkill(String skillName, int probability,int type) {
		super(skillName);
		this.probability = probability;
		this.type = type;
	}
	
	public NormalSkill(String skillName, int probability, int type, boolean isReliable) {
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

	public boolean isReliable() {
		return isReliable;
	}

	public void setReliable(boolean isReliable) {
		this.isReliable = isReliable;
	}
	
	
	
	
}
