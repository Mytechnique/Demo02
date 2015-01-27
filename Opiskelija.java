package fi.jamk;

/**
 * @author Mythe
 */

public class Opiskelija {
    
    String nimi;
    int motivaatio;
    int koulumatka;
    
    public Opiskelija()
    {
        this.nimi = "";
        this.motivaatio = 0;
        this.koulumatka = 0;
    }
    
    public Opiskelija(String nimi, int motivaatio, int koulumatka)
    {
        this.nimi = nimi;
        this.motivaatio = motivaatio;
        this.koulumatka = koulumatka;
    }
    
    public void setNimi(String nimi)
    {
        this.nimi = nimi;
    }
    
    public void setMatka(int matka)
    {
        this.koulumatka = matka;
    }
    
    public void setMotivaatio(int motivaatio)
    {
        this.motivaatio = motivaatio;
    }
    
    public String printAll()
    {
        return "Tämä on" + this.nimi + " hänen motivaationsa on " + this.motivaatio + " ja oppilaan koulumatka on " + this.koulumatka;
    }
}
