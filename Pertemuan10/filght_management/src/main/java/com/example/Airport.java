package com.example;



public class Airport {
    public static void main(String[] args) {
        Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BusinessFlight("2");

        Passenger john = new Passenger("John Doe", true);
        Passenger jane = new Passenger("Jane Doe", false);

        System.out.println("Economy flight:");
        System.out.println(economyFlight.addPassenger(john)); // True
        System.out.println(economyFlight.addPassenger(jane)); // True

        System.out.println("Business flight:");
        System.out.println(businessFlight.addPassenger(john)); // True
        System.out.println(businessFlight.addPassenger(jane)); // False
        System.out.println("Business flight passengers list:");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
        System.out.println("Economy flight passengers list:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
    }

}
