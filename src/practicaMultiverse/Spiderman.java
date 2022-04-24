
package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

import java.awt.*;

public abstract class Spiderman {
    private String nombre;
    private String alias;
    private String genero;
    private String tierraOrigen;
    private String resumenHistoria;
    private String pathImagen;

    public Spiderman(String nombre, String alias, String genero, String tierraOrigen, String resumenHistoria, String pathImagen) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.tierraOrigen = tierraOrigen;
        this.resumenHistoria = resumenHistoria;
        this.pathImagen = pathImagen;
    }

    public abstract String soltarTela();
    public abstract String aderirseAUnMuro();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTierraOrigen() {
        return tierraOrigen;
    }

    public void setTierraOrigen(String tierraOrigen) {
        this.tierraOrigen = tierraOrigen;
    }

    public String getResumenHistoria() {
        return resumenHistoria;
    }

    public void setResumenHistoria(String resumenHistoria) {
        this.resumenHistoria = resumenHistoria;
    }

    public String getPathImagen() {
        return pathImagen;
    }

    public void setPathImagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }


    public void showMessage(Screen s, Color ctext, Color ctitle) {
        s.out(alias+"\n","Impact",25, Colors.FussionRed);
        s.out("Nombre: ",
                "Acme",12, ctext);
        s.out(nombre,
                "Yu Gothic UI",12, ctext);
        s.out("\tGenero: ",
                "Acme",12, ctext);
        s.out(genero,
                "Yu Gothic UI",12, ctext);
        s.out("\tOrigen: ",
                "Acme",12, ctext);
        s.out(tierraOrigen,
                "Yu Gothic UI",12, ctext);
        s.out("\n\nHISTORIA\n\n","Comic Sans MS",15, ctitle);
        s.out(resumenHistoria+"\n","Yu Gothic UI",12, ctext);

    }
}
