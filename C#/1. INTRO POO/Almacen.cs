using System;

namespace pruebita
{
	public class Almacen
	{
		private string nombre;
		private string propietario;
		private int nroProductos;
		private string[] productos = new string[30];
		
 		public Almacen(){
			nombre = "Doña Clara";
			propietario = "Clara";
			nroProductos = 3;
			productos[0] = "Carlita";
			productos[1] = "Nikolo";
			productos[2] = "Sniker";
		}
		public Almacen(String nombre){
			this.nombre = nombre;
			propietario = "Carrera Informatica";
			nroProductos = 3;
			productos[0] = "Programas de software";
			productos[1] = "CPU's";
			productos[2] = "Cursos";
		}
		public void mostrar(){
			Console.WriteLine("Datos del Almancen:");
			Console.WriteLine("Nombre: "+ nombre);
			Console.WriteLine("Propietario: "+ propietario);
			Console.WriteLine("nroProductos: "+ nroProductos);
			
			Console.WriteLine("Los productos son:");
			for(int i = 0; i<nroProductos; i++){
				Console.WriteLine("\t-" + productos[i]);
			}
		}
		public void mayorAlmacen(Almacen almacen){
			if(almacen.nroProductos > this.nroProductos){
				Console.WriteLine("El almacen con mayor cantidad de productos es: "+almacen.nombre);
			}else{
				Console.WriteLine("El almacen con mayor cantidad de productos es: "+this.nombre);
			}
		}
		public void verificarProducto(Producto x){
			bool sw = false;
			for(int i = 0; i<nroProductos; i++){
				if(productos[i] == x.nombre){
					sw = true;
				}
			}
			if(sw){
				Console.WriteLine("Si, si existe el producto");
				x.mostrar();
				
			}else{
				Console.WriteLine("No se encontró el producto");
			}
		}
		
	}
}
