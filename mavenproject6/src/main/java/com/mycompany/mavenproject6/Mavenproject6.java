/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author ADMIN
 */

import java.util.regex.*;

public class Mavenproject6 {
    
    public static boolean check(String animal, String check){
       String cat;
       if(animal.equals(check)){
           return true;
       }else{
           return false;
       }
    };
    
    public static boolean checkRhyme(String first, String checker){
        if(first.substring(1, 3) ==  checker.substring(1, 3)){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String myAnimal = "Cats";
        String toCheck = "Cat";
        Pattern p = Pattern.compile(myAnimal);
        Matcher m = p.matcher(toCheck);
        System.out.println(p);
        
        if(m.matches()){
            System.out.println("Matches!");
        } else{
            System.out.println("Does not match!");
        }
        
        if(check(myAnimal, toCheck)){
            System.out.println("They're equal!");
        }else{
            System.out.println("Not equal");
        }
        
    }
}
