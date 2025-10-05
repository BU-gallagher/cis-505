
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/


public class Ball extends Product {

    /*
     * Method which allows the user to enter a color a bowling ball in a Bowling Shop. 
     * Declaring, creating, and assigning one private data types using no default values.
     * Declaring the no-argument constructor using the default value declare by the problem. 
     * Declaring the accessor and mutator methods for the one data field.
     * @return prints the results to the console window
     * Main method that allows users to use default values or provide new values for specifications for a bowling alley products.
     */


    //Declaring, creating, and assigning one private data field and its data types with no given default values (no-argument constructor)
    private String color; //color specifies the color of teh bowling ball and the default value is an empty string


    //Declaring the no-argument constructor which sets the default values to empty strings
    public Ball() {
        this.color = "";
    }

    //Declaring the no-argument constructor with superclass data fields which sets the default values to empty strings and/or zero
    public Ball(String code, String description, double price, String color) {
        setCode(code);
        setDescription(description);
        setPrice(price);
        this.color = "";
    }


    //Returns color data type using accessor method
    public String getColor() {
        return color;
    }

    //Returns color data type using mutators method
    public void setColor(String color) {
        this.color = color;
    }


    //toString method which will display an output of the default or provided values.
    @Override
    public String toString() {
        return super.toString() + "\n"
            + "  Color: " + color;
    }
}






