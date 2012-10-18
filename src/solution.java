import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 10/16/12
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class solution {

    private ArrayList<Integer> primeNumbers;
    private ArrayList<Integer> listOfFactors;

    public solution()
    {
        super();
    }

    public boolean checkPreviousAnswers(int numberToCheckFor, ArrayList<Integer> listOfPrimes)
    {
        for(int i = 0; i < listOfPrimes.size(); i++)
        {
            if(listOfPrimes.get(i).equals(numberToCheckFor))
            {
                return true;
            }
        }

        return false;
    }

    public boolean checkForFactor(int firstNumber, int secondNumber)
    {
        double check = (double)firstNumber/(double)secondNumber;
        if(check == (int)check)
        {
            return true;
        }
        return false;
    }

    public int nthPrime(int numberPrime)
    {
        int numberUpTo = 1;
        int counter = 0;

        primeNumbers = new ArrayList<Integer>();
        listOfFactors = new ArrayList<Integer>();

        while(primeNumbers.size() < numberPrime)
        {
            for(int i = 1; i < numberUpTo+1; i++)
            {
                //check all of the numbers lower than this number to see if is a factor
                boolean check = this.checkForFactor(numberUpTo, i);
                if(check == true)
                {
                    //if a number is a factor add it to the list
                    //boolean previousFactor = this.checkPreviousAnswers(i,);
                    listOfFactors.add(i);
                }
            }

            //once finished checking all of the numbers count all of the factors
            if( (listOfFactors.size() == 2) && (listOfFactors.get(0) == 1) && (listOfFactors.get(1) == numberUpTo) )
            {
                primeNumbers.add(numberUpTo);
            }

            numberUpTo += 1;
            listOfFactors.clear();
        }


        int lastPrime = primeNumbers.get(primeNumbers.size()-1);
        return lastPrime;
    }

    public static void main(String args[])
	{
        solution number = new solution();
        int largePrime = number.nthPrime(10001);
        System.out.println("The answer is "+ largePrime);

	}
}
