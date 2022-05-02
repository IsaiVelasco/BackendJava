package practicaLineUp;

import java.util.List;

public class Participacion {
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
}
