package org.coopmobil.ships;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import org.coopmobil.ships.temp.WelcomeActivity;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class org.coopmobil.ships.temp.WelcomeActivityTest \
 * org.coopmobil.ships.tests/android.test.InstrumentationTestRunner
 */
@TargetApi(Build.VERSION_CODES.CUPCAKE)
public class WelcomeActivityTest extends ActivityInstrumentationTestCase2<WelcomeActivity> {

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    public WelcomeActivityTest() {
        super("org.coopmobil.ships", WelcomeActivity.class);
    }


    public void testBlaBlup(){

    }
}
