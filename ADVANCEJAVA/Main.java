/**
 * ABSTRACT CLASS AND ANONYMOUS INNER CLASS
 */
public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In NEW SHOW");
            } // ANONYMOUS INNER CLASS

            public void config() {
                System.out.println("In NEW CONFIG");
            } // ANONYMOUS INNER CLASS
        };
        obj.show();
    }
}

abstract class A {
    public abstract void show();

    public abstract void config();
}

class B extends A {

    public void show() {
        System.out.println("IN B SHOW");
    } //

    public void config() {
        System.out.println("In B NEW CONFIG");
    } //

}
