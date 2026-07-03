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

    }
}

@FunctionalInterface
interface A {
    void show();

}
