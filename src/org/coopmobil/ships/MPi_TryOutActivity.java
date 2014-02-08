package org.coopmobil.ships;

import org.coopmobil.ships.views.ShipFieldView;

import android.app.Activity;
import android.os.Bundle;

public class MPi_TryOutActivity extends Activity {
	

ShipFieldView gv ;   

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		
	    gv = new ShipFieldView(this);
	    setContentView(gv);
	}

}
