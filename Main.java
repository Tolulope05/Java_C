
// final keyword - variable, method, class
// - The variable once assigned cannot be changed. To make it constant
// - Once you make a class final, you are stopping the inheritance, nobody can extends it.
// - When you make your method final, no one can overide it

public class Main {
  public static void main(String[] args) {
    final int num = 8;
    num = 9;
    System.out.println(num);
  }
}
