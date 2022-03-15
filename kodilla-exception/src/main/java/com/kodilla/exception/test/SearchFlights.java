package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlights
{
    public boolean findFlight(Flight flight) throws RouteNotFoundException
    {
        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Paris - Charles de Gaulle", true);
        flightsMap.put("Dubrovnik", true);
        flightsMap.put("Pisa", true);
        flightsMap.put("Sardinia", true);
        flightsMap.put("Bristol", false);
        flightsMap.put("Copenhagen", false);
        flightsMap.put("Amsterdam", true);

        if(flightsMap.containsKey(flight.getArrivalAirport()) && flightsMap.get(flight.getArrivalAirport()))
        {
            return true;
        }
        else
        {
            throw  new RouteNotFoundException();
        }
    }
}
