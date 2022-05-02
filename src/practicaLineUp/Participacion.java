package practicaLineUp;

import imonsh.Screen;

import java.util.List;

public class Participacion implements CallParticipacion{
    private List<Pieza> piezas;
    private Banda banda;

    public Participacion(List<Pieza> piezas, Banda banda) {
        this.piezas = piezas;
        this.banda = banda;
    }

    public List<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(List<Pieza> piezas) {
        this.piezas = piezas;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    @Override
    public void comenzarParticipacion(Screen s) {
        for (Pieza p: piezas
             ) {
            s.out("Tocando "+p.getNombre()+" by "+this.banda.getNombre());
            this.banda.tocar(p);
        }
    }
}
