package Plane.Dao;

import Plane.Shiti.Flight;

import java.util.Set;

public interface IFlightDao
{
    void insert(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirport(String departureAirport);
    Flight getFlightByDestinationAirport(String destinationAirport);
    void update(Flight flight);

}

