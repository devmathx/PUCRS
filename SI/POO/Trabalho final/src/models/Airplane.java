package models;
public class Airplane {
  
  private String code;
  private String name;
  private int seatsQuantity;
  private int busy = 0;

  public Airplane(String code, String name, int seatsQuantity) {
    this.code = code;
    this.name = name;
    this.seatsQuantity = seatsQuantity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean occupySeat() {
    if (this.busy == this.seatsQuantity) {
      return false;
    }

    this.busy++;
    return true;
  }
}
