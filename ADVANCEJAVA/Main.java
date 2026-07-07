
/**
 * RACE CONDITIONS IN threads
 * - safeguard synchronized
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable objA = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        };
        // B objB = new B();
        Runnable objB = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();

            }

        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);
        t1.start(); // start a new thread
        t2.start(); // start a new theead

        t1.join();
        t2.join();

        System.out.println(c.count);

    }
}

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}