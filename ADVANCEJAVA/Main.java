import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * BUFFEREDREADER AND SCANNER
 * -
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try {
            // // THIS SHOWS ASCII VALUES
            // int num = System.in.read(); // Gives ASCII value for the number you enter
            // System.out.println(num);

            // // BETTER WAY (BUFFEREDREADER)
            // InputStreamReader in = new InputStreamReader(System.in);
            // BufferedReader bf = new BufferedReader(in);
            // int num = Integer.parseInt(bf.readLine());
            // System.out.println(num);
            // bf.close(); // ALWAYS CLOSE RESOURCES

            // // READING A FILE
            // FileReader f = new FileReader("hello.txt");
            // BufferedReader bf = new BufferedReader(f);
            // System.out.println(bf.readLine());

            // // ANOTHER WAY (SCANNER)
            // Scanner sc = new Scanner(System.in);
            // int val = sc.nextInt();
            // System.out.println(val);
            // sc.close();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
