package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ShapeCollectorTestSuite
{
    @DisplayName("Add a figure to the Collection")
    @Test
    public void testAddFigure()
    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1,shapeCollector.getShapeCollection().size());
    }

    @DisplayName("Remove a figure to the Collection")
    @Test
    public void testRemoveFigure()
    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        assertTrue(result);
        assertEquals(0,shapeCollector.getShapeCollection().size());
    }

    @DisplayName("Download from the collection figure from position n list")
    @Test
    public void testGetFigureExistNumber()
    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        assertEquals(shape, shapeResult);
        Assert.assertEquals(null, shapeCollector.getFigure(1));
        Assert.assertEquals(null, shapeCollector.getFigure(-1));

    }

    @DisplayName("Returns the names of all figures in the form of a String")
    @Test
    public void testShowFigures()
    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape);
        //When
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        //Then
        assertEquals(shapeList.toString(), shapeResultList.toString());

    }
}
