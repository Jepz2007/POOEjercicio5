enum dificultad{
        FACIL,
        NORMAL,
        DIFICIL
    }
public class Cursos extends Cartas{
    private int creditos;
    private int puntos;

    public Cursos(int id, String nombreDescriptivo, int costeEnergia, String descripcion, int creditos, int puntos){
        super(id, nombreDescriptivo, costeEnergia, descripcion);
        this.creditos = creditos;
        this.puntos = puntos;
    }
    @Override
    public String toString() {
    return super.toString()
        + " | Créditos: " + creditos
        + " | Puntos: " + puntos;
}
 }