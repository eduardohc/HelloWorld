package com.example.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MenuCreator extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menucreator);
		
		//pone en pausa la pantalla menucreator que tiene como fondo una imagen
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(500);
				} catch(InterruptedException exception){
					exception.printStackTrace();
				} finally{
					//intenta abrir el menu que contiene todas las ventanas o aplicaciones
					Intent openStaringPoint = new Intent("com.example.holamundo.MENU");
					startActivity(openStaringPoint);
				}
			}
		};
		
		timer.start(); //sentencia que inicia el tiempo de espera de la pantalla
	}
	
	//metodo que cierra la pestaña que contiene el fondo de pantalla con imagen
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish(); // Metodo que finaliza la clase
	}
	
	
}
