package fi.jamk;

public class TulostinTesti {
    public static void main(String args[]) {
        Tulostin tulostin1 = new Tulostin("Tulostin1");
        Tulostin tulostin2 = new Tulostin("Tulostin2", 1337, 1917, 23, 55, 67);
        
        System.out.println(tulostin1.palautaTiedot());
        System.out.println(tulostin2.palautaTiedot());
    }
}