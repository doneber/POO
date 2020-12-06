package defensaPersistencia;

import java.io.Serializable;
import java.util.Scanner;

public class Docente implements Serializable{
	private String nombre;
	private int ci;
	private String gradoAcademico;
	public Docente(String nombre, int ci, String gradoAcademico) {
		this.nombre = nombre;
		this.ci = ci;
		this.gradoAcademico = gradoAcademico;
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nom docente?");
		this.nombre = sc.nextLine();
		System.out.println("ci ?");
		this.ci = sc.nextInt();
		System.out.println("grado academico?");
		this.gradoAcademico = sc.nextLine();
		this.gradoAcademico = sc.nextLine();
	}
	public void mostrar() {
		System.out.println("Nombre docente: "+ nombre);
		System.out.println("Ci docente: "+ ci);
		System.out.println("Grado Academico: "+ gradoAcademico);
	}
	public String getGradoAcademico() {
		return gradoAcademico;
	}
	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}
	
}
