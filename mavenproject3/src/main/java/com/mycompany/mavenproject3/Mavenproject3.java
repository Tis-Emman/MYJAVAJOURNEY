package com.mycompany.mavenproject3;

import java.util.ArrayList;
import java.util.Scanner;

public class Mavenproject3 {
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList list = new ArrayList();
    static  boolean isRunning = true;
    
    public static void main(String[] args) {
 
        while(isRunning){
             System.out.println("Welcome to my To-Do list app");
        System.out.println("----------------------------");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. Display Task");
        System.out.println("4. End");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                addTask();
                break;
            case 2:
                removeTask();
                break;
            case 3:
                displayTask();
                break;
            case 4:
                isRunning = false;
                end();
                break;
            default:
                System.out.println("Please enter a valid input!");
        }
        }
    }
    
    public static void addTask(){
        System.out.println("Enter the task you want to add: ");
        String taskAdd = scanner.nextLine();
        list.add(taskAdd);
        System.out.println("Task succesfully added!");
    }
    
    public static void removeTask(){
        System.out.println("Here's the list of your task: ");
        
        toDisplay();
        
        System.out.print("Enter the task you want to remove (by number): ");
        int toRemove = scanner.nextInt() -1;
         System.out.println("Succesfully removed: " + list.get(toRemove));
        list.remove(toRemove);
    }
    
    public static void displayTask(){
        toDisplay();
    }
    
    public static void end(){
        System.out.println("Program terminated!");
        isRunning = false;
    }
    
    public static void toDisplay(){
        for(int i = 0; i < list.size(); i++){
            System.out.print(i+1 + ": ");
            System.out.println(list.get(i));
        }
    }
}
