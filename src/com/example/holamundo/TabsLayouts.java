package com.example.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TableRow;

public class TabsLayouts extends Activity{
	
	TabHost th;
	TableRow table; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabslayouts);
		
		th = (TabHost) findViewById(R.id.tabhost);
		
		th.setup(); //Crea el objeto tabla
		
		// Inicializamos el objeto que creara las secciones de la tabla
		TabSpec specs = th.newTabSpec("tag1"); 
		specs.setContent(R.id.tab1); //hace referencia a la seccion
		specs.setIndicator("1"); //metodo que nombra la seccion de la tabla
		th.addTab(specs); //agrega la seccion
		
		//se crea otra seccion igual que en la parte superior
		specs = th.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("2");
		th.addTab(specs);
		
		specs = th.newTabSpec("tag3");
		specs.setContent(R.id.tab3);
		specs.setIndicator("3");
		th.addTab(specs);
		
		specs = th.newTabSpec("tag4");
		specs.setContent(R.id.tab4);
		specs.setIndicator("4");
		th.addTab(specs);
		
		specs = th.newTabSpec("tag5");
		specs.setContent(R.id.tab5);
		specs.setIndicator("5");
		th.addTab(specs);
		
		specs = th.newTabSpec("tag6");
		specs.setContent(R.id.tab6);
		specs.setIndicator("6");
		th.addTab(specs);
	}
		
	
	
}
