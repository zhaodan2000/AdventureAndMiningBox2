package com.example.adventureandminingcalculator;

import java.util.ArrayList;

import com.example.entity.DateTemp;
import com.example.entity.HeroEntity;
import com.example.entity.NormalAttributeSkill;
import com.example.entity.NormalSkill;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class LineupActivity extends Activity {

	ListView listView;
	TextView num;
	Button clear;
	Button calculate;

	MyLineupAdapter adapter;

	/**
	 * 这个list是所有英雄的总list，是用来填充列表的数据模板
	 */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lineup_activity);
		DateTemp.init();
		initView();
		initListView();

	}

	private void initView() {
		listView = (ListView) findViewById(R.id.lineup_listview);
		num = (TextView) findViewById(R.id.num);
		clear = (Button) findViewById(R.id.clear);
		calculate = (Button) findViewById(R.id.calculate);

		clear.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				clear();
			}
		});

		calculate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				jump();
			}
		});
	}

	/**
	 * 清空数据
	 */
	private void clear() {
		for (HeroEntity obj : DateTemp.heroList) {
			obj.setNum(0);
		}
	}

	/**
	 * 跳转到计算页面
	 */
	private void jump() {
		startActivity(new Intent(this, CalculateActivity.class));
	}

	private void initListView() {
		adapter = new MyLineupAdapter();
		listView.setAdapter(adapter);

	}

	

	class MyLineupAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return DateTemp.heroList.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return DateTemp.heroList.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@SuppressLint("ViewHolder")
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub

			convertView = LayoutInflater.from(LineupActivity.this).inflate(R.layout.hero_item, null);

			Button cut = (Button) convertView.findViewById(R.id.cut);
			Button add = (Button) convertView.findViewById(R.id.add);
			TextView heroNum = (TextView) convertView.findViewById(R.id.heroNum);
			TextView heroName = (TextView) convertView.findViewById(R.id.heroName);

			heroNum.setText(DateTemp.heroList.get(position).getNum() + "");
			heroName.setText(DateTemp.heroList.get(position).getName());
			// 放置英雄的颜色
			switch (DateTemp.heroList.get(position).getColor()) {
			case 1:
				heroName.setTextColor(Color.parseColor("#eead0e"));
				break;
			case 2:
				heroName.setTextColor(Color.parseColor("#ffff00"));
				break;
			case 3:
				heroName.setTextColor(Color.parseColor("#8A2BE2"));
				break;
			case 4:
				heroName.setTextColor(Color.parseColor("#6495ED"));
				break;

			default:
				break;
			}

			final int position2 = position;
			cut.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					cutHeroNum(position2);
				}
			});

			add.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					addHeroNum(position2);
				}
			});

			heroName.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					addHeroNum(position2);
				}
			});

			return convertView;
		}

	}

	private void addHeroNum(int position) {
		DateTemp.heroList.get(position).setNum(DateTemp.heroList.get(position).getNum() + 1);
		getTotleNum();
		adapter.notifyDataSetChanged();
	}

	private void cutHeroNum(int position) {

		if (DateTemp.heroList.get(position).getNum() <= 0) {
			return;
		}

		DateTemp.heroList.get(position).setNum(DateTemp.heroList.get(position).getNum() - 1);
		getTotleNum();
		adapter.notifyDataSetChanged();
	}

	private void getTotleNum() {
		int totle = 0;
		for (HeroEntity obj : DateTemp.heroList) {
			totle += obj.getNum();
		}

		num.setText(totle + "");
	}
}
