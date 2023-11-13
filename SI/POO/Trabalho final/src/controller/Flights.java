package controller;

import java.util.ArrayList;

import models.Airplane;

class Flights {

  private static ArrayList<Airplane> flights = new ArrayList<>();
  
  // private static boolean register(String origin, String destiny, String flightTime, String seatClass, Airplane airplane) {}
  
  public static ArrayList<Airplane> getFlights() {
    return flights;
  }
}
