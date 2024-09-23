import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Bonak extends Thread{
    public static void main(String[] args) {

    Random random = new Random();
    Thread thread = new Thread();
    int ID = random.nextInt(10000000);
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to my simple Electrical Billing System");
       System.out.println("Generating an ID for you.....");

       for(int i = 0; i <=5; i++){
        System.out.println(i + ".....");

        try{
            Thread.sleep(1000);
             
             
        } catch(InterruptedException e){

        }
        
       } System.out.println("Your ID is: " + ID);

       System.out.println("Enter your Customer ID");


       double CustomerID = scanner.nextDouble();

       if(CustomerID!=ID){
        System.out.println("ID does not equal your ID");

       } else{

        System.out.println("Number of units consumed: ");
        double Units_Consumed = scanner.nextDouble();
        if(Units_Consumed < 0 ){
            System.out.println("Amount must exceed 0.");
        } else{
            System.out.println(" Do you have billing last month? ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choices = scanner.nextInt();
        scanner.nextLine();

        double Total_Bill = 0;

        switch (choices) {
         case 1:
             System.out.println("Number of total units consumed last month: ");
             double Units_Consumed_Last = scanner.nextDouble();
             Total_Bill = Units_Consumed + Units_Consumed_Last;
             System.out.println("Your total Bill is: " + Total_Bill);
             break;

         case 2:
 
            System.out.println("Generating Account Information. Please Wait");

            for(int i = 5; i >= 0; i--){
                System.out.println("Generating your acc info in " + i);

                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){

                }
            }

            AccountName("Emmanuel P. Dela Peña", "1512, Daang Bakal, Sabang, Baliuag, Bulacan", CustomerID, Units_Consumed);
            System.out.println("Select payment method: ");
            System.out.println("1. Cash");
            System.out.println("2. Bank Transfer");
            System.out.println("3. GCash");

            
            int choices2 = scanner.nextInt();
            scanner.nextLine();

            switch (choices2) {
                case 1:
                    System.out.println("Enter the amount: ");

                    try{
                        double amount = scanner.nextDouble();
                    double cal = Units_Consumed - amount;
                    if(amount < 0){
                        System.out.println("Please enter a valid amount");
                    } else if(amount > Units_Consumed){
                        System.out.println("Change is: " + (-1 * cal));
                    }
                     else{
                        System.out.println("Remaining Balance: " + cal);
                    }
                    break;
                    } catch(Exception e){
                        System.out.println("Please, enter a specific integer value!");
                    }
                
                default:
                    break;
            }
             break;

         default:
             System.out.println("Input unidentified! Please try again later..");
             break;
        }
       }
        }
        
}

    public static void AccountName(String name, String Adress, double id, double TOTAL){
    System.out.println("Your ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Adress: " + Adress);
    System.out.println("Total Bill: " + TOTAL);


    }
}

 