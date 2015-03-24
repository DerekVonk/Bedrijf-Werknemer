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
         
    } 
  
    /**
     * Method
     */
    public void betaalSalarissen() {
        System.out.println("Uitbetaling van Salarissen als volgt:"
                + "\n--------------------------------");
        for (Persoon werknemer : werknemers) {
           
            if (werknemer instanceof Manager) {
                System.out.println(werknemer.toString() + 
                        ", Salaris + Bonus: €" + werknemer.salaris());
            } else if (werknemer instanceof Zzper) {
                System.out.println(werknemer.toString() + 
                        ", Salaris gebaseeerd op uurtarief: €" + werknemer.salaris());
            } else if (werknemer instanceof Werknemer) {
                System.out.println(werknemer.toString() + 
                        ", Maandsalaris: €" + werknemer.salaris());
            } else if (werknemer instanceof Vrijwilliger) {
                System.out.println(werknemer.toString() + 
                        ", Salaris: €" + werknemer.salaris());
            } else if (werknemer instanceof Persoon) {
                System.out.println("Een Persoon zonder functie heeft geen"
                        + " salaris.");
            }
        }
    }
    
    /**
     * Method returns the number of managers from ?
     * @return Integer
     */
    public int aantalManagers() {
        int count = 0;
        
        for (Persoon werknemer : werknemers) {
            if (werknemer instanceof Manager) {
                count++;
            }
        }
        return count;
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
        return sb.toString() + "\n-----------------------\n"
                + "Aantal managers: " + aantalManagers();
        
    }
}
