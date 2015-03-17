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
public class Persoon extends Bedrijf {
    
    private String naam;
    
    /**
     * Default constructor
     */
    public Persoon() {
        
    }
    
    /**
     * Constructor passes String naam to the object
     * @param naam 
     */
    public Persoon(String naam) {
        this.naam = naam;
    }
    
    /**
     * Method calculates salaris and returns a double
     * @return double
     */
    public double salaris() {
        System.out.println("Een 'Persoon' heeft geen salaris.");
        return 0;
    }
    
    public String toString() {
        return "";
    }
    
    
}
