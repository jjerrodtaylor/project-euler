package edu.project.euler;

import edu.project.euler.problem10.ProblemTen;
import edu.project.euler.problem7.ProblemSeven;
import edu.project.euler.problem8.ProblemEight;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 12/17/12
 * Time: 10:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Answers {

     public static void main(String args[])
	 {
         //problem 7
        ProblemSeven number = new ProblemSeven();
        int largePrime = number.calculateNthPrime(5);
        System.out.println("The answer is "+ largePrime);

        //problem 8
        ProblemEight pEight = new ProblemEight();
        ArrayList<String> ls = pEight.readFileToMemory("/Users/jamaal.taylor/prime/project-euler/src/main/java/edu/project/euler/problem8/numbers.txt");
        String longString = pEight.turnListToString(ls);
        String[] longStringArray = pEight.splitString(longString);
        ArrayList<Integer> listOfProducts = new ArrayList<Integer>();

        for(int i=0,j=4; j< longString.length()-1; i++,j++)
        {
            int product = pEight.performMultiplication(longStringArray,i,j);
            listOfProducts.add(product);
        }

         Collections.sort(listOfProducts);
         int largestProduct = listOfProducts.get(listOfProducts.size()-1);
         System.out.println("The greatest product of five consecutive digits is"+largestProduct);

         //problem 10
         ProblemTen pTen = new ProblemTen();
         pTen.runEratosthenesSieve(2000000);
         long sumOfPrimes = pTen.addPrimesBelow();
         System.out.println("Sum of primes up to 2000000 "+ sumOfPrimes);
	 }
}
