/*
 * Derek Vonk - 500704534 - IDI101 Semester 2 - Propedeuse 
 */
package com.derekvonk.OOP1.practicumopdracht3;

/**
 * Werknemer Class for Bedrijf en Werknemer Practicum Opdracht 3
 *
 * @version 0.1 - March 2015
 * @author Derek Vonk - 500704534 - IDI101 - Practicum Opdracht 3 -
 * Object Oriented Programming 1 - Docent Michel Mercera
 */
public class Werknemer extends Persoon {
    
    private double maandSalaris;
    private int volgnummer;
    
    /**
     * Constructor passes maandSalaris, volgnummer and naam 
     * @param maandSalaris double
     * @param volgnummer integer
     * @param naam String
     */
    public Werknemer(double maandSalaris, int volgnummer, String naam) {
        super(naam);
        this.maandSalaris = maandSalaris;
        this.volgnummer = volgnummer;
    }
    
    /**
     * Method for calculating salaris
     * @return double
     */
    @Override
    public double salaris() {
        return maandSalaris;
    }
    
    /**
     * Method returns string representation of passed parameters
     * @return String
     */
    @Override
    public String toString() {
        return "";
    }
}
