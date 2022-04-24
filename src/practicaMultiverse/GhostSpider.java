
package practicaMultiverse;

import imonsh.Screen;

public class GhostSpider extends Spiderman implements GhostSpiderActionCallbacks{
    public GhostSpider(String nombre, String alias, String genero, String tierraOrigen, String resumenHistoria, String pathImagen) {
        super(nombre, alias, genero, tierraOrigen, resumenHistoria, pathImagen);
    }

    @Override
    public String viajarAOtroUniverso(String universo, Screen otroUiverso) {
        return "\nUsando mi reloj para ciajar a "+universo;
    }

    @Override
    public String usarPensamientoAnalitico() {
        return "\nNeuronas pensando al full";
    }

    @Override
    public String soltarTela() {
        return "\nSoltando tela con mecanismo que filtra humedad sin tener que recargar a cada rato.";
    }

    @Override
    public String aderirseAUnMuro() {
        return "\nEGhost scalando muro elegantemente";
    }
}
