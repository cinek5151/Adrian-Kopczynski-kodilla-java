package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ArrayOperationsTestSuite
{

    @Test
    void testGetAverage() {

        //Given
        int[] exampleNumbers = {2, 15, 12, 5, 8, 7, 17, 63, 48, 19, 64, 3, 35, 48, 75, 29, 4, 55, 11, 41};

        //When
        double average = ArrayOperations.getAverage(exampleNumbers);
        double expectedAverage = 28.05;

        //Then
        Assertions.assertEquals(expectedAverage, average);
    }
}
