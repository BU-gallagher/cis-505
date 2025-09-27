
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

public class CustomerDB {

    /*
     * Method which allows the user to enter an id number for a Customer. 
     * Declaring an if/else statement that assigns three customer values to the data fields from Customer.java
     * Declaring, creating, and assigning values for three different customers.
     * Main method that allows users to use default values or provide new values for specifications of a customer.
     */


    public static Customer getCustomer(int id) {
        if (id == 1007) {
            return new Customer("Jennifer Patterson", "8422 Grover Ave.", "Bellevue", "68123");
        } else if (id == 1008) {
            return new Customer("Mark Gallagher", "462 Allen Rd.", "Travelers Rest", "29690");
        } else if (id == 1009) {
            return new Customer("John Smith", "123 Main St.", "Travelers Rest", "29690");
        } else {
            return new Customer(); //returns the default value which an empty string
        }
    }
}














