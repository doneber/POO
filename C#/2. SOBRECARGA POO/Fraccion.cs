using System;

namespace Sobrecarga
{

	public class Fraccion
	{
		private int numerador;
		private int denominador;
		/* SOBRECARGA DE CONSTRUCTORES */
		public Fraccion()
		{
			this.numerador = 1;
			denominador = 2;
		}
		public Fraccion(int n, int d)
		{
			this.numerador = n;
			this.denominador = d;
		}
		/* SOBRECARGA DE METODOS */
		public void mostrar(){
			Console.WriteLine(numerador + " / " + denominador);
		}
		// Sobrecargar el metodo mostrar para o mostrar el numerador o denominador (true o false respectivamente)
		public void mostrar(Boolean sw){
			if(sw)
				Console.WriteLine(this.numerador);
			else
				Console.WriteLine(this.denominador);
		}
		/* SOBRECARGA DE OPERADORES */
		public static Fraccion operator +(Fraccion uno, Fraccion dos){
			int auxNumerador = uno.numerador*dos.denominador + dos.numerador*uno.denominador;
			int auxDenominador = uno.denominador*dos.denominador;
			Fraccion resultado = new Fraccion(auxNumerador, auxDenominador);
			return resultado;
		}
		public static Fraccion operator ~(Fraccion f){
			return new Fraccion(f.numerador*f.numerador, f.denominador*f.denominador);
		}
		
	}
}
