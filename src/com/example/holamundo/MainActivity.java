package com.example.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity{
	
	TextView texto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		texto = (TextView) findViewById(R.id.tvHolaMundo);
		texto.setText("This is a new aplication created by Eduardo Hernandez");
		
	}
	
	
	
}
