package org.coopmobil.ships.temp;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.coopmobil.ships.R;
import org.coopmobil.ships.R.array;
import org.coopmobil.ships.R.id;
import org.coopmobil.ships.R.layout;
import org.coopmobil.ships.R.menu;
import org.coopmobil.ships.game.Game;
import org.coopmobil.ships.util.GameType;
import org.coopmobil.ships.views.BattlefieldActivity;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);

        initSpinner(R.id.spinner_gametype, R.array.gametype);
        initSpinner(R.id.spinner_opponent, R.array.opponent);
	}


    private void initSpinner( int itemId, int arraylistId ){
        Spinner spinner = (Spinner) findViewById(itemId);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,  arraylistId, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

    public void onClickBeginButton(View view){
		Intent intent = new Intent(this, BattlefieldActivity.class);

		Game.getInstance().init(GameType.SIMPLE);
		
		startActivity(intent);
	}
}
