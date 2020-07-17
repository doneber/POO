import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArchivoContactos ac = new ArchivoContactos("C://Users//PC//Desktop//misContactos.txt");
		ac.listar();
		
	}
}
