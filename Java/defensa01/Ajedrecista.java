public class Ajedrecista {
	private String nombre;
	private int edad;
	private String sexo;
	private String pais;
	public Ajedrecista() {
		nombre="Nils"; edad=15;
		sexo="M"; pais="Peru";
	}
	public Ajedrecista(String n, int e) {
		nombre=n; edad=e;
		sexo="M"; pais="Peru";
	}
	public Ajedrecista(String n, int e,String s) {
		nombre=n; edad=e;
		sexo=s; pais="Peru";
	}
	public Ajedrecista(String n, int e,String s, String p) {
		nombre=n; edad=e;
		sexo=s; pais=p;
	}
	public void mostrar() {
		System.out.println("Ajedrecista");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Sexo: "+sexo);
		System.out.println("Pais: "+pais);
		System.out.println();
	}
	public String getNombre() {
		return nombre;
	}
}
