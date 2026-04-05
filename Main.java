public class Main {
    public static void main(String[] args) {

        // For Loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            if (i < 5) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // While Loop
        System.out.print("While Loop: ");
        int j = 1;
        while (j <= 5) {
            System.out.print(j);
            if (j < 5) {
                System.out.print(" ");
            }
            j++;
        }
        System.out.println();

        // Do-While Loop
        System.out.print("Do-While Loop: ");
        int k = 1;
        do {
            System.out.print(k);
            if (k < 5) {
                System.out.print(" ");
            }
            k++;
        } while (k <= 5);
        System.out.println();
    }
}

/**
 * and Do-While in Action
Write a Java program that prints the numbers from 1 to 5 using three different loop types:

for loop

while loop

do-while loop

Each loop should run independently and print its result on a single line, clearly labeled. Numbers should be printed with spaces between them and no trailing space at the end.



Instructions:

Use a for loop when the number of iterations is fixed (1 to 5).

Use a while loop to repeat the same logic with a counter.

Use a do-while loop to show that it runs at least once.

Each loop's output should be labeled (e.g., "For Loop: 1 2 3 4 5").

Use System.out.print() to format the output properly.



Expected Output:

  For Loop:  1  2  3  4  5

  While Loop:  1  2  3  4  5

  Do-While Loop:  1  2  3  4  5
 */