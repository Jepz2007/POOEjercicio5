import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static ArrayList <Cartas> listaCartas = new ArrayList <Cartas>();

    public static void main(String [] args) {
        Catedraticos Tiago = new Catedraticos(101, "Santiago Solorzano", 3, "Maestro de programación. Hace piñatas chidas.",                    "Computación", 30, 15);
        Catedraticos Saul = new Catedraticos(102, "Saul Buenhombre", 10, "Maestro de química. Te hará recordar el balanceo.",                   "Química", 100, 5);
        Catedraticos Amalia = new Catedraticos(103, "Amalia Ruano", 8, "Maestra de estadística. Prohibe la mala palabra (promedio)",            "Estadística", 95, 25);
        Cursos Poo = new Cursos (201, "Programación Orientada a Objetos", 7, "Nunca entendi esta clase, ayuda porfavor.",                       6, 9);
        Cursos Calculo = new Cursos (202, "Cálculo", 10, "Olvidaste ese signo negativo. Ahora tendrás que repetir el ejercicio por completo.",  10, 10);
        Cursos Assembler = new Cursos (203, "Assembler", 5, "En teoría, quieres que un componente explote. En práctica, no.",                   5, 7);
        EventosCampus Elecciones = new EventosCampus (301, "Elecciones", 10, "Vota por tus líderes favoritos. Recuerda que ellos tendrán en control tu futuro completo (no es cierto)");
        EventosCampus Expo = new EventosCampus (302, "ExpoUVG", 3, "Conecta con más de 60 empresas durante la semana.");
        EventosCampus Parciales = new EventosCampus (303, "Semana de Parciales", 10, "Pon a prueba tus conocimientos durante toda esta semana.");
        EventosCampus Club = new EventosCampus (304, "Feria de Clubes", 4, "Unete a tu club favorito para conectar con más personas.");

        listaCartas.add(Tiago); 
        listaCartas.add(Saul);
        listaCartas.add(Amalia);
        listaCartas.add(Poo);
        listaCartas.add(Calculo);
        listaCartas.add(Assembler);
        listaCartas.add(Elecciones);
        listaCartas.add(Expo);
        listaCartas.add(Parciales);
        listaCartas.add(Club);

        Menu menu = new Menu();
        menu.mostrarMenu();
    };

    public static void lista(){
        System.out.println("Hola");
    };

    public static void buscar(){
        System.out.println("Hola");
    };

    public static void ordenar(){
        listaCartas.sort(Comparator.comparingInt(Cartas::getCosteEnergia).reversed());

        lista();
    };

    public static void fin(){
        System.out.println("Programa finalizado.");
    };
};