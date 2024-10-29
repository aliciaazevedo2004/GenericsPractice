import java.util.AbstractList;
import java.util.function.*;

//The below import is never used and produces errors when submited to Web-Cat:
//import java.util.ArrayList;

/**
 * The below comments were given in the project set up.
*Project1 - class that take a collection (AbstractList) as 
*argument and provides various operations on the content of that
*collection.

@author  Alicia Azevedo
@version Septempber 13, 2024
*/
/**
 * Project1 is where we define our methods.
 * These methods will find the smallest 
 * and largest elements in the collection
 * and return true if the collection has duplicate elements.
 * @param <E> Data type of an item.
 */
public class Project1<E extends Comparable<E>> implements CollectionUtilities<E>
{

    //instance variable parameterArray.
    private AbstractList<E> parameterArray;

    /**
     * Project1 is the constructor that holds an abstract list called paramArray.
     * @param paramArray
     * This collection is used for the java project.
     */
    public Project1(AbstractList<E> paramArray) {
        this.parameterArray = paramArray;
    }

    /**
    *findSmallest() will find the smallest item in a collection
    *after checking if the collection is empty.
    */
    @Override
    public E findSmallest() {
        if (parameterArray.isEmpty()) {
            return null;
        }
        E smallest = parameterArray.get(0);
        for (E p : parameterArray) {
            if (p.compareTo(smallest) < 0) {
                smallest = p;
            }
        }
        return smallest;
    }

    /**
    *findLargest() will find the largest item in a collection
    *after checking if the collection is empty.
    */
    @Override
    public E findLargest() {
        if (parameterArray.isEmpty()) {
            return null;
        }
        E largest = parameterArray.get(0);
        for (E p : parameterArray) {
            if (p.compareTo(largest) > 0) {
                largest = p;
            }
        }
        return largest;
    }









    /**
    *boolean hasDuplicates() checks to see if any item in a collection has a duplicate
    *after checking if the collection is empty.
    */
    @Override
    public boolean hasDuplicates() {   
        for (int i = 0; i < parameterArray.size()-1; i++) {
            for (int p = i + 1; p < parameterArray.size()-1; p++) {
                if (parameterArray.get(i).compareTo(parameterArray.get(p)) == 0) {
                    return true;
                }
            }
        }
        return false;
        
    }

    
}
