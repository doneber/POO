package defensaPersistencia;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		Materia programacion = new Materia("programacion orientada a objetos", "inf-121");
		programacion.mostrar();
		Docente doc = new Docente("El Pepe", 9123182, "Licenciado");
		programacion.setDocente(doc);
		System.out.println("-----------------------------");
		programacion.mostrar();
		System.out.println("-----------------------------");
		Estudiante est1 = new Estudiante("Uno", 1, 51);
		Estudiante est2 = new Estudiante("Dos", 2, 61);
		Estudiante est3 = new Estudiante("Tres", 3, 71);
		programacion.adicionarEstudiante(est1);
		programacion.adicionarEstudiante(est2);
		programacion.adicionarEstudiante(est3);
		programacion.mostrar();
		*/
		/*
		Materia programacion = new Materia("", "");
		programacion.leer();
		programacion.mostrar();
		*/
		ArchivoMateria arch = new ArchivoMateria("Materias.txt");
		//arch.listar();
		arch.listarAprobados("doc");

	}
}
