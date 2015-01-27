package fi.jamk;

/**
 *
 * @author Mythe
 */
public class Tehtava09 {
    
    public static void main(String args[])
    {
        Kulkuneuvo auto = new Kulkuneuvo();
        auto.asetaNimi("Menopeli");
        auto.asetaNopeus(120);
        
        Kulkuneuvo mersu = new Kulkuneuvo();
        mersu.asetaNimi("Merseedespents");
        mersu.asetaNopeus(20);
        
        //Tulostaa Kulkuneuvolle auto asetetun nimen
        System.out.println("Auton nimi on: " + auto.palautaNimi()); 
        
        //Tulostaa Kulkuneuvon auto tiedot
        System.out.println("Tässä auton kaikki tiedot: " + auto.tulostaTiedot()); 
        //Tulostaa Kulkuneuvon mersu tiedot
        System.out.println("Ja tässä mersun kaikki tiedot: " + mersu.tulostaTiedot());
        
        
    }
}
