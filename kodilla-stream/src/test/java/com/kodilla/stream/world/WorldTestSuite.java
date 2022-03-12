package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite
{

    @Test
    void testGetPeopleQuantity()
    {
        //Given
        World world = new World();
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();

        //When
        continent1.addCountry(new Country("France", new BigDecimal("3453567")));
        continent1.addCountry(new Country("Italy", new BigDecimal("589641")));
        continent2.addCountry(new Country("Canada", new BigDecimal("783453567")));
        continent3.addCountry(new Country("Brazil", new BigDecimal("38965314")));
        continent3.addCountry(new Country("Argentina", new BigDecimal("75463215")));
        continent4.addCountry(new Country("Egypt", new BigDecimal("45896321")));
        continent5.addCountry(new Country("Japan", new BigDecimal("5897643")));
        continent5.addCountry((new Country("Russia", new BigDecimal("144158963"))));

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);

        BigDecimal quantity = world.getPeopleQuantity();
        BigDecimal expectedQuantity = new BigDecimal("1097878231");

        //Then
        Assertions.assertEquals(expectedQuantity, quantity);
    }

    @Test
    void testGetPeopleQuantityIfNoCountries()
    {
        //Given
        World world = new World();
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();

        //When
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);

        BigDecimal quantity = world.getPeopleQuantity();
        BigDecimal expectedQuantity = new BigDecimal("0");

        //Then
        Assertions.assertEquals(expectedQuantity, quantity);
    }
}
