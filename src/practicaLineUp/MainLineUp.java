package practicaLineUp;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;

public class MainLineUp {

    public static void main(String[] args) {
         final File archivowav;
         Clip clip;
         AudioInputStream audioInputStream;

        archivowav = new File(
                FileSystems.getDefault().getPath("")
                        .toAbsolutePath() + "/audio/mezcla.wav");

        try {
            audioInputStream = AudioSystem.getAudioInputStream(archivowav);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            System.out.println("audio reproduciendo");
            clip.start();
            Thread.sleep(32100);
            System.out.println("audio finalizado");
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void play(){

    }
}
