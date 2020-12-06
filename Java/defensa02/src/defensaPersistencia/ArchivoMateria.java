package defensaPersistencia;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoMateria {
	private String nomArchivo;
	
	public ArchivoMateria(String nomArchivo) {
		this.nomArchivo = nomArchivo;
	}
	public void crear() throws IOException {
		FileOutputStream fos = new FileOutputStream(nomArchivo);
		ObjectOutputStream archivo = new ObjectOutputStream(fos);
		archivo.close();
		System.out.println("Creado exitosamente");
	}
	
	public void agregar() throws IOException {
		FileInputStream fis = new FileInputStream(nomArchivo);
		FileOutputStream fos = new FileOutputStream("archCopia.txt");
		ObjectInputStream archivoOriginal = new ObjectInputStream(fis);
		ObjectOutputStream archivoCopia = new ObjectOutputStream(fos);
		try {
			while(true) {
				Materia mat = (Materia) archivoOriginal.readObject();
				archivoCopia.writeObject(mat);				
			}
			
		} catch (Exception e) {;
		
			Materia materiaNueva = new Materia("", "");
			materiaNueva.leer();
			
			archivoCopia.writeObject(materiaNueva);
			archivoOriginal.close();
			archivoCopia.close();
			File fArchivoOriginal = new File(nomArchivo);
			File fArchivoCopia = new File("archCopia.txt");
			fArchivoOriginal.delete();
			fArchivoCopia.renameTo(fArchivoOriginal);
		
		}
	}
	public void listar() throws IOException {
		FileInputStream fis = new FileInputStream(nomArchivo);
		FileOutputStream fos = new FileOutputStream("archCopia.txt");
		ObjectInputStream archivoOriginal = new ObjectInputStream(fis);
		ObjectOutputStream archivoCopia = new ObjectOutputStream(fos);
		try {
			while(true) {
				Materia mat = (Materia) archivoOriginal.readObject();
				
				mat.mostrar();
				
				archivoCopia.writeObject(mat);				
			}
			
		} catch (Exception e) {;
		
			archivoOriginal.close();
			archivoCopia.close();
			File fArchivoOriginal = new File(nomArchivo);
			File fArchivoCopia = new File("archCopia.txt");
			fArchivoOriginal.delete();
			fArchivoCopia.renameTo(fArchivoOriginal);
		
		}
	}
	public void listar(String sigla) throws IOException {
		FileInputStream fis = new FileInputStream(nomArchivo);
		FileOutputStream fos = new FileOutputStream("archCopia.txt");
		ObjectInputStream archivoOriginal = new ObjectInputStream(fis);
		ObjectOutputStream archivoCopia = new ObjectOutputStream(fos);
		try {
			while(true) {
				Materia mat = (Materia) archivoOriginal.readObject();
				if(mat.getSigla().equals(sigla))
					mat.mostrarEstudiantes();
				archivoCopia.writeObject(mat);				
			}
			
		} catch (Exception e) {;
		
			archivoOriginal.close();
			archivoCopia.close();
			File fArchivoOriginal = new File(nomArchivo);
			File fArchivoCopia = new File("archCopia.txt");
			fArchivoOriginal.delete();
			fArchivoCopia.renameTo(fArchivoOriginal);
		
		}
	}
	public void listarAprobados(String gradoAcademico) throws IOException {
		FileInputStream fis = new FileInputStream(nomArchivo);
		FileOutputStream fos = new FileOutputStream("archCopia.txt");
		ObjectInputStream archivoOriginal = new ObjectInputStream(fis);
		ObjectOutputStream archivoCopia = new ObjectOutputStream(fos);
		try {
			while(true) {
				Materia mat = (Materia) archivoOriginal.readObject();
				Docente auxDoc = mat.getDocente();
				
				if(auxDoc.getGradoAcademico().equals(gradoAcademico)) {
					mat.mostrarEstudiantesAprobados();
				}
				
				archivoCopia.writeObject(mat);				
			}
			
		} catch (Exception e) {;
		
			archivoOriginal.close();
			archivoCopia.close();
			File fArchivoOriginal = new File(nomArchivo);
			File fArchivoCopia = new File("archCopia.txt");
			fArchivoOriginal.delete();
			fArchivoCopia.renameTo(fArchivoOriginal);
		
		}
	}
}
