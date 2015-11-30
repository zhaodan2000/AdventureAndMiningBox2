package com.example.entity;

/**
 * @author yi 伤害\恢复组合技能
 */
public class NormalAttributeSkill extends SkillEntity {

	int fast;
	int defense;
	int dodge;
	int king;

	public NormalAttributeSkill(String skillName, int fast, int defense,
			int dodge, int king) {
		super(skillName);
		this.fast = fast;
		this.defense = defense;
		this.dodge = dodge;
		this.king = king;
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
	
	

}
