public class Calificaciones {
    private int parcial1;
    private int parcial2;
    private int proyecto;

    public Calificaciones() {
        
    }

    public int getParcial1() {
        return parcial1;
    }

    public int getParcial2() {
        return parcial2;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setParcial1(int parcial1) {
        this.parcial1 = parcial1;
    }

    public void setParcial2(int parcial2) {
        this.parcial2 = parcial2;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }
    
    @Override
    public String toString() {
        return this.parcial1 +" "+this.parcial2+" "+this.proyecto;
    }
}
