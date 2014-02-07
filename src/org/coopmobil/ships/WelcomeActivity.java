package org.coopmobil.ships;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}
	
	/**
	 * Ermöglicht das Rufen von MPi_TryOutActivity. 
	 * Bitte dies Activity bis auf weiteres ansprechen, damit ich testen kann.
	 * 
	 * @author MPi 
	 */
	public void onClickBeginButton(View view){
		Intent intent = new Intent(WelcomeActivity.this, MPi_TryOutActivity.class);
        startActivity(intent);
	}
			

}
