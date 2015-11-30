package com.example.adventureandminingcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button lineup;
	Button attribute;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lineup = (Button) findViewById(R.id.lineup);
		attribute = (Button) findViewById(R.id.attribute);
		initView();
	}

	private void initView() {
		lineup.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,
						LineupActivity.class));
			}
		});
		
		attribute.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,
						AttributeActivity.class));
			}
		});
		
		
	}

}
