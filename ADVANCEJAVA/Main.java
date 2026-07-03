/**
 * LAMBDA EXPRESSION
 * 
 */
public class Main {
    public static void main(String[] args) {

        // A obj = new A() {
        // public void show() {
        // System.out.println("This is an anonymous class");
        // }
        // };
        A obj = () -> System.out.println("This is an anonymous class");

        obj.show();
        B obj2 = (v) -> System.out.println("This is an anonymous class " + v);

        obj2.show(2);

    }
}

@FunctionalInterface
interface A {
    void show();

}

@FunctionalInterface
interface B {
    void show(int i);

}
