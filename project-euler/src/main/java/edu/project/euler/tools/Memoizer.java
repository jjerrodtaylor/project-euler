package edu.project.euler.tools;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: jamaal.taylor
 * Date: 12/19/12
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Memoizer {

    private HashMap cache = new HashMap();

    public Memoizer()
    {
        super();
    }

    public void cacheValue(int key, int value)
    {
        cache.put(key,value);
    }

}
