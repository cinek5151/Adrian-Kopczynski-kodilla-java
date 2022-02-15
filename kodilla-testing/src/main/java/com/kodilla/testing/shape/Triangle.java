package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape
{
    private final static String name = "Triangle";
    private double baseLineLenght;
    private double height;

    public Triangle(double baseLineLenght, double height)
    {
        this.baseLineLenght=baseLineLenght;
        this.height= height;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.baseLineLenght, baseLineLenght) == 0 && Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(baseLineLenght, height);
    }

    @Override
    public String getShapeName()
    {
        return name;
    }


    @Override
    public double getField()
    {
        return (baseLineLenght*height)/2;
    }
}
