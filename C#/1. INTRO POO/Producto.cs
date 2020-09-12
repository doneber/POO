using System;

namespace pruebita
{
	public class Producto
	{
		public string nombre;
		private string codigo;
		private double precio;
		public Producto(){
			nombre = "Sniker";
			codigo = "007";
			precio = 10.5;
		}
		public void mostrar(){
			Console.WriteLine("Nombre: "+nombre);
			Console.WriteLine("Codigo: "+codigo);
			Console.WriteLine("Precio: "+precio);
		}
	}
}
