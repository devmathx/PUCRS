package models;
public class Flight {
  
  private String origin; // Criar enum de cidades permitidas no sistema
  private String destiny;  //  Criar enum de cidades permitidas no sistema
  private String flightTime; // Considerar criar/achar classe para lidar con horários
  private String seatClass; // Crira enum para isso
  private Airplane airplane;  


  public Flight(String origin, String destiny, String flightTime, String seatClass, Airplane airplane) {
    this.origin = origin;
    this.destiny = destiny;
    this.flightTime = flightTime;
    this.seatClass = seatClass;
    this.airplane = airplane;
  }
}
