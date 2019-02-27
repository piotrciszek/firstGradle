package firstGradle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pociag pociag1 = new Pociag("01", 111, KlasaPociagu.EKONOMIA, 20, 2, 80, 200, false);
        Pociag pociag2 = new Pociag("02", 121, KlasaPociagu.STANDARD, 10, 4, 100, 300, true);
        Pociag pociag3 = new Pociag("03", 131, KlasaPociagu.BIZNES, 5, 5, 120, 400, false);
        Pociag pociag4 = new Pociag("04", 141, KlasaPociagu.EKSKLUZYWNY, 3, 3, 150, 250, true);
        Pociag pociag5 = new Pociag("05", 151, KlasaPociagu.EKONOMIA, 20, 7, 130, 800, false);
        Pociag pociag6 = new Pociag("06", 161, KlasaPociagu.STANDARD, 10, 8, 160, 900, true);
        Pociag pociag7 = new Pociag("07", 171, KlasaPociagu.BIZNES, 5, 6, 150, 650, false);
        Pociag pociag8 = new Pociag("08", 181, KlasaPociagu.EKSKLUZYWNY, 3, 1, 200, 100, true);
        Pociag pociag9 = new Pociag("09", 191, KlasaPociagu.EKONOMIA, 20, 9, 140, 950, false);

        List<Pociag> lista = new ArrayList<>(Arrays.asList(pociag1, pociag2, pociag3, pociag4, pociag5, pociag6, pociag7, pociag8, pociag9));
        MetodyPociag metodyPociag = new MetodyPociag(lista);
        metodyPociag.wypiszWszystkiePociagiStream();
        System.out.println("---------");
        metodyPociag.wypiszWszystkiePociagi();
        System.out.println("---------");
        metodyPociag.wypiszWszystkiePociagiEkonomiczne();
        System.out.println("---------");
        System.out.println(metodyPociag.zwrocPociagKlasy(KlasaPociagu.BIZNES));
        System.out.println("---------");
        System.out.println(metodyPociag.zwrocNajbardziejOpoziony());
        System.out.println("---------");
        metodyPociag.zwrocNajbardziejOpozniony2();
        System.out.println("---------");
        System.out.println(metodyPociag.zworc3NajbardziejOplacalne());
        System.out.println("---------");
        System.out.println("---------");
        System.out.println(metodyPociag.zwrocNajbardziejOplacalny());

    }
}
