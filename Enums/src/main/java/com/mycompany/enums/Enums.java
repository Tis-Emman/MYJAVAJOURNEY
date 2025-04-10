/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enums;

/**
 *
 * @author ADMIN
 */

import java.util.Scanner;
public class Enums {
    
    public enum Days{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        NestedClasses cl = new NestedClasses(22, 34, 53);
        
       
        
        System.out.println("Hello World!");
        Days day = Days.MONDAY;
        Days dd;
        System.out.println(day);
        String myDay = day.toString();
        System.out.println(myDay);
        
        int position = day.ordinal();
        System.out.println(position);
        
         System.out.print("Enter your day: ");
         String choiceDay = scanner.nextLine().toUpperCase();
         dd = Days.valueOf(choiceDay);
         
         
         
        
        boolean check = day.equals(day.SATURDAY);
        
        if(check){
            System.out.println("They are equal!");
        } else{
            System.out.println("They are not equal!");
        }
        
        System.out.println(Days.valueOf(myDay));
        
        for(Days d : Days.values()){
            System.out.print(d + " ");
        }
        
        
        
        
    }
}
