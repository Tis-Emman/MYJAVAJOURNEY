
package com.mycompany.mavenproject4;

import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
import java.io.IOException;
import java.nio.file.attribute.*;
import java.util.regex.*;
import java.util.Scanner;

public class Mavenproject4 {
    
      public static void isThisMyTerm(TERMS myTerm, Scanner scanner){
          
       
          
        scanner = new Scanner(System.in);
        System.out.println("Welcome to Terms Checker");
        System.out.println("What Terms are you in?");
        System.out.println("1. Prelim");
        System.out.println("2. Midterm");
        System.out.println("3. Semi Finals");
        System.out.println("4. Finals");
        int choice = scanner.nextInt();
        
        TERMS selectedTerm = null;
        
        switch(choice){
            case 1:
                selectedTerm = TERMS.PRELIM;
                break;
                
            case 2:
                selectedTerm = TERMS.MIDTERM;
                break;
                
            case 3:
                selectedTerm = TERMS.SEMI_FINALS;
                break;
                
            case 4:
                selectedTerm = TERMS.FINALS;
                break;
                
            default:
                System.out.println("Invalid Choice!");
        }
        
        if(selectedTerm == myTerm){
            System.out.println("Yes this is your term right now!");
        } else{
            System.out.println("This is not your term! ");
            System.out.println("Your current term is: " + myTerm);
        }
    }
      
      public static void habitable(Planet myPlanet, Scanner scanner){
        System.out.println("Enter the Planet you are living in!");
        String planets[] = {"MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE"};
       
        for(int i = 0; i < planets.length; i++){
            System.out.println((i+1) + ". " + planets[i]);
        }
        
        Planet selectedPlanet = null;
       
        
        System.out.print("Enter the planet you're living in: ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                selectedPlanet = Planet.MERCURY;
                break;
            case 2:
                selectedPlanet = Planet.VENUS;
                break;
            case 3:
                selectedPlanet = Planet.EARTH;
                break;
            case 4:
                selectedPlanet = Planet.MARS;
                break;
            case 5:
                selectedPlanet = Planet.JUPITER;
                break;
            case 6:
                selectedPlanet = Planet.SATURN;
                break;
            case 7: 
               selectedPlanet = Planet.URANUS;
                break;
            case 8: 
                selectedPlanet = Planet.NEPTUNE;
                break;
                
            default:
                System.out.println("Please enter a valid number"); 
            
        }
        
        if( selectedPlanet == myPlanet ){
            System.out.println("You are on the right planet!");
        } else{
            System.out.println("Are you an alien???");
        }
    } 

    public enum TERMS {PRELIM, MIDTERM, SEMI_FINALS, FINALS};
    
    interface Greeting {
    
        void act();
    }
    
    public static void main(String[] args) {
    
        Greeting act = () -> System.out.println("Let's play some games!");
        
       
 }
   
    
    
    }
    
  


          
    

