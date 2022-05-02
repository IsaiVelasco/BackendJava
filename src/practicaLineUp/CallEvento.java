package practicaLineUp;

import imonsh.Screen;

public interface CallEvento {
    public void runEvent(Screen s);
    public void cambiarEscenario(Screen s, Participacion part);
}
