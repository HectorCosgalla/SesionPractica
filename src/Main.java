
public class Main {
    public static void main(String[] args) {
        int[][] calificacionesPrueba = {{80,60,70},{79,94,87},{64,66,88},{70,72,66},{99,97,82}};
        String[][] nombreYGrupos = {{"Juan","A"},{"Alberto","A"},{"Pedro","B"},{"Victor","B"},{"Adriana","C"}};
        int[][] edadYSemestre ={{21,5},{21,5},{45,1},{19,1},{22,7}};
        int numeroAlumnos = 5;
        
        App app = new App(); 
        app.configuracion(numeroAlumnos, calificacionesPrueba, nombreYGrupos, edadYSemestre);
        app.menu();
    }
}
