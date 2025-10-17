
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to return a list, single composer, or add new composers to a List.
     * Declaring the no-argument constructor using an ArrayList and initializing the default values declared by the problem. 
     * findAll Method that returns a list of composer objects.
     * findBy Method that returns a single composer object matching the arguments id.
     * insert Method that adds a new composer object to the list of composers.
     */


//Importing two built in Java classes
import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {

    private List<Composer> composers; //composers specifies the default list of composer objects 

    //Declaring the no-argument constructor which declares and initializes the 5 default composers
    public MemComposerDao() {
        composers = new ArrayList<>();
        composers.add(new Composer(1007, "Ludwig Van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    //findAll Method that returns a list of composer objects
    @Override
    public List<Composer> findAll() {
        return composers;
    }

    //findBy Method that returns a single composer object matching the arguments id
    @Override
    public Composer findBy(Integer id) {
        for (Composer composer : composers) {
            if (composer.getId() == id) {
                return composer;
            }
        }
        return null; //returns null if not found
    }

    //insert Method that adds a new composer object to the list of composers
    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    }
}








