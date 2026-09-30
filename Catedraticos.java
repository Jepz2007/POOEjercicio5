enum Departamentos{
    COMPUTACION,
    CIENCIAS,
    MARKETING,
    MATEMATICA,
    HUMANIDADES
}
public class Catedraticos extends Cartas {
    private Departamentos departamento;
    private int ptsLlamadaAtencion;
    private int ptsTiempoAtencion;
    
    
    public Catedraticos(int id, String nombreDescriptivo, int costeEnergia, String descripcion,
            Departamentos departamento, int ptsLlamadaAtencion, int ptsTiempoAtencion) {
        super(id, nombreDescriptivo, costeEnergia, descripcion);
        this.departamento = departamento;
        this.ptsLlamadaAtencion = ptsLlamadaAtencion;
        this.ptsTiempoAtencion = ptsTiempoAtencion;
    }



}  