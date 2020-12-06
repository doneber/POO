package defensaPersistencia;

import java.io.Serializable;
import java.util.Scanner;

public class Estudiante implements Serializable{
	private String nombre;
	private int ci;
	private int nota;
	public Estudiante() {
		nombre = "";
		ci=0;
		nota=0;
	}
	public Estudiante(String nombre, int ci, int nota) {
		this.nombre = nombre;
		this.ci = ci;
		this.nota = nota;
	}
	public void leer() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Nom est?");
		this.nombre = sc.nextLine();
		System.out.println("ci?");
		this.ci = sc.nextInt();
		System.out.println("nota?");
		this.nota = sc.nextInt();
	}
	public void mostrar() {
		System.out.println("\tNombre estudiante: "+ nombre);
		System.out.println("\tCi estudiante: "+ ci);
		System.out.println("\tNota: "+ nota);
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
}
