enum Dificultad{
        FACIL,
        NORMAL,
        DIFICIL
    }
public class Cursos extends Cartas{
    private String materia;
    private int creditos;
    private Dificultad dificultad;
    
    public Cursos(int id, String nombreDescriptivo, int costeEnergia, String descripcion, String materia, int creditos,
            Dificultad dificultad) {
        super(id, nombreDescriptivo, costeEnergia, descripcion);
        this.materia = materia;
        this.creditos = creditos;
        this.dificultad = dificultad;
    }

 }
