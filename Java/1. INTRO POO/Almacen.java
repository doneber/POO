
public class Almacen {
	private String nombre;
	private String propietario;
	private int nroProductos;
	private String[] productos = new String[30];

	public Almacen() {
		nombre = "Doña Clara";
		propietario = "Clara";
		nroProductos = 3;
		productos[0] = "Carlita";
		productos[1] = "Nikolo";
		productos[2] = "Sniker";
	}

	public Almacen(String nombre) {
		this.nombre = nombre;
		propietario = "Carrera Informatica";
		nroProductos = 3;
		productos[0] = "Programas de software";
		productos[1] = "CPU's";
		productos[2] = "Cursos";
	}

	public void mostrar() {
		System.out.println("Datos del Almancen:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Propietario: " + propietario);
		System.out.println("nroProductos: " + nroProductos);

		System.out.println("Los productos son:");
		for (int i = 0; i < nroProductos; i++) {
			System.out.println("\t-" + productos[i]);
		}
	}

	public void mayorAlmacen(Almacen almacen) {
		if (almacen.nroProductos > this.nroProductos) {
			System.out.println("El almacen con mayor cantidad de productos es: " + almacen.nombre);
		} else {
			System.out.println("El almacen con mayor cantidad de productos es: " + this.nombre);
		}
	}

	public void verificarProducto(Producto x) {
		boolean sw = false;
		for (int i = 0; i < nroProductos; i++) {
			if (productos[i] == x.nombre) {
				sw = true;
			}
		}
		if (sw) {
			System.out.println("Si, si existe el producto");
			x.mostrar();

		} else {
			System.out.println("No se encontró el producto");
		}
	}

}
