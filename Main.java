
/**
 * STATIC BLOCK
 * - STATIC BLOCK IS CALLED ONLY ONCE IN THE CLASS REGARDLESS OF HOW MANY
 * REFRENCE OBJECT WAS CREATED. It is called when the Class is loaded in memory.
 */

class Mobile {
  private String brand;
  private int price;
  private String name;
  static String developer;

  public Mobile() {
    System.out.println("IN CONSRTRUCTOR");
  }

  public Mobile(String brand, int price, String name) {
    this.brand = brand;
    this.price = price;
    this.name = name;
  }

  static {
    developer = "TOLULOPE";
    System.out.println("IN STATIC BLOCK");
  } // STATIC BLOCK IS CALLED ONLY ONCE IN THE CLASS

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void show() {

    System.out.println(brand + " : " + price + " : " + name + " : " + developer);
  }

}

public class Main {
  public static void main(String[] args) throws ClassNotFoundException {

    // Mobile mob1 = new Mobile();
    // Mobile mob2 = new Mobile();

    // Mobile.developer = "Tolylope"; // WILL UPDATE FOR ALL

    // mob1.setBrand("Apple");
    // mob1.setPrice(1500);
    // mob1.setName("SmartPhone");

    // mob1.show();

    //

    Class.forName("Mobile"); // THIS LOGS IN STATIC BLOCK . Mobile Class was loaded in memory.

  }
}