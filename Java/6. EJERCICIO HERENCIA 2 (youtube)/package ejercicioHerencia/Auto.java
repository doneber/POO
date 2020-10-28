package ejercicioHerencia;

public class Auto extends Vehiculo {
	private int nroAsientos;

	public Auto(String placa, int nroAsientos) {
		super(placa);
		this.nroAsientos = nroAsientos;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("nroAsientos: " + nroAsientos);
	}
}






















