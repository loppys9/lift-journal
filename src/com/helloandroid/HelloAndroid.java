package com.helloandroid;

import android.app.Activity;
//import android.app.ListActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
	private DataProvider dp;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        dp = new DataProvider(getApplicationContext());
        dp.openDB();
        LinearLayout sl = (LinearLayout) findViewById(R.id.sl);
        sl.addView(new ExcerSummary(getApplicationContext(), null));
    }
    
	@Override
    public void onStop() {
    	dp.closeDB();
		super.onStop();
    }
}
