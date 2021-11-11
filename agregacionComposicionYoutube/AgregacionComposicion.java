public class AgregacionComposicion {

    public static void main(String[] args) {
        Celular c1= new Celular ("A10PRO", 3400, "Samsung");
            
        Chip entel = new Chip("Entel", 7457854);
        Chip tigo = new Chip("Tigo", 83743843);
        
        c1.agregarChip(entel);
        c1.agregarChip(tigo);
        
        c1.morstrar();
        
    }
    
}
