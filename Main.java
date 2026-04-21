class Human {
  private int age; // INSTANCE VARIABLE
  private String name; // INSTANCE VARIABLE

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    // THIS IS A KEYWORD THAT REPRESENT THE CURENT OBJECT
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    // THIS IS A KEYWORD THAT REPRESENT THE CURENT OBJECT
    this.name = name;
  }

}

public class Main {
  public static void main(String[] args) {
    Human obj = new Human();
    // obj.age = 11;
    // obj.name = "Navin";
    obj.setName("Tee");
    obj.setAge(30);

    System.out.println(obj.getName() + " " + obj.getAge());
  }
}