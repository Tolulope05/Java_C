 class Human {
   private int age = 11;
  private  String name = "Navin";
  public int  getAge(){
      return age;
    }
 

}

public class Main {
    public static void main(String[] args) {
    Human obj = new Human();
    // obj.age = 11; 
    // obj.name = "Navin"; 

    System.out.println(obj.getAge());
    }
}