
/**
 * Anonymous Object
 */

class A {
  public A() {
    System.out.println("OBJECT CREATED");
  }

  public void show() {
    System.out.println("In a show");
  }
}

public class Main {
  public static void main(String[] args) {
    new A(); // anonymous object;
  }
}
