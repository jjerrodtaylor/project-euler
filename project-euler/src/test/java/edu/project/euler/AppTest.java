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
        //assertEquals(true, pSeven.checkPreviousAnswers(2,listOfNumbers));
    }

    public void testSplitString()
    {
        ProblemEight pEight = new ProblemEight();
        String test = "test";
        String[] testArray = pEight.splitString(test);
        assertEquals("t",testArray[0]);
        assertEquals("e",testArray[1]);
        assertEquals("s",testArray[2]);
        assertEquals("t",testArray[3]);

    }

    public void testPerformMultiplication()
    {
        ProblemEight pEight = new ProblemEight();
        String multiplyString = "1234";
        String[] multiplyArray = pEight.splitString(multiplyString);
        int result = pEight.performMultiplication(multiplyArray,0,3);
        assertEquals(24,result);
    }
}
