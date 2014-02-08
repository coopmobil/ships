package org.coopmobil.ships;

import org.coopmobil.ships.views.GridCalculator;
import org.coopmobil.ships.views.ShipFieldView;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;


public class MPi_TryOutActivity extends Activity {
	

ShipFieldView gv ;   

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		getActionBar().hide();
		
	    DisplayMetrics displaymetrics = new DisplayMetrics();
	    getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
	    int screenHeight = displaymetrics.heightPixels;
	    int screenWidth = displaymetrics.widthPixels;
	    
	    GridCalculator.init(screenWidth, screenHeight);
	    System.out.println("screenHeight: " + screenHeight + " screenWidth: " + screenWidth);
	
	    gv = new ShipFieldView(this);
	    setContentView(gv);
	}

}
