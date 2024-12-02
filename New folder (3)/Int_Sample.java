package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean isRunning = true;

		int myArray[] = null;
		
		while(isRunning) {

	        System.out.println("Do you want to create an array? ");
	        System.out.println("1. Yes");
	        System.out.println("2. No");
	        System.out.print("Enter the number of your choice: ");
	        int myChoice = scanner.nextInt();
	        
	        if(myChoice ==1) {
	        	System.out.print("Enter the size for your array: ");
	        	int size = scanner.nextInt();
	        	myArray = new int[size];
	        	
	        	for(int i =0; i < myArray.length; i++) {
	        		System.out.println("Enter the value for index " + ( i + 1 ) + ": ");
	        		myArray[i] = scanner.nextInt();
	        	}
	        } else if(myChoice == 2) {
	        	System.out.println("Exited!");
	        	isRunning = false;
	        	break;
	        } else {
	        	System.out.println("Invalid input!");
	        	break;
	        }
	        
	        System.out.println("Welcome to array Decisions!");
	        System.out.println("1. Display  ");
	        System.out.println("2. Add      ");
	        System.out.println("3. Subtract ");
	        System.out.println("4. Multiply ");
	        System.out.println("5. Divide   ");
	        System.out.println("____________");
	        System.out.println("6. Find Value ");
	        System.out.print("Enter the number of your choice: ");
	        int choice = scanner.nextInt();
	        
	   switch(choice) {
	   
	   case 1:
		   display(myArray);
		   break;
		   
	   case 2:
		   add(myArray);
		   break;
		 
	   case 3:
		   subtract(myArray);
		   break;
	   case 4:
		   multiply(myArray);
		   break;
	   case 5:
		   divide(myArray);
		   break;
	   case 6:
		   find(myArray, 0, scanner);
		   break;
		   
		default:
			System.out.println("Invalid input. Please try again");
		   
	   }
	   
	  System.out.println("Do you want to continue? ");
	  System.out.println("1. Yes");
	  System.out.println("2. No");
	  System.out.print("Enter the number of your choice: ");
	  int choice2 = scanner.nextInt();
	  if(choice2 == 1) {
		  System.out.println("Going back!");
	  } else if(choice2 == 2) {
		  isRunning = false;
		  System.out.println("Exited!");
		  break;
	  }
		}
		        }

	public static int add(int[] list){
		        
		        int sum = 0;
		        
		        for(int i =0; i < list.length; i++){
		            sum += list[i];
		        }
		        System.out.println("The total sum of the array is: " + sum);
		        return sum;
		    }

		     public static int subtract(int[] list){
		        
		        int sum = 0;
		        
		        for(int i =0; i < list.length; i++){
		            sum -= list[i];
		        }
		        System.out.println("The total difference of the array is: " + sum);
		        return sum;
		    }
		  
		     public static int multiply(int[] list){
		        
		        int sum  = 1;
		        
		        for(int i =0; i < list.length; i++){
		            sum *= list[i];
		        }
		        System.out.println("The total product of the array is: " + sum);
		        return sum;
		    }
		     
		       public static int divide(int[] list){
		        
		        int sum = 0;
		        
		        for(int i =0; i < list.length; i++){
		            sum /= list[i];
		        }
		        System.out.println("The total difference of the array is: " + sum);
		        return sum;
		    }
		     
		    public static void display(int[] list){
		       for(int i =0; i < list.length; i++){
		           System.out.print( " " + list[i]);
		           System.out.println();
		       };
		    };

		    public static void find(int list[], int target, Scanner scanner){
		        
		        boolean found = false;
		        
		        System.out.print("Enter the int you want to find: ");
		        target = scanner.nextInt();
		        
		        for(int i =0; i < list.length; i++){
		            
		            if(list[i] == target){
		                System.out.println( target + " is found at index: " + (i + 1));
		            
		                found = true;
		                break;
		                
		            } 
		        }
		        
		        if(!found){
		            System.out.println("Not found");
		        }
		    }
 
		}
