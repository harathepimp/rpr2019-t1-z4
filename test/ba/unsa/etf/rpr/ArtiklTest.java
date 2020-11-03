package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    private Artikl artikl = new Artikl("auto", 10000, "M83");

    @Test
    public void testGeteraISeteraZaKod(){
        artikl.setKod("VW");
        assertEquals("VW", artikl.getKod());
    }
}