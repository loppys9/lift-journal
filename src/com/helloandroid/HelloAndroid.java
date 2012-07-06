package com.helloandroid;

import android.app.Activity;
//import android.app.ListActivity;
import android.os.Bundle;

public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        DataProvider dp = new DataProvider(getApplicationContext());
        dp.openDB();

    }
}
