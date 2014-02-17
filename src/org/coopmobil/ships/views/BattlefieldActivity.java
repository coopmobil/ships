package org.coopmobil.ships.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.coopmobil.ships.R;

/**
 * Created by Michael on 09.02.14.
 */
public class BattlefieldActivity extends Activity {
	
	private static BattlefieldView battlefielView = null;
    
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battlefield);
    	getActionBar().hide();
    	
    	/*
        DisplayMetrics displaymetrics = new DisplayMetrics();
	    getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
	    int screenHeight = displaymetrics.heightPixels;
	    int screenWidth = displaymetrics.widthPixels;
    	String outputTxt = Integer.toString(screenWidth) + " * " + Integer.toString(screenHeight);
	    
		Toast.makeText(getApplicationContext(), outputTxt, Toast.LENGTH_SHORT).show();  
		*/
    	if (battlefielView == null)
    		battlefielView = (BattlefieldView) findViewById(R.id.battleFieldView1);
    }


    public void onVictoryCeremony(View view){
        Intent intent = new Intent(this, VictoryCeremonyActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}