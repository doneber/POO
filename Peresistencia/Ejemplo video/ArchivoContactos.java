import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class ArchivoContactos {
	private String nombre;
	public ArchivoContactos(String nombre){
		this.nombre = nombre;
	}
	public void crear() throws FileNotFoundException, IOException{
		ObjectOutputStream archivo = new ObjectOutputStream( new FileOutputStream( this.nombre ) );
		archivo.close();
		System.out.println("Archivo creado exitosamente");
	}
	public void agregar() throws FileNotFoundException, IOException{
		ObjectOutputStream copiaAux = new ObjectOutputStream( new FileOutputStream( "copiaAuxiliar.txt" ) );
		ObjectInputStream archivo = new ObjectInputStream( new FileInputStream(this.nombre) );
		try {
			while(true){
				String contacto = (String) archivo.readObject();
				copiaAux.writeObject(contacto);
			}
		} catch (Exception e) {
			Scanner sc = new Scanner(System.in);
			String nuevoContacto = sc.next();
			copiaAux.writeObject(nuevoContacto);
			
			copiaAux.close();
			archivo.close();
			
			File fArchivo = new File(this.nombre);
			File fCopiaArchivo = new File("copiaAuxiliar.txt");
			
			fArchivo.delete();
			fCopiaArchivo.renameTo(fArchivo);
			System.out.println("Contacto agregado exitosamente");
			
		}
	}
	public void listar() throws FileNotFoundException, IOException{
		ObjectOutputStream copiaAux = new ObjectOutputStream( new FileOutputStream( "copiaAuxiliar.txt" ) );
		ObjectInputStream archivo = new ObjectInputStream( new FileInputStream(this.nombre) );
		try {
			System.out.println("Lista de contactos:");
			while(true){
				String contacto = (String) archivo.readObject();
				System.out.println(contacto);
				copiaAux.writeObject(contacto);
			}
		} catch (Exception e) {
		
			copiaAux.close();
			archivo.close();
			
			File fArchivo = new File(this.nombre);
			File fCopiaArchivo = new File("copiaAuxiliar.txt");
			
			fArchivo.delete();
			fCopiaArchivo.renameTo(fArchivo);
			
		}
	}
	
}
