package defensaPersistencia;

import java.io.Serializable;
import java.util.Scanner;

public class Materia implements Serializable{
	private String nombre;
	private String sigla;
	private int nroEstudiantes;
	private Estudiante[] estudiantes;
	private Docente docente;
	
	public Materia(String nombre, String sigla) {
		this.nombre = nombre;
		this.sigla = sigla;
		this.nroEstudiantes = 0;
		this.estudiantes = new Estudiante[50];

	}
	public void leer() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nom materia?");
		this.nombre = sc.nextLine();
		System.out.println("Nom sigla?");
		this.sigla = sc.nextLine();
		System.out.println("nro est?");
		this.nroEstudiantes = sc.nextInt();
		for (int i = 0; i < nroEstudiantes; i++) {
			Estudiante nuevo = new Estudiante();
			nuevo.leer();
			estudiantes[i]=nuevo;
		}
		Docente doc = new Docente("",0 , "");
		doc.leer();
		this.docente = doc;
	}
	
	public void adicionarEstudiante( Estudiante nuevoEstudiante ) {
		estudiantes[nroEstudiantes] = nuevoEstudiante;
		nroEstudiantes++;
	}
	public void mostrar() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Sigla: "+ sigla);
		System.out.println("Nro Estudiantes: "+ nroEstudiantes);
		for (int i = 0; i < nroEstudiantes; i++) {
			System.out.println("\t\tnro - "+(i+1));
			estudiantes[i].mostrar();
		}
		if(docente !=null)
			docente.mostrar();
	}
	public void mostrarEstudiantes() {
		System.out.println("mostrando solo estudiantes");
		System.out.println("nro:"+this.nroEstudiantes);
		for (int i = 0; i < nroEstudiantes; i++) {
			System.out.println("\t\tnro - "+(i+1));
			estudiantes[i].mostrar();
		}
		
	}
	public void mostrarEstudiantesAprobados() {
		System.out.println("mostrando solo estudiantes aprobados");
		System.out.println("Nombre: "+ nombre);
		System.out.println("Sigla: "+ sigla);
		System.out.println("nro:"+this.nroEstudiantes);
		for (int i = 0; i < nroEstudiantes; i++) {
			if(estudiantes[i].getNota()>=81) {
				System.out.println("\t\tnro - "+(i+1));
				estudiantes[i].mostrar();
			}
		}
		
	}
	
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Docente getDocente() {
		return this.docente;
	}
	public String getSigla() {
		return this.sigla;
	}
}
