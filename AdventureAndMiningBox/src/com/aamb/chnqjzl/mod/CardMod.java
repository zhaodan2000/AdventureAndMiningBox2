package com.aamb.chnqjzl.mod;

import com.aamb.chnqjzl.mod.enums.CardType;
import com.aamb.chnqjzl.mod.enums.Gender;
import com.aamb.chnqjzl.mod.enums.Power;
import com.aamb.chnqjzl.mod.enums.Race;
import com.aamb.chnqjzl.util.EnumManager;

/**
 * 卡牌模型
 * 
 * @author 51xiaodou
 * 
 */
public class CardMod {

	/**
	 * 卡牌ID
	 */
	private String id;
	/**
	 * 卡牌名称
	 */
	private String name;
	/**
	 * 卡牌品质
	 */
	private CardType cardType;
	/**
	 * 种族
	 */
	private Race race;
	/**
	 * 性别
	 */
	private Gender gender;
	/**
	 * 称谓
	 */
	private Power power;
	/**
	 * 初始战力
	 */
	private Integer initialForce;
	/**
	 * 成长系数
	 */
	private Double growth;
	/**
	 * 个人技能
	 */
	private String personalSkill;
	/**
	 * 合作技能1
	 */
	private String firstCooperSkill;
	/**
	 * 合作技能2
	 */
	private String secondCooperSkill;
	/**
	 * 宝具
	 */
	private String treasure;
	/**
	 * 一阶契约
	 */
	private String firstContract;
	/**
	 * 二阶契约
	 */
	private String secondContract;

	public Power getPower() {
		return power;
	}

	public void setPower(Power power) {
		this.power = power;
	}

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

	public CardType getCardTypeEnum() {
		return cardType;
	}

	public String getCardType() {
		return cardType.toString();
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = EnumManager.getEnum(CardType.class, cardType);
	}

	public Race getRaceEnum() {
		return race;
	}

	public String getRace() {
		return race.toString();
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public void setRace(String race) {
		this.race = EnumManager.getEnum(Race.class, race);
	}

	public Gender getGenderEnum() {
		return gender;
	}

	public String getGender() {
		return gender.toString();
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setGender(String gender) {
		this.gender = EnumManager.getEnum(Gender.class, gender);
	}

	public Integer getInitialForce() {
		return initialForce;
	}

	public void setInitialForce(Integer initialForce) {
		this.initialForce = initialForce;
	}

	public Double getGrowth() {
		return growth;
	}

	public void setGrowth(Double growth) {
		this.growth = growth;
	}

	public String getPersonalSkill() {
		return personalSkill;
	}

	public void setPersonalSkill(String personalSkill) {
		this.personalSkill = personalSkill;
	}

	public String getFirstCooperSkill() {
		return firstCooperSkill;
	}

	public void setFirstCooperSkill(String firstCooperSkill) {
		this.firstCooperSkill = firstCooperSkill;
	}

	public String getSecondCooperSkill() {
		return secondCooperSkill;
	}

	public void setSecondCooperSkill(String secondCooperSkill) {
		this.secondCooperSkill = secondCooperSkill;
	}

	public String getTreasure() {
		return treasure;
	}

	public void setTreasure(String treasure) {
		this.treasure = treasure;
	}

	public String getFirstContract() {
		return firstContract;
	}

	public void setFirstContract(String firstContract) {
		this.firstContract = firstContract;
	}

	public String getSecondContract() {
		return secondContract;
	}

	public void setSecondContract(String secondContract) {
		this.secondContract = secondContract;
	}

}