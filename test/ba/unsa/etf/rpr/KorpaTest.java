package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private static Korpa korpa;
    private static Artikl artikl;

/*    @BeforeEach
    private static void unosArtikalaUKorpu(){
        private static korpa = new Korpa();
        private static artikl = new Artikl("auto", 123, "1");
    }*/

    @Test
    public void testIzbacivanjaIzKorpe(){
        korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("auto", 123, "1"));
        //korpa.dodajArtikl(new Artikl("auto", 123, "2"));
        //korpa.dodajArtikl(new Artikl("auto", 123, "3"));
        artikl = korpa.izbaciArtiklSaKodom("1");

        assertNotNull(artikl);
        //assertNull(korpa.getArtikli().0);
    }

    @Test
    public void testDodavanjaArtiklaSaPrekoracenjem(){
        korpa = new Korpa();
        for(int i=0; i<50; i++){
            korpa.dodajArtikl(new Artikl("Auto", 10000, ("Golf"+String.valueOf(i+1))));
        }
        assertFalse(korpa.dodajArtikl(artikl));
    }

    @Test
    public void testOdredjivanjaCijeneIDodavanjaArtikla(){
        korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("auto", 123, "1"));
        korpa.dodajArtikl(new Artikl("auto", 123, "2"));
        korpa.dodajArtikl(new Artikl("auto", 123, "3"));
        assertEquals(369, korpa.dajUkupnuCijenuArtikala());
    }

}