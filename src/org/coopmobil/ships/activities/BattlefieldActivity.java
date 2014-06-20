package org.coopmobil.ships.activities;

import org.coopmobil.ships.R;
import org.coopmobil.ships.adapter.ImageAdapter;
import org.coopmobil.ships.views.SpielfeldGridView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;



/**
 * Created by Michael on 09.02.14.
 */
public class BattlefieldActivity extends Activity {
	private Vibrator myVib;
    public void onCreate(Bundle savedInstanceState) {
 
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battlefield);
        
        myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);

        
        SpielfeldGridView gridview = (SpielfeldGridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setNumColumns(6);

        gridview.setOnItemClickListener(new OnItemClickListener() {
        	
        	
        	
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            	
            	myVib.vibrate(500);
            	
                Toast.makeText(getApplicationContext(), "" + position, Toast.LENGTH_SHORT).show();
            }
        });
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