/**
 * INTERFACE
 * - Just show you the design
 * - We use the keyword implement
 */
public class Main {
    public static void main(String[] args) {

        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.area);

    }
}

class B implements A {

    public void show() {
        System.out.println("IN SHOW");
    }

    public void config() {
        System.out.println("IN CONFIG");

    }
}

interface A {
    int age = 0; // by default thery are final and static
    String area = "Lagos"; // by default thery are final and static

    void show();

    void config(); // BENDHIND THE SCENE public abstract is there.
}
// WE GET INTERFACE SO THAT WE CAN DESIGN SOMETHING
