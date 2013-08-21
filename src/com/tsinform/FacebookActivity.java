package com.tsinform;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FacebookActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_facebook);

		TextView textView = (TextView)findViewById(R.id.fbText);
		textView.setText("facebook");
	}
}
