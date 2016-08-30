package com.KGcodings.vijnan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class E8 extends Activity implements OnClickListener{

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.e8);
		Button b36 = (Button) findViewById(R.id.button28);
		b36.setOnClickListener(this);
		Button b37 = (Button) findViewById(R.id.button29);
		b37.setOnClickListener(this);
	}

	@Override
	public void onClick(View g) {
if(g.getId()==R.id.button28){
			
			startActivity(new Intent(E8.this, Bc1.class));
			
					}
if(g.getId()==R.id.button29){
	
	startActivity(new Intent(E8.this, Bc2.class));
	
			}
	}
}
