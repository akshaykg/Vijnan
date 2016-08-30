package com.KGcodings.vijnan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class E1 extends Activity  implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.e1);
		Button b25 = (Button) findViewById(R.id.button17);
		b25.setOnClickListener(this);
		Button b26 = (Button) findViewById(R.id.button18);
		b26.setOnClickListener(this);
		Button b27 = (Button) findViewById(R.id.button19);
		b27.setOnClickListener(this);
		Button b28 = (Button) findViewById(R.id.button20);
		b28.setOnClickListener(this);
		Button b29 = (Button) findViewById(R.id.button21);
		b29.setOnClickListener(this);
		Button b30 = (Button) findViewById(R.id.button22);
		b30.setOnClickListener(this);
		Button b31 = (Button) findViewById(R.id.button23);
		b31.setOnClickListener(this);
	}

	@Override
	public void onClick(View g) {
if(g.getId()==R.id.button17){
			
			startActivity(new Intent(E1.this, El1.class));
			
					}
if(g.getId()==R.id.button18){
	
	startActivity(new Intent(E1.this, El2.class));
	
			}
if(g.getId()==R.id.button19){
	
	startActivity(new Intent(E1.this, El3.class));
	
			}
if(g.getId()==R.id.button20){
	
	startActivity(new Intent(E1.this, El4.class));
	
			}
if(g.getId()==R.id.button21){
	
	startActivity(new Intent(E1.this, El5.class));
	
			}
if(g.getId()==R.id.button22){
	
	startActivity(new Intent(E1.this, El6.class));
	
			}
if(g.getId()==R.id.button23){
	
	startActivity(new Intent(E1.this, El7.class));
	
			}
		
	}

}
