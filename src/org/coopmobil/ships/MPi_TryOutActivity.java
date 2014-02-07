package org.coopmobil.ships;

import org.coopmobil.ships.views.GridView;

import android.app.Activity;
import android.os.Bundle;

public class MPi_TryOutActivity extends Activity {
	

GridView gv ;   

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		
	    gv = new GridView(this);
	    setContentView(gv);
	}

}
