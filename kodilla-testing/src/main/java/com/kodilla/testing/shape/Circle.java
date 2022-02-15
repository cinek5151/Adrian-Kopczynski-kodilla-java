package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape
{
    private final static String name = "Circle";
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(radius);
    }

    @Override
    public String getShapeName()
    {
        return name;
    }

    @Override
    public double getField()
    {
        return 3.14 * radius*radius;
    }
}
