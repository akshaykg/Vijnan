 package com.KGcodings.vijnan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Third extends Activity  implements OnClickListener {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
	

		Button b15 = (Button) findViewById(R.id.button6);
			b15.setOnClickListener(this);
			Button b16 = (Button) findViewById(R.id.button8);
			b16.setOnClickListener(this);
			Button b17 = (Button) findViewById(R.id.button9);
			b17.setOnClickListener(this);
			Button b18 = (Button) findViewById(R.id.button10);
			b18.setOnClickListener(this);
			Button b19 = (Button) findViewById(R.id.button11);
			b19.setOnClickListener(this);
			Button b20 = (Button) findViewById(R.id.button12);
			b20.setOnClickListener(this);
			Button b21 = (Button) findViewById(R.id.button13);
			b21.setOnClickListener(this);
			Button b22 = (Button) findViewById(R.id.button16);
			b22.setOnClickListener(this);
			Button b23 = (Button) findViewById(R.id.button14);
			b23.setOnClickListener(this);
			Button b24 = (Button) findViewById(R.id.button15);
			b24.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View f) {
if(f.getId()==R.id.button6){
			
			startActivity(new Intent(Third.this, E1.class));
			
					}
if(f.getId()==R.id.button8){
	
	startActivity(new Intent(Third.this, E2.class));
	
			}
if(f.getId()==R.id.button9){
	
	startActivity(new Intent(Third.this, E3.class));
	
			}
if(f.getId()==R.id.button10){
	
	startActivity(new Intent(Third.this, E4.class));
	
			}
if(f.getId()==R.id.button11){
	
	startActivity(new Intent(Third.this, E5.class));
	
			}
if(f.getId()==R.id.button12){
	
	startActivity(new Intent(Third.this, E6.class));
	
			}
if(f.getId()==R.id.button13){
	
	startActivity(new Intent(Third.this, E7.class));
	
			}
if(f.getId()==R.id.button16){
	
	startActivity(new Intent(Third.this, E8.class));
	
			}
if(f.getId()==R.id.button14){
	
	startActivity(new Intent(Third.this, E9.class));
	
			}
if(f.getId()==R.id.button15){
	
	startActivity(new Intent(Third.this, E10.class));
	
			}
	}
}
