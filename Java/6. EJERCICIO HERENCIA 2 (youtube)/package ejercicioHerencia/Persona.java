package ejercicioHerencia;

public class Persona {
	protected String nombre;
	protected String ci;
	protected String vehiculoAsignado;

	public Persona(String nombre, String ci, String vehiculoAsignado) {
		this.nombre = nombre;
		this.ci = ci;
		this.vehiculoAsignado = vehiculoAsignado;
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Ci: " + ci);
		System.out.println("Vehiculo: " + vehiculoAsignado);
	}

	public void verificar(Vehiculo vehiculo) {
		if (vehiculoAsignado.equals(vehiculo.getPlaca()))
			System.out.println(nombre + " SI tiene asignado el vehiculo " + vehiculo.getPlaca());
		else
			System.out.println(nombre + " NO tiene asignado el vehiculo " + vehiculo.getPlaca());
	}
}










