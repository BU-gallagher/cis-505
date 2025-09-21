
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/


import java.util.Scanner; //Imported the Scanner class

public class TestSportsTeamApp {

    /*
     * Method which tests the user to enter a team name, number of players on a team, and the names of the team players. 
     * Creating a Scanner to input new data
     * Creating a While Loop and its condition
     * Displaying several lines of titles, prompts, and blank lines
     * Creating a For Loop to enter player names
     * Creating a For Loop to the While Loop using an If/Else statement to decide to continue program
     */

    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create a Scanner
        boolean continueProgramLoop = true; //Create a condition for the while loop

        System.out.println("Welcome to the Sports Team App"); //Displays the introduction of the App
        System.out.println(); //Displays a blank line

        while (continueProgramLoop) {
            System.out.print("Enter a team name: "); //Displays prompt to enter team name
            String teamName = scanner.nextLine();
            System.out.println(); //Displays a blank line
            Team team = new Team(teamName); //Creates a new team 

            System.out.println("Enter the player names: "); //Displays instruction to enter player name
            System.out.print("  hint: use commas for multiple players; no spaces>: "); //Displays prompt to enter player names
            String playerInput = scanner.nextLine();
            String[] playerArray = playerInput.split(","); //Method to add commas between player entries
            
            for (String player : playerArray) { //For loop to add players to a team
                team.addPlayer(player);
            }
            System.out.println(); //Displays a blank line

            System.out.println("--Team Summary--"); //Displays the Team Summary results
            System.out.println("Number of players in team: " + team.getPlayerCount()); //Display prompt to enter the number of players on a team
            System.out.print("Players on team: "); //Displays prompt to enter the player's names
            
            for (int i = 0; i < team.getPlayerCount(); i++) { //For loop with nested if statement to structure name entry
                System.out.print(team.getPlayers()[i]);
                if (i < team.getPlayerCount() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("\n"); //Displays a blank line and goes to the next line

            System.out.print("Continue? (y/n): "); //Displays prompt to continue to the next team
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("y")) {
                continueProgramLoop = true; //Continues the loop
                System.out.println(); //Displays a blank line
                }
                else {
                    continueProgramLoop = false; //Ends the loop
                }       
        }
        System.out.println(); //Displays a blank line
        System.out.println(); //Displays a blank line
        System.out.println("End of line..."); //Displays an end of program line
        scanner.close();
    }
}











