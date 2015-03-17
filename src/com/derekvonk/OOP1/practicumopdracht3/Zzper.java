/*
 * Derek Vonk - 500704534 - IDI101 Semester 2 - Propedeuse 
 */
package com.derekvonk.OOP1.practicumopdracht3;

/**
 * Zzper Class for Bedrijf en Werknemer Practicum Opdracht 3
 *
 * @version 0.1 - March 2015
 * @author Derek Vonk - 500704534 - IDI101 - Practicum Opdracht 3 -
 * Object Oriented Programming 1 - Docent Michel Mercera
 */
public class Zzper extends Persoon {
    
    private final double uurTarief;
    private int urenGewerkt;
    
    public Zzper(double uurTarief, String naam) {
        super(naam);
        this.uurTarief = uurTarief;
    }
    
    /**
     * Method adds the integer passed as argument
     * @param uren Integer
     */ 
    public void voegWerkUrenToe(int uren) {
        urenGewerkt += uren;
    }
    
    /**
     * Method returns Salaris calculated
     * @return double
     */
    @Override
    public double salaris() {
        //if (betaalSalarissen is true(?) )
        // urenGewerkt = 0;
        // else {
        return uurTarief * urenGewerkt;
        
    }
    
    /**
     * Method returns String representation of input parameters
     * @return String
     */
    @Override
    public String toString() {
        return "";
    }
}
