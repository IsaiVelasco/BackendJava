package practicaLineUp;


public class Canon {
    private String nombre;
    private int duracion;
    private int tempo;

    public Canon(String nombre, int duracion, int tempo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tempo = tempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
