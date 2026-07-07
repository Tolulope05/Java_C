
/**
 * THREAD
 * - start method to start the thread, We need to have trhe run method in the
 * class we want to thread
 * objB.setPriority(Thread.MAX_PRIORITY);
 * try {
 * Thread.sleep(10);
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * }
 * 
 */
public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        objB.setPriority(Thread.MAX_PRIORITY);
        objA.start(); // start a new thread
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        objB.start(); // start a new theead

    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
