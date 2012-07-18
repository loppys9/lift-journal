package com.helloandroid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class MainMenu extends LinearLayout {
	public MainMenu(Context context, AttributeSet attr){
		super(context, attr);
		initView(context);
	}
	
	private void initView( Context context ){
		View.inflate(context, R.layout.mainmenu, this);
	}
}
