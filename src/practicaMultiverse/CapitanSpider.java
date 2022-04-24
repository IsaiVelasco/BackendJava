
package practicaMultiverse;

public class CapitanSpider extends Spiderman implements CapitanSpiderActionCallbacks{


    public CapitanSpider(String nombre, String alias, String genero, String tierraOrigen, String resumenHistoria, String pathImagen) {
        super(nombre, alias, genero, tierraOrigen, resumenHistoria, pathImagen);
    }

    @Override
    public String soltarTela() {
        return "\nSacando tela por mis entrañas";
    }

    @Override
    public String aderirseAUnMuro() {
        return "\nEscalando muro con manos y pies";
    }

    @Override
    public boolean levantarPeso(float peso) {
        return peso <= 10;
    }

    @Override
    public String lanzarAtaqueFlash() {
        return "\nLanzANDO ATAQUE FLASH";
    }
}
