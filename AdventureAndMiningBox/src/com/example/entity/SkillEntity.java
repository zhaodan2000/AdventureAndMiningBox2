package com.example.entity;

/**
 * @author yi
 *         ���Ǽ��ܵ�ʵ���࣬���ֳܷɣ����ˣ����ʣ����ʣ������������ʣ����ʣ����������ָ������ʣ����ʣ������Լ��ܡ������˺������б�����벻������
 * 
 */
public class SkillEntity {

	private String skillName;

	// �����Ƿ���Ч��Ĭ����Ч
	private boolean isValid = true;

	// �Ƿ�����ϼ��ܣ���ϼ��ܼ��㷽ʽ��һ�㼼�ܲ�ͬ��Ϊ�ܸ���֮�������㣬����������ʱδ֪
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
