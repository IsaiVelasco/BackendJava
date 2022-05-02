package practicaLineUp;

import imonsh.Colors;
import imonsh.Screen;

import java.util.ArrayList;
import java.util.List;

public class Evento  implements CallEvento{
    private String nombre;
    private String lugar;
    private List<Participacion> participaciones;

    public Evento(String nombre, String lugar, List<Participacion> participaciones) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.participaciones = participaciones;
    }

    public Evento(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.participaciones = new ArrayList<>();
    }

    @Override
    public void runEvent(Screen s) {
        for (Participacion part: participaciones
             ) {
            cambiarEscenario(s, part);
            part.comenzarParticipacion(s);
        }
    }
    //Muestra el escenario para cada participacion
    @Override
    public void cambiarEscenario(Screen s, Participacion part){
        s.cls();

        s.out(this.nombre+"\n","Impact",25, Colors.FussionRed);
        s.out(this.lugar+"\n","Yu Gothic UI",25, Colors.BalticSea);
        s.showImage(part.getBanda().getImagen());
        s.repaint();
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }


}
