
package practicaMultiverse;

public class Silk extends Spiderman implements SilkActionCallbacks{

    public Silk(String nombre, String alias, String genero, String tierraOrigen, String resumenHistoria, String pathImagen) {
        super(nombre, alias, genero, tierraOrigen, resumenHistoria, pathImagen);
    }

    @Override
    public String extraAgilidad() {
        return "\nUsando extraagilidad";
    }

    @Override
    public String garrasRetractiles() {
        return "\nUsando garras para atacar";
    }

    @Override
    public String soltarTela() {
        return "\nSoltando telarañas con glandulas secretoras de los dedos";
    }

    @Override
    public String aderirseAUnMuro() {
        return "\nAderiendose controlando mentalmente el flujo de atracción " +
                "interatómica (electrostática) entre el límite molecular de las superficies,";
    }
}
