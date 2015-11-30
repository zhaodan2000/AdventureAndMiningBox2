package com.example.entity;

import java.util.ArrayList;

/**
 * @author yi ��ϼ���(�˺����ָ�)
 */
public class CombinedSkill extends SkillEntity {

	int probability;

	/**
	 * ������������ܣ����Ϊ1���ʡ�2����,���typeΪ-1����������������޷��ж�����
	 */
	int type = -1;
	
	/**
	 * �Ƿ��ǿɿ�����������,Ĭ�Ͽɿ�
	 * �����3��Ѫ�����Ƽ��ܡ�4ֻ����һ�εļ��ܣ��򲻿ɿ�
	 */
	boolean isReliable = true;
	
	/**
	 * ��������
	 */
	ArrayList<HeroEntity> limitList = new ArrayList<HeroEntity>();

	/**
	 * @param skillName ��������
	 * @param probability ���ܸ���
	 */
	public CombinedSkill(String skillName, int probability) {
		super(skillName);
		this.probability = probability;
	}

	/**
	 * @param skillName ��������
	 * @param probability ���ܸ���
	 * @param type ������������ܣ����Ϊ1���ʡ�2����,���typeΪ-1����������������޷��ж�����
	 */
	public CombinedSkill(String skillName, int probability, int type) {
		super(skillName);
		this.probability = probability;
		this.type = type;
	}
	
	/**
	 * ���Ӣ����ϴ������ܣ���������Ҫ��Ӣ��
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
	 * @param skillName ��������
	 * @param probability ���ܸ���
	 * @param type ������������ܣ����Ϊ1���ʡ�2����,���typeΪ-1����������������޷��ж�����
	 * @param isReliable ��3��Ѫ�����Ƽ��ܡ�4ֻ����һ�εļ��ܡ�5�ܻغ����Ƶļ���Ϊ���ɿ�����false
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
