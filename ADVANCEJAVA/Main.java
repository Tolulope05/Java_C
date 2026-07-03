/**
 * ENUM CLASS WITH CUSTOMISED CONSTRUCTORS
 * - ordinal is used to get the location of the constsnt in the enum.
 * - values() is used to know all the list in the enum.
 */
public class Main {
    public static void main(String[] args) {

        // Laptop lap = Laptop.Macbook;
        // System.out.println(s.getClass().getSuperclass()); //class java.lang.Enum
        // System.out.println(lap + " : " + lap.getPrice());

        for (int index = 0; index < Laptop.values().length; index++) {
            Laptop laptop = Laptop.values()[index];
            System.out.println(laptop + " : " + laptop.getPrice());

        }

    }
}

enum Laptop {
    Macbook(2000), XPS(500), Surface, ThinkPad(1800); // NAMED CONSTANTS

    private Laptop(int price) {
        this.price = price;
        System.out.println("In priced laptop: " + this.name());

    }

    private Laptop() {
        price = 500;
        System.out.println("In laptop: " + this.name());
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}