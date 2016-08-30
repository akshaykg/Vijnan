package com.KGcodings.vijnan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class E4 extends Activity implements OnClickListener{
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.e4);
		Button b38 = (Button) findViewById(R.id.button30);
		b38.setOnClickListener(this);
		Button b39 = (Button) findViewById(R.id.button31);
		b39.setOnClickListener(this);
		Button b40 = (Button) findViewById(R.id.button32);
		b40.setOnClickListener(this);
		Button b41 = (Button) findViewById(R.id.button33);
		b41.setOnClickListener(this);
		Button b42 = (Button) findViewById(R.id.button34);
		b42.setOnClickListener(this);
		Button b43 = (Button) findViewById(R.id.button35);
		b43.setOnClickListener(this);
	}

	@Override
	public void onClick(View g) {
if(g.getId()==R.id.button30){
			
			startActivity(new Intent(E4.this, Cs1.class));
			
					}
if(g.getId()==R.id.button31){
	
	startActivity(new Intent(E4.this, Cs2.class));
	
			}
if(g.getId()==R.id.button32){
	
	startActivity(new Intent(E4.this, Cs3.class));
	
			}
if(g.getId()==R.id.button33){
	
	startActivity(new Intent(E4.this, Cs4.class));
	
			}
if(g.getId()==R.id.button34){
	
	startActivity(new Intent(E4.this, Cs5.class));
	
			}
if(g.getId()==R.id.button35){
	
	startActivity(new Intent(E4.this, Cs6.class));
	
			}
		
	}
}
