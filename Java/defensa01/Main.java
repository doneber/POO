
public class Main {
	public static void main(String[] args) {
		Ajedresista primero= new Ajedresista("Uno",15);
		Ajedresista segundo= new Ajedresista("Dos",19,"F");
		Ajedresista tercero= new Ajedresista("Tres",22,"M","Perú");
		/*
		primero.mostrar();
		segundo.mostrar();
		tercero.mostrar();
		*/
		System.out.println("--------------------------------");
		
		CampeonatoAjedrez partidas = new CampeonatoAjedrez();
		// partidas.mostrar();
		partidas.mostrarEnfrentamiento("09");
	}
}
