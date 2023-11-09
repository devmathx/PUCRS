public class Sale {

  private Client buyer;
  private Flight flight;
  private String hour;

  public Sale(Client buyer, Flight flight, String hour) {
    this.buyer = buyer;
    this.flight = flight;
    this.hour = hour;
  }


}
