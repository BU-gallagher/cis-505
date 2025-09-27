
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

//Importing one built-in Java classes
import java.util.Scanner;

public class TestCustomerAccountApp {

    /*
     * Method which allows the user to enter a name, address, city, and zip for a Customer. 
     * Declaring, creating, and assigning three private data types using no default values.
     * Declaring the no-argument constructor using the default value set to empty strings. 
     * Declaring the argument constructor to allow the user to provide new values.
     * Declaring the accessor methods for the four data fields.
     * @return prints the results to the console window
     * Main method that allows users to use default values or provide new values for specifications of a customer.
     */



    //Method that displays the results output the TestCustomerAccountApp
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creates a Scanner

        System.out.println("  Welcome to the Customer Account App\n"); //Displays the Welcome to the Customer Account message of the app

        System.out.println("  Enter a customer ID:"); //Displays instruction to enter customer id
        System.out.print("    ex: 1007, 1008, 1009>: "); //Displays prompt to enter customer id
        int customerId = scanner.nextInt(); 
        scanner.nextLine(); // consume newline

        Customer customer = CustomerDB.getCustomer(customerId);
        Account account = new Account();

        String option;
        boolean continueMenu;

        //Creating a do loop to allow the user to manage teh Account Menu
        do {
            account.displayMenu();
            option = scanner.nextLine().trim();

            switch (option.toLowerCase()) {
                case "b": //user chooses b and balance is displayed
                    System.out.println("\n  Account balance: " + account.formatBalance()); //Displays prompt to display balance amount
                    break;
                case "d": //user chooses d and enters a deposit amount
                    System.out.print("\n  Enter deposit amount: "); //Displays prompt to enter deposit amount
                    double depositAmt = scanner.nextDouble();
                    scanner.nextLine();
                    account.deposit(depositAmt);
                    break;
                case "w": //user chooses w and enters a withdraw amount
                    System.out.print("\n  Enter withdraw amount: "); //Displays prompt to enter withdraw amount
                    double withdrawAmt = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdraw(withdrawAmt);
                    break;
                default:
                    System.out.println("\n  Error: Invalid option"); //Displays prompt when an invalid entry has been inputted
            }

            System.out.print("\n  Continue? (y/n): "); //Displays a prompt to continue teh do while loop
            String response = scanner.nextLine().trim();
            continueMenu = response.equalsIgnoreCase("y");

        } while (continueMenu);

        //Displays the final Customer Details when do while loop ends
        System.out.println("\n  --Customer Details--"); //Displays the Customer Details message of the app
        System.out.println(customer.toString()); //Displays teh associated customer entered by the customer id
        System.out.println("\n  Balance as of " + account.getTransactionDate() + //Displays final data and balance
                           " is " + account.formatBalance());
        System.out.println("\n  End of line..."); //Displays an end of program line

        scanner.close();
    }
}














