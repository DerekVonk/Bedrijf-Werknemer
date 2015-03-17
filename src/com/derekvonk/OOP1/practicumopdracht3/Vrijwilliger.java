/*
 * Derek Vonk - 500704534 - IDI101 Semester 2 - Propedeuse 
 */

package com.derekvonk.OOP1.practicumopdracht3;

/**
 * Vrijwilliger Class for Bedrijf en Werknemer Practicum Opdracht 3
 *
 * @version 0.1 - March 2015
 * @author Derek Vonk - 500704534 - IDI101 - Practicum Opdracht 3 -
 * Object Oriented Programming 1 - Docent Michel Mercera
 */
public class Vrijwilliger extends Persoon {
    
    public Vrijwilliger(String naam) {
        super(naam);
    }
    
    @Override
    public double salaris() {
        System.out.println("Een Vrijwilliger krijgt geen salaris");
        return 0;
    }
    
    @Override
    public String toString() {
        return "";
    }
    
}
