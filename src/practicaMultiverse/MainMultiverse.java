
package practicaMultiverse;

import imonsh.Screen;

public class MainMultiverse {
        public static void main(String[] args) {
        Screen screenCapSpider = new Screen("Capitan Spider");
        Screen screenGhostSpider = new Screen("Ghost Spider");
        Screen screenSilk = new Screen("Silk");

        Spiderman capSpider = new CapitanSpider(
                "Capitan Spider",
                "Capitan Spider",
                "Masculino",
                "",
                "",
                ""
        );
        Spiderman ghostSpider = new GhostSpider(
                "Capitan Spider",
                "Capitan Spider",
                "Masculino",
                "",
                "",
                ""
        );
        Spiderman silk = new Silk(
                "Capitan Spider",
                "Capitan Spider",
                "Masculino",
                "",
                "",
                ""
        );

        screenCapSpider.setVisible(true);
        screenCapSpider.showImage("capitan.jpg");
    }
}
