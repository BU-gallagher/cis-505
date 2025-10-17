
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which designs an interface to represent the operations in a data persistence layer.
     * This interface extends teh GenericDao interface using the Composer object and integer as its generic arguments.
     * Declaring a List with key and entity values 
     */


public interface ComposerDao extends GenericDao<Composer, Integer> {
    // No additional methods needed for now
}













