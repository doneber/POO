using System;

namespace Sobrecarga2
{
	class Program
	{
		public static void Main(string[] args)
		{
			
			SO sistema = new SO();
			sistema.mostrar();
			Console.WriteLine("------------");
			Console.WriteLine("---- A -----");
			Console.WriteLine("------------");
			sistema.mostrar(2001);
			// Console.WriteLine("----------");
			Programa programa = new Programa();
			// programa.mostar();
			
			Console.WriteLine("------------");
			Console.WriteLine("---- B -----");
			Console.WriteLine("------------");
			sistema.mostrar(programa);
			Console.WriteLine("------------");
			Console.WriteLine("---- C -----");
			Console.WriteLine("------------");
			sistema = sistema+programa;
			sistema.mostrar();
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
		}
	}
}