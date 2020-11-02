package ba.unsa.etf.rpr;

public class Korpa {
    //max 50 artikala
    private final int max = 50;
    //na pocetku prazna
    private Artikl[] artikli = null;
    private int trenutnaVelicina = 0;

    public Korpa(){
        artikli = new Artikl[max];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        if(trenutnaVelicina < max){
            artikli[trenutnaVelicina] = new Artikl(a);
            trenutnaVelicina = trenutnaVelicina + 1;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = null;
        for(int i = 0; i<trenutnaVelicina; i++){
            if(this.artikli[i].getKod().equals(kod)){
                temp = artikli[i];
                artikli[i] = null;
            }
        }
        return temp;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i=0; i<trenutnaVelicina; i++) {
            if(artikli[i] != null) suma = suma + artikli[i].getCijena();
        }
        return suma;
    }


    /*public int getTrenutnaVelicina() {
        return trenutnaVelicina;
    }*/



    //pri vracanju i ubacivanju potrebno mijenjati stanje u marketu
    //artikli se mogu ubacivati i izbacivati
    //potreban ispis artikala sa kodovima prije ubacivanja, te se unosi
    //kod za ubacivanje
    //za izbacivanje iz korpe potrebno ispisati sve artikle koji se nalaze
    //u korpi sa njihovim kodovima

}
