package com.example.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class PrimerasVistas extends Activity implements OnClickListener{
	
	EditText some, name, password, numbPassword, email, phone, 
			postalAdress, time, date;
	AutoCompleteTextView autoComplete;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.primerasvistas);
		
		some = (EditText) findViewById(R.id.etSomething);
		name = (EditText) findViewById(R.id.etName);
		password = (EditText) findViewById(R.id.etPassword);
		numbPassword = (EditText) findViewById(R.id.etNumbPass);
		email = (EditText) findViewById(R.id.etEmail);
		phone = (EditText) findViewById(R.id.etPhone);
		postalAdress = (EditText) findViewById(R.id.etAdress);
		time = (EditText) findViewById(R.id.etTime);
		date = (EditText) findViewById(R.id.etDate);
		autoComplete = (AutoCompleteTextView) findViewById(R.id.autoComplete);
		
		some.setOnClickListener(this);
		name.setOnClickListener(this);
		password.setOnClickListener(this);
		numbPassword.setOnClickListener(this);
		email.setOnClickListener(this);
		phone.setOnClickListener(this);
		postalAdress.setOnClickListener(this);
		time.setOnClickListener(this);
		date.setOnClickListener(this);
		autoComplete.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.autoComplete:
			autoComplete.setText("");
			break;
			
		case R.id.etAdress:
			postalAdress.setText("");
			break;
			
		case R.id.etDate:
			date.setText("");
			break;
			
		case R.id.etEmail:
			email.setText("");
			break;
			
		case R.id.etName:
			name.setText("");
			break;
			
		case R.id.etNumbPass:
			numbPassword.setText("");
			break;
		case R.id.etPassword:
			password.setText("");
			break;
			
		case R.id.etPhone:
			phone.setText("");
			break;
			
		case R.id.etSomething:
			some.setText("");
			break;
			
		case R.id.etTime:
			time.setText("");
			break;
		}
	}
	
	
}
