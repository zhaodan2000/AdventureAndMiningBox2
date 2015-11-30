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
	 * ���ʼ��ܵĸ���
	 */
	private int badSkill = 0;

	/**
	 * ���ʼ��ܵĸ���
	 */
	private int goodSkill = 0;

	/**
	 * ���������ܸ���
	 */
	private int probability = 0;

	/**
	 * �ɿ����ܸ��ʣ���ζ����Щ���ܼȲ���ֻ����һ�Σ�Ҳ������Ѫ�����Ƶ�
	 */
	private int reliable = 0;

	// 1�����ܼ���=����/(100+����)*100%
	// 2���˺�����={1-(����/(����+100))}*100%
	// 3���˺�����=1+����*0.01
	// 4���ָ�����=1+����*0.005
	// 5�������˺�=���ս��*0.2+��ǰս��*0.1
	// 6�������˺�=�����˺�*(1+�ȹ�*0.005)*�Է��˺�����*�˺�����
	// 7�������˺�=�����˺�*�˺�����
	// ע1������������ȡ����
	// ע2����ʽ�е����ߵȼ������������е���ֵ��ӦΪ�������ߵȼ���Է����ߵȼ�֮��������ҷ����ߵȼ����ڵ��ڶԷ�ʱ����ֵ=(�ҷ�����-�Է�����)��
	// ���ҷ����ߵ��ڶԷ�ʱ����ֵ=0

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
	 * һ�����Լ��ܵļ���
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
	 * һ���������ܵļ���
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
	 * ������Լ��ܵļ���
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
	 * ����������ܵļ���
	 */
	private void calculateCombinedSkill() {
	}
	
	/**
	 * �Ƿ����㴥����ϼ��ܵ�����
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
	 * �Ƿ����㴥����ϼ��ܵ�����
	 * @return
	 */
	private boolean isComplete(CombinedAttributeSkill skill){
		
		return false;
	}
	
	HashSet<CombinedAttributeSkill> alist = new HashSet<CombinedAttributeSkill>();
	HashSet<CombinedSkill> nlist = new HashSet<CombinedSkill>();
	
	/**
	 * ���һ����ϼ�������Ч�ģ����������һ���б��У�����ֱ����ӵ��¶�μ���
	 */
	private void addToCombinedAttributeSkillList(CombinedAttributeSkill skill){
		alist.add(skill);
	}
	
	/**
	 * ���һ����ϼ�������Ч�ģ����������һ���б��У�����ֱ����ӵ��¶�μ���
	 */
	private void addToCombinedSkillList(CombinedSkill skill){
		nlist.add(skill);
	}

	/**
	 * Ϊ����view�������
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
	 * Ϊ���ܵ�view�������
	 */
	private void setSkillView() {
		probabilityMix.setText(probability + "");
		reliableMix.setText(reliable + "");
		badMix.setText(badSkill + "");
		goodMix.setText(goodSkill + "");
	}

}
