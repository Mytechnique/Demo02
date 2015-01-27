package fi.jamk;

/**
 *
 * @author Mythe
 */

public class CD {
    
    //ominaisuudet
    String cd;
    String kappale;
    String artisti;
    int vuosiluku;
    
    //Konstruktori
    public CD(String cd, String kappale, String artisti, int vuosiluku)
    {
        this.cd = cd;
        this.kappale = kappale;
        this.artisti = artisti;
        this.vuosiluku = vuosiluku;
    }
    
    //Konstruktori jossa parametrinä annetaan vain CD:n nimi
    public CD()
    {
        this.cd = "";
    }
    
    //Metodeja
    
    public void setArtisti(String artisti)
    {
        this.artisti = artisti;
    }
    
    public void setKappale(String kappale)
    {
        this.kappale = kappale;
    }
    
    public void setCd(String cd)
    {
        this.cd = cd;
    }
    
    public void setVuosiluku(int vuosiluku)
    {
        this.vuosiluku = vuosiluku;
    }
    
    public String printAll()
    {
        return this.cd + " " + this.artisti + " " + this.kappale + " " + this.vuosiluku;
    }
    
    public String printCD()
    {
        return this.cd;
    }
}
