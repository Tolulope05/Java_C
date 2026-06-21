/**
 * METHOD OVERRRIDING
 */

class A {
  public void show() {
    System.out.println("in A show");
  }

  public void config() {
    System.out.println("in A Config");
  }
}

class B extends A {
  public void show1() {
    System.out.println("in B show");
  }

  @Override
  public void show() {
    System.out.println("in B show more");

  }
}

public class Main {
  public static void main(String[] args) {
    B obj = new B();
    obj.show();
    obj.config();
  }
}
