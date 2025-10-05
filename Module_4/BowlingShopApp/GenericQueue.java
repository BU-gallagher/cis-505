
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

//Importing one built-in Java class
import java.util.LinkedList;

public class GenericQueue<T> {

    /*
     * Method which allows the user to any object type. 
     * Declaring a LinkedList for dynamic storage.
     * Declaring a queue for the front and end of the list.
     */


    //Private LinkedList to hold generic items
    private LinkedList<T> list = new LinkedList<>();

    //Adds an item to the queue (front of the list)
    public void enqueue(T item) {
        list.addFirst(item);  // addFirst keeps queue order consistent with the problem
    }

    //Removes and returns the first item added (end of list)
    public T dequeue() {
        if (!list.isEmpty()) {
            return list.removeLast();  // removeLast removes the earliest enqueued item
        }    
        else {
            return null;
        }
    }

    //Returns the number of items in the queue
    public int size() {
        return list.size();
    }

    //Returns true if queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
  














