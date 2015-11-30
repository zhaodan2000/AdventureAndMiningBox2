package com.example.entity;

/**
 * @author yi �����˺�����
 */
public class NormalSkill extends SkillEntity {

	int probability;
	
	/**
	 * ������������ܣ����Ϊ1���ʡ�2���ʡ�3��Ѫ�����Ƽ��ܡ�4ֻ����һ�εļ��ܡ�5�ܻغ����Ƶļ���,���typeΪ-1����������������޷��ж�����
	 */
	int type = -1;
	
	/**
	 * �Ƿ��ǿɿ�����������,Ĭ�Ͽɿ�
	 * �����3��Ѫ�����Ƽ��ܡ�4ֻ����һ�εļ��ܣ��򲻿ɿ�
	 */
	boolean isReliable = true;

	/**
	 * @param skillName ��������
	 * @param probability ���ܸ���
	 */
	public NormalSkill(String skillName, int probability) {
		super(skillName);
		this.probability = probability;
	}
	
	/**
	 * @param skillName ��������
	 * @param probability ���ܸ���
	 * @param type ������������ܣ����Ϊ1���ʡ�2���ʣ����typeΪ-1����������������޷��ж�����
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
