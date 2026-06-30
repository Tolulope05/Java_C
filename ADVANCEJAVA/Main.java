/**
 * ABSTRACT CLASS METHOD
 */
public class Main {
    public static void main(String[] args) {
        WagonR obj = new WagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}

/**
 * Car - abstract
 */
abstract class Car { // ABSTRACT CLASS
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }
}

/**
 * WagonR
 */
class WagonR extends Car { // CONCRETE CLASS
    public WagonR() {
        //

    }

    public void drive() {

        System.out.println("WAGON DRIVING..");
    };

    public void fly() {

        System.out.println("WAGON FLYING..");
    };
}
