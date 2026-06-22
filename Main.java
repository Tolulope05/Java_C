
import other.*;

/**
 * Access Modifiers
 * PUBLIC || PRIVATE
 * Same Class. Yes Yes
 * 
 * Same Package Yes No
 * subclass
 * 
 * Same package Yes. No
 * non-subclass
 * 
 * Different package Yes. No
 * subclass
 * 
 * Different package Yes No
 * non-subclass
 */

public class Main {
  public static void main(String[] args) {
    A obj = new A();
    System.out.println(obj.marks);
    B obj1 = new B();
    System.out.println(obj1.marks);
  }
}
