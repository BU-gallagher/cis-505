
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to enter and test a date, description, and amount for transaction expenses. 
     * Creating a Scanner to input a menu option.
     * Creating a Do Loop an its conditions.
     * Displaying the product listing, blank lines, and new menu option prompt.
     * Creating a switch statement to provide conditions to decide how the program will continue to execute.
     */

//Importing three built in Java classes
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestExpenseTracker {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Transaction> transactions = TransactionIO.findAll();
        String choice;

        System.out.println("  Welcome to the Expense Tracker\n"); //Displays teh Welcome to teh Expense Tracker App

        do {
            System.out.println("  MENU OPTIONS"); //Displays the instructions to choose a menu option
            System.out.println("    1. View Transactions");
            System.out.println("    2. Add Transactions");
            System.out.println("    3. View Expense\n");

            int option = ValidatorIO.getInt(sc, "Please choose an option: ");
            System.out.println();

            switch (option) {
                case 1: //Displays output from choosing option #1
                    System.out.println("MONTHLY EXPENSES\n"); //Displays the monthly expenses for inputted entries from option #1
                    for (Transaction t : transactions) {
                        System.out.println(t);
                    }
                    break;

                case 2: //Displays output from choosing option #2
                    ArrayList<Transaction> newTransactions = new ArrayList<>();
                    String addMore;
                    do {
                        String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
                        String description = ValidatorIO.getString(sc, "Enter the description: ");
                        double amt = ValidatorIO.getDouble(sc, "Enter the amount: ");
                        newTransactions.add(new Transaction(date, description, amt));

                        System.out.print("\nAdd another transaction? (y/n): "); //Displays prompt to continue from option #2
                        addMore = sc.nextLine().trim().toLowerCase();
                        System.out.println();
                    } while (addMore.equals("y")); //"y" continues the loop

                    TransactionIO.bulkInsert(newTransactions);
                    transactions.addAll(newTransactions);
                    break;

                case 3: //Displays output from choosing option #3
                    double total = 0;
                    for (Transaction t : transactions) {
                        total += t.getAmount();
                    }
                    System.out.printf("Your total monthly expense is $%.2f\n", total); //Displays total expenses from option #3
                    break;

                default: 
                    System.out.println("Invalid option.\n"); //output that indicate input error
            }

            System.out.print("\nContinue? (y/n): "); //Displays prompt to continue
            choice = sc.nextLine().trim().toLowerCase();
            System.out.println();

        } while (choice.equals("y")); //"y" continues the program

        System.out.println("Program terminated by the user..."); //Displays an end of program line
    }
}















