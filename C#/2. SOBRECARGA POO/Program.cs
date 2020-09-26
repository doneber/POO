using System;

namespace Sobrecarga
{
	class Program
	{
		public static void Main(string[] args)
		{
			Fraccion a = new Fraccion();
			a.mostrar();
			Fraccion b = new Fraccion(1,1);
			b.mostrar(true);
			b.mostrar(false);
			Fraccion c = a+b;
			Console.WriteLine("La suma es:");
			c.mostrar();
			Console.WriteLine("La multiplicación por si misma de la 1ra fracción es:");
			Fraccion d = ~a;
			d.mostrar();
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
		}
	}
}