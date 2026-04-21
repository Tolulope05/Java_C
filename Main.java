class Human {
  private int age = 11;
  private String name = "Navin";

  // FETCH VARIABLE
  public int getAge() {
    return age;
  }

  // FETCH VARIABLE
  public String getName() {
    return name;
  }

  // SET VALUE
  public void setAge(int a) {
    age = a;
  }

  // SET VALUE
  public void setName(String n) {
    name = n;

  }

}

public class Main {
  public static void main(String[] args) {
    Human obj = new Human();
    // obj.age = 11;
    // obj.name = "Navin";
    obj.setAge(30);

    System.out.println(obj.getName() + " " + obj.getAge());
  }
}