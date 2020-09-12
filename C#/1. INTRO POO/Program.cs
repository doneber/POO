/*
 * Created by SharpDevelop.
 * User: PC
 * Date: 12/9/2020
 * Time: 15:19
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace pruebita
{
	class Program
	{
		public static void Main(string[] args)
		{
			Almacen almacenA = new Almacen();
			Almacen almacenB = new Almacen("Almacen Informatica");
			almacenA.mostrar();
			Console.WriteLine("--------------------");
			almacenB.mostrar();
			Console.WriteLine("--------------------");
			
			Producto p = new Producto();
			p.mostrar();
			Console.WriteLine("--------------------");
			// a) Mostrar de 2 almancenes el que tenga mas productos
			
			//almacenA.mayorAlmacen(almacenB);
			// b) verificar si el almacén tiene el producto de nombre x.
			almacenA.verificarProducto(p);
			Console.WrteLine("--------------------");
			//almacenA.verificarProducto("Sniker");
			// TODO: Implement Functionality Here
			
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
		}		
	}
}