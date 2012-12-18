package edu.project.euler;

import edu.project.euler.problem7.ProblemSeven;
import edu.project.euler.problem8.ProblemEight;

import java.io.FileReader;
import java.util.ArrayList;

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
        //ProblemSeven number = new ProblemSeven();
        //int largePrime = number.calculateNthPrime(10);
        //System.out.println("The answer is "+ largePrime);

        //problem 8
        ProblemEight number = new ProblemEight();
        ArrayList<String> ls = number.readFileToMemory("/Users/jamaal.taylor/prime/project-euler/src/main/java/edu/project/euler/problem8/numbers.txt");
        String longString = number.turnListToString(ls);
	 }
}
