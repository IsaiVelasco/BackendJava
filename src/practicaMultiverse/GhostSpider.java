
package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class GhostSpider extends Spiderman implements GhostSpiderActionCallbacks{
    public GhostSpider(String nombre, String alias, String genero, String tierraOrigen, String resumenHistoria, String pathImagen) {
        super(nombre, alias, genero, tierraOrigen, resumenHistoria, pathImagen);
    }

    @Override
    public void viajarAOtroUniverso(String universo, Screen otroUiverso) {
        otroUiverso.repaint();
        otroUiverso.out("\n");
        otroUiverso.out("\nGhost usando su poder para viajar al universo de "+universo+"\n", Color.MAGENTA);
        otroUiverso.showImage("ghost-uni.gif");

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
