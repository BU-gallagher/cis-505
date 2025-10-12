
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which validates invalid user entries. 
     * getInt Method using a Scanner argument named sc and a String argument named prompt to return an integer.
     * getDouble Method using a Scanner argument named sc and a String argument named prompt to return a double.
     * getString Method using a Scanner argument named sc and a String argument named prompt to return a String.
     */

//Importing one built in Java class
import java.util.Scanner;

public class ValidatorIO {

    //getInt Method using a Scanner argument named sc and a String argument named prompt to return an integer
    public static int getInt(Scanner sc, String prompt) {
        int input = 0; //declaring and initializing input variable
        boolean isValid = false; //declaring and initializing isValid variable

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                sc.nextLine(); // clear buffer
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value."); //output that indicate input error
                sc.nextLine();
            }
        }
        return input;
    }

    //getDouble Method using a Scanner argument named sc and a String argument named prompt to return a double
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0.0; //declaring and initializing input variable
        boolean isValid = false; //declaring and initializing isValid variable

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                sc.nextLine(); // clear buffer
                isValid = true;
            } else {
                System.out.println("Error! Invalid double value."); //output that indicate input error
            }
        }
        return input;
    }

    //getString Method using a Scanner argument named sc and a String argument named prompt to return a String
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}




























