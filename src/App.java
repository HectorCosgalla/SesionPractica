import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private ArrayList<Calificaciones> calificaciones = new ArrayList<>();
    private ArrayList<DatosAlumno> datosAlumnos = new ArrayList<>();

    public void configuracion(int numeroAlumnos, int[][] calificacionesPrueba, String[][] nombreYGrupos, int[][] edadYSemestre){

        System.out.println("Cuantos alumnos hay para reprobar?");
        System.out.println(numeroAlumnos);
        

        int contador = 0;
        while (contador < numeroAlumnos) {
            Calificaciones calificacionesTemporales = new Calificaciones();
            DatosAlumno datosAlumno = new DatosAlumno();

            System.out.println("ingrese el nombre del reprobado #"+String.valueOf(contador+1));
            System.out.println(nombreYGrupos[contador][0]);
            System.out.println("Ingrese la edad");
            System.out.println(edadYSemestre[contador][0]);
            System.out.println("Ingrese el grupo");
            System.out.println(nombreYGrupos[contador][1]);
            System.out.println("Ingrese el semestre");
            System.out.println(edadYSemestre[contador][1]);

            datosAlumno.setNombre(nombreYGrupos[contador][0]);
            datosAlumno.setEdad(edadYSemestre[contador][0]);
            datosAlumno.setGrupo(nombreYGrupos[contador][1]);
            datosAlumno.setSemestre(edadYSemestre[contador][1]);

            this.datosAlumnos.add(datosAlumno);
            for(int i = 0;i < 3;i++){
                System.out.println("Ingrese la calificacion "+String.valueOf(i+1));
                System.out.println(calificacionesPrueba[contador][i]);
                
                switch (i) {
                    case 0:
                        calificacionesTemporales.setParcial1(calificacionesPrueba[contador][i]);
                        break;
                    case 1:
                        calificacionesTemporales.setParcial2(calificacionesPrueba[contador][i]);
                        break;
                    case 2:
                        calificacionesTemporales.setProyecto(calificacionesPrueba[contador][i]);
                        break;
                }

            }
            this.calificaciones.add(calificacionesTemporales);

            contador++;
        }
    }
    
    public void menu(){
        try (Scanner scanner = new Scanner(System.in)) {
            int decision = 0;
            System.out.print("\nMENU\n\n");
            System.out.println("1. Calcular promedios finales.\n");
            System.out.println("2. Ordenar alfabeticamente.\n");
            System.out.println("3. Reporte de alumnos aprobados.\n");
            System.out.println("4. Reporte de alumnos mayores.\n");
            System.out.println("5. Salir.\n: ");
            do{
                decision = scanner.nextInt();
                switch (decision) {
                    case 1:
                        promedios();
                        break;
                    case 2:
                        ordenamiento();
                        break;
                    case 3:
                        reporteAprobados();
                        break;
                    case 4:
                        reporteMayores();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Pon una opcion valida pedazo de pendejo!");
                        break;
                }
            }while(decision != 5);
        }
    }

    private void promedios(){
        System.out.println("Se calcularon unos promedios pero fue tan rapido que no lo viste");
    }

    private void ordenamiento(){
        System.out.println("Se ordenaron los nombres tan rapido que ni lo notaste");
    }

    private void reporteAprobados() {
        System.out.println("Aqui irian los alumnos aprobados... si tan solo hubieran alumnos aprobados ;-;");
    }

    private void reporteMayores() {
        System.out.println("FELICIDADES! acabas de hackear la nasa y sin medidas de seguridad. \nsolo es cuestion de tiempo antes que el FBI, la NSA, el interpol, el MI5 y Beijing te violen");
    }
}
