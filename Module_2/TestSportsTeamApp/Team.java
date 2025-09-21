
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/


public class Team {

    /*
     * Method which allows the user to enter a team name, number of players on a team, and the names of the team players. 
     * Declaring, creating, and assigning three private data types using default values.
     * Declaring the argument constructor to allow the user to provide new values.
     * Declaring the accessor methods for the three data fields.
     * @return prints the results to the console window
     * Public method that allows the user to add names to the team and increments by 1 until full.
     */


    //Declaring, creating, and assigning three private data fields and its data types with given default values (no-argument constructor)
    private String teamName = ""; //teamName has a default value of empty string ""
    private String[] players = new String[20]; //players has a default value of 20 which creates an array of 20 elements
    private int playerCount =0; //playerCount has a default of 0 which specifies the initial counter
    
    
    //Declaring the argument constructor which the user provides the new values
    public Team(String teamName) {
        this.teamName = teamName;
    }
    

    //Returns players data type using accessor method
    public String[] getPlayers() {
        return players;
    }

    //Returns playerCount data type using accessor method
    public int getPlayerCount() {
        return playerCount;
    }

    //Returns teamName data type using accessor method
    public String getTeamName() {
        return teamName;
    }
    
     /*
     * addPlayer method which will add a player to the player data field using a String data type. 
     * addPlayer method which will increment the playerCount data field using the array's index to add new players.
     * Added a validation sequence to the If/Else Statement.
     * If yes, a player will be added to the list and the playerCount will increase by 1.
     * If no, added an output to let the user know the team is full. 
     */
    public void addPlayer(String player) {
            if (playerCount < players.length) {
                players[playerCount] = player;
                playerCount++;
            } 
            else {
            System.out.println("Team is full. Cannot add more players.");
            }
        }
}