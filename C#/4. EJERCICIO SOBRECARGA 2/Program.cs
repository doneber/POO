/*
 * Created by SharpDevelop.
 * User: PC
 * Date: 10/10/2020
 * Time: 14:31
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace EjercicioSobrecarga
{
	class Program
	{
		public static void Main(string[] args)
		{
			SO sistema = new SO();
			sistema++;	// Agrega un programa aleatorio
			sistema++;	// Agrega otro programa aleatorio
			sistema.mostrar();
			int cantProgramas = sistema+1000; // Devuelve la cantidad de programas menor a "1000"
			Console.WriteLine("cantidad d programas que pesan menos de 1000 MB:"+cantProgramas);

			// TODO: Implement Functionality Here
			
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
		}
	}
}