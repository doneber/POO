using System;

namespace defensa01_121
{
	public class BolsaValores
	{
		public string fechaIni;
		public int nInv;
		public string[,] lv = new string[4,30];
		// los atributos van aqui
		
		public BolsaValores(string fechaInicio, string fechaFinal){
			/* tu código va aqui  */
		}
		public void mostrar(){
			/* tu código va aqui  */
		}
		// b)
		public void mostrarInversionistas(string nombreAccion){
			for(int i = 0 ; i<nInv; i++){
				if(lv[i,2]== nombreAccion){
					if(Int16.Parse(lv[i,3]) > 500 & Int16.Parse(lv[i,3]) < 2000){
							Console.WriteLine(lv[i,0]);
							Console.WriteLine(lv[i,1]);
							Console.WriteLine(lv[i,3]);
							Console.WriteLine(lv[i,4]);
					}
				}
			}
		}
		// c)
		public void eliminarMayorInversion(string mes){
			/*
			int auxMayor = 0 ;
			for(int i = 0 ; i<nInv; i++){
				if(...es el mimo mes?){
					if(...la inversion es mayor a "auxMayor?"){
						auxMayor = lv[i][3];
					}
				}
			}
			for(int i = 0 ; i<nInv; i++){
				if(...su inversion es igual a "auxMayor"?){
					// inserte aqui su algoritmo para eliminar
				}
			}
		*/
		}
		
		
	}
}
