package com.example.adventureandminingcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AttributeMixActivity extends Activity {
	
	int fast;
	int defense;
	int dodge;
	int king;
	
	private TextView fastMix;
	private TextView defenseMix;
	private TextView dodgeMix;
	private TextView kingMix;
	private TextView fastPlus;
	private TextView defensePlus;
	private TextView dodgePlus;
	private TextView kingPlus;
	private TextView fastAndKingPlus;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.attribute_mix_activity);
		getDate();
		initView();
		setAttributeView();
		
		
	}
	
	private void getDate(){
		fast = Integer.parseInt(getIntent().getStringExtra("fast"));
		defense = Integer.parseInt(getIntent().getStringExtra("defense"));
		dodge = Integer.parseInt(getIntent().getStringExtra("dodge"));
		king = Integer.parseInt(getIntent().getStringExtra("king"));
		
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

}
