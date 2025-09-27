
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

//Importing three built-in Java classes
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {

    /*
     * Method which allows the user to use teh default balance and enter new values for deposits and withdraws. 
     * Declaring, creating, and assigning two private data types.
     * Declaring the accessor methods for the four data fields.
     * Creating two if/else statement validations methods for data entries.
     * Method that displays the Account Menu for output results.
     * Methods that help with expected data formats and output results.
     */


    //Declaring, creating, and assigning two private data fields and its given default values and formats
    private double balance = 200.0;
    private static final DecimalFormat df = new DecimalFormat("0.00");


    //Returns balance  data type using accessor method
    public double getBalance() {
        return balance;
    }


    //Method that sets an if/else statement validation for deposit entries
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        } else {
            System.out.println("  Error: Deposit amount must be positive.");
        }
    }


    //Method that sets an if/else statement validation for withdraw entries
    public void withdraw(double amt) {
        if (amt > 0 && balance >= amt) {
            balance -= amt;
        } else {
            System.out.println("  Error: Insufficient funds or invalid amount.");
        }
    }


    //Method that displays the Account Menu with options to help the user manage the String entires
    public void displayMenu() {
        System.out.println();
        System.out.println("  Account Menu");
        System.out.println("  Enter <D/d> for deposit");
        System.out.println("  Enter <W/w> for withdraw");
        System.out.println("  Enter <B/b> for balance");
        System.out.print("    Enter option>: ");
    }


    //Method that formats the date
    public String getTransactionDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        return sdf.format(new Date());
    }


    //Method that displays the account balance 
    public String formatBalance() {
        return "$" + df.format(balance);
    }
}




























