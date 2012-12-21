package edu.project.euler.tools;

import edu.project.euler.problem7.ProblemSeven;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 12/19/12
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalculatePrimeNumberCommand implements Command{

    private ProblemSeven pSeven;

    public CalculatePrimeNumberCommand(ProblemSeven pSeven)
    {
        this.pSeven = pSeven;
    }

    public void execute(int n)
    {
        pSeven.calculateNthPrime(n);
    }
}
