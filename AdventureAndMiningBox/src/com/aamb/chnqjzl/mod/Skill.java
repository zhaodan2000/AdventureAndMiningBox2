package com.aamb.chnqjzl.mod;

import java.util.ArrayList;
import java.util.List;

import com.aamb.chnqjzl.mod.condition.PreCondition;
import com.aamb.chnqjzl.mod.effect.Effection;
import com.aamb.chnqjzl.mod.enums.Relation;
import com.aamb.chnqjzl.util.EnumManager;

/**
 * 英雄技能
 * 
 * @author 51xiaodou
 * 
 */
public class Skill {

	/**
	 * 主键ID
	 */
	private String id;
	/**
	 * 技能名称
	 */
	private String name;
	/**
	 * 技能模型列表
	 */
	private List<SkillMod> skillMods = new ArrayList<SkillMod>();
	/**
	 * 触发条件
	 */
	private List<PreCondition> preConditionList = new ArrayList<PreCondition>();
	/**
	 * 后续影响
	 */
	private List<Effection> effectionList = new ArrayList<Effection>();
	/**
	 * 技能模型关系
	 */
	private Relation skillModRelation;
	/**
	 * 触发条件关系
	 */
	private Relation preConditionRelation;
	/**
	 * 后续影响关系
	 */
	private Relation effectRelation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PreCondition> getPreConditionList() {
		return preConditionList;
	}

	public void setPreConditionList(List<PreCondition> preConditionList) {
		this.preConditionList = preConditionList;
	}

	public void addPreCondition(PreCondition preCondition) {
		this.preConditionList.add(preCondition);
	}

	public List<Effection> getEffectionList() {
		return effectionList;
	}

	public void setEffectionList(List<Effection> effectionList) {
		this.effectionList = effectionList;
	}

	public void addEffection(Effection effection) {
		this.effectionList.add(effection);
	}

	public Relation getPreConditionRelation() {
		return preConditionRelation;
	}

	public void setPreConditionRelation(Relation preConditionRelation) {
		this.preConditionRelation = preConditionRelation;
	}

	public void setPreConditionRelation(String preConditionRelation) {
		setPreConditionRelation(EnumManager.getEnum(Relation.class, preConditionRelation));
	}

	public Relation getEffectRelation() {
		return effectRelation;
	}

	public void setEffectRelation(Relation effectRelation) {
		this.effectRelation = effectRelation;
	}

	public void setEffectRelation(String effectRelation) {
		setEffectRelation(EnumManager.getEnum(Relation.class, effectRelation));
	}

	public List<SkillMod> getSkillMods() {
		return skillMods;
	}

	public void setSkillMods(List<SkillMod> skillMods) {
		this.skillMods = skillMods;
	}

	public void addSkillMod(SkillMod skillMod) {
		this.skillMods.add(skillMod);
	}

	public Relation getSkillModRelation() {
		return skillModRelation;
	}

	public void setSkillModRelation(Relation skillModRelation) {
		this.skillModRelation = skillModRelation;
	}

	public void setSkillModRelation(String skillModRelation) {
		this.skillModRelation = EnumManager.getEnum(Relation.class, skillModRelation);
	}

}
