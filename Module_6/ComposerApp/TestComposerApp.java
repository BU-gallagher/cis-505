
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to view, find, or add music composers with its unique id, name, and genre. 
     * Creating a Scanner to input a menu option.
     * Creating a Do Loop an its conditions.
     * Displaying the composer listing, find a composer, and new composer option prompt.
     * Creating a switch statement to provide conditions to decide how the program will continue to execute.
     */


//Importing one built in Java class
import java.util.List;
import java.util.Scanner;

public class TestComposerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemComposerDao composerDao = new MemComposerDao();

        System.out.println("  Welcome to the Composer App\n"); //Displays teh Welcome to the Composer App

        int option;
        do {
            System.out.println("  MENU OPTIONS"); //Displays the instructions to choose a menu option
            System.out.println("    1. View Composers");
            System.out.println("    2. Find Composer");
            System.out.println("    3. Add Composer");
            System.out.println("    4. Exit");
            System.out.print("\n  Please choose an option: ");
            option = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (option) {
                case 1: //Displays output from choosing option #1
                    System.out.println("--DISPLAYING COMPOSERS--"); //Displays the 5 default composers from option #1
                    List<Composer> composers = composerDao.findAll();
                    for (Composer composer : composers) {
                        System.out.println(composer.toString() + "\n");
                    }
                    break;

                case 2: //Displays output from choosing option #2
                    System.out.print("Enter an id: "); //enter a unique id
                    int id = Integer.parseInt(scanner.nextLine());
                    Composer found = composerDao.findBy(id);
                    System.out.println("\n--DISPLAYING COMPOSER--"); //Displays the id, name, and genre data fields for a composer from option #2
                    if (found != null) {
                        System.out.println(found.toString());
                    } else {
                        System.out.println("Composer not found."); //output when user entered an invalid unique id
                    }
                    System.out.println();
                    break;

                case 3: //Displays output from choosing option #3
                    System.out.print("Enter an id: "); //Prompt to enter a unique id for new composer
                    int newId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter a name: "); //Prompt to enter a name for new composer
                    String name = scanner.nextLine();
                    System.out.print("Enter a genre: "); //Prompt to enter a genre for new composer
                    String genre = scanner.nextLine();

                    Composer newComposer = new Composer(newId, name, genre);
                    composerDao.insert(newComposer);
                    System.out.println();
                    break;

                case 4: //Displays output from choosing option #4
                    System.out.println("Program terminated by the user..."); //Displays an end of program line
                    break;

                default:
                    System.out.println("Invalid option. Please try again.\n"); //output when user entered an invalid entry
            }

        } while (option != 4);

        scanner.close();
    }
}




















