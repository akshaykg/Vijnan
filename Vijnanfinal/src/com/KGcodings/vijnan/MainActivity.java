package com.KGcodings.vijnan;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	Button b10 = (Button) findViewById(R.id.button1);
		b10.setOnClickListener(this);
		Button b11 = (Button) findViewById(R.id.button2);
		b11.setOnClickListener(this);
		Button b12 = (Button) findViewById(R.id.button3);
		b12.setOnClickListener(this);
		Button b13 = (Button) findViewById(R.id.button4);
		b13.setOnClickListener(this);
		Button b14 = (Button) findViewById(R.id.button5);
		b14.setOnClickListener(this);
	
	
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.button1){
			
			startActivity(new Intent(MainActivity.this, Second.class));
			
			
		}
	if(v.getId()==R.id.button2){
			
			startActivity(new Intent(MainActivity.this, Third.class));
			
			
		}
	
	
	if(v.getId()==R.id.button3){
		
		startActivity(new Intent(MainActivity.this, Fourth.class));
		
		
	}
	
	if(v.getId()==R.id.button4){
		
		startActivity(new Intent(MainActivity.this, Fifth.class));
		
		
	}
	if(v.getId()==R.id.button5){
		
		startActivity(new Intent(MainActivity.this, Sixth.class));
		
		
	}
	
	
	
	}

	
}
