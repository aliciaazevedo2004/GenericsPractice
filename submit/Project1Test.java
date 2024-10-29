import org.junit.*;
import static org.junit.Assert.*;

import java.util.AbstractList;
import java.util.ArrayList;

import java.util.function.*;

/** 
 * Project1Test is where we test our functions.
 * This class will test two different objects 
 * of the type String.
 * 
*/
public class Project1Test 
{
    private CollectionUtilities<String> runner;
    private CollectionUtilities<String> runnerEmpty;
    
    /**
     * The below comments were given in the project set up.
     * 
     * runner - known as the "test runner" object, this is the
     * object that you will use in testing. You will use this
     * object in each of your tests after reinitializing (new)
     * in the setup() method below.
     * 
     * For example, if you want to test it with Strings,
     * create an instance like this:
     * 
     *  private CollectionUtilities<String> runner;
     */

    /**
     * setup() method, runs before each test method below.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup()
    {
        //runner = new Project1<String>( pass some data );
        
        //We will test with String types.

        //These two lists use String. One is empty, the other has elements added.
        AbstractList<String> randomList = new ArrayList<String>();  
        randomList.add("w");
        randomList.add("w");
        randomList.add("CCC");
        randomList.add("b");
        randomList.add("ABCDE");
        AbstractList<String> empty = new ArrayList<String>();


        //We will use these for testing on String types.
        runner = new Project1<String>(randomList);
        runnerEmpty = new Project1<String>(empty);



    }

    /**
     * 
     * testingOne(). 
     */
    @Test
    public void testingSmallest()
    {
        //Testing that empty is null.
        assertEquals(null, runnerEmpty.findSmallest());

        
        //testing randomList has smallest as "b".
        assertEquals("ABCDE", runner.findSmallest());

    


    }


    /**
     * 
     * testingTwo(). 
     */
    @Test
    public void testingLargest()
    {
        //Testing that runnerEmpty is null.
        assertEquals(null, runnerEmpty.findLargest());

        //Testing randomList has largest as "w".
        assertEquals("w", runner.findLargest());

    }

    /**
     * 
     * testingThree(). 
     */

    @Test
    public void testingDuplicates()
    {
        //Testing that runnerEmpty is false.
        assertFalse(runnerEmpty.hasDuplicates());

        //testing random list has duplicates is true.
        assertTrue(runner.hasDuplicates());


    }

    //The below comments were given in the project set up.
    // Add more tests here. Remember, the goal is to
    // test every method and to execute every line of code
    // in your Project1 class.
}
