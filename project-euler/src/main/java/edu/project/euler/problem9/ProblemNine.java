package edu.project.euler.problem9;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 12/19/12
 * Time: 9:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProblemNine {

    public int generateEuclidsA(int m, int n)
    {
        int a = (m * m) - (n*n);
        return a;
    }

    public int generateEuclidsB(int m, int n)
    {
        int b = 2*m*n;
        return b;
    }

    public int generateEuclidsC(int m, int n)
    {
        int c = (m*m)+(n*n);
        return c;
    }
}
