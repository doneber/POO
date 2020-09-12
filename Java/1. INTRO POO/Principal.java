
public class Principal {
	public static void main(String[] args) {
		Almacen almacenA = new Almacen();
		Almacen almacenB = new Almacen("Almacen Informatica");
		almacenA.mostrar();
		System.out.println("--------------------");
		almacenB.mostrar();
		System.out.println("--------------------");
		
		Producto p = new Producto();
		p.mostrar();
		System.out.println("--------------------");
		// a) Mostrar de 2 almancenes el que tenga mas productos
		
		//almacenA.mayorAlmacen(almacenB);
		// b) verificar si el almacén tiene el producto de nombre x.
		almacenA.verificarProducto(p);
		System.out.println("--------------------");
	}
}
