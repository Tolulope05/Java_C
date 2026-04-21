
/**
 * STATIC METHOD
 * - Static method can be called directly with the class name
 * You can use a static variabel inside a static method, but you cannot use a
 * non static variable inside a static method
 * 
 * - IF YOU HAV ONJECT REFRERNCE< YOU CAN DO IRT
 * 
 * 
 */

class Mobile {
  private String brand;
  private int price;
  private String name;
  static String developer;

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

  public Mobile(String brand, int price, String name) {
    this.brand = brand;
    this.price = price;
    this.name = name;
  }

  public Mobile() {

  }

  public void show() {

    System.out.println(brand + " : " + price + " : " + name + " : " + developer);
  }

  public static void show1() {
    System.out.println("in static method");
    // System.out.println(brand + " : " + price + " : " + name + " : " +
    // developer);// BRAND NAME AND PRICE WONT WORKs
  }

  public static void show2(Mobile m) {
    System.out.println("in static method with class Reference. ");
    System.out.println(m.brand + " : " + m.price + " : " + m.name + " : " + developer);// BRAND NAME AND PRICE WONT
                                                                                       // WORKs
  }

}

public class Main {
  public static void main(String[] args) {

    Mobile mob1 = new Mobile();
    Mobile mob2 = new Mobile();

    Mobile.developer = "Tolylope"; // WILL UPDATE FOR ALL

    mob1.setBrand("Apple");
    mob1.setPrice(1500);
    mob1.setName("SmartPhone");

    mob2.setBrand("Samsung");
    mob2.setPrice(1700);
    mob2.setName("SmartPhone");

    mob1.show();
    mob2.show();

    Mobile.show1();
    Mobile.show2(mob1);

    //

  }
}