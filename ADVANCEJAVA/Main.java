
/**
 * THREAD & RUNNABLE
 * - start method to start the thread, We need to have trhe run method in the
 * class we want to thread
 * objB.setPriority(Thread.MAX_PRIORITY);
 * try {
 * Thread.sleep(10);
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * }
 * 
 * RUNNABLE is an interface that makes thread easy to implement
 * 
 */
public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);
        t1.start(); // start a new thread
        t2.start(); // start a new theead

    }
}

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ":Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
