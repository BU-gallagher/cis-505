
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to enter a date, description, and price for transaction expenses. 
     * Declaring, creating, and assigning three private data types indicating its assigned default values.
     * Declaring the no-argument constructor using the default value declare by the problem. 
     * Declaring the accessor and mutator methods for the three data fields.
     * @return prints the results to the console window
     * toString method that allows users to use default values or provide new values for specifications transaction expenses.
     */


class Transaction {


     //Declaring, creating, and assigning three private data fields and its data types with no given default values (no-argument constructor)
    private String date; //date specifies the date of the transaction and the default value is today's date as "mm-dd-yyyy"
    private String description; //description specifies the description of the transaction and the default value is an empty string
    private double amount; //amount specifies the price of the transaction and the default value is 0
    

    //Declaring the no-argument constructor which sets the default values to empty strings and/or zero
    public Transaction() {
        this.date = "10-10-2025";
        this.description = "";
        this.amount = 0;
    }

    //Declaring this constructor to minimize errors in code
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    //Returns date data type using accessor method
    public String getDate() {
        return date;
    }

    //Returns date data type using mutators method
    public void setDate(String date) {
        this.date = date;
    }

    //Returns description data type using accessor method
    public String getDescription() {
        return description;
    }

    //Returns description data type using mutators method
    public void setDescription(String description) {
        this.description = description;
    }

    //Returns amount data type using accessor method
    public double getAmount() {
        return amount;
    }

    //Returns amount data type using mutators method
    public void setAmount(double amount) {
        this.amount = amount;
    }

    //toString method which will display an output of the default or provided values.
    @Override
    public String toString() {
        return "  Date: " + date + "\n"
            + "  Description: " + description + "\n"
            + "  Amount: " + String.format("$%6.2f", amount);
    }
}




























