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
        Persoon werknemer1 = new Werknemer(2500, 1, "Sven");
        bedrijf.neemInDienst(persoon1);
        bedrijf.neemInDienst(werknemer1);
        
        System.out.println(bedrijf);
        
//        Persoon persoon = new Werknemer(2500, 1, "Michel");
//        bedrijf.neemInDienst(persoon);
//        System.out.println(persoon);
//        System.out.println(persoon.salaris());
//        
//        Vrijwilliger testVrijw = new Vrijwilliger("Derek");
//        System.out.println(testVrijw);
//        Werknemer testWerk = new Werknemer(2500, 1, "Derek");
//        System.out.println(testWerk);
//        
//        
//        Zzper zelfstandige = new Zzper(30, "Mike");
//        bedrijf.neemInDienst(zelfstandige);
//        bedrijf.betaalSalarissen();
//        
        
    }
    
}
