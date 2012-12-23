package edu.project.euler;

import edu.project.euler.problem10.ProblemTen;
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
    //begin problem 7 tests
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

    //Begin problem 8 tests
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

    //begin problem 10 tests
    public void testRunrunEratosthenesSieve()
    {
        ProblemTen pTen = new ProblemTen();
        pTen.runEratosthenesSieve(10);
        ArrayList<Long> testList = pTen.getPrimeNumbers();
        long test1 = testList.get(0);
        long test2 = testList.get(1);
        long test3 = testList.get(2);
        long test4 = testList.get(3);
        assertEquals(2, test1);
        assertEquals(3, test2);
        assertEquals(5, test3);
        assertEquals(7, test4);
    }

    public void testAddPrimesBelow()
    {
        ProblemTen pTen = new ProblemTen();
        pTen.runEratosthenesSieve(5);
        long answer = pTen.addPrimesBelow();
        assertEquals(10, answer);
    }
}
