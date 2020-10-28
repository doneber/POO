package ejercicioHerencia;

public class Afiliado extends Persona {

	private int antiguedad;

	public Afiliado(String nombre, String ci, String vehiculoAsignado, int antiguedad) {
		super(nombre, ci, vehiculoAsignado);
		this.antiguedad = antiguedad;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Antiguedad: " + antiguedad);
	}

	public void comparar(Afiliado afiliado) {
		if (this.antiguedad > afiliado.antiguedad)
			this.mostrar();
		else
			afiliado.mostrar();
	}
}













