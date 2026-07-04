/**
 * EXCEPTIONS
 * - Compile Time Error
 * - Runtime Error : Exceptions
 * - Logical Error
 * 
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[] nums = new int[5];
        try {

            j = 18 / i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.toString());
        } catch (Exception e) {
            System.out.println("ArithmeticException: " + e);
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}
