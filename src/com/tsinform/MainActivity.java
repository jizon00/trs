package com.tsinform;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	OnClickListener clickListener = new MainClickListener();
	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mContext = this;

		
		findViewById(R.id.button1).setOnClickListener(clickListener);
		findViewById(R.id.button2).setOnClickListener(clickListener);
		findViewById(R.id.button3).setOnClickListener(clickListener);
		findViewById(R.id.button4).setOnClickListener(clickListener);
		findViewById(R.id.button5).setOnClickListener(clickListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class MainClickListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			String msg = "";
			switch (v.getId()) {
			case R.id.button1: {
				// 교통정보API
				msg = "교통정보API";
				Toast.makeText(getApplicationContext(), String.format("%s", msg), Toast.LENGTH_SHORT).show();
			}
				break;
			case R.id.button2:{
				// 구글맵API
				msg = "구글맵API";
				Toast.makeText(getApplicationContext(), String.format("%s", msg), Toast.LENGTH_SHORT).show();
			}
				break;
			case R.id.button3: {
				// 페이스북API
				msg = "페이스북API";
				Toast.makeText(getApplicationContext(), String.format("%s", msg), Toast.LENGTH_SHORT).show();
			}
				break;
			case R.id.button4: {
				// DataBase
				msg = "DataBase";
				Toast.makeText(getApplicationContext(), String.format("%s", msg), Toast.LENGTH_SHORT).show();
			}
				break;
			case R.id.button5: {
				// Activity
				Intent intent = new Intent(mContext, Activity1.class);
//				Intent intent = new Intent(MainActivity.this, cls)
				startActivity(intent);
			}
				break;
			}
			
		}
	}
}
