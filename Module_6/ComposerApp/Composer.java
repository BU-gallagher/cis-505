
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to enter a unique id, name, and genre for music composers. 
     * Declaring, creating, and assigning three private data types indicating its assigned default values.
     * Declaring the no-argument constructor using the default value declare by the problem. 
     * Declaring the accessor and mutator methods for the three data fields.
     * @return prints the results to the console window
     * toString method that allows users to use default values or provide new values for specifications transaction expenses.
     */


class Composer {


     //Declaring, creating, and assigning three private data fields and its data types with no given default values (no-argument constructor)
    private int id; //id specifies the unique id of a composer and the default value is an empty string (value = 0)
    private String name; //name specifies the name of the composer and the default value is an empty string
    private String genre; //genre specifies the genre or type of music of teh composer and the default value is an empty string
    

    //Declaring the no-argument constructor which sets the default values to empty strings and/or zero
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    //Declaring this constructor to minimize errors in code
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    //Returns id data type using accessor method
    public int getId() {
        return id;
    }

    //Returns id data type using mutators method
    public void setId(int id) {
        this.id = id;
    }

    //Returns name data type using accessor method
    public String getName() {
        return name;
    }

    //Returns name data type using mutators method
    public void setName(String name) {
        this.name = name;
    }

    //Returns genre data type using accessor method
    public String getGenre() {
        return genre;
    }

    //Returns genre data type using mutators method
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //toString method which will display an output of the default or provided values.
    @Override
    public String toString() {
        return "  Id: " + id + "\n"
            + "  Name: " + name + "\n"
            + "  Genre: " + genre;
    }
}
















