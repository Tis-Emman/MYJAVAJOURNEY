import java.util.Scanner;

public class Introduction_to_Java{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("This is my code for the secondhand module in ELMS!");
        System.out.println("The following are the data TYPES!");
        System.out.println("What would you like to know?");
        System.out.println("*****************************");
        System.out.println("\n" + "INTEGER Types");
        System.out.println("1. Byte");
        System.out.println("2. Short");
        System.out.println("3. Int");
        System.out.println("4. Long");
        System.out.println("\n" + "FLOATING TYPES");
        System.out.println("5. Float");
        System.out.println("6. Double");
        System.out.println("\n" + "CHARACTER TYPES");
        System.out.println("7. Char");
        System.out.println("8. Boolean");
        try{
            int choices = scanner.nextInt();
            if(choices > 0){
                switch (choices) {
                    case 1:
                       new Byte_Sample();
                        break;
                    case 2:
                        new Short_Sample();
                        break;
                    case 3:
                        new Int_Sample();
                        break;
                    case 4:
                        new Long_Sample();
                        break;
                    case 5:
                        new Float_Sample();
                        break;
                    case 6:
                        new Double_Sample();
                        break;
                    case 7:
                        new Char_Sample();
                        break;
                    case 8:
                        new Boolean_Sample();
                        break;
                    default:
                    System.out.println("Input must be recognized!");
                        break;
                }
            } else{
                System.out.println("Input must be positive!");
            }
            
        } catch(Exception e){
            System.out.println("Please enter a specified input");
        }
        

    }
}