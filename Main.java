
public class Main {
  public static void main(String[] args) {
    int num = 7; // Primitive
    Integer num1 = num; // boxing - Taking a primitive value and storing it in a wrapper object.
    System.out.println(num1);
    char char1 = 'f';
    Character char2 = char1; // boxing
    System.out.println(char2);
    double dob1 = 6.6;
    Double dob2 = dob1; // boxing
    System.out.println(dob2);

    // UNBOXING
    int num2 = num1.intValue(); // unboxing
    char char3 = char2.charValue(); // unboxing
    double dob3 = dob2.doubleValue(); // unboxing \

    // auto boxing
    // if its stored automatically
    int num4 = num1; // autounboxing

    String str = "12";
    int num3 = Integer.parseInt(str);
    System.out.println(num3);

  }
}
