
package practicaMultiverse;

import imonsh.Screen;

public class MainMultiverse {
        public static void main(String[] args) {
        Screen screenCapSpider = new Screen("Capitan Spider");
        Screen screenGhostSpider = new Screen("Ghost Spider");
        Screen screenSilk = new Screen("Silk");

        Spiderman capSpider = new CapitanSpider(
                "Flash Thomsom",
                "Capitan Spider",
                "Masculino",
                "Tierra 78127",
                "En esta tierra los hechos ocurrieron de forma muy similar a los ocurridos en la Tierra 616 solo que esta vez, Flash Thompson acude junto a Peter Parker a la exhibición y la araña pica al primero en lugar de al segundo",
                "capitan.jpg"
        );
        Spiderman ghostSpider = new GhostSpider(
                "Gwen Stacy",
                "Ghost Spider",
                "Femenino",
                "Tierra 65",
                "Ella reside en la \"tierra-65\", donde, en lugar de Peter Parker, Gwen Stacy fue mordida por la araña radiactiva, conduciéndola en una carrera como la Spider-Woman de su mundo.",
                "ghost.jpg"
        );
        Spiderman silk = new Silk(
                "Cynthia \"Cindy\" Moon",
                "Silk",
                "Femenino",
                "Tierra 616",
                "Peter no fue el único mordido por la araña, Cindy también fue picada por el mismo arácnido. Al igual que Peter, Cindy pronto desarrollo poderes arácnidos que se salieron de control, lo cual preocupó a sus padres.",
                "silk.jpg"
        );

        screenCapSpider.setVisible(true);
        screenCapSpider.showImage(capSpider.getPathImagen());
        screenCapSpider.out(capSpider.showMessage());

        screenGhostSpider.setVisible(true);

        screenGhostSpider.showImage(ghostSpider.getPathImagen());

        screenSilk.setVisible(true);
        screenSilk.showImage(silk.getPathImagen());
    }
}
