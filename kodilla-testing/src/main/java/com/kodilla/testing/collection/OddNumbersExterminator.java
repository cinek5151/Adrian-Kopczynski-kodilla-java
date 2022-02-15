package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator
{
    public List<Integer> exterminate(List<Integer> numbers)
    {
        List<Integer> newList = new LinkedList<>();

        for(int i=0; i<numbers.size(); i++ )
        {
            if(numbers.get(i)%2==0)
            {
                newList.add(numbers.get(i));
            }
        }
        return newList;
    }

}
