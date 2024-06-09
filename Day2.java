import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("The Cinema is now showing Fifty shades of Gray");

        int Price = 350;

        System.out.println("Tickets for " + Price + "Php");


        int Wallet_Balance = 1000;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Want to watch the movie? (Y/N)");
        String Want_to_Watch = scanner.nextLine();
        if (Want_to_Watch.equals("Y")) {
            System.out.println("You need to pay 350");
        }

        if (Want_to_Watch.equals("N")) {
            System.out.println("Leave now!");
        }






        System.out.println("What is your age?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to watch the movie");


        }

        if (age < 18){
            System.out.println("You are not eligible to watch the movie");
        }
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("What is da day?");
        String day = sc.nextLine();




        switch(day){
            case "Sunday": System.out.println("SHET, MEN. MAY PASOK NA BUKAS");
            break;
            case "Monday": System.out.println("It is Monday. PASUKAN NA NAMAN :>>>>");
            break;
            case "Tuesday": System.out.println("TAGAL MAG FRIDAY");
                break;

            case "Wednesday": System.out.println("It is Wednesday. LOL");
                break;

            case "Thursday": System.out.println("PURO GAWAIN");
                break;

            case "Friday": System.out.println("LAST DAY OF SKUl, ROPA!!");
                break;

            case "Saturday": System.out.println("PAHINGA TIME!");
                break;
            default:
                System.out.println("NAGTAGALOG SIYA ;o");



        }


/*
        System.out.println("Anong temp sa labas, tropa?");
        int temp = sc.nextInt();

        if (temp>30){
            System.out.println("NAPAKAINIT");
        }

        else if (temp<=30 && temp>=20){
            System.out.println("Saktuhan lang");
        }

        else{
            System.out.println("MALAMIG NGA!");
        }

        System.out.println("You are playing BRIKING BAWD! Press q or Q to quit! ");
        String response = sc.next();
        if (response.equals("Q") || response.equals("q")){
            System.out.println("You quit the game. You have returned to desktop menu!");
        }

        else{
            System.out.println("That is not a key!");
        }
*/

        String Pangalan = "";
        while(Pangalan.isBlank()){
            System.out.println("Ano name mo pre? ");
            Pangalan = sc.nextLine();
            System.out.println("Hello" + Pangalan);
        }

        String Name = "Emman,";

        for(int i = 0; i <=10; i ++){
            System.out.println(Name + i + " I love you pre");
        }

        for(int i =0; i<=10; i ++){
            System.out.println("Hello, World");
        }




    }
}
