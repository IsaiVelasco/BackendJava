package practicaLineUp;

import javax.sound.sampled.*;
import java.applet.AudioClip;
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
                        .toAbsolutePath() + "/audio/concierto1.wav");

        try {
            audioInputStream = AudioSystem.getAudioInputStream(archivowav);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void play(){

    }
}
