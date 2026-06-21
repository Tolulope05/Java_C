/**
 * METHOD OVERRRIDING
 */

class Calc {
  public int add(int a, int b) {
    return a + b;

  }
}

class AdvCalc extends Calc {

  @Override
  public int add(int a, int b) {
    return a + b + 1;

  }
}

public class Main {
  public static void main(String[] args) {
    AdvCalc obj = new AdvCalc();
    int r1 = obj.add(1, 2);
    System.out.println(r1);
  }
}
