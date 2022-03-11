package com.kodilla.testing.weather.stub;

import com.kodilla.testing.weather.Temperatures;
import com.kodilla.testing.weather.WeatherForecast;
import com.kodilla.testing.weather.stub.TemperaturesStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite
{
    @Test
    void testCalculateForecastWithStub()
    {
        //Given
        Temperatures temperatures = new TemperaturesStub(); // TODO produkty                   // [1]
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}
