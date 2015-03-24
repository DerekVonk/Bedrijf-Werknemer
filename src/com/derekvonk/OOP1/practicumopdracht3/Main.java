/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.derekvonk.OOP1.practicumopdracht3;

/**
 *
 * @author Vonk
 */
public class Main {
    
    public static void main(String[] args) {
        
        Bedrijf bedrijf = new Bedrijf("VONK&CO");
        
        Persoon persoon1 = new Persoon("Derek");
        Werknemer werknemer1 = new Werknemer(2500, 1, persoon1.toString());
        Werknemer werknemer2 = new Werknemer(1500, 2, "Sam");
        Manager manager1 = new Manager(2500, 1, persoon1.toString());
        Manager manager2 = new Manager(3000, 3, "Sven");
        Vrijwilliger vrij1 = new Vrijwilliger("Iris");
        Zzper zzper1 = new Zzper(40, "Audrey");
        
        bedrijf.neemInDienst(vrij1);
        bedrijf.neemInDienst(werknemer2);
        bedrijf.neemInDienst(manager1);
        bedrijf.neemInDienst(manager2);
        bedrijf.neemInDienst(zzper1);
        
        System.out.println(bedrijf);
        
        System.out.println("");
        
        bedrijf.betaalSalarissen();
        
    }
    
}
