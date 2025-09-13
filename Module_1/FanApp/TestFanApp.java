
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/


public class TestFanApp {

    /*
     * Main method that allows users to use default values or provide new values.
     * Declaring the no-argument and argument constructor to pull default values or allows the user to provide new values.
     * @return prints the results to the console window
     */

    
     public static void main(String[] args) {
        //Object with the no-argument constructor which sets the values to default
        Fan defaultFan = new Fan();
        
        //Object with the argument constructor which the user provides the new values
        Fan customFan = new Fan(Fan.MEDIUM, true, 8, "blue");
        
        //Returns and displays the required objects by invoking the classes toString() method
        System.out.println(defaultFan.toString());
        System.out.println(customFan.toString());
    }
}







