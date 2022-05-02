package practicaLineUp;

import imonsh.Screen;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;

public class MainLineUp {

    public static void main(String[] args) {
        //Datos banda 1
        Banda freeSky = new Banda("Free Sky", "bandas/Drummers.gif");
        Pieza cielo = new Pieza("Cielo",32000, 115, ".wav");
        Pieza war = new Pieza("War", 32000, 115, ".wav");
        List<Pieza> piezasFreeSky = new ArrayList<>();
        piezasFreeSky.add(cielo);
        piezasFreeSky.add(war);
        System.out.println("Todo va bien");
        //Datos banda 2
        Banda drummers = new Banda("Drummers", "bandas/freeSkyc.gif");
        Pieza battle = new Pieza("Battle", 32000, 115, ".wav");
        List<Pieza> piezasDrummers = new ArrayList<>();
        piezasDrummers.add(battle);

        Evento concierto = new Evento("Talent Music", "Auditorio CDMX");

        concierto.getParticipaciones().add(new Participacion(piezasFreeSky, freeSky));
        concierto.getParticipaciones().add(new Participacion(piezasDrummers, drummers));

        Screen lugar = new Screen(concierto.getLugar());
        concierto.runEvent(lugar);
    }

}
