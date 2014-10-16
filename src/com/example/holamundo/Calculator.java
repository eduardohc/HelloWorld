package com.example.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity implements OnClickListener{

	int num, numero1, numero2, signo, result;
	String cadena = "";
	EditText etResults;
	Button num0 ,num1, num2, num3, num4, num5, num6, num7, num8, num9,
			sum, res, igual, borrar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator);
		
		inicializate();
		
		num0.setOnClickListener(this);
		num1.setOnClickListener(this);
		num2.setOnClickListener(this);
		num3.setOnClickListener(this);
		num4.setOnClickListener(this);
		num5.setOnClickListener(this);
		num6.setOnClickListener(this);
		num7.setOnClickListener(this);
		num8.setOnClickListener(this);
		num9.setOnClickListener(this);
		sum.setOnClickListener(this);
		res.setOnClickListener(this);
		igual.setOnClickListener(this);
		borrar.setOnClickListener(this);
		
	}
	
	public void inicializate()
	{
		
		etResults = (EditText) findViewById(R.id.etResult);
		num0 = (Button) findViewById(R.id.bNum0);
		num1 = (Button) findViewById(R.id.bNum1);
		num2 = (Button) findViewById(R.id.bNum2);
		num3 = (Button) findViewById(R.id.bNum3);
		num4 = (Button) findViewById(R.id.bNum4);
		num5 = (Button) findViewById(R.id.bNum5);
		num6 = (Button) findViewById(R.id.bNum6);
		num7 = (Button) findViewById(R.id.bNum7);
		num8= (Button) findViewById(R.id.bNum8);
		num9 = (Button) findViewById(R.id.bNum9);
		sum = (Button) findViewById(R.id.bMas);
		res = (Button) findViewById(R.id.bRestar);
		igual = (Button) findViewById(R.id.bIgual);
		borrar = (Button) findViewById(R.id.bBorrar);
		
		etResults.setText("0.0");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		int signo = 0;
		
		switch(v.getId()){
		case R.id.bNum0: 
			num = 0;
			cadena += num;
			break;
		case R.id.bNum1:
			num = 1;
			cadena += num;
			break;
		case R.id.bNum2: 
			num = 2;
			cadena += num;
			break;
		case R.id.bNum3:
			num = 3;
			cadena += num;
			break;
		case R.id.bNum4: 
			num = 4;
			cadena += num;
			break;
		case R.id.bNum5:
			num = 5;
			cadena += num;
			break;
		case R.id.bNum6: 
			num = 6;
			cadena += num;
			break;
		case R.id.bNum7:
			num = 7;
			cadena += num;
			break;
		case R.id.bNum8: 
			num = 8;
			cadena += num;
			break;
		case R.id.bNum9:
			num = 9;
			cadena += num;
			break;
		case R.id.bMas:
			signo = 1;
			break;
		case R.id.bRestar:
			signo = 2;
			break;
		case R.id.bIgual: 
			resultado(signo);
			break;
		case R.id.bBorrar:
			cadena = "";
			break;
		}
		
		
		if(numero1 == 0){ 
			numero1 = Integer.parseInt(cadena); 
			etResults.setText(""); 
		} else if(numero2 != 0){ 
			numero2 = 0; 
			etResults.setText(""); 
		} else{ 
			numero2 = Integer.parseInt(cadena); 
			etResults.setText("");   
		}

		
		if(signo == 1){
			etResults.setText(" + ");
			cadena = "";
		} else if(signo == 2){
			etResults.setText(" - ");
			cadena = "";
		} else{
			etResults.setText(cadena);
		}
		
	}
	
	public void resultado(int num){
		
		if(num == 1){
			result = numero1 + numero2;
		} else{
			result = numero1 - numero2;
		}
		
		etResults.setText("" + result);
	}
	
}
