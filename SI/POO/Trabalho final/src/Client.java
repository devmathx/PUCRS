public class Client {
  
  private String rg;
  private String name;
  private String phone;

  public Client(String rg, String name, String phone) {
    this.rg = rg;
    this.name = name;
    this.phone = phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRg() {
    return rg;
  }
}
