

/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the program to calculate the future value based on monthly payment, interest rate, and years. 
     * Declaring, creating, and assigning one private data types indicating its assigned default values.
     * Declaring the no-argument constructor using the default value declare by the problem. 
     * Declaring the accessor and mutator methods for the three data fields.
     * @param monthlyPayment The monthly payment amount.
     * @param rate The annual interest rate (percentage).
     * @param years The number of years.
     * @return The calculated future value.
     */


public class FinanceCalculator {

    //Declaring, creating, and assigning one private data field and its data types with no given default values (no-argument constructor)
    private static final int MONTHS_IN_YEAR = 12;

    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {

        //Formulas needed to return the future value calculation
        int months = years * MONTHS_IN_YEAR; //Formula to calculate the months
        double interestRate = 1 + (rate / 100); //Formula to calculate the interest rate 
        double presentValue = monthlyPayment * months; //Formula to calculate the present value
        double futureValue = presentValue * Math.pow(interestRate, months); //Formula to calculate the future value

        return futureValue;
    }
}













