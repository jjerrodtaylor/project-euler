package edu.project.euler;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 12/16/12
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Answer {

    public static void main(String args[])
	{
        Solution number = new Solution();
        int largePrime = number.calculateNthPrime(10);
        System.out.println("The answer is "+ largePrime);

	}
}
