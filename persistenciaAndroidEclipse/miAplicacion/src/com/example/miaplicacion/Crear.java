package com.example.miaplicacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Crear extends Activity {
	static String ruta = Environment.getExternalStorageDirectory().getAbsolutePath();
	static String nombre = "estoEsEspartaaa.txt";
	static String nombreCopia = "soloSoyUnaCopia.txt";
	static String rutaCompleta = ruta +"/"+ nombre;
	static File f1 = new File(ruta,nombre);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crear);
		
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
	public void limpiar(){

		((EditText) findViewById(R.id.editText1)).setText("");
		((EditText) findViewById(R.id.editText2)).setText("");
	}
	public void crear(View vista) throws IOException{
		
		EditText et01 = (EditText) findViewById(R.id.editText1);
		EditText et02 = (EditText) findViewById(R.id.editText2);
		if(!et01.getText().toString().equals("") && !et02.getText().toString().equals("")){
			String nuevoNombre = et01.getText().toString();
			int nuevoCi = Integer.parseInt(et02.getText().toString());
			
			ObjectOutputStream copiaArchivo = new ObjectOutputStream( new FileOutputStream(ruta+"/"+nombreCopia) );
			ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(rutaCompleta));
			try {
				while(true){
					Persona p = (Persona) archivo.readObject();
					copiaArchivo.writeObject(p);
				}
			} catch (Exception e) {
				copiaArchivo.writeObject(new Persona(nuevoNombre,nuevoCi));
				copiaArchivo.close();
				archivo.close();
				File f2 = new File(ruta,nombreCopia);
				f1.delete();
				f2.renameTo(f1);
				limpiar();
				Toast.makeText(this, "Leido",Toast.LENGTH_SHORT).show();
			}
		}else{
			Toast.makeText(this, "Pon los datos completos, men@",Toast.LENGTH_SHORT).show();
		}
		
	}
	
	public void finalizar (View vista){
		finish();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.crear, menu);
		return true;
	}

}
