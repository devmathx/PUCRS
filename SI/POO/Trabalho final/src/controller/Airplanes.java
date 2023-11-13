package controller;

import java.util.ArrayList;
import models.Airplane;

class Airplanes {

  private static ArrayList<Airplane> airplanes = new ArrayList<>();

  private boolean create(String name, int seatsQuantity) {
    final String code = "TESTE"; // Gerar código aleatório

    Airplane airplane = new Airplane(code, name, seatsQuantity);
    
    final boolean contain = airplanes.contains(airplane);
    if (contain) return false;

    airplanes.add(airplane);

    return true;
  }

  // public static Airplane find(String code) {}

  // public static boolean remove() {}

  public static ArrayList<Airplane> getAirplanes() {
    return airplanes;
  }
}
