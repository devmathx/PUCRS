package controller;

import java.util.ArrayList;
import models.Client;

class Clients {

  private static ArrayList<Client> clients = new ArrayList<>();

  public static boolean create(String name, String phone, String rg) {
    if (rg.length() != 10) return false;

    Client client = new Client(rg, name, phone);
    
    final boolean contain = clients.contains(client);
    if (contain) return false;

    clients.add(client);

    return true;
  }

  // public static Client find(String rg) {
  //   for (Client c : clients) {
  //     if (c.getRg() == rg) {
  //       return c;
  //     }
  //   }

  //   return null;
  // }

  // public static boolean remove() {}

  // public static ArrayList<Client> getClients() {
  //   return clients;
  // }
}
