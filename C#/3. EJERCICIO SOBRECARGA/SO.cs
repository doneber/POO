using System;

namespace Sobrecarga2
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
		public void mostrar(int tamanio){
			Console.WriteLine("Los programas que pesan menos de "+tamanio+" son:");
			for(int j = 0; j < this.nroProgramas; j++){
				if(Int32.Parse(this.programas[3,j]) < tamanio){
					Console.WriteLine(this.programas[0,j]);
					Console.WriteLine(this.programas[1,j]);
					Console.WriteLine(this.programas[2,j]);
					Console.WriteLine(this.programas[3,j]);
					Console.WriteLine();
				}
			}
		}
		public void mostrar(Programa p){
			int auxAnioPrograma = p.getAnio();
			int contador = 0;
			for(int j = 0; j < this.nroProgramas; j++){
				string auxAnioString = this.programas[2,j].Substring(6);
				int auxAnioInt = Int32.Parse(auxAnioString);
				if( auxAnioInt == auxAnioPrograma ){
					Console.WriteLine(this.programas[0,j]);
					Console.WriteLine(this.programas[1,j]);
					Console.WriteLine(this.programas[2,j]);
					Console.WriteLine(this.programas[3,j]);
					Console.WriteLine();
					contador=contador+1;
				}
			}
			Console.WriteLine("Se encontraron "+contador+ " programas con el mismo año");
		}
		
		public static SO operator +(SO sistema, Programa programa){
			for(int j = 0; j < sistema.nroProgramas; j++){
				if(sistema.programas[0,j] == programa.getNombre()){
					return sistema;
				}
			}
			sistema.adicionar(programa);
			return sistema;
			
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
	}
}
