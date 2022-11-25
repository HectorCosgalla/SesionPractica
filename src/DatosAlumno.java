
public class DatosAlumno {
    private String nombre;
    private int edad;
    private String grupo;
    private int semestre;

    public DatosAlumno(){

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public String toString() {
        return "El alumno "+this.nombre+" con "+this.edad+" años de edad, se encuentra en el semestre "+this.semestre+" grupo "+this.grupo;
    }
}
