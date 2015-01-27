package fi.jamk;

import java.util.Scanner;

/**
 * @author Mythe
 */

public class OpiskelijaTesti {
    
    public static void main(String args[])
    {
        Opiskelija[] oppilas = new Opiskelija[5]; //Luodaan taulukko jonka alkiot ovat Opiskelija-luokan olioita.
        
        // Loopataan tulostaen olion tietoja kunnes taulukko on kokonaan käyty läpi
        for(int i = 0; i < oppilas.length; i++) {
            oppilas[i]  = new Opiskelija("Oppilas" + i , i, i);
            System.out.println(oppilas[i].printAll());
        }
    }
}