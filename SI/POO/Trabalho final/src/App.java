import java.util.ArrayList;
import java.util.Date;

public class App {



  private class Clients {

    private static ArrayList<Client> clients = new ArrayList<>();

    public static boolean create(String name, String phone, String rg) {
      if (rg.length() != 10) return false;

      Client client = new Client(rg, name, phone);
      
      final boolean contain = clients.contains(client);
      if (contain) return false;

      clients.add(client);

      return true;
    }

    public static Client find(String rg) {
      for (Client c : clients) {
        if (c.getRg() == rg) {
          return c;
        }
      }

      return null;
    }

    public static boolean remove() {}
  
    public static ArrayList<Client> getClients() {
      return clients;
    }
  }

  private class Airplanes {

    private static ArrayList<Airplane> airplanes = new ArrayList<>();

    private boolean create(String name, int seatsQuantity) {
      final String code = "TESTE"; // Gerar código aleatório

      Airplane airplane = new Airplane(code, name, seatsQuantity);
      
      final boolean contain = airplanes.contains(airplane);
      if (contain) return false;

      airplanes.add(airplane);

      return true;
    }

    public static Airplane find(String code) {}

    public static boolean remove() {}
  
    public static ArrayList<Airplane> getAirplanes() {
      return airplanes;
    }
  }

  private class Flights {

    private static ArrayList<Airplane> flights = new ArrayList<>();
    
    private static boolean register(String origin, String destiny, String flightTime, String seatClass, Airplane airplane) {}
    
    public static ArrayList<Airplane> getFlights() {
      return flights;
    }
  }
  
  private class Sales {
    
    private static ArrayList<Airplane> sales = new ArrayList<>();

    private static boolean newSale(Client buyer, Flight flight) {}

    public static ArrayList<Airplane> getSales() {
      return sales;
    }
  }


}
