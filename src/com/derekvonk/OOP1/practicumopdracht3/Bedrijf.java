/*
 * Derek Vonk - 500704534 - IDI101 Semester 2 - Propedeuse 
 */
package com.derekvonk.OOP1.practicumopdracht3;

import java.util.ArrayList;
/**
 * Bedrijf Class for Bedrijf en Werknemer Practicum Opdracht 3
 *
 * @version 0.1 - March 2015
 * @author Derek Vonk - 500704534 - IDI101 - Practicum Opdracht 3 -
 * Object Oriented Programming 1 - Docent Michel Mercera
 */
public class Bedrijf {
    
    private ArrayList<String> werknemers;
    private String naam;
    
    /**
     * Default constructor for Bedrijf Object
     */
    public Bedrijf() {
        
    }
    
    /**
     * Constructor creates Object of Bedrijf with name as the parameter
     * @param naam String
     */
    public Bedrijf(String naam) {
        this.naam = naam;
    } 
  
    /**
     * Method
     */
    public void betaalSalarissen() {
        
    }
    
    /**
     * Method returns the number of managers from ?
     * @return Integer
     */
    public int aantalManagers() {
        return 0;
    }
    
    /**
     * Method passes an object in to ...
     */
    public void neemInDienst(Persoon persoon) {
        
    }
    
    /**
     * Method returns a String representation of input
     * @return String
     */
    @Override
    public String toString() {
        return "";
    }
}
