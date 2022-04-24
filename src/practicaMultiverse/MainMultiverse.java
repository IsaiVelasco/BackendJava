
package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

import java.awt.*;

public class MainMultiverse {
        public static void main(String[] args) {
                String fonts[]
                        = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

                for (int i = 0; i < fonts.length; i++) {
                        System.out.println(fonts[i]);
                }
        Screen screenCapSpider = new Screen("Capitan Spider");
        Screen screenGhostSpider = new Screen("Ghost Spider");
        Screen screenSilk = new Screen("Silk");

        CapitanSpider capSpider = new CapitanSpider(
                "Flash Thomsom",
                "Capitan Spider",
                "Masculino",
                "Tierra 78127",
                "En esta tierra los hechos ocurrieron de forma muy similar a los ocurridos en la Tierra 616 solo que esta vez, Flash Thompson acude junto a Peter Parker a la exhibición y la araña pica al primero en lugar de al segundo",
                "capitan.gif"
        );
        GhostSpider ghostSpider = new GhostSpider(
                "Gwen Stacy",
                "Ghost Spider",
                "Femenino",
                "Tierra 65",
                "Ella reside en la \"tierra-65\", donde, en lugar de Peter Parker, Gwen Stacy fue mordida por la araña radiactiva, conduciéndola en una carrera como la Spider-Woman de su mundo.",
                "ghost.gif"
        );
        Silk silk = new Silk(
                "Cynthia \"Cindy\" Moon",
                "Silk",
                "Femenino",
                "Tierra 616",
                "Peter no fue el único mordido por la araña, Cindy también fue picada por el mismo arácnido. Al igual que Peter, Cindy pronto desarrollo poderes arácnidos que se salieron de control, lo cual preocupó a sus padres.",
                "silk.gif"
        );

        screenCapSpider.setVisible(true);
        capSpider.showMessage(screenCapSpider, Colors.black, Colors.DarkPurple);
        screenCapSpider.showImage(capSpider.getPathImagen());
        screenCapSpider.out(capSpider.soltarTela(), Color.BLACK);

        screenGhostSpider.setVisible(true);
        ghostSpider.showMessage(screenGhostSpider, Colors.black, Colors.DarkPurple);
        screenGhostSpider.showImage(ghostSpider.getPathImagen());
        screenGhostSpider.out(ghostSpider.soltarTela(), Color.MAGENTA);
        ghostSpider.viajarAOtroUniverso(capSpider.getTierraOrigen(), screenCapSpider);

        screenSilk.setVisible(true);
        screenSilk.getTextPane().setBackground(Colors.DarkPurple);
        silk.showMessage(screenSilk, Colors.white, Colors.Innuendo);
        screenSilk.showImage(silk.getPathImagen());
        screenSilk.out(silk.soltarTela(), Color.GREEN);
    }
}
