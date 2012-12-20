package edu.project.euler.problem7;

import java.util.ArrayList;
import edu.project.euler.tools.*;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 10/16/12
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProblemSeven {

    private ArrayList<Integer> primeNumbers;
    private ArrayList<Integer> listOfFactors;
    private Memoizer memoizer = new Memoizer();

    public ProblemSeven()
    {
        super();
        this.primeNumbers = new ArrayList<Integer>();
        this.listOfFactors = new ArrayList<Integer>();
    }

    public ProblemSeven(ArrayList<Integer> primeNumbers, ArrayList<Integer> listOfFactors)
    {
        this.primeNumbers = primeNumbers;
        this.listOfFactors = listOfFactors;
    }

    //getter method for primeNumbers
    public ArrayList<Integer> getPrimeNumbers()
    {
        return primeNumbers;
    }

    //getter method for listOfFactors
    public ArrayList<Integer> getListOfFactors()
    {
        return listOfFactors;
    }

    //setter method for primeNumbers
    public void setPrimeNumbers(ArrayList<Integer> primeNumbers)
    {
        this.primeNumbers = primeNumbers;
    }

    public void setIndividualPrimeNumber(int primeNumber)
    {
        this.primeNumbers.add(primeNumber);
    }

    //setter method for listOfFactors
    public void setListOfFactors(ArrayList<Integer> listOfFactors)
    {
        this.listOfFactors = listOfFactors;
    }

    //Precondition: Takes two integers
    //Postcondition: Returns true if the second number is a factor
    //of the first number that is passed in. Returns false otherwise.
    public boolean checkForFactor(int firstNumber, int secondNumber)
    {
        double check = (double)firstNumber/(double)secondNumber;
        if(check == (int)check)
        {
            return true;
        }
        return false;
    }


    //Precondition:Takes a single integer.
    //Postcondition: Returns a single integer that is prime.
    //eg. calculateNthPrime(24) returns the 24th prime number.
    public int calculateNthPrime(int numberPrime)
    {
        int numberUpTo = 1;
        int counter = 0;

        //primeNumbers = new ArrayList<Integer>();
        //listOfFactors = new ArrayList<Integer>();

        while(primeNumbers.size() < numberPrime)
        {
            for(int i = 1; i < numberUpTo+1; i++)
            {
                //check all of the numbers lower than
                // this number to see if is a factor
                boolean check = this.checkForFactor(numberUpTo, i);
                if(check == true)
                {
                    //if a number is a factor add it to the list
                    listOfFactors.add(i);
                }
            }

            //once finished checking all of the numbers count all of the factors
            if( (listOfFactors.size() == 2)
                && (listOfFactors.get(0) == 1)
                && (listOfFactors.get(1) == numberUpTo) )
            {
                primeNumbers.add(numberUpTo);
                memoizer.cacheValue(primeNumbers.indexOf(numberUpTo),numberUpTo);
            }

            numberUpTo += 1;
            listOfFactors.clear();
        }


        int lastPrime = primeNumbers.get(primeNumbers.size()-1);
        return lastPrime;
    }
}
