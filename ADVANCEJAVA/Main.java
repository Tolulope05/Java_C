import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TRY WITH RESOURCES
 * -
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(bf.readLine());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        // finally {
        // // WHEN YOU WANT TO CLOSE A RESOURCE, USE FINALLY
        // // bf.close();
        // }
    }
}
