package controller;

import java.util.ArrayList;

import models.Airplane;

class Sales {
    
  private static ArrayList<Airplane> sales = new ArrayList<>();

  // private static boolean newSale(Client buyer, Flight flight) {}

  public static ArrayList<Airplane> getSales() {
    return sales;
  }
}
