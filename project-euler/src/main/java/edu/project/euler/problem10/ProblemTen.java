package edu.project.euler.problem10;

import edu.project.euler.problem7.*;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 12/19/12
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProblemTen{

    private ArrayList<Long> primeNumbers = new ArrayList<Long>();

    public ProblemTen()
    {
        super();
    }

    public void runEratosthenesSieve(int upperBound)
    {
        int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
        boolean iteration = false;

        //the array is initialized with all false
        boolean[] isComposite = new boolean[upperBound + 1];

        for (int i = 2; i <= upperBoundSquareRoot; i++)
        {
          //if false
            if (!isComposite[i])
            {
                for (int j = i * i; j <= upperBound; j += i)
                {
                    isComposite[j] = true;
                }
            }
        }

        //for (int i = upperBoundSquareRoot; i <= upperBound; i++)
        for(int i = 2; i <= upperBound; i++)
        {
            if (!isComposite[i])
            {
                this.primeNumbers.add((long)i);
            }
        }
    }
    public long addPrimesBelow()
    {
        long sum = 0;

        for(int i = 0; i<primeNumbers.size(); i++)
        {
            sum = sum + primeNumbers.get(i);
        }
        return sum;
    }
}
