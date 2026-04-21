class Human {
  private int age;
  private String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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