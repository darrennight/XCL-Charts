package com.demo.xclcharts;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HBARScrollActivity extends Activity {
	
	com.demo.xclcharts.view.BarChart07View chart = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hbarscroll);
		
		chart = (com.demo.xclcharts.view.BarChart07View)findViewById(R.id.BarChart07View);  
		//chart.setChartRange(chart.getLeft(),chart.getBottom());
		int[] locations = new int[2];  
		chart.getLocationOnScreen(locations);
		int x = locations[0];//获取组件当前位置的横坐标  
	    int y = locations[1];//获取组件当前位置的纵坐标 
	        
		//chart.setChartRange(chart.getLeft(),chart.getBottom(),chart.getRight() - chart.getLeft(),chart.getBottom() - chart.getTop());
		
		chart.setChartRange(x,y);//,chart.getRight() - chart.getLeft(),chart.getBottom() - chart.getTop());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hbarscroll, menu);
		return true;
	}

}