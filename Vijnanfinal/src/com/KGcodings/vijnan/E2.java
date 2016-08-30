package com.KGcodings.vijnan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class E2 extends Activity implements OnClickListener {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.e2);
		Button b32 = (Button) findViewById(R.id.button24);
		b32.setOnClickListener(this);
		Button b33 = (Button) findViewById(R.id.button25);
		b33.setOnClickListener(this);
		Button b34 = (Button) findViewById(R.id.button26);
		b34.setOnClickListener(this);
		Button b35 = (Button) findViewById(R.id.button27);
		b35.setOnClickListener(this);
	}

	@Override
	public void onClick(View g) {
if(g.getId()==R.id.button24){
			
			startActivity(new Intent(E2.this, P1.class));
			
					}
if(g.getId()==R.id.button25){
	
	startActivity(new Intent(E2.this, P2.class));
	
			}
if(g.getId()==R.id.button26){
	
	startActivity(new Intent(E2.this, P3.class));
	
			}
if(g.getId()==R.id.button27){
	
	startActivity(new Intent(E2.this, P4.class));
	
			}
		
	}

}
