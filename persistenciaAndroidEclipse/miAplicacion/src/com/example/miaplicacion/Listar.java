package com.example.miaplicacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Listar extends Activity {
	static String ruta = Environment.getExternalStorageDirectory().getAbsolutePath();
	static String nombre = "estoEsEspartaaa.txt";
	static String nombreCopia = "soloSoyUnaCopia.txt";
	static String rutaCompleta = ruta +"/"+ nombre;
	File f1 = new File(ruta,nombre);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listar);		
	
		if(!f1.exists()){
			ObjectOutputStream archivo1;
			try {
				archivo1 = new ObjectOutputStream(new FileOutputStream(rutaCompleta));
				archivo1.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public void listarPersonas(View vista) throws IOException{
		EditText et = (EditText) findViewById(R.id.editText1);
		String res="";

		ObjectOutputStream copiaArchivo = new ObjectOutputStream( new FileOutputStream(ruta+"/"+nombreCopia) );
		ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(rutaCompleta));
		try {
			while(true){
				Persona p = (Persona) archivo.readObject();
				res += p.getNombre()+" "+p.getCi() + "\n";
				copiaArchivo.writeObject(p);
			}
		} catch (Exception e) {
			copiaArchivo.close();
			archivo.close();
			File f2 = new File(ruta,nombreCopia);
			f1.delete();
			f2.renameTo(f1);
			et.setText(res);
			Toast.makeText(this, "Leido",Toast.LENGTH_SHORT).show();
		}	
	}

	public void finalizar (View vista){
		finish();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listar, menu);
		return true;
	}

}
