
/**
 * MULTIPLE INHERITANCE
 * 
 */

class A {
  // method logData 
  public void logData(){
    System.out.println("Log Class A");
  }
}

class B {
  // method logData 
  public void logData(){
    System.out.println("Log Class B");
  }
}
class C  extends A,B{
  // when it extends both, We try to access method logData.
  // It doesnt know which to call
} // Ambiguity Problem

public class Main {
  public static void main(String[] args) {
    Calc obj = new Calc();
    int r1 = obj.add(3, 2);
    int r2 = obj.sub(10, 4);
    System.out.println(r1 + " : " + r2);

    AdvCalc obj2 = new AdvCalc();
    int r3 = obj2.add(4, 6);
    System.out.println("ADVANCE CALC " + r3);

    VeryAdvCalc obj3 = new VeryAdvCalc();
    int r5 = obj3.add(3, 5);
    double r6 = obj3.power(5, 4);
    double r7 = obj3.div(6,2);
    System.out.println("VERY ADVANCE CALC " + r5 + " : " + r6 + " : " + r7);

  }
}
