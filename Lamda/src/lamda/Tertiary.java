/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lamda;

/**
 *
 * @author ADMIN
 */
public class Tertiary implements Interface {
    
    
    
    
    public int operate(int a, int b){
     
       int calculate = a + b;
       return calculate;
    }
    
    public int square(int a){
        return a * a;
    }
    
    public int factorial(int num){
        
        if (num == 0){
            return 1;
        }
        
        return num * factorial(num - 1);
      
    }
    
    public int add(int a, int b){
        
        return a + b;
        
    }
    
    
    
}
