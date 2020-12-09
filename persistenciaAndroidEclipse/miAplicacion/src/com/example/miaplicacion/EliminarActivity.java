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
import android.widget.TextView;
import android.widget.Toast;

public class EliminarActivity extends Activity {
	static String ruta = Environment.getExternalStorageDirectory().getAbsolutePath();
	static String nombre = "estoEsEspartaaa.txt";
	static String nombreCopia = "soloSoyUnaCopia.txt";
	static String rutaCompleta = ruta +"/"+ nombre;
	static File f1 = new File(ruta,nombre);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eliminar);
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
			// archivo1.writeObject(new Persona("p1",1));
		}

	}
	public void eliminar(View vista) throws FileNotFoundException, IOException{
			
			EditText et01 = (EditText) findViewById(R.id.editText1);
			if(et01.getText().toString().equals("")){
				Toast.makeText(this, "Pon un Ci",Toast.LENGTH_SHORT).show();
			}
			else{
				int ci = Integer.parseInt(et01.getText().toString());
				
				TextView eliminado = (TextView) findViewById(R.id.textView2);
					ObjectOutputStream copiaArchivo = new ObjectOutputStream( new FileOutputStream(ruta+"/"+nombreCopia) );
					ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(rutaCompleta));
					Persona pEliminada = new Persona("No encontrada",0);
					try {
						while(true){
							Persona p = (Persona) archivo.readObject();
							if(p.getCi() != ci){
								copiaArchivo.writeObject(p);	
							}else{
								pEliminada = p;
							}
						}
					} catch (Exception e) {
						copiaArchivo.close();
						archivo.close();
						File f2 = new File(ruta,nombreCopia);
						f1.delete();
						f2.renameTo(f1);
						limpiar();
					}
					eliminado.setText("Eliminado: "+pEliminada.getNombre()+" "+pEliminada.getCi());
			}
	}

	public void limpiar(){
		((EditText) findViewById(R.id.editText1)).setText("");
	}
	public void finalizar (View vista){
		finish();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eliminar, menu);
		return true;
	}

}
