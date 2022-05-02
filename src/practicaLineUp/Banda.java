package practicaLineUp;

import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;
import java.util.List;

public class Banda implements CallBanda{
    private String nombre;
    private String imagen;



    public Banda(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    @Override
    public void tocar(Pieza pieza) {
        Runnable play = new Runnable() {
            @Override
            public void run() {
                try {
                    pieza.getClip().open(pieza.getAis());
                    pieza.getClip().start();
                    Thread.sleep(pieza.getDuracion());
                    pieza.getClip().close();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread tocando = new Thread(play);
        tocando.start();
    }

}
