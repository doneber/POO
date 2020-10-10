using System;

namespace EjercicioSobrecarga
{
	public class SO
	{
		private string nombre;
		private int nroProgramas;
		private string[,] programas = new string[4,30];
		public SO()
		{
			this.nombre = "Windows";
			this.nroProgramas = 2;
			this.programas[0,0]="paint";
			this.programas[1,0]="si";
			this.programas[2,0]="03/10/1998";
			this.programas[3,0]="400";
			
			this.programas[0,1]="Word";
			this.programas[1,1]="si";
			this.programas[2,1]="02/10/1998";
			this.programas[3,1]="2000";
		}
		public void mostrar(){
			Console.WriteLine("Nombre: "+this.nombre);
			Console.WriteLine("Nro programs: "+this.nroProgramas);
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < this.nroProgramas; j++){
					Console.Write(programas[i,j]+"\t\t");
				}
				Console.WriteLine();
			}
		}
		
		// sobrecarga operador binario
		// Sobrecargar operador "+" e instalar un nuevo programa a un Sistema Operativo
		public static SO operator +(SO sistema, Programa programa){
			for(int j = 0; j < sistema.nroProgramas; j++)
				if(sistema.programas[0,j] == programa.getNombre())
					return sistema;
			sistema.adicionar(programa);
			return sistema;
		}
		
		// sobrecarga operador binario (nuevo)
		// Sobrecargar "+" (otra vez) para determinar la cantidad de programas que pesen menos que el tamaño X
		public static int operator +(SO sistema, int tamanioX){
			int contador = 0;
			for(int j = 0; j < sistema.getNroProgramas(); j++)
				if(Int32.Parse(sistema.getProgramas()[3,j]) < tamanioX)
					contador++;
			// En esta sobrecarga estamos devolviendo un numero (no un objeto)
			return contador;
		}
		
		// sobrecarga operador unario (nuevo)
		// Agregar un programa extraño (tipo virus) con el ++
		public static SO operator ++(SO sistema){
			SO nuevoSistema=sistema;
			Random random = new Random();
			sistema.getProgramas()[0,sistema.getNroProgramas()]= ""+random.Next(1000)+".exe";
			sistema.getProgramas()[1,sistema.getNroProgramas()]= "no";
			sistema.getProgramas()[2,sistema.getNroProgramas()]= "00/00/0000";
			sistema.getProgramas()[3,sistema.getNroProgramas()]= "123";
			sistema.setNroProgramas(sistema.getNroProgramas()+1);
			return nuevoSistema;
		}
		
		
		public void adicionar(Programa p){
			string auxNombrePrograma = p.getNombre();
			
			this.programas[0, this.nroProgramas] =auxNombrePrograma;
			this.programas[1, this.nroProgramas] ="no";
			this.programas[2, this.nroProgramas] ="03/10/2020";
			this.programas[3, this.nroProgramas] ="250";
		
			this.nroProgramas = this.nroProgramas + 1;
		}
		
		public int getNroProgramas(){
			return this.nroProgramas;
		}
		public void setNroProgramas(int n){
			this.nroProgramas = n;
		}
		public string[,] getProgramas(){
			return this.programas;
		}
		public void setProgramas(string[,] programas){
			this.programas=programas;
		}
	}
}