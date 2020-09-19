import javax.xml.bind.ParseConversionEvent;

public class CampeonatoAjedrez {
	private String fechaIni;
	private String fechaFin;
	private int nEnfre;
	private String et[][] = new String[4][30];
	
	// a)
	public CampeonatoAjedrez() {
		fechaIni = "17/09/2020";
		fechaFin = "01/10/2020";
		nEnfre = 2;
		et[0][0]="Susana";
		et[1][0]="Alan";
		et[2][0]="17/09/20";
		et[3][0]="empate";
		
		et[0][1]="Miguel";
		et[1][1]="Nils";
		et[2][1]="01/10/20";
		et[3][1]="Miguel";
	}
	
	public void mostrar() {
		System.out.println("Fecha Ini: "+fechaIni);
		System.out.println("Fecha Fin: "+fechaFin);
		System.out.println("N° Enfrentamientos: "+nEnfre);
		for (int i = 0; i < nEnfre; i++) {
			System.out.print(et[0][i]+"\t");
			System.out.print(et[1][i]+"\t");
			System.out.print(et[2][i]+"\t");
			System.out.print(et[3][i]+"\t");
			System.out.println();
		}
	}
	// b)
	public void mostrarEnfrentamiento(String mes) {
		for (int i = 0; i < nEnfre; i++) {
			if (et[2][i].substring(3,5).equals(mes)) {
				System.out.println(et[0][i]);
				System.out.println(et[1][i]);
				System.out.println(et[2][i]);
				System.out.println(et[3][i]);
			}
		}
	}
	// c)
	public void eliminarGanadores() {
		for (int i = 0; i < nEnfre; i++) {
			if (!et[3][i].contentEquals("empate")) {
				/*
				 * Eliminen la columna
				 * */
			}
		}
	}
	// d)
	public void enfrentar(Ajedresista uno, Ajedresista dos, String fecha) {
		for (int i = 0; i < nEnfre; i++) {
			if (!et[2][i].contentEquals(fecha)) {
				/*
				 * Agreguen si cumple todas las condiciones
				 * */
			}
		}
	}
}
