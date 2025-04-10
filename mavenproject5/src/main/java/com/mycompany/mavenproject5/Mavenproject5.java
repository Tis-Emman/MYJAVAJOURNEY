/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author ADMIN
 */
public class Mavenproject5 {
    Period p;
    
    public static void time(Period p){
        
    }
    
    private enum Days{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
    public static void main(String[] args) {
        
        
        try{
              Days days = Days.valueOf("MONDAY");
        System.out.println(days);
        }catch(IllegalArgumentException e){
            System.out.println("The value doesn't match the corresponding enum value");
        }
        
        Days[] days = Days.values();
        
        System.out.print("Days: ");
        for(Days day : days){
            System.out.print(day + " ");
        }
        System.out.println("");
        Days day1 = Days.MONDAY;
        System.out.println("__------__");
        System.out.println(day1.toString());
        
        Days day2 = Days.FRIDAY;
        
        if(day1.equals(day1)){
            System.out.println("Equals!");   
        } else{
            System.out.println("Not equal");
        }
        
        
        
      
        
    }
    
    
}
