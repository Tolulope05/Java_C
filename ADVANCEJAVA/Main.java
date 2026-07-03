/**
 * FUNCTIONAL INTERFACE
 * 
 */
public class Main {
    public static void main(String[] args) {
        //
    }
}

/**
 * B implements A
 */
class B implements A {
    public void show() {
    }
}

@FunctionalInterface
interface A {
    void show();

    // void run();
}
