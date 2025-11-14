

/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to enter a firstName, lastNAme, course, and grade to collect and list student information. 
     * Declaring, creating, and assigning four private data types indicating its assigned default values.
     * Declaring the no-argument constructor using the default value declare by the problem. 
     * Declaring the accessor and mutator methods for the four data fields.
     * @return prints the results to the console window
     * toString method that allows users to use default values or provide new values to collect and list student information.
     */


//Declaring, creating, and assigning four private data fields and its data types with no given default values (no-argument constructor)
public class Student {
    private String firstName; //firstName specifies the unique first name of a student and the default value is an empty string 
    private String lastName; //lastName specifies the unique last name of a student and the default value is an empty string 
    private String course; //course specifies the unique course of a student and the default value is an empty string 
    private String grade; //grade specifies the unique grade of a student and the default value is an empty string 

    //Declaring the no-argument constructor which sets the default values to empty strings 
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.course = "";
        this.grade = "";
    }

    //Declaring this constructor to minimize errors in code
    public Student(String firstName, String lastName, String course, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grade = grade;
    }

    //Returns firstName data type using accessor and mutator methods
    public String getFirstName() { 
        return firstName; }
    public void setFirstName(String firstName) { 
        this.firstName = firstName; }

    //Returns lastName data type using accessor and mutator methods
    public String getLastName() { 
        return lastName; }
    public void setLastName(String lastName) { 
        this.lastName = lastName; }

    //Returns course data type using accessor and mutator methods
    public String getCourse() { 
        return course; }
    public void setCourse(String course) { 
        this.course = course; }

    //Returns grade data type using accessor and mutator methods
    public String getGrade() { 
        return grade; }
    public void setGrade(String grade) { 
        this.grade = grade; }

    
    //toString method which will display an output of the default or provided values.
    @Override
    public String toString() {
        return String.format("Name: %s %s | Course: %s | Grade: %s", firstName, lastName, course, grade);
    }
}







