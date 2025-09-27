
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/


public class Customer {

    /*
     * Method which allows the user to enter a name, address, city, and zip for a Customer. 
     * Declaring, creating, and assigning three private data types using no default values.
     * Declaring the no-argument constructor using the default value set to empty strings. 
     * Declaring the argument constructor to allow the user to provide new values.
     * Declaring the accessor methods for the four data fields.
     * @return prints the results to the console window
     * Main method that allows users to use default values or provide new values for specifications of a customer.
     */


    //Declaring, creating, and assigning three private data fields and its data types with no given default values (no-argument constructor)
    private String name; //name specifies the name of the customer & no default is given
    private String address; //address specifies the address of the customer & no default is given
    private String city; //city specifies the city of the customer & no default is given
    private String zip; //zip specifies the zip code of the customer & no default is given
    

    //Declaring the no-argument constructor which sets the default values to empty strings
    public Customer() {
        this.name = "";
        this.address = "";
        this.city = "";
        this.zip = "";
    }


    //Declaring the argument constructor which the user provides the new values
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }
    
   
    //Returns name data type using accessor method
    public String getName() {
        return name;
    }

    //Returns address data type using accessor method
    public String getAddress() {
        return address;
    }

    //Returns city data type using accessor method
    public String getCity() {
        return city;
    }
    
    //Returns zip data type using accessor method
    public String getZip() {
        return zip;
    }
    

    //toString method which will display an output of the default or provided values.
    @Override
    public String toString() {
        return "  Name: " + name + "\n"
             + "  Address: " + address + "\n"
             + "  City: " + city + "\n"
             + "  Zip: " + zip;
    }
}


















