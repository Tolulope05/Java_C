 class Calculator {
    int a =4;
    int b =3;
    public int add(){
        System.out.println("in add");
        return a+b;
    }
}

public class Main {
    public static void main(String[] args) {

        double num1 = 4;
        double num2 = 3;

        Calculator calc = new Calculator(); // How you create an object instance using new keyword.

        int result = calc.add();
        System.out.println(result);

    }
}

