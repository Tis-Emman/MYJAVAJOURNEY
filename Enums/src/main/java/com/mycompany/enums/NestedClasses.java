/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enums;

/**
 *
 * @author ADMIN
 */
public class NestedClasses {
    
    
    public int floor;
    public int top;
    public int side;
    
    public NestedClasses(int floor, int top, int side){
        this.floor = floor;
        this.top = top;
        this.side = side;
    }
    
    public int calculate(int myFloor, int myTop){
        return this.floor * myFloor;
    };
    
   private class myInfo{
       private String name;
       private int age;
       
       public myInfo(String name, int age){
           this.name = name;
           this.age = age;
       }
       
       public void display(){
           System.out.println("Your name is: " + name);
           System.out.println("Your age is: " + age);
       }
   }
}
