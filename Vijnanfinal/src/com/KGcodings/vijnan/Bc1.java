package com.KGcodings.vijnan;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Bc1 extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bc1);
		
	    Button startBtn = (Button) findViewById(R.id.makeCall1);
	      startBtn.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall();
	      }
	   });

	   }
	   protected void makeCall() {
	      Log.i("Make call", "");

	      Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
	      phoneIntent.setData(Uri.parse("tel:+91-953-827-5798"));

	      try {
	         startActivity(phoneIntent);
	         finish();
	         Log.i("Finished making a call...", "");
	      } catch (android.content.ActivityNotFoundException ex) {
	         Toast.makeText(Bc1.this, 
	         "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
	      }
	   }
	   @Override
	   public boolean onCreateOptionsMenu(Menu menu) {
	      // Inflate the menu; this adds items to the action bar if it is present.
	      getMenuInflater().inflate(R.menu.main, menu);
	      return true;
	}

}
