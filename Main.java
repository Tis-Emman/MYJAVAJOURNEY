//IMPORT SCANNER TO TAKE THE USER INPUTS
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		System.out.println("HELLO WORLD");
		System.out.println("HI!!\n");
		System.out.println("ESCAPE SEQUENCE USED BEFORE THIS LINE");
		System.out.print("\tThis line has a 'tab (\t) in it\n ");
		System.out.println("\"I really love pizza. PRE SEEDED \""); 
		System.out.println("sysout + ctrl + space = shortcut for 'System.out.print()'");
		
		
		//VARIABLES
		
		int y = 256;
		int x; //declaration
		x = 123; // assignment
		
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y + "\n");
		
		int z;
		z = x + y;
		System.out.println("The sum of x and y = " + z + "\n");
		
		//float
		
		float t = 3.14f;
		System.out.println("The value of Pi is: " + t);
		
		//boolean means only true or false
		boolean b1 = true;
		System.out.println("b1 is " + b1 );
		
		String location = "Sabang, Baliuag Bulacan";
		char symbol = '@';
			System.out.println("My location is " + symbol + location);
			
		boolean employed = true;
		String confirmation = "If a person is employed: This will equal to:: ";
		System.out.println(confirmation + employed );
		String My_Name = "Emman";
			System.out.println("\n" + My_Name + " is located " + symbol + location + " and is " + employed + " which means he is employed. As stated" + "\n \n \n" );
			
		//SWAPPING TWO VARIBALES
			
			String a = "AUX";
			String c = "Hilux";
			String d = "LOGITECH";
			String all = null ;
			
			System.out.println(a + " Is an Aircon brand");
			System.out.println(c + " Is a Car brand. And, ");
			System.out.println(d + " Is a computer parts brand. (Keyboard, mouse, cam etc..)");
			System.out.println("In total " + all + " means " + d);
			System.out.println("\n \n \n");
			
		//USER INPUT
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("What is your Last Name? ");
			
			String Last_name = scanner.nextLine();
			System.out.println("Your last name is: " + Last_name);
			
			System.out.println("What is your age? ");
			int age = scanner.nextInt();
			System.out.println("Your age is: " + age);
			
			System.out.println("What is your favorite food?");
			String Fav_food = scanner.nextLine();
			System.out.println("Your favorite food is: " + Fav_food);
			
			
			
			
			;
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		
	

}
