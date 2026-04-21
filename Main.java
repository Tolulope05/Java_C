
/**
 * INHERITANCE
 * - is, has
 * Parent - child, Super - sub, base - derived.
 * Using extend keyword
 */

public class Main {
  public static void main(String[] args) {
    Calc obj = new Calc();
    int r1 = obj.add(3, 2);
    int r2 = obj.sub(10, 4);
    System.out.println(r1 + " : " + r2);

    AdvCalc advCalc = new AdvCalc();
    int r3 = advCalc.add(4, 6);
    System.out.println("ADVANCE CALC " + r3);
  }
}
