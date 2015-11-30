package com.example.adventureandminingcalculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;

public class AttributeActivity extends Activity {

	Button jump;

	EditText fast;
	EditText defense;
	EditText dodge;
	EditText king;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.attribute_activity);

		fast = (EditText) findViewById(R.id.fast);
		defense = (EditText) findViewById(R.id.defense);
		dodge = (EditText) findViewById(R.id.dodge);
		king = (EditText) findViewById(R.id.king);
		
		MyOnTouch l = new MyOnTouch();
		fast.setOnFocusChangeListener(l);
		defense.setOnFocusChangeListener(l);
		dodge.setOnFocusChangeListener(l);
		king.setOnFocusChangeListener(l);

		jump = (Button) findViewById(R.id.jump);
		jump.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(AttributeActivity.this, AttributeMixActivity.class);
				intent.putExtra("fast", fast.getText().toString().trim());
				intent.putExtra("defense", defense.getText().toString().trim());
				intent.putExtra("dodge", dodge.getText().toString().trim());
				intent.putExtra("king", king.getText().toString().trim());
				startActivity(intent);

			}
		});
		
	}

	class MyOnTouch implements OnFocusChangeListener {

		@Override
		public void onFocusChange(View v, boolean hasFocus) {
			// TODO Auto-generated method stub
			if (hasFocus) {
				((EditText)v).setText("");
			}
		}
	}

}
