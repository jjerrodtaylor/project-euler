package edu.project.euler;

import junit.framework.*;
import edu.project.euler.problem7.ProblemSeven;
import edu.project.euler.problem8.ProblemEight;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Rigourous Test :-)
     */
    public void testcalculateNthPrime()
    {
        ProblemSeven pSeven = new ProblemSeven();

        //assertTrue(Actual,Expected)
        assertEquals( 3, pSeven.calculateNthPrime(2));
    }

    public void testCheckForFactor()
    {
        ProblemSeven pSeven = new ProblemSeven();
        assertEquals(true, pSeven.checkForFactor(4,2));
    }

    public void testCheckPreviousAnswer()
    {
        ProblemSeven pSeven = new ProblemSeven();
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        assertEquals(true, pSeven.checkPreviousAnswers(2,listOfNumbers));
    }
}
