
public class Main {
	public static void main(String[] args) {
		// a)
			CampeonatoAjedrez partidas = new CampeonatoAjedrez();
			partidas.mostrar();
			Ajedrecista miguel= new Ajedrecista("Miguel",15);
			Ajedrecista mario= new Ajedrecista("Mario",19,"F");
			Ajedrecista luis= new Ajedrecista("Luis",22,"M","Perú");
			miguel.mostrar();
			mario.mostrar();
			luis.mostrar();
		// b)
			partidas.mostrarEnfrentamiento("09");
		// c)
			partidas.eliminarAjedrecista(miguel);
			System.out.println("Luego...");
			partidas.mostrar();
	}
}
