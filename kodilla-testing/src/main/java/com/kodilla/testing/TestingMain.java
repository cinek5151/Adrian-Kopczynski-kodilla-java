package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain
{

    public static void main(String[] args)
    {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser"))
        {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        if(calculator.add(2,5)==(2+5))
        {
            System.out.println("test OK");
        }
        else
        {
            System.out.println("Error");
        }

        if(calculator.subctract(10,5)==(10-5))
        {
            System.out.println("test OK");
        }
        else
        {
            System.out.println("Error");
        }
    }
}



