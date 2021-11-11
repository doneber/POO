
public class Chip {
   private String empresa;
   private int numero;

    public Chip(String empresa, int numero) {
        this.empresa = empresa;
        this.numero = numero;
    }
   
    public void mostrar(){
        System.out.println("\tEmpresa: "+ empresa);
        System.out.println("\tNumero de cel: "+ numero);
    }
    
}
