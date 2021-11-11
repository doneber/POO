
package agregacioncomposicion;

public class Celular {
    private String modelo;
    private Bateria bateria;
    private int nroChips;
    private Chip[] chips;

    public Celular(String modelo, int cantMAh, String marcaBateria){
        this.modelo=modelo;
        this.bateria = new Bateria(cantMAh, marcaBateria);
        this.nroChips = 0;
        this.chips = new Chip[2];
    }
    
    public void morstrar(){
        System.out.println("Modelo: "+modelo);
        bateria.mostrar();
        System.out.println("Número de chips: "+ nroChips);
        for (int i=0; i < nroChips; i++){
            chips[i].mostrar();
        }
    }
    
    public void agregarChip(Chip nuevoChip){
        if (nroChips < 2){
            chips[nroChips]=nuevoChip;
            nroChips++;
        }
    } 
}
