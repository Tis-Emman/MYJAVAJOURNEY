import java.util.ArrayList;
import java.util.LinkedList;



public class Demo extends Thread{

        public static void main(String[] args) {
        
        //One Dimensional String Array
        String names[] = {"John", "Micah", "Arthur" , "Sadie"};
        int ages[] = new int[4];

        ages[0] = 36;
        ages[1] = 42;
        ages[2] = 38;
        ages[3] = 22;
        
        //Two Dimensional String Array

        int scores[][] = new int[4][5];

        scores[0][0] = 47;
        scores[1][0] = 25;
        scores[2][0] = 35;
        scores[3][0] = 45;

        //Print Method

        System.out.println(scores[3][3]); //Print the value of Row and Column NOTE: The default value if the array has not been valued yet is 0
        
        //Another example of Two Dimensional Array

        int[][] board = {
                {2, 3, 5},
                {6, 4, 5},
                {3, 4, 1},
                {4, 2, 1}
            };
            
            for(int row = 0; row < board.length; row++){ //First loop

                for(int column = 0; column < board[row].length; column ++){
                        System.out.print(board[row][column] + " ");
                }

                System.out.println();
            } 

        int[][] tables = {
                {4, 5, 6, 7},
                {2, 3, 5, 1},
                {9, 8, 7, 6},
                {4, 2, 5, 1}
        };

        for(int rows = 0; rows < tables.length; rows++){
                for(int columns = 0; columns < tables[rows].length; columns ++){
                        System.out.print(tables[rows][columns] + " ");
                }
                System.out.println();
        }

       //  System.out.println(board.length); //return the number of rows
       //  System.out.println(board[0].length); //return the number of columns
        

        //PRINT METHOD using enhanced for loop

        System.out.println("\n\n");

        for(int age : ages){
                System.out.println(age);
        }

        System.out.println("\n\n");
        //Array List

        ArrayList arrlist = new ArrayList<String>();
        
        arrlist.add("CJ");
        arrlist.add("Michael");
        arrlist.add("Trevor");
        arrlist.add("Franklin");
        
        for(String name : names){
                arrlist.add(name);
        }

        //Print Method

        System.out.println(arrlist);
        System.out.println("\n\n");

        //Linked List

        LinkedList Llist = new LinkedList<String>();

        Llist.add("Paul");
        Llist.add("Panda");
        Llist.add("Cheetah");
        Llist.add("Jin");


        //Print Method
        System.out.println(Llist);
        System.out.println("\n\n");

        }
        
}





  
    
