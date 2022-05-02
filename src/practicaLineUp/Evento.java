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

        s.setVisible(true);
        cuentaRegresiva(s);
        for (Participacion part: participaciones
             ) {
            cambiarEscenario(s, part);
            part.comenzarParticipacion(s);
            pausaDeCambio(s, part);
        }
    }
    private void refrescaTitulo(Screen s){
        s.cls();
        s.out(this.nombre+"\n","Impact",25, Colors.FussionRed);
        s.out(this.lugar+"\n","Yu Gothic UI",18, Colors.BalticSea);
        s.out(showList(),"Yu Gothic UI",12, Colors.black);
    }
    private void cuentaRegresiva(Screen s){
        refrescaTitulo(s);
        try {
            s.showImage("bandas/comenzando.gif");
            Thread.sleep(7490);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void pausaDeCambio(Screen s, Participacion part){
        refrescaTitulo(s);
        s.showImage("bandas/preparando.gif");
        s.out("\nPreparando Escenario para la banda "+part.getBanda().getNombre()+"...");
        try {
            Thread.sleep(4000);
            cuentaRegresiva(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    //Muestra el escenario para cada participacion
    @Override
    public void cambiarEscenario(Screen s, Participacion part){
        refrescaTitulo(s);
        s.showImage(part.getBanda().getImagen());

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

    public String showList(){
        String lista = "\nPARTICIPACIONES\n----------------------------------";
        for (Participacion part:participaciones
             ) {
            lista+="\n*Banda: "+part.getBanda().getNombre();
            for (Pieza p:part.getPiezas()
                 ) {
                lista+="\n\t-"+p.getNombre()+" | Tiempo: "+p.getDuracion()/1000;
            }
        }
        lista+="\n\n";
        return lista;
    }
}
