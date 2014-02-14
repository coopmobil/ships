package org.coopmobil.ships.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import org.coopmobil.ships.R;
import org.coopmobil.ships.temp.WelcomeActivity;

/**
 * Created by Michael on 09.02.14.
 */
public class VictoryCeremonyActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory_ceremony);
    }


    public void onNewGame(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

    public void onCancel(View view) {
//        Intent startMain = new Intent(Intent.ACTION_MAIN);
//        startMain.addCategory(Intent.CATEGORY_HOME);
//        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(startMain);

        moveTaskToBack(true);
    }

    // von der Siegerehrung nicht zurück auf das Schlachtfeld
    // - alternativ könnte man auf die Start-Activity zurückkehren
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            return true;

            Intent intent = new Intent(this, WelcomeActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}