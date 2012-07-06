package com.helloandroid;

import android.content.Context;
import android.util.AttributeSet;
//import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;


public class ExcerSummary extends FrameLayout{

	public ExcerSummary(Context context, AttributeSet attr ){
		super( context, attr);
		initView(context);
	}

	private void initView(Context context)
	{
		View.inflate(context, R.layout.excersummary, this);
	}


}
