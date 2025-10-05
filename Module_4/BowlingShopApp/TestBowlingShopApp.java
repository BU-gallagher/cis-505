
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

//Importing one built-in Java class
import java.util.Scanner;

public class TestBowlingShopApp {

    /*
     * Method which allows the user to enter a menu option for the Bowling Shop App. 
     * Creating a Scanner to input a menu option.
     * Creating a Do Loop an its conditions.
     * Displaying the product listing, blank lines, and new menu option prompt.
     * Creating a For Loop to the While Loop using an If/Else statement to decide to continue program.
     */


    //Method that displays the results output of the TestBowlingApp
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creates a scanner
        Boolean continueChoice;

        System.out.println("  Welcome to the Bowling Shop\n"); //Displays the Welcome to the Bowling Shop message of teh app
        //Display product options
        System.out.println("  MENU OPTIONS"); //Displays instructions to choose a menu option
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> To exit\n");

        //Repeat until the user chooses not to continue
        do {
            //Prompt user for input
            System.out.print("  Please choose an option: "); //Displays prompt to enter menu option
            String code = scanner.nextLine().trim().toLowerCase();
         
            //Get products based on input
            GenericQueue<Product> products = ProductDB.getProducts(code);

            //Display results
            if (products.isEmpty()) {
                System.out.println("\n  No products found for this category.\n");
            } 
            else {
                System.out.println();
                System.out.println("  --Product Listing--");

                //Keep dequeuing and printing products until queue is empty
                while (!products.isEmpty()) {
                    Product p = products.dequeue();
                    System.out.println(p.toString());
                    System.out.println();  // blank line between products
                }
            
            //Display product options
            System.out.println("  MENU OPTIONS"); //Displays instructions to choose a menu option
            System.out.println("    1. <b> Bowling Balls");
            System.out.println("    2. <a> Bowling Bags");
            System.out.println("    3. <s> Bowling Shoes");
            System.out.println("    4. <x> To exit\n");
            }
           
            //Ask user to continue
            System.out.print("  Please choose an option: ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (continueChoice = response.equals("b") || response.equals("a") || response.equals("s")) {
                continueChoice = true; //Continues the loop
            }
            else {
                continueChoice = false; //Ends the loop
                }
            System.out.println();
         
        } while (continueChoice);

        System.out.println("  End of line..."); //Displays an end of program line
        scanner.close();
    }
}






