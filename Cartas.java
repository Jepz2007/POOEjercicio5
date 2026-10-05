public class Cartas implements Comparable<Cartas> {

    private int id;
    private String nombreDescriptivo;
    private int costeEnergia;
    private String descripcion;
    
    public Cartas(int id, String nombreDescriptivo, int costeEnergia, String descripcion) {
        this.id = id;
        this.nombreDescriptivo = nombreDescriptivo;
        this.costeEnergia = costeEnergia;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombreDescriptivo() {
        return nombreDescriptivo;
    }

    public void jugarCarta(){

    }

    public int getCosteEnergia(){
        return costeEnergia;
    }

    @Override
    public int compareTo(Cartas otraCarta){
        return Integer.compare(this.costeEnergia, otraCarta.costeEnergia);
    }

    @Override
    public String toString(){
        return id + "-" + nombreDescriptivo + " | Energía: " + costeEnergia + " | " + descripcion;
    }
}