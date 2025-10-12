
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the program to read and write transactions to the expenses text file. 
     * Declaring, creating, and assigning two private data types indicating its assigned default values.
     * bulkInsert Method using an ArrayList<Transaction> argument named transaction and return type of void.
     * findAll Method using an ArrayList<Transaction> argument which throws a IOException.
     */

//Importing two built in Java classes
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt"; //FILE_NAME specifies the file name for a constant with the default value "expenses.txt"
    private static File file = new File(FILE_NAME); //file specifies the a new file name with the default value is new File

    //bulkInsert Method using an ArrayList<Transaction> argument named transaction and return type of void
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null; //Declaring and initializing PrintWriter

        if (file.exists()) { 
            output = new PrintWriter(new FileOutputStream(file, true)); // append
        } else {
            output = new PrintWriter(file);
        }

        for (Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }

        output.close();
    }

    //findAll Method using an ArrayList<Transaction> argument which throws a IOException
    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();

        if (!file.exists()) {
            return transactions; //returns an empty list if no file exists
        }

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String[] data = input.nextLine().split("\\|");
            if (data.length == 3) {
                String date = data[0];
                String description = data[1];
                double amount = Double.parseDouble(data[2]);
                transactions.add(new Transaction(date, description, amount));
            }
        }
        input.close();
        return transactions;
    }
}





















