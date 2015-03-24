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
    
    private ArrayList<Persoon> werknemers = new ArrayList<>();
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
        //hoe doe ik een arraylist implementatie van Persoon??
         
    } 
  
    /**
     * Method
     */
    public void betaalSalarissen() {
        for (Persoon werknemer : werknemers) {
            System.out.println(werknemer.salaris());
            
            if (werknemer instanceof Zzper) {
                System.out.println("Ja dit is een instance of ZZper");
            } else {
                System.out.println("Dit is geen Zzper.");
            }
        }
    }
    
    /**
     * Method returns the number of managers from ?
     * @return Integer
     */
    public int aantalManagers() {
        return 0;
    }
    
    /**
     * Method adds an object Persoon in to arraylist of Bedrijf
     * @param persoon Object of 'Persoon' Class
     */
    public void neemInDienst(Persoon persoon) {
        this.werknemers.add(persoon);
    }
    
    /**
     * Method returns a String representation of Bedrijf object
     * @return String
     */
    @Override
    public String toString() {
            
        StringBuilder sb = new StringBuilder(); 
        System.out.println("Naam bedrijf: " +
                naam + "\n-------------------------" + 
                "\nWerknemers: ");
        for (int i = 0; i < werknemers.size(); i++) {
            sb.append("\n" + werknemers.get(i).toString());
        }
        return sb.toString();
        
    }
}
