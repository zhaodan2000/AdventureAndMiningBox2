package com.aamb.chnqjzl.mod.effect;

import com.aamb.chnqjzl.mod.enums.EffectRound;
import com.aamb.chnqjzl.mod.enums.EffectTrend;
import com.aamb.chnqjzl.mod.enums.TargetType;
import com.aamb.chnqjzl.util.EnumManager;

/**
 * 技能后续影响
 * 
 * @author 51xiaodou
 * 
 */
public class Effection {

	/**
	 * 目标类型
	 */
	private TargetType effectType;
	/**
	 * 影响回合数
	 */
	private EffectRound effectRound;
	/**
	 * 影响趋势
	 */
	private EffectTrend effectTrend;
	/**
	 * 影响值
	 */
	private Double effectValue;

	public TargetType getEffectType() {
		return effectType;
	}

	public void setEffectType(TargetType effectType) {
		this.effectType = effectType;
	}

	public void setEffectType(String conditionType) {
		setEffectType(EnumManager.getEnum(TargetType.class, conditionType));
	}

	public EffectRound getEffectRound() {
		return effectRound;
	}

	public void setEffectRound(EffectRound effectRound) {
		this.effectRound = effectRound;
	}

	public void setEffectRound(String effectRound) {
		setEffectRound(EnumManager.getEnum(EffectRound.class, effectRound));
	}

	public EffectTrend getEffectTrend() {
		return effectTrend;
	}

	public void setEffectTrend(EffectTrend effectTrend) {
		this.effectTrend = effectTrend;
	}

	public void setEffectTrend(String effectTrend) {
		setEffectTrend(EnumManager.getEnum(EffectTrend.class, effectTrend));
	}

	public Double getEffectValue() {
		return effectValue;
	}

	public void setEffectValue(Double effectValue) {
		this.effectValue = effectValue;
	}

}
