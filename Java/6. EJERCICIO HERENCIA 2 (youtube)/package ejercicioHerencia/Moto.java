package ejercicioHerencia;

public class Moto extends Vehiculo {
	private String modelo;

	public Moto(String placa, String modelo) {
		super(placa);
		this.modelo = modelo;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Modelo: " + modelo);
	}
}






















