package ba.unsa.etf.rpr;

public class Supermarket {
    //max 1000 artikala
    private final int max = 1000;
    private Artikl[] artikli = null;
    private int trenutnaVelicina = 0;

    public Supermarket(){
        this.artikli = new Artikl[max];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public int getMax() {
        return max;
    }

    public void dodajArtikl(Artikl a) {
        artikli[trenutnaVelicina] = new Artikl(a);
        trenutnaVelicina = trenutnaVelicina + 1;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = null;
        for(int i = 0; i<trenutnaVelicina; i++){
            if(artikli[i].getKod().equals(kod)){
                temp = artikli[i];
                artikli[i] = null;
            }
        }
        return temp;
    }

    

    /*public int getTrenutnaVelicina() {
        return trenutnaVelicina;
    }*/


    //transakcije izmedju korpe i supermarketa rjesavaju se preko koda
    //potrebno omoguciti opciju prekida programa ili checkout
    //placanje se vrsi unosom iznosa i provjerava se da li je iznos negativan
    // odnosno da li je dovoljan
}
