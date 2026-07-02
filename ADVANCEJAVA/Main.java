/**
 * INTERFACE NEED FOR INTERFACe
 */
public class Main {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.devApp(lap);
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
        System.out.println("Coding...");
    }
}

class Laptop implements Computer {
    // class Laptop extends Computer {
    public void code() {
        System.out.println("Code, Compile and run");
    }
}

class Desktop implements Computer {
    // class Desktop extends Computer {
    public void code() {
        System.out.println("Code, Compile and run : faster");
    }
}

interface Computer {
    // abstract class Computer {
    abstract public void code();
}
