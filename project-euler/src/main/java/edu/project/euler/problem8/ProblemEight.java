package edu.project.euler.problem8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 12/17/12
 * Time: 10:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProblemEight {

    public ProblemEight()
    {
        super();
    }

    public ArrayList<String> readFileToMemory(String filepath)
    {
        BufferedReader br = null;
        String currentLine = null;
        ArrayList<String> fileContents = new ArrayList<String>();

        try
        {
            br = new BufferedReader(new FileReader(filepath));
            while((currentLine = br.readLine()) != null)
            {
                fileContents.add(br.readLine());
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        return fileContents;
    }

    public String turnListToString(ArrayList<String> listOfStrings)
    {
        String longString = "";

        for(int i =0; i < listOfStrings.size()-1; i++)
        {
            longString += listOfStrings.get(i);
        }
        return longString;
    }

    public String[] splitString(String s)
    {
        return s.split("(?!^)");
    }

    public int performMultiplication(String[] s, int beginning, int ending)
    {
        int product = 1;
        for(int i=beginning; i<ending +1; i++)
        {
            product = product * Integer.parseInt(s[i]);
        }

        return product;
    }






}
