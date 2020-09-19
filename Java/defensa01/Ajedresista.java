
public class Ajedresista {
	private String nombre;
	private int edad;
	private String sexo;
	private String pais;
	public Ajedresista() {
		nombre="Nils";
		edad=15;
		sexo="M";
		pais="Peru";
	}
	public Ajedresista(String n, int e) {
		nombre=n;
		edad=e;
		sexo="M";
		pais="Peru";
	}
	public Ajedresista(String n, int e,String s) {
		nombre=n;
		edad=e;
		sexo=s;
		pais="Peru";
	}
	public Ajedresista(String n, int e,String s, String p) {
		nombre=n;
		edad=e;
		sexo=s;
		pais=p;
	}
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Sexo: "+sexo);
		System.out.println("Pais: "+pais);
	}
}
