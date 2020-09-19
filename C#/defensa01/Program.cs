using System;

namespace defensa01_121
{
	class Program
	{
		public static void Main(string[] args)
		{
			// a)
			BolsaValores bolsa = new BolsaValores("19/09/20","19/10/20");
			Inversionista a = new Inversionista();
			Inversionista b = new Inversionista("Uno", 13);
			Inversionista c = new Inversionista("Uno", 13, "gg2",13.5);
			/* Mostrar los datos */
			// b)
			bolsa.mostrarInversionistas("Entel");
			// c)
			bolsa.eliminarMayorInversion("10");
			
			// d)
			c.actualizarInversion(bolsa);
			
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
		}
	}
}