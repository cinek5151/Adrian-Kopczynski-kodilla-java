package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain
{
    public static void main(String[] args)
    {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("castle", String::toUpperCase);
        poemBeautifier.beautify("Lower", (text) -> text.toLowerCase());
        poemBeautifier.beautify("castle", (text) -> "sand " + text);
        poemBeautifier.beautify("castle", (text) -> text.substring(0, 4));
        poemBeautifier.beautify("castle", (text) -> text.replace("a","A"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
