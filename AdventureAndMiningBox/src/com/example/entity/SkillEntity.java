package com.example.entity;

/**
 * @author yi
 *         这是技能的实体类，技能分成：高伤（优质，劣质）、暴击（优质，劣质，致死）、恢复（优质，劣质）、属性技能、比例伤害，还有别的吗？想不起来了
 * 
 */
public class SkillEntity {

	private String skillName;

	// 技能是否有效？默认有效
	private boolean isValid = true;

	// 是否是组合技能，组合技能计算方式与一般技能不同，为总概率之外额外计算，触发次序暂时未知
	private boolean isCombined;

	public SkillEntity(String skillName) {
		super();
		this.skillName = skillName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean isCombined() {
		return isCombined;
	}

	public void setCombined(boolean isCombined) {
		this.isCombined = isCombined;
	}

}
