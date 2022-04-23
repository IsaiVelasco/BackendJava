
package practicaMultiverse;

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


    public String showMessage() {
        return "Spiderman{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", tierra de rigen='" + tierraOrigen + '\'' +
                ", historia='" + resumenHistoria + '\'' +
                '}';
    }
}
