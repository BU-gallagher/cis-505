
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/


public class Fan {

    /*
     * Method which determine the default setting of a fan or allows a user to change the values.
     * Declaring four constants for the speed of a fan.
     * Declaring four private data types using default values.
     * Declaring the no-argument and argument constructor to pull default values or allows the user to provide new values.
     * Declaring the accessor methods for the four data fields.
     * @return prints the results to the console window
     * //Main method that allows users to use default values or provide new values for specifications of a fan.
     */


    //Declaring four constants named STOPPED, SLOW, MEDIUM, and FAST with numerical values
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;


    //Declaring four private data types with specific names and given default values (no-argument constructor)
    private int speed; //speed has a default value of 0 which equals to the constant STOPPED
    private boolean on; //on has a default value of false which specifies that the fan is off
    private double radius; //radius has a default value of 6 which specifies the radius of the fan
    private String color; // color has a default value of white specifies the color of the fan

    
    //Returns speed data type using accessor method
    public int getSpeed() {
        return speed;
    }

    //Returns speed data type using mutators method
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //Returns on data type using accessor method
    public boolean getOn() {
        return on;
    }

    //Returns on data type using mutators method
    public void setOn(boolean on) {
        this.on = on;
    }
    //Returns radius data type using accessor method
    public double getRadius() {
        return radius;
    }
 
    //Returns radius data type using mutators method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Returns color data type using accessor method
    public String getColor() {
        return color;
    }

    //Returns color data type using mutators method
    public void setRadius(String color) {
        this.color = color;
    }


    //Declaring the no-argument constructor which sets the values to default
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }


    //Declaring the argument constructor which the user provides the new values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    //toSTring method which will display an output of the default or provided values.
    @Override
    public String toString() {
        if (on) {
            return "The fan speed is set to " + speed + " with a color of " + color + " and a radius of " + radius;
        }
        else {
            return "The fan is " + color + " with a radius of " + radius + " and the fan is off";
        }
    }
}



