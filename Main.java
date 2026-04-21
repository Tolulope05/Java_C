
/**
 * CONSTRUCTOR OVERLOADING
 * - IT is called everytime you create an object, it will call the constructor
 * We can use defaul constructor and paratemrised constructor
 * 
 * -
 */

class Human {
  private int age; // INSTANCE VARIABLE
  private String name; // INSTANCE VARIABLE

  // public Human() { // deault
  // System.out.println("IN CONSTRUCTOR");
  // age = 12;
  // name = "JOHN";
  // }

  // public Human(int a, String n) { // Parameterized Constructors
  // age = a;
  // name = n;

  // }

  public Human() {
  }

  public Human(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    // THIS IS A KEYWORD THAT REPRESENT THE CURENT OBJECT
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    // THIS IS A KEYWORD THAT REPRESENT THE CURENT OBJECT
    this.name = name;
  }

}

public class Main {
  public static void main(String[] args) {
    Human obj = new Human();
    Human obj1 = new Human(18, "Tee");
    // obj.age = 11;
    // obj.name = "Navin";
    // obj.setName("Tee");
    // obj.setAge(30);

    System.out.println("OBJ: " + obj.getName() + " " + obj.getAge());
    System.out.println("OBJ1: " + obj1.getName() + " " + obj1.getAge());
  }
}