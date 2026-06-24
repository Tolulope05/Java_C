/**
 * REVERSING A STRING
 */

public class Main {
  public static void main(String[] args) {
    String var1 = "Tolulope";
    String reversed = reverseString(var1);

    System.out.println(reversed);
  }

  public static String reverseString(String text) {
    String reversed = "";

    for (int i = text.length() - 1; i >= 0; i--) {
      reversed = reversed + text.charAt(i);
    }

    return reversed;
  }

  public static String reverseStringTwo(String input) {
    StringBuilder result = new StringBuilder();
    for (int i = input.length() - 1; i >= 0; i--) {
      result.append(input.charAt(i));
    }
    return result.toString();
  }
}
