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
     * setter method for urenGewerkt back to zero
     */
    public void setUrenGewerktOpNul() {
        urenGewerkt = 0;
    }
    
    /**
     * getter methoed for maandSalaris, calculates urenTarief * urenGewerkt
     * @return double
     */
    public double getMaandSalaris() {
        return uurTarief * urenGewerkt;
    }
    
    /**
     * Method returns getMaandSalaris() and calls setUrenGewerktOpNul()
     * @return double
     */
    @Override
    public double salaris() {
        double temp = getMaandSalaris();
        setUrenGewerktOpNul();
        return temp;
    }
    
    /**
     * Method returns String representation of input parameters
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "; ZZPer";
    }
}
