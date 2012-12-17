package edu.project.euler.problem8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 12/17/12
 * Time: 10:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    public Solution()
    {
        super();
    }

    public FileReader readFileToFileReader(String filePath)
    {
        FileReader fr = null;
        try
        {
            fr = new FileReader(filePath);
            fr.close();
        }
        catch(IOException e)
        {
            log.warn("Unable to close connection to file"+filePath);
            e.printStackTrace();
        }
        catch(FileNotFoundException e)
        {
            log.warn("Unable to find file"+filePath);
            e.printStackTrace();
        }

        return fr;
    }

    public List<String> readFileReaderToMemory(FileReader fr)
    {
        BufferedReader br = null;
        String currentLine = null;
        ArrayList<String> fileContents = new ArrayList<String>();

        try
        {
            br = new BufferedReader(fr);
            while( (currentLine = br.readLine()) != null)
            {
                fileContents.add(br.readLine());
            }
            br.close();
        }
        catch(IOException e)
        {
            log.warn("Unable to open connection to filereader line 53.");
            e.printStackTrace();
        }

        return fileContents;
    }
}
