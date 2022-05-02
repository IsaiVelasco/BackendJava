package practicaLineUp;

import java.util.List;

public class Evento {
    private String nombre;
    private List<Participacion> participaciones;

    public Evento(String nombre, List<Participacion> participaciones) {
        this.nombre = nombre;
        this.participaciones = participaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Participacion> getParticipaciones() {
        return participaciones;
    }

    public void setParticipaciones(List<Participacion> participaciones) {
        this.participaciones = participaciones;
    }
}
