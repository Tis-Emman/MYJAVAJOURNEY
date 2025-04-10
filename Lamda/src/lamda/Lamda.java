/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lamda;

import lamda.Interface.MathOperation;

public class Lamda {

    public static void main(String[] args) {
        
        Tertiary operations = new Tertiary();
        MathOperation sum = (a, b) -> a + b;
        
        
        
        int num = 25;
        int fact = 5;
        
        System.out.println(operations.square(num));
        System.out.println(operations.factorial(fact));
        
        
    }
    
}
