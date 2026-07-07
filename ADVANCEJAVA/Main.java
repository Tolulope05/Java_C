
/**
 * THREAD
 * - start method to start the thread, We need to have trhe run method in the
 * class we want to thread
 */
public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        objA.start(); // start a new thread
        objB.start(); // start a new theead

    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": HI");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":Hello");
        }
    }
}
