public class Main {
    public static void main(String[] args) {
        // Define the dimensions of the 3D array
        int rows = 3;
        int cols = 4;
        int depth = 2;

        // Initialize the 3D array with a specific value
        int[][][] array3d = new int[depth][rows][cols];
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    array3d[i][j][k] = i * rows * cols + j * cols + k + 1;
                }
            }
        }

        // Print the 3D array
        for (int i = 0; i < depth; i++) {
            System.out.print("[");
            for (int j = 0; j < rows; j++) {
                System.out.print("[");
                for (int k = 0; k < cols; k++) {
                    System.out.print(array3d[i][j][k]);
                    if (k < cols - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("]");
            }
            System.out.println("]");
        }
    }
}