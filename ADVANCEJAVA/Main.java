/**
 * INNER CLASS
 */
public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.config();
        A.C obj2 = new A.C();
        obj2.config();

    }
}

/**
 * A
 */
class A {

    int age;

    public void show() {

        System.out.println("IN SHOW");
    }

    /**
     * B
     */
    class B {
        public void config() {
            System.out.println("IN CONFIG B");
        }
    }

    static class C {
        public void config() {
            System.out.println("IN CONFIG C");
        }
    }

}
