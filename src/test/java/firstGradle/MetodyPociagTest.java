package firstGradle;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class MetodyPociagTest {

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


    @Test
    public void testWypiszWszystkiePociagiStream() {
    }

    @Test
    public void wypiszWszystkiePociagi() {
    }

    @Test
    public void testWypiszWszystkiePociagiEkonomiczne() {
        /*MetodyPociag metodyPociag = new MetodyPociag(lista);
        List<Pociag> expected = new ArrayList<>();
        expected.add(pociag1);
        expected.add(pociag5);
        expected.add(pociag9);
        assertArrayEquals(expected, metodyPociag.wypiszWszystkiePociagiEkonomiczne());*/

    }

    @Test
    public void TestZwrocPociagKlasy() {
        List<Pociag> expected = new ArrayList<>();
        expected.add(pociag1);
        expected.add(pociag5);
        expected.add(pociag9);
        assertEquals(expected, metodyPociag.zwrocPociagKlasy(KlasaPociagu.EKONOMIA));
    }

    @Test
    public void testZwrocNajbardziejOpoziony() {
        List<Pociag> expected = new ArrayList<>();
        expected.add(pociag1);
        assertEquals(expected, metodyPociag.zwrocNajbardziejOpoziony());

    }

    @Test
    public void testZwrocNajbardziejOpozniony2() {
        List<Pociag> expected = new ArrayList<>();
        expected.add(pociag1);
        assertEquals(expected, metodyPociag.zwrocNajbardziejOpoziony());

    }

    @Test
    public void testZworc3NajbardziejOplacalne() {
        assertEquals(Optional.of(pociag9), metodyPociag.zworc3NajbardziejOplacalne());
    }

    @Test
    public void testZwrocNajbardziejOplacalny() {
        assertEquals(pociag9, metodyPociag.zwrocNajbardziejOplacalny());
    }
}