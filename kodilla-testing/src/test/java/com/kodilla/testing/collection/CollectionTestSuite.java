package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.io.*;
import java.util.*;
import java.lang.*;


public class CollectionTestSuite
{
    @BeforeEach
    public void before()
    {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after()
    {
        System.out.println("Test Case: end");
    }

    @DisplayName("checking if the class behaves correctly when the list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList()
    {
        OddNumbersExterminator extermine = new OddNumbersExterminator();
        List<Integer> empty = new LinkedList<>();

        Assertions.assertEquals(empty, extermine.exterminate(empty));
    }


    @DisplayName("checking if the class behaves correctly " +
            "when the list contains even and odd numbers.")
    @Test
    void testOddNumbersExterminatorNormalList()
    {
        OddNumbersExterminator extermine = new OddNumbersExterminator();
        List<Integer> listOfNumbers = new LinkedList<>();
        listOfNumbers.add(5);
        listOfNumbers.add(7);
        listOfNumbers.add(2);
        listOfNumbers.add(4);

        listOfNumbers = extermine.exterminate(listOfNumbers);

        for(int i=0; i<listOfNumbers.size(); i++)
        {
            Assertions.assertEquals(0,listOfNumbers.get(i)%2);
        }
    }
}
