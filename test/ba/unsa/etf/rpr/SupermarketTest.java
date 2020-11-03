package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private static Supermarket supermarket = new Supermarket();

    @Test
    public void testDodajArtiklIGeteraZaArtikle(){
        supermarket.dodajArtikl(new Artikl("Auto", 10000, "Golf"));
        Artikl[] a = supermarket.getArtikli();
        //for(Artikl a : supermarket.getArtikli()){
            assertEquals("Auto", a[0].getNaziv());
        //}
    }
}