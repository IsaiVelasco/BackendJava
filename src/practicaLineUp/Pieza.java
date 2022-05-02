package practicaLineUp;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;

public class Pieza extends Canon{
    private File archivo;
    private Clip clip;
    private AudioInputStream ais;
    private String extension;


    public Pieza(String nombre, int duracion, int tempo, String extension) {
        super(nombre, duracion, tempo);
        this.extension = extension;
        this.archivo = new File(
                FileSystems.getDefault().getPath("")
                        .toAbsolutePath() + "/audio/"+nombre+extension);
        try {
            this.ais = AudioSystem.getAudioInputStream(archivo);
            this.clip = AudioSystem.getClip();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
