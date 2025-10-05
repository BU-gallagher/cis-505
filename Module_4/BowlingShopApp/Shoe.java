
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/


public class Shoe extends Product {
  
    /*
     * Method which allows the user to enter a size for the shoe size in a Bowling Shop. 
     * Declaring, creating, and assigning one private data types using no default values.
     * Declaring the no-argument constructor using the default value declare by the problem. 
     * Declaring the accessor and mutator methods for the one data field.
     * @return prints the results to the console window
     * Main method that allows users to use default values or provide new values for specifications for a bowling alley products.
     */


   //Declaring, creating, and assigning one private data field and its data types with no given default values (no-argument constructor)
    private double size; //size specifies the shoe size and the default value is zero


    //Declaring the no-argument constructor which sets the default values to zero
    public Shoe() {
        this.size = 0;
    }

    //Declaring the no-argument constructor with superclass data fields which sets the default values to empty strings and/or zero
    public Shoe(String code, String description, double price, double size) {
        setCode(code);
        setDescription(description);
        setPrice(price);
        this.size = 0;
    }


    //Returns size data type using accessor method
    public double getSize() {
        return size;
    }

    //Returns size data type using mutators method
    public void setSize(double size) {
        this.size = size;
    }

    
    //toString method which will display an output of the default or provided values.
    @Override
    public String toString() {
        return super.toString() + "\n"
            + "  Size: " + size;
    }
}





