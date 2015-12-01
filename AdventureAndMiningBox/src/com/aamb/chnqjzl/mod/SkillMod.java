package com.aamb.chnqjzl.mod;

import java.util.ArrayList;
import java.util.List;

import com.aamb.chnqjzl.mod.condition.PreCondition;
import com.aamb.chnqjzl.mod.effect.Effection;
import com.aamb.chnqjzl.mod.enums.Relation;
import com.aamb.chnqjzl.mod.enums.SkillType;
import com.aamb.chnqjzl.util.EnumManager;

/**
 * 技能模型
 * 
 * @author 51xiaodou
 * 
 */
public class SkillMod {

	/**
	 * 技能类型
	 */
	private SkillType type;
	/**
	 * 先攻
	 */
	private Integer firstStrike;
	/**
	 * 防御
	 */
	private Integer defense;
	/**
	 * 闪避
	 */
	private Integer dodge;
	/**
	 * 王者
	 */
	private Integer king;
	/**
	 * 触发条件
	 */
	private List<PreCondition> preConditionList = new ArrayList<PreCondition>();
	/**
	 * 后续影响
	 */
	private List<Effection> effectionList = new ArrayList<Effection>();
	/**
	 * 触发条件关系
	 */
	private Relation preConditionRelation;
	/**
	 * 后续影响关系
	 */
	private Relation effectRelation;
	/**
	 * 触发比例
	 */
	private Double touchProbability;
	/**
	 * 发动效果比例
	 */
	private Double effectProbability;

	public SkillType getType() {
		return type;
	}

	public void setType(SkillType type) {
		this.type = type;
	}

	public void setType(String type) {
		setType(EnumManager.getEnum(SkillType.class, type));
	}

	public Integer getFirstStrike() {
		return firstStrike;
	}

	public void setFirstStrike(Integer firstStrike) {
		this.firstStrike = firstStrike;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getDodge() {
		return dodge;
	}

	public void setDodge(Integer dodge) {
		this.dodge = dodge;
	}

	public Integer getKing() {
		return king;
	}

	public void setKing(Integer king) {
		this.king = king;
	}

	public Double getTouchProbability() {
		return touchProbability;
	}

	public void setTouchProbability(Double touchProbability) {
		this.touchProbability = touchProbability;
	}

	public Double getEffectProbability() {
		return effectProbability;
	}

	public void setEffectProbability(Double effectProbability) {
		this.effectProbability = effectProbability;
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

}