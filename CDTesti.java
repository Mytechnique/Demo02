package fi.jamk;

/**
 *
 * @author Mythe
 */

public class CDTesti {
    
    public static void main(String args[])
    {
        CD cd = new CD();
        cd.setCd("Jeps vaan");
        cd.setKappale("Peipi");
        cd.setArtisti("Justiini Piiper");
        cd.setVuosiluku(2016);
        
        CD sd = new CD();
        sd.setCd("Kreitest Hits fröm 70's");
        
        System.out.println("Tässä ensimmäisen levyn kaikki tiedot: " + cd.printAll());
        System.out.println("Tässä toisen levyn nimi: " + sd.printCD());
    }
    
}
