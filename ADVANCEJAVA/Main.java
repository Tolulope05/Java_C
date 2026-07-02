/**
 * INTERFACE
 * - Just show you the design
 * - We use the keyword implement
 * - class - class => extends
 * - class - interface => implement
 * - interface - interface => extneds
 */
public class Main {
    public static void main(String[] args) {

        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.area);

        X objX = new B();
        objX.run();

    }
}

class B implements A, Y {

    public void show() {
        System.out.println("IN SHOW");
    }

    public void config() {
        System.out.println("IN CONFIG");

    }

    public void run() {
        System.out.println("IN RUN");

    }

    public void keep() {
        System.out.println("IN KEEP");

    }
}

interface A {
    int age = 0; // by default thery are final and static
    String area = "Lagos"; // by default thery are final and static

    void show();

    void config(); // BENDHIND THE SCENE public abstract is there.
}
// WE GET INTERFACE SO THAT WE CAN DESIGN SOMETHING

/**
 * X
 */
interface X {
    void run();
}

/**
 * Y
 */
interface Y extends X {
    void keep();
}
