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
        
        //initialize bedrijf object
        Bedrijf bedrijf = new Bedrijf("VONK&CO");
        
        //initialize objects to be added to bedrijf's ArrayList
        Persoon derek = new Persoon("Derek");
        Werknemer derekWerk = new Werknemer(2500, 1, derek.toString());
        Werknemer sam = new Werknemer(1500, 2, "Sam");
        Manager derekMan = new Manager(2500, 1, derek.toString());
        Manager sven = new Manager(3000, 3, "Sven");
        Vrijwilliger iris = new Vrijwilliger("Iris");
        Zzper zzper1 = new Zzper(40, "Audrey");
        
        //employ employers initialised above
        bedrijf.neemInDienst(derek);
        bedrijf.neemInDienst(iris);
        bedrijf.neemInDienst(derekMan);
        bedrijf.neemInDienst(sam);
        bedrijf.neemInDienst(sven);
        bedrijf.neemInDienst(zzper1);
        
        //add hours worked to instance of zzper
        zzper1.voegWerkUrenToe(20);
        
        //print out the arraylist of bedrijf object
        System.out.println(bedrijf);
        System.out.println("");
        
        //add more hours worked to instance of zzper
        zzper1.voegWerkUrenToe(60);
        // add bonus to intance of manager
        sven.kenBonusToe(500);
        // add bonus to intance of manager
        derekMan.kenBonusToe(15000);
        
        //call to betaalSalarissen - this should in turn reset 
        //Manager's bonus and Zzper's gewerkteUren
        bedrijf.betaalSalarissen();
        System.out.println("");
        
        //second call to betaalSalarissen - to check if Bonus and gewerkteUren is reset
        //bedrijf.betaalSalarissen();
        
        
        //System.out.println("\nAantal managers: " + bedrijf.aantalManagers());
        
    }
    
}
