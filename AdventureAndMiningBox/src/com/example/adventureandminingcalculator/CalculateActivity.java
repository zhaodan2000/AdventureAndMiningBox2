package com.example.adventureandminingcalculator;

import java.util.HashSet;

import com.example.entity.CombinedAttributeSkill;
import com.example.entity.CombinedSkill;
import com.example.entity.DateTemp;
import com.example.entity.HeroEntity;
import com.example.entity.NormalAttributeSkill;
import com.example.entity.NormalSkill;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class CalculateActivity extends Activity {

	private TextView fastMix;
	private TextView defenseMix;
	private TextView dodgeMix;
	private TextView kingMix;
	private TextView fastPlus;
	private TextView defensePlus;
	private TextView dodgePlus;
	private TextView kingPlus;
	private TextView fastAndKingPlus;

	private TextView probabilityMix;
	private TextView badMix;
	private TextView goodMix;
	private TextView reliableMix;

	private int fast = 0;
	private int defense = 0;
	private int dodge = 0;
	private int king = 0;

	/**
	 * 劣质技能的概率
	 */
	private int badSkill = 0;

	/**
	 * 优质技能的概率
	 */
	private int goodSkill = 0;

	/**
	 * 主动技能总概率
	 */
	private int probability = 0;

	/**
	 * 可靠技能概率，意味着这些技能既不是只发动一次，也不是有血量限制的
	 */
	private int reliable = 0;

	// 1、闪避几率=闪避/(100+闪避)*100%
	// 2、伤害减免={1-(防御/(防御+100))}*100%
	// 3、伤害提升=1+王者*0.01
	// 4、恢复提升=1+闪避*0.005
	// 5、基础伤害=最大战力*0.2+当前战力*0.1
	// 6、暴击伤害=基础伤害*(1+先攻*0.005)*对方伤害减免*伤害提升
	// 7、纯粹伤害=基础伤害*伤害提升
	// 注1：计算结果向上取整。
	// 注2：公式中的王者等级并非玩家面板中的数值，应为己方王者等级与对方王者等级之差。即，当我方王者等级大于等于对方时，该值=(我方王者-对方王者)；
	// 当我方王者低于对方时，该值=0

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculate_activity);

		initView();

		calculateAttribute();
		calculateSkill();
		calculateCombinedAttributeSkill();
		calculateCombinedSkill();

		setAttributeView();
		setSkillView();
	}

	private void initView() {
		fastMix = (TextView) findViewById(R.id.fastMix);
		defenseMix = (TextView) findViewById(R.id.defenseMix);
		dodgeMix = (TextView) findViewById(R.id.dodgeMix);
		kingMix = (TextView) findViewById(R.id.kingMix);
		fastPlus = (TextView) findViewById(R.id.fastPlus);
		defensePlus = (TextView) findViewById(R.id.defensePlus);
		dodgePlus = (TextView) findViewById(R.id.dodgePlus);
		kingPlus = (TextView) findViewById(R.id.kingPlus);
		fastAndKingPlus = (TextView) findViewById(R.id.fastAndKingPlus);

		probabilityMix = (TextView) findViewById(R.id.probabilityMix);
		badMix = (TextView) findViewById(R.id.badMix);
		goodMix = (TextView) findViewById(R.id.goodMix);
		reliableMix = (TextView) findViewById(R.id.reliableMix);

	}

	/**
	 * 一般属性技能的计算
	 */
	private void calculateAttribute() {

		for (HeroEntity hero : DateTemp.heroList)
			for (NormalAttributeSkill skill : hero.getNormalAttributeSkill()) {
				fast += skill.getFast() * hero.getNum();
				defense += skill.getDefense() * hero.getNum();
				dodge += skill.getDodge() * hero.getNum();
				king += skill.getKing() * hero.getNum();
			}

	}

	/**
	 * 一般主动技能的计算
	 */
	private void calculateSkill() {
		for (HeroEntity hero : DateTemp.heroList)
			for (NormalSkill skill : hero.getNormalSkill()) {

				probability += skill.getProbability() * hero.getNum();
				
				if (skill.isReliable()) {
					reliable += skill.getProbability() * hero.getNum();
				}

				switch (skill.getType()) {
				case 1:
					goodSkill += skill.getProbability() * hero.getNum();
					break;
				case 2:
					badSkill += skill.getProbability() * hero.getNum();
					break;

				default:
					break;
				}
			}
	}

	/**
	 * 组合属性技能的计算
	 */
	private void calculateCombinedAttributeSkill() {
		
		for (HeroEntity hero : DateTemp.heroList)
			for (CombinedAttributeSkill skill : hero.getCombinedAttributeSkill()) {
				if (!isComplete(skill))
					return;
				
				fast += skill.getFast() * hero.getNum();
				defense += skill.getDefense() * hero.getNum();
				dodge += skill.getDodge() * hero.getNum();
				king += skill.getKing() * hero.getNum();
			}
	}

	/**
	 * 组合主动技能的计算
	 */
	private void calculateCombinedSkill() {
	}
	
	/**
	 * 是否满足触发组合技能的条件
	 * @return
	 */
	private boolean isComplete(CombinedSkill skill){
		
		for (HeroEntity hero : DateTemp.heroList)
			for (CombinedSkill coskill : hero.getCombinedSkill()) {
				coskill.getLimitList();
			}
		
		return false;
	}
	
	/**
	 * 是否满足触发组合技能的条件
	 * @return
	 */
	private boolean isComplete(CombinedAttributeSkill skill){
		
		return false;
	}
	
	HashSet<CombinedAttributeSkill> alist = new HashSet<CombinedAttributeSkill>();
	HashSet<CombinedSkill> nlist = new HashSet<CombinedSkill>();
	
	/**
	 * 如果一个组合技能是有效的，将它添加至一个列表中，避免直接相加导致多次计算
	 */
	private void addToCombinedAttributeSkillList(CombinedAttributeSkill skill){
		alist.add(skill);
	}
	
	/**
	 * 如果一个组合技能是有效的，将它添加至一个列表中，避免直接相加导致多次计算
	 */
	private void addToCombinedSkillList(CombinedSkill skill){
		nlist.add(skill);
	}

	/**
	 * 为属性view填充数据
	 */
	private void setAttributeView() {
		fastMix.setText(fast + "");
		defenseMix.setText(defense + "");
		dodgeMix.setText(dodge + "");
		kingMix.setText(king + "");

		int fastPlusNum = (int) (fast * 0.5);
		fastPlus.setText(fastPlusNum + "");
		int defensePlusNum = (int) (((double) defense / ((double) defense + 100)) * 100);
		defensePlus.setText(defensePlusNum + "");
		int dodgePlusNum = (int) (((dodge + 0.0) / ((dodge + 0.0) + 100)) * 100);
		dodgePlus.setText(dodgePlusNum + "");
		int kingPlusNum = king;
		kingPlus.setText(kingPlusNum + "");
		int fastAndKingPlusNum = (int) ((100.0 + kingPlusNum) * (100.0 + fastPlusNum) / 100 - 100);
		fastAndKingPlus.setText(fastAndKingPlusNum + "");
	}

	/**
	 * 为技能的view填充数据
	 */
	private void setSkillView() {
		probabilityMix.setText(probability + "");
		reliableMix.setText(reliable + "");
		badMix.setText(badSkill + "");
		goodMix.setText(goodSkill + "");
	}

}
