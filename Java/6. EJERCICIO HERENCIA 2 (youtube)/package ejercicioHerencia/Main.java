package ejercicioHerencia;

public class Main {
	public static void main(String[] args) {
		/* Instanciando objetos (a) */
		Persona juan = new Persona("Juan", "9823415", "1852-PHD");
		Afiliado jose = new Afiliado("Jose", "7235194", "1438-ABC",3);
		Afiliado pedro = new Afiliado("Pedro", "6239801", "1784-RUY",1);
		
		Auto auto1 = new Auto("1852-PHD", 5);
		Auto auto2 = new Auto("1438-ABC", 7);
		Moto moto = new Moto("1784-RUY", "Forza 750-2021");
		
		/* Mostrando objetos (a) */
		juan.mostrar();
		System.out.println("-------------------");
		jose.mostrar();
		System.out.println("-------------------");
		pedro.mostrar();
		System.out.println("-------------------");
		auto1.mostrar();
		System.out.println("-------------------");
		auto2.mostrar();
		System.out.println("-------------------");
		moto.mostrar();
		/* Comparando (b) */
		System.out.println("-------------------");
		jose.comparar(pedro);
		/* Verificando (c) */
		System.out.println("-------------------");
		jose.verificar(moto);
	}
}



