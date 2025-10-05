
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

class Product {

    /*
     * Method which allows the user to enter a code, description, and price for a product in a Bowling Shop. 
     * Declaring, creating, and assigning three private data types using no default values.
     * Declaring the no-argument constructor using the default value declare by the problem. 
     * Declaring the accessor and mutator methods for the three data fields.
     * @return prints the results to the console window
     * Main method that allows users to use default values or provide new values for specifications for a bowling alley products.
     */


     //Declaring, creating, and assigning three private data fields and its data types with no given default values (no-argument constructor)
    private String code; //code specifies the product code and the default value is an empty string
    private String description; //description specifies the product description and the default value is an empty string
    private double price; //price specifies the price of teh product and teh default value is 0
    

    //Declaring the no-argument constructor which sets the default values to empty strings and/or zero
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0;
    }


    //Returns code data type using accessor method
    public String getCode() {
        return code;
    }

    //Returns code data type using mutators method
    public void setCode(String code) {
        this.code = code;
    }

    //Returns description data type using accessor method
    public String getDescription() {
        return description;
    }

    //Returns description data type using mutators method
    public void setDescription(String description) {
        this.description = description;
    }

    //Returns price data type using accessor method
    public double getPrice() {
        return price;
    }

    //Returns price data type using mutators method
    public void setPrice(double price) {
        this.price = price;
    }

    //toString method which will display an output of the default or provided values.
    @Override
    public String toString() {
        return "  Product code: " + code + "\n"
            + "  Description: " + description + "\n"
            + "  Price: " + String.format("$%.2f", price);
    }
}









