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
        B obj2 = (v) -> System.out.println("This is an anonymous class " + v);
        obj2.show(2);
        A obj = (w, j) -> w + j;
        int result = obj.add(5, 7);
        System.out.println(result);

    }
}

@FunctionalInterface
interface A {
    int add(int i, int j);

}

@FunctionalInterface
interface B {
    void show(int i);

}
