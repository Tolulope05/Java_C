 class Human {
   private int age;
  private  String name;
  // EVERYTIME YOU CREATE AN NSTANCE VIARIABLE< MAKE IT PRIVATE
  // THEY SHOULDNT BE ABLE TO ACCESS IT DIRECTLY BUT THROUGH METHODS

}

public class Main {
    public static void main(String[] args) {
    Human obj = new Human();
    obj.age = 11; // WONT WORK 
    obj.name = "Navin"; // WONT WORK

    System.out.println(obj.name); // WONT WORK
    }
}