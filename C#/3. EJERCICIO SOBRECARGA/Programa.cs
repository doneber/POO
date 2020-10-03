using System;

namespace Sobrecarga2
{
	public class Programa
	{
		private string nombre;
		private int version;
		private int anio;
		public Programa(){
			this.nombre = "Excel";
			this.version = 3;
			this.anio = 1998;
		}
		public void mostar(){
			Console.WriteLine("Nombre: "+this.nombre);
			Console.WriteLine("Version: "+this.version);
			Console.WriteLine("Año: "+this.anio);

		}
		public int getAnio(){
			return this.anio;
		}
		public string getNombre(){
			return this.nombre;
		}
	}
}
