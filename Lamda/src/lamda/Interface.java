/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lamda;

/**
 *
 * @author ADMIN
 */
public interface Interface {

    public int operate(int a, int b);
    
    public int add(int a, int b);
    
    public int square(int a);
    
    public int factorial(int num);
    
    @FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
    
    
}
