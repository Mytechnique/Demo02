package fi.jamk;

/**
 * @author Mythe
 */

public class Kulkuneuvo {
    
    //ominaisuudet
    int nopeus;
    String nimi;
    
    //luokan alustajat eli konstruktorit
    public Kulkuneuvo()
    {
        this.nimi = "";
        this.nopeus = 0;
    }
    
    //metodi palauttaa kulkuneuvon tiedot merkkijonona
    public String tulostaTiedot()
    {
        return this.nimi + " " + this.nopeus;
    }
    
    //metodi palauttaa kulkuneuvon nimen 
    public String palautaNimi()
    {
        return this.nimi;
    }
    
    //metodi asettaa nopeuden
    public void asetaNopeus(int nopeus)
    {
        this.nopeus = nopeus;
    }
    
    //metodi asettaa nimen
    public void asetaNimi(String nimi)
    {
        this.nimi = nimi;
    }
    
}
