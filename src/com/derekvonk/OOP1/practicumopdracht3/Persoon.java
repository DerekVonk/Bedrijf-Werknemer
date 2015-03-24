/*
 * Derek Vonk - 500704534 - IDI101 Semester 2 - Propedeuse 
 */
package com.derekvonk.OOP1.practicumopdracht3;

/**
 * Persoon Class for Bedrijf en Werknemer Practicum Opdracht 3
 *
 * @version 0.1 - March 2015
 * @author Derek Vonk - 500704534 - IDI101 - Practicum Opdracht 3 -
 * Object Oriented Programming 1 - Docent Michel Mercera
 */
public class Persoon {
    
    private String naam;
    
//    /**
//     * Default constructor
//     */
//    public Persoon() {
//        System.out.println("Default persoon is aangemaakt");
//    }
//    
    /**
     * Constructor passes String 'naam' to the object
     * @param naam 
     */
    public Persoon(String naam) {
        //System.out.println("Persoon is aangemaakt");
        this.naam = naam;
        
    }
    
    /**
     * Method calculates salaris and returns a double
     * @return double
     */
    public double salaris() {
        System.out.println("Een 'Persoon' zonder functie heeft geen salaris.");
        return 0;
    }
    
    /**
     * Method for a string representation from Persoon object
     * @return String
     */
    @Override
    public String toString() {
        return naam;
    }
    
    
}
