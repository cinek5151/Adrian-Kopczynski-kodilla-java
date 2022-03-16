package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.*;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        //8.2 First Challenge

        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("You are trying divide by 0");
        } finally {
            System.out.println("Job done \n");
        }


        //8.3 Second challenge

        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("Problem, invalid method arguments");
        } finally {
            System.out.println("Finish \n");
        }

        //8.4 Flight

        Flight flight = new Flight("Paris", "Brazil");

        SearchFlights searcher = new SearchFlights();
        try{
            searcher.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("No this flight at base");
        }finally {
            System.out.println("Search complete");
        }

    }
}

