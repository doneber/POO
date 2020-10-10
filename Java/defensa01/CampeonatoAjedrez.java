
public class CampeonatoAjedrez {
	private String fechaIni;
	private String fechaFin;
	private int nroEnfrentamientos;
	private String enfrentamientos[][] = new String[4][30];

	// a)
	public CampeonatoAjedrez() {
		fechaIni = "17/09/2020";
		fechaFin = "01/10/2020";
		nroEnfrentamientos = 3;
		enfrentamientos[0][0] = "Susana";
		enfrentamientos[1][0] = "Miguel";
		enfrentamientos[2][0] = "17/09/20";
		enfrentamientos[3][0] = "Susana";

		enfrentamientos[0][1] = "Juan";
		enfrentamientos[1][1] = "Lina";
		enfrentamientos[2][1] = "25/09/20";
		enfrentamientos[3][1] = "Lina";

		enfrentamientos[0][2] = "Miguel";
		enfrentamientos[1][2] = "Nils";
		enfrentamientos[2][2] = "01/10/20";
		enfrentamientos[3][2] = "Miguel";
	}

	public void mostrar() {
		System.out.println("** ENFRENTAMIENTOS DEL CAMPEONATO:  **");
		System.out.println("Fecha Ini: " + fechaIni);
		System.out.println("Fecha Fin: " + fechaFin);
		System.out.println("Nro Enfrentamientos: " + nroEnfrentamientos);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < nroEnfrentamientos; j++)
				System.out.print(enfrentamientos[i][j] + "\t\t");
			System.out.println();
		}
		System.out.println();
	}

	// b)
	public void mostrarEnfrentamiento(String mes) {
		System.out.println("** Enfrentamientos del mes " + mes + " **");
		for (int i = 0; i < nroEnfrentamientos; i++) {
			if (enfrentamientos[2][i].substring(3, 5).equals(mes)) {
				System.out.println(enfrentamientos[0][i]);
				System.out.println(enfrentamientos[1][i]);
				System.out.println(enfrentamientos[2][i]);
				System.out.println(enfrentamientos[3][i]);
			}
		}
		System.out.println();
	}

	// c)
	public void eliminarAjedrecista(Ajedrecista x) {
		String nom = x.getNombre();
		System.out.println("nRO ENFRE" + this.nroEnfrentamientos);
		for (int i = 0; i < nroEnfrentamientos; i++) {
			String ganador = enfrentamientos[3][i];
			String jugadorUno = enfrentamientos[0][i];
			String jugadorDos = enfrentamientos[1][i];
			// Primero preguntamos si x jugo en esa partida
			if (nom.equals(jugadorUno) || nom.equals(jugadorDos))
				// Preguntamos si es que NO gano x
				if (!ganador.equals(nom))
					// Preguntamos si tampoco fue empate
					if (!ganador.equals("empate")) {
						// Entonces perdiò y eliiminamos esa partida
						eliminaPartida(i);
						i--; // Como eliminamos uno, necesitamos equilibrar para el ciclo for
					}
		}
	}

	private void eliminaPartida(int i) {
		System.out.println("Eliminado partida");
		for (int j = i; j < nroEnfrentamientos - 1; j++) {
			enfrentamientos[0][j] = enfrentamientos[0][j + 1];
			enfrentamientos[1][j] = enfrentamientos[1][j + 1];
			enfrentamientos[2][j] = enfrentamientos[2][j + 1];
			enfrentamientos[3][j] = enfrentamientos[3][j + 1];
		}
		nroEnfrentamientos--;

	}

}
