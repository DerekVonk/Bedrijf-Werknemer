/*
 * Derek Vonk - 500704534 - IDI101 Semester 2 - Propedeuse 
 */
package com.derekvonk.OOP1.practicumopdracht3;

/**
 * Manager Class for Bedrijf en Werknemer Practicum Opdracht 3
 *
 * @version 0.1 - March 2015
 * @author Derek Vonk - 500704534 - IDI101 - Practicum Opdracht 3 -
 * Object Oriented Programming 1 - Docent Michel Mercera
 */
public class Manager extends Werknemer {
    
    private double bonus;

    public Manager(double maandSalaris, int volgnummer, String naam) {
        super(maandSalaris, volgnummer, naam);
    }
    
    /**
     * Method for calculating salaris
     * @return double
     */ 
    @Override
    public double salaris() {
        return 0;
    }
    
    /**
     * Method for adding a bonus as double to variable bonus
     * @param bonus double
     */
    public void kenBonusToe(double bonus) {
        
    }
    
    /**
     * Method for returning a String representation of passed parameters
     * @return String
     */ 
    @Override
    public String toString() {
        return "";
    }
    
    
    
}
