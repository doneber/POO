public class Producto {
	public String nombre;
	private String codigo;
	private double precio;

	public Producto() {
		nombre = "Sniker";
		codigo = "007";
		precio = 10.5;
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Codigo: " + codigo);
		System.out.println("Precio: " + precio);
	}
}
