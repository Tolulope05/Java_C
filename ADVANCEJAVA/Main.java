/**
 * ANONYMOUS INNER CLASS
 */
public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In NEW SHOW");
            }
        };
        obj.show();
    }
}

class A {
    public void show() {
        System.out.println("IN A SHOW");
    }
}

// class B extends A {
// public void show() {
// System.out.println("IN B SHOW");
// }
// }
