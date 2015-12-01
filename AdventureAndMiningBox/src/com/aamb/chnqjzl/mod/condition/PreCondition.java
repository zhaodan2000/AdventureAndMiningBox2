package com.aamb.chnqjzl.mod.condition;

import com.aamb.chnqjzl.mod.enums.AttackResult;
import com.aamb.chnqjzl.mod.enums.LineUp;
import com.aamb.chnqjzl.mod.enums.Scope;
import com.aamb.chnqjzl.mod.enums.TargetCompare;
import com.aamb.chnqjzl.mod.enums.TargetType;
import com.aamb.chnqjzl.util.EnumManager;

/**
 * 前置条件
 * 
 * @author 51xiaodou
 * 
 */
public class PreCondition {

	/**
	 * 目标类型
	 */
	private TargetType conditionType;
	/**
	 * 条件阵容方
	 */
	private LineUp lineUp;
	/**
	 * 比较条件
	 */
	private Scope scope;
	/**
	 * 比较目标
	 */
	private TargetCompare targetCompare;
	/**
	 * 比较阈值
	 */
	private Integer threshold;
	/**
	 * 攻击结果
	 */
	private AttackResult attackResult;

	public TargetCompare getTargetCompare() {
		return targetCompare;
	}

	public void setTargetCompare(TargetCompare targetCompare) {
		this.targetCompare = targetCompare;
	}

	public void setTargetCompare(String targetCompare) {
		setTargetCompare(EnumManager.getEnum(TargetCompare.class, targetCompare));
	}

	public TargetType getConditionType() {
		return conditionType;
	}

	public void setConditionType(TargetType conditionType) {
		this.conditionType = conditionType;
	}

	public void setConditionType(String conditionType) {
		setConditionType(EnumManager.getEnum(TargetType.class, conditionType));
	}

	public LineUp getLineUp() {
		return lineUp;
	}

	public void setLineUp(LineUp lineUp) {
		this.lineUp = lineUp;
	}

	public void setLineUp(String lineUp) {
		setLineUp(EnumManager.getEnum(LineUp.class, lineUp));
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public void setScope(String scope) {
		setScope(EnumManager.getEnum(Scope.class, scope));
	}

	public Integer getThreshold() {
		return threshold;
	}

	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}

	public AttackResult getAttackResult() {
		return attackResult;
	}

	public void setAttackResult(AttackResult attackResult) {
		this.attackResult = attackResult;
	}

	public void setAttackResult(String attackResult) {
		setAttackResult(EnumManager.getEnum(AttackResult.class, attackResult));
	}

}
