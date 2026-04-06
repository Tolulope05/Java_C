 class Calculator {
int a; // what object knows  (property)
    public int add(int ni, int n2){ // Add: what object does (function)
        System.out.println("in add");
        return ni + n2;
    }
}

public class Main {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 3;

        Calculator calc = new Calculator(); // How you create an object instance using new keyword.

        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}

