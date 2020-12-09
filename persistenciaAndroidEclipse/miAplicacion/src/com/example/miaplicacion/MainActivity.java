package com.example.miaplicacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	static Persona p = new Persona();
	
	public void listarVista(View vista){

		//
    	Intent avion = new Intent(this, Listar.class); //Creamos la vista
    	Bundle caja = new Bundle();
    	caja.putString("nombre",p.getNombre());
    	
    	avion.putExtras(caja);
    	startActivity(avion);
    	
	}
	
	public void crearVista(View vista){

		//
    	Intent avion = new Intent(this, Crear.class); //Creamos la vista
    	startActivity(avion);
    	
	}
	public void eliminarVista(View vista){

		//
    	Intent avion = new Intent(this, EliminarActivity.class); //Creamos la vista
    	startActivity(avion);
    	
	}	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
